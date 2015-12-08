// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.g;
import c.x;
import c.z;
import com.c.a.a.i;
import java.io.IOException;
import java.net.ProtocolException;

// Referenced classes of package com.c.a.a.a:
//            e

private final class <init>
    implements x
{

    final com.c.a.a.a.e a;
    private boolean b;
    private long c;

    public final void close()
        throws IOException
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
            a.e = 3;
            return;
        }
    }

    public final void flush()
        throws IOException
    {
        if (b)
        {
            return;
        } else
        {
            a.d.flush();
            return;
        }
    }

    public final z timeout()
    {
        return a.d.timeout();
    }

    public final void write(e e1, long l)
        throws IOException
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        i.a(e1.b, 0L, l);
        if (l > c)
        {
            throw new ProtocolException((new StringBuilder("expected ")).append(c).append(" bytes but received ").append(l).toString());
        } else
        {
            a.d.write(e1, l);
            c = c - l;
            return;
        }
    }

    private ion(com.c.a.a.a.e e1, long l)
    {
        a = e1;
        super();
        c = l;
    }

    c(com.c.a.a.a.e e1, long l, byte byte0)
    {
        this(e1, l);
    }
}
