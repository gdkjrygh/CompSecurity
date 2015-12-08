// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class gqk
{

    public final Proxy a;
    public final String b;
    public final int c;
    final SocketFactory d;
    final SSLSocketFactory e;
    final HostnameVerifier f;
    final gqw g;
    final gql h;
    final List i;
    final List j;
    public final ProxySelector k;

    public gqk(String s, int l, SocketFactory socketfactory, SSLSocketFactory sslsocketfactory, HostnameVerifier hostnameverifier, gqw gqw, gql gql, 
            Proxy proxy, List list, List list1, ProxySelector proxyselector)
    {
        if (s == null)
        {
            throw new NullPointerException("uriHost == null");
        }
        if (l <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("uriPort <= 0: ")).append(l).toString());
        }
        if (gql == null)
        {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("protocols == null");
        }
        if (proxyselector == null)
        {
            throw new IllegalArgumentException("proxySelector == null");
        } else
        {
            a = proxy;
            b = s;
            c = l;
            d = socketfactory;
            e = sslsocketfactory;
            f = hostnameverifier;
            g = gqw;
            h = gql;
            i = gsp.a(list);
            j = gsp.a(list1);
            k = proxyselector;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gqk)
        {
            obj = (gqk)obj;
            flag = flag1;
            if (gsp.a(a, ((gqk) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((gqk) (obj)).b))
                {
                    flag = flag1;
                    if (c == ((gqk) (obj)).c)
                    {
                        flag = flag1;
                        if (gsp.a(e, ((gqk) (obj)).e))
                        {
                            flag = flag1;
                            if (gsp.a(f, ((gqk) (obj)).f))
                            {
                                flag = flag1;
                                if (gsp.a(g, ((gqk) (obj)).g))
                                {
                                    flag = flag1;
                                    if (gsp.a(h, ((gqk) (obj)).h))
                                    {
                                        flag = flag1;
                                        if (gsp.a(i, ((gqk) (obj)).i))
                                        {
                                            flag = flag1;
                                            if (gsp.a(j, ((gqk) (obj)).j))
                                            {
                                                flag = flag1;
                                                if (gsp.a(k, ((gqk) (obj)).k))
                                                {
                                                    flag = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        if (a != null)
        {
            l = a.hashCode();
        } else
        {
            l = 0;
        }
        l1 = b.hashCode();
        i2 = c;
        if (e != null)
        {
            i1 = e.hashCode();
        } else
        {
            i1 = 0;
        }
        if (f != null)
        {
            j1 = f.hashCode();
        } else
        {
            j1 = 0;
        }
        if (g != null)
        {
            k1 = g.hashCode();
        }
        return (((((j1 + (i1 + (((l + 527) * 31 + l1) * 31 + i2) * 31) * 31) * 31 + k1) * 31 + h.hashCode()) * 31 + i.hashCode()) * 31 + j.hashCode()) * 31 + k.hashCode();
    }
}
