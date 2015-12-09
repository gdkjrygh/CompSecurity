// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


public final class v
{

    public static final double a = 1.5707963267948966D;
    public static final double b = 0.78539816339744828D;
    public static final double c = 4.7123889803846897D;
    public static final double d = 6.2831853071795862D;

    public v()
    {
    }

    public static double a(double d1, double d2)
    {
        return Math.ceil(d1 / d2) * d2;
    }

    public static double a(double d1, double d2, double d3)
    {
        if (d1 < d2)
        {
            return d2;
        }
        if (d1 > d3)
        {
            return d3;
        } else
        {
            return d1;
        }
    }

    public static double a(double d1, int i)
    {
        return b(d1, Math.pow(10D, Math.floor(Math.log10(d1) - (double)i)));
    }

    public static int a(double d1, double d2, double d3, double ad[])
    {
        if (d1 == 0.0D)
        {
            if (d2 != 0.0D)
            {
                d1 = -d3 / d2;
                ad[1] = d1;
                ad[0] = d1;
                return 1;
            }
        } else
        {
            d3 = d2 * d2 - 4D * d1 * d3;
            if (d3 >= 0.0D)
            {
                d3 = Math.sqrt(d3);
                ad[0] = (-d2 - d3) / (2D * d1);
                ad[1] = (d3 + -d2) / (2D * d1);
                return 2;
            }
        }
        return 0;
    }

    public static int a(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    public static boolean a(Double double1, double d1)
    {
        return double1 != null && double1.doubleValue() == d1;
    }

    static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static double b(double d1, double d2)
    {
        return Math.floor(d1 / d2) * d2;
    }

    public static double c(double d1, double d2)
    {
        if (d1 == 0.0D)
        {
            return 0.0D;
        } else
        {
            d2 = Math.pow(10D, Math.abs(Math.ceil(Math.log10(Math.abs(d2)))) + 1.0D);
            return Math.floor(d1 * d2 + 0.5D) / d2;
        }
    }
}
