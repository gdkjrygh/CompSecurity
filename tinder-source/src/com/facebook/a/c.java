// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


public class c
{

    static final boolean c;
    final double a;
    final double b;
    private final double d;
    private final double e;

    public c(double d1, double d2)
    {
        double d3;
        d = d1;
        e = d2;
        d2 = a((d2 / 1.7D - 0.0D) / 20D, 0.0D, 0.80000000000000004D);
        a = a((d1 / 1.7D - 0.0D) / 20D, 0.5D, 200D);
        d3 = a;
        d1 = 0.0D;
        if (d3 > 18D) goto _L2; else goto _L1
_L1:
        d1 = (0.00069999999999999999D * Math.pow(d3, 3D) - 0.031D * Math.pow(d3, 2D)) + d3 * 0.64000000000000001D + 1.28D;
_L4:
        d2 = 2D * d2 - d2 * d2;
        b = d1 * (1.0D - d2) + 0.01D * d2;
        return;
_L2:
        if (d3 > 18D && d3 <= 44D)
        {
            d1 = (4.3999999999999999E-05D * Math.pow(d3, 3D) - 0.0060000000000000001D * Math.pow(d3, 2D)) + d3 * 0.35999999999999999D + 2D;
            continue; /* Loop/switch isn't completed */
        }
        if (d3 <= 44D)
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = (4.4999999999999998E-07D * Math.pow(d3, 3D) - 0.00033199999999999999D * Math.pow(d3, 2D)) + d3 * 0.10780000000000001D + 5.8399999999999999D;
        if (true) goto _L4; else goto _L3
_L3:
        if (c) goto _L4; else goto _L5
_L5:
        throw new AssertionError();
    }

    private static double a(double d1, double d2, double d3)
    {
        return (d3 - d2) * d1 + d2;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/a/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
