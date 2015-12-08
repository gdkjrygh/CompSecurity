// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Date;

public class bbu extends qst
{

    public Date a;
    public Date b;
    public long c;
    public long d;
    public qvc e;
    public long f;
    private double g;
    private float h;
    private int i;
    private int j;
    private int p;
    private int q;
    private int r;
    private int s;

    public bbu()
    {
        super("mvhd");
        g = 1.0D;
        h = 1.0F;
        e = qvc.h;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        if (l() == 1)
        {
            a = b.g(b.e(bytebuffer));
            b = b.g(b.e(bytebuffer));
            c = b.a(bytebuffer);
            d = b.e(bytebuffer);
        } else
        {
            a = b.g(b.a(bytebuffer));
            b = b.g(b.a(bytebuffer));
            c = b.a(bytebuffer);
            d = b.a(bytebuffer);
        }
        g = b.f(bytebuffer);
        h = b.h(bytebuffer);
        b.c(bytebuffer);
        b.a(bytebuffer);
        b.a(bytebuffer);
        e = qvc.a(bytebuffer);
        i = bytebuffer.getInt();
        j = bytebuffer.getInt();
        p = bytebuffer.getInt();
        q = bytebuffer.getInt();
        r = bytebuffer.getInt();
        s = bytebuffer.getInt();
        f = b.a(bytebuffer);
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        if (l() == 1)
        {
            bax.a(bytebuffer, b.a(a));
            bax.a(bytebuffer, b.a(b));
            bax.b(bytebuffer, c);
            bax.a(bytebuffer, d);
        } else
        {
            bax.b(bytebuffer, b.a(a));
            bax.b(bytebuffer, b.a(b));
            bax.b(bytebuffer, c);
            bax.b(bytebuffer, d);
        }
        bax.a(bytebuffer, g);
        bax.c(bytebuffer, h);
        bax.b(bytebuffer, 0);
        bax.b(bytebuffer, 0L);
        bax.b(bytebuffer, 0L);
        e.b(bytebuffer);
        bytebuffer.putInt(i);
        bytebuffer.putInt(j);
        bytebuffer.putInt(p);
        bytebuffer.putInt(q);
        bytebuffer.putInt(r);
        bytebuffer.putInt(s);
        bax.b(bytebuffer, f);
    }

    protected final long e()
    {
        long l;
        if (l() == 1)
        {
            l = 32L;
        } else
        {
            l = 20L;
        }
        return l + 80L;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MovieHeaderBox[");
        stringbuilder.append("creationTime=").append(a);
        stringbuilder.append(";");
        stringbuilder.append("modificationTime=").append(b);
        stringbuilder.append(";");
        stringbuilder.append("timescale=").append(c);
        stringbuilder.append(";");
        stringbuilder.append("duration=").append(d);
        stringbuilder.append(";");
        stringbuilder.append("rate=").append(g);
        stringbuilder.append(";");
        stringbuilder.append("volume=").append(h);
        stringbuilder.append(";");
        stringbuilder.append("matrix=").append(e);
        stringbuilder.append(";");
        stringbuilder.append("nextTrackId=").append(f);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
