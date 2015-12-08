// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.d:
//            q

public final class r
    implements q
{

    private static r a;

    public r()
    {
    }

    public static q c()
    {
        com/google/android/gms/d/r;
        JVM INSTR monitorenter ;
        r r1;
        if (a == null)
        {
            a = new r();
        }
        r1 = a;
        com/google/android/gms/d/r;
        JVM INSTR monitorexit ;
        return r1;
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
