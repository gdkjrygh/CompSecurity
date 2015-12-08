// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


public final class r
{

    public final double a;
    public final double b;

    public r(double d, double d1)
    {
        if (d < d1)
        {
            a = d;
            b = d1;
            return;
        } else
        {
            a = d1;
            b = d;
            return;
        }
    }

    public static r a(r r1, r r2)
    {
        if (r1 == null)
        {
            return r2;
        }
        if (r2 == null)
        {
            return r1;
        } else
        {
            return r1.a(r2);
        }
    }

    public final double a()
    {
        return 0.5D * (b + a);
    }

    public final r a(double d)
    {
        double d1;
        if (d < a)
        {
            d1 = d;
        } else
        {
            d1 = a;
        }
        if (d <= b)
        {
            d = b;
        }
        return new r(d1, d);
    }

    public final r a(double d, double d1)
    {
        if (d >= a)
        {
            d = a;
        }
        if (d1 <= b)
        {
            d1 = b;
        }
        return new r(d, d1);
    }

    public final r a(r r1)
    {
        return a(r1.a, r1.b);
    }

    public final double b()
    {
        return b - a;
    }

    public final double b(double d)
    {
        return a + (b - a) * d;
    }

    public final double c(double d)
    {
        return (d - a) / (b - a);
    }
}
