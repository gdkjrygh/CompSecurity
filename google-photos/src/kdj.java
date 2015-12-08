// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class kdj
    implements kdh
{

    private static kdj a;

    public kdj()
    {
    }

    public static kdh c()
    {
        kdj;
        JVM INSTR monitorenter ;
        kdj kdj1;
        if (a == null)
        {
            a = new kdj();
        }
        kdj1 = a;
        kdj;
        JVM INSTR monitorexit ;
        return kdj1;
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
