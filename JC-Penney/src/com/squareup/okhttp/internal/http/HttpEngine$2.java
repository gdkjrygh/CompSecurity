// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import c.ad;
import c.ae;
import c.f;
import c.i;
import c.j;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            CacheRequest, HttpEngine

class val.cacheBody
    implements ad
{

    boolean cacheRequestClosed;
    final HttpEngine this$0;
    final i val$cacheBody;
    final CacheRequest val$cacheRequest;
    final j val$source;

    public void close()
    {
        if (!cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS))
        {
            cacheRequestClosed = true;
            val$cacheRequest.abort();
        }
        val$source.close();
    }

    public long read(f f1, long l)
    {
        try
        {
            l = val$source.read(f1, l);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            if (!cacheRequestClosed)
            {
                cacheRequestClosed = true;
                val$cacheRequest.abort();
            }
            throw f1;
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
            f1.a(val$cacheBody.b(), f1.a() - l, l);
            val$cacheBody.w();
            return l;
        }
    }

    public ae timeout()
    {
        return val$source.timeout();
    }

    ()
    {
        this$0 = final_httpengine;
        val$source = j1;
        val$cacheRequest = cacherequest;
        val$cacheBody = i.this;
        super();
    }
}
