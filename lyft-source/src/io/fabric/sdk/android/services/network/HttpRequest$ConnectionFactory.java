// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public interface _cls1
{

    public static final _cls1 a = new HttpRequest.ConnectionFactory() {

        public HttpURLConnection a(URL url)
        {
            return (HttpURLConnection)url.openConnection();
        }

        public HttpURLConnection a(URL url, Proxy proxy)
        {
            return (HttpURLConnection)url.openConnection(proxy);
        }

    };

    public abstract HttpURLConnection a(URL url);

    public abstract HttpURLConnection a(URL url, Proxy proxy);

}
