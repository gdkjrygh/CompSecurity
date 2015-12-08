// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.huc.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.huc.HttpsURLConnectionImpl;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

// Referenced classes of package com.squareup.okhttp:
//            OkHttpClient

public final class OkUrlFactory
    implements Cloneable, URLStreamHandlerFactory
{

    private final OkHttpClient client;

    public OkUrlFactory(OkHttpClient okhttpclient)
    {
        client = okhttpclient;
    }

    public OkHttpClient client()
    {
        return client;
    }

    public OkUrlFactory clone()
    {
        return new OkUrlFactory(client.clone());
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public URLStreamHandler createURLStreamHandler(final String protocol)
    {
        if (!protocol.equals("http") && !protocol.equals("https"))
        {
            return null;
        } else
        {
            return new URLStreamHandler() {

                final OkUrlFactory this$0;
                final String val$protocol;

                protected int getDefaultPort()
                {
                    if (protocol.equals("http"))
                    {
                        return 80;
                    }
                    if (protocol.equals("https"))
                    {
                        return 443;
                    } else
                    {
                        throw new AssertionError();
                    }
                }

                protected URLConnection openConnection(URL url)
                {
                    return open(url);
                }

                protected URLConnection openConnection(URL url, Proxy proxy)
                {
                    return open(url, proxy);
                }

            
            {
                this$0 = OkUrlFactory.this;
                protocol = s;
                super();
            }
            };
        }
    }

    public HttpURLConnection open(URL url)
    {
        return open(url, client.getProxy());
    }

    HttpURLConnection open(URL url, Proxy proxy)
    {
        String s = url.getProtocol();
        OkHttpClient okhttpclient = client.copyWithDefaults();
        okhttpclient.setProxy(proxy);
        if (s.equals("http"))
        {
            return new HttpURLConnectionImpl(url, okhttpclient);
        }
        if (s.equals("https"))
        {
            return new HttpsURLConnectionImpl(url, okhttpclient);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected protocol: ").append(s).toString());
        }
    }
}
