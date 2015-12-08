// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Collection;

// Referenced classes of package com.paypal.android.sdk:
//            O, P

public final class N extends Enum
{

    public static final N a;
    public static final N b;
    public static final N c;
    public static final N d;
    public static final N e;
    public static final N f;
    public static final N g;
    public static final N h;
    public static final N i;
    public static final N j;
    public static final N k;
    public static final N l;
    public static final N m;
    public static final N n;
    public static final N o;
    public static final Collection p = new O();
    public static final Collection q = new P();
    private static final N t[];
    private String r;
    private boolean s;

    private N(String s1, int i1, String s2, boolean flag)
    {
        super(s1, i1);
        r = s2;
        s = flag;
    }

    static boolean a(N n1)
    {
        return n1.s;
    }

    public static N valueOf(String s1)
    {
        return (N)Enum.valueOf(com/paypal/android/sdk/N, s1);
    }

    public static N[] values()
    {
        return (N[])t.clone();
    }

    public final String a()
    {
        return r;
    }

    static 
    {
        a = new N("FUTURE_PAYMENTS", 0, "https://uri.paypal.com/services/payments/futurepayments", false);
        b = new N("PROFILE", 1, "profile", true);
        c = new N("PAYPAL_ATTRIBUTES", 2, "https://uri.paypal.com/services/paypalattributes", true);
        d = new N("OPENID", 3, "openid", true);
        e = new N("EMAIL", 4, "email", true);
        f = new N("ADDRESS", 5, "address", true);
        g = new N("PHONE", 6, "phone", true);
        h = new N("GET_FUNDING_OPTIONS", 7, "https://uri.paypal.com/services/payments/funding-options", false);
        i = new N("PAYMENT_CODE", 8, "https://uri.paypal.com/services/pos/payments", false);
        j = new N("MIS_CUSTOMER", 9, "https://uri.paypal.com/services/mis/customer", false);
        k = new N("FINANCIAL_INSTRUMENTS", 10, "https://uri.paypal.com/services/wallet/financial-instruments/view", false);
        l = new N("SEND_MONEY", 11, "https://uri.paypal.com/services/wallet/sendmoney", false);
        m = new N("REQUEST_MONEY", 12, "https://uri.paypal.com/services/wallet/money-request/requests", false);
        n = new N("LOYALTY", 13, "https://uri.paypal.com/services/loyalty/memberships/update", false);
        o = new N("EXPRESS_CHECKOUT", 14, "https://uri.paypal.com/services/expresscheckout", false);
        t = (new N[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }
}
