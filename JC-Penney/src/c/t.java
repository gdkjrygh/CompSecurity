// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.InputStream;

// Referenced classes of package c:
//            ad, ae, f, z

final class t
    implements ad
{

    final ae a;
    final InputStream b;

    t(ae ae1, InputStream inputstream)
    {
        a = ae1;
        b = inputstream;
        super();
    }

    public void close()
    {
        b.close();
    }

    public long read(f f1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (l == 0L)
        {
            return 0L;
        }
        a.throwIfReached();
        z z1 = f1.e(1);
        int i = (int)Math.min(l, 2048 - z1.c);
        i = b.read(z1.a, z1.c, i);
        if (i == -1)
        {
            return -1L;
        } else
        {
            z1.c = z1.c + i;
            f1.b = f1.b + (long)i;
            return (long)i;
        }
    }

    public ae timeout()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("source(").append(b).append(")").toString();
    }
}
