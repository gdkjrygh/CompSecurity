// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ef

public final class eg
    implements ef
{

    private static eg a;

    public eg()
    {
    }

    public static ef c()
    {
        com/google/android/gms/internal/eg;
        JVM INSTR monitorenter ;
        eg eg1;
        if (a == null)
        {
            a = new eg();
        }
        eg1 = a;
        com/google/android/gms/internal/eg;
        JVM INSTR monitorexit ;
        return eg1;
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
