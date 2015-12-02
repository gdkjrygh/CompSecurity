// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


public final class TimeRange
{

    public final int a;
    private final long b;
    private final long c;

    public TimeRange(int i, long l, long l1)
    {
        a = i;
        b = l;
        c = l1;
    }

    public final long[] a(long al[])
    {
        long al1[];
label0:
        {
            if (al != null)
            {
                al1 = al;
                if (al.length >= 2)
                {
                    break label0;
                }
            }
            al1 = new long[2];
        }
        al1[0] = b;
        al1[1] = c;
        return al1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof TimeRange)
            {
                if (((TimeRange) (obj = (TimeRange)obj)).a != a || ((TimeRange) (obj)).b != b || ((TimeRange) (obj)).c != c)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (int)((long)(a << 30 | 0) | (b + c) / 1000L & 0x3fffffffL);
    }
}
