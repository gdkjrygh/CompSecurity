// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import p.dm.b;
import p.dm.m;

public class a
    implements b
{

    private Socket a;
    private ServerSocket b;
    private InputStream c;
    private OutputStream d;
    private String e;

    a(String s, Socket socket)
        throws IOException
    {
        e = "anonymous";
        e = s;
        c = socket.getInputStream();
        d = socket.getOutputStream();
        a = socket;
    }

    public static b a(String s, String s1, int j)
        throws Exception
    {
        return new a(s, new Socket(InetAddress.getByName(s1), j));
    }

    public InputStream e()
    {
        return c;
    }

    public OutputStream f()
    {
        return d;
    }

    public void g()
    {
        m.m((new StringBuilder()).append("closing TCP Connection: ").append(e).toString());
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c.close();
        c = null;
_L4:
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        d.close();
        d = null;
_L1:
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        a.close();
        a = null;
_L2:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        b.close();
        b = null;
        return;
        Object obj;
        obj;
        m.l((new StringBuilder()).append("Error closing input stream: ").append(((IOException) (obj)).getMessage()).toString());
        c = null;
        continue; /* Loop/switch isn't completed */
        obj;
        c = null;
        throw obj;
        obj;
        m.l((new StringBuilder()).append("Error closing output stream: ").append(((IOException) (obj)).getMessage()).toString());
        d = null;
          goto _L1
        obj;
        d = null;
        throw obj;
        obj;
        m.l((new StringBuilder()).append("Error closing socket: ").append(((IOException) (obj)).getMessage()).toString());
        a = null;
          goto _L2
        obj;
        a = null;
        throw obj;
        obj;
        m.l((new StringBuilder()).append("Error closing server socket: ").append(((IOException) (obj)).getMessage()).toString());
        b = null;
        return;
        obj;
        b = null;
        throw obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean i()
    {
        return true;
    }
}
