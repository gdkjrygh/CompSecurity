// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.huc.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.huc.HttpsURLConnectionImpl;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

// Referenced classes of package com.squareup.okhttp:
//            OkHttpClient

public final class OkUrlFactory
    implements Cloneable, URLStreamHandlerFactory
{

    private final OkHttpClient a;

    public OkUrlFactory(OkHttpClient okhttpclient)
    {
        a = okhttpclient;
    }

    public final OkHttpClient a()
    {
        return a;
    }

    public final HttpURLConnection a(URL url)
    {
        return a(url, a.d());
    }

    final HttpURLConnection a(URL url, Proxy proxy)
    {
        String s = url.getProtocol();
        OkHttpClient okhttpclient = a.x();
        okhttpclient.a(proxy);
        if (s.equals("http"))
        {
            return new HttpURLConnectionImpl(url, okhttpclient);
        }
        if (s.equals("https"))
        {
            return new HttpsURLConnectionImpl(url, okhttpclient);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unexpected protocol: ")).append(s).toString());
        }
    }

    public final Object clone()
    {
        return new OkUrlFactory(a.y());
    }

    public final URLStreamHandler createURLStreamHandler(String s)
    {
        if (!s.equals("http") && !s.equals("https"))
        {
            return null;
        } else
        {
            return new _cls1(s);
        }
    }

    private class _cls1 extends URLStreamHandler
    {

        final String a;
        final OkUrlFactory b;

        protected int getDefaultPort()
        {
            if (a.equals("http"))
            {
                return 80;
            }
            if (a.equals("https"))
            {
                return 443;
            } else
            {
                throw new AssertionError();
            }
        }

        protected URLConnection openConnection(URL url)
        {
            return b.a(url);
        }

        protected URLConnection openConnection(URL url, Proxy proxy)
        {
            return b.a(url, proxy);
        }

        _cls1(String s)
        {
            b = OkUrlFactory.this;
            a = s;
            super();
        }
    }

}
