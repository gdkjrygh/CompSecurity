// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            co

public final class cp extends Enum
{

    private static final cp B[];
    public static final cp a;
    public static final cp b;
    public static final cp c;
    public static final cp d;
    public static final cp e;
    public static final cp f;
    public static final cp g;
    public static final cp h;
    public static final cp i;
    public static final cp j;
    public static final cp k;
    public static final cp l;
    public static final cp m;
    public static final cp n;
    public static final cp o;
    public static final cp p;
    public static final cp q;
    private static cp r;
    private static cp s;
    private static cp t;
    private static cp u;
    private static cp v;
    private static cp w;
    private boolean A;
    private String x;
    private String y;
    private boolean z;

    private cp(String s1, int i1, String s2, String s3, boolean flag, boolean flag1)
    {
        super(s1, i1);
        x = s2;
        y = s3;
        z = flag;
        A = flag1;
    }

    public static cp valueOf(String s1)
    {
        return (cp)Enum.valueOf(com/paypal/android/sdk/cp, s1);
    }

    public static cp[] values()
    {
        return (cp[])B.clone();
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
        return (new StringBuilder()).append(co.a).append(":").append(s1).append(":").append(s2).toString();
    }

    public final boolean b()
    {
        return A;
    }

    static 
    {
        a = new cp("PreConnect", 0, "preconnect", "", false, false);
        b = new cp("DeviceCheck", 1, "devicecheck", "", false, false);
        r = new cp("PaymentMethodWindow", 2, "selectpaymentmethod", "", false, false);
        s = new cp("PaymentMethodCancel", 3, "selectpaymentmethod", "cancel", false, true);
        t = new cp("SelectPayPalPayment", 4, "selectpaymentmethod", "paypal", false, true);
        u = new cp("SelectCreditCardPayment", 5, "selectpaymentmethod", "card", false, true);
        v = new cp("ConfirmPaymentWindow", 6, "confirmpayment", "", false, false);
        c = new cp("ConfirmPayment", 7, "confirmpayment", "confirm", false, false);
        w = new cp("ConfirmPaymentCancel", 8, "confirmpayment", "cancel", false, true);
        d = new cp("PaymentSuccessful", 9, "paymentsuccessful", "", false, false);
        e = new cp("LoginWindow", 10, "login", "password", true, false);
        f = new cp("LoginPassword", 11, "login", "password", true, true);
        g = new cp("LoginPIN", 12, "login", "PIN", true, true);
        h = new cp("SignUp", 13, "login", "password", true, true);
        i = new cp("LoginForgotPassword", 14, "login", "password", true, true);
        j = new cp("LoginCancel", 15, "login", "cancel", true, true);
        k = new cp("ConsentWindow", 16, "authorizationconsent", "", false, false);
        l = new cp("ConsentAgree", 17, "authorizationconsent", "agree", false, true);
        m = new cp("ConsentCancel", 18, "authorizationconsent", "cancel", false, true);
        n = new cp("ConsentMerchantUrl", 19, "authorizationconsent", "merchanturl", false, true);
        o = new cp("ConsentPayPalPrivacyUrl", 20, "authorizationconsent", "privacy", false, true);
        p = new cp("AuthorizationSuccessful", 21, "authorizationsuccessful", "", false, false);
        q = new cp("LegalTextWindow", 22, "legaltext", "", false, false);
        B = (new cp[] {
            a, b, r, s, t, u, v, c, w, d, 
            e, f, g, h, i, j, k, l, m, n, 
            o, p, q
        });
    }
}
