// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.CertificatePinner;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            RouteException, HttpConnection, OkHeaders

public class SocketConnector
{
    public static class ConnectedSocket
    {

        public final Protocol alpnProtocol;
        public final Handshake handshake;
        public final Route route;
        public final Socket socket;

        public ConnectedSocket(Route route1, Socket socket1)
        {
            route = route1;
            socket = socket1;
            alpnProtocol = null;
            handshake = null;
        }

        public ConnectedSocket(Route route1, SSLSocket sslsocket, Protocol protocol, Handshake handshake1)
        {
            route = route1;
            socket = sslsocket;
            alpnProtocol = protocol;
            handshake = handshake1;
        }
    }


    private final Connection connection;
    private final ConnectionPool connectionPool;

    public SocketConnector(Connection connection1, ConnectionPool connectionpool)
    {
        connection = connection1;
        connectionPool = connectionpool;
    }

    private Socket connectRawSocket(int i, int j, Route route)
        throws RouteException
    {
        Platform platform = Platform.get();
        Object obj;
        obj = route.getProxy();
        Address address = route.getAddress();
        if (((Proxy) (obj)).type() != java.net.Proxy.Type.DIRECT && ((Proxy) (obj)).type() != java.net.Proxy.Type.HTTP)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = address.getSocketFactory().createSocket();
_L1:
        ((Socket) (obj)).setSoTimeout(i);
        platform.connectSocket(((Socket) (obj)), route.getSocketAddress(), j);
        return ((Socket) (obj));
        try
        {
            obj = new Socket(((Proxy) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Route route)
        {
            throw new RouteException(route);
        }
          goto _L1
    }

    private void createTunnel(int i, int j, Request request, Route route, Socket socket)
        throws RouteException
    {
        HttpConnection httpconnection;
        String s;
        request = createTunnelRequest(request);
        httpconnection = new HttpConnection(connectionPool, connection, socket);
        httpconnection.setTimeouts(i, j);
        socket = request.url();
        s = (new StringBuilder()).append("CONNECT ").append(socket.getHost()).append(":").append(Util.getEffectivePort(socket)).append(" HTTP/1.1").toString();
_L6:
        long l1;
        httpconnection.writeRequest(request.headers(), s);
        httpconnection.flush();
        request = httpconnection.readResponse().request(request).build();
        l1 = OkHeaders.contentLength(request);
        long l;
        l = l1;
        if (l1 == -1L)
        {
            l = 0L;
        }
        socket = httpconnection.newFixedLengthSource(l);
        Util.skipAll(socket, 0x7fffffff, TimeUnit.MILLISECONDS);
        socket.close();
        request.code();
        JVM INSTR lookupswitch 2: default 286
    //                   200: 228
    //                   407: 248;
           goto _L1 _L2 _L3
_L1:
        throw new IOException((new StringBuilder()).append("Unexpected response code for CONNECT: ").append(request.code()).toString());
        request;
        throw new RouteException(request);
_L2:
        if (httpconnection.bufferSize() > 0L)
        {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
          goto _L4
_L3:
        socket = OkHeaders.processAuthHeader(route.getAddress().getAuthenticator(), request, route.getProxy());
        request = socket;
        if (socket != null) goto _L6; else goto _L5
_L5:
        throw new IOException("Failed to authenticate with proxy");
_L4:
    }

    private Request createTunnelRequest(Request request)
        throws IOException
    {
        String s = request.url().getHost();
        int i = Util.getEffectivePort(request.url());
        Object obj;
        if (i == Util.getDefaultPort("https"))
        {
            obj = s;
        } else
        {
            obj = (new StringBuilder()).append(s).append(":").append(i).toString();
        }
        obj = (new com.squareup.okhttp.Request.Builder()).url(new URL("https", s, i, "/")).header("Host", ((String) (obj))).header("Proxy-Connection", "Keep-Alive");
        s = request.header("User-Agent");
        if (s != null)
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).header("User-Agent", s);
        }
        request = request.header("Proxy-Authorization");
        if (request != null)
        {
            ((com.squareup.okhttp.Request.Builder) (obj)).header("Proxy-Authorization", request);
        }
        return ((com.squareup.okhttp.Request.Builder) (obj)).build();
    }

    public ConnectedSocket connectCleartext(int i, int j, Route route)
        throws RouteException
    {
        return new ConnectedSocket(route, connectRawSocket(j, i, route));
    }

    public ConnectedSocket connectTls(int i, int j, int k, Request request, Route route, List list, boolean flag)
        throws RouteException
    {
        Address address;
        ConnectionSpecSelector connectionspecselector;
        address = route.getAddress();
        connectionspecselector = new ConnectionSpecSelector(list);
        list = null;
_L2:
        Object obj;
        Socket socket;
        socket = connectRawSocket(j, i, route);
        if (route.requiresTunnel())
        {
            createTunnel(j, k, request, route, socket);
        }
        obj = null;
        SSLSocket sslsocket = (SSLSocket)address.getSslSocketFactory().createSocket(socket, address.getUriHost(), address.getUriPort(), true);
        obj = sslsocket;
        Object obj2 = connectionspecselector.configureSecureSocket(sslsocket);
        obj = sslsocket;
        Platform platform = Platform.get();
        obj = null;
        Handshake handshake;
        if (((ConnectionSpec) (obj2)).supportsTlsExtensions())
        {
            platform.configureTlsExtensions(sslsocket, address.getUriHost(), address.getProtocols());
        }
        sslsocket.startHandshake();
        handshake = Handshake.get(sslsocket.getSession());
        Object obj1 = obj;
        if (!((ConnectionSpec) (obj2)).supportsTlsExtensions())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj2 = platform.getSelectedProtocol(sslsocket);
        obj1 = obj;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj1 = Protocol.get(((String) (obj2)));
        obj = sslsocket;
        platform.afterHandshake(sslsocket);
        obj = sslsocket;
        if (address.getHostnameVerifier().verify(address.getUriHost(), sslsocket.getSession()))
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj = sslsocket;
        obj1 = (X509Certificate)sslsocket.getSession().getPeerCertificates()[0];
        obj = sslsocket;
        try
        {
            throw new SSLPeerUnverifiedException((new StringBuilder()).append("Hostname ").append(address.getUriHost()).append(" not verified:").append("\n    certificate: ").append(CertificatePinner.pin(((java.security.cert.Certificate) (obj1)))).append("\n    DN: ").append(((X509Certificate) (obj1)).getSubjectDN().getName()).append("\n    subjectAltNames: ").append(OkHostnameVerifier.allSubjectAltNames(((X509Certificate) (obj1)))).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        boolean flag1;
        if (flag && connectionspecselector.connectionFailed(((IOException) (obj1))))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Util.closeQuietly(((Socket) (obj)));
        Util.closeQuietly(socket);
        if (list == null)
        {
            obj = new RouteException(((IOException) (obj1)));
        } else
        {
            list.addConnectException(((IOException) (obj1)));
            obj = list;
        }
        list = ((List) (obj));
        if (flag1) goto _L2; else goto _L1
_L1:
        throw obj;
        obj1;
        obj = sslsocket;
        platform.afterHandshake(sslsocket);
        obj = sslsocket;
        throw obj1;
        obj = sslsocket;
        address.getCertificatePinner().check(address.getUriHost(), handshake.peerCertificates());
        obj = sslsocket;
        obj1 = new ConnectedSocket(route, sslsocket, ((Protocol) (obj1)), handshake);
        return ((ConnectedSocket) (obj1));
    }
}
