// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import okio.e;
import okio.q;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, m, ErrorCode

public final class d
{
    final class a
        implements q
    {

        static final boolean a;
        final d b;
        private final okio.c c = new okio.c();
        private boolean d;
        private boolean e;

        private void a(boolean flag)
            throws IOException
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            d.g(b).r_();
            for (; b.b <= 0L && !e && !d && d.d(b) == null; com.squareup.okhttp.internal.framed.d.e(b)) { }
            break MISSING_BLOCK_LABEL_81;
            Exception exception1;
            exception1;
            d.g(b).b();
            throw exception1;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            long l1;
            d.g(b).b();
            d.h(b);
            l1 = Math.min(b.b, c.b);
            d d1 = b;
            d1.b = d1.b - l1;
            obj;
            JVM INSTR monitorexit ;
            d.g(b).r_();
            int i1;
            obj = d.a(b);
            i1 = d.b(b);
            if (!flag) goto _L2; else goto _L1
_L1:
            if (l1 != c.b) goto _L2; else goto _L3
_L3:
            flag = true;
_L5:
            ((com.squareup.okhttp.internal.framed.c) (obj)).a(i1, flag, c, l1);
            d.g(b).b();
            return;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            d.g(b).b();
            throw exception;
        }

        static boolean a(a a1)
        {
            return a1.e;
        }

        static boolean a(a a1, boolean flag)
        {
            a1.e = flag;
            return flag;
        }

        static boolean b(a a1)
        {
            return a1.d;
        }

        public final void a_(okio.c c1, long l1)
            throws IOException
        {
            if (!a && Thread.holdsLock(b))
            {
                throw new AssertionError();
            }
            c.a_(c1, l1);
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
                    d.a(b).a(d.b(b), true, null, 0L);
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
            d.a(b).c();
            d.f(b);
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
                d.h(b);
            }
            while (c.b > 0L) 
            {
                a(false);
                d.a(b).c();
            }
            break MISSING_BLOCK_LABEL_75;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final s q_()
        {
            return d.g(b);
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

        a()
        {
            b = d.this;
            super();
        }
    }

    private final class b
        implements r
    {

        static final boolean a;
        final d b;
        private final okio.c c;
        private final okio.c d;
        private final long e;
        private boolean f;
        private boolean g;

        static boolean a(b b1)
        {
            return b1.g;
        }

        static boolean a(b b1, boolean flag)
        {
            b1.g = flag;
            return flag;
        }

        private void b()
            throws IOException
        {
            d.c(b).r_();
            for (; d.b == 0L && !g && !f && d.d(b) == null; com.squareup.okhttp.internal.framed.d.e(b)) { }
            break MISSING_BLOCK_LABEL_69;
            Exception exception;
            exception;
            d.c(b).b();
            throw exception;
            d.c(b).b();
            return;
        }

        static boolean b(b b1)
        {
            return b1.f;
        }

        public final long a(okio.c c1, long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
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
            if (d.d(b) != null)
            {
                throw new IOException((new StringBuilder("stream was reset: ")).append(d.d(b)).toString());
            }
            if (d.b != 0L)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            d1;
            JVM INSTR monitorexit ;
            return -1L;
            l1 = d.a(c1, Math.min(l1, d.b));
            c1 = b;
            c1.a = ((d) (c1)).a + l1;
            if (b.a >= (long)(d.a(b).e.b() / 2))
            {
                d.a(b).a(d.b(b), b.a);
                b.a = 0L;
            }
            d1;
            JVM INSTR monitorexit ;
            synchronized (d.a(b))
            {
                com.squareup.okhttp.internal.framed.c c2 = d.a(b);
                c2.c = c2.c + l1;
                if (d.a(b).c >= (long)(d.a(b).e.b() / 2))
                {
                    d.a(b).a(0, d.a(b).c);
                    d.a(b).c = 0L;
                }
            }
            return l1;
            exception;
            c1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final void a(e e1, long l1)
            throws IOException
        {
            long l2;
            l2 = l1;
            if (!a)
            {
                l2 = l1;
                if (Thread.holdsLock(b))
                {
                    throw new AssertionError();
                }
            }
              goto _L1
_L3:
            l2 -= l1;
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
            if (l2 <= 0L)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            d1 = b;
            d1;
            JVM INSTR monitorenter ;
            flag1 = g;
            if (d.b + l2 > e)
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
            e1.f(l2);
            b.b(ErrorCode.h);
            return;
            e1;
            d1;
            JVM INSTR monitorexit ;
            throw e1;
            if (flag1)
            {
                e1.f(l2);
                return;
            }
            l1 = e1.a(c, l2);
            if (l1 != -1L) goto _L3; else goto _L2
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
            d.f(b);
            return;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final s q_()
        {
            return d.c(b);
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

        private b(long l1)
        {
            b = d.this;
            super();
            c = new okio.c();
            d = new okio.c();
            e = l1;
        }

        b(long l1, byte byte0)
        {
            this(l1);
        }
    }

    final class c extends okio.a
    {

        final d a;

        protected final IOException a(IOException ioexception)
        {
            SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
            if (ioexception != null)
            {
                sockettimeoutexception.initCause(ioexception);
            }
            return sockettimeoutexception;
        }

        protected final void a()
        {
            a.b(ErrorCode.l);
        }

        public final void b()
            throws IOException
        {
            if (s_())
            {
                throw a(null);
            } else
            {
                return;
            }
        }

        c()
        {
            a = d.this;
            super();
        }
    }


    static final boolean i;
    long a;
    long b;
    final int c;
    final com.squareup.okhttp.internal.framed.c d;
    List e;
    public final b f;
    final a g;
    public final c h = new c();
    private final List j;
    private final c k = new c();
    private ErrorCode l;

    d(int i1, com.squareup.okhttp.internal.framed.c c1, boolean flag, boolean flag1, List list)
    {
        a = 0L;
        l = null;
        if (c1 == null)
        {
            throw new NullPointerException("connection == null");
        }
        if (list == null)
        {
            throw new NullPointerException("requestHeaders == null");
        } else
        {
            c = i1;
            d = c1;
            b = c1.f.b();
            f = new b(c1.e.b(), (byte)0);
            g = new a();
            b.a(f, flag1);
            a.a(g, flag);
            j = list;
            return;
        }
    }

    static com.squareup.okhttp.internal.framed.c a(d d1)
    {
        return d1.d;
    }

    static int b(d d1)
    {
        return d1.c;
    }

    static c c(d d1)
    {
        return d1.h;
    }

    static ErrorCode d(d d1)
    {
        return d1.l;
    }

    private boolean d(ErrorCode errorcode)
    {
        if (!i && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!b.a(f) || !a.a(g))
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
        l = errorcode;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        d.b(c);
        return true;
    }

    static void e(d d1)
        throws InterruptedIOException
    {
        d1.f();
    }

    private void f()
        throws InterruptedIOException
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

    static void f(d d1)
        throws IOException
    {
        if (!i && Thread.holdsLock(d1))
        {
            throw new AssertionError();
        }
        d1;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (b.a(d1.f) || !b.b(d1.f) || !a.a(d1.g) && !a.b(d1.g))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        flag1 = d1.a();
        d1;
        JVM INSTR monitorexit ;
        Exception exception;
        if (flag)
        {
            d1.a(ErrorCode.l);
        } else
        if (!flag1)
        {
            d1.d.b(d1.c);
            return;
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static c g(d d1)
    {
        return d1.k;
    }

    static void h(d d1)
        throws IOException
    {
        if (a.b(d1.g))
        {
            throw new IOException("stream closed");
        }
        if (a.a(d1.g))
        {
            throw new IOException("stream finished");
        }
        if (d1.l != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(d1.l).toString());
        } else
        {
            return;
        }
    }

    final void a(long l1)
    {
        b = b + l1;
        if (l1 > 0L)
        {
            notifyAll();
        }
    }

    public final void a(ErrorCode errorcode)
        throws IOException
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
        Object obj = l;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!b.a(f) && !b.b(f) || !a.a(g) && !a.b(g))
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
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        h.r_();
        while (e == null && l == null) 
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
        throw new IOException((new StringBuilder("stream was reset: ")).append(l).toString());
    }

    final void c(ErrorCode errorcode)
    {
        this;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = errorcode;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        errorcode;
        throw errorcode;
    }

    public final q d()
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
        b.a(f, true);
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
        if (!com/squareup/okhttp/internal/framed/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }
}
