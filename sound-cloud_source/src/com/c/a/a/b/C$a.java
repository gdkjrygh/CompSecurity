// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.x;
import c.z;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            C, s

final class 
    implements x
{

    static final boolean a;
    final C b;
    private final e c = new e();
    private boolean d;
    private boolean e;

    private void a(boolean flag)
        throws IOException
    {
        C c1 = b;
        c1;
        JVM INSTR monitorenter ;
        C.g(b).c();
        for (; b.b <= 0L && !e && !d && C.d(b) == null; com.c.a.a.b.C.e(b)) { }
        break MISSING_BLOCK_LABEL_81;
        Exception exception;
        exception;
        C.g(b).b();
        throw exception;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
        long l;
        C.g(b).b();
        C.h(b);
        l = Math.min(b.b, c.b);
        C c2 = b;
        c2.b = c2.b - l;
        c1;
        JVM INSTR monitorexit ;
        s s1 = C.a(b);
        int i = C.b(b);
        if (flag && l == c.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1.a(i, flag, c, l);
        return;
    }

    static boolean a(c c1)
    {
        return c1.e;
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
        c1;
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
                C.a(b).a(C.b(b), true, null, 0L);
            }
        }
        break MISSING_BLOCK_LABEL_113;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (b)
        {
            d = true;
        }
        C.a(b).c();
        C.f(b);
        return;
        exception1;
        c2;
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
            C.h(b);
        }
        while (c.b > 0L) 
        {
            a(false);
        }
        break MISSING_BLOCK_LABEL_65;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
        C.a(b).c();
        return;
    }

    public final z timeout()
    {
        return C.g(b);
    }

    public final void write(e e1, long l)
        throws IOException
    {
        if (!a && Thread.holdsLock(b))
        {
            throw new AssertionError();
        }
        c.write(e1, l);
        while (c.b >= 16384L) 
        {
            a(false);
        }
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

    ion(C c1)
    {
        b = c1;
        super();
    }
}
