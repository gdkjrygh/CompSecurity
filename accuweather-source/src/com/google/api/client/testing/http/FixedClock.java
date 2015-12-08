// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.util.Clock;
import java.util.concurrent.atomic.AtomicLong;

public class FixedClock
    implements Clock
{

    private AtomicLong currentTime;

    public FixedClock()
    {
        this(0L);
    }

    public FixedClock(long l)
    {
        currentTime = new AtomicLong(l);
    }

    public long currentTimeMillis()
    {
        return currentTime.get();
    }

    public FixedClock setTime(long l)
    {
        currentTime.set(l);
        return this;
    }
}
