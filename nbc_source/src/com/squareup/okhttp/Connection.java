// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.http.HttpConnection;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.SocketConnector;
import com.squareup.okhttp.internal.http.SpdyTransport;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import okio.BufferedSink;
import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, Route, Address, ConnectionSpec, 
//            OkHttpClient, ConnectionPool, Handshake, Request

public final class Connection
{

    private boolean connected;
    private Handshake handshake;
    private HttpConnection httpConnection;
    private long idleStartTimeNs;
    private Object owner;
    private final ConnectionPool pool;
    private Protocol protocol;
    private int recycleCount;
    private final Route route;
    private Socket socket;
    private SpdyConnection spdyConnection;

    public Connection(ConnectionPool connectionpool, Route route1)
    {
        connected = false;
        protocol = Protocol.HTTP_1_1;
        pool = connectionpool;
        route = route1;
    }

    boolean clearOwner()
    {
label0:
        {
            synchronized (pool)
            {
                if (owner != null)
                {
                    break label0;
                }
            }
            return false;
        }
        owner = null;
        connectionpool;
        JVM INSTR monitorexit ;
        return true;
        exception;
        connectionpool;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void closeIfOwnedBy(Object obj)
        throws IOException
    {
label0:
        {
            if (isSpdy())
            {
                throw new IllegalStateException();
            }
            synchronized (pool)
            {
                if (owner == obj)
                {
                    break label0;
                }
            }
            return;
        }
        owner = null;
        connectionpool;
        JVM INSTR monitorexit ;
        socket.close();
        return;
        obj;
        connectionpool;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void connect(int i, int j, int k, Request request, List list, boolean flag)
        throws RouteException
    {
        if (connected)
        {
            throw new IllegalStateException("already connected");
        }
        SocketConnector socketconnector = new SocketConnector(this, pool);
        if (route.address.getSslSocketFactory() != null)
        {
            request = socketconnector.connectTls(i, j, k, request, route, list, flag);
        } else
        {
            if (!list.contains(ConnectionSpec.CLEARTEXT))
            {
                throw new RouteException(new UnknownServiceException((new StringBuilder()).append("CLEARTEXT communication not supported: ").append(list).toString()));
            }
            request = socketconnector.connectCleartext(i, j, route);
        }
        socket = ((com.squareup.okhttp.internal.http.SocketConnector.ConnectedSocket) (request)).socket;
        handshake = ((com.squareup.okhttp.internal.http.SocketConnector.ConnectedSocket) (request)).handshake;
        if (((com.squareup.okhttp.internal.http.SocketConnector.ConnectedSocket) (request)).alpnProtocol == null)
        {
            request = Protocol.HTTP_1_1;
        } else
        {
            request = ((com.squareup.okhttp.internal.http.SocketConnector.ConnectedSocket) (request)).alpnProtocol;
        }
        protocol = request;
        if (protocol != Protocol.SPDY_3 && protocol != Protocol.HTTP_2) goto _L2; else goto _L1
_L1:
        socket.setSoTimeout(0);
        spdyConnection = (new com.squareup.okhttp.internal.spdy.SpdyConnection.Builder(route.address.uriHost, true, socket)).protocol(protocol).build();
        spdyConnection.sendConnectionPreface();
_L4:
        connected = true;
        return;
_L2:
        try
        {
            httpConnection = new HttpConnection(pool, this, socket);
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            throw new RouteException(request);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void connectAndSetOwner(OkHttpClient okhttpclient, Object obj, Request request)
        throws RouteException
    {
        setOwner(obj);
        if (!isConnected())
        {
            obj = route.address.getConnectionSpecs();
            connect(okhttpclient.getConnectTimeout(), okhttpclient.getReadTimeout(), okhttpclient.getWriteTimeout(), request, ((List) (obj)), okhttpclient.getRetryOnConnectionFailure());
            if (isSpdy())
            {
                okhttpclient.getConnectionPool().share(this);
            }
            okhttpclient.routeDatabase().connected(getRoute());
        }
        setTimeouts(okhttpclient.getReadTimeout(), okhttpclient.getWriteTimeout());
    }

    public Handshake getHandshake()
    {
        return handshake;
    }

    long getIdleStartTimeNs()
    {
        if (spdyConnection == null)
        {
            return idleStartTimeNs;
        } else
        {
            return spdyConnection.getIdleStartTimeNs();
        }
    }

    Object getOwner()
    {
        Object obj;
        synchronized (pool)
        {
            obj = owner;
        }
        return obj;
        exception;
        connectionpool;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Protocol getProtocol()
    {
        return protocol;
    }

    public Route getRoute()
    {
        return route;
    }

    public Socket getSocket()
    {
        return socket;
    }

    void incrementRecycleCount()
    {
        recycleCount = recycleCount + 1;
    }

    boolean isAlive()
    {
        return !socket.isClosed() && !socket.isInputShutdown() && !socket.isOutputShutdown();
    }

    boolean isConnected()
    {
        return connected;
    }

    boolean isIdle()
    {
        return spdyConnection == null || spdyConnection.isIdle();
    }

    boolean isReadable()
    {
        if (httpConnection != null)
        {
            return httpConnection.isReadable();
        } else
        {
            return true;
        }
    }

    boolean isSpdy()
    {
        return spdyConnection != null;
    }

    Transport newTransport(HttpEngine httpengine)
        throws IOException
    {
        if (spdyConnection != null)
        {
            return new SpdyTransport(httpengine, spdyConnection);
        } else
        {
            return new HttpTransport(httpengine, httpConnection);
        }
    }

    BufferedSink rawSink()
    {
        if (httpConnection == null)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return httpConnection.rawSink();
        }
    }

    BufferedSource rawSource()
    {
        if (httpConnection == null)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return httpConnection.rawSource();
        }
    }

    int recycleCount()
    {
        return recycleCount;
    }

    void resetIdleStartTime()
    {
        if (spdyConnection != null)
        {
            throw new IllegalStateException("spdyConnection != null");
        } else
        {
            idleStartTimeNs = System.nanoTime();
            return;
        }
    }

    void setOwner(Object obj)
    {
        if (isSpdy())
        {
            return;
        }
        ConnectionPool connectionpool = pool;
        connectionpool;
        JVM INSTR monitorenter ;
        if (owner != null)
        {
            throw new IllegalStateException("Connection already has an owner!");
        }
        break MISSING_BLOCK_LABEL_38;
        obj;
        connectionpool;
        JVM INSTR monitorexit ;
        throw obj;
        owner = obj;
        connectionpool;
        JVM INSTR monitorexit ;
    }

    void setProtocol(Protocol protocol1)
    {
        if (protocol1 == null)
        {
            throw new IllegalArgumentException("protocol == null");
        } else
        {
            protocol = protocol1;
            return;
        }
    }

    void setTimeouts(int i, int j)
        throws RouteException
    {
        if (!connected)
        {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (httpConnection != null)
        {
            try
            {
                socket.setSoTimeout(i);
            }
            catch (IOException ioexception)
            {
                throw new RouteException(ioexception);
            }
            httpConnection.setTimeouts(i, j);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Connection{").append(route.address.uriHost).append(":").append(route.address.uriPort).append(", proxy=").append(route.proxy).append(" hostAddress=").append(route.inetSocketAddress.getAddress().getHostAddress()).append(" cipherSuite=");
        String s;
        if (handshake != null)
        {
            s = handshake.cipherSuite();
        } else
        {
            s = "none";
        }
        return stringbuilder.append(s).append(" protocol=").append(protocol).append('}').toString();
    }
}
