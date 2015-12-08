// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

// Referenced classes of package c:
//            ae, s, a, t, 
//            v, x, u, ac, 
//            ad, i, j

public final class r
{

    private static final Logger a = Logger.getLogger(c/r.getName());

    private r()
    {
    }

    public static ac a(OutputStream outputstream)
    {
        return a(outputstream, new ae());
    }

    private static ac a(OutputStream outputstream, ae ae1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (ae1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new s(ae1, outputstream);
        }
    }

    public static ac a(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            a a1 = c(socket);
            return a1.sink(a(socket.getOutputStream(), ((ae) (a1))));
        }
    }

    public static ad a(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))));
        }
    }

    public static ad a(InputStream inputstream)
    {
        return a(inputstream, new ae());
    }

    private static ad a(InputStream inputstream, ae ae1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (ae1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new t(ae1, inputstream);
        }
    }

    public static i a(ac ac)
    {
        if (ac == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new v(ac);
        }
    }

    public static j a(ad ad)
    {
        if (ad == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new x(ad);
        }
    }

    static Logger a()
    {
        return a;
    }

    public static ac b(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file));
        }
    }

    public static ad b(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            a a1 = c(socket);
            return a1.source(a(socket.getInputStream(), a1));
        }
    }

    private static a c(Socket socket)
    {
        return new u(socket);
    }

    public static ac c(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file, true));
        }
    }

}
