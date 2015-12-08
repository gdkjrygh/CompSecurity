// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.g;
import c.h;
import c.o;
import c.x;
import c.y;
import c.z;
import com.c.a.a.a;
import com.c.a.i;
import com.c.a.j;
import com.c.a.p;
import com.c.a.v;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a.a:
//            t, m, h

public final class com.c.a.a.a.e
{
    private abstract class a
        implements y
    {

        protected boolean a;
        final com.c.a.a.a.e b;

        protected final void a()
        {
            com.c.a.a.i.a(b.b.c);
            b.e = 6;
        }

        protected final void a(boolean flag)
            throws IOException
        {
            if (b.e != 5)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(b.e).toString());
            }
            b.e = 0;
            if (flag && b.f == 1)
            {
                b.f = 0;
                com.c.a.a.a.b.a(b.a, b.b);
            } else
            if (b.f == 2)
            {
                b.e = 6;
                b.b.c.close();
                return;
            }
        }

        public z timeout()
        {
            return b.c.timeout();
        }

        private a()
        {
            b = com.c.a.a.a.e.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements x
    {

        final com.c.a.a.a.e a;
        private boolean b;

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = b;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            b = true;
            a.d.b("0\r\n\r\n");
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
            boolean flag = b;
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

        public final z timeout()
        {
            return a.d.timeout();
        }

        public final void write(c.e e1, long l)
            throws IOException
        {
            if (b)
            {
                throw new IllegalStateException("closed");
            }
            if (l == 0L)
            {
                return;
            } else
            {
                a.d.i(l);
                a.d.b("\r\n");
                a.d.write(e1, l);
                a.d.b("\r\n");
                return;
            }
        }

        private b()
        {
            a = com.c.a.a.a.e.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c extends a
    {

        final com.c.a.a.a.e c;
        private long d;
        private boolean e;
        private final com.c.a.a.a.h f;

        public final long a(c.e e1, long l)
            throws IOException
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
            }
            if (a)
            {
                throw new IllegalStateException("closed");
            }
            if (e) goto _L2; else goto _L1
_L1:
            return -1L;
_L2:
            if (d != 0L && d != -1L)
            {
                break; /* Loop/switch isn't completed */
            }
            if (d != -1L)
            {
                c.c.l();
            }
            try
            {
                d = c.c.j();
                String s = c.c.l().trim();
                if (d < 0L || !s.isEmpty() && !s.startsWith(";"))
                {
                    throw new ProtocolException((new StringBuilder("expected chunk size and optional extensions but was \"")).append(d).append(s).append("\"").toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (c.e e1)
            {
                throw new ProtocolException(e1.getMessage());
            }
            if (d == 0L)
            {
                e = false;
                com.c.a.p.a a1 = new com.c.a.p.a();
                c.a(a1);
                f.a(a1.a());
                a(true);
            }
            if (!e) goto _L1; else goto _L3
_L3:
            l = c.c.a(e1, Math.min(l, d));
            if (l == -1L)
            {
                a();
                throw new IOException("unexpected end of stream");
            } else
            {
                d = d - l;
                return l;
            }
        }

        public final void close()
            throws IOException
        {
            if (a)
            {
                return;
            }
            if (e && !com.c.a.a.i.a(this, TimeUnit.MILLISECONDS))
            {
                a();
            }
            a = true;
        }

        c(com.c.a.a.a.h h1)
            throws IOException
        {
            c = com.c.a.a.a.e.this;
            super((byte)0);
            d = -1L;
            e = true;
            f = h1;
        }
    }

    private final class d
        implements x
    {

        final com.c.a.a.a.e a;
        private boolean b;
        private long c;

        public final void close()
            throws IOException
        {
            if (b)
            {
                return;
            }
            b = true;
            if (c > 0L)
            {
                throw new ProtocolException("unexpected end of stream");
            } else
            {
                a.e = 3;
                return;
            }
        }

        public final void flush()
            throws IOException
        {
            if (b)
            {
                return;
            } else
            {
                a.d.flush();
                return;
            }
        }

        public final z timeout()
        {
            return a.d.timeout();
        }

        public final void write(c.e e1, long l)
            throws IOException
        {
            if (b)
            {
                throw new IllegalStateException("closed");
            }
            com.c.a.a.i.a(e1.b, 0L, l);
            if (l > c)
            {
                throw new ProtocolException((new StringBuilder("expected ")).append(c).append(" bytes but received ").append(l).toString());
            } else
            {
                a.d.write(e1, l);
                c = c - l;
                return;
            }
        }

        private d(long l)
        {
            a = com.c.a.a.a.e.this;
            super();
            c = l;
        }

        d(long l, byte byte0)
        {
            this(l);
        }
    }

    private final class e extends a
    {

        final com.c.a.a.a.e c;
        private long d;

        public final long a(c.e e1, long l)
            throws IOException
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
            }
            if (a)
            {
                throw new IllegalStateException("closed");
            }
            if (d == 0L)
            {
                return -1L;
            }
            l = c.c.a(e1, Math.min(d, l));
            if (l == -1L)
            {
                a();
                throw new ProtocolException("unexpected end of stream");
            }
            d = d - l;
            if (d == 0L)
            {
                a(true);
            }
            return l;
        }

        public final void close()
            throws IOException
        {
            if (a)
            {
                return;
            }
            if (d != 0L && !com.c.a.a.i.a(this, TimeUnit.MILLISECONDS))
            {
                a();
            }
            a = true;
        }

        public e(long l)
            throws IOException
        {
            c = com.c.a.a.a.e.this;
            super((byte)0);
            d = l;
            if (d == 0L)
            {
                a(true);
            }
        }
    }

    private final class f extends a
    {

        final com.c.a.a.a.e c;
        private boolean d;

        public final long a(c.e e1, long l)
            throws IOException
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
            }
            if (a)
            {
                throw new IllegalStateException("closed");
            }
            if (d)
            {
                return -1L;
            }
            l = c.c.a(e1, l);
            if (l == -1L)
            {
                d = true;
                a(false);
                return -1L;
            } else
            {
                return l;
            }
        }

        public final void close()
            throws IOException
        {
            if (a)
            {
                return;
            }
            if (!d)
            {
                a();
            }
            a = true;
        }

        private f()
        {
            c = com.c.a.a.a.e.this;
            super((byte)0);
        }

        f(byte byte0)
        {
            this();
        }
    }


    final j a;
    final i b;
    public final h c;
    final g d;
    int e;
    int f;
    private final Socket g;

    public com.c.a.a.a.e(j j, i i, Socket socket)
        throws IOException
    {
        e = 0;
        f = 0;
        a = j;
        b = i;
        g = socket;
        c = o.a(o.b(socket));
        d = o.a(o.a(socket));
    }

    public final y a(long l)
        throws IOException
    {
        if (e != 4)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        } else
        {
            e = 5;
            return new e(l);
        }
    }

    public final void a()
        throws IOException
    {
        d.flush();
    }

    public final void a(int i, int j)
    {
        if (i != 0)
        {
            c.timeout().a(i, TimeUnit.MILLISECONDS);
        }
        if (j != 0)
        {
            d.timeout().a(j, TimeUnit.MILLISECONDS);
        }
    }

    public final void a(com.c.a.p.a a1)
        throws IOException
    {
        do
        {
            String s = c.l();
            if (s.length() != 0)
            {
                com.c.a.a.a.b.a(a1, s);
            } else
            {
                return;
            }
        } while (true);
    }

    public final void a(p p1, String s)
        throws IOException
    {
        if (e != 0)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        d.b(s).b("\r\n");
        int i = 0;
        for (int j = p1.a.length / 2; i < j; i++)
        {
            d.b(p1.a(i)).b(": ").b(p1.b(i)).b("\r\n");
        }

        d.b("\r\n");
        e = 1;
    }

    public final boolean b()
    {
        Exception exception;
        int i;
        boolean flag;
        try
        {
            i = g.getSoTimeout();
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
        flag = c.c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        g.setSoTimeout(i);
        return false;
        g.setSoTimeout(i);
        return true;
        exception;
        g.setSoTimeout(i);
        throw exception;
    }

    public final com.c.a.A.a c()
        throws IOException
    {
        if (e != 1 && e != 3)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        com.c.a.A.a a1;
        try
        {
            t t1;
            do
            {
                t1 = com.c.a.a.a.t.a(c.l());
                a1 = new com.c.a.A.a();
                a1.b = t1.a;
                a1.c = t1.b;
                a1.d = t1.c;
                com.c.a.p.a a2 = new com.c.a.p.a();
                a(a2);
                a2.a(m.d, t1.a.toString());
                a1.a(a2.a());
            } while (t1.b == 100);
            e = 4;
        }
        catch (EOFException eofexception)
        {
            IOException ioexception = new IOException((new StringBuilder("unexpected end of stream on ")).append(b).append(" (recycle count=").append(com.c.a.a.a.b.b(b)).append(")").toString());
            ioexception.initCause(eofexception);
            throw ioexception;
        }
        return a1;
    }
}
