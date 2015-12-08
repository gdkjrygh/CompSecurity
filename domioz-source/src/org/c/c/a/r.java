// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import org.c.c.i;
import org.c.d.a;

// Referenced classes of package org.c.c.a:
//            g, q, t, e

public class r
    implements g
{

    private static final int DEFAULT_CHUNK_SIZE = 0;
    private boolean bufferRequestBody;
    private int chunkSize;
    private int connectTimeout;
    private Proxy proxy;
    private int readTimeout;

    public r()
    {
        bufferRequestBody = true;
        chunkSize = 0;
        connectTimeout = -1;
        readTimeout = -1;
    }

    public e createRequest(URI uri, i j)
    {
        uri = openConnection(uri.toURL(), proxy);
        prepareConnection(uri, j.name());
        if (bufferRequestBody)
        {
            return new q(uri);
        } else
        {
            return new t(uri, chunkSize);
        }
    }

    protected HttpURLConnection openConnection(URL url, Proxy proxy1)
    {
        if (proxy1 != null)
        {
            url = url.openConnection(proxy1);
        } else
        {
            url = url.openConnection();
        }
        a.isInstanceOf(java/net/HttpURLConnection, url);
        return (HttpURLConnection)url;
    }

    protected void prepareConnection(HttpURLConnection httpurlconnection, String s)
    {
        if (connectTimeout >= 0)
        {
            httpurlconnection.setConnectTimeout(connectTimeout);
        }
        if (readTimeout >= 0)
        {
            httpurlconnection.setReadTimeout(readTimeout);
        }
        httpurlconnection.setDoInput(true);
        if ("GET".equals(s))
        {
            httpurlconnection.setInstanceFollowRedirects(true);
        } else
        {
            httpurlconnection.setInstanceFollowRedirects(false);
        }
        if ("PUT".equals(s) || "POST".equals(s))
        {
            httpurlconnection.setDoOutput(true);
        } else
        {
            httpurlconnection.setDoOutput(false);
        }
        httpurlconnection.setRequestMethod(s);
    }

    public void setBufferRequestBody(boolean flag)
    {
        bufferRequestBody = flag;
    }

    public void setChunkSize(int j)
    {
        chunkSize = j;
    }

    public void setConnectTimeout(int j)
    {
        connectTimeout = j;
    }

    public void setProxy(Proxy proxy1)
    {
        proxy = proxy1;
    }

    public void setReadTimeout(int j)
    {
        readTimeout = j;
    }
}
