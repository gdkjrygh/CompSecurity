// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package c:
//            y, z, e, v

final class q
    implements y
{

    final z a;
    final InputStream b;

    q(z z1, InputStream inputstream)
    {
        a = z1;
        b = inputstream;
        super();
    }

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (l == 0L)
        {
            return 0L;
        }
        a.g();
        v v1 = e1.d(1);
        int i = (int)Math.min(l, 2048 - v1.c);
        i = b.read(v1.a, v1.c, i);
        if (i == -1)
        {
            return -1L;
        } else
        {
            v1.c = v1.c + i;
            e1.b = e1.b + (long)i;
            return (long)i;
        }
    }

    public final void close()
        throws IOException
    {
        b.close();
    }

    public final z timeout()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("source(")).append(b).append(")").toString();
    }
}
