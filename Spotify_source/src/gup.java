// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;

public final class gup
    implements hcv
{

    final hch a;
    private boolean b;
    private final int c;

    public gup()
    {
        this(-1);
    }

    public gup(int i)
    {
        a = new hch();
        c = i;
    }

    public final hcx T_()
    {
        return hcx.b;
    }

    public final void a(hcv hcv1)
    {
        hch hch1 = new hch();
        a.a(hch1, 0L, a.b);
        hcv1.a_(hch1, hch1.b);
    }

    public final void a_(hch hch1, long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        gsp.a(hch1.b, l);
        if (c != -1 && a.b > (long)c - l)
        {
            throw new ProtocolException((new StringBuilder("exceeded content-length limit of ")).append(c).append(" bytes").toString());
        } else
        {
            a.a_(hch1, l);
            return;
        }
    }

    public final void close()
    {
        if (!b)
        {
            b = true;
            if (a.b < (long)c)
            {
                throw new ProtocolException((new StringBuilder("content-length promised ")).append(c).append(" bytes, but received ").append(a.b).toString());
            }
        }
    }

    public final void flush()
    {
    }
}
