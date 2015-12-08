// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.EOFException;
import java.io.IOException;

final class gsy
    implements hcw
{

    private static boolean f;
    private final hch a;
    private final hch b;
    private final long c;
    private boolean d;
    private boolean e;
    private gsw g;

    private gsy(gsw gsw1, long l)
    {
        g = gsw1;
        super();
        a = new hch();
        b = new hch();
        c = l;
    }

    gsy(gsw gsw1, long l, byte byte0)
    {
        this(gsw1, l);
    }

    static boolean a(gsy gsy1)
    {
        return gsy1.e;
    }

    static boolean a(gsy gsy1, boolean flag)
    {
        gsy1.e = flag;
        return flag;
    }

    private void b()
    {
        gsw.c(g).U_();
        for (; b.b == 0L && !e && !d && gsw.d(g) == null; gsw.e(g)) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        gsw.c(g).b();
        throw exception;
        gsw.c(g).b();
        return;
    }

    static boolean b(gsy gsy1)
    {
        return gsy1.d;
    }

    public final hcx T_()
    {
        return gsw.c(g);
    }

    public final long a(hch hch1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        gsw gsw1 = g;
        gsw1;
        JVM INSTR monitorenter ;
        b();
        if (d)
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_66;
        hch1;
        gsw1;
        JVM INSTR monitorexit ;
        throw hch1;
        if (gsw.d(g) != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(gsw.d(g)).toString());
        }
        if (b.b != 0L)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        gsw1;
        JVM INSTR monitorexit ;
        return -1L;
        l = b.a(hch1, Math.min(l, b.b));
        hch1 = g;
        hch1.a = ((gsw) (hch1)).a + l;
        if (g.a >= (long)(gsw.a(g).e.b() / 2))
        {
            gsw.a(g).a(gsw.b(g), g.a);
            g.a = 0L;
        }
        gsw1;
        JVM INSTR monitorexit ;
        synchronized (gsw.a(g))
        {
            gst gst1 = gsw.a(g);
            gst1.c = gst1.c + l;
            if (gsw.a(g).c >= (long)(gsw.a(g).e.b() / 2))
            {
                gsw.a(g).a(0, gsw.a(g).c);
                gsw.a(g).c = 0L;
            }
        }
        return l;
        exception;
        hch1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(hcj hcj1, long l)
    {
        long l1;
        l1 = l;
        if (!f)
        {
            l1 = l;
            if (Thread.holdsLock(g))
            {
                throw new AssertionError();
            }
        }
          goto _L1
_L3:
        l1 -= l;
        gsw gsw1 = g;
        gsw1;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (b.b == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        g.notifyAll();
        gsw1;
        JVM INSTR monitorexit ;
_L1:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        gsw1 = g;
        gsw1;
        JVM INSTR monitorenter ;
        flag1 = e;
        if (b.b + l1 > c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gsw1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        hcj1.f(l1);
        g.b(ErrorCode.f);
        return;
        hcj1;
        gsw1;
        JVM INSTR monitorexit ;
        throw hcj1;
        if (flag1)
        {
            hcj1.f(l1);
            return;
        }
        l = hcj1.a(a, l1);
        if (l != -1L) goto _L3; else goto _L2
_L2:
        throw new EOFException();
        hcj1;
        gsw1;
        JVM INSTR monitorexit ;
        throw hcj1;
    }

    public final void close()
    {
        synchronized (g)
        {
            d = true;
            b.s();
            g.notifyAll();
        }
        gsw.f(g);
        return;
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
        f = flag;
    }
}
