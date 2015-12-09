// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class cnq
    implements cnp
{

    private static cnq a;

    public cnq()
    {
    }

    public static cnp d()
    {
        cnq;
        JVM INSTR monitorenter ;
        cnq cnq1;
        if (a == null)
        {
            a = new cnq();
        }
        cnq1 = a;
        cnq;
        JVM INSTR monitorexit ;
        return cnq1;
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

    public final long c()
    {
        return System.nanoTime();
    }
}
