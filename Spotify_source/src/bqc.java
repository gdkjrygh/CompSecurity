// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class bqc
{

    public static final Object b = new Object();
    private static final bpy f = new bpy("RequestTracker", (byte)0);
    long a;
    private long c;
    private long d;
    private bqb e;

    public bqc()
    {
        c = 0x5265c00L;
        a = -1L;
        d = 0L;
    }

    final void a()
    {
        a = -1L;
        e = null;
        d = 0L;
    }

    public final void a(long l, bqb bqb1)
    {
        bqb bqb2;
        synchronized (b)
        {
            bqb2 = e;
            a = l;
            e = bqb1;
            d = SystemClock.elapsedRealtime();
        }
        if (bqb2 != null)
        {
            bqb2.a();
        }
        return;
        bqb1;
        obj;
        JVM INSTR monitorexit ;
        throw bqb1;
    }

    public final boolean a(long l)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (a != -1L && a == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(long l, int i)
    {
        bqb bqb1;
        boolean flag;
        flag = true;
        bqb1 = null;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a == -1L || a != l)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        f.a("request %d completed", new Object[] {
            Long.valueOf(a)
        });
        bqb1 = e;
        a();
_L2:
        if (bqb1 != null)
        {
            bqb1.a(i);
        }
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (a != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b(long l)
    {
        bqb bqb1;
        boolean flag;
        flag = true;
        bqb1 = null;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a == -1L || l - d < c)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        f.a("request %d timed out", new Object[] {
            Long.valueOf(a)
        });
        bqb1 = e;
        a();
_L2:
        if (bqb1 != null)
        {
            bqb1.a(2102);
        }
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
