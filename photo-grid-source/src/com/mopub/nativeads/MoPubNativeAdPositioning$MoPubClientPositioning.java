// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b
{

    public static final int NO_REPEAT = 0x7fffffff;
    private final ArrayList a = new ArrayList();
    private int b;

    static int a(b b1, int i)
    {
        b1.b = i;
        return i;
    }

    static ArrayList a(b b1)
    {
        return b1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    final List a()
    {
        return a;
    }

    public a addFixedPosition(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        int j;
        if (com.mopub.common.ng(flag))
        {
            if ((j = Collections.binarySearch(a, Integer.valueOf(i))) < 0)
            {
                a.add(~j, Integer.valueOf(i));
                return this;
            }
        }
        return this;
    }

    final int b()
    {
        return b;
    }

    public b enableRepeatingPositions(int i)
    {
        boolean flag = true;
        if (i <= 1)
        {
            flag = false;
        }
        if (!com.mopub.common.ng(flag, "Repeating interval must be greater than 1"))
        {
            b = 0x7fffffff;
            return this;
        } else
        {
            b = i;
            return this;
        }
    }

    public I()
    {
        b = 0x7fffffff;
    }
}
