// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.ac;
import c.ae;
import c.f;
import com.squareup.okhttp.internal.Util;
import java.net.ProtocolException;

public final class RetryableSink
    implements ac
{

    private boolean closed;
    private final f content;
    private final int limit;

    public RetryableSink()
    {
        this(-1);
    }

    public RetryableSink(int i)
    {
        content = new f();
        limit = i;
    }

    public void close()
    {
        if (!closed)
        {
            closed = true;
            if (content.a() < (long)limit)
            {
                throw new ProtocolException((new StringBuilder()).append("content-length promised ").append(limit).append(" bytes, but received ").append(content.a()).toString());
            }
        }
    }

    public long contentLength()
    {
        return content.a();
    }

    public void flush()
    {
    }

    public ae timeout()
    {
        return ae.NONE;
    }

    public void write(f f1, long l)
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        Util.checkOffsetAndCount(f1.a(), 0L, l);
        if (limit != -1 && content.a() > (long)limit - l)
        {
            throw new ProtocolException((new StringBuilder()).append("exceeded content-length limit of ").append(limit).append(" bytes").toString());
        } else
        {
            content.write(f1, l);
            return;
        }
    }

    public void writeToSocket(ac ac1)
    {
        f f1 = new f();
        content.a(f1, 0L, content.a());
        ac1.write(f1, f1.a());
    }
}
