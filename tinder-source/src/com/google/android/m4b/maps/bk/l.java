// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


public final class l
{

    private double a;
    private double b;

    public static double a(double d, double d1, double d2, double d3, 
            double d4, double d5)
    {
        double d7 = (d2 - d) * (d5 - d1) - (d4 - d) * (d3 - d1);
        double d6 = d7;
        if (Math.abs(d7) < ((d - d4) * (d - d4) + (d1 - d5) * (d1 - d5) + (d - d2) * (d - d2) + (d1 - d3) * (d1 - d3)) * 1E-10D)
        {
            d6 = 0.0D;
        }
        return d6;
    }

    public static int a(double d, double d1, double d2, double d3)
    {
        int j = Double.compare(d, d2);
        int i = j;
        if (j == 0)
        {
            i = Double.compare(d1, d3);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof l))
            {
                return false;
            }
            obj = (l)obj;
            if (((l) (obj)).a != a || ((l) (obj)).b != b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        long l1 = Double.doubleToLongBits(a) ^ Double.doubleToLongBits(b) * 31L;
        int i = (int)l1;
        return (int)(l1 >> 32) ^ i;
    }

    public final String toString()
    {
        double d = a;
        double d1 = b;
        return (new StringBuilder(51)).append("(").append(d).append(",").append(d1).append(")").toString();
    }
}
