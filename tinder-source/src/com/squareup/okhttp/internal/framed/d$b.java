// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import okio.c;
import okio.e;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            d, c, m, ErrorCode

private final class <init>
    implements r
{

    static final boolean a;
    final d b;
    private final c c;
    private final c d;
    private final long e;
    private boolean f;
    private boolean g;

    static boolean a(<init> <init>1)
    {
        return <init>1.g;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.g = flag;
        return flag;
    }

    private void b()
        throws IOException
    {
        com.squareup.okhttp.internal.framed.d.c(b).r_();
        for (; d.b == 0L && !g && !f && com.squareup.okhttp.internal.framed.d.d(b) == null; com.squareup.okhttp.internal.framed.d.e(b)) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        com.squareup.okhttp.internal.framed.d.c(b).b();
        throw exception;
        com.squareup.okhttp.internal.framed.d.c(b).b();
        return;
    }

    static boolean b(b b1)
    {
        return b1.f;
    }

    public final long a(c c1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        d d1 = b;
        d1;
        JVM INSTR monitorenter ;
        b();
        if (f)
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_66;
        c1;
        d1;
        JVM INSTR monitorexit ;
        throw c1;
        if (com.squareup.okhttp.internal.framed.d.d(b) != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(com.squareup.okhttp.internal.framed.d.d(b)).toString());
        }
        if (d.b != 0L)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        d1;
        JVM INSTR monitorexit ;
        return -1L;
        l = d.a(c1, Math.min(l, d.b));
        c1 = b;
        c1.a = ((d) (c1)).a + l;
        if (b.a >= (long)(com.squareup.okhttp.internal.framed.d.a(b).e.b() / 2))
        {
            com.squareup.okhttp.internal.framed.d.a(b).a(com.squareup.okhttp.internal.framed.d.b(b), b.a);
            b.a = 0L;
        }
        d1;
        JVM INSTR monitorexit ;
        synchronized (com.squareup.okhttp.internal.framed.d.a(b))
        {
            com.squareup.okhttp.internal.framed.c c2 = com.squareup.okhttp.internal.framed.d.a(b);
            c2.c = c2.c + l;
            if (com.squareup.okhttp.internal.framed.d.a(b).c >= (long)(com.squareup.okhttp.internal.framed.d.a(b).e.b() / 2))
            {
                com.squareup.okhttp.internal.framed.d.a(b).a(0, com.squareup.okhttp.internal.framed.d.a(b).c);
                com.squareup.okhttp.internal.framed.d.a(b).c = 0L;
            }
        }
        return l;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(e e1, long l)
        throws IOException
    {
        long l1;
        l1 = l;
        if (!a)
        {
            l1 = l;
            if (Thread.holdsLock(b))
            {
                throw new AssertionError();
            }
        }
          goto _L1
_L3:
        l1 -= l;
        d d1 = b;
        d1;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (d.b == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d.a(c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        b.notifyAll();
        d1;
        JVM INSTR monitorexit ;
_L1:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        d1 = b;
        d1;
        JVM INSTR monitorenter ;
        flag1 = g;
        if (d.b + l1 > e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        e1.f(l1);
        b.b(ErrorCode.h);
        return;
        e1;
        d1;
        JVM INSTR monitorexit ;
        throw e1;
        if (flag1)
        {
            e1.f(l1);
            return;
        }
        l = e1.a(c, l1);
        if (l != -1L) goto _L3; else goto _L2
_L2:
        throw new EOFException();
        e1;
        d1;
        JVM INSTR monitorexit ;
        throw e1;
    }

    public final void close()
        throws IOException
    {
        synchronized (b)
        {
            f = true;
            d.r();
            b.notifyAll();
        }
        com.squareup.okhttp.internal.framed.d.f(b);
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final s q_()
    {
        return com.squareup.okhttp.internal.framed.d.c(b);
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

    private rCode(d d1, long l)
    {
        b = d1;
        super();
        c = new c();
        d = new c();
        e = l;
    }

    e(d d1, long l, byte byte0)
    {
        this(d1, l);
    }
}
