// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class q extends SSLSocketFactory
{

    SSLContext a;

    public q(KeyStore keystore)
    {
        super(keystore);
        a = SSLContext.getInstance("TLS");
        keystore = new _cls1();
        a.init(null, new TrustManager[] {
            keystore
        }, null);
    }

    public Socket createSocket()
    {
        return a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return a.getSocketFactory().createSocket(socket, s, i, flag);
    }

    private class _cls1
        implements X509TrustManager
    {

        final q a;

        public void checkClientTrusted(X509Certificate ax509certificate[], String s)
        {
        }

        public void checkServerTrusted(X509Certificate ax509certificate[], String s)
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            return null;
        }

        _cls1()
        {
            a = q.this;
            super();
        }
    }

}
