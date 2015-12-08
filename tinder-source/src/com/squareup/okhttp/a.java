// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            g, b

public final class a
{

    public final Proxy a;
    public final String b;
    public final int c;
    final SocketFactory d;
    final SSLSocketFactory e;
    final HostnameVerifier f;
    final g g;
    final b h;
    final List i;
    final List j;
    public final ProxySelector k;

    public a(String s, int l, SocketFactory socketfactory, SSLSocketFactory sslsocketfactory, HostnameVerifier hostnameverifier, g g1, b b1, 
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
        if (b1 == null)
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
            g = g1;
            h = b1;
            i = com.squareup.okhttp.internal.k.a(list);
            j = com.squareup.okhttp.internal.k.a(list1);
            k = proxyselector;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof a)
        {
            obj = (a)obj;
            flag = flag1;
            if (com.squareup.okhttp.internal.k.a(a, ((a) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((a) (obj)).b))
                {
                    flag = flag1;
                    if (c == ((a) (obj)).c)
                    {
                        flag = flag1;
                        if (com.squareup.okhttp.internal.k.a(e, ((a) (obj)).e))
                        {
                            flag = flag1;
                            if (com.squareup.okhttp.internal.k.a(f, ((a) (obj)).f))
                            {
                                flag = flag1;
                                if (com.squareup.okhttp.internal.k.a(g, ((a) (obj)).g))
                                {
                                    flag = flag1;
                                    if (com.squareup.okhttp.internal.k.a(h, ((a) (obj)).h))
                                    {
                                        flag = flag1;
                                        if (com.squareup.okhttp.internal.k.a(i, ((a) (obj)).i))
                                        {
                                            flag = flag1;
                                            if (com.squareup.okhttp.internal.k.a(j, ((a) (obj)).j))
                                            {
                                                flag = flag1;
                                                if (com.squareup.okhttp.internal.k.a(k, ((a) (obj)).k))
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
