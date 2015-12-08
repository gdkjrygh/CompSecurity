// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            c

public final class e extends InputStream
{

    protected final c a;
    final InputStream b;
    byte c[];
    int d;
    final int e;

    public e(c c1, InputStream inputstream, byte abyte0[], int i, int j)
    {
        a = c1;
        b = inputstream;
        c = abyte0;
        d = i;
        e = j;
    }

    private void a()
    {
        byte abyte0[] = c;
        if (abyte0 != null)
        {
            c = null;
            if (a != null)
            {
                a.a(abyte0);
            }
        }
    }

    public int available()
        throws IOException
    {
        if (c != null)
        {
            return e - d;
        } else
        {
            return b.available();
        }
    }

    public void close()
        throws IOException
    {
        a();
        b.close();
    }

    public void mark(int i)
    {
        if (c == null)
        {
            b.mark(i);
        }
    }

    public boolean markSupported()
    {
        return c == null && b.markSupported();
    }

    public int read()
        throws IOException
    {
        if (c != null)
        {
            byte abyte0[] = c;
            int i = d;
            d = i + 1;
            i = abyte0[i];
            if (d >= e)
            {
                a();
            }
            return i & 0xff;
        } else
        {
            return b.read();
        }
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (c != null)
        {
            int l = e - d;
            int k = j;
            if (j > l)
            {
                k = l;
            }
            System.arraycopy(c, d, abyte0, i, k);
            d = d + k;
            if (d >= e)
            {
                a();
            }
            return k;
        } else
        {
            return b.read(abyte0, i, j);
        }
    }

    public void reset()
        throws IOException
    {
        if (c == null)
        {
            b.reset();
        }
    }

    public long skip(long l)
        throws IOException
    {
        long l1;
        long l2;
        if (c != null)
        {
            int i = e - d;
            if ((long)i > l)
            {
                d = d + (int)l;
                return l;
            }
            a();
            l1 = (long)i + 0L;
            l -= i;
        } else
        {
            l1 = 0L;
        }
        l2 = l1;
        if (l > 0L)
        {
            l2 = l1 + b.skip(l);
        }
        return l2;
    }
}
