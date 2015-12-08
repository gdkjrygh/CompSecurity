// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package c:
//            x, e, B, z, 
//            v, w

final class p
    implements x
{

    final z a;
    final OutputStream b;

    p(z z1, OutputStream outputstream)
    {
        a = z1;
        b = outputstream;
        super();
    }

    public final void close()
        throws IOException
    {
        b.close();
    }

    public final void flush()
        throws IOException
    {
        b.flush();
    }

    public final z timeout()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("sink(")).append(b).append(")").toString();
    }

    public final void write(e e1, long l)
        throws IOException
    {
        B.a(e1.b, 0L, l);
        do
        {
            if (l <= 0L)
            {
                break;
            }
            a.g();
            v v1 = e1.a;
            int i = (int)Math.min(l, v1.c - v1.b);
            b.write(v1.a, v1.b, i);
            v1.b = v1.b + i;
            long l1 = l - (long)i;
            e1.b = e1.b - (long)i;
            l = l1;
            if (v1.b == v1.c)
            {
                e1.a = v1.a();
                w.a(v1);
                l = l1;
            }
        } while (true);
    }
}
