// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.b;
import com.squareup.okhttp.h;
import com.squareup.okhttp.l;
import com.squareup.okhttp.p;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

public final class a
    implements b
{

    public static final b a = new a();

    public a()
    {
    }

    private static InetAddress a(Proxy proxy, p p1)
        throws IOException
    {
        if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
        {
            return ((InetSocketAddress)proxy.address()).getAddress();
        } else
        {
            return InetAddress.getByName(p1.c);
        }
    }

    public final t a(Proxy proxy, v v1)
        throws IOException
    {
        List list = v1.g();
        v1 = v1.a;
        p p1 = ((t) (v1)).a;
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (h)list.get(i);
            if (!"Basic".equalsIgnoreCase(((h) (obj)).a))
            {
                continue;
            }
            obj = Authenticator.requestPasswordAuthentication(p1.c, a(proxy, p1), p1.d, p1.a, ((h) (obj)).b, ((h) (obj)).a, p1.a(), java.net.Authenticator.RequestorType.SERVER);
            if (obj != null)
            {
                proxy = l.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return v1.b().a("Authorization", proxy).a();
            }
        }

        return null;
    }

    public final t b(Proxy proxy, v v1)
        throws IOException
    {
        List list = v1.g();
        v1 = v1.a;
        p p1 = ((t) (v1)).a;
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (h)list.get(i);
            if (!"Basic".equalsIgnoreCase(((h) (obj)).a))
            {
                continue;
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
            obj = Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), a(proxy, p1), inetsocketaddress.getPort(), p1.a, ((h) (obj)).b, ((h) (obj)).a, p1.a(), java.net.Authenticator.RequestorType.PROXY);
            if (obj != null)
            {
                proxy = l.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return v1.b().a("Proxy-Authorization", proxy).a();
            }
        }

        return null;
    }

}
