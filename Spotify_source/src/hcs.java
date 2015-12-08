// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import okio.ByteString;

final class hcs
    implements hcj
{

    public final hch a;
    public final hcw b;
    boolean c;

    public hcs(hcw hcw1)
    {
        this(hcw1, new hch());
    }

    private hcs(hcw hcw1, hch hch1)
    {
        if (hcw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            a = hch1;
            b = hcw1;
            return;
        }
    }

    private boolean b(long l1)
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

    public final hcx T_()
    {
        return b.T_();
    }

    public final long a(byte byte0)
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

    public final long a(hch hch1, long l1)
    {
        if (hch1 == null)
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
            return a.a(hch1, l1);
        }
    }

    public final String a(long l1, Charset charset)
    {
        a(l1);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        } else
        {
            return a.a(l1, charset);
        }
    }

    public final void a(long l1)
    {
        if (!b(l1))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final hch b()
    {
        return a;
    }

    public final ByteString c(long l1)
    {
        a(l1);
        return a.c(l1);
    }

    public final void close()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            b.close();
            a.s();
            return;
        }
    }

    public final boolean e()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        return a.e() && b.a(a, 2048L) == -1L;
    }

    public final byte[] e(long l1)
    {
        a(l1);
        return a.e(l1);
    }

    public final InputStream f()
    {
        return new InputStream() {

            private hcs a;

            public final int available()
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
            {
                a.close();
            }

            public final int read()
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
                    return a.a.g() & 0xff;
                }
            }

            public final int read(byte abyte0[], int i1, int j1)
            {
                if (a.c)
                {
                    throw new IOException("closed");
                }
                hcy.a(abyte0.length, i1, j1);
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
                a = hcs.this;
                super();
            }
        };
    }

    public final void f(long l1)
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

    public final byte g()
    {
        a(1L);
        return a.g();
    }

    public final short h()
    {
        a(2L);
        return a.h();
    }

    public final int i()
    {
        a(4L);
        return a.i();
    }

    public final short j()
    {
        a(2L);
        return hcy.a(a.h());
    }

    public final int k()
    {
        a(4L);
        return hcy.a(a.i());
    }

    public final long l()
    {
        a(8L);
        return a.l();
    }

    public final long m()
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
        return a.m();
    }

    public final long n()
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
        return a.n();
    }

    public final String q()
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            hch hch1 = new hch();
            a.a(hch1, 0L, Math.min(32L, a.b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(a.b).append(" content=").append(hch1.o().d()).append("...").toString());
        } else
        {
            return a.d(l1);
        }
    }

    public final byte[] r()
    {
        a.a(b);
        return a.r();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }
}
