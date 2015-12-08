// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.A;
import com.c.a.b;
import com.c.a.g;
import com.c.a.m;
import com.c.a.w;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

public final class a
    implements b
{

    public static final b a = new a();

    public a()
    {
    }

    private static InetAddress a(Proxy proxy, URL url)
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

    public final w a(Proxy proxy, A a1)
        throws IOException
    {
        List list = a1.c();
        a1 = a1.a;
        URL url = a1.a();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (g)list.get(i);
            if (!"Basic".equalsIgnoreCase(((g) (obj)).a))
            {
                continue;
            }
            obj = Authenticator.requestPasswordAuthentication(url.getHost(), a(proxy, url), url.getPort(), url.getProtocol(), ((g) (obj)).b, ((g) (obj)).a, url, java.net.Authenticator.RequestorType.SERVER);
            if (obj != null)
            {
                proxy = m.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return a1.c().a("Authorization", proxy).a();
            }
        }

        return null;
    }

    public final w b(Proxy proxy, A a1)
        throws IOException
    {
        List list = a1.c();
        a1 = a1.a;
        URL url = a1.a();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (g)list.get(i);
            if (!"Basic".equalsIgnoreCase(((g) (obj)).a))
            {
                continue;
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
            obj = Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), a(proxy, url), inetsocketaddress.getPort(), url.getProtocol(), ((g) (obj)).b, ((g) (obj)).a, url, java.net.Authenticator.RequestorType.PROXY);
            if (obj != null)
            {
                proxy = m.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return a1.c().a("Proxy-Authorization", proxy).a();
            }
        }

        return null;
    }

}
