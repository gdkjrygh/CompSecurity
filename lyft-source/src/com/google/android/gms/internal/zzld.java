// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzlb

public final class zzld
    implements zzlb
{

    private static zzld a;

    public zzld()
    {
    }

    public static zzlb c()
    {
        com/google/android/gms/internal/zzld;
        JVM INSTR monitorenter ;
        zzld zzld1;
        if (a == null)
        {
            a = new zzld();
        }
        zzld1 = a;
        com/google/android/gms/internal/zzld;
        JVM INSTR monitorexit ;
        return zzld1;
        Exception exception;
        exception;
        throw exception;
    }

    public long a()
    {
        return System.currentTimeMillis();
    }

    public long b()
    {
        return SystemClock.elapsedRealtime();
    }
}
