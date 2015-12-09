// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cs;

import android.util.Base64;
import com.pandora.android.util.s;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collections;
import p.df.a;
import p.dm.i;
import p.dm.m;
import p.dz.c;
import p.eb.d;

// Referenced classes of package p.cs:
//            a

public class b extends p.ed.b
{

    private static int c = 0;
    private static p.dx.b d = null;
    private static b g = null;
    private p.cs.a e;
    private Thread f;

    public b(int j, p.dz.a a1)
        throws UnknownHostException
    {
        super(new InetSocketAddress(j), Collections.singletonList(a1));
        e = null;
        f = null;
    }

    static p.cs.a a(b b1)
    {
        return b1.e;
    }

    public static void a()
    {
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g = new b(9003, new c());
        g.d();
        return;
        UnknownHostException unknownhostexception;
        unknownhostexception;
        p.df.a.a("SocketServer", "Failed to start websocket server for PandoraLink", unknownhostexception);
        return;
    }

    static p.dx.b c()
    {
        return d;
    }

    private static p.cs.a g()
    {
        return new p.cs.a();
    }

    public void a(p.dx.b b1, int j, String s1, boolean flag)
    {
        d = null;
        p.df.a.a("SocketServer", "Disconnected from Socket Service");
        b1 = p.cx.c.a();
        if (b1.J())
        {
            p.df.a.a("SocketServer", "PandoraLink disconnect");
            b1.j();
            e.g();
            e = null;
            f.interrupt();
            f = null;
        }
    }

    public void a(p.dx.b b1, Exception exception)
    {
        p.df.a.b("SocketServer", "Error:", exception);
    }

    public void a(p.dx.b b1, String s1)
    {
        p.df.a.a("SocketServer", (new StringBuilder()).append("onMessageString():").append(s1).toString());
        b1 = Base64.decode(s1, 0);
        p.df.a.a("SocketServer", (new StringBuilder()).append("onMessageHexString():").append(m.d(b1)).toString());
        try
        {
            a(((byte []) (b1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.a("SocketServer", (new StringBuilder()).append("onSocketCommandReceived(): INVALID FRAME, ignoring = ").append(m.d(b1)).toString());
        }
    }

    public void a(p.dx.b b1, ByteBuffer bytebuffer)
    {
        p.df.a.a("SocketServer", (new StringBuilder()).append("onSocketCommandReceived(): payload in hex = ").append(m.d(bytebuffer.array())).toString());
        b1 = bytebuffer.array();
        try
        {
            a(((byte []) (b1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer) { }
        try
        {
            p.df.a.a("SocketServer", (new StringBuilder()).append("onSocketCommandReceived(): INVALID FRAME, ignoring = ").append(m.d(b1)).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.dx.b b1)
        {
            p.df.a.b("SocketServer", "onSocketCommandReceived(): not base64 ", b1);
        }
        return;
    }

    public void a(p.dx.b b1, d d1)
    {
        p.df.a.a("SocketServer", "onWebsocketMessageFragment()");
    }

    public void a(p.dx.b b1, p.ec.a a1)
    {
        d = b1;
        c++;
        p.df.a.a("SocketServer", (new StringBuilder()).append("///////////Connected to Socket Service, connection number").append(c).toString());
        b1 = p.cx.c.a();
        if (!b1.J())
        {
            e = g();
            p.df.a.a("SocketServer", "initializing PandoraLink connection");
            boolean flag;
            if (com.pandora.android.provider.b.a() && com.pandora.android.provider.b.a.g())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                m.bj = true;
                s.g(com.pandora.android.provider.b.a.h());
            }
            b1.a(e);
            b();
        }
    }

    public void a(byte abyte0[])
        throws i
    {
        p.dq.c.a(abyte0);
        p.cx.c c1 = p.cx.c.a();
        if (e == null || e.a())
        {
            p.df.a.a("SocketServer", "onFrameRead - connection is closed, ignoring frame");
        } else
        {
            if (!c1.G())
            {
                p.cx.c.a().a(e);
            }
            if (c1.J())
            {
                try
                {
                    p.df.a.a("SocketServer", "onFrameRead - writing bytes to pandora");
                    e.a(abyte0);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    p.df.a.b("SocketServer", "error writing to Pandora ", abyte0);
                }
                return;
            }
        }
    }

    public void b()
    {
        f = new Thread("SocketServer") {

            final b a;

            public void run()
            {
_L4:
                if (p.cs.b.a(a) == null) goto _L2; else goto _L1
_L1:
                boolean flag = p.cs.b.a(a).a();
                if (!flag) goto _L3; else goto _L2
_L2:
                p.df.a.a("SocketServer", "response thread COMPLETED");
                return;
_L3:
                byte abyte0[] = p.cs.b.a(a).b();
                if (p.cs.b.c() != null)
                {
                    p.df.a.a("SocketServer", (new StringBuilder()).append("responsePayload = ").append(m.d(abyte0)).toString());
                    String s1 = Base64.encodeToString(abyte0, 0);
                    p.df.a.a("SocketServer", (new StringBuilder()).append("responsePayloadBase64Encoded = ").append(s1).toString());
                    p.cs.b.c().c(s1);
                }
                  goto _L4
                IOException ioexception;
                ioexception;
                p.df.a.b("SocketServer", "error in reading from pandora ", ioexception);
                  goto _L2
            }

            
            {
                a = b.this;
                super(s1);
            }
        };
        f.start();
    }

}
