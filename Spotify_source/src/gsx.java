// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gsx
    implements hcv
{

    private static boolean d;
    private final hch a = new hch();
    private boolean b;
    private boolean c;
    private gsw e;

    gsx(gsw gsw1)
    {
        e = gsw1;
        super();
    }

    private void a(boolean flag)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        gsw.g(e).U_();
        for (; e.b <= 0L && !c && !b && gsw.d(e) == null; gsw.e(e)) { }
        break MISSING_BLOCK_LABEL_81;
        Exception exception1;
        exception1;
        gsw.g(e).b();
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        long l;
        gsw.g(e).b();
        gsw.h(e);
        l = Math.min(e.b, a.b);
        gsw gsw1 = e;
        gsw1.b = gsw1.b - l;
        obj;
        JVM INSTR monitorexit ;
        gsw.g(e).U_();
        int i;
        obj = gsw.a(e);
        i = gsw.b(e);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l != a.b) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        ((gst) (obj)).a(i, flag, a, l);
        gsw.g(e).b();
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        gsw.g(e).b();
        throw exception;
    }

    static boolean a(gsx gsx1)
    {
        return gsx1.c;
    }

    static boolean a(gsx gsx1, boolean flag)
    {
        gsx1.c = flag;
        return flag;
    }

    static boolean b(gsx gsx1)
    {
        return gsx1.b;
    }

    public final hcx T_()
    {
        return gsw.g(e);
    }

    public final void a_(hch hch1, long l)
    {
        if (!d && Thread.holdsLock(e))
        {
            throw new AssertionError();
        }
        a.a_(hch1, l);
        while (a.b >= 16384L) 
        {
            a(false);
        }
    }

    public final void close()
    {
label0:
        {
            if (!d && Thread.holdsLock(e))
            {
                throw new AssertionError();
            }
            synchronized (e)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        gsw1;
        JVM INSTR monitorexit ;
        if (!e.g.c)
        {
            if (a.b > 0L)
            {
                while (a.b > 0L) 
                {
                    a(true);
                }
            } else
            {
                gsw.a(e).a(gsw.b(e), true, null, 0L);
            }
        }
        break MISSING_BLOCK_LABEL_113;
        exception;
        gsw1;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (e)
        {
            b = true;
        }
        gsw.a(e).c();
        gsw.f(e);
        return;
        exception1;
        gsw2;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void flush()
    {
        if (!d && Thread.holdsLock(e))
        {
            throw new AssertionError();
        }
        synchronized (e)
        {
            gsw.h(e);
        }
        while (a.b > 0L) 
        {
            a(false);
            gsw.a(e).c();
        }
        break MISSING_BLOCK_LABEL_75;
        exception;
        gsw1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!gsw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
