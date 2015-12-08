// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.flurry.sdk:
//            ej

public class ei
    implements LayeredSocketFactory, SocketFactory
{

    private SSLContext a;

    public ei()
    {
        a = null;
    }

    private static SSLContext a()
        throws IOException
    {
        SSLContext sslcontext;
        try
        {
            sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {
                new ej(null)
            }, null);
        }
        catch (Exception exception)
        {
            throw new IOException(exception.getMessage());
        }
        return sslcontext;
    }

    private SSLContext b()
        throws IOException
    {
        if (a == null)
        {
            a = a();
        }
        return a;
    }

    public Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        int k = HttpConnectionParams.getConnectionTimeout(httpparams);
        int l = HttpConnectionParams.getSoTimeout(httpparams);
        s = new InetSocketAddress(s, i);
        if (socket == null)
        {
            socket = createSocket();
        }
        socket = (SSLSocket)socket;
        if (inetaddress != null || j > 0)
        {
            i = j;
            if (j < 0)
            {
                i = 0;
            }
            socket.bind(new InetSocketAddress(inetaddress, i));
        }
        socket.connect(s, k);
        socket.setSoTimeout(l);
        return socket;
    }

    public Socket createSocket()
        throws IOException
    {
        return b().getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        return b().getSocketFactory().createSocket(socket, s, i, flag);
    }

    public boolean equals(Object obj)
    {
        return obj != null && obj.getClass().equals(com/flurry/sdk/ei);
    }

    public int hashCode()
    {
        return com/flurry/sdk/ei.hashCode();
    }

    public boolean isSecure(Socket socket)
        throws IllegalArgumentException
    {
        return true;
    }
}
