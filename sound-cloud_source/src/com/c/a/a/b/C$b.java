// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.y;
import c.z;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            C, s, q, a

private final class <init>
    implements y
{

    static final boolean a;
    final C b;
    private final e c;
    private final e d;
    private final long e;
    private boolean f;
    private boolean g;

    private void a()
        throws IOException
    {
        C.c(b).c();
        for (; d.b == 0L && !g && !f && C.d(b) == null; com.c.a.a.b.C.e(b)) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        C.c(b).b();
        throw exception;
        C.c(b).b();
        return;
    }

    static boolean a(b b1)
    {
        return b1.g;
    }

    static boolean a(g g1, boolean flag)
    {
        g1.g = flag;
        return flag;
    }

    static boolean b(g g1)
    {
        return g1.f;
    }

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        C c1 = b;
        c1;
        JVM INSTR monitorenter ;
        a();
        if (f)
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_66;
        e1;
        c1;
        JVM INSTR monitorexit ;
        throw e1;
        if (C.d(b) != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(C.d(b)).toString());
        }
        if (d.b != 0L)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        c1;
        JVM INSTR monitorexit ;
        return -1L;
        l = d.a(e1, Math.min(l, d.b));
        e1 = b;
        e1.a = ((C) (e1)).a + l;
        if (b.a >= (long)(C.a(b).e.b() / 2))
        {
            C.a(b).a(C.b(b), b.a);
            b.a = 0L;
        }
        c1;
        JVM INSTR monitorexit ;
        synchronized (C.a(b))
        {
            s s1 = C.a(b);
            s1.c = s1.c + l;
            if (C.a(b).c >= (long)(C.a(b).e.b() / 2))
            {
                C.a(b).a(0, C.a(b).c);
                C.a(b).c = 0L;
            }
        }
        return l;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(h h1, long l)
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
        C c1 = b;
        c1;
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
        c1;
        JVM INSTR monitorexit ;
_L1:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        c1 = b;
        c1;
        JVM INSTR monitorenter ;
        flag1 = g;
        if (d.b + l1 > e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        h1.f(l1);
        b.b(com.c.a.a.b.a.h);
        return;
        h1;
        c1;
        JVM INSTR monitorexit ;
        throw h1;
        if (flag1)
        {
            h1.f(l1);
            return;
        }
        l = h1.a(c, l1);
        if (l != -1L) goto _L3; else goto _L2
_L2:
        throw new EOFException();
        h1;
        c1;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final void close()
        throws IOException
    {
        synchronized (b)
        {
            f = true;
            d.n();
            b.notifyAll();
        }
        C.f(b);
        return;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final z timeout()
    {
        return C.c(b);
    }

    static 
    {
        boolean flag;
        if (!com/c/a/a/b/C.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private ion(C c1, long l)
    {
        b = c1;
        super();
        c = new e();
        d = new e();
        e = l;
    }

    e(C c1, long l, byte byte0)
    {
        this(c1, l);
    }
}
