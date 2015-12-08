// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;

// Referenced classes of package com.google.api.client.util:
//            BackOff, Preconditions, NanoClock

public class ExponentialBackOff
    implements BackOff
{
    public static class Builder
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

        public Builder setInitialIntervalMillis(int i)
        {
            initialIntervalMillis = i;
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i)
        {
            maxElapsedTimeMillis = i;
            return this;
        }

        public Builder setMaxIntervalMillis(int i)
        {
            maxIntervalMillis = i;
            return this;
        }

        public Builder setMultiplier(double d)
        {
            multiplier = d;
            return this;
        }

        public Builder setNanoClock(NanoClock nanoclock)
        {
            nanoClock = (NanoClock)Preconditions.checkNotNull(nanoclock);
            return this;
        }

        public Builder setRandomizationFactor(double d)
        {
            randomizationFactor = d;
            return this;
        }

        public Builder()
        {
            initialIntervalMillis = 500;
            randomizationFactor = 0.5D;
            multiplier = 1.5D;
            maxIntervalMillis = 60000;
            maxElapsedTimeMillis = 0xdbba0;
            nanoClock = NanoClock.SYSTEM;
        }
    }


    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 0xdbba0;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5D;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5D;
    private int currentIntervalMillis;
    private final int initialIntervalMillis;
    private final int maxElapsedTimeMillis;
    private final int maxIntervalMillis;
    private final double multiplier;
    private final NanoClock nanoClock;
    private final double randomizationFactor;
    long startTimeNanos;

    public ExponentialBackOff()
    {
        this(new Builder());
    }

    protected ExponentialBackOff(Builder builder)
    {
        boolean flag1 = true;
        super();
        initialIntervalMillis = builder.initialIntervalMillis;
        randomizationFactor = builder.randomizationFactor;
        multiplier = builder.multiplier;
        maxIntervalMillis = builder.maxIntervalMillis;
        maxElapsedTimeMillis = builder.maxElapsedTimeMillis;
        nanoClock = builder.nanoClock;
        boolean flag;
        if (initialIntervalMillis > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (0.0D <= randomizationFactor && randomizationFactor < 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (multiplier >= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (maxIntervalMillis >= initialIntervalMillis)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (maxElapsedTimeMillis > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        reset();
    }

    static int getRandomValueFromInterval(double d, double d1, int i)
    {
        d *= i;
        double d2 = (double)i - d;
        return (int)(((((double)i + d) - d2) + 1.0D) * d1 + d2);
    }

    private void incrementCurrentInterval()
    {
        if ((double)currentIntervalMillis >= (double)maxIntervalMillis / multiplier)
        {
            currentIntervalMillis = maxIntervalMillis;
            return;
        } else
        {
            currentIntervalMillis = (int)((double)currentIntervalMillis * multiplier);
            return;
        }
    }

    public final int getCurrentIntervalMillis()
    {
        return currentIntervalMillis;
    }

    public final long getElapsedTimeMillis()
    {
        return (nanoClock.nanoTime() - startTimeNanos) / 0xf4240L;
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

    public final double getRandomizationFactor()
    {
        return randomizationFactor;
    }

    public long nextBackOffMillis()
        throws IOException
    {
        if (getElapsedTimeMillis() > (long)maxElapsedTimeMillis)
        {
            return -1L;
        } else
        {
            int i = getRandomValueFromInterval(randomizationFactor, Math.random(), currentIntervalMillis);
            incrementCurrentInterval();
            return (long)i;
        }
    }

    public final void reset()
    {
        currentIntervalMillis = initialIntervalMillis;
        startTimeNanos = nanoClock.nanoTime();
    }
}
