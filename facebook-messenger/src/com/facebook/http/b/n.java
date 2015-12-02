// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.analytics.e.i;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            as, aw, f

class n extends DefaultClientConnectionOperator
{

    private static final PlainSocketFactory a = new PlainSocketFactory();
    private i b;

    public n(SchemeRegistry schemeregistry, i i)
    {
        super(schemeregistry);
        b = i;
    }

    public void a(i i)
    {
        b = i;
    }

    public void openConnection(OperatedClientConnection operatedclientconnection, HttpHost httphost, InetAddress inetaddress, HttpContext httpcontext, HttpParams httpparams)
    {
        java.net.Socket socket;
        SocketFactory socketfactory;
        InetAddress ainetaddress[];
        int i;
        if (operatedclientconnection == null)
        {
            throw new IllegalArgumentException("Connection must not be null.");
        }
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host must not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (operatedclientconnection.isOpen())
        {
            throw new IllegalArgumentException("Connection must not be open.");
        }
        Scheme scheme = schemeRegistry.getScheme(httphost.getSchemeName());
        socketfactory = scheme.getSocketFactory();
        Object obj;
        LayeredSocketFactory layeredsocketfactory;
        Object obj1;
        java.net.Socket socket1;
        java.net.Socket socket2;
        if (socketfactory instanceof LayeredSocketFactory)
        {
            obj = a;
            layeredsocketfactory = (LayeredSocketFactory)socketfactory;
        } else
        {
            layeredsocketfactory = null;
            obj = socketfactory;
        }
        if (b != null)
        {
            obj1 = new as(b, httphost.getHostName());
        } else
        {
            obj1 = new f();
        }
        try
        {
            ((aw) (obj1)).a();
            ainetaddress = InetAddress.getAllByName(httphost.getHostName());
            ((aw) (obj1)).b();
        }
        // Misplaced declaration of an exception variable
        catch (OperatedClientConnection operatedclientconnection)
        {
            ((aw) (obj1)).a(operatedclientconnection);
            throw operatedclientconnection;
        }
        i = 0;
_L2:
        if (i >= ainetaddress.length)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        socket1 = ((SocketFactory) (obj)).createSocket();
        operatedclientconnection.opening(socket1, httphost);
        ((aw) (obj1)).c();
        socket2 = ((SocketFactory) (obj)).connectSocket(socket1, ainetaddress[i].getHostAddress(), scheme.resolvePort(httphost.getPort()), inetaddress, 0, httpparams);
        socket = socket1;
        if (socket1 == socket2)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        operatedclientconnection.opening(socket2, httphost);
        socket = socket2;
        ((aw) (obj1)).d();
        prepareSocket(socket, httpcontext, httpparams);
        if (layeredsocketfactory == null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        ((aw) (obj1)).e();
        socket1 = layeredsocketfactory.createSocket(socket, httphost.getHostName(), scheme.resolvePort(httphost.getPort()), true);
        ((aw) (obj1)).f();
        if (socket1 == socket)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        operatedclientconnection.opening(socket1, httphost);
        operatedclientconnection.openCompleted(socketfactory.isSecure(socket1), httpparams);
        return;
        try
        {
            operatedclientconnection.openCompleted(socketfactory.isSecure(socket), httpparams);
            return;
        }
        catch (SocketException socketexception)
        {
            if (i == ainetaddress.length - 1)
            {
                if (socketexception instanceof ConnectException)
                {
                    operatedclientconnection = (ConnectException)socketexception;
                } else
                {
                    operatedclientconnection = new ConnectException(socketexception.getMessage());
                }
                throw new HttpHostConnectException(httphost, operatedclientconnection);
            }
        }
        catch (ConnectTimeoutException connecttimeoutexception)
        {
            if (i == ainetaddress.length - 1)
            {
                throw connecttimeoutexception;
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
