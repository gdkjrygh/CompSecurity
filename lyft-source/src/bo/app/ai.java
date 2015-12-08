// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ai extends Enum
{

    public static final ai a;
    public static final ai b;
    public static final ai c;
    public static final ai d;
    public static final ai e;
    public static final ai f;
    public static final ai g;
    public static final ai h;
    public static final ai i;
    public static final ai j;
    public static final ai k;
    public static final ai l;
    private static final ai n[];
    public String m;

    private ai(String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(bo/app/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])n.clone();
    }

    static 
    {
        a = new ai("ANDROID_VERSION", 0, "android_version");
        b = new ai("ABI", 1, "abi");
        c = new ai("CARRIER", 2, "carrier");
        d = new ai("MODEL", 3, "model");
        e = new ai("LOCALE_LANGUAGE", 4, "language");
        f = new ai("LOCALE_COUNTRY", 5, "country");
        g = new ai("LOCALE", 6, "locale");
        h = new ai("TIMEZONE", 7, "time_zone");
        i = new ai("DISPLAY", 8, "display");
        j = new ai("DEVICE_IDENTIFIERS", 9, "device_identifiers");
        k = new ai("PUSH_TOKEN", 10, "push_token");
        l = new ai("CONNECTED_DEVICES", 11, "connected_devices");
        n = (new ai[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
