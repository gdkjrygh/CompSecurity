// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.concurrent.TimeUnit;

public class TimeAnomalyException extends Exception
{

    private final boolean a;
    private final long b;
    private final long c;
    private final TimeUnit d;

    public TimeAnomalyException(long l, long l1, TimeUnit timeunit)
    {
        this(String.format("Invalid interval [%d:%d] (%s)", new Object[] {
            Long.valueOf(l), Long.valueOf(l1), timeunit
        }), false, l, l1, timeunit);
    }

    public TimeAnomalyException(long l, TimeUnit timeunit)
    {
        this(String.format("Invalid duration %d (%s)", new Object[] {
            Long.valueOf(l), timeunit
        }), true, -l, 0L, timeunit);
    }

    private TimeAnomalyException(String s, boolean flag, long l, long l1, TimeUnit timeunit)
    {
        super(s);
        a = flag;
        b = l;
        c = l1;
        d = timeunit;
    }

    public final boolean a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final long c()
    {
        return c;
    }

    public final TimeUnit d()
    {
        return d;
    }
}
