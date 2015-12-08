// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;

public final class bde extends bdb
{

    public bde()
    {
        super("mp4s");
    }

    public bde(String s)
    {
        super(s);
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(m());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.position(6);
        bax.b(bytebuffer, a);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        b(writablebytechannel);
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        bytebuffer = ByteBuffer.allocate(8);
        qsw1.a(bytebuffer);
        bytebuffer.position(6);
        a = b.c(bytebuffer);
        a(qsw1, l - 8L, bau);
    }

    public final long b()
    {
        long l = n();
        int i;
        if (g || l + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 8L);
    }

    public final String toString()
    {
        String s = String.valueOf(Arrays.asList(new List[] {
            d()
        }));
        return (new StringBuilder(String.valueOf(s).length() + 15)).append("MpegSampleEntry").append(s).toString();
    }
}
