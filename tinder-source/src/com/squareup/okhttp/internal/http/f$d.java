// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.net.ProtocolException;
import okio.c;
import okio.d;
import okio.i;
import okio.q;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            f

private final class <init>
    implements q
{

    final f a;
    private final i b;
    private boolean c;
    private long d;

    public final void a_(c c1, long l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        k.a(c1.b, l);
        if (l > d)
        {
            throw new ProtocolException((new StringBuilder("expected ")).append(d).append(" bytes but received ").append(l).toString());
        } else
        {
            a.d.a_(c1, l);
            d = d - l;
            return;
        }
    }

    public final void close()
        throws IOException
    {
        if (c)
        {
            return;
        }
        c = true;
        if (d > 0L)
        {
            throw new ProtocolException("unexpected end of stream");
        } else
        {
            f.a(b);
            a.e = 3;
            return;
        }
    }

    public final void flush()
        throws IOException
    {
        if (c)
        {
            return;
        } else
        {
            a.d.flush();
            return;
        }
    }

    public final s q_()
    {
        return b;
    }

    private (f f1, long l)
    {
        a = f1;
        super();
        b = new i(a.d.q_());
        d = l;
    }

    d(f f1, long l, byte byte0)
    {
        this(f1, l);
    }
}
