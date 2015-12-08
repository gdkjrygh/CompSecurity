// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bbz extends qst
{

    public long a[];
    private long b;
    private int c;

    public bbz()
    {
        super("stsz");
        a = new long[0];
    }

    public final long a(int i)
    {
        if (b > 0L)
        {
            return b;
        } else
        {
            return a[i];
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        b = b.a(bytebuffer);
        c = b.f(b.a(bytebuffer));
        if (b == 0L)
        {
            a = new long[c];
            for (int i = 0; i < c; i++)
            {
                a[i] = b.a(bytebuffer);
            }

        }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, b);
        if (b == 0L)
        {
            bax.b(bytebuffer, a.length);
            long al[] = a;
            int j = al.length;
            for (int i = 0; i < j; i++)
            {
                bax.b(bytebuffer, al[i]);
            }

        } else
        {
            bax.b(bytebuffer, c);
        }
    }

    public final long d()
    {
        if (b > 0L)
        {
            return (long)c;
        } else
        {
            return (long)a.length;
        }
    }

    protected final long e()
    {
        int i;
        if (b == 0L)
        {
            i = a.length << 2;
        } else
        {
            i = 0;
        }
        return (long)(i + 12);
    }

    public final String toString()
    {
        long l = b;
        long l1 = d();
        return (new StringBuilder(79)).append("SampleSizeBox[sampleSize=").append(l).append(";sampleCount=").append(l1).append("]").toString();
    }
}
