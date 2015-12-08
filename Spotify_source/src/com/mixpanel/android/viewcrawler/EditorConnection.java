// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import cvz;
import cwb;
import cyw;
import cyx;
import cyy;
import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class EditorConnection
{

    private static final ByteBuffer d = ByteBuffer.allocate(0);
    public final cyx a;
    private final cyw b;
    private final URI c;

    public EditorConnection(URI uri, cyw cyw, Socket socket)
    {
        b = cyw;
        c = uri;
        try
        {
            a = new cyx(this, uri, socket);
            uri = a;
            if (((cwb) (uri)).c != null)
            {
                throw new IllegalStateException("WebSocketClient objects are not reuseable");
            }
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new EditorConnectionException(uri);
        }
        uri.c = new Thread(uri);
        ((cwb) (uri)).c.start();
        ((cwb) (uri)).d.await();
        ((cwb) (uri)).a.c();
        return;
    }

    public static cyw a(EditorConnection editorconnection)
    {
        return editorconnection.b;
    }

    public static URI b(EditorConnection editorconnection)
    {
        return editorconnection.c;
    }

    public static ByteBuffer b()
    {
        return d;
    }

    public static cyx c(EditorConnection editorconnection)
    {
        return editorconnection.a;
    }

    public final BufferedOutputStream a()
    {
        return new BufferedOutputStream(new cyy(this, (byte)0));
    }


    private class EditorConnectionException extends IOException
    {

        private static final long serialVersionUID = 0xe5d74d12ed411d3cL;
        final EditorConnection this$0;

        public EditorConnectionException(Throwable throwable)
        {
            this$0 = EditorConnection.this;
            super(throwable.getMessage());
        }
    }

}
