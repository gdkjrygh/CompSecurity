// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class bcz
    implements baz
{

    private bbe a;
    private qsw b;
    private long c;
    private long d;

    public bcz()
    {
    }

    public final bbe a()
    {
        return a;
    }

    public final void a(bbe bbe)
    {
        a = bbe;
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        qsw qsw1 = b;
        long l1 = c;
        long l2 = d;
        for (long l = 0L; l < l2; l = qsw1.a(l1 + l, Math.min(0x3ff8000L, l2 - l), writablebytechannel) + l) { }
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        c = qsw1.b() - (long)bytebuffer.remaining();
        b = qsw1;
        d = (long)bytebuffer.remaining() + l;
        qsw1.a(qsw1.b() + l);
    }

    public final long b()
    {
        return d;
    }

    public final String c()
    {
        return "mdat";
    }

    public final String toString()
    {
        String s = String.valueOf("MediaDataBox{size=");
        long l = d;
        return (new StringBuilder(String.valueOf(s).length() + 21)).append(s).append(l).append("}").toString();
    }

    static 
    {
        Logger.getLogger(bcz.getName());
    }
}
