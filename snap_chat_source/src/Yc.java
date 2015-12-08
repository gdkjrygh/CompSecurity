// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;

public final class Yc
    implements ain
{

    public final ahX a;
    private boolean b;
    private final int c;

    public Yc()
    {
        this(-1);
    }

    public Yc(int i)
    {
        a = new ahX();
        c = i;
    }

    public final void a(ain ain1)
    {
        ahX ahx = new ahX();
        a.a(ahx, 0L, a.b);
        ain1.a_(ahx, ahx.b);
    }

    public final void a_(ahX ahx, long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        XO.a(ahx.b, l);
        if (c != -1 && a.b > (long)c - l)
        {
            throw new ProtocolException((new StringBuilder("exceeded content-length limit of ")).append(c).append(" bytes").toString());
        } else
        {
            a.a_(ahx, l);
            return;
        }
    }

    public final aip aa_()
    {
        return aip.b;
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
