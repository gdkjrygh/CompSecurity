// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Date;

public final class bbr extends qst
{

    public Date a;
    public Date b;
    public long c;
    public long d;
    public String e;

    public bbr()
    {
        super("mdhd");
        a = new Date();
        b = new Date();
        e = "eng";
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        StringBuilder stringbuilder;
        int j;
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
        j = b.c(bytebuffer);
        stringbuilder = new StringBuilder();
        for (int i = 0; i < 3; i++)
        {
            stringbuilder.append((char)((j >> (2 - i) * 5 & 0x1f) + 96));
        }

        e = stringbuilder.toString();
        b.c(bytebuffer);
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
        bax.a(bytebuffer, e);
        bax.b(bytebuffer, 0);
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
        return l + 2L + 2L;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaHeaderBox[");
        stringbuilder.append("creationTime=").append(a);
        stringbuilder.append(";");
        stringbuilder.append("modificationTime=").append(b);
        stringbuilder.append(";");
        stringbuilder.append("timescale=").append(c);
        stringbuilder.append(";");
        stringbuilder.append("duration=").append(d);
        stringbuilder.append(";");
        stringbuilder.append("language=").append(e);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
