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

    public final void addLine( , String s)
    {
        .addLine(s);
    }

    public final boolean clearOwner(Connection connection)
    {
        return connection.clearOwner();
    }

    public final void closeIfOwnedBy(Connection connection, Object obj)
        throws IOException
    {
        connection.closeIfOwnedBy(obj);
    }

    public final void connectAndSetOwner(OkHttpClient okhttpclient, Connection connection, HttpEngine httpengine, Request request)
        throws IOException
    {
        connection.connectAndSetOwner(okhttpclient, httpengine, request);
    }

    public final InternalCache internalCache(OkHttpClient okhttpclient)
    {
        return okhttpclient.internalCache();
    }

    public final boolean isReadable(Connection connection)
    {
        return connection.isReadable();
    }

    public final Network network(OkHttpClient okhttpclient)
    {
        return OkHttpClient.access$000(okhttpclient);
    }

    public final Transport newTransport(Connection connection, HttpEngine httpengine)
        throws IOException
    {
        return connection.newTransport(httpengine);
    }

    public final void recycle(ConnectionPool connectionpool, Connection connection)
    {
        connectionpool.recycle(connection);
    }

    public final int recycleCount(Connection connection)
    {
        return connection.recycleCount();
    }

    public final RouteDatabase routeDatabase(OkHttpClient okhttpclient)
    {
        return okhttpclient.routeDatabase();
    }

    public final void setOwner(Connection connection, HttpEngine httpengine)
    {
        connection.setOwner(httpengine);
    }

    public final void setProtocol(Connection connection, Protocol protocol)
    {
        connection.setProtocol(protocol);
    }

    ttpEngine()
    {
    }
}
