// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


// Referenced classes of package com.facebook.a:
//            c

public final class f
{

    public static f c = a(40D, 7D);
    public double a;
    public double b;

    private f(double d, double d1)
    {
        b = d;
        a = d1;
    }

    public static f a(double d, double d1)
    {
        double d2 = 0.0D;
        if (d == 0.0D)
        {
            d = 0.0D;
        } else
        {
            d = (d - 30D) * 3.6200000000000001D + 194D;
        }
        if (d1 == 0.0D)
        {
            d1 = d2;
        } else
        {
            d1 = (d1 - 8D) * 3D + 25D;
        }
        return new f(d, d1);
    }

    public static f b(double d, double d1)
    {
        c c1 = new c(d1, d);
        return a(c1.a, c1.b);
    }

}
