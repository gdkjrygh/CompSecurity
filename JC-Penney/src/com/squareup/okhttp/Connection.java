// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.ad;
import c.i;
import c.j;
import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.http.FramedTransport;
import com.squareup.okhttp.internal.http.HttpConnection;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, Route, Address, ConnectionSpec, 
//            Handshake, CertificatePinner, Request, HttpUrl, 
//            Response, OkHttpClient, ConnectionPool

public final class Connection
{

    private boolean connected;
    private FramedConnection framedConnection;
    private Handshake handshake;
    private HttpConnection httpConnection;
    private long idleStartTimeNs;
    private Object owner;
    private final ConnectionPool pool;
    private Protocol protocol;
    private int recycleCount;
    private final Route route;
    private Socket socket;

    public Connection(ConnectionPool connectionpool, Route route1)
    {
        connected = false;
        protocol = Protocol.HTTP_1_1;
        pool = connectionpool;
        route = route1;
    }

    private void connectSocket(int i, int j, int k, Request request, ConnectionSpecSelector connectionspecselector)
    {
        socket.setSoTimeout(j);
        Platform.get().connectSocket(socket, route.getSocketAddress(), i);
        if (route.address.getSslSocketFactory() != null)
        {
            connectTls(j, k, request, connectionspecselector);
        }
        if (protocol == Protocol.SPDY_3 || protocol == Protocol.HTTP_2)
        {
            socket.setSoTimeout(0);
            framedConnection = (new com.squareup.okhttp.internal.framed.FramedConnection.Builder(route.address.uriHost, true, socket)).protocol(protocol).build();
            framedConnection.sendConnectionPreface();
            return;
        } else
        {
            httpConnection = new HttpConnection(pool, this, socket);
            return;
        }
    }

    private void connectTls(int i, int j, Request request, ConnectionSpecSelector connectionspecselector)
    {
        ConnectionSpec connectionspec;
        Object obj2;
        Address address;
        SSLSocketFactory sslsocketfactory;
        Object obj = null;
        obj2 = null;
        connectionspec = null;
        if (route.requiresTunnel())
        {
            createTunnel(i, j, request);
        }
        address = route.getAddress();
        sslsocketfactory = address.getSslSocketFactory();
        request = obj;
        Object obj1 = (SSLSocket)sslsocketfactory.createSocket(socket, address.getUriHost(), address.getUriPort(), true);
        connectionspec = connectionspecselector.configureSecureSocket(((SSLSocket) (obj1)));
        if (connectionspec.supportsTlsExtensions())
        {
            Platform.get().configureTlsExtensions(((SSLSocket) (obj1)), address.getUriHost(), address.getProtocols());
        }
        ((SSLSocket) (obj1)).startHandshake();
        connectionspecselector = Handshake.get(((SSLSocket) (obj1)).getSession());
        if (!address.getHostnameVerifier().verify(address.getUriHost(), ((SSLSocket) (obj1)).getSession()))
        {
            request = (X509Certificate)connectionspecselector.peerCertificates().get(0);
            throw new SSLPeerUnverifiedException((new StringBuilder()).append("Hostname ").append(address.getUriHost()).append(" not verified:").append("\n    certificate: ").append(CertificatePinner.pin(request)).append("\n    DN: ").append(request.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(OkHostnameVerifier.allSubjectAltNames(request)).toString());
        }
          goto _L1
        request;
        connectionspecselector = ((ConnectionSpecSelector) (obj1));
        obj1 = request;
_L8:
        request = connectionspecselector;
        if (!Util.isAndroidGetsocknameError(((AssertionError) (obj1)))) goto _L3; else goto _L2
_L2:
        request = connectionspecselector;
        throw new IOException(((Throwable) (obj1)));
        connectionspecselector;
        obj1 = request;
        request = connectionspecselector;
_L6:
        if (obj1 != null)
        {
            Platform.get().afterHandshake(((SSLSocket) (obj1)));
        }
        Util.closeQuietly(((Socket) (obj1)));
        throw request;
_L1:
        address.getCertificatePinner().check(address.getUriHost(), connectionspecselector.peerCertificates());
        request = obj2;
        if (connectionspec.supportsTlsExtensions())
        {
            request = Platform.get().getSelectedProtocol(((SSLSocket) (obj1)));
        }
        if (request == null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        request = Protocol.get(request);
_L4:
        protocol = request;
        handshake = connectionspecselector;
        socket = ((Socket) (obj1));
        if (obj1 != null)
        {
            Platform.get().afterHandshake(((SSLSocket) (obj1)));
        }
        return;
        request = Protocol.HTTP_1_1;
          goto _L4
_L3:
        request = connectionspecselector;
        throw obj1;
        request;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        connectionspecselector = connectionspec;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void createTunnel(int i, int j, Request request)
    {
        request = createTunnelRequest(request);
        HttpConnection httpconnection = new HttpConnection(pool, this, socket);
        httpconnection.setTimeouts(i, j);
        HttpUrl httpurl = request.httpUrl();
        String s = (new StringBuilder()).append("CONNECT ").append(httpurl.host()).append(":").append(httpurl.port()).append(" HTTP/1.1").toString();
        do
        {
            httpconnection.writeRequest(request.headers(), s);
            httpconnection.flush();
            request = httpconnection.readResponse().request(request).build();
            long l1 = OkHeaders.contentLength(request);
            long l = l1;
            if (l1 == -1L)
            {
                l = 0L;
            }
            Object obj = httpconnection.newFixedLengthSource(l);
            Util.skipAll(((ad) (obj)), 0x7fffffff, TimeUnit.MILLISECONDS);
            ((ad) (obj)).close();
            switch (request.code())
            {
            default:
                throw new IOException((new StringBuilder()).append("Unexpected response code for CONNECT: ").append(request.code()).toString());

            case 200: 
                if (httpconnection.bufferSize() > 0L)
                {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else
                {
                    return;
                }

            case 407: 
                obj = OkHeaders.processAuthHeader(route.getAddress().getAuthenticator(), request, route.getProxy());
                request = ((Request) (obj));
                break;
            }
        } while (obj != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private Request createTunnelRequest(Request request)
    {
        Object obj = (new HttpUrl.Builder()).scheme("https").host(request.httpUrl().host()).port(request.httpUrl().port()).build();
        obj = (new Request.Builder()).url(((HttpUrl) (obj))).header("Host", Util.hostHeader(((HttpUrl) (obj)))).header("Proxy-Connection", "Keep-Alive");
        String s = request.header("User-Agent");
        if (s != null)
        {
            ((Request.Builder) (obj)).header("User-Agent", s);
        }
        request = request.header("Proxy-Authorization");
        if (request != null)
        {
            ((Request.Builder) (obj)).header("Proxy-Authorization", request);
        }
        return ((Request.Builder) (obj)).build();
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
    {
label0:
        {
            if (isFramed())
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
        if (socket != null)
        {
            socket.close();
            return;
        } else
        {
            return;
        }
        obj;
        connectionpool;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void connect(int i, int j, int k, Request request, List list, boolean flag)
    {
        ConnectionSpecSelector connectionspecselector;
        Proxy proxy;
        Address address;
        if (connected)
        {
            throw new IllegalStateException("already connected");
        }
        connectionspecselector = new ConnectionSpecSelector(list);
        proxy = route.getProxy();
        address = route.getAddress();
        if (route.address.getSslSocketFactory() == null && !list.contains(ConnectionSpec.CLEARTEXT))
        {
            throw new RouteException(new UnknownServiceException((new StringBuilder()).append("CLEARTEXT communication not supported: ").append(list).toString()));
        }
        break MISSING_BLOCK_LABEL_246;
_L2:
        Socket socket1 = new Socket(proxy);
_L3:
        socket = socket1;
        connectSocket(i, j, k, request, connectionspecselector);
        connected = true;
_L4:
        if (connected)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        if (proxy.type() != java.net.Proxy.Type.DIRECT && proxy.type() != java.net.Proxy.Type.HTTP) goto _L2; else goto _L1
_L1:
        socket1 = address.getSocketFactory().createSocket();
          goto _L3
        IOException ioexception;
        ioexception;
        Util.closeQuietly(socket);
        socket = null;
        if (list == null)
        {
            list = new RouteException(ioexception);
        } else
        {
            list.addConnectException(ioexception);
        }
        if (!flag || !connectionspecselector.connectionFailed(ioexception))
        {
            throw list;
        }
          goto _L4
        return;
        list = null;
          goto _L4
    }

    void connectAndSetOwner(OkHttpClient okhttpclient, Object obj, Request request)
    {
        setOwner(obj);
        if (!isConnected())
        {
            obj = route.address.getConnectionSpecs();
            connect(okhttpclient.getConnectTimeout(), okhttpclient.getReadTimeout(), okhttpclient.getWriteTimeout(), request, ((List) (obj)), okhttpclient.getRetryOnConnectionFailure());
            if (isFramed())
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
        if (framedConnection == null)
        {
            return idleStartTimeNs;
        } else
        {
            return framedConnection.getIdleStartTimeNs();
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

    boolean isFramed()
    {
        return framedConnection != null;
    }

    boolean isIdle()
    {
        return framedConnection == null || framedConnection.isIdle();
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

    Transport newTransport(HttpEngine httpengine)
    {
        if (framedConnection != null)
        {
            return new FramedTransport(httpengine, framedConnection);
        } else
        {
            return new HttpTransport(httpengine, httpConnection);
        }
    }

    i rawSink()
    {
        if (httpConnection == null)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return httpConnection.rawSink();
        }
    }

    j rawSource()
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
        if (framedConnection != null)
        {
            throw new IllegalStateException("framedConnection != null");
        } else
        {
            idleStartTimeNs = System.nanoTime();
            return;
        }
    }

    void setOwner(Object obj)
    {
        if (isFramed())
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
