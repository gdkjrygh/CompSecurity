// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

// Referenced classes of package okio:
//            r, l, k, c, 
//            o, e, s

public final class j
    implements r
{

    private int a;
    private final e b;
    private final Inflater c;
    private final k d;
    private final CRC32 e = new CRC32();

    public j(r r1)
    {
        a = 0;
        if (r1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            c = new Inflater(true);
            b = l.a(r1);
            d = new k(b, c);
            return;
        }
    }

    private static void a(String s, int i, int i1)
        throws IOException
    {
        if (i1 != i)
        {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] {
                s, Integer.valueOf(i1), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    private void a(c c1, long l1, long l2)
    {
        c1 = c1.a;
        Object obj;
        long l3;
        long l4;
        do
        {
            obj = c1;
            l3 = l1;
            l4 = l2;
            if (l1 < (long)(((o) (c1)).c - ((o) (c1)).b))
            {
                break;
            }
            l1 -= ((o) (c1)).c - ((o) (c1)).b;
            c1 = ((o) (c1)).f;
        } while (true);
        while (l4 > 0L) 
        {
            int i = (int)((long)((o) (obj)).b + l3);
            int i1 = (int)Math.min(((o) (obj)).c - i, l4);
            e.update(((o) (obj)).a, i, i1);
            l4 -= i1;
            obj = ((o) (obj)).f;
            l3 = 0L;
        }
    }

    public final long a(c c1, long l1)
        throws IOException
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (l1 == 0L)
        {
            return 0L;
        }
        if (a == 0)
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
            a("ID1ID2", 8075, b.g());
            b.f(8L);
            if ((byte0 >> 2 & 1) == 1)
            {
                b.a(2L);
                if (flag)
                {
                    a(b.b(), 0L, 2L);
                }
                int i = b.b().j();
                b.a(i);
                if (flag)
                {
                    a(b.b(), 0L, i);
                }
                b.f(i);
            }
            if ((byte0 >> 3 & 1) == 1)
            {
                long l2 = b.a((byte)0);
                if (l2 == -1L)
                {
                    throw new EOFException();
                }
                if (flag)
                {
                    a(b.b(), 0L, 1L + l2);
                }
                b.f(1L + l2);
            }
            if ((byte0 >> 4 & 1) == 1)
            {
                long l3 = b.a((byte)0);
                if (l3 == -1L)
                {
                    throw new EOFException();
                }
                if (flag)
                {
                    a(b.b(), 0L, 1L + l3);
                }
                b.f(1L + l3);
            }
            if (flag)
            {
                a("FHCRC", b.j(), (short)(int)e.getValue());
                e.reset();
            }
            a = 1;
        }
        if (a == 1)
        {
            long l4 = c1.b;
            l1 = d.a(c1, l1);
            if (l1 != -1L)
            {
                a(c1, l4, l1);
                return l1;
            }
            a = 2;
        }
        if (a == 2)
        {
            a("CRC", b.k(), (int)e.getValue());
            a("ISIZE", b.k(), c.getTotalOut());
            a = 3;
            if (!b.d())
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

    public final s q_()
    {
        return b.q_();
    }
}
