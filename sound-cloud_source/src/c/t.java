// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package c:
//            h, e, y, u, 
//            B, i, z

final class t
    implements h
{

    public final e a;
    public final y b;
    boolean c;

    public t(y y1)
    {
        this(y1, new e());
    }

    private t(y y1, e e1)
    {
        if (y1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            a = e1;
            b = y1;
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

    public final long a(e e1, long l1)
        throws IOException
    {
        if (e1 == null)
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
            return a.a(e1, l1);
        }
    }

    public final e a()
    {
        return a;
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

    public final i c(long l1)
        throws IOException
    {
        a(l1);
        return a.c(l1);
    }

    public final boolean c()
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        return a.c() && b.a(a, 2048L) == -1L;
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
            a.n();
            return;
        }
    }

    public final InputStream d()
    {
        return new u(this);
    }

    public final byte e()
        throws IOException
    {
        a(1L);
        return a.e();
    }

    public final byte[] e(long l1)
        throws IOException
    {
        a(l1);
        return a.e(l1);
    }

    public final short f()
        throws IOException
    {
        a(2L);
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

    public final int g()
        throws IOException
    {
        a(4L);
        return a.g();
    }

    public final short h()
        throws IOException
    {
        a(2L);
        return B.a(a.f());
    }

    public final int i()
        throws IOException
    {
        a(4L);
        return B.a(a.g());
    }

    public final long j()
        throws IOException
    {
        int k = 0;
        do
        {
            if (!b(k + 1))
            {
                break;
            }
            byte byte0 = a.b(k);
            if ((byte0 < 48 || byte0 > 57) && (byte0 < 97 || byte0 > 102) && (byte0 < 65 || byte0 > 70))
            {
                break;
            }
            k++;
        } while (true);
        if (k == 0)
        {
            throw new NumberFormatException((new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")).append(Integer.toHexString(a.b(0L))).toString());
        } else
        {
            return a.j();
        }
    }

    public final String l()
        throws IOException
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            e e1 = new e();
            a.a(e1, 0L, Math.min(32L, a.b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(a.b).append(" content=").append(e1.k().b()).append("...").toString());
        } else
        {
            return a.d(l1);
        }
    }

    public final byte[] m()
        throws IOException
    {
        a.a(b);
        return a.m();
    }

    public final z timeout()
    {
        return b.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }
}
