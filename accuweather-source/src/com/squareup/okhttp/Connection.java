// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.SpdyTransport;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            TunnelRequest, Route, Address

public final class Connection
    implements Closeable
{

    private static final byte HTTP_11[] = {
        104, 116, 116, 112, 47, 49, 46, 49
    };
    private static final byte NPN_PROTOCOLS[] = {
        6, 115, 112, 100, 121, 47, 51, 8, 104, 116, 
        116, 112, 47, 49, 46, 49
    };
    private static final byte SPDY3[] = {
        115, 112, 100, 121, 47, 51
    };
    private boolean connected;
    private int httpMinorVersion;
    private long idleStartTimeNs;
    private InputStream in;
    private OutputStream out;
    private final Route route;
    private Socket socket;
    private SpdyConnection spdyConnection;

    public Connection(Route route1)
    {
        connected = false;
        httpMinorVersion = 1;
        route = route1;
    }

    private void makeTunnel(TunnelRequest tunnelrequest)
        throws IOException
    {
        RawHeaders rawheaders = tunnelrequest.getRequestHeaders();
label0:
        do
        {
            out.write(rawheaders.toBytes());
            RawHeaders rawheaders1 = RawHeaders.fromBytes(in);
            switch (rawheaders1.getResponseCode())
            {
            default:
                throw new IOException((new StringBuilder()).append("Unexpected response code for CONNECT: ").append(rawheaders1.getResponseCode()).toString());

            case 200: 
                break label0;

            case 407: 
                rawheaders = new RawHeaders(rawheaders);
                URL url = new URL("https", tunnelrequest.host, tunnelrequest.port, "/");
                if (!HttpAuthenticator.processAuthHeader(route.address.authenticator, 407, rawheaders1, rawheaders, route.proxy, url))
                {
                    throw new IOException("Failed to authenticate with proxy");
                }
                break;
            }
        } while (true);
    }

    private void upgradeToTls(TunnelRequest tunnelrequest)
        throws IOException
    {
        Platform platform = Platform.get();
        if (requiresTunnel())
        {
            makeTunnel(tunnelrequest);
        }
        socket = route.address.sslSocketFactory.createSocket(socket, route.address.uriHost, route.address.uriPort, true);
        tunnelrequest = (SSLSocket)socket;
        boolean flag;
        if (route.modernTls)
        {
            platform.enableTlsExtensions(tunnelrequest, route.address.uriHost);
        } else
        {
            platform.supportTlsIntolerantServer(tunnelrequest);
        }
        if (route.modernTls && route.address.transports.contains("spdy/3"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            platform.setNpnProtocols(tunnelrequest, NPN_PROTOCOLS);
        }
        tunnelrequest.startHandshake();
        if (!route.address.hostnameVerifier.verify(route.address.uriHost, tunnelrequest.getSession()))
        {
            throw new IOException((new StringBuilder()).append("Hostname '").append(route.address.uriHost).append("' was not verified").toString());
        }
        out = tunnelrequest.getOutputStream();
        in = tunnelrequest.getInputStream();
        if (flag)
        {
            byte abyte0[] = platform.getNpnSelectedProtocol(tunnelrequest);
            if (abyte0 != null)
            {
                if (Arrays.equals(abyte0, SPDY3))
                {
                    tunnelrequest.setSoTimeout(0);
                    spdyConnection = (new com.squareup.okhttp.internal.spdy.SpdyConnection.Builder(route.address.getUriHost(), true, in, out)).build();
                    spdyConnection.sendConnectionHeader();
                } else
                if (!Arrays.equals(abyte0, HTTP_11))
                {
                    throw new IOException((new StringBuilder()).append("Unexpected NPN transport ").append(new String(abyte0, "ISO-8859-1")).toString());
                }
            }
        }
    }

    public void close()
        throws IOException
    {
        socket.close();
    }

    public void connect(int i, int j, TunnelRequest tunnelrequest)
        throws IOException
    {
        if (connected)
        {
            throw new IllegalStateException("already connected");
        }
        connected = true;
        Socket socket1;
        if (route.proxy.type() != java.net.Proxy.Type.HTTP)
        {
            socket1 = new Socket(route.proxy);
        } else
        {
            socket1 = new Socket();
        }
        socket = socket1;
        Platform.get().connectSocket(socket, route.inetSocketAddress, i);
        socket.setSoTimeout(j);
        in = socket.getInputStream();
        out = socket.getOutputStream();
        if (route.address.sslSocketFactory != null)
        {
            upgradeToTls(tunnelrequest);
        }
        j = Platform.get().getMtu(socket);
        i = j;
        if (j < 1024)
        {
            i = 1024;
        }
        j = i;
        if (i > 8192)
        {
            j = 8192;
        }
        in = new BufferedInputStream(in, j);
        out = new BufferedOutputStream(out, j);
    }

    public int getHttpMinorVersion()
    {
        return httpMinorVersion;
    }

    public long getIdleStartTimeNs()
    {
        if (spdyConnection == null)
        {
            return idleStartTimeNs;
        } else
        {
            return spdyConnection.getIdleStartTimeNs();
        }
    }

    public Route getRoute()
    {
        return route;
    }

    public Socket getSocket()
    {
        return socket;
    }

    public SpdyConnection getSpdyConnection()
    {
        return spdyConnection;
    }

    public boolean isAlive()
    {
        return !socket.isClosed() && !socket.isInputShutdown() && !socket.isOutputShutdown();
    }

    public boolean isConnected()
    {
        return connected;
    }

    public boolean isExpired(long l)
    {
        return isIdle() && System.nanoTime() - getIdleStartTimeNs() > l;
    }

    public boolean isIdle()
    {
        return spdyConnection == null || spdyConnection.isIdle();
    }

    public boolean isReadable()
    {
        while (!(in instanceof BufferedInputStream) || isSpdy()) 
        {
            return true;
        }
        BufferedInputStream bufferedinputstream = (BufferedInputStream)in;
        Exception exception;
        int i;
        int j;
        try
        {
            i = socket.getSoTimeout();
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return true;
        }
        catch (IOException ioexception)
        {
            return false;
        }
        socket.setSoTimeout(1);
        bufferedinputstream.mark(1);
        j = bufferedinputstream.read();
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        socket.setSoTimeout(i);
        return false;
        bufferedinputstream.reset();
        socket.setSoTimeout(i);
        return true;
        exception;
        socket.setSoTimeout(i);
        throw exception;
    }

    public boolean isSpdy()
    {
        return spdyConnection != null;
    }

    public Object newTransport(HttpEngine httpengine)
        throws IOException
    {
        if (spdyConnection != null)
        {
            return new SpdyTransport(httpengine, spdyConnection);
        } else
        {
            return new HttpTransport(httpengine, out, in);
        }
    }

    public boolean requiresTunnel()
    {
        return route.address.sslSocketFactory != null && route.proxy.type() == java.net.Proxy.Type.HTTP;
    }

    public void resetIdleStartTime()
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

    public void setHttpMinorVersion(int i)
    {
        httpMinorVersion = i;
    }

}
