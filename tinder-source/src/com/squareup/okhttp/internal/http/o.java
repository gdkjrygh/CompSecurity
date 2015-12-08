// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.a;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.g;
import com.squareup.okhttp.internal.j;
import com.squareup.okhttp.p;
import com.squareup.okhttp.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o
{

    final a a;
    final p b;
    final j c;
    Proxy d;
    InetSocketAddress e;
    List f;
    int g;
    List h;
    int i;
    final List j = new ArrayList();
    private final g k;
    private final s l;

    public o(a a1, p p1, s s1)
    {
        f = Collections.emptyList();
        h = Collections.emptyList();
        a = a1;
        b = p1;
        l = s1;
        c = d.b.b(s1);
        k = d.b.c(s1);
        a1 = a1.a;
        if (a1 != null)
        {
            f = Collections.singletonList(a1);
        } else
        {
            f = new ArrayList();
            a1 = l.j.select(p1.b());
            if (a1 != null)
            {
                f.addAll(a1);
            }
            f.removeAll(Collections.singleton(Proxy.NO_PROXY));
            f.add(Proxy.NO_PROXY);
        }
        g = 0;
    }

    final void a(Proxy proxy)
        throws IOException
    {
        h = new ArrayList();
        int i1;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS)
        {
            proxy = a.b;
            i1 = a.c;
        } else
        {
            proxy = proxy.address();
            if (!(proxy instanceof InetSocketAddress))
            {
                throw new IllegalArgumentException((new StringBuilder("Proxy.address() is not an InetSocketAddress: ")).append(proxy.getClass()).toString());
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy;
            proxy = inetsocketaddress.getAddress();
            if (proxy == null)
            {
                proxy = inetsocketaddress.getHostName();
            } else
            {
                proxy = proxy.getHostAddress();
            }
            i1 = inetsocketaddress.getPort();
        }
        if (i1 <= 0 || i1 > 65535)
        {
            throw new SocketException((new StringBuilder("No route to ")).append(proxy).append(":").append(i1).append("; port is out of range").toString());
        }
        proxy = k.a(proxy);
        int k1 = proxy.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            InetAddress inetaddress = proxy[j1];
            h.add(new InetSocketAddress(inetaddress, i1));
        }

        i = 0;
    }

    public final boolean a()
    {
        return c() || b() || d();
    }

    final boolean b()
    {
        return g < f.size();
    }

    final boolean c()
    {
        return i < h.size();
    }

    final boolean d()
    {
        return !j.isEmpty();
    }
}
