// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.OutputStream;

// Referenced classes of package c:
//            ac, f, ag, ae, 
//            z, aa

final class s
    implements ac
{

    final ae a;
    final OutputStream b;

    s(ae ae1, OutputStream outputstream)
    {
        a = ae1;
        b = outputstream;
        super();
    }

    public void close()
    {
        b.close();
    }

    public void flush()
    {
        b.flush();
    }

    public ae timeout()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("sink(").append(b).append(")").toString();
    }

    public void write(f f1, long l)
    {
        ag.a(f1.b, 0L, l);
        do
        {
            if (l <= 0L)
            {
                break;
            }
            a.throwIfReached();
            z z1 = f1.a;
            int i = (int)Math.min(l, z1.c - z1.b);
            b.write(z1.a, z1.b, i);
            z1.b = z1.b + i;
            long l1 = l - (long)i;
            f1.b = f1.b - (long)i;
            l = l1;
            if (z1.b == z1.c)
            {
                f1.a = z1.a();
                aa.a(z1);
                l = l1;
            }
        } while (true);
    }
}
