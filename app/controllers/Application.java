package controllers;

import models.Products;
import play.api.templates.Html;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
    public static Products pro1 = new Products("Toshiba","Air",33900,10);
    public static Products pro2 = new Products("Haier","Freez",5900,15);
    public static Products pro3 = new Products("Samsung","Freez",9500,10);
    public static Products pro4 = new Products("Tecnoplus","Microwave",32900,10);
    public static Products pro5 = new Products("Lucky Flame ","Microwave",7990,10);
    public static Products pro6 = new Products("Panasonic","Washing machine",8590,15);


    public static Result main(Html content) {return ok(main.render(content));}
    public static Result index() {
        return main(home.render());
    }
    public static Result air() {
        return main(air.render(pro1,pro2,pro3,pro4));
    }
    public static Result freeze() {
        return main(freeze.render(pro1,pro2,pro3,pro4));
    }
    public static Result microwave() {return main(microwave.render(pro1,pro2,pro3,pro4));}
    public static Result washing() {return main(washing.render(pro1,pro2,pro3,pro4));}
    public static Result location() {return main(location.render());}
    public static Result promotion() {return main(promotion.render());}

    public static Result showPro() {return main(showPro.render(pro1,pro2,pro3,pro4,pro5,pro6));}
}




