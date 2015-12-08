// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;

// Referenced classes of package com.squareup.okhttp.internal:
//            Platform

private static class <init> extends Platform
{

    private final Method getMtu;

    public int getMtu(Socket socket)
        throws IOException
    {
        NetworkInterface networkinterface;
        int i;
        try
        {
            networkinterface = NetworkInterface.getByInetAddress(socket.getLocalAddress());
        }
        catch (NullPointerException nullpointerexception)
        {
            return super.getMtu(socket);
        }
        catch (SocketException socketexception)
        {
            return super.getMtu(socket);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new AssertionError(socket);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            if (socket.getCause() instanceof IOException)
            {
                throw (IOException)socket.getCause();
            } else
            {
                throw new RuntimeException(socket.getCause());
            }
        }
        if (networkinterface != null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return super.getMtu(socket);
        i = ((Integer)getMtu.invoke(networkinterface, new Object[0])).intValue();
        return i;
    }

    private (Method method)
    {
        getMtu = method;
    }

    getMtu(Method method, getMtu getmtu)
    {
        this(method);
    }
}
