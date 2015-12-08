// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bcj extends qst
{

    public long a[];

    public bcj()
    {
        super("stss");
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

    protected final long e()
    {
        return (long)((a.length << 2) + 8);
    }

    public final String toString()
    {
        int i = a.length;
        return (new StringBuilder(37)).append("SyncSampleBox[entryCount=").append(i).append("]").toString();
    }
}
