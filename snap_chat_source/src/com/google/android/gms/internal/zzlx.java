// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzlv

public final class zzlx
    implements zzlv
{

    private static zzlx zzRO;

    public zzlx()
    {
    }

    public static zzlv zzkc()
    {
        com/google/android/gms/internal/zzlx;
        JVM INSTR monitorenter ;
        zzlx zzlx1;
        if (zzRO == null)
        {
            zzRO = new zzlx();
        }
        zzlx1 = zzRO;
        com/google/android/gms/internal/zzlx;
        JVM INSTR monitorexit ;
        return zzlx1;
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
