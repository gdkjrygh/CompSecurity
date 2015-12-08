// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

public final class zzhv
    implements zzht
{

    private static zzhv zzVC;

    public zzhv()
    {
    }

    public static zzht zznd()
    {
        com/google/android/gms/internal/zzhv;
        JVM INSTR monitorenter ;
        zzhv zzhv1;
        if (zzVC == null)
        {
            zzVC = new zzhv();
        }
        zzhv1 = zzVC;
        com/google/android/gms/internal/zzhv;
        JVM INSTR monitorexit ;
        return zzhv1;
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
