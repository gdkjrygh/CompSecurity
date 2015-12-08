// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package c:
//            ad, r, j, f, 
//            z, aa, ae

public final class q
    implements ad
{

    private final j a;
    private final Inflater b;
    private int c;
    private boolean d;

    public q(ad ad1, Inflater inflater)
    {
        this(r.a(ad1), inflater);
    }

    q(j j1, Inflater inflater)
    {
        if (j1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = j1;
            b = inflater;
            return;
        }
    }

    private void b()
    {
        if (c == 0)
        {
            return;
        } else
        {
            int i = c - b.getRemaining();
            c = c - i;
            a.g(i);
            return;
        }
    }

    public boolean a()
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
        if (a.f())
        {
            return true;
        } else
        {
            z z1 = a.b().a;
            c = z1.c - z1.b;
            b.setInput(z1.a, z1.b, c);
            return false;
        }
    }

    public void close()
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

    public long read(f f1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
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
        z z1;
        int i;
        try
        {
            z1 = f1.e(1);
            i = b.inflate(z1.a, z1.c, 2048 - z1.c);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new IOException(f1);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        z1.c = z1.c + i;
        f1.b = f1.b + (long)i;
        return (long)i;
        if (b.finished() || b.needsDictionary())
        {
            b();
            if (z1.b == z1.c)
            {
                f1.a = z1.a();
                aa.a(z1);
            }
            break MISSING_BLOCK_LABEL_212;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new EOFException("source exhausted prematurely");
        return -1L;
    }

    public ae timeout()
    {
        return a.timeout();
    }
}
