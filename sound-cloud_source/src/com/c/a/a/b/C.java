// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.x;
import c.y;
import c.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

// Referenced classes of package com.c.a.a.b:
//            s, q, a

public final class C
{
    final class a
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
            long l1;
            C.g(b).b();
            com.c.a.a.b.C.h(b);
            l1 = Math.min(b.b, c.b);
            C c2 = b;
            c2.b = c2.b - l1;
            c1;
            JVM INSTR monitorexit ;
            s s1 = C.a(b);
            int i1 = C.b(b);
            if (flag && l1 == c.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1.a(i1, flag, c, l1);
            return;
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
                com.c.a.a.b.C.h(b);
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

        public final void write(e e1, long l1)
            throws IOException
        {
            if (!a && Thread.holdsLock(b))
            {
                throw new AssertionError();
            }
            c.write(e1, l1);
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

        a()
        {
            b = C.this;
            super();
        }
    }

    private final class b
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

        static boolean a(b b1, boolean flag)
        {
            b1.g = flag;
            return flag;
        }

        static boolean b(b b1)
        {
            return b1.f;
        }

        public final long a(e e1, long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
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
            l1 = d.a(e1, Math.min(l1, d.b));
            e1 = b;
            e1.a = ((C) (e1)).a + l1;
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
                s1.c = s1.c + l1;
                if (C.a(b).c >= (long)(C.a(b).e.b() / 2))
                {
                    C.a(b).a(0, C.a(b).c);
                    C.a(b).c = 0L;
                }
            }
            return l1;
            exception;
            e1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final void a(h h1, long l1)
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
            if (l2 <= 0L)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            c1 = b;
            c1;
            JVM INSTR monitorenter ;
            flag1 = g;
            if (d.b + l2 > e)
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
            h1.f(l2);
            b.b(com.c.a.a.b.a.h);
            return;
            h1;
            c1;
            JVM INSTR monitorexit ;
            throw h1;
            if (flag1)
            {
                h1.f(l2);
                return;
            }
            l1 = h1.a(c, l2);
            if (l1 != -1L) goto _L3; else goto _L2
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

        private b(long l1)
        {
            b = C.this;
            super();
            c = new e();
            d = new e();
            e = l1;
        }

        b(long l1, byte byte0)
        {
            this(l1);
        }
    }

    final class c extends c.a
    {

        final C a;

        protected final void a()
        {
            a.b(com.c.a.a.b.a.l);
        }

        public final void b()
            throws InterruptedIOException
        {
            if (d())
            {
                throw new InterruptedIOException("timeout");
            } else
            {
                return;
            }
        }

        c()
        {
            a = C.this;
            super();
        }
    }


    static final boolean i;
    long a;
    long b;
    final int c;
    final s d;
    List e;
    public final b f;
    final a g;
    public final c h = new c();
    private final List j;
    private final c k = new c();
    private com.c.a.a.b.a l;

    C(int i1, s s1, boolean flag, boolean flag1, List list)
    {
        a = 0L;
        l = null;
        if (s1 == null)
        {
            throw new NullPointerException("connection == null");
        }
        if (list == null)
        {
            throw new NullPointerException("requestHeaders == null");
        } else
        {
            c = i1;
            d = s1;
            b = s1.f.b();
            f = new b(s1.e.b(), (byte)0);
            g = new a();
            b.a(f, flag1);
            a.a(g, flag);
            j = list;
            return;
        }
    }

    static s a(C c1)
    {
        return c1.d;
    }

    static int b(C c1)
    {
        return c1.c;
    }

    static c c(C c1)
    {
        return c1.h;
    }

    static com.c.a.a.b.a d(C c1)
    {
        return c1.l;
    }

    private boolean d(com.c.a.a.b.a a1)
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
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        l = a1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        d.b(c);
        return true;
    }

    static void e(C c1)
        throws InterruptedIOException
    {
        c1.f();
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

    static void f(C c1)
        throws IOException
    {
        if (!i && Thread.holdsLock(c1))
        {
            throw new AssertionError();
        }
        c1;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (b.a(c1.f) || !b.b(c1.f) || !a.a(c1.g) && !a.b(c1.g))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        flag1 = c1.a();
        c1;
        JVM INSTR monitorexit ;
        Exception exception;
        if (flag)
        {
            c1.a(com.c.a.a.b.a.l);
        } else
        if (!flag1)
        {
            c1.d.b(c1.c);
            return;
        }
        return;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static c g(C c1)
    {
        return c1.k;
    }

    static void h(C c1)
        throws IOException
    {
        if (a.b(c1.g))
        {
            throw new IOException("stream closed");
        }
        if (a.a(c1.g))
        {
            throw new IOException("stream finished");
        }
        if (c1.l != null)
        {
            throw new IOException((new StringBuilder("stream was reset: ")).append(c1.l).toString());
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

    public final void a(com.c.a.a.b.a a1)
        throws IOException
    {
        if (!d(a1))
        {
            return;
        } else
        {
            d.b(c, a1);
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

    public final void b(com.c.a.a.b.a a1)
    {
        if (!d(a1))
        {
            return;
        } else
        {
            d.a(c, a1);
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
        h.c();
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

    final void c(com.c.a.a.b.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = a1;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final x d()
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
        if (!com/c/a/a/b/C.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }
}
