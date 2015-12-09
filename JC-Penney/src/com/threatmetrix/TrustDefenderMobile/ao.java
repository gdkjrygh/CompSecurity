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

final class ao
    implements LayeredSocketFactory
{

    final SSLSocketFactory a;
    final int b;
    final Context c;

    ao(int i, Context context)
    {
        b = i;
        c = context;
        super();
        a = SSLCertificateSocketFactory.getHttpSocketFactory(b, new SSLSessionCache(c));
    }

    public final Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
    {
        return a.connectSocket(socket, s, i, inetaddress, j, httpparams);
    }

    public final Socket createSocket()
    {
        return a.createSocket();
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        try
        {
            Field field = java/net/InetAddress.getDeclaredField("hostName");
            field.setAccessible(true);
            field.set(socket.getInetAddress(), s);
        }
        catch (Exception exception) { }
        return a.createSocket(socket, s, i, flag);
    }

    public final boolean isSecure(Socket socket)
    {
        return a.isSecure(socket);
    }
}
