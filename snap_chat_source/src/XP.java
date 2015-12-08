// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

public final class XP
    implements Xe
{

    public static final Xe a = new XP();

    public XP()
    {
    }

    private static InetAddress a(Proxy proxy, URL url)
    {
        if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
        {
            return ((InetSocketAddress)proxy.address()).getAddress();
        } else
        {
            return InetAddress.getByName(url.getHost());
        }
    }

    public final Xy a(Proxy proxy, XA xa)
    {
        List list = xa.f();
        xa = xa.a;
        URL url = xa.a();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (Xj)list.get(i);
            if (!"Basic".equalsIgnoreCase(((Xj) (obj)).a))
            {
                continue;
            }
            obj = Authenticator.requestPasswordAuthentication(url.getHost(), a(proxy, url), XO.a(url), url.getProtocol(), ((Xj) (obj)).b, ((Xj) (obj)).a, url, java.net.Authenticator.RequestorType.SERVER);
            if (obj != null)
            {
                proxy = Xo.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return xa.c().a("Authorization", proxy).a();
            }
        }

        return null;
    }

    public final Xy b(Proxy proxy, XA xa)
    {
        List list = xa.f();
        xa = xa.a;
        URL url = xa.a();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (Xj)list.get(i);
            if (!"Basic".equalsIgnoreCase(((Xj) (obj)).a))
            {
                continue;
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
            obj = Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), a(proxy, url), inetsocketaddress.getPort(), url.getProtocol(), ((Xj) (obj)).b, ((Xj) (obj)).a, url, java.net.Authenticator.RequestorType.PROXY);
            if (obj != null)
            {
                proxy = Xo.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return xa.c().a("Proxy-Authorization", proxy).a();
            }
        }

        return null;
    }

}
