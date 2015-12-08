// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package okio:
//            r, l, e, c, 
//            o, p, s

public final class k
    implements r
{

    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    k(e e1, Inflater inflater)
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = e1;
            b = inflater;
            return;
        }
    }

    public k(r r1, Inflater inflater)
    {
        this(l.a(r1), inflater);
    }

    private void c()
        throws IOException
    {
        if (c == 0)
        {
            return;
        } else
        {
            int i = c - b.getRemaining();
            c = c - i;
            a.f(i);
            return;
        }
    }

    public final long a(c c1, long l1)
        throws IOException
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
        }
        if (d)
        {
            throw new IllegalStateException("closed");
        }
        if (l1 == 0L)
        {
            return 0L;
        }
_L2:
        boolean flag = b();
        o o1;
        int i;
        try
        {
            o1 = c1.e(1);
            i = b.inflate(o1.a, o1.c, 2048 - o1.c);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw new IOException(c1);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        o1.c = o1.c + i;
        c1.b = c1.b + (long)i;
        return (long)i;
        if (b.finished() || b.needsDictionary())
        {
            c();
            if (o1.b == o1.c)
            {
                c1.a = o1.a();
                p.a(o1);
            }
            break MISSING_BLOCK_LABEL_209;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new EOFException("source exhausted prematurely");
        return -1L;
    }

    public final boolean b()
        throws IOException
    {
        if (!b.needsInput())
        {
            return false;
        }
        c();
        if (b.getRemaining() != 0)
        {
            throw new IllegalStateException("?");
        }
        if (a.d())
        {
            return true;
        } else
        {
            o o1 = a.b().a;
            c = o1.c - o1.b;
            b.setInput(o1.a, o1.b, c);
            return false;
        }
    }

    public final void close()
        throws IOException
    {
        if (d)
        {
            return;
        } else
        {
            b.end();
            d = true;
            a.close();
            return;
        }
    }

    public final s q_()
    {
        return a.q_();
    }
}
