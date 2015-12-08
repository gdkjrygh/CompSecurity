// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


final class B extends Enum
{

    public static final B a;
    public static final B b;
    public static final B c;
    public static final B d;
    public static final B e;
    public static final B f;
    public static final B g;
    public static final B h;
    public static final B i;
    public static final B j;
    public static final B k;
    public static final B l;
    public static final B m;
    public static final B n;
    public static final B o;
    public static final B p;
    public static final B q;
    public static final B r;
    public static final B s;
    private static final B t[];

    private B(String s1, int i1)
    {
        super(s1, i1);
    }

    public static B valueOf(String s1)
    {
        return (B)Enum.valueOf(com/paypal/android/sdk/payments/B, s1);
    }

    public static B[] values()
    {
        return (B[])t.clone();
    }

    static 
    {
        a = new B("openid_connect", 0);
        b = new B("oauth_fullname", 1);
        c = new B("oauth_gender", 2);
        d = new B("oauth_date_of_birth", 3);
        e = new B("oauth_timezone", 4);
        f = new B("oauth_locale", 5);
        g = new B("oauth_language", 6);
        h = new B("oauth_age_range", 7);
        i = new B("oauth_account_verified", 8);
        j = new B("oauth_account_type", 9);
        k = new B("oauth_account_creation_date", 10);
        l = new B("oauth_email", 11);
        m = new B("oauth_street_address1", 12);
        n = new B("oauth_street_address2", 13);
        o = new B("oauth_city", 14);
        p = new B("oauth_state", 15);
        q = new B("oauth_country", 16);
        r = new B("oauth_zip", 17);
        s = new B("oauth_phone_number", 18);
        t = (new B[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s
        });
    }
}
