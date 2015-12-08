// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class UnauthorisedRequestRegistry
{

    private static final long NO_OBSERVED_TIME = 0L;
    private static final String TAG = "RequestRegistry";
    private static final long TIME_LIMIT_IN_MILLISECONDS;
    private static UnauthorisedRequestRegistry instance;
    private final Context context;
    private final AtomicLong lastObservedTime;

    protected UnauthorisedRequestRegistry(Context context1, AtomicLong atomiclong)
    {
        context = context1.getApplicationContext();
        lastObservedTime = atomiclong;
    }

    public static UnauthorisedRequestRegistry getInstance(Context context1)
    {
        com/soundcloud/android/api/UnauthorisedRequestRegistry;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new UnauthorisedRequestRegistry(context1, new AtomicLong(0L));
        }
        context1 = instance;
        com/soundcloud/android/api/UnauthorisedRequestRegistry;
        JVM INSTR monitorexit ;
        return context1;
        context1;
        throw context1;
    }

    public void clearObservedUnauthorisedRequestTimestamp()
    {
        lastObservedTime.set(0L);
    }

    long getLastObservedTime()
    {
        return lastObservedTime.get();
    }

    public Boolean timeSinceFirstUnauthorisedRequestIsBeyondLimit()
    {
        boolean flag = false;
        long l = lastObservedTime.get();
        if (l == 0L)
        {
            return Boolean.valueOf(false);
        }
        if (System.currentTimeMillis() - l >= TIME_LIMIT_IN_MILLISECONDS)
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    public void updateObservedUnauthorisedRequestTimestamp()
    {
        lastObservedTime.compareAndSet(0L, System.currentTimeMillis());
        context.sendBroadcast(new Intent(com.soundcloud.android.Consts.GeneralIntents.UNAUTHORIZED));
    }

    static 
    {
        TIME_LIMIT_IN_MILLISECONDS = TimeUnit.SECONDS.toMillis(5L);
    }
}
