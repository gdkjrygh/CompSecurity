// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;


public class WakeupPeriod
{

    private long a;
    private long b;
    private int c;
    private boolean d;

    public WakeupPeriod(long l, long l1, int i)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("interval must greater than zero");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("delay must greater than zero");
        } else
        {
            a = l;
            b = l1;
            c = i;
            return;
        }
    }

    public final long a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }
}
