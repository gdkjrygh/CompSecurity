// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


public final class d
{

    public static boolean a(double d1, double d2)
    {
        while (d1 == d2 || Math.abs(d1 - d2) < 1.0000000000000001E-05D) 
        {
            return true;
        }
        return false;
    }

    public static boolean a(double d1, double d2, double d3)
    {
        while (d1 == d2 || Math.abs(d1 - d2) < d3) 
        {
            return true;
        }
        return false;
    }

    public static boolean b(double d1, double d2)
    {
        return b(d1, d2, 1.0000000000000001E-05D) || a(d1, d2, 1.0000000000000001E-05D);
    }

    public static boolean b(double d1, double d2, double d3)
    {
        return d1 - d2 > d3;
    }

    public static boolean c(double d1, double d2)
    {
        return c(d1, d2, 1.0000000000000001E-05D);
    }

    public static boolean c(double d1, double d2, double d3)
    {
        return d2 - d1 > d3;
    }

    public static boolean d(double d1, double d2)
    {
        return c(d1, d2, 1.0000000000000001E-05D) || a(d1, d2, 1.0000000000000001E-05D);
    }
}
