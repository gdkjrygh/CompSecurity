// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class bdf extends bdb
{

    private long b;
    private int c;
    private int d;
    private int m[];
    private bdg n;
    private bdh o;

    public bdf()
    {
        super("tx3g");
        m = new int[4];
        n = new bdg();
        o = new bdh();
    }

    public bdf(String s)
    {
        super(s);
        m = new int[4];
        n = new bdg();
        o = new bdh();
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(m());
        ByteBuffer bytebuffer = ByteBuffer.allocate(38);
        bytebuffer.position(6);
        bax.b(bytebuffer, a);
        bax.b(bytebuffer, b);
        bax.c(bytebuffer, c);
        bax.c(bytebuffer, d);
        bax.c(bytebuffer, m[0]);
        bax.c(bytebuffer, m[1]);
        bax.c(bytebuffer, m[2]);
        bax.c(bytebuffer, m[3]);
        Object obj = n;
        bax.b(bytebuffer, ((bdg) (obj)).a);
        bax.b(bytebuffer, ((bdg) (obj)).b);
        bax.b(bytebuffer, ((bdg) (obj)).c);
        bax.b(bytebuffer, ((bdg) (obj)).d);
        obj = o;
        bax.b(bytebuffer, ((bdh) (obj)).a);
        bax.b(bytebuffer, ((bdh) (obj)).b);
        bax.b(bytebuffer, ((bdh) (obj)).c);
        bax.c(bytebuffer, ((bdh) (obj)).d);
        bax.c(bytebuffer, ((bdh) (obj)).e);
        bax.c(bytebuffer, ((bdh) (obj)).f[0]);
        bax.c(bytebuffer, ((bdh) (obj)).f[1]);
        bax.c(bytebuffer, ((bdh) (obj)).f[2]);
        bax.c(bytebuffer, ((bdh) (obj)).f[3]);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        b(writablebytechannel);
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        bytebuffer = ByteBuffer.allocate(38);
        qsw1.a(bytebuffer);
        bytebuffer.position(6);
        a = b.c(bytebuffer);
        b = b.a(bytebuffer);
        c = b.a(bytebuffer.get());
        d = b.a(bytebuffer.get());
        m = new int[4];
        m[0] = b.a(bytebuffer.get());
        m[1] = b.a(bytebuffer.get());
        m[2] = b.a(bytebuffer.get());
        m[3] = b.a(bytebuffer.get());
        n = new bdg();
        Object obj = n;
        obj.a = b.c(bytebuffer);
        obj.b = b.c(bytebuffer);
        obj.c = b.c(bytebuffer);
        obj.d = b.c(bytebuffer);
        o = new bdh();
        obj = o;
        obj.a = b.c(bytebuffer);
        obj.b = b.c(bytebuffer);
        obj.c = b.c(bytebuffer);
        obj.d = b.a(bytebuffer.get());
        obj.e = b.a(bytebuffer.get());
        obj.f = new int[4];
        ((bdh) (obj)).f[0] = b.a(bytebuffer.get());
        ((bdh) (obj)).f[1] = b.a(bytebuffer.get());
        ((bdh) (obj)).f[2] = b.a(bytebuffer.get());
        ((bdh) (obj)).f[3] = b.a(bytebuffer.get());
        a(qsw1, l - 38L, bau);
    }

    public final long b()
    {
        long l = n();
        int i;
        if (g || l + 38L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 38L);
    }

    public final String toString()
    {
        return "TextSampleEntry";
    }
}
