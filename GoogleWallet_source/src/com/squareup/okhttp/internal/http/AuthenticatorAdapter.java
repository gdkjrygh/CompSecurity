// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Challenge;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

public final class AuthenticatorAdapter
    implements Authenticator
{

    public static final Authenticator INSTANCE = new AuthenticatorAdapter();

    public AuthenticatorAdapter()
    {
    }

    private static InetAddress getConnectToInetAddress(Proxy proxy, URL url)
        throws IOException
    {
        if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
        {
            return ((InetSocketAddress)proxy.address()).getAddress();
        } else
        {
            return InetAddress.getByName(url.getHost());
        }
    }

    public final Request authenticate(Proxy proxy, Response response)
        throws IOException
    {
        List list = response.challenges();
        response = response.request();
        URL url = response.url();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            Object obj = (Challenge)list.get(i);
            if (!"Basic".equalsIgnoreCase(((Challenge) (obj)).getScheme()))
            {
                continue;
            }
            obj = java.net.Authenticator.requestPasswordAuthentication(url.getHost(), getConnectToInetAddress(proxy, url), url.getPort(), url.getProtocol(), ((Challenge) (obj)).getRealm(), ((Challenge) (obj)).getScheme(), url, java.net.Authenticator.RequestorType.SERVER);
            if (obj != null)
            {
                proxy = Credentials.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return response.newBuilder().header("Authorization", proxy).build();
            }
        }

        return null;
    }

    public final Request authenticateProxy(Proxy proxy, Response response)
        throws IOException
    {
        List list = response.challenges();
        response = response.request();
        URL url = response.url();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            Object obj = (Challenge)list.get(i);
            if (!"Basic".equalsIgnoreCase(((Challenge) (obj)).getScheme()))
            {
                continue;
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
            obj = java.net.Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), getConnectToInetAddress(proxy, url), inetsocketaddress.getPort(), url.getProtocol(), ((Challenge) (obj)).getRealm(), ((Challenge) (obj)).getScheme(), url, java.net.Authenticator.RequestorType.PROXY);
            if (obj != null)
            {
                proxy = Credentials.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return response.newBuilder().header("Proxy-Authorization", proxy).build();
            }
        }

        return null;
    }

}
