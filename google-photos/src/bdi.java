// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class bdi extends bdb
    implements bbe
{

    private int b;
    private int c;
    private double d;
    private double m;
    private int n;
    private String o;
    private int p;
    private long q[];

    public bdi()
    {
        super("avc1");
        d = 72D;
        m = 72D;
        n = 1;
        o = "";
        p = 24;
        q = new long[3];
    }

    public bdi(String s)
    {
        super(s);
        d = 72D;
        m = 72D;
        n = 1;
        o = "";
        p = 24;
        q = new long[3];
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(m());
        ByteBuffer bytebuffer = ByteBuffer.allocate(78);
        bytebuffer.position(6);
        bax.b(bytebuffer, a);
        bax.b(bytebuffer, 0);
        bax.b(bytebuffer, 0);
        bax.b(bytebuffer, q[0]);
        bax.b(bytebuffer, q[1]);
        bax.b(bytebuffer, q[2]);
        bax.b(bytebuffer, b);
        bax.b(bytebuffer, c);
        bax.a(bytebuffer, d);
        bax.a(bytebuffer, m);
        bax.b(bytebuffer, 0L);
        bax.b(bytebuffer, n);
        bax.c(bytebuffer, b.h(o));
        bytebuffer.put(b.g(o));
        for (int i = b.h(o); i < 31;)
        {
            i++;
            bytebuffer.put((byte)0);
        }

        bax.b(bytebuffer, p);
        bax.b(bytebuffer, 65535);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        b(writablebytechannel);
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        long l1 = qsw1.b();
        bytebuffer = ByteBuffer.allocate(78);
        qsw1.a(bytebuffer);
        bytebuffer.position(6);
        a = b.c(bytebuffer);
        b.c(bytebuffer);
        b.c(bytebuffer);
        q[0] = b.a(bytebuffer);
        q[1] = b.a(bytebuffer);
        q[2] = b.a(bytebuffer);
        b = b.c(bytebuffer);
        c = b.c(bytebuffer);
        d = b.f(bytebuffer);
        m = b.f(bytebuffer);
        b.a(bytebuffer);
        n = b.c(bytebuffer);
        int j = b.a(bytebuffer.get());
        int i = j;
        if (j > 31)
        {
            System.out.println((new StringBuilder(53)).append("invalid compressor name displayable data: ").append(j).toString());
            i = 31;
        }
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        o = b.a(abyte0);
        if (i < 31)
        {
            bytebuffer.get(new byte[31 - i]);
        }
        p = b.c(bytebuffer);
        b.c(bytebuffer);
        a(((qsw) (new bdj(this, l1 + l, qsw1))), l - 78L, bau);
    }

    public final long b()
    {
        long l = n();
        int i;
        if (g || l + 78L + 8L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 78L);
    }
}
