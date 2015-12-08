// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.Socket;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, IncomingStreamHandler, PushObserver

public static class socket
{

    private boolean client;
    private IncomingStreamHandler handler;
    private String hostName;
    private Protocol protocol;
    private PushObserver pushObserver;
    private Socket socket;

    public SpdyConnection build()
        throws IOException
    {
        return new SpdyConnection(this, null);
    }

    public socket protocol(Protocol protocol1)
    {
        protocol = protocol1;
        return this;
    }







    public (String s, boolean flag, Socket socket1)
        throws IOException
    {
        handler = IncomingStreamHandler.REFUSE_INCOMING_STREAMS;
        protocol = Protocol.SPDY_3;
        pushObserver = PushObserver.CANCEL;
        hostName = s;
        client = flag;
        socket = socket1;
    }
}
