// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

final class bdj
    implements qsw
{

    private long a;
    private qsw b;

    bdj(bdi bdi, long l, qsw qsw1)
    {
        a = l;
        b = qsw1;
        super();
    }

    public final int a(ByteBuffer bytebuffer)
    {
        if (a == b.b())
        {
            return -1;
        }
        if ((long)bytebuffer.remaining() > a - b.b())
        {
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(b.f(a - b.b()));
            b.a(bytebuffer1);
            bytebuffer.put((ByteBuffer)bytebuffer1.rewind());
            return bytebuffer1.capacity();
        } else
        {
            return b.a(bytebuffer);
        }
    }

    public final long a()
    {
        return a;
    }

    public final long a(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return b.a(l, l1, writablebytechannel);
    }

    public final ByteBuffer a(long l, long l1)
    {
        return b.a(l, l1);
    }

    public final void a(long l)
    {
        b.a(l);
    }

    public final long b()
    {
        return b.b();
    }

    public final void close()
    {
        b.close();
    }
}
