// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Date;

public final class bcn extends qst
{

    public Date a;
    public Date b;
    public long c;
    public long d;
    public int e;
    public int f;
    public float g;
    public qvc h;
    public double i;
    public double j;

    public bcn()
    {
        super("tkhd");
        h = qvc.h;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        if (l() == 1)
        {
            a = b.g(b.e(bytebuffer));
            b = b.g(b.e(bytebuffer));
            c = b.a(bytebuffer);
            b.a(bytebuffer);
            d = bytebuffer.getLong();
            if (d < -1L)
            {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else
        {
            a = b.g(b.a(bytebuffer));
            b = b.g(b.a(bytebuffer));
            c = b.a(bytebuffer);
            b.a(bytebuffer);
            d = b.a(bytebuffer);
        }
        b.a(bytebuffer);
        b.a(bytebuffer);
        e = b.c(bytebuffer);
        f = b.c(bytebuffer);
        g = b.h(bytebuffer);
        b.c(bytebuffer);
        h = qvc.a(bytebuffer);
        i = b.f(bytebuffer);
        j = b.f(bytebuffer);
    }

    public final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        if (l() == 1)
        {
            bax.a(bytebuffer, b.a(a));
            bax.a(bytebuffer, b.a(b));
            bax.b(bytebuffer, c);
            bax.b(bytebuffer, 0L);
            bax.a(bytebuffer, d);
        } else
        {
            bax.b(bytebuffer, b.a(a));
            bax.b(bytebuffer, b.a(b));
            bax.b(bytebuffer, c);
            bax.b(bytebuffer, 0L);
            bax.b(bytebuffer, d);
        }
        bax.b(bytebuffer, 0L);
        bax.b(bytebuffer, 0L);
        bax.b(bytebuffer, e);
        bax.b(bytebuffer, f);
        bax.c(bytebuffer, g);
        bax.b(bytebuffer, 0);
        h.b(bytebuffer);
        bax.a(bytebuffer, i);
        bax.a(bytebuffer, j);
    }

    protected final long e()
    {
        long l;
        if (l() == 1)
        {
            l = 36L;
        } else
        {
            l = 24L;
        }
        return l + 60L;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TrackHeaderBox[");
        stringbuilder.append("creationTime=").append(a);
        stringbuilder.append(";");
        stringbuilder.append("modificationTime=").append(b);
        stringbuilder.append(";");
        stringbuilder.append("trackId=").append(c);
        stringbuilder.append(";");
        stringbuilder.append("duration=").append(d);
        stringbuilder.append(";");
        stringbuilder.append("layer=").append(e);
        stringbuilder.append(";");
        stringbuilder.append("alternateGroup=").append(f);
        stringbuilder.append(";");
        stringbuilder.append("volume=").append(g);
        stringbuilder.append(";");
        stringbuilder.append("matrix=").append(h);
        stringbuilder.append(";");
        stringbuilder.append("width=").append(i);
        stringbuilder.append(";");
        stringbuilder.append("height=").append(j);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
