// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.util.Arrays;

public final class LongArray
{

    private int a;
    private long b[];

    public LongArray()
    {
        this(32);
    }

    private LongArray(int i)
    {
        b = new long[i];
    }

    public final int a()
    {
        return a;
    }

    public final long a(int i)
    {
        if (i < 0 || i >= a)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid size ")).append(i).append(", size is ").append(a).toString());
        } else
        {
            return b[i];
        }
    }

    public final void a(long l)
    {
        if (a == b.length)
        {
            b = Arrays.copyOf(b, a * 2);
        }
        long al[] = b;
        int i = a;
        a = i + 1;
        al[i] = l;
    }
}
