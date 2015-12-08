// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


public class MathUtils
{
    public static class Range
    {

        private final int end;
        private final int midpoint;
        private final int start;

        public boolean contains(int i)
        {
            return i >= start && i <= end;
        }

        public int getMidpoint()
        {
            return midpoint;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Range [start=").append(start).append(", end=").append(end).append("]").toString();
        }

        public Range(int i, int j)
        {
            start = i;
            end = j;
            midpoint = MathUtils.divideInts(i + j, 2);
        }
    }


    private MathUtils()
    {
    }

    public static int ceiling(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public static int constrain(int i, int j, int k)
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

    public static int divideInts(int i, int j)
    {
        return (int)((float)i / (float)j + 0.5F);
    }

    public static boolean isEven(int i)
    {
        return (i & 1) == 0;
    }
}
