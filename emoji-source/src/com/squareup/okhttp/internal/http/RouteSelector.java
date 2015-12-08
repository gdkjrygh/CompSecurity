// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.RouteDatabase;
import com.squareup.okhttp.internal.Dns;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public final class RouteSelector
{

    private static final int TLS_MODE_COMPATIBLE = 0;
    private static final int TLS_MODE_MODERN = 1;
    private static final int TLS_MODE_NULL = -1;
    private final Address address;
    private final Dns dns;
    private boolean hasNextProxy;
    private InetSocketAddress lastInetSocketAddress;
    private Proxy lastProxy;
    private int nextSocketAddressIndex;
    private int nextTlsMode;
    private final ConnectionPool pool;
    private final List postponedRoutes = new LinkedList();
    private final ProxySelector proxySelector;
    private Iterator proxySelectorProxies;
    private final RouteDatabase routeDatabase;
    private InetAddress socketAddresses[];
    private int socketPort;
    private final URI uri;
    private Proxy userSpecifiedProxy;

    public RouteSelector(Address address1, URI uri1, ProxySelector proxyselector, ConnectionPool connectionpool, Dns dns1, RouteDatabase routedatabase)
    {
        nextTlsMode = -1;
        address = address1;
        uri = uri1;
        proxySelector = proxyselector;
        pool = connectionpool;
        dns = dns1;
        routeDatabase = routedatabase;
        resetNextProxy(uri1, address1.getProxy());
    }

    private boolean hasNextInetSocketAddress()
    {
        return socketAddresses != null;
    }

    private boolean hasNextPostponed()
    {
        return !postponedRoutes.isEmpty();
    }

    private boolean hasNextProxy()
    {
        return hasNextProxy;
    }

    private boolean hasNextTlsMode()
    {
        return nextTlsMode != -1;
    }

    private InetSocketAddress nextInetSocketAddress()
        throws UnknownHostException
    {
        InetAddress ainetaddress[] = socketAddresses;
        int i = nextSocketAddressIndex;
        nextSocketAddressIndex = i + 1;
        InetSocketAddress inetsocketaddress = new InetSocketAddress(ainetaddress[i], socketPort);
        if (nextSocketAddressIndex == socketAddresses.length)
        {
            socketAddresses = null;
            nextSocketAddressIndex = 0;
        }
        return inetsocketaddress;
    }

    private Route nextPostponed()
    {
        return (Route)postponedRoutes.remove(0);
    }

    private Proxy nextProxy()
    {
        if (userSpecifiedProxy != null)
        {
            hasNextProxy = false;
            return userSpecifiedProxy;
        }
        if (proxySelectorProxies != null)
        {
            while (proxySelectorProxies.hasNext()) 
            {
                Proxy proxy = (Proxy)proxySelectorProxies.next();
                if (proxy.type() != java.net.Proxy.Type.DIRECT)
                {
                    return proxy;
                }
            }
        }
        hasNextProxy = false;
        return Proxy.NO_PROXY;
    }

    private int nextTlsMode()
    {
        if (nextTlsMode == 1)
        {
            nextTlsMode = 0;
            return 1;
        }
        if (nextTlsMode == 0)
        {
            nextTlsMode = -1;
            return 0;
        } else
        {
            throw new AssertionError();
        }
    }

    private void resetNextInetSocketAddress(Proxy proxy)
        throws UnknownHostException
    {
        socketAddresses = null;
        if (proxy.type() == java.net.Proxy.Type.DIRECT)
        {
            proxy = uri.getHost();
            socketPort = Util.getEffectivePort(uri);
        } else
        {
            proxy = proxy.address();
            if (!(proxy instanceof InetSocketAddress))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Proxy.address() is not an InetSocketAddress: ").append(proxy.getClass()).toString());
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy;
            proxy = inetsocketaddress.getHostName();
            socketPort = inetsocketaddress.getPort();
        }
        socketAddresses = dns.getAllByName(proxy);
        nextSocketAddressIndex = 0;
    }

    private void resetNextProxy(URI uri1, Proxy proxy)
    {
        hasNextProxy = true;
        if (proxy != null)
        {
            userSpecifiedProxy = proxy;
        } else
        {
            uri1 = proxySelector.select(uri1);
            if (uri1 != null)
            {
                proxySelectorProxies = uri1.iterator();
                return;
            }
        }
    }

    private void resetNextTlsMode()
    {
        int i;
        if (address.getSslSocketFactory() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        nextTlsMode = i;
    }

    public void connectFailed(Connection connection, IOException ioexception)
    {
        connection = connection.getRoute();
        if (connection.getProxy().type() != java.net.Proxy.Type.DIRECT && proxySelector != null)
        {
            proxySelector.connectFailed(uri, connection.getProxy().address(), ioexception);
        }
        routeDatabase.failed(connection, ioexception);
    }

    public boolean hasNext()
    {
        return hasNextTlsMode() || hasNextInetSocketAddress() || hasNextProxy() || hasNextPostponed();
    }

    public Connection next(String s)
        throws IOException
    {
        boolean flag = true;
        do
        {
            Connection connection = pool.get(address);
            if (connection == null)
            {
                break;
            }
            if (s.equals("GET") || connection.isReadable())
            {
                return connection;
            }
            connection.close();
        } while (true);
        if (!hasNextTlsMode())
        {
            if (!hasNextInetSocketAddress())
            {
                if (!hasNextProxy())
                {
                    if (!hasNextPostponed())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        return new Connection(nextPostponed());
                    }
                }
                lastProxy = nextProxy();
                resetNextInetSocketAddress(lastProxy);
            }
            lastInetSocketAddress = nextInetSocketAddress();
            resetNextTlsMode();
        }
        Route route;
        if (nextTlsMode() != 1)
        {
            flag = false;
        }
        route = new Route(address, lastProxy, lastInetSocketAddress, flag);
        if (routeDatabase.shouldPostpone(route))
        {
            postponedRoutes.add(route);
            return next(s);
        } else
        {
            return new Connection(route);
        }
    }
}
