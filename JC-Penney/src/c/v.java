// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.OutputStream;

// Referenced classes of package c:
//            i, f, ad, w, 
//            ac, ag, k, ae

final class v
    implements i
{

    public final f a;
    public final ac b;
    private boolean c;

    public v(ac ac1)
    {
        this(ac1, new f());
    }

    public v(ac ac1, f f1)
    {
        if (ac1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            a = f1;
            b = ac1;
            return;
        }
    }

    static boolean a(v v1)
    {
        return v1.c;
    }

    public long a(ad ad1)
    {
        if (ad1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = ad1.read(a, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                w();
            } else
            {
                return l;
            }
        } while (true);
    }

    public f b()
    {
        return a;
    }

    public i b(k k1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(k1);
            return w();
        }
    }

    public i b(String s)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(s);
            return w();
        }
    }

    public i c(byte abyte0[])
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0);
            return w();
        }
    }

    public i c(byte abyte0[], int l, int i1)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0, l, i1);
            return w();
        }
    }

    public OutputStream c()
    {
        return new w(this);
    }

    public void close()
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
            ag.a(throwable1);
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

    public i e()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.a();
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
    }

    public void flush()
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

    public i g(int l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.d(l);
            return w();
        }
    }

    public i h(int l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.c(l);
            return w();
        }
    }

    public i i(int l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(l);
            return w();
        }
    }

    public i j(long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.i(l);
            return w();
        }
    }

    public i k(long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.h(l);
            return w();
        }
    }

    public ae timeout()
    {
        return b.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("buffer(").append(b).append(")").toString();
    }

    public i w()
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.h();
        if (l > 0L)
        {
            b.write(a, l);
        }
        return this;
    }

    public void write(f f1, long l)
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.write(f1, l);
            w();
            return;
        }
    }
}
