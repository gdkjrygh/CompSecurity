// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.f;
import c.j;
import com.squareup.okhttp.internal.Util;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

class endOfInput extends endOfInput
{

    private long bytesRemaining;
    final HttpConnection this$0;

    public void close()
    {
        if (closed)
        {
            return;
        }
        if (bytesRemaining != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        {
            unexpectedEndOfInput();
        }
        closed = true;
    }

    public long read(f f, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (bytesRemaining == 0L)
        {
            return -1L;
        }
        l = HttpConnection.access$600(HttpConnection.this).read(f, Math.min(bytesRemaining, l));
        if (l == -1L)
        {
            unexpectedEndOfInput();
            throw new ProtocolException("unexpected end of stream");
        }
        bytesRemaining = bytesRemaining - l;
        if (bytesRemaining == 0L)
        {
            endOfInput(true);
        }
        return l;
    }

    public (long l)
    {
        this$0 = HttpConnection.this;
        super(HttpConnection.this, null);
        bytesRemaining = l;
        if (bytesRemaining == 0L)
        {
            endOfInput(true);
        }
    }
}
