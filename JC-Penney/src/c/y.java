// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package c:
//            x, f, ad, ag

class y extends InputStream
{

    final x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public int available()
    {
        if (x.a(a))
        {
            throw new IOException("closed");
        } else
        {
            return (int)Math.min(a.a.b, 0x7fffffffL);
        }
    }

    public void close()
    {
        a.close();
    }

    public int read()
    {
        if (x.a(a))
        {
            throw new IOException("closed");
        }
        if (a.a.b == 0L && a.b.read(a.a, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return a.a.i() & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (x.a(a))
        {
            throw new IOException("closed");
        }
        ag.a(abyte0.length, i, j);
        if (a.a.b == 0L && a.b.read(a.a, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return a.a.a(abyte0, i, j);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(".inputStream()").toString();
    }
}
