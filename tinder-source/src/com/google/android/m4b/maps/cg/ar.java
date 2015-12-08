// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


public final class ar
{

    private static double a = Math.log(2D);

    public static float a(float f1)
    {
        if (f1 >= 0.0F && f1 < 360F)
        {
            return f1;
        } else
        {
            f1 /= 360F;
            return (f1 - (float)Math.floor(f1)) * 360F;
        }
    }

    public static float a(float f1, float f2)
    {
        f1 = b(f1 - f2);
        if (f1 < 180F)
        {
            return f1;
        } else
        {
            return f1 - 360F;
        }
    }

    public static float a(float f1, float f2, float f3)
    {
        return Math.min(f3, Math.max(f2, f1));
    }

    public static int a(int i1, int j1)
    {
        return Math.min(j1, Math.max(0, i1));
    }

    public static int a(int i1, int j1, int k1, int l1)
    {
        return Math.max(0, (int)Math.ceil(e(Math.max((float)j1 / (float)l1, (float)i1 / (float)k1)))) + 1;
    }

    public static void a(float f1, float f2, float f3, float af[])
    {
        af[0] = c(-f1, f3);
        af[1] = c((float)Math.sqrt(f1 * f1 + f3 * f3), -f2);
    }

    public static void a(float f1, float f2, float af[])
    {
        float f3 = s(f1);
        f1 = t(f1);
        float f4 = s(f2);
        float f5 = t(f2);
        f2 = -f4;
        f5 = -f5;
        af[0] = f3 * f2;
        af[1] = f5;
        af[2] = f1 * f4;
    }

    public static float b(float f1)
    {
        return f1 - (float)Math.floor(f1 / 360F) * 360F;
    }

    public static float b(float f1, float f2)
    {
        f1 = c(f1 - f2);
        if ((double)f1 < 0.5D)
        {
            return f1;
        } else
        {
            return f1 - 1.0F;
        }
    }

    public static float c(float f1)
    {
        return f1 - (float)Math.floor(f1);
    }

    private static float c(float f1, float f2)
    {
        return c((float)Math.atan2(f1, f2) * 0.1591549F);
    }

    public static float d(float f1)
    {
        return a(f1, 0.0F, 1.0F);
    }

    public static float e(float f1)
    {
        return (float)(Math.log(f1) / a);
    }

    public static float f(float f1)
    {
        return (float)Math.exp((double)f1 * a);
    }

    public static float g(float f1)
    {
        return s(f1) / t(f1);
    }

    public static float h(float f1)
    {
        return (float)Math.atan(f1) * 0.1591549F;
    }

    public static float i(float f1)
    {
        return (float)Math.sin(0.01745329F * f1);
    }

    public static float j(float f1)
    {
        return (float)Math.cos(0.01745329F * f1);
    }

    public static float k(float f1)
    {
        return 0.1591549F * f1;
    }

    public static float l(float f1)
    {
        return 6.283185F * f1;
    }

    public static float m(float f1)
    {
        return 0.002777778F * f1;
    }

    public static float n(float f1)
    {
        return 360F * f1;
    }

    public static float o(float f1)
    {
        return 57.29578F * f1;
    }

    public static float p(float f1)
    {
        return 0.01745329F * f1;
    }

    public static int q(float f1)
    {
        return (int)Math.floor((22.5F + f1) / 45F) & 7;
    }

    public static float r(float f1)
    {
        float f2 = 1.0F - f1;
        double d1 = Math.pow(f2, 3D);
        double d2 = Math.pow(f2, 2D);
        double d3 = f1;
        return (float)((double)(f2 * 3F) * Math.pow(f1, 2D) * 0.94999998807907104D + (d1 * 0.0D + d2 * 3D * d3 * 0.10000000149011612D) + Math.pow(f1, 3D) * 1.0D);
    }

    private static float s(float f1)
    {
        return (float)Math.sin(6.283185F * f1);
    }

    private static float t(float f1)
    {
        return (float)Math.cos(6.283185F * f1);
    }

}
