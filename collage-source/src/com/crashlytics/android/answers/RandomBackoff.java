// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.b;
import java.util.Random;

class RandomBackoff
    implements b
{

    final b backoff;
    final double jitterPercent;
    final Random random;

    public RandomBackoff(b b1, double d)
    {
        this(b1, d, new Random());
    }

    public RandomBackoff(b b1, double d, Random random1)
    {
        if (d < 0.0D || d > 1.0D)
        {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        }
        if (b1 == null)
        {
            throw new NullPointerException("backoff must not be null");
        }
        if (random1 == null)
        {
            throw new NullPointerException("random must not be null");
        } else
        {
            backoff = b1;
            jitterPercent = d;
            random = random1;
            return;
        }
    }

    public long getDelayMillis(int i)
    {
        return (long)(randomJitter() * (double)backoff.getDelayMillis(i));
    }

    double randomJitter()
    {
        double d = 1.0D - jitterPercent;
        return d + ((jitterPercent + 1.0D) - d) * random.nextDouble();
    }
}
