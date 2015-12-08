// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.mopub.common.util:
//            d

public class Timer
{

    private long a;
    private long b;
    private int c;

    public Timer()
    {
        c = d.STOPPED$28ed30e0;
    }

    public long getTime()
    {
        long l;
        if (c == d.STARTED$28ed30e0)
        {
            l = System.nanoTime();
        } else
        {
            l = a;
        }
        return TimeUnit.MILLISECONDS.convert(l - b, TimeUnit.NANOSECONDS);
    }

    public void start()
    {
        b = System.nanoTime();
        c = d.STARTED$28ed30e0;
    }

    public void stop()
    {
        if (c != d.STARTED$28ed30e0)
        {
            throw new IllegalStateException("EventTimer was not started.");
        } else
        {
            c = d.STOPPED$28ed30e0;
            a = System.nanoTime();
            return;
        }
    }
}
