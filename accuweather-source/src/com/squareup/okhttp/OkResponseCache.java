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
//            ResponseSource

public interface OkResponseCache
{

    public abstract CacheResponse get(URI uri, String s, Map map)
        throws IOException;

    public abstract void maybeRemove(String s, URI uri)
        throws IOException;

    public abstract CacheRequest put(URI uri, URLConnection urlconnection)
        throws IOException;

    public abstract void trackConditionalCacheHit();

    public abstract void trackResponse(ResponseSource responsesource);

    public abstract void update(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
        throws IOException;
}
