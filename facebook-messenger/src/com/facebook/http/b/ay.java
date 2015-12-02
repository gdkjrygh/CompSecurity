// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

// Referenced classes of package com.facebook.http.b:
//            ba, az

public class ay extends SSLSocketFactory
{

    private static final String a[] = {
        "facebook.com", "beta.facebook.com", "latest.facebook.com"
    };
    private static final X509HostnameVerifier b;
    private static TrustManager d = new az();
    private SSLContext c;

    private ay(KeyStore keystore)
    {
        super(keystore);
        c = SSLContext.getInstance("TLS");
        keystore = c;
        TrustManager trustmanager = d;
        SecureRandom securerandom = new SecureRandom();
        keystore.init(null, new TrustManager[] {
            trustmanager
        }, securerandom);
    }

    public static SSLSocketFactory a()
    {
        Object obj;
        try
        {
            obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            obj = new ay(((KeyStore) (obj)));
            ((SSLSocketFactory) (obj)).setHostnameVerifier(b);
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((SSLSocketFactory) (obj));
    }

    public Socket createSocket()
    {
        return c.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        socket = (SSLSocket)c.getSocketFactory().createSocket(socket, s, i, flag);
        getHostnameVerifier().verify(s, socket);
        return socket;
    }

    static 
    {
        b = new ba(a, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }
}
