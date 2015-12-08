// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            d, c, r, q, 
//            t, o, ByteString, s

final class m
    implements d
{

    public final c a;
    public final q b;
    private boolean c;

    public m(q q1)
    {
        this(q1, new c());
    }

    private m(q q1, c c1)
    {
        if (q1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            a = c1;
            b = q1;
            return;
        }
    }

    public final long a(r r1)
        throws IOException
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = r1.a(a, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
                s();
            } else
            {
                return l1;
            }
        } while (true);
    }

    public final void a_(c c1, long l1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a_(c1, l1);
            s();
            return;
        }
    }

    public final c b()
    {
        return a;
    }

    public final d b(String s1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(s1);
            return s();
        }
    }

    public final d b(ByteString bytestring)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(bytestring);
            return s();
        }
    }

    public final d c()
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l1 = a.b;
        if (l1 > 0L)
        {
            b.a_(a, l1);
        }
        return this;
    }

    public final d c(byte abyte0[])
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0);
            return s();
        }
    }

    public final d c(byte abyte0[], int i, int i1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0, i, i1);
            return s();
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
        b.a_(a, a.b);
        throwable = throwable1;
_L4:
        b.close();
        throwable1 = throwable;
_L3:
        c = true;
        if (throwable1 != null)
        {
            t.a(throwable1);
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

    public final d f(int i)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.d(i);
            return s();
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
            b.a_(a, a.b);
        }
        b.flush();
    }

    public final d g(int i)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.c(i);
            return s();
        }
    }

    public final d h(int i)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(i);
            return s();
        }
    }

    public final d j(long l1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.i(l1);
            return s();
        }
    }

    public final d k(long l1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.h(l1);
            return s();
        }
    }

    public final d l(long l1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.g(l1);
            return s();
        }
    }

    public final s q_()
    {
        return b.q_();
    }

    public final d s()
        throws IOException
    {
        Object obj;
        long l2;
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        obj = a;
        l2 = ((c) (obj)).b;
        if (l2 != 0L) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L4:
        if (l1 > 0L)
        {
            b.a_(a, l1);
        }
        return this;
_L2:
        obj = ((c) (obj)).a.g;
        l1 = l2;
        if (((o) (obj)).c < 2048)
        {
            l1 = l2;
            if (((o) (obj)).e)
            {
                l1 = l2 - (long)(((o) (obj)).c - ((o) (obj)).b);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(b).append(")").toString();
    }
}
