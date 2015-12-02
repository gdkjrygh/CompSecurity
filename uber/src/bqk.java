// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class bqk extends Enum
{

    public static final bqk a;
    public static final bqk b;
    public static final bqk c;
    public static final bqk d;
    public static final bqk e;
    public static final bqk f;
    public static final bqk g;
    public static final bqk h;
    public static final bqk i;
    public static final bqk j;
    public static final bqk k;
    public static final bqk l;
    public static final bqk m;
    public static final bqk n;
    public static final bqk o;
    public static final Collection p = new bql();
    public static final Collection q = new bqm();
    private static final bqk t[];
    private String r;
    private boolean s;

    private bqk(String s1, int i1, String s2, boolean flag)
    {
        super(s1, i1);
        r = s2;
        s = flag;
    }

    static boolean a(bqk bqk1)
    {
        return bqk1.s;
    }

    public static bqk valueOf(String s1)
    {
        return (bqk)Enum.valueOf(bqk, s1);
    }

    public static bqk[] values()
    {
        return (bqk[])t.clone();
    }

    public final String a()
    {
        return r;
    }

    static 
    {
        a = new bqk("FUTURE_PAYMENTS", 0, "https://uri.paypal.com/services/payments/futurepayments", false);
        b = new bqk("PROFILE", 1, "profile", true);
        c = new bqk("PAYPAL_ATTRIBUTES", 2, "https://uri.paypal.com/services/paypalattributes", true);
        d = new bqk("OPENID", 3, "openid", true);
        e = new bqk("EMAIL", 4, "email", true);
        f = new bqk("ADDRESS", 5, "address", true);
        g = new bqk("PHONE", 6, "phone", true);
        h = new bqk("GET_FUNDING_OPTIONS", 7, "https://uri.paypal.com/services/payments/funding-options", false);
        i = new bqk("PAYMENT_CODE", 8, "https://uri.paypal.com/services/pos/payments", false);
        j = new bqk("MIS_CUSTOMER", 9, "https://uri.paypal.com/services/mis/customer", false);
        k = new bqk("FINANCIAL_INSTRUMENTS", 10, "https://uri.paypal.com/services/wallet/financial-instruments/view", false);
        l = new bqk("SEND_MONEY", 11, "https://uri.paypal.com/services/wallet/sendmoney", false);
        m = new bqk("REQUEST_MONEY", 12, "https://uri.paypal.com/services/wallet/money-request/requests", false);
        n = new bqk("LOYALTY", 13, "https://uri.paypal.com/services/loyalty/memberships/update", false);
        o = new bqk("EXPRESS_CHECKOUT", 14, "https://uri.paypal.com/services/expresscheckout", false);
        t = (new bqk[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }
}
