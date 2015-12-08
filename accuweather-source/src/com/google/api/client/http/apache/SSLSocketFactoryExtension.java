// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

final class SSLSocketFactoryExtension extends SSLSocketFactory
{

    private final javax.net.ssl.SSLSocketFactory socketFactory;

    SSLSocketFactoryExtension(SSLContext sslcontext)
        throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException
    {
        super((KeyStore)null);
        socketFactory = sslcontext.getSocketFactory();
    }

    public Socket createSocket()
        throws IOException
    {
        return socketFactory.createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        socket = (SSLSocket)socketFactory.createSocket(socket, s, i, flag);
        getHostnameVerifier().verify(s, socket);
        return socket;
    }
}
