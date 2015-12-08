// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            wg

public final class wh
    implements wg
{

    private static wh a;

    public wh()
    {
    }

    public static wg d()
    {
        com/google/android/gms/internal/wh;
        JVM INSTR monitorenter ;
        wh wh1;
        if (a == null)
        {
            a = new wh();
        }
        wh1 = a;
        com/google/android/gms/internal/wh;
        JVM INSTR monitorexit ;
        return wh1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long a()
    {
        return System.currentTimeMillis();
    }

    public final long b()
    {
        return SystemClock.elapsedRealtime();
    }

    public final long c()
    {
        return System.nanoTime();
    }
}
