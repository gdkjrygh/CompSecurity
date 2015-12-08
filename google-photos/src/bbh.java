// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public final class bbh extends qss
    implements baz
{

    private int a;
    private int b;

    public bbh()
    {
        super("dref");
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(m());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bax.c(bytebuffer, a);
        bax.a(bytebuffer, b);
        bax.b(bytebuffer, d().size());
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        b(writablebytechannel);
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        bytebuffer = ByteBuffer.allocate(8);
        qsw1.a(bytebuffer);
        bytebuffer.rewind();
        a = b.a(bytebuffer.get());
        b = b.b(bytebuffer);
        a(qsw1, l - 8L, bau);
    }

    public final long b()
    {
        long l = n();
        int i;
        if (g || l + 8L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 8L);
    }
}
