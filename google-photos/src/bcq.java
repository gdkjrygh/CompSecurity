// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bcq extends bay
{

    private int a;
    private int b[] = {
        0, 0, 0
    };

    public bcq()
    {
        super("vmhd");
        a = 0;
        super.o = 1;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        a = b.c(bytebuffer);
        b = new int[3];
        for (int i = 0; i < 3; i++)
        {
            b[i] = b.c(bytebuffer);
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a);
        int ai[] = b;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            bax.b(bytebuffer, ai[i]);
        }

    }

    protected final long e()
    {
        return 12L;
    }

    public final String toString()
    {
        int i = a;
        int j = b[0];
        int k = b[1];
        int l = b[2];
        return (new StringBuilder(108)).append("VideoMediaHeaderBox[graphicsmode=").append(i).append(";opcolor0=").append(j).append(";opcolor1=").append(k).append(";opcolor2=").append(l).append("]").toString();
    }
}
