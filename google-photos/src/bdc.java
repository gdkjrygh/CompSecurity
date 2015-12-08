// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class bdc extends bdb
{

    public int b;
    public int c;
    public long d;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private long u;
    private byte v[];

    public bdc(String s1)
    {
        super(s1);
    }

    public final void a(WritableByteChannel writablebytechannel)
    {
        byte byte1 = 0;
        writablebytechannel.write(m());
        ByteBuffer bytebuffer;
        byte byte0;
        if (m == 1)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        if (m == 2)
        {
            byte1 = 36;
        }
        bytebuffer = ByteBuffer.allocate(byte0 + 28 + byte1);
        bytebuffer.position(6);
        bax.b(bytebuffer, a);
        bax.b(bytebuffer, m);
        bax.b(bytebuffer, t);
        bax.b(bytebuffer, u);
        bax.b(bytebuffer, b);
        bax.b(bytebuffer, c);
        bax.b(bytebuffer, n);
        bax.b(bytebuffer, o);
        if (f.equals("mlpa"))
        {
            bax.b(bytebuffer, d);
        } else
        {
            bax.b(bytebuffer, d << 16);
        }
        if (m == 1)
        {
            bax.b(bytebuffer, p);
            bax.b(bytebuffer, q);
            bax.b(bytebuffer, r);
            bax.b(bytebuffer, s);
        }
        if (m == 2)
        {
            bax.b(bytebuffer, p);
            bax.b(bytebuffer, q);
            bax.b(bytebuffer, r);
            bax.b(bytebuffer, s);
            bytebuffer.put(v);
        }
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        b(writablebytechannel);
    }

    public final void a(qsw qsw1, ByteBuffer bytebuffer, long l, bau bau)
    {
        byte byte0 = 36;
        int i = 16;
        boolean flag = false;
        bytebuffer = ByteBuffer.allocate(28);
        qsw1.a(bytebuffer);
        bytebuffer.position(6);
        a = b.c(bytebuffer);
        m = b.c(bytebuffer);
        t = b.c(bytebuffer);
        u = b.a(bytebuffer);
        b = b.c(bytebuffer);
        c = b.c(bytebuffer);
        n = b.c(bytebuffer);
        o = b.c(bytebuffer);
        d = b.a(bytebuffer);
        if (!f.equals("mlpa"))
        {
            d = d >>> 16;
        }
        if (m == 1)
        {
            bytebuffer = ByteBuffer.allocate(16);
            qsw1.a(bytebuffer);
            bytebuffer.rewind();
            p = b.a(bytebuffer);
            q = b.a(bytebuffer);
            r = b.a(bytebuffer);
            s = b.a(bytebuffer);
        }
        if (m == 2)
        {
            bytebuffer = ByteBuffer.allocate(36);
            qsw1.a(bytebuffer);
            bytebuffer.rewind();
            p = b.a(bytebuffer);
            q = b.a(bytebuffer);
            r = b.a(bytebuffer);
            s = b.a(bytebuffer);
            v = new byte[20];
            bytebuffer.get(v);
        }
        if ("owma".equals(f))
        {
            System.err.println("owma");
            long l1;
            if (m != 1)
            {
                i = 0;
            }
            l1 = i;
            i = ((flag) ? 1 : 0);
            if (m == 2)
            {
                i = 36;
            }
            l = l - 28L - l1 - (long)i;
            bytebuffer = ByteBuffer.allocate(b.f(l));
            qsw1.a(bytebuffer);
            a(((baz) (new bdd(this, l, bytebuffer))));
            return;
        }
        long l2;
        if (m != 1)
        {
            i = 0;
        }
        l2 = i;
        if (m == 2)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        a(qsw1, l - 28L - l2 - (long)i, bau);
    }

    public final long b()
    {
        byte byte1 = 16;
        byte byte0 = 0;
        int i;
        long l;
        if (m == 1)
        {
            i = 16;
        } else
        {
            i = 0;
        }
        if (m == 2)
        {
            byte0 = 36;
        }
        l = (long)(i + 28 + byte0) + n();
        i = byte1;
        if (!g)
        {
            if (8L + l >= 0x100000000L)
            {
                i = byte1;
            } else
            {
                i = 8;
            }
        }
        return (long)i + l;
    }

    public final String toString()
    {
        String s1 = String.valueOf("AudioSampleEntry{bytesPerSample=");
        long l1 = s;
        long l2 = r;
        long l3 = q;
        long l4 = p;
        int i = o;
        int j = n;
        int k = m;
        long l5 = d;
        int l = c;
        int i1 = b;
        String s2 = String.valueOf(d());
        return (new StringBuilder(String.valueOf(s1).length() + 301 + String.valueOf(s2).length())).append(s1).append(l1).append(", bytesPerFrame=").append(l2).append(", bytesPerPacket=").append(l3).append(", samplesPerPacket=").append(l4).append(", packetSize=").append(i).append(", compressionId=").append(j).append(", soundVersion=").append(k).append(", sampleRate=").append(l5).append(", sampleSize=").append(l).append(", channelCount=").append(i1).append(", boxes=").append(s2).append("}").toString();
    }
}
