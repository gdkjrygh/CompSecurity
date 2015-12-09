// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;

final class gue
    implements hcv
{

    private final hcn a;
    private boolean b;
    private long c;
    private gua d;

    private gue(gua gua1, long l)
    {
        d = gua1;
        super();
        a = new hcn(d.d.T_());
        c = l;
    }

    gue(gua gua1, long l, byte byte0)
    {
        this(gua1, l);
    }

    public final hcx T_()
    {
        return a;
    }

    public final void a_(hch hch1, long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        gsp.a(hch1.b, l);
        if (l > c)
        {
            throw new ProtocolException((new StringBuilder("expected ")).append(c).append(" bytes but received ").append(l).toString());
        } else
        {
            d.d.a_(hch1, l);
            c = c - l;
            return;
        }
    }

    public final void close()
    {
        if (b)
        {
            return;
        }
        b = true;
        if (c > 0L)
        {
            throw new ProtocolException("unexpected end of stream");
        } else
        {
            gua.a(a);
            d.e = 3;
            return;
        }
    }

    public final void flush()
    {
        if (b)
        {
            return;
        } else
        {
            d.d.flush();
            return;
        }
    }
}
