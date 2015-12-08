// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;


public final class RetryStrategy
{

    public static final RetryStrategy PRESET_EXPONENTIAL = new RetryStrategy(0);
    public static final RetryStrategy PRESET_LINEAR = new RetryStrategy(1);
    final int initialBackoffSeconds = 30;
    final int maximumBackoffSeconds = 3600;
    final int retryPolicy;

    private RetryStrategy(int i)
    {
        retryPolicy = i;
    }

}
