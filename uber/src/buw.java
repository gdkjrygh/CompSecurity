// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class buw extends Enum
{

    private static final buw B[];
    public static final buw a;
    public static final buw b;
    public static final buw c;
    public static final buw d;
    public static final buw e;
    public static final buw f;
    public static final buw g;
    public static final buw h;
    public static final buw i;
    public static final buw j;
    public static final buw k;
    public static final buw l;
    public static final buw m;
    public static final buw n;
    public static final buw o;
    public static final buw p;
    public static final buw q;
    public static final buw r;
    public static final buw s;
    public static final buw t;
    public static final buw u;
    public static final buw v;
    public static final buw w;
    private boolean A;
    private String x;
    private String y;
    private boolean z;

    private buw(String s1, int i1, String s2, String s3, boolean flag, boolean flag1)
    {
        super(s1, i1);
        x = s2;
        y = s3;
        z = flag;
        A = flag1;
    }

    public static buw valueOf(String s1)
    {
        return (buw)Enum.valueOf(buw, s1);
    }

    public static buw[] values()
    {
        return (buw[])B.clone();
    }

    public final String a()
    {
        return (new StringBuilder()).append(x).append("::").append(y).toString();
    }

    public final String a(String s1, boolean flag)
    {
        String s2;
        if (z)
        {
            if (flag)
            {
                s2 = "returnuser";
            } else
            {
                s2 = "newuser";
            }
        } else
        {
            s2 = "";
        }
        return (new StringBuilder()).append(buu.a).append(":").append(s1).append(":").append(s2).toString();
    }

    public final boolean b()
    {
        return A;
    }

    static 
    {
        a = new buw("PreConnect", 0, "preconnect", "", false, false);
        b = new buw("DeviceCheck", 1, "devicecheck", "", false, false);
        c = new buw("PaymentMethodWindow", 2, "selectpaymentmethod", "", false, false);
        d = new buw("PaymentMethodCancel", 3, "selectpaymentmethod", "cancel", false, true);
        e = new buw("SelectPayPalPayment", 4, "selectpaymentmethod", "paypal", false, true);
        f = new buw("SelectCreditCardPayment", 5, "selectpaymentmethod", "card", false, true);
        g = new buw("ConfirmPaymentWindow", 6, "confirmpayment", "", false, false);
        h = new buw("ConfirmPayment", 7, "confirmpayment", "confirm", false, false);
        i = new buw("ConfirmPaymentCancel", 8, "confirmpayment", "cancel", false, true);
        j = new buw("PaymentSuccessful", 9, "paymentsuccessful", "", false, false);
        k = new buw("LoginWindow", 10, "login", "password", true, false);
        l = new buw("LoginPassword", 11, "login", "password", true, true);
        m = new buw("LoginPIN", 12, "login", "PIN", true, true);
        n = new buw("SignUp", 13, "login", "password", true, true);
        o = new buw("LoginForgotPassword", 14, "login", "password", true, true);
        p = new buw("LoginCancel", 15, "login", "cancel", true, true);
        q = new buw("ConsentWindow", 16, "authorizationconsent", "", false, false);
        r = new buw("ConsentAgree", 17, "authorizationconsent", "agree", false, true);
        s = new buw("ConsentCancel", 18, "authorizationconsent", "cancel", false, true);
        t = new buw("ConsentMerchantUrl", 19, "authorizationconsent", "merchanturl", false, true);
        u = new buw("ConsentPayPalPrivacyUrl", 20, "authorizationconsent", "privacy", false, true);
        v = new buw("AuthorizationSuccessful", 21, "authorizationsuccessful", "", false, false);
        w = new buw("LegalTextWindow", 22, "legaltext", "", false, false);
        B = (new buw[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }
}
