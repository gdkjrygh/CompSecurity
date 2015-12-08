// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.Transport;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal:
//            InternalCache, Network, RouteDatabase

public abstract class Internal
{

    public static Internal instance;
    public static final Logger logger = Logger.getLogger(com/squareup/okhttp/OkHttpClient.getName());

    public Internal()
    {
    }

    public abstract void addLenient(com.squareup.okhttp.Headers.Builder builder, String s);

    public abstract Connection callEngineGetConnection(Call call);

    public abstract void callEngineReleaseConnection(Call call);

    public abstract void callEnqueue(Call call, Callback callback, boolean flag);

    public abstract boolean clearOwner(Connection connection);

    public abstract void closeIfOwnedBy(Connection connection, Object obj);

    public abstract void connectAndSetOwner(OkHttpClient okhttpclient, Connection connection, HttpEngine httpengine, Request request);

    public abstract void connectionSetOwner(Connection connection, Object obj);

    public abstract InternalCache internalCache(OkHttpClient okhttpclient);

    public abstract boolean isReadable(Connection connection);

    public abstract Network network(OkHttpClient okhttpclient);

    public abstract Transport newTransport(Connection connection, HttpEngine httpengine);

    public abstract void recycle(ConnectionPool connectionpool, Connection connection);

    public abstract int recycleCount(Connection connection);

    public abstract RouteDatabase routeDatabase(OkHttpClient okhttpclient);

    public abstract void setCache(OkHttpClient okhttpclient, InternalCache internalcache);

    public abstract void setNetwork(OkHttpClient okhttpclient, Network network1);

    public abstract void setOwner(Connection connection, HttpEngine httpengine);

    public abstract void setProtocol(Connection connection, Protocol protocol);

}
