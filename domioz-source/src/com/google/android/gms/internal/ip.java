// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            io

public final class ip
    implements io
{

    private static ip a;

    public ip()
    {
    }

    public static io c()
    {
        com/google/android/gms/internal/ip;
        JVM INSTR monitorenter ;
        ip ip1;
        if (a == null)
        {
            a = new ip();
        }
        ip1 = a;
        com/google/android/gms/internal/ip;
        JVM INSTR monitorexit ;
        return ip1;
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
}
