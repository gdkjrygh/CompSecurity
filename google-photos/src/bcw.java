// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bcw extends qst
{

    public long a;
    public long b;
    public long c;
    public long d;
    public bct e;
    private long f;
    private boolean g;
    private boolean h;

    public bcw()
    {
        super("tfhd");
        b = -1L;
        c = -1L;
        d = -1L;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        a = b.a(bytebuffer);
        if ((m() & 1) == 1)
        {
            b = b.e(bytebuffer);
        }
        if ((m() & 2) == 2)
        {
            f = b.a(bytebuffer);
        }
        if ((m() & 8) == 8)
        {
            c = b.a(bytebuffer);
        }
        if ((m() & 0x10) == 16)
        {
            d = b.a(bytebuffer);
        }
        if ((m() & 0x20) == 32)
        {
            e = new bct(bytebuffer);
        }
        if ((m() & 0x10000) == 0x10000)
        {
            g = true;
        }
        if ((m() & 0x20000) == 0x20000)
        {
            h = true;
        }
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a);
        if ((m() & 1) == 1)
        {
            bax.a(bytebuffer, b);
        }
        if ((m() & 2) == 2)
        {
            bax.b(bytebuffer, f);
        }
        if ((m() & 8) == 8)
        {
            bax.b(bytebuffer, c);
        }
        if ((m() & 0x10) == 16)
        {
            bax.b(bytebuffer, d);
        }
        if ((m() & 0x20) == 32)
        {
            e.a(bytebuffer);
        }
    }

    protected final long e()
    {
        long l1 = 8L;
        int i = m();
        if ((i & 1) == 1)
        {
            l1 = 16L;
        }
        long l = l1;
        if ((i & 2) == 2)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 8) == 8)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((i & 0x10) == 16)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 0x20) == 32)
        {
            l1 = l + 4L;
        }
        return l1;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TrackFragmentHeaderBox");
        stringbuilder.append("{trackId=").append(a);
        stringbuilder.append(", baseDataOffset=").append(b);
        stringbuilder.append(", sampleDescriptionIndex=").append(f);
        stringbuilder.append(", defaultSampleDuration=").append(c);
        stringbuilder.append(", defaultSampleSize=").append(d);
        stringbuilder.append(", defaultSampleFlags=").append(e);
        stringbuilder.append(", durationIsEmpty=").append(g);
        stringbuilder.append(", defaultBaseIsMoof=").append(h);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
