// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

// Referenced classes of package c:
//            y, o, n, e, 
//            v, h, z

public final class m
    implements y
{

    private int a;
    private final h b;
    private final Inflater c;
    private final n d;
    private final CRC32 e = new CRC32();

    public m(y y1)
    {
        a = 0;
        if (y1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            c = new Inflater(true);
            b = o.a(y1);
            d = new n(b, c);
            return;
        }
    }

    private void a(e e1, long l, long l1)
    {
        e1 = e1.a;
        Object obj;
        long l2;
        long l3;
        do
        {
            obj = e1;
            l2 = l;
            l3 = l1;
            if (l < (long)(((v) (e1)).c - ((v) (e1)).b))
            {
                break;
            }
            l -= ((v) (e1)).c - ((v) (e1)).b;
            e1 = ((v) (e1)).f;
        } while (true);
        while (l3 > 0L) 
        {
            int i = (int)((long)((v) (obj)).b + l2);
            int j = (int)Math.min(((v) (obj)).c - i, l3);
            e.update(((v) (obj)).a, i, j);
            l3 -= j;
            obj = ((v) (obj)).f;
            l2 = 0L;
        }
    }

    private static void a(String s, int i, int j)
        throws IOException
    {
        if (j != i)
        {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] {
                s, Integer.valueOf(j), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (l == 0L)
        {
            return 0L;
        }
        if (a == 0)
        {
            b.a(10L);
            byte byte0 = b.a().b(3L);
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
                a(b.a(), 0L, 10L);
            }
            a("ID1ID2", 8075, b.f());
            b.f(8L);
            if ((byte0 >> 2 & 1) == 1)
            {
                b.a(2L);
                if (flag)
                {
                    a(b.a(), 0L, 2L);
                }
                int i = b.a().h();
                b.a(i);
                if (flag)
                {
                    a(b.a(), 0L, i);
                }
                b.f(i);
            }
            if ((byte0 >> 3 & 1) == 1)
            {
                long l1 = b.a((byte)0);
                if (l1 == -1L)
                {
                    throw new EOFException();
                }
                if (flag)
                {
                    a(b.a(), 0L, 1L + l1);
                }
                b.f(1L + l1);
            }
            if ((byte0 >> 4 & 1) == 1)
            {
                long l2 = b.a((byte)0);
                if (l2 == -1L)
                {
                    throw new EOFException();
                }
                if (flag)
                {
                    a(b.a(), 0L, 1L + l2);
                }
                b.f(1L + l2);
            }
            if (flag)
            {
                a("FHCRC", b.h(), (short)(int)e.getValue());
                e.reset();
            }
            a = 1;
        }
        if (a == 1)
        {
            long l3 = e1.b;
            l = d.a(e1, l);
            if (l != -1L)
            {
                a(e1, l3, l);
                return l;
            }
            a = 2;
        }
        if (a == 2)
        {
            a("CRC", b.i(), (int)e.getValue());
            a("ISIZE", b.i(), c.getTotalOut());
            a = 3;
            if (!b.c())
            {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void close()
        throws IOException
    {
        d.close();
    }

    public final z timeout()
    {
        return b.timeout();
    }
}
