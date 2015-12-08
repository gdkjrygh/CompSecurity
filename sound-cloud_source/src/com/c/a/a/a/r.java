// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.C;
import com.c.a.a.a;
import com.c.a.a.d;
import com.c.a.a.h;
import com.c.a.a.i;
import com.c.a.l;
import com.c.a.t;
import com.c.a.w;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;

public final class r
{

    final com.c.a.a a;
    final URI b;
    final h c;
    Proxy d;
    InetSocketAddress e;
    l f;
    List g;
    int h;
    List i;
    int j;
    List k;
    int l;
    final List m = new ArrayList();
    private final d n;
    private final t o;
    private final w p;

    public r(com.c.a.a a1, URI uri, t t1, w w1)
    {
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = Collections.emptyList();
        a = a1;
        b = uri;
        o = t1;
        c = a.b.b(t1);
        n = a.b.c(t1);
        p = w1;
        a1 = a1.;
        if (a1 != null)
        {
            g = Collections.singletonList(a1);
        } else
        {
            g = new ArrayList();
            a1 = o.j.select(uri);
            if (a1 != null)
            {
                g.addAll(a1);
            }
            g.removeAll(Collections.singleton(Proxy.NO_PROXY));
            g.add(Proxy.NO_PROXY);
        }
        h = 0;
    }

    public final void a(C c1, IOException ioexception)
    {
        if (c1.b.type() != java.net.Proxy.Type.DIRECT && a.k != null)
        {
            a.k.connectFailed(b, c1.b.address(), ioexception);
        }
        c.a(c1);
        if (!(ioexception instanceof SSLHandshakeException) && !(ioexception instanceof SSLProtocolException))
        {
            for (; l < k.size(); c.a(c1))
            {
                c1 = k;
                int i1 = l;
                l = i1 + 1;
                c1 = (l)c1.get(i1);
                boolean flag = a(((l) (c1)));
                c1 = new C(a, d, e, c1, flag);
            }

        }
    }

    final void a(Proxy proxy)
        throws IOException
    {
        i = new ArrayList();
        int i1;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS)
        {
            proxy = a.b;
            i1 = com.c.a.a.i.a(b);
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
        proxy = n.a(proxy);
        int k1 = proxy.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            InetAddress inetaddress = proxy[j1];
            i.add(new InetSocketAddress(inetaddress, i1));
        }

        j = 0;
    }

    public final boolean a()
    {
        return h < g.size();
    }

    final boolean a(l l1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (l1 != k.get(0))
        {
            flag = flag1;
            if (l1.d)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean b()
    {
        return j < i.size();
    }

    final void c()
    {
        k = new ArrayList();
        List list = a.j;
        int j1 = list.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            l l1 = (l)list.get(i1);
            if (p.e() == l1.d)
            {
                k.add(l1);
            }
        }

        l = 0;
    }

    public final boolean d()
    {
        return l < k.size();
    }

    public final boolean e()
    {
        return !m.isEmpty();
    }
}
