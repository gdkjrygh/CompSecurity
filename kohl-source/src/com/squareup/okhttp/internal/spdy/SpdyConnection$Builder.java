// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, IncomingStreamHandler, Variant

public static class <init>
{

    private boolean client;
    private IncomingStreamHandler handler;
    private String hostName;
    private InputStream in;
    private OutputStream out;
    private Variant variant;

    public SpdyConnection build()
    {
        return new SpdyConnection(this, null);
    }

    public <init> handler(IncomingStreamHandler incomingstreamhandler)
    {
        handler = incomingstreamhandler;
        return this;
    }

    public handler http20Draft06()
    {
        variant = Variant.HTTP_20_DRAFT_06;
        return this;
    }

    public _cls6 spdy3()
    {
        variant = Variant.SPDY3;
        return this;
    }







    public (String s, boolean flag, InputStream inputstream, OutputStream outputstream)
    {
        handler = IncomingStreamHandler.REFUSE_INCOMING_STREAMS;
        variant = Variant.SPDY3;
        hostName = s;
        client = flag;
        in = inputstream;
        out = outputstream;
    }

    public out(String s, boolean flag, Socket socket)
        throws IOException
    {
        this(s, flag, socket.getInputStream(), socket.getOutputStream());
    }

    public <init>(boolean flag, InputStream inputstream, OutputStream outputstream)
    {
        this("", flag, inputstream, outputstream);
    }

    public <init>(boolean flag, Socket socket)
        throws IOException
    {
        this("", flag, socket.getInputStream(), socket.getOutputStream());
    }
}
