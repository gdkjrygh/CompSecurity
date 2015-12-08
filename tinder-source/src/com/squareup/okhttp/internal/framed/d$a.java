// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import okio.c;
import okio.q;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            d, c

final class b
    implements q
{

    static final boolean a;
    final d b;
    private final c c = new c();
    private boolean d;
    private boolean e;

    private void a(boolean flag)
        throws IOException
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        com.squareup.okhttp.internal.framed.d.g(b).r_();
        for (; b.b <= 0L && !e && !d && com.squareup.okhttp.internal.framed.d.d(b) == null; com.squareup.okhttp.internal.framed.d.e(b)) { }
        break MISSING_BLOCK_LABEL_81;
        Exception exception1;
        exception1;
        com.squareup.okhttp.internal.framed.d.g(b).b();
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        long l;
        com.squareup.okhttp.internal.framed.d.g(b).b();
        com.squareup.okhttp.internal.framed.d.h(b);
        l = Math.min(b.b, c.b);
        d d1 = b;
        d1.b = d1.b - l;
        obj;
        JVM INSTR monitorexit ;
        com.squareup.okhttp.internal.framed.d.g(b).r_();
        int i;
        obj = com.squareup.okhttp.internal.framed.d.a(b);
        i = com.squareup.okhttp.internal.framed.d.b(b);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l != c.b) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        ((com.squareup.okhttp.internal.framed.c) (obj)).a(i, flag, c, l);
        com.squareup.okhttp.internal.framed.d.g(b).b();
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        com.squareup.okhttp.internal.framed.d.g(b).b();
        throw exception;
    }

    static boolean a(b b1)
    {
        return b1.e;
    }

    static boolean a(e e1, boolean flag)
    {
        e1.e = flag;
        return flag;
    }

    static boolean b(e e1)
    {
        return e1.d;
    }

    public final void a_(c c1, long l)
        throws IOException
    {
        if (!a && Thread.holdsLock(b))
        {
            throw new AssertionError();
        }
        c.a_(c1, l);
        while (c.b >= 16384L) 
        {
            a(false);
        }
    }

    public final void close()
        throws IOException
    {
label0:
        {
            if (!a && Thread.holdsLock(b))
            {
                throw new AssertionError();
            }
            synchronized (b)
            {
                if (!d)
                {
                    break label0;
                }
            }
            return;
        }
        d1;
        JVM INSTR monitorexit ;
        if (!b.g.e)
        {
            if (c.b > 0L)
            {
                while (c.b > 0L) 
                {
                    a(true);
                }
            } else
            {
                com.squareup.okhttp.internal.framed.d.a(b).a(com.squareup.okhttp.internal.framed.d.b(b), true, null, 0L);
            }
        }
        break MISSING_BLOCK_LABEL_113;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (b)
        {
            d = true;
        }
        com.squareup.okhttp.internal.framed.d.a(b).c();
        com.squareup.okhttp.internal.framed.d.f(b);
        return;
        exception1;
        d2;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void flush()
        throws IOException
    {
        if (!a && Thread.holdsLock(b))
        {
            throw new AssertionError();
        }
        synchronized (b)
        {
            com.squareup.okhttp.internal.framed.d.h(b);
        }
        while (c.b > 0L) 
        {
            a(false);
            com.squareup.okhttp.internal.framed.d.a(b).c();
        }
        break MISSING_BLOCK_LABEL_75;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final s q_()
    {
        return com.squareup.okhttp.internal.framed.d.g(b);
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/framed/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    (d d1)
    {
        b = d1;
        super();
    }
}
