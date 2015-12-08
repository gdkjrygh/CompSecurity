// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.util:
//            e

public final class g
    implements e
{

    private static g XI;

    public g()
    {
    }

    public static e jj()
    {
        com/google/android/gms/common/util/g;
        JVM INSTR monitorenter ;
        g g1;
        if (XI == null)
        {
            XI = new g();
        }
        g1 = XI;
        com/google/android/gms/common/util/g;
        JVM INSTR monitorexit ;
        return g1;
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
