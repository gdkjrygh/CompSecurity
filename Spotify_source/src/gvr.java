// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class gvr extends InputStream
{

    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;

    public gvr(InputStream inputstream)
    {
        this(inputstream, (byte)0);
    }

    private gvr(InputStream inputstream, byte byte0)
    {
        e = -1L;
        Object obj = inputstream;
        if (!inputstream.markSupported())
        {
            obj = new BufferedInputStream(inputstream, 4096);
        }
        a = ((InputStream) (obj));
    }

    private void a(long l, long l1)
    {
        long l2;
        for (; l < l1; l += l2)
        {
            long l3 = a.skip(l1 - l);
            l2 = l3;
            if (l3 != 0L)
            {
                continue;
            }
            if (read() == -1)
            {
                break;
            }
            l2 = 1L;
        }

    }

    public final long a(int i)
    {
        long l = b + (long)i;
        if (d >= l) goto _L2; else goto _L1
_L1:
        if (c >= b || b > d)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        a.reset();
        a.mark((int)(l - c));
        a(c, b);
_L3:
        d = l;
_L2:
        return b;
        try
        {
            c = b;
            a.mark((int)(l - b));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException((new StringBuilder("Unable to mark: ")).append(ioexception).toString());
        }
          goto _L3
    }

    public final void a(long l)
    {
        if (b > d || l < c)
        {
            throw new IOException("Cannot reset");
        } else
        {
            a.reset();
            a(c, l);
            b = l;
            return;
        }
    }

    public final int available()
    {
        return a.available();
    }

    public final void close()
    {
        a.close();
    }

    public final void mark(int i)
    {
        e = a(i);
    }

    public final boolean markSupported()
    {
        return a.markSupported();
    }

    public final int read()
    {
        int i = a.read();
        if (i != -1)
        {
            b = b + 1L;
        }
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i = a.read(abyte0);
        if (i != -1)
        {
            b = b + (long)i;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        i = a.read(abyte0, i, j);
        if (i != -1)
        {
            b = b + (long)i;
        }
        return i;
    }

    public final void reset()
    {
        a(e);
    }

    public final long skip(long l)
    {
        l = a.skip(l);
        b = b + l;
        return l;
    }
}
