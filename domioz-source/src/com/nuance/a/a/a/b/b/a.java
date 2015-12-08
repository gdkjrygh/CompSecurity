// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.g;
import com.nuance.a.a.a.b.b.a.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.nuance.a.a.a.b.b:
//            c, d, b

public class a
{

    private static final e a = d.a(com/nuance/a/a/a/b/b/a);

    public a()
    {
    }

    static e a()
    {
        return a;
    }

    public static Socket a(com.nuance.a.a.a.b.b.c c1, String s, int i)
    {
        Object obj1;
        obj1 = null;
        if (a.b())
        {
            (new StringBuilder("creating socket hostName [")).append(s).append("] port [").append(i).append("] useProxy [").append(c1.a).append("] isSSL [").append(c1.c).append("]");
        }
        if (c1.a != d.b && c1.a != com.nuance.a.a.a.b.b.d.c) goto _L2; else goto _L1
_L1:
        Object obj;
        Socket socket;
        a.b();
        try
        {
            obj = com.nuance.a.a.a.b.d.a(c1.b).f();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.b();
            obj = null;
        }
        if (a.b())
        {
            (new StringBuilder("System proxy address: [")).append(obj).append("]");
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        socket = a(((SocketAddress) (obj)), s, i);
        obj = obj1;
        if (socket == null) goto _L6; else goto _L5
_L5:
        if (!c1.c) goto _L8; else goto _L7
_L7:
        obj = c.a(socket, s, i, c1.d);
_L6:
        return ((Socket) (obj));
_L8:
        return socket;
_L4:
        obj = obj1;
        if (c1.a == d.b) goto _L6; else goto _L2
_L2:
        if (c1.c)
        {
            return c.a(s, i, c1.d);
        } else
        {
            return new Socket(s, i);
        }
    }

    private static Socket a(SocketAddress socketaddress, String s, int i)
    {
        Socket socket;
        boolean flag = true;
        socket = new Socket();
        try
        {
            socket.connect(socketaddress, 2000);
        }
        // Misplaced declaration of an exception variable
        catch (SocketAddress socketaddress)
        {
            if (a.b())
            {
                a.a("proxy socket connecting failed!", socketaddress);
            }
            return null;
        }
        (new Thread(new b(s, i, socket.getOutputStream()))).start();
        socketaddress = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        s = socketaddress.readLine();
        if (a.b())
        {
            (new StringBuilder("proxy status: [")).append(s).append("]");
        }
        s = Pattern.compile("^HTTP/\\d+\\.\\d+ (\\d\\d\\d) .*").matcher(s);
        if (!s.matches()) goto _L2; else goto _L1
_L1:
        s = s.group(1);
        if (s == null || s.length() <= 0 || '2' != s.charAt(0)) goto _L2; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L5:
        s = socketaddress.readLine();
        if (!"".equals(s))
        {
            if (a.b())
            {
                (new StringBuilder("proxy: [")).append(s).append("]");
            }
        } else
        if (i == 0)
        {
            throw new IOException("Proxy connect error");
        } else
        {
            return socket;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
