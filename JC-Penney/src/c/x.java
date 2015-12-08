// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.InputStream;

// Referenced classes of package c:
//            j, f, ad, y, 
//            k, ae

final class x
    implements j
{

    public final f a;
    public final ad b;
    private boolean c;

    public x(ad ad1)
    {
        this(ad1, new f());
    }

    public x(ad ad1, f f1)
    {
        if (ad1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            a = f1;
            b = ad1;
            return;
        }
    }

    static boolean a(x x1)
    {
        return x1.c;
    }

    public long a(byte byte0)
    {
        return a(byte0, 0L);
    }

    public long a(byte byte0, long l1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            long l2 = l1;
            if (l1 >= a.b)
            {
                if (b.read(a, 2048L) == -1L)
                {
                    return -1L;
                }
            } else
            {
                do
                {
                    l1 = a.a(byte0, l2);
                    if (l1 == -1L)
                    {
                        l2 = a.b;
                        if (b.read(a, 2048L) == -1L)
                        {
                            return -1L;
                        }
                    } else
                    {
                        return l1;
                    }
                } while (true);
            }
        } while (true);
    }

    public void a(long l1)
    {
        if (!b(l1))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public f b()
    {
        return a;
    }

    public boolean b(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l1).toString());
        }
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        while (a.b < l1) 
        {
            if (b.read(a, 2048L) == -1L)
            {
                return false;
            }
        }
        return true;
    }

    public k c(long l1)
    {
        a(l1);
        return a.c(l1);
    }

    public void close()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            b.close();
            a.t();
            return;
        }
    }

    public boolean f()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        return a.f() && b.read(a, 2048L) == -1L;
    }

    public byte[] f(long l1)
    {
        a(l1);
        return a.f(l1);
    }

    public InputStream g()
    {
        return new y(this);
    }

    public void g(long l1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
_L3:
        if (l1 > 0L)
        {
            if (a.b == 0L && b.read(a, 2048L) == -1L)
            {
                throw new EOFException();
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        long l2 = Math.min(l1, a.a());
        a.g(l2);
        l1 -= l2;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public byte i()
    {
        a(1L);
        return a.i();
    }

    public short j()
    {
        a(2L);
        return a.j();
    }

    public int k()
    {
        a(4L);
        return a.k();
    }

    public short l()
    {
        a(2L);
        return a.l();
    }

    public int m()
    {
        a(4L);
        return a.m();
    }

    public long n()
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
        return a.n();
    }

    public long o()
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
        return a.o();
    }

    public String r()
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            f f1 = new f();
            a.a(f1, 0L, Math.min(32L, a.a()));
            throw new EOFException((new StringBuilder()).append("\\n not found: size=").append(a.a()).append(" content=").append(f1.p().d()).append("...").toString());
        } else
        {
            return a.e(l1);
        }
    }

    public long read(f f1, long l1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l1).toString());
        }
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b == 0L && b.read(a, 2048L) == -1L)
        {
            return -1L;
        } else
        {
            l1 = Math.min(l1, a.b);
            return a.read(f1, l1);
        }
    }

    public byte[] s()
    {
        a.a(b);
        return a.s();
    }

    public ae timeout()
    {
        return b.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("buffer(").append(b).append(")").toString();
    }
}
