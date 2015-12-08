// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;


final class MathPreconditions
{

    static void checkNoOverflow(boolean flag)
    {
        if (!flag)
        {
            throw new ArithmeticException("overflow");
        } else
        {
            return;
        }
    }

    static int checkNonNegative(String s, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" (").append(i).append(") must be >= 0").toString());
        } else
        {
            return i;
        }
    }

    static long checkNonNegative(String s, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" (").append(l).append(") must be >= 0").toString());
        } else
        {
            return l;
        }
    }

    static int checkPositive(String s, int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" (").append(i).append(") must be > 0").toString());
        } else
        {
            return i;
        }
    }

    static long checkPositive(String s, long l)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" (").append(l).append(") must be > 0").toString());
        } else
        {
            return l;
        }
    }

    static void checkRoundingUnnecessary(boolean flag)
    {
        if (!flag)
        {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        } else
        {
            return;
        }
    }
}
