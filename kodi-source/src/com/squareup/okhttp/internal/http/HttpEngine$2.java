// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine, CacheRequest

class val.cacheBody
    implements Source
{

    boolean cacheRequestClosed;
    final HttpEngine this$0;
    final BufferedSink val$cacheBody;
    final CacheRequest val$cacheRequest;
    final BufferedSource val$source;

    public void close()
        throws IOException
    {
        if (!cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        {
            cacheRequestClosed = true;
            val$cacheRequest.abort();
        }
        val$source.close();
    }

    public long read(Buffer buffer, long l)
        throws IOException
    {
        try
        {
            l = val$source.read(buffer, l);
        }
        // Misplaced declaration of an exception variable
        catch (Buffer buffer)
        {
            if (!cacheRequestClosed)
            {
                cacheRequestClosed = true;
                val$cacheRequest.abort();
            }
            throw buffer;
        }
        if (l == -1L)
        {
            if (!cacheRequestClosed)
            {
                cacheRequestClosed = true;
                val$cacheBody.close();
            }
            return -1L;
        } else
        {
            buffer.copyTo(val$cacheBody.buffer(), buffer.size() - l, l);
            val$cacheBody.emitCompleteSegments();
            return l;
        }
    }

    public Timeout timeout()
    {
        return val$source.timeout();
    }

    ()
    {
        this$0 = final_httpengine;
        val$source = bufferedsource;
        val$cacheRequest = cacherequest;
        val$cacheBody = BufferedSink.this;
        super();
    }
}
