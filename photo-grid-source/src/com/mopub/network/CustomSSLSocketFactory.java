// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.net.SSLCertificateSocketFactory;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class CustomSSLSocketFactory extends SSLSocketFactory
{

    private SSLSocketFactory a;

    private CustomSSLSocketFactory()
    {
    }

    private static void a(Socket socket)
    {
        if (socket instanceof SSLSocket)
        {
            socket = (SSLSocket)socket;
            socket.setEnabledProtocols(socket.getSupportedProtocols());
        }
    }

    public static CustomSSLSocketFactory getDefault(int i)
    {
        CustomSSLSocketFactory customsslsocketfactory = new CustomSSLSocketFactory();
        customsslsocketfactory.a = SSLCertificateSocketFactory.getDefault(i, null);
        return customsslsocketfactory;
    }

    public Socket createSocket()
    {
        Socket socket = a.createSocket();
        a(socket);
        return socket;
    }

    public Socket createSocket(String s, int i)
    {
        s = a.createSocket(s, i);
        a(s);
        return s;
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
    {
        s = a.createSocket(s, i, inetaddress, j);
        a(s);
        return s;
    }

    public Socket createSocket(InetAddress inetaddress, int i)
    {
        inetaddress = a.createSocket(inetaddress, i);
        a(inetaddress);
        return inetaddress;
    }

    public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
    {
        inetaddress = a.createSocket(inetaddress, i, inetaddress1, j);
        a(inetaddress);
        return inetaddress;
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        socket = a.createSocket(socket, s, i, flag);
        a(socket);
        return socket;
    }

    public String[] getDefaultCipherSuites()
    {
        return a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites()
    {
        return a.getSupportedCipherSuites();
    }
}
