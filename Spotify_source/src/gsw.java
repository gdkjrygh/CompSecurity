// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

public final class gsw
{

    static final boolean i;
    long a;
    long b;
    final int c;
    final gst d;
    List e;
    public final gsy f;
    final gsx g;
    public final gsz h = new gsz(this);
    private final gsz j = new gsz(this);
    private ErrorCode k;

    gsw(int l, gst gst1, boolean flag, boolean flag1, List list)
    {
        a = 0L;
        k = null;
        if (gst1 == null)
        {
            throw new NullPointerException("connection == null");
        }
        if (list == null)
        {
            throw new NullPointerException("requestHeaders == null");
        } else
        {
            c = l;
            d = gst1;
            b = gst1.f.b();
            f = new gsy(this, gst1.e.b(), (byte)0);
            g = new gsx(this);
            gsy.a(f, flag1);
            gsx.a(g, flag);
            return;
        }
    }

    static gst a(gsw gsw1)
    {
        return gsw1.d;
    }

    static int b(gsw gsw1)
    {
        return gsw1.c;
    }

    static gsz c(gsw gsw1)
    {
        return gsw1.h;
    }

    static ErrorCode d(gsw gsw1)
    {
        return gsw1.k;
    }

    private boolean d(ErrorCode errorcode)
    {
        if (!i && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!gsy.a(f) || !gsx.a(g))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        k = errorcode;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        d.b(c);
        return true;
    }

    static void e(gsw gsw1)
    {
        gsw1.f();
    }

    private void f()
    {
        try
        {
            wait();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            throw new InterruptedIOException();
        }
    }

    static void f(gsw gsw1)
    {
        if (!i && Thread.holdsLock(gsw1))
        {
            throw new AssertionError();
        }
        gsw1;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (gsy.a(gsw1.f) || !gsy.b(gsw1.f) || !gsx.a(gsw1.g) && !gsx.b(gsw1.g))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        flag1 = gsw1.a();
        gsw1;
        JVM INSTR monitorexit ;
        Exception exception;
        if (flag)
        {
            gsw1.a(ErrorCode.h);
        } else
        if (!flag1)
        {
            gsw1.d.b(gsw1.c);
            return;
        }
        return;
        exception;
        gsw1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static gsz g(gsw gsw1)
    {
        return gsw1.j;
    }

    static void h(gsw gsw1)
    {
        if (gsx.b(gsw1.g))
        {
            throw new IOException("stream closed");
        }
        if (gsx.a(gsw1.g))
        {
            throw new IOException("stream finished");
        }
        if (gsw1.k != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(gsw1.k).toString());
        } else
        {
            return;
        }
    }

    final void a(long l)
    {
        b = b + l;
        if (l > 0L)
        {
            notifyAll();
        }
    }

    public final void a(ErrorCode errorcode)
    {
        if (!d(errorcode))
        {
            return;
        } else
        {
            d.b(c, errorcode);
            return;
        }
    }

    public final boolean a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = k;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!gsy.a(f) && !gsy.b(f) || !gsx.a(g) && !gsx.b(g))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj = e;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(ErrorCode errorcode)
    {
        if (!d(errorcode))
        {
            return;
        } else
        {
            d.a(c, errorcode);
            return;
        }
    }

    public final boolean b()
    {
        boolean flag;
        if ((c & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return d.b == flag;
    }

    public final List c()
    {
        this;
        JVM INSTR monitorenter ;
        h.U_();
        while (e == null && k == null) 
        {
            f();
        }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        h.b();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        List list;
        h.b();
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        list = e;
        this;
        JVM INSTR monitorexit ;
        return list;
        throw new IOException((new StringBuilder("stream was reset: ")).append(k).toString());
    }

    final void c(ErrorCode errorcode)
    {
        this;
        JVM INSTR monitorenter ;
        if (k == null)
        {
            k = errorcode;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        errorcode;
        throw errorcode;
    }

    public final hcv d()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null && !b())
        {
            throw new IllegalStateException("reply before requesting the sink");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return g;
    }

    final void e()
    {
        if (!i && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        gsy.a(f, true);
        flag = a();
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            d.b(c);
        }
        return;
        Exception exception;
        exception;
        this;
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
        i = flag;
    }
}
