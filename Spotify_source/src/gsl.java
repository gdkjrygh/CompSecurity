// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class gsl extends gsk
{

    private final gsj a;
    private final gsj b;
    private final Method c;
    private final Method d;
    private final gsj e;
    private final gsj f;

    public gsl(gsj gsj1, gsj gsj2, Method method, Method method1, gsj gsj3, gsj gsj4)
    {
        a = gsj1;
        b = gsj2;
        c = method;
        d = method1;
        e = gsj3;
        f = gsj4;
    }

    public final void a(Socket socket)
    {
        if (c == null)
        {
            return;
        }
        try
        {
            c.invoke(null, new Object[] {
                socket
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new RuntimeException(socket);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new RuntimeException(socket.getCause());
        }
    }

    public final void a(Socket socket, InetSocketAddress inetsocketaddress, int i)
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

    public final void a(SSLSocket sslsocket, String s, List list)
    {
        if (s != null)
        {
            a.a(sslsocket, new Object[] {
                Boolean.valueOf(true)
            });
            b.a(sslsocket, new Object[] {
                s
            });
        }
        if (f != null && f.a(sslsocket))
        {
            s = new hch();
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                Protocol protocol = (Protocol)list.get(i);
                if (protocol != Protocol.a)
                {
                    s.b(protocol.toString().length());
                    s.a(protocol.toString());
                }
            }

            s = s.r();
            f.b(sslsocket, new Object[] {
                s
            });
        }
    }

    public final String b(SSLSocket sslsocket)
    {
        if (e == null)
        {
            return null;
        }
        if (!e.a(sslsocket))
        {
            return null;
        }
        sslsocket = (byte[])e.b(sslsocket, new Object[0]);
        if (sslsocket != null)
        {
            return new String(sslsocket, gsp.c);
        } else
        {
            return null;
        }
    }

    public final void b(Socket socket)
    {
        if (d == null)
        {
            return;
        }
        try
        {
            d.invoke(null, new Object[] {
                socket
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new RuntimeException(socket);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new RuntimeException(socket.getCause());
        }
    }
}
