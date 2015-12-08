// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            Platform

private static class <init> extends Platform
{

    protected final Class openSslSocketClass;
    private final Method setHostname;
    private final Method setUseSessionTickets;

    public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
        throws IOException
    {
        try
        {
            socket.connect(inetsocketaddress, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            inetsocketaddress = new IOException("Exception in connect");
        }
        inetsocketaddress.initCause(socket);
        throw inetsocketaddress;
    }

    public void enableTlsExtensions(SSLSocket sslsocket, String s)
    {
        super.enableTlsExtensions(sslsocket, s);
        if (!openSslSocketClass.isInstance(sslsocket))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        setUseSessionTickets.invoke(sslsocket, new Object[] {
            Boolean.valueOf(true)
        });
        setHostname.invoke(sslsocket, new Object[] {
            s
        });
        return;
        sslsocket;
        throw new RuntimeException(sslsocket);
        sslsocket;
        throw new AssertionError(sslsocket);
    }

    private (Class class1, Method method, Method method1)
    {
        openSslSocketClass = class1;
        setUseSessionTickets = method;
        setHostname = method1;
    }

    setHostname(Class class1, Method method, Method method1, setHostname sethostname)
    {
        this(class1, method, method1);
    }
}
