// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            g, e, y, x, 
//            B, v, i, z

final class s
    implements g
{

    public final e a;
    public final x b;
    private boolean c;

    public s(x x1)
    {
        this(x1, new e());
    }

    private s(x x1, e e1)
    {
        if (x1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            a = e1;
            b = x1;
            return;
        }
    }

    public final long a(y y1)
        throws IOException
    {
        if (y1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = y1.a(a, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                o();
            } else
            {
                return l;
            }
        } while (true);
    }

    public final e a()
    {
        return a;
    }

    public final g b()
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.b;
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
    }

    public final g b(i k)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(k);
            return o();
        }
    }

    public final g b(String s1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(s1);
            return o();
        }
    }

    public final g b(byte abyte0[])
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(abyte0);
            return o();
        }
    }

    public final g c(byte abyte0[], int k, int l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0, k, l);
            return o();
        }
    }

    public final void close()
        throws IOException
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable;
        Throwable throwable1;
        throwable1 = null;
        throwable = throwable1;
        if (a.b <= 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b.write(a, a.b);
        throwable = throwable1;
_L4:
        b.close();
        throwable1 = throwable;
_L3:
        c = true;
        if (throwable1 != null)
        {
            B.a(throwable1);
            return;
        }
          goto _L1
        Throwable throwable2;
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L3
        throwable;
          goto _L4
    }

    public final g e(int k)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.c(k);
            return o();
        }
    }

    public final g f(int k)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(k);
            return o();
        }
    }

    public final void flush()
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b > 0L)
        {
            b.write(a, a.b);
        }
        b.flush();
    }

    public final g g(int k)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(k);
            return o();
        }
    }

    public final g i(long l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.h(l);
            return o();
        }
    }

    public final g j(long l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.g(l);
            return o();
        }
    }

    public final g o()
        throws IOException
    {
        Object obj;
        long l1;
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        obj = a;
        l1 = ((e) (obj)).b;
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
_L2:
        obj = ((e) (obj)).a.g;
        l = l1;
        if (((v) (obj)).c < 2048)
        {
            l = l1;
            if (((v) (obj)).e)
            {
                l = l1 - (long)(((v) (obj)).c - ((v) (obj)).b);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final z timeout()
    {
        return b.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }

    public final void write(e e1, long l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.write(e1, l);
            o();
            return;
        }
    }
}
