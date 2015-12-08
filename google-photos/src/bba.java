// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bba extends bbb
{

    private long a[];

    public bba()
    {
        super("co64");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new long[j];
        for (int i = 0; i < j; i++)
        {
            a[i] = b.e(bytebuffer);
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
            bax.a(bytebuffer, al[i]);
        }

    }

    public final long[] d()
    {
        return a;
    }

    protected final long e()
    {
        return (long)(a.length * 8 + 8);
    }
}
