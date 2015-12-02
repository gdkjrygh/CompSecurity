// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.Map;

public interface bek
{

    public abstract CacheRequest a(URI uri, URLConnection urlconnection)
        throws IOException;

    public abstract CacheResponse a(URI uri, String s, Map map)
        throws IOException;

    public abstract void a();

    public abstract void a(ben ben);

    public abstract void a(String s, URI uri)
        throws IOException;

    public abstract void a(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
        throws IOException;
}
