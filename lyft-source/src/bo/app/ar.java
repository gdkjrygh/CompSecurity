// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ar extends Enum
{

    public static final ar a;
    public static final ar b;
    public static final ar c;
    public static final ar d;
    public static final ar e;
    private static final ar g[];
    public final String f;

    private ar(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(bo/app/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])g.clone();
    }

    static 
    {
        a = new ar("ANDROID_VERSION", 0, "android_version");
        b = new ar("MODEL", 1, "model");
        c = new ar("DISPLAY", 2, "display");
        d = new ar("DEVICE_IDENTIFIERS", 3, "device_identifiers");
        e = new ar("DEVICE_TYPE", 4, "type");
        g = (new ar[] {
            a, b, c, d, e
        });
    }
}
