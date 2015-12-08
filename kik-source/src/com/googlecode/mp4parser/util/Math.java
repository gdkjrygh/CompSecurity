// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;


public class Math
{

    public Math()
    {
    }

    public static int gcd(int i, int j)
    {
        do
        {
            int k = i;
            if (j <= 0)
            {
                return k;
            }
            i = j;
            j = k % j;
        } while (true);
    }

    public static long gcd(long l, long l1)
    {
        do
        {
            long l2 = l;
            if (l1 <= 0L)
            {
                return l2;
            }
            l = l1;
            l1 = l2 % l1;
        } while (true);
    }

    public static int lcm(int i, int j)
    {
        return (j / gcd(i, j)) * i;
    }

    public static long lcm(long l, long l1)
    {
        return (l1 / gcd(l, l1)) * l;
    }
}
