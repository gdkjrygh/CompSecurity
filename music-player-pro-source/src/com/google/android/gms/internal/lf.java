// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ld

public final class lf
    implements ld
{

    private static lf Of;

    public lf()
    {
    }

    public static ld _mthif()
    {
        com/google/android/gms/internal/lf;
        JVM INSTR monitorenter ;
        lf lf1;
        if (Of == null)
        {
            Of = new lf();
        }
        lf1 = Of;
        com/google/android/gms/internal/lf;
        JVM INSTR monitorexit ;
        return lf1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime()
    {
        return SystemClock.elapsedRealtime();
    }
}
