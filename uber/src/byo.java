// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class byo extends Enum
{

    public static final byo a;
    public static final byo b;
    public static final byo c;
    public static final byo d;
    public static final byo e;
    public static final byo f;
    public static final byo g;
    public static final byo h;
    public static final byo i;
    public static final byo j;
    public static final byo k;
    public static final byo l;
    public static final byo m;
    public static final byo n;
    public static final byo o;
    public static final byo p;
    public static final byo q;
    public static final byo r;
    public static final byo s;
    private static final byo t[];

    private byo(String s1, int i1)
    {
        super(s1, i1);
    }

    public static byo valueOf(String s1)
    {
        return (byo)Enum.valueOf(byo, s1);
    }

    public static byo[] values()
    {
        return (byo[])t.clone();
    }

    static 
    {
        a = new byo("openid_connect", 0);
        b = new byo("oauth_fullname", 1);
        c = new byo("oauth_gender", 2);
        d = new byo("oauth_date_of_birth", 3);
        e = new byo("oauth_timezone", 4);
        f = new byo("oauth_locale", 5);
        g = new byo("oauth_language", 6);
        h = new byo("oauth_age_range", 7);
        i = new byo("oauth_account_verified", 8);
        j = new byo("oauth_account_type", 9);
        k = new byo("oauth_account_creation_date", 10);
        l = new byo("oauth_email", 11);
        m = new byo("oauth_street_address1", 12);
        n = new byo("oauth_street_address2", 13);
        o = new byo("oauth_city", 14);
        p = new byo("oauth_state", 15);
        q = new byo("oauth_country", 16);
        r = new byo("oauth_zip", 17);
        s = new byo("oauth_phone_number", 18);
        t = (new byo[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s
        });
    }
}
