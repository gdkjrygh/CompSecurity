// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

// Referenced classes of package c:
//            ad, r, q, j, 
//            f, z, ae

public final class p
    implements ad
{

    private int a;
    private final j b;
    private final Inflater c;
    private final q d;
    private final CRC32 e = new CRC32();

    public p(ad ad1)
    {
        a = 0;
        if (ad1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            c = new Inflater(true);
            b = r.a(ad1);
            d = new q(b, c);
            return;
        }
    }

    private void a()
    {
        b.a(10L);
        byte byte0 = b.b().b(3L);
        boolean flag;
        if ((byte0 >> 1 & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(b.b(), 0L, 10L);
        }
        a("ID1ID2", 8075, b.j());
        b.g(8L);
        if ((byte0 >> 2 & 1) == 1)
        {
            b.a(2L);
            if (flag)
            {
                a(b.b(), 0L, 2L);
            }
            int i = b.b().l();
            b.a(i);
            if (flag)
            {
                a(b.b(), 0L, i);
            }
            b.g(i);
        }
        if ((byte0 >> 3 & 1) == 1)
        {
            long l = b.a((byte)0);
            if (l == -1L)
            {
                throw new EOFException();
            }
            if (flag)
            {
                a(b.b(), 0L, 1L + l);
            }
            b.g(1L + l);
        }
        if ((byte0 >> 4 & 1) == 1)
        {
            long l1 = b.a((byte)0);
            if (l1 == -1L)
            {
                throw new EOFException();
            }
            if (flag)
            {
                a(b.b(), 0L, 1L + l1);
            }
            b.g(1L + l1);
        }
        if (flag)
        {
            a("FHCRC", b.l(), (short)(int)e.getValue());
            e.reset();
        }
    }

    private void a(f f1, long l, long l1)
    {
        f1 = f1.a;
        Object obj;
        long l2;
        long l3;
        do
        {
            obj = f1;
            l2 = l;
            l3 = l1;
            if (l < (long)(((z) (f1)).c - ((z) (f1)).b))
            {
                break;
            }
            l -= ((z) (f1)).c - ((z) (f1)).b;
            f1 = ((z) (f1)).f;
        } while (true);
        while (l3 > 0L) 
        {
            int i = (int)((long)((z) (obj)).b + l2);
            int k = (int)Math.min(((z) (obj)).c - i, l3);
            e.update(((z) (obj)).a, i, k);
            l3 -= k;
            obj = ((z) (obj)).f;
            l2 = 0L;
        }
    }

    private void a(String s, int i, int k)
    {
        if (k != i)
        {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] {
                s, Integer.valueOf(k), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    private void b()
    {
        a("CRC", b.m(), (int)e.getValue());
        a("ISIZE", b.m(), c.getTotalOut());
    }

    public void close()
    {
        d.close();
    }

    public long read(f f1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (l == 0L)
        {
            return 0L;
        }
        if (a == 0)
        {
            a();
            a = 1;
        }
        if (a == 1)
        {
            long l1 = f1.b;
            l = d.read(f1, l);
            if (l != -1L)
            {
                a(f1, l1, l);
                return l;
            }
            a = 2;
        }
        if (a == 2)
        {
            b();
            a = 3;
            if (!b.f())
            {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public ae timeout()
    {
        return b.timeout();
    }
}
