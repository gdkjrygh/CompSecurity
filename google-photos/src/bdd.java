// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

final class bdd
    implements baz
{

    private long a;
    private ByteBuffer b;
    private bdc c;

    bdd(bdc bdc, long l, ByteBuffer bytebuffer)
    {
        c = bdc;
        a = l;
        b = bytebuffer;
        super();
    }

    public final bbe a()
    {
        return c;
    }

    public final void a(bbe bbe)
    {
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        b.rewind();
        writablebytechannel.write(b);
    }

    public final void a(qsw qsw, ByteBuffer bytebuffer, long l, bau bau)
    {
        throw new RuntimeException("NotImplemented");
    }

    public final long b()
    {
        return a;
    }

    public final String c()
    {
        return "----";
    }
}
