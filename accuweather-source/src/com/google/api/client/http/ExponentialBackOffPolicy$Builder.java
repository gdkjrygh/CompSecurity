// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.NanoClock;

// Referenced classes of package com.google.api.client.http:
//            ExponentialBackOffPolicy

public static class A
{

    final com.google.api.client.util.domizationFactor exponentialBackOffBuilder = new com.google.api.client.util.();

    public ExponentialBackOffPolicy build()
    {
        return new ExponentialBackOffPolicy(this);
    }

    public final int getInitialIntervalMillis()
    {
        return exponentialBackOffBuilder.tialIntervalMillis();
    }

    public final int getMaxElapsedTimeMillis()
    {
        return exponentialBackOffBuilder.ElapsedTimeMillis();
    }

    public final int getMaxIntervalMillis()
    {
        return exponentialBackOffBuilder.IntervalMillis();
    }

    public final double getMultiplier()
    {
        return exponentialBackOffBuilder.tiplier();
    }

    public final NanoClock getNanoClock()
    {
        return exponentialBackOffBuilder.oClock();
    }

    public final double getRandomizationFactor()
    {
        return exponentialBackOffBuilder.domizationFactor();
    }

    public domizationFactor setInitialIntervalMillis(int i)
    {
        exponentialBackOffBuilder.tialIntervalMillis(i);
        return this;
    }

    public tialIntervalMillis setMaxElapsedTimeMillis(int i)
    {
        exponentialBackOffBuilder.ElapsedTimeMillis(i);
        return this;
    }

    public ElapsedTimeMillis setMaxIntervalMillis(int i)
    {
        exponentialBackOffBuilder.IntervalMillis(i);
        return this;
    }

    public IntervalMillis setMultiplier(double d)
    {
        exponentialBackOffBuilder.tiplier(d);
        return this;
    }

    public tiplier setNanoClock(NanoClock nanoclock)
    {
        exponentialBackOffBuilder.oClock(nanoclock);
        return this;
    }

    public oClock setRandomizationFactor(double d)
    {
        exponentialBackOffBuilder.domizationFactor(d);
        return this;
    }

    protected A()
    {
    }
}
