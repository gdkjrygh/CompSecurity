// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            n, c, r, t

final class nputStream extends InputStream
{

    final n a;

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
            return a.a.f() & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (a.c)
        {
            throw new IOException("closed");
        }
        t.a(abyte0.length, i, j);
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

    .String(n n1)
    {
        a = n1;
        super();
    }
}
