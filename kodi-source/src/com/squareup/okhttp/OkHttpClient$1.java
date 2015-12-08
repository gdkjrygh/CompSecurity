// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Network;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.Transport;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp:
//            OkHttpClient, Connection, ConnectionPool, Request, 
//            Protocol

static final class ttpEngine extends Internal
{

    public void addLenient( , String s)
    {
        .addLenient(s);
    }

    public boolean clearOwner(Connection connection)
    {
        return connection.clearOwner();
    }

    public void connectAndSetOwner(OkHttpClient okhttpclient, Connection connection, HttpEngine httpengine, Request request)
        throws IOException
    {
        connection.connectAndSetOwner(okhttpclient, httpengine, request);
    }

    public InternalCache internalCache(OkHttpClient okhttpclient)
    {
        return okhttpclient.internalCache();
    }

    public boolean isReadable(Connection connection)
    {
        return connection.isReadable();
    }

    public Network network(OkHttpClient okhttpclient)
    {
        return OkHttpClient.access$000(okhttpclient);
    }

    public Transport newTransport(Connection connection, HttpEngine httpengine)
        throws IOException
    {
        return connection.newTransport(httpengine);
    }

    public void recycle(ConnectionPool connectionpool, Connection connection)
    {
        connectionpool.recycle(connection);
    }

    public int recycleCount(Connection connection)
    {
        return connection.recycleCount();
    }

    public RouteDatabase routeDatabase(OkHttpClient okhttpclient)
    {
        return okhttpclient.routeDatabase();
    }

    public void setOwner(Connection connection, HttpEngine httpengine)
    {
        connection.setOwner(httpengine);
    }

    public void setProtocol(Connection connection, Protocol protocol)
    {
        connection.setProtocol(protocol);
    }

    ttpEngine()
    {
    }
}
