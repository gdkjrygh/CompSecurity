// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


// Referenced classes of package com.google.api.client.util:
//            ExponentialBackOff, NanoClock

public static final class nanoClock
{

    int initialIntervalMillis;
    int maxElapsedTimeMillis;
    int maxIntervalMillis;
    double multiplier;
    NanoClock nanoClock;
    double randomizationFactor;

    public final ExponentialBackOff build()
    {
        return new ExponentialBackOff(this);
    }

    public final nanoClock setInitialIntervalMillis(int i)
    {
        initialIntervalMillis = i;
        return this;
    }

    public final initialIntervalMillis setMaxElapsedTimeMillis(int i)
    {
        maxElapsedTimeMillis = i;
        return this;
    }

    public final maxElapsedTimeMillis setMaxIntervalMillis(int i)
    {
        maxIntervalMillis = i;
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
