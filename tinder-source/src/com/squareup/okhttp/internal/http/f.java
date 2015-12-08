// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.j;
import com.squareup.okhttp.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import okio.d;
import okio.e;
import okio.i;
import okio.l;
import okio.q;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            p, k, h

public final class com.squareup.okhttp.internal.http.f
{
    private abstract class a
        implements r
    {

        protected final i a;
        protected boolean b;
        final com.squareup.okhttp.internal.http.f c;

        protected final void a(boolean flag)
            throws IOException
        {
            if (c.e != 5)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(c.e).toString());
            }
            com.squareup.okhttp.internal.http.f.a(a);
            c.e = 0;
            if (flag && c.f == 1)
            {
                c.f = 0;
                com.squareup.okhttp.internal.d.b.a(c.a, c.b);
            } else
            if (c.f == 2)
            {
                c.e = 6;
                c.b.c.close();
                return;
            }
        }

        protected final void b()
        {
            k.a(c.b.c);
            c.e = 6;
        }

        public final s q_()
        {
            return a;
        }

        private a()
        {
            c = com.squareup.okhttp.internal.http.f.this;
            super();
            a = new i(c.c.q_());
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements q
    {

        final com.squareup.okhttp.internal.http.f a;
        private final i b;
        private boolean c;

        public final void a_(okio.c c1, long l1)
            throws IOException
        {
            if (c)
            {
                throw new IllegalStateException("closed");
            }
            if (l1 == 0L)
            {
                return;
            } else
            {
                a.d.j(l1);
                a.d.b("\r\n");
                a.d.a_(c1, l1);
                a.d.b("\r\n");
                return;
            }
        }

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = c;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            c = true;
            a.d.b("0\r\n\r\n");
            com.squareup.okhttp.internal.http.f.a(b);
            a.e = 3;
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public final void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = c;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            a.d.flush();
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public final s q_()
        {
            return b;
        }

        private b()
        {
            a = com.squareup.okhttp.internal.http.f.this;
            super();
            b = new i(a.d.q_());
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c extends a
    {

        final com.squareup.okhttp.internal.http.f d;
        private long e;
        private boolean f;
        private final h g;

        public final long a(okio.c c1, long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
            }
            if (b)
            {
                throw new IllegalStateException("closed");
            }
            if (f) goto _L2; else goto _L1
_L1:
            return -1L;
_L2:
            if (e != 0L && e != -1L)
            {
                break; /* Loop/switch isn't completed */
            }
            if (e != -1L)
            {
                d.c.p();
            }
            try
            {
                e = d.c.m();
                String s1 = d.c.p().trim();
                if (e < 0L || !s1.isEmpty() && !s1.startsWith(";"))
                {
                    throw new ProtocolException((new StringBuilder("expected chunk size and optional extensions but was \"")).append(e).append(s1).append("\"").toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (okio.c c1)
            {
                throw new ProtocolException(c1.getMessage());
            }
            if (e == 0L)
            {
                f = false;
                com.squareup.okhttp.o.a a1 = new com.squareup.okhttp.o.a();
                d.a(a1);
                g.a(a1.a());
                a(true);
            }
            if (!f) goto _L1; else goto _L3
_L3:
            l1 = d.c.a(c1, Math.min(l1, e));
            if (l1 == -1L)
            {
                b();
                throw new ProtocolException("unexpected end of stream");
            } else
            {
                e = e - l1;
                return l1;
            }
        }

        public final void close()
            throws IOException
        {
            if (b)
            {
                return;
            }
            if (f && !k.a(this, TimeUnit.MILLISECONDS))
            {
                b();
            }
            b = true;
        }

        c(h h1)
            throws IOException
        {
            d = com.squareup.okhttp.internal.http.f.this;
            super((byte)0);
            e = -1L;
            f = true;
            g = h1;
        }
    }

    private final class d
        implements q
    {

        final com.squareup.okhttp.internal.http.f a;
        private final i b;
        private boolean c;
        private long d;

        public final void a_(okio.c c1, long l1)
            throws IOException
        {
            if (c)
            {
                throw new IllegalStateException("closed");
            }
            k.a(c1.b, l1);
            if (l1 > d)
            {
                throw new ProtocolException((new StringBuilder("expected ")).append(d).append(" bytes but received ").append(l1).toString());
            } else
            {
                a.d.a_(c1, l1);
                d = d - l1;
                return;
            }
        }

        public final void close()
            throws IOException
        {
            if (c)
            {
                return;
            }
            c = true;
            if (d > 0L)
            {
                throw new ProtocolException("unexpected end of stream");
            } else
            {
                com.squareup.okhttp.internal.http.f.a(b);
                a.e = 3;
                return;
            }
        }

        public final void flush()
            throws IOException
        {
            if (c)
            {
                return;
            } else
            {
                a.d.flush();
                return;
            }
        }

        public final s q_()
        {
            return b;
        }

        private d(long l1)
        {
            a = com.squareup.okhttp.internal.http.f.this;
            super();
            b = new i(a.d.q_());
            d = l1;
        }

        d(long l1, byte byte0)
        {
            this(l1);
        }
    }

    private final class e extends a
    {

        final com.squareup.okhttp.internal.http.f d;
        private long e;

        public final long a(okio.c c1, long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
            }
            if (b)
            {
                throw new IllegalStateException("closed");
            }
            if (e == 0L)
            {
                return -1L;
            }
            l1 = d.c.a(c1, Math.min(e, l1));
            if (l1 == -1L)
            {
                b();
                throw new ProtocolException("unexpected end of stream");
            }
            e = e - l1;
            if (e == 0L)
            {
                a(true);
            }
            return l1;
        }

        public final void close()
            throws IOException
        {
            if (b)
            {
                return;
            }
            if (e != 0L && !k.a(this, TimeUnit.MILLISECONDS))
            {
                b();
            }
            b = true;
        }

        public e(long l1)
            throws IOException
        {
            d = com.squareup.okhttp.internal.http.f.this;
            super((byte)0);
            e = l1;
            if (e == 0L)
            {
                a(true);
            }
        }
    }

    private final class f extends a
    {

        final com.squareup.okhttp.internal.http.f d;
        private boolean e;

        public final long a(okio.c c1, long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
            }
            if (b)
            {
                throw new IllegalStateException("closed");
            }
            if (e)
            {
                return -1L;
            }
            l1 = d.c.a(c1, l1);
            if (l1 == -1L)
            {
                e = true;
                a(false);
                return -1L;
            } else
            {
                return l1;
            }
        }

        public final void close()
            throws IOException
        {
            if (b)
            {
                return;
            }
            if (!e)
            {
                b();
            }
            b = true;
        }

        private f()
        {
            d = com.squareup.okhttp.internal.http.f.this;
            super((byte)0);
        }

        f(byte byte0)
        {
            this();
        }
    }


    final j a;
    final com.squareup.okhttp.i b;
    public final okio.e c;
    public final okio.d d;
    int e;
    int f;
    private final Socket g;

    public com.squareup.okhttp.internal.http.f(j j, com.squareup.okhttp.i i1, Socket socket)
        throws IOException
    {
        e = 0;
        f = 0;
        a = j;
        b = i1;
        g = socket;
        c = l.a(l.b(socket));
        d = l.a(l.a(socket));
    }

    static void a(i j)
    {
        s s1 = j.a;
        s s2 = s.b;
        if (s2 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            j.a = s2;
            s1.v_();
            s1.d();
            return;
        }
    }

    public final r a(long l1)
        throws IOException
    {
        if (e != 4)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        } else
        {
            e = 5;
            return new e(l1);
        }
    }

    public final void a()
        throws IOException
    {
        d.flush();
    }

    public final void a(int j, int i1)
    {
        if (j != 0)
        {
            c.q_().a(j, TimeUnit.MILLISECONDS);
        }
        if (i1 != 0)
        {
            d.q_().a(i1, TimeUnit.MILLISECONDS);
        }
    }

    public final void a(com.squareup.okhttp.o.a a1)
        throws IOException
    {
        do
        {
            String s1 = c.p();
            if (s1.length() != 0)
            {
                com.squareup.okhttp.internal.d.b.a(a1, s1);
            } else
            {
                return;
            }
        } while (true);
    }

    public final void a(o o1, String s1)
        throws IOException
    {
        if (e != 0)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        d.b(s1).b("\r\n");
        int j = 0;
        for (int i1 = o1.a.length / 2; j < i1; j++)
        {
            d.b(o1.a(j)).b(": ").b(o1.b(j)).b("\r\n");
        }

        d.b("\r\n");
        e = 1;
    }

    public final boolean b()
    {
        Exception exception;
        int j;
        boolean flag;
        try
        {
            j = g.getSoTimeout();
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return true;
        }
        catch (IOException ioexception)
        {
            return false;
        }
        g.setSoTimeout(1);
        flag = c.d();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        g.setSoTimeout(j);
        return false;
        g.setSoTimeout(j);
        return true;
        exception;
        g.setSoTimeout(j);
        throw exception;
    }

    public final com.squareup.okhttp.v.a c()
        throws IOException
    {
        if (e != 1 && e != 3)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        com.squareup.okhttp.v.a a1;
        try
        {
            p p1;
            do
            {
                p1 = p.a(c.p());
                a1 = new com.squareup.okhttp.v.a();
                a1.b = p1.a;
                a1.c = p1.b;
                a1.d = p1.c;
                com.squareup.okhttp.o.a a2 = new com.squareup.okhttp.o.a();
                a(a2);
                a2.a(com.squareup.okhttp.internal.http.k.d, p1.a.toString());
                a1.a(a2.a());
            } while (p1.b == 100);
            e = 4;
        }
        catch (EOFException eofexception)
        {
            IOException ioexception = new IOException((new StringBuilder("unexpected end of stream on ")).append(b).append(" (recycle count=").append(com.squareup.okhttp.internal.d.b.b(b)).append(")").toString());
            ioexception.initCause(eofexception);
            throw ioexception;
        }
        return a1;
    }
}
