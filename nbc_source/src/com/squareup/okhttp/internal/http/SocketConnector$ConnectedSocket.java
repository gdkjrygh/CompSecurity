// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Route;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            SocketConnector

public static class handshake
{

    public final Protocol alpnProtocol;
    public final Handshake handshake;
    public final Route route;
    public final Socket socket;

    public (Route route1, Socket socket1)
    {
        route = route1;
        socket = socket1;
        alpnProtocol = null;
        handshake = null;
    }

    public handshake(Route route1, SSLSocket sslsocket, Protocol protocol, Handshake handshake1)
    {
        route = route1;
        socket = sslsocket;
        alpnProtocol = protocol;
        handshake = handshake1;
    }
}
