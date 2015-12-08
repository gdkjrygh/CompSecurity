// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SkypeSSLSocketFactory extends SSLSocketFactory
{

    private static final String PREFERRED_CIPHERS[] = {
        "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 
        "TLS_RSA_WITH_AES_128_CBC_SHA", "SSL_RSA_WITH_3DES_EDE_CBC_SHA", "SSL_RSA_WITH_RC4_128_SHA", "SSL_RSA_WITH_RC4_128_MD5"
    };
    private static SSLSocketFactory factory;
    private String defaultCiphers[];
    private SSLSocketFactory defaultFactory;
    private String supportedCiphers[];

    public SkypeSSLSocketFactory()
    {
        String as[];
        ArrayList arraylist;
        supportedCiphers = null;
        defaultCiphers = null;
        defaultFactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
        as = defaultFactory.getSupportedCipherSuites();
        arraylist = new ArrayList();
        if (as == null) goto _L2; else goto _L1
_L1:
        String as1[];
        int i;
        int i1;
        as1 = PREFERRED_CIPHERS;
        i1 = as1.length;
        i = 0;
_L4:
        if (i < i1)
        {
            String s = as1[i];
            int j1 = as.length;
            int k = 0;
            do
            {
label0:
                {
                    if (k < j1)
                    {
                        String s1 = as[k];
                        if (!s.equalsIgnoreCase(s1))
                        {
                            break label0;
                        }
                        arraylist.add(s1);
                    }
                    i++;
                    continue; /* Loop/switch isn't completed */
                }
                k++;
            } while (true);
        }
_L2:
        int l;
        if (arraylist.size() > 0)
        {
            supportedCiphers = new String[arraylist.size()];
            arraylist.toArray(supportedCiphers);
        } else
        {
            supportedCiphers = as;
        }
        l = Math.min(supportedCiphers.length, 5);
        defaultCiphers = new String[l];
        for (int j = 0; j < l; j++)
        {
            defaultCiphers[j] = supportedCiphers[j];
        }

        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static SocketFactory getDefault()
    {
        com/skype/android/util/SkypeSSLSocketFactory;
        JVM INSTR monitorenter ;
        SSLSocketFactory sslsocketfactory;
        if (factory == null)
        {
            factory = new SkypeSSLSocketFactory();
        }
        sslsocketfactory = factory;
        com/skype/android/util/SkypeSSLSocketFactory;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception;
        exception;
        throw exception;
    }

    private Socket setSSL(Socket socket)
    {
        if (socket instanceof SSLSocket)
        {
            ((SSLSocket)socket).setEnabledCipherSuites(supportedCiphers);
        }
        return socket;
    }

    public Socket createSocket()
        throws IOException
    {
        return setSSL(defaultFactory.createSocket());
    }

    public Socket createSocket(String s, int i)
        throws IOException, UnknownHostException
    {
        return setSSL(defaultFactory.createSocket(s, i));
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
        throws IOException, UnknownHostException
    {
        return setSSL(defaultFactory.createSocket(s, i, inetaddress, j));
    }

    public Socket createSocket(InetAddress inetaddress, int i)
        throws IOException
    {
        return setSSL(defaultFactory.createSocket(inetaddress, i));
    }

    public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
        throws IOException
    {
        return setSSL(defaultFactory.createSocket(inetaddress, i, inetaddress1, j));
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException
    {
        return setSSL(defaultFactory.createSocket(socket, s, i, flag));
    }

    public String[] getDefaultCipherSuites()
    {
        return defaultCiphers;
    }

    public String[] getPreferredCiphers()
    {
        return PREFERRED_CIPHERS;
    }

    public String[] getSupportedCipherSuites()
    {
        return supportedCiphers;
    }

}
