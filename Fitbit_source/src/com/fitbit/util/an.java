// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.util.b.a;

public class an
{

    private static final double a = 1.0000000000000001E-05D;

    public an()
    {
    }

    public static double a(double d, int i)
    {
        double d1 = Math.pow(10D, i);
        return (double)Math.round(d * d1) / d1;
    }

    public static int a(int i)
    {
        int j = 0;
        for (; i != 0; i /= 10)
        {
            j++;
        }

        return j;
    }

    public static int a(int i, int j)
    {
        int i1 = 1;
        if (j != 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        int l = 1;
        int k = i;
        do
        {
            i1 = k;
            if (l >= j)
            {
                continue;
            }
            l++;
            k *= i;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean a(double d)
    {
        return a(d, 0.0D);
    }

    public static boolean a(double d, double d1)
    {
        return a(d, d1, 1.0000000000000001E-05D);
    }

    public static boolean a(double d, double d1, double d2)
    {
        return Math.abs(d - d1) < d2;
    }

    public static int b(double d, int i)
    {
        int j = (int)Math.ceil((d - (double)(int)d) * (double)a(10, i));
        if (j == 0)
        {
            return 0;
        }
        int k = a(j);
        for (; j % 10 == 0; j /= 10) { }
        return a(j) + (i - k);
    }

    public static int b(int i, int j)
    {
        if (com.fitbit.util.b.a.a(19))
        {
            return Integer.compare(i, j);
        } else
        {
            return Integer.valueOf(i).compareTo(Integer.valueOf(j));
        }
    }
}
