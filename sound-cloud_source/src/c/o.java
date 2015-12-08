// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Logger;

// Referenced classes of package c:
//            s, t, b, p, 
//            z, q, c, r, 
//            x, g, y, h, 
//            a

public final class o
{

    private static final Logger a = Logger.getLogger(c/o.getName());

    private o()
    {
    }

    public static g a(x x)
    {
        if (x == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new s(x);
        }
    }

    public static h a(y y)
    {
        if (y == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new t(y);
        }
    }

    public static x a(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        }
        a a1 = c(socket);
        socket = socket.getOutputStream();
        if (socket == null)
        {
            throw new IllegalArgumentException("out == null");
        } else
        {
            return new b(a1, new p(a1, socket));
        }
    }

    public static y a(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))), new z());
        }
    }

    private static y a(InputStream inputstream, z z1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (z1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new q(z1, inputstream);
        }
    }

    static Logger a()
    {
        return a;
    }

    public static y b(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            a a1 = c(socket);
            return new c(a1, a(socket.getInputStream(), a1));
        }
    }

    private static a c(Socket socket)
    {
        return new r(socket);
    }

}
