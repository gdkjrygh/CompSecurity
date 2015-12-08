// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            e, c, r, t, 
//            ByteString, s

final class n
    implements e
{

    public final c a;
    public final r b;
    boolean c;

    public n(r r1)
    {
        this(r1, new c());
    }

    private n(r r1, c c1)
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            a = c1;
            b = r1;
            return;
        }
    }

    private boolean b(long l1)
        throws IOException
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        while (a.b < l1) 
        {
            if (b.a(a, 2048L) == -1L)
            {
                return false;
            }
        }
        return true;
    }

    public final int a(byte abyte0[], int i1, int j1)
        throws IOException
    {
        t.a(abyte0.length, i1, j1);
        if (a.b == 0L && b.a(a, 2048L) == -1L)
        {
            return -1;
        } else
        {
            j1 = (int)Math.min(j1, a.b);
            return a.a(abyte0, i1, j1);
        }
    }

    public final long a(byte byte0)
        throws IOException
    {
        long l1;
        long l2 = 0L;
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            l1 = l2;
            if (0L < a.b)
            {
                do
                {
                    l3 = a.a(byte0, l1);
                    l1 = l3;
                    if (l3 != -1L)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    l1 = a.b;
                    if (b.a(a, 2048L) == -1L)
                    {
                        return -1L;
                    }
                } while (true);
            }
        } while (b.a(a, 2048L) != -1L);
        l1 = -1L;
_L2:
        long l3;
        return l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final long a(c c1, long l1)
        throws IOException
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b == 0L && b.a(a, 2048L) == -1L)
        {
            return -1L;
        } else
        {
            l1 = Math.min(l1, a.b);
            return a.a(c1, l1);
        }
    }

    public final void a(long l1)
        throws IOException
    {
        if (!b(l1))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void a(byte abyte0[])
        throws IOException
    {
        try
        {
            a(abyte0.length);
        }
        catch (EOFException eofexception)
        {
            int j1;
            for (int i1 = 0; a.b > 0L; i1 += j1)
            {
                j1 = a.a(abyte0, i1, (int)a.b);
                if (j1 == -1)
                {
                    throw new AssertionError();
                }
            }

            throw eofexception;
        }
        a.a(abyte0);
    }

    public final c b()
    {
        return a;
    }

    public final void b(c c1, long l1)
        throws IOException
    {
        try
        {
            a(l1);
        }
        catch (EOFException eofexception)
        {
            c1.a(a);
            throw eofexception;
        }
        a.b(c1, l1);
    }

    public final ByteString c(long l1)
        throws IOException
    {
        a(l1);
        return a.c(l1);
    }

    public final void close()
        throws IOException
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            b.close();
            a.r();
            return;
        }
    }

    public final boolean d()
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        return a.d() && b.a(a, 2048L) == -1L;
    }

    public final InputStream e()
    {
        return new InputStream() {

            final n a;

            public final int available()
                throws IOException
            {
                if (a.c)
                {
                    throw new IOException("closed");
                } else
                {
                    return (int)Math.min(a.a.b, 0x7fffffffL);
                }
            }

            public final void close()
                throws IOException
            {
                a.close();
            }

            public final int read()
                throws IOException
            {
                if (a.c)
                {
                    throw new IOException("closed");
                }
                if (a.a.b == 0L && a.b.a(a.a, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return a.a.f() & 0xff;
                }
            }

            public final int read(byte abyte0[], int i1, int j1)
                throws IOException
            {
                if (a.c)
                {
                    throw new IOException("closed");
                }
                t.a(abyte0.length, i1, j1);
                if (a.a.b == 0L && a.b.a(a.a, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return a.a.a(abyte0, i1, j1);
                }
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".inputStream()").toString();
            }

            
            {
                a = n.this;
                super();
            }
        };
    }

    public final byte[] e(long l1)
        throws IOException
    {
        a(l1);
        return a.e(l1);
    }

    public final byte f()
        throws IOException
    {
        a(1L);
        return a.f();
    }

    public final void f(long l1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
_L3:
        if (l1 > 0L)
        {
            if (a.b == 0L && b.a(a, 2048L) == -1L)
            {
                throw new EOFException();
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        long l2 = Math.min(l1, a.b);
        a.f(l2);
        l1 -= l2;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final short g()
        throws IOException
    {
        a(2L);
        return a.g();
    }

    public final int h()
        throws IOException
    {
        a(4L);
        return a.h();
    }

    public final long i()
        throws IOException
    {
        a(8L);
        return a.i();
    }

    public final short j()
        throws IOException
    {
        a(2L);
        return t.a(a.g());
    }

    public final int k()
        throws IOException
    {
        a(4L);
        return t.a(a.h());
    }

    public final long l()
        throws IOException
    {
        a(1L);
        int i1 = 0;
        do
        {
            if (!b(i1 + 1))
            {
                break;
            }
            byte byte0 = a.b(i1);
            if ((byte0 < 48 || byte0 > 57) && (i1 != 0 || byte0 != 45))
            {
                if (i1 == 0)
                {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[] {
                        Byte.valueOf(byte0)
                    }));
                }
                break;
            }
            i1++;
        } while (true);
        return a.l();
    }

    public final long m()
        throws IOException
    {
        a(1L);
        int i1 = 0;
        do
        {
            if (!b(i1 + 1))
            {
                break;
            }
            byte byte0 = a.b(i1);
            if ((byte0 < 48 || byte0 > 57) && (byte0 < 97 || byte0 > 102) && (byte0 < 65 || byte0 > 70))
            {
                if (i1 == 0)
                {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] {
                        Byte.valueOf(byte0)
                    }));
                }
                break;
            }
            i1++;
        } while (true);
        return a.m();
    }

    public final String o()
        throws IOException
    {
        a.a(b);
        return a.o();
    }

    public final String p()
        throws IOException
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            c c1 = new c();
            a.a(c1, 0L, Math.min(32L, a.b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(a.b).append(" content=").append(c1.n().b()).append("...").toString());
        } else
        {
            return a.d(l1);
        }
    }

    public final byte[] q()
        throws IOException
    {
        a.a(b);
        return a.q();
    }

    public final s q_()
    {
        return b.q_();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }
}
