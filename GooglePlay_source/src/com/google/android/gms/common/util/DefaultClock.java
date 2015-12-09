// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.util:
//            Clock

public final class DefaultClock
    implements Clock
{

    private static DefaultClock sInstance;

    public DefaultClock()
    {
    }

    public static Clock getInstance()
    {
        com/google/android/gms/common/util/DefaultClock;
        JVM INSTR monitorenter ;
        DefaultClock defaultclock;
        if (sInstance == null)
        {
            sInstance = new DefaultClock();
        }
        defaultclock = sInstance;
        com/google/android/gms/common/util/DefaultClock;
        JVM INSTR monitorexit ;
        return defaultclock;
        Exception exception;
        exception;
        throw exception;
    }

    public final long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime()
    {
        return SystemClock.elapsedRealtime();
    }
}
