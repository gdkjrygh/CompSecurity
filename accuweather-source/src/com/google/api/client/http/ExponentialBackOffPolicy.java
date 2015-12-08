// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.NanoClock;
import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            BackOffPolicy

public class ExponentialBackOffPolicy
    implements BackOffPolicy
{
    public static class Builder
    {

        final com.google.api.client.util.ExponentialBackOff.Builder exponentialBackOffBuilder = new com.google.api.client.util.ExponentialBackOff.Builder();

        public ExponentialBackOffPolicy build()
        {
            return new ExponentialBackOffPolicy(this);
        }

        public final int getInitialIntervalMillis()
        {
            return exponentialBackOffBuilder.getInitialIntervalMillis();
        }

        public final int getMaxElapsedTimeMillis()
        {
            return exponentialBackOffBuilder.getMaxElapsedTimeMillis();
        }

        public final int getMaxIntervalMillis()
        {
            return exponentialBackOffBuilder.getMaxIntervalMillis();
        }

        public final double getMultiplier()
        {
            return exponentialBackOffBuilder.getMultiplier();
        }

        public final NanoClock getNanoClock()
        {
            return exponentialBackOffBuilder.getNanoClock();
        }

        public final double getRandomizationFactor()
        {
            return exponentialBackOffBuilder.getRandomizationFactor();
        }

        public Builder setInitialIntervalMillis(int i)
        {
            exponentialBackOffBuilder.setInitialIntervalMillis(i);
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i)
        {
            exponentialBackOffBuilder.setMaxElapsedTimeMillis(i);
            return this;
        }

        public Builder setMaxIntervalMillis(int i)
        {
            exponentialBackOffBuilder.setMaxIntervalMillis(i);
            return this;
        }

        public Builder setMultiplier(double d)
        {
            exponentialBackOffBuilder.setMultiplier(d);
            return this;
        }

        public Builder setNanoClock(NanoClock nanoclock)
        {
            exponentialBackOffBuilder.setNanoClock(nanoclock);
            return this;
        }

        public Builder setRandomizationFactor(double d)
        {
            exponentialBackOffBuilder.setRandomizationFactor(d);
            return this;
        }

        protected Builder()
        {
        }
    }


    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 0xdbba0;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5D;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5D;
    private final ExponentialBackOff exponentialBackOff;

    public ExponentialBackOffPolicy()
    {
        this(new Builder());
    }

    protected ExponentialBackOffPolicy(Builder builder1)
    {
        exponentialBackOff = builder1.exponentialBackOffBuilder.build();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public final int getCurrentIntervalMillis()
    {
        return exponentialBackOff.getCurrentIntervalMillis();
    }

    public final long getElapsedTimeMillis()
    {
        return exponentialBackOff.getElapsedTimeMillis();
    }

    public final int getInitialIntervalMillis()
    {
        return exponentialBackOff.getInitialIntervalMillis();
    }

    public final int getMaxElapsedTimeMillis()
    {
        return exponentialBackOff.getMaxElapsedTimeMillis();
    }

    public final int getMaxIntervalMillis()
    {
        return exponentialBackOff.getMaxIntervalMillis();
    }

    public final double getMultiplier()
    {
        return exponentialBackOff.getMultiplier();
    }

    public long getNextBackOffMillis()
        throws IOException
    {
        return exponentialBackOff.nextBackOffMillis();
    }

    public final double getRandomizationFactor()
    {
        return exponentialBackOff.getRandomizationFactor();
    }

    public boolean isBackOffRequired(int i)
    {
        switch (i)
        {
        case 501: 
        case 502: 
        default:
            return false;

        case 500: 
        case 503: 
            return true;
        }
    }

    public final void reset()
    {
        exponentialBackOff.reset();
    }
}
