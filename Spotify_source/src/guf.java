// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class guf extends gub
{

    private long b;
    private gua c;

    public guf(gua gua1, long l)
    {
        c = gua1;
        super(gua1, (byte)0);
        b = l;
        if (b == 0L)
        {
            a(true);
        }
    }

    public final long a(hch hch, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (a)
        {
            throw new IllegalStateException("closed");
        }
        if (b == 0L)
        {
            return -1L;
        }
        l = c.c.a(hch, Math.min(b, l));
        if (l == -1L)
        {
            b();
            throw new ProtocolException("unexpected end of stream");
        }
        b = b - l;
        if (b == 0L)
        {
            a(true);
        }
        return l;
    }

    public final void close()
    {
        if (a)
        {
            return;
        }
        if (b != 0L && !gsp.a(this, TimeUnit.MILLISECONDS))
        {
            b();
        }
        a = true;
    }
}
