// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.Map;

// Referenced classes of package com.squareup.okhttp:
//            OkResponseCache, HttpResponseCache, ResponseSource

class this._cls0
    implements OkResponseCache
{

    final HttpResponseCache this$0;

    public CacheResponse get(URI uri, String s, Map map)
        throws IOException
    {
        return HttpResponseCache.this.get(uri, s, map);
    }

    public void maybeRemove(String s, URI uri)
        throws IOException
    {
        HttpResponseCache.access$000(HttpResponseCache.this, s, uri);
    }

    public CacheRequest put(URI uri, URLConnection urlconnection)
        throws IOException
    {
        return HttpResponseCache.this.put(uri, urlconnection);
    }

    public void trackConditionalCacheHit()
    {
        HttpResponseCache.access$200(HttpResponseCache.this);
    }

    public void trackResponse(ResponseSource responsesource)
    {
        HttpResponseCache.access$300(HttpResponseCache.this, responsesource);
    }

    public void update(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
        throws IOException
    {
        HttpResponseCache.access$100(HttpResponseCache.this, cacheresponse, httpurlconnection);
    }

    ()
    {
        this$0 = HttpResponseCache.this;
        super();
    }
}
