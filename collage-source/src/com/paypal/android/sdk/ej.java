// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            eh

public final class ej extends Enum
{

    private static final ej B[];
    public static final ej a;
    public static final ej b;
    public static final ej c;
    public static final ej d;
    public static final ej e;
    public static final ej f;
    public static final ej g;
    public static final ej h;
    public static final ej i;
    public static final ej j;
    public static final ej k;
    public static final ej l;
    public static final ej m;
    public static final ej n;
    public static final ej o;
    public static final ej p;
    public static final ej q;
    public static final ej r;
    public static final ej s;
    public static final ej t;
    public static final ej u;
    public static final ej v;
    public static final ej w;
    private boolean A;
    private String x;
    private String y;
    private boolean z;

    private ej(String s1, int i1, String s2, String s3, boolean flag, boolean flag1)
    {
        super(s1, i1);
        x = s2;
        y = s3;
        z = flag;
        A = flag1;
    }

    public static ej valueOf(String s1)
    {
        return (ej)Enum.valueOf(com/paypal/android/sdk/ej, s1);
    }

    public static ej[] values()
    {
        return (ej[])B.clone();
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
        return (new StringBuilder()).append(eh.a).append(":").append(s1).append(":").append(s2).toString();
    }

    public final boolean b()
    {
        return A;
    }

    static 
    {
        a = new ej("PreConnect", 0, "preconnect", "", false, false);
        b = new ej("DeviceCheck", 1, "devicecheck", "", false, false);
        c = new ej("PaymentMethodWindow", 2, "selectpaymentmethod", "", false, false);
        d = new ej("PaymentMethodCancel", 3, "selectpaymentmethod", "cancel", false, true);
        e = new ej("SelectPayPalPayment", 4, "selectpaymentmethod", "paypal", false, true);
        f = new ej("SelectCreditCardPayment", 5, "selectpaymentmethod", "card", false, true);
        g = new ej("ConfirmPaymentWindow", 6, "confirmpayment", "", false, false);
        h = new ej("ConfirmPayment", 7, "confirmpayment", "confirm", false, false);
        i = new ej("ConfirmPaymentCancel", 8, "confirmpayment", "cancel", false, true);
        j = new ej("PaymentSuccessful", 9, "paymentsuccessful", "", false, false);
        k = new ej("LoginWindow", 10, "login", "password", true, false);
        l = new ej("LoginPassword", 11, "login", "password", true, true);
        m = new ej("LoginPIN", 12, "login", "PIN", true, true);
        n = new ej("SignUp", 13, "login", "password", true, true);
        o = new ej("LoginForgotPassword", 14, "login", "password", true, true);
        p = new ej("LoginCancel", 15, "login", "cancel", true, true);
        q = new ej("ConsentWindow", 16, "authorizationconsent", "", false, false);
        r = new ej("ConsentAgree", 17, "authorizationconsent", "agree", false, true);
        s = new ej("ConsentCancel", 18, "authorizationconsent", "cancel", false, true);
        t = new ej("ConsentMerchantUrl", 19, "authorizationconsent", "merchanturl", false, true);
        u = new ej("ConsentPayPalPrivacyUrl", 20, "authorizationconsent", "privacy", false, true);
        v = new ej("AuthorizationSuccessful", 21, "authorizationsuccessful", "", false, false);
        w = new ej("LegalTextWindow", 22, "legaltext", "", false, false);
        B = (new ej[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }
}
