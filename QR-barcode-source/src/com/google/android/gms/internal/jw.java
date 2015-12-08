// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ju

public final class jw
    implements ju
{

    private static jw MS;

    public jw()
    {
    }

    public static ju hA()
    {
        com/google/android/gms/internal/jw;
        JVM INSTR monitorenter ;
        jw jw1;
        if (MS == null)
        {
            MS = new jw();
        }
        jw1 = MS;
        com/google/android/gms/internal/jw;
        JVM INSTR monitorexit ;
        return jw1;
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
