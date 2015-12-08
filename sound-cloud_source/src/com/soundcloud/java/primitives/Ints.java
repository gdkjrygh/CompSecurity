// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.primitives;

import com.soundcloud.java.checks.Preconditions;
import java.util.Arrays;

public final class Ints
{

    public static final int MAX_POWER_OF_TWO = 0x40000000;

    private Ints()
    {
    }

    public static int checkedCast(long l)
    {
        int i = (int)l;
        if ((long)i != l)
        {
            throw new IllegalArgumentException((new StringBuilder("Out of range: ")).append(l).toString());
        } else
        {
            return i;
        }
    }

    public static int[] inGroupsOf(int i, int j)
    {
        boolean flag = true;
        int ai[];
        int k;
        int l;
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        k = j / i;
        l = j % i;
        if (l > 0)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        ai = new int[k + j];
        Arrays.fill(ai, i);
        if (l > 0)
        {
            ai[ai.length - 1] = l;
        }
        return ai;
    }

    public static int saturatedCast(long l)
    {
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        } else
        {
            return (int)l;
        }
    }
}
