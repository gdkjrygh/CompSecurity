// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.h;
import com.c.a.a.i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a.a:
//            e

private final class a extends a
{

    final com.c.a.a.a.e c;
    private long d;

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (a)
        {
            throw new IllegalStateException("closed");
        }
        if (d == 0L)
        {
            return -1L;
        }
        l = c.c.a(e1, Math.min(d, l));
        if (l == -1L)
        {
            a();
            throw new ProtocolException("unexpected end of stream");
        }
        d = d - l;
        if (d == 0L)
        {
            a(true);
        }
        return l;
    }

    public final void close()
        throws IOException
    {
        if (a)
        {
            return;
        }
        if (d != 0L && !i.a(this, TimeUnit.MILLISECONDS))
        {
            a();
        }
        a = true;
    }

    public ion(com.c.a.a.a.e e1, long l)
        throws IOException
    {
        c = e1;
        super(e1, (byte)0);
        d = l;
        if (d == 0L)
        {
            a(true);
        }
    }
}
