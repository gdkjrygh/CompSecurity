// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class am extends Enum
{

    public static final am a;
    public static final am b;
    public static final am c;
    public static final am d;
    public static final am e;
    private static final am g[];
    public final String f;

    private am(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static am valueOf(String s)
    {
        return (am)Enum.valueOf(bo/app/am, s);
    }

    public static am[] values()
    {
        return (am[])g.clone();
    }

    static 
    {
        a = new am("ANDROID_VERSION", 0, "android_version");
        b = new am("MODEL", 1, "model");
        c = new am("DISPLAY", 2, "display");
        d = new am("DEVICE_IDENTIFIERS", 3, "device_identifiers");
        e = new am("DEVICE_TYPE", 4, "type");
        g = (new am[] {
            a, b, c, d, e
        });
    }
}
