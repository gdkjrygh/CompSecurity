// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ac extends InputStream
{

    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;

    public ac(InputStream inputstream)
    {
        this(inputstream, 4096);
    }

    public ac(InputStream inputstream, int i)
    {
        e = -1L;
        Object obj = inputstream;
        if (!inputstream.markSupported())
        {
            obj = new BufferedInputStream(inputstream, i);
        }
        a = ((InputStream) (obj));
    }

    private void a(long l, long l1)
    {
        do
        {
            long l2;
label0:
            {
label1:
                {
                    if (l < l1)
                    {
                        long l3 = a.skip(l1 - l);
                        l2 = l3;
                        if (l3 != 0L)
                        {
                            break label0;
                        }
                        if (read() != -1)
                        {
                            break label1;
                        }
                    }
                    return;
                }
                l2 = 1L;
            }
            l += l2;
        } while (true);
    }

    private void b(long l)
    {
        if (c >= b || b > d)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        a.reset();
        a.mark((int)(l - c));
        a(c, b);
_L1:
        d = l;
        return;
        try
        {
            c = b;
            a.mark((int)(l - b));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to mark: ").append(ioexception).toString());
        }
          goto _L1
    }

    public long a(int i)
    {
        long l = b + (long)i;
        if (d < l)
        {
            b(l);
        }
        return b;
    }

    public void a(long l)
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

    public int available()
    {
        return a.available();
    }

    public void close()
    {
        a.close();
    }

    public void mark(int i)
    {
        e = a(i);
    }

    public boolean markSupported()
    {
        return a.markSupported();
    }

    public int read()
    {
        int i = a.read();
        if (i != -1)
        {
            b = b + 1L;
        }
        return i;
    }

    public int read(byte abyte0[])
    {
        int i = a.read(abyte0);
        if (i != -1)
        {
            b = b + (long)i;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = a.read(abyte0, i, j);
        if (i != -1)
        {
            b = b + (long)i;
        }
        return i;
    }

    public void reset()
    {
        a(e);
    }

    public long skip(long l)
    {
        l = a.skip(l);
        b = b + l;
        return l;
    }
}
