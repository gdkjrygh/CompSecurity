// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class btm extends Enum
{

    private static btm b;
    private static btm c;
    private static btm d;
    private static btm e;
    private static btm f;
    private static final btm g[];
    public String a;

    private btm(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static btm a(int i)
    {
        switch (i)
        {
        default:
            return b;

        case 240: 
            return c;

        case 320: 
            return d;

        case 480: 
            return e;

        case 640: 
            return f;
        }
    }

    public static btm valueOf(String s)
    {
        return (btm)Enum.valueOf(btm, s);
    }

    public static btm[] values()
    {
        return (btm[])g.clone();
    }

    static 
    {
        b = new btm("mdpi", 0, "mdpi");
        c = new btm("hdpi", 1, "hdpi");
        d = new btm("xhdpi", 2, "xhdpi");
        e = new btm("xxhdpi", 3, "xxhdpi");
        f = new btm("xxxhdpi", 4, "xxxhdpi");
        g = (new btm[] {
            b, c, d, e, f
        });
    }
}
