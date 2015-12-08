// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import okio.ByteString;

final class hcr
    implements hci
{

    public final hch a;
    boolean b;
    private hcv c;

    public hcr(hcv hcv1)
    {
        this(hcv1, new hch());
    }

    private hcr(hcv hcv1, hch hch1)
    {
        if (hcv1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            a = hch1;
            c = hcv1;
            return;
        }
    }

    public final hcx T_()
    {
        return c.T_();
    }

    public final long a(hcw hcw1)
    {
        if (hcw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = hcw1.a(a, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                t();
            } else
            {
                return l;
            }
        } while (true);
    }

    public final hci a(byte abyte0[], int k)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(abyte0, 0, k);
            return t();
        }
    }

    public final void a_(hch hch1, long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a_(hch1, l);
            t();
            return;
        }
    }

    public final hch b()
    {
        return a;
    }

    public final hci b(String s)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(s);
            return t();
        }
    }

    public final hci b(ByteString bytestring)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(bytestring);
            return t();
        }
    }

    public final hci b(byte abyte0[])
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.a(abyte0);
            return t();
        }
    }

    public final OutputStream c()
    {
        return new OutputStream() {

            private hcr a;

            public final void close()
            {
                a.close();
            }

            public final void flush()
            {
                if (!a.b)
                {
                    a.flush();
                }
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".outputStream()").toString();
            }

            public final void write(int k)
            {
                if (a.b)
                {
                    throw new IOException("closed");
                } else
                {
                    a.a.b((byte)k);
                    a.t();
                    return;
                }
            }

            public final void write(byte abyte0[], int k, int l)
            {
                if (a.b)
                {
                    throw new IOException("closed");
                } else
                {
                    a.a.b(abyte0, k, l);
                    a.t();
                    return;
                }
            }

            
            {
                a = hcr.this;
                super();
            }
        };
    }

    public final void close()
    {
        if (!b) goto _L2; else goto _L1
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
        c.a_(a, a.b);
        throwable = throwable1;
_L4:
        c.close();
        throwable1 = throwable;
_L3:
        b = true;
        if (throwable1 != null)
        {
            hcy.a(throwable1);
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

    public final hci d()
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        long l = a.b;
        if (l > 0L)
        {
            c.a_(a, l);
        }
        return this;
    }

    public final hci f(int k)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.d(k);
            return t();
        }
    }

    public final void flush()
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        if (a.b > 0L)
        {
            c.a_(a, a.b);
        }
        c.flush();
    }

    public final hci g(int k)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.c(k);
            return t();
        }
    }

    public final hci h(int k)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.b(k);
            return t();
        }
    }

    public final hci i(long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.h(l);
            return t();
        }
    }

    public final hci j(long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        } else
        {
            a.g(l);
            return t();
        }
    }

    public final hci t()
    {
        Object obj;
        long l1;
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        obj = a;
        l1 = ((hch) (obj)).b;
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        if (l > 0L)
        {
            c.a_(a, l);
        }
        return this;
_L2:
        obj = ((hch) (obj)).a.g;
        l = l1;
        if (((hct) (obj)).c < 2048)
        {
            l = l1;
            if (((hct) (obj)).e)
            {
                l = l1 - (long)(((hct) (obj)).c - ((hct) (obj)).b);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(c).append(")").toString();
    }
}
