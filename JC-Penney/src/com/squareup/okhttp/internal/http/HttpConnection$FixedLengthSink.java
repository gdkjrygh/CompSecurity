// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.ac;
import c.ae;
import c.f;
import c.i;
import c.o;
import com.squareup.okhttp.internal.Util;
import java.net.ProtocolException;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

final class <init>
    implements ac
{

    private long bytesRemaining;
    private boolean closed;
    final HttpConnection this$0;
    private final o timeout;

    public void close()
    {
        if (closed)
        {
            return;
        }
        closed = true;
        if (bytesRemaining > 0L)
        {
            throw new ProtocolException("unexpected end of stream");
        } else
        {
            HttpConnection.access$400(HttpConnection.this, timeout);
            HttpConnection.access$502(HttpConnection.this, 3);
            return;
        }
    }

    public void flush()
    {
        if (closed)
        {
            return;
        } else
        {
            HttpConnection.access$300(HttpConnection.this).flush();
            return;
        }
    }

    public ae timeout()
    {
        return timeout;
    }

    public void write(f f1, long l)
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        Util.checkOffsetAndCount(f1.a(), 0L, l);
        if (l > bytesRemaining)
        {
            throw new ProtocolException((new StringBuilder()).append("expected ").append(bytesRemaining).append(" bytes but received ").append(l).toString());
        } else
        {
            HttpConnection.access$300(HttpConnection.this).write(f1, l);
            bytesRemaining = bytesRemaining - l;
            return;
        }
    }

    private (long l)
    {
        this$0 = HttpConnection.this;
        super();
        timeout = new o(HttpConnection.access$300(HttpConnection.this).timeout());
        bytesRemaining = l;
    }

    bytesRemaining(long l, bytesRemaining bytesremaining)
    {
        this(l);
    }
}
