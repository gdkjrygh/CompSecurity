// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    public static final i j;
    public static final i k;
    private static final i m[];
    public String l;

    private i(String s, int i1, String s1)
    {
        super(s, i1);
        l = s1;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(a/a/i, s);
    }

    public static i[] values()
    {
        return (i[])m.clone();
    }

    static 
    {
        a = new i("ANDROID_VERSION", 0, "android_version");
        b = new i("ABI", 1, "abi");
        c = new i("CARRIER", 2, "carrier");
        d = new i("MODEL", 3, "model");
        e = new i("LOCALE_LANGUAGE", 4, "language");
        f = new i("LOCALE_COUNTRY", 5, "country");
        g = new i("LOCALE", 6, "locale");
        h = new i("TIMEZONE", 7, "time_zone");
        i = new i("DISPLAY", 8, "display");
        j = new i("DEVICE_IDENTIFIERS", 9, "device_identifiers");
        k = new i("PUSH_TOKEN", 10, "push_token");
        m = (new i[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
