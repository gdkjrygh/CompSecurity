// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class car extends Enum
{

    public static final car a;
    public static final car b;
    public static final car c;
    public static final car d;
    public static final car e;
    private static final car i[];
    public final int f;
    public final float g;
    final float h;

    private car(String s, int j, int k, float f1, float f2)
    {
        super(s, j);
        f = k;
        g = f1;
        h = f2;
    }

    public static car valueOf(String s)
    {
        return (car)Enum.valueOf(car, s);
    }

    public static car[] values()
    {
        return (car[])i.clone();
    }

    static 
    {
        a = new car("NO_BLUR", 0, 0, 1.0F, 0.0F);
        b = new car("SOFT_SKIN", 1, 7, 3F, 0.2F);
        c = new car("SOFT_EDGES", 2, 8, 4F, 0.3F);
        d = new car("BLUR_OUT", 3, 8, 2.0F, 1.0F);
        e = new car("SHARPEN", 4, 3, 4F, -0.3F);
        i = (new car[] {
            a, b, c, d, e
        });
    }
}
