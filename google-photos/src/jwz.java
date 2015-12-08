// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jwz
{

    public static final Object b = new Object();
    private static final jwx f = new jwx("RequestTracker");
    long a;
    private long c;
    private long d;
    private k e;

    public jwz(long l)
    {
        c = 0x5265c00L;
        a = -1L;
        d = 0L;
    }

    void a()
    {
        a = -1L;
        e = null;
        d = 0L;
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
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a == -1L || l < c)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        f.a("request %d timed out", new Object[] {
            Long.valueOf(a)
        });
        a();
_L2:
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

    public final boolean a(long l, int i, Object obj)
    {
        boolean flag = true;
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a == -1L || a != l)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        f.a("request %d completed", new Object[] {
            Long.valueOf(a)
        });
        a();
_L2:
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

}
