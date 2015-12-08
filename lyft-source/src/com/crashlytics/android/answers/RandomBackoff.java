// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Random;

class RandomBackoff
    implements Backoff
{

    final Backoff a;
    final Random b;
    final double c;

    public RandomBackoff(Backoff backoff, double d)
    {
        this(backoff, d, new Random());
    }

    public RandomBackoff(Backoff backoff, double d, Random random)
    {
        if (d < 0.0D || d > 1.0D)
        {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        }
        if (backoff == null)
        {
            throw new NullPointerException("backoff must not be null");
        }
        if (random == null)
        {
            throw new NullPointerException("random must not be null");
        } else
        {
            a = backoff;
            c = d;
            b = random;
            return;
        }
    }

    double a()
    {
        double d = 1.0D - c;
        return d + ((c + 1.0D) - d) * b.nextDouble();
    }

    public long a(int i)
    {
        return (long)(a() * (double)a.a(i));
    }
}
