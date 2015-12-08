// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package c:
//            y, o, h, e, 
//            v, w, z

public final class n
    implements y
{

    private final h a;
    private final Inflater b;
    private int c;
    private boolean d;

    n(h h1, Inflater inflater)
    {
        if (h1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = h1;
            b = inflater;
            return;
        }
    }

    public n(y y1, Inflater inflater)
    {
        this(o.a(y1), inflater);
    }

    private void b()
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

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (d)
        {
            throw new IllegalStateException("closed");
        }
        if (l == 0L)
        {
            return 0L;
        }
_L2:
        boolean flag = a();
        v v1;
        int i;
        try
        {
            v1 = e1.d(1);
            i = b.inflate(v1.a, v1.c, 2048 - v1.c);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new IOException(e1);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        v1.c = v1.c + i;
        e1.b = e1.b + (long)i;
        return (long)i;
        if (b.finished() || b.needsDictionary())
        {
            b();
            if (v1.b == v1.c)
            {
                e1.a = v1.a();
                w.a(v1);
            }
            break MISSING_BLOCK_LABEL_209;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new EOFException("source exhausted prematurely");
        return -1L;
    }

    public final boolean a()
        throws IOException
    {
        if (!b.needsInput())
        {
            return false;
        }
        b();
        if (b.getRemaining() != 0)
        {
            throw new IllegalStateException("?");
        }
        if (a.c())
        {
            return true;
        } else
        {
            v v1 = a.a().a;
            c = v1.c - v1.b;
            b.setInput(v1.a, v1.b, c);
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

    public final z timeout()
    {
        return a.timeout();
    }
}
