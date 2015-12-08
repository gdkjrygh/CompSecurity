// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ApacheURLConnectionImpl

final class c
    implements LayeredSocketFactory
{

    final SSLSocketFactory a;
    final int b;
    final Context c;

    private void a(Socket socket, String s)
    {
        try
        {
            Field field = java/net/InetAddress.getDeclaredField("hostName");
            field.setAccessible(true);
            field.set(socket.getInetAddress(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            return;
        }
    }

    public Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
    {
        return a.connectSocket(socket, s, i, inetaddress, j, httpparams);
    }

    public Socket createSocket()
    {
        return a.createSocket();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        a(socket, s);
        return a.createSocket(socket, s, i, flag);
    }

    public boolean isSecure(Socket socket)
    {
        return a.isSecure(socket);
    }

    (int i, Context context)
    {
        b = i;
        c = context;
        super();
        a = SSLCertificateSocketFactory.getHttpSocketFactory(b, new SSLSessionCache(c));
    }
}
