// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.c;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            f

private final class a extends a
{

    final f d;
    private long e;

    public final long a(c c, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        if (e == 0L)
        {
            return -1L;
        }
        l = d.c.a(c, Math.min(e, l));
        if (l == -1L)
        {
            b();
            throw new ProtocolException("unexpected end of stream");
        }
        e = e - l;
        if (e == 0L)
        {
            a(true);
        }
        return l;
    }

    public final void close()
        throws IOException
    {
        if (b)
        {
            return;
        }
        if (e != 0L && !k.a(this, TimeUnit.MILLISECONDS))
        {
            b();
        }
        b = true;
    }

    public (f f1, long l)
        throws IOException
    {
        d = f1;
        super(f1, (byte)0);
        e = l;
        if (e == 0L)
        {
            a(true);
        }
    }
}
