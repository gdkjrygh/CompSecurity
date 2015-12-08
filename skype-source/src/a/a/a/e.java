// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    private static final e q[];
    private final int p;

    private e(String s, int i1, int j1)
    {
        super(s, i1);
        p = j1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(a/a/a/e, s);
    }

    public static e[] values()
    {
        return (e[])q.clone();
    }

    public final int a()
    {
        return p;
    }

    static 
    {
        a = new e("NotSet", 0, 0);
        b = new e("DistinguishedName", 1, 1);
        c = new e("GenericData", 2, 2);
        d = new e("IPV4Address", 3, 3);
        e = new e("IPv6Address", 4, 4);
        f = new e("MailSubject", 5, 5);
        g = new e("PhoneNumber", 6, 6);
        h = new e("QueryString", 7, 7);
        i = new e("SipAddress", 8, 8);
        j = new e("SmtpAddress", 9, 9);
        k = new e("Identity", 10, 10);
        l = new e("Uri", 11, 11);
        m = new e("Fqdn", 12, 12);
        n = new e("IPV4AddressLegacy", 13, 13);
        o = new e("__INVALID_ENUM_VALUE", 14, 14);
        q = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }
}
