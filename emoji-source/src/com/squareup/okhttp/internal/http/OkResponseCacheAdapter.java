// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkResponseCache;
import com.squareup.okhttp.ResponseSource;
import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.ResponseCache;
import java.net.URI;
import java.net.URLConnection;
import java.util.Map;

public final class OkResponseCacheAdapter
    implements OkResponseCache
{

    private final ResponseCache responseCache;

    public OkResponseCacheAdapter(ResponseCache responsecache)
    {
        responseCache = responsecache;
    }

    public CacheResponse get(URI uri, String s, Map map)
        throws IOException
    {
        return responseCache.get(uri, s, map);
    }

    public void maybeRemove(String s, URI uri)
        throws IOException
    {
    }

    public CacheRequest put(URI uri, URLConnection urlconnection)
        throws IOException
    {
        return responseCache.put(uri, urlconnection);
    }

    public void trackConditionalCacheHit()
    {
    }

    public void trackResponse(ResponseSource responsesource)
    {
    }

    public void update(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
        throws IOException
    {
    }
}
