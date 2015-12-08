// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


// Referenced classes of package com.google.api.client.util:
//            ExponentialBackOff, NanoClock, Preconditions

public static class nanoClock
{

    int initialIntervalMillis;
    int maxElapsedTimeMillis;
    int maxIntervalMillis;
    double multiplier;
    NanoClock nanoClock;
    double randomizationFactor;

    public ExponentialBackOff build()
    {
        return new ExponentialBackOff(this);
    }

    public final int getInitialIntervalMillis()
    {
        return initialIntervalMillis;
    }

    public final int getMaxElapsedTimeMillis()
    {
        return maxElapsedTimeMillis;
    }

    public final int getMaxIntervalMillis()
    {
        return maxIntervalMillis;
    }

    public final double getMultiplier()
    {
        return multiplier;
    }

    public final NanoClock getNanoClock()
    {
        return nanoClock;
    }

    public final double getRandomizationFactor()
    {
        return randomizationFactor;
    }

    public randomizationFactor setInitialIntervalMillis(int i)
    {
        initialIntervalMillis = i;
        return this;
    }

    public initialIntervalMillis setMaxElapsedTimeMillis(int i)
    {
        maxElapsedTimeMillis = i;
        return this;
    }

    public maxElapsedTimeMillis setMaxIntervalMillis(int i)
    {
        maxIntervalMillis = i;
        return this;
    }

    public maxIntervalMillis setMultiplier(double d)
    {
        multiplier = d;
        return this;
    }

    public multiplier setNanoClock(NanoClock nanoclock)
    {
        nanoClock = (NanoClock)Preconditions.checkNotNull(nanoclock);
        return this;
    }

    public nanoClock setRandomizationFactor(double d)
    {
        randomizationFactor = d;
        return this;
    }

    public ()
    {
        initialIntervalMillis = 500;
        randomizationFactor = 0.5D;
        multiplier = 1.5D;
        maxIntervalMillis = 60000;
        maxElapsedTimeMillis = 0xdbba0;
        nanoClock = NanoClock.SYSTEM;
    }
}
