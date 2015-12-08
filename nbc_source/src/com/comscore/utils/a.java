// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package com.comscore.utils:
//            b

class a extends SSLSocketFactory
{

    SSLContext a;

    public a(KeyStore keystore)
    {
        super(keystore);
        a = SSLContext.getInstance("TLS");
        keystore = new b(this);
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
}
