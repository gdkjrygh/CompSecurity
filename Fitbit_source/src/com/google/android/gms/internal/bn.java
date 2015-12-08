// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            bl

public final class bn
    implements bl
{

    private static bn a;

    public bn()
    {
    }

    public static bl c()
    {
        com/google/android/gms/internal/bn;
        JVM INSTR monitorenter ;
        bn bn1;
        if (a == null)
        {
            a = new bn();
        }
        bn1 = a;
        com/google/android/gms/internal/bn;
        JVM INSTR monitorexit ;
        return bn1;
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
