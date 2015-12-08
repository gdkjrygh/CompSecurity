// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import java.text.DecimalFormat;

public final class y
{

    private static final DecimalFormat a = new DecimalFormat("0.00");

    public static String a(double d)
    {
        return a(d, false);
    }

    public static String a(double d, boolean flag)
    {
        if (!flag && d == (double)(long)d)
        {
            return String.format("%d", new Object[] {
                Long.valueOf((long)d)
            });
        } else
        {
            return String.format("%s", new Object[] {
                a.format(d)
            });
        }
    }

    public static boolean a(double d, double d1)
    {
        return d - d1 < 0.0050000000000000001D && d1 - d < 0.0050000000000000001D;
    }

    public static boolean b(double d, double d1)
    {
        return d > d1 && !a(d, d1);
    }

}
