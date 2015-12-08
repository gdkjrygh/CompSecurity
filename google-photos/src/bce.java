// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bce extends bbb
{

    public long a[];

    public bce()
    {
        super("stco");
        a = new long[0];
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new long[j];
        for (int i = 0; i < j; i++)
        {
            a[i] = b.a(bytebuffer);
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.length);
        long al[] = a;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            bax.b(bytebuffer, al[i]);
        }

    }

    public final long[] d()
    {
        return a;
    }

    protected final long e()
    {
        return (long)((a.length << 2) + 8);
    }
}
