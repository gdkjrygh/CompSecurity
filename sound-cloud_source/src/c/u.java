// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package c:
//            t, e, y, B

final class u extends InputStream
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public final int available()
        throws IOException
    {
        if (a.c)
        {
            throw new IOException("closed");
        } else
        {
            return (int)Math.min(a.a.b, 0x7fffffffL);
        }
    }

    public final void close()
        throws IOException
    {
        a.close();
    }

    public final int read()
        throws IOException
    {
        if (a.c)
        {
            throw new IOException("closed");
        }
        if (a.a.b == 0L && a.b.a(a.a, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return a.a.e() & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (a.c)
        {
            throw new IOException("closed");
        }
        B.a(abyte0.length, i, j);
        if (a.a.b == 0L && a.b.a(a.a, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return a.a.a(abyte0, i, j);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".inputStream()").toString();
    }
}
