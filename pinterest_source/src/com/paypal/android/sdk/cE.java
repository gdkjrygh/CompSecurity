// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            cC

public final class cE extends Enum
{

    private static final cE B[];
    public static final cE a;
    public static final cE b;
    public static final cE c;
    public static final cE d;
    public static final cE e;
    public static final cE f;
    public static final cE g;
    public static final cE h;
    public static final cE i;
    public static final cE j;
    public static final cE k;
    public static final cE l;
    public static final cE m;
    public static final cE n;
    public static final cE o;
    public static final cE p;
    public static final cE q;
    private static cE r;
    private static cE s;
    private static cE t;
    private static cE u;
    private static cE v;
    private static cE w;
    private boolean A;
    private String x;
    private String y;
    private boolean z;

    private cE(String s1, int i1, String s2, String s3, boolean flag, boolean flag1)
    {
        super(s1, i1);
        x = s2;
        y = s3;
        z = flag;
        A = flag1;
    }

    public static cE valueOf(String s1)
    {
        return (cE)Enum.valueOf(com/paypal/android/sdk/cE, s1);
    }

    public static cE[] values()
    {
        return (cE[])B.clone();
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
        return (new StringBuilder()).append(cC.a).append(":").append(s1).append(":").append(s2).toString();
    }

    public final boolean b()
    {
        return A;
    }

    static 
    {
        a = new cE("PreConnect", 0, "preconnect", "", false, false);
        b = new cE("DeviceCheck", 1, "devicecheck", "", false, false);
        r = new cE("PaymentMethodWindow", 2, "selectpaymentmethod", "", false, false);
        s = new cE("PaymentMethodCancel", 3, "selectpaymentmethod", "cancel", false, true);
        t = new cE("SelectPayPalPayment", 4, "selectpaymentmethod", "paypal", false, true);
        u = new cE("SelectCreditCardPayment", 5, "selectpaymentmethod", "card", false, true);
        v = new cE("ConfirmPaymentWindow", 6, "confirmpayment", "", false, false);
        c = new cE("ConfirmPayment", 7, "confirmpayment", "confirm", false, false);
        w = new cE("ConfirmPaymentCancel", 8, "confirmpayment", "cancel", false, true);
        d = new cE("PaymentSuccessful", 9, "paymentsuccessful", "", false, false);
        e = new cE("LoginWindow", 10, "login", "password", true, false);
        f = new cE("LoginPassword", 11, "login", "password", true, true);
        g = new cE("LoginPIN", 12, "login", "PIN", true, true);
        h = new cE("SignUp", 13, "login", "password", true, true);
        i = new cE("LoginForgotPassword", 14, "login", "password", true, true);
        j = new cE("LoginCancel", 15, "login", "cancel", true, true);
        k = new cE("ConsentWindow", 16, "authorizationconsent", "", false, false);
        l = new cE("ConsentAgree", 17, "authorizationconsent", "agree", false, true);
        m = new cE("ConsentCancel", 18, "authorizationconsent", "cancel", false, true);
        n = new cE("ConsentMerchantUrl", 19, "authorizationconsent", "merchanturl", false, true);
        o = new cE("ConsentPayPalPrivacyUrl", 20, "authorizationconsent", "privacy", false, true);
        p = new cE("AuthorizationSuccessful", 21, "authorizationsuccessful", "", false, false);
        q = new cE("LegalTextWindow", 22, "legaltext", "", false, false);
        B = (new cE[] {
            a, b, r, s, t, u, v, c, w, d, 
            e, f, g, h, i, j, k, l, m, n, 
            o, p, q
        });
    }
}
