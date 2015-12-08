// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Network;
import com.squareup.okhttp.internal.RouteDatabase;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class RouteSelector
{

    private final Address address;
    private final OkHttpClient client;
    private List inetSocketAddresses;
    private InetSocketAddress lastInetSocketAddress;
    private Proxy lastProxy;
    private final Network network;
    private int nextInetSocketAddressIndex;
    private int nextProxyIndex;
    private final List postponedRoutes = new ArrayList();
    private List proxies;
    private final RouteDatabase routeDatabase;
    private final HttpUrl url;

    private RouteSelector(Address address1, HttpUrl httpurl, OkHttpClient okhttpclient)
    {
        proxies = Collections.emptyList();
        inetSocketAddresses = Collections.emptyList();
        address = address1;
        url = httpurl;
        client = okhttpclient;
        routeDatabase = Internal.instance.routeDatabase(okhttpclient);
        network = Internal.instance.network(okhttpclient);
        resetNextProxy(httpurl, address1.getProxy());
    }

    public static RouteSelector get(Address address1, Request request, OkHttpClient okhttpclient)
    {
        return new RouteSelector(address1, request.httpUrl(), okhttpclient);
    }

    static String getHostString(InetSocketAddress inetsocketaddress)
    {
        InetAddress inetaddress = inetsocketaddress.getAddress();
        if (inetaddress == null)
        {
            return inetsocketaddress.getHostName();
        } else
        {
            return inetaddress.getHostAddress();
        }
    }

    private boolean hasNextInetSocketAddress()
    {
        return nextInetSocketAddressIndex < inetSocketAddresses.size();
    }

    private boolean hasNextPostponed()
    {
        return !postponedRoutes.isEmpty();
    }

    private boolean hasNextProxy()
    {
        return nextProxyIndex < proxies.size();
    }

    private InetSocketAddress nextInetSocketAddress()
    {
        if (!hasNextInetSocketAddress())
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(address.getUriHost()).append("; exhausted inet socket addresses: ").append(inetSocketAddresses).toString());
        } else
        {
            List list = inetSocketAddresses;
            int i = nextInetSocketAddressIndex;
            nextInetSocketAddressIndex = i + 1;
            return (InetSocketAddress)list.get(i);
        }
    }

    private Route nextPostponed()
    {
        return (Route)postponedRoutes.remove(0);
    }

    private Proxy nextProxy()
    {
        if (!hasNextProxy())
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(address.getUriHost()).append("; exhausted proxy configurations: ").append(proxies).toString());
        } else
        {
            Object obj = proxies;
            int i = nextProxyIndex;
            nextProxyIndex = i + 1;
            obj = (Proxy)((List) (obj)).get(i);
            resetNextInetSocketAddress(((Proxy) (obj)));
            return ((Proxy) (obj));
        }
    }

    private void resetNextInetSocketAddress(Proxy proxy)
    {
        inetSocketAddresses = new ArrayList();
        int i;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS)
        {
            proxy = address.getUriHost();
            i = address.getUriPort();
        } else
        {
            proxy = proxy.address();
            if (!(proxy instanceof InetSocketAddress))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Proxy.address() is not an InetSocketAddress: ").append(proxy.getClass()).toString());
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy;
            proxy = getHostString(inetsocketaddress);
            i = inetsocketaddress.getPort();
        }
        if (i < 1 || i > 65535)
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(proxy).append(":").append(i).append("; port is out of range").toString());
        }
        proxy = network.resolveInetAddresses(proxy);
        int k = proxy.length;
        for (int j = 0; j < k; j++)
        {
            InetAddress inetaddress = proxy[j];
            inetSocketAddresses.add(new InetSocketAddress(inetaddress, i));
        }

        nextInetSocketAddressIndex = 0;
    }

    private void resetNextProxy(HttpUrl httpurl, Proxy proxy)
    {
        if (proxy != null)
        {
            proxies = Collections.singletonList(proxy);
        } else
        {
            proxies = new ArrayList();
            httpurl = client.getProxySelector().select(httpurl.uri());
            if (httpurl != null)
            {
                proxies.addAll(httpurl);
            }
            proxies.removeAll(Collections.singleton(Proxy.NO_PROXY));
            proxies.add(Proxy.NO_PROXY);
        }
        nextProxyIndex = 0;
    }

    public void connectFailed(Route route, IOException ioexception)
    {
        if (route.getProxy().type() != java.net.Proxy.Type.DIRECT && address.getProxySelector() != null)
        {
            address.getProxySelector().connectFailed(url.uri(), route.getProxy().address(), ioexception);
        }
        routeDatabase.failed(route);
    }

    public boolean hasNext()
    {
        return hasNextInetSocketAddress() || hasNextProxy() || hasNextPostponed();
    }

    public Route next()
    {
        if (hasNextInetSocketAddress()) goto _L2; else goto _L1
_L1:
        if (hasNextProxy()) goto _L4; else goto _L3
_L3:
        Route route;
        if (!hasNextPostponed())
        {
            throw new NoSuchElementException();
        }
        route = nextPostponed();
_L6:
        return route;
_L4:
        lastProxy = nextProxy();
_L2:
        lastInetSocketAddress = nextInetSocketAddress();
        Route route1 = new Route(address, lastProxy, lastInetSocketAddress);
        route = route1;
        if (routeDatabase.shouldPostpone(route1))
        {
            postponedRoutes.add(route1);
            return next();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
