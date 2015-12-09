// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

public final class gtu
    implements gql
{

    public static final gql a = new gtu();

    public gtu()
    {
    }

    private static InetAddress a(Proxy proxy, grj grj1)
    {
        if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
        {
            return ((InetSocketAddress)proxy.address()).getAddress();
        } else
        {
            return InetAddress.getByName(grj1.c);
        }
    }

    public final grq a(Proxy proxy, grt grt1)
    {
        List list = grt1.i();
        grt1 = grt1.a;
        grj grj1 = ((grq) (grt1)).a;
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (gqy)list.get(i);
            if (!"Basic".equalsIgnoreCase(((gqy) (obj)).a))
            {
                continue;
            }
            obj = Authenticator.requestPasswordAuthentication(grj1.c, a(proxy, grj1), grj1.d, grj1.a, ((gqy) (obj)).b, ((gqy) (obj)).a, grj1.a(), java.net.Authenticator.RequestorType.SERVER);
            if (obj != null)
            {
                proxy = grd.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return grt1.c().a("Authorization", proxy).b();
            }
        }

        return null;
    }

    public final grq b(Proxy proxy, grt grt1)
    {
        List list = grt1.i();
        grt1 = grt1.a;
        grj grj1 = ((grq) (grt1)).a;
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Object obj = (gqy)list.get(i);
            if (!"Basic".equalsIgnoreCase(((gqy) (obj)).a))
            {
                continue;
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
            obj = Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), a(proxy, grj1), inetsocketaddress.getPort(), grj1.a, ((gqy) (obj)).b, ((gqy) (obj)).a, grj1.a(), java.net.Authenticator.RequestorType.PROXY);
            if (obj != null)
            {
                proxy = grd.a(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                return grt1.c().a("Proxy-Authorization", proxy).b();
            }
        }

        return null;
    }

}
