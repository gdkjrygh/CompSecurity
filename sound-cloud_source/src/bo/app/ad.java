// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ad extends Enum
{

    public static final ad a;
    public static final ad b;
    public static final ad c;
    public static final ad d;
    public static final ad e;
    public static final ad f;
    public static final ad g;
    public static final ad h;
    public static final ad i;
    public static final ad j;
    public static final ad k;
    public static final ad l;
    private static final ad n[];
    public String m;

    private ad(String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(bo/app/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])n.clone();
    }

    static 
    {
        a = new ad("ANDROID_VERSION", 0, "android_version");
        b = new ad("ABI", 1, "abi");
        c = new ad("CARRIER", 2, "carrier");
        d = new ad("MODEL", 3, "model");
        e = new ad("LOCALE_LANGUAGE", 4, "language");
        f = new ad("LOCALE_COUNTRY", 5, "country");
        g = new ad("LOCALE", 6, "locale");
        h = new ad("TIMEZONE", 7, "time_zone");
        i = new ad("DISPLAY", 8, "display");
        j = new ad("DEVICE_IDENTIFIERS", 9, "device_identifiers");
        k = new ad("PUSH_TOKEN", 10, "push_token");
        l = new ad("CONNECTED_DEVICES", 11, "connected_devices");
        n = (new ad[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
