// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class hcp
    implements hcw
{

    private final hcj a;
    private final Inflater b;
    private int c;
    private boolean d;

    hcp(hcj hcj1, Inflater inflater)
    {
        if (hcj1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = hcj1;
            b = inflater;
            return;
        }
    }

    public hcp(hcw hcw1, Inflater inflater)
    {
        this(hcq.a(hcw1), inflater);
    }

    private void c()
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

    public final hcx T_()
    {
        return a.T_();
    }

    public final long a(hch hch1, long l)
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
        boolean flag = b();
        hct hct1;
        int i;
        try
        {
            hct1 = hch1.e(1);
            i = b.inflate(hct1.a, hct1.c, 2048 - hct1.c);
        }
        // Misplaced declaration of an exception variable
        catch (hch hch1)
        {
            throw new IOException(hch1);
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        hct1.c = hct1.c + i;
        hch1.b = hch1.b + (long)i;
        return (long)i;
        if (b.finished() || b.needsDictionary())
        {
            c();
            if (hct1.b == hct1.c)
            {
                hch1.a = hct1.a();
                hcu.a(hct1);
            }
            break MISSING_BLOCK_LABEL_209;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new EOFException("source exhausted prematurely");
        return -1L;
    }

    public final boolean b()
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
        if (a.e())
        {
            return true;
        } else
        {
            hct hct1 = a.b().a;
            c = hct1.c - hct1.b;
            b.setInput(hct1.a, hct1.b, c);
            return false;
        }
    }

    public final void close()
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
}
