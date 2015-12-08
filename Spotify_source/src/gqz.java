// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class gqz
{

    final gra a;
    public final grw b;
    public Socket c;
    boolean d;
    gua e;
    gst f;
    public Protocol g;
    long h;
    public grg i;
    int j;
    Object k;

    public gqz(gra gra, grw grw1)
    {
        d = false;
        g = Protocol.b;
        a = gra;
        b = grw1;
    }

    final void a(int l, int i1, grq grq1, grz grz1)
    {
        Object obj;
        Object obj1;
        Object obj5;
        obj1 = null;
        obj = null;
        boolean flag = true;
        grw grw1 = b;
        if (grw1.a.e == null || grw1.b.type() != java.net.Proxy.Type.HTTP)
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        String s;
        Object obj2 = new grk();
        if ("https".equalsIgnoreCase("http"))
        {
            obj2.a = "http";
        } else
        if ("https".equalsIgnoreCase("https"))
        {
            obj2.a = "https";
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected scheme: ")).append("https").toString());
        }
        obj5 = grq1.a.c;
        if (obj5 == null)
        {
            throw new IllegalArgumentException("host == null");
        }
        s = grk.a(((String) (obj5)), 0, ((String) (obj5)).length());
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected host: ")).append(((String) (obj5))).toString());
        }
        obj2.d = s;
        int j1 = grq1.a.d;
        if (j1 <= 0 || j1 > 65535)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected port: ")).append(j1).toString());
        }
        obj2.e = j1;
        obj2 = ((grk) (obj2)).b();
        obj2 = (new grr()).a(((grj) (obj2))).a("Host", gsp.a(((grj) (obj2)))).a("Proxy-Connection", "Keep-Alive");
        obj5 = grq1.a("User-Agent");
        if (obj5 != null)
        {
            ((grr) (obj2)).a("User-Agent", ((String) (obj5)));
        }
        grq1 = grq1.a("Proxy-Authorization");
        if (grq1 != null)
        {
            ((grr) (obj2)).a("Proxy-Authorization", grq1);
        }
        grq1 = ((grr) (obj2)).b();
        obj5 = new gua(a, this, c);
        ((gua) (obj5)).a(l, i1);
        obj2 = grq1.a;
        s = (new StringBuilder("CONNECT ")).append(((grj) (obj2)).c).append(":").append(((grj) (obj2)).d).append(" HTTP/1.1").toString();
_L7:
        ((gua) (obj5)).a(grq1.c, s);
        ((gua) (obj5)).a();
        Object obj3 = ((gua) (obj5)).c();
        obj3.a = grq1;
        grq1 = ((gru) (obj3)).a();
        long l2 = gum.a(grq1);
        long l1 = l2;
        if (l2 == -1L)
        {
            l1 = 0L;
        }
        obj3 = ((gua) (obj5)).a(l1);
        gsp.a(((hcw) (obj3)), 0x7fffffff, TimeUnit.MILLISECONDS);
        ((hcw) (obj3)).close();
        ((grt) (grq1)).c;
        JVM INSTR lookupswitch 2: default 520
    //                   200: 547
    //                   407: 575;
           goto _L3 _L4 _L5
_L3:
        throw new IOException((new StringBuilder("Unexpected response code for CONNECT: ")).append(((grt) (grq1)).c).toString());
_L4:
        if (((gua) (obj5)).c.b().b > 0L)
        {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
          goto _L2
_L5:
        Object obj4;
        obj4 = gum.a(b.a.h, grq1, b.b);
        grq1 = ((grq) (obj4));
        if (obj4 != null) goto _L7; else goto _L6
_L6:
        throw new IOException("Failed to authenticate with proxy");
_L2:
        obj4 = b.a;
        grq1 = ((gqk) (obj4)).e;
        grq1 = (SSLSocket)grq1.createSocket(c, ((gqk) (obj4)).b, ((gqk) (obj4)).c, true);
        obj5 = grz1.a(grq1);
        if (((grb) (obj5)).g)
        {
            gsk.a().a(grq1, ((gqk) (obj4)).b, ((gqk) (obj4)).i);
        }
        grq1.startHandshake();
        obj = grg.a(grq1.getSession());
        if (!((gqk) (obj4)).f.verify(((gqk) (obj4)).b, grq1.getSession()))
        {
            grz1 = (X509Certificate)((grg) (obj)).b.get(0);
            throw new SSLPeerUnverifiedException((new StringBuilder("Hostname ")).append(((gqk) (obj4)).b).append(" not verified:\n    certificate: ").append(gqw.a(grz1)).append("\n    DN: ").append(grz1.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(guy.a(grz1)).toString());
        }
          goto _L8
        grz1;
_L16:
        if (gsp.a(grz1))
        {
            throw new IOException(grz1);
        }
          goto _L9
        obj;
        grz1 = grq1;
        grq1 = ((grq) (obj));
_L14:
        if (grz1 != null)
        {
            gsk.a().a(grz1);
        }
        gsp.a(grz1);
        throw grq1;
_L8:
        ((gqk) (obj4)).g.a(((gqk) (obj4)).b, ((grg) (obj)).b);
        grz1 = obj1;
        if (((grb) (obj5)).g)
        {
            grz1 = gsk.a().b(grq1);
        }
        if (grz1 == null) goto _L11; else goto _L10
_L10:
        grz1 = Protocol.a(grz1);
_L12:
        g = grz1;
        i = ((grg) (obj));
        c = grq1;
        if (grq1 != null)
        {
            gsk.a().a(grq1);
        }
        return;
_L11:
        grz1 = Protocol.b;
          goto _L12
_L9:
        throw grz1;
        grq1;
        grz1 = ((grz) (obj));
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        grz1 = grq1;
        grq1 = exception;
        if (true) goto _L14; else goto _L13
_L13:
        grz1;
        grq1 = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    final void a(Object obj)
    {
        if (e())
        {
            return;
        }
        gra gra = a;
        gra;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            throw new IllegalStateException("Connection already has an owner!");
        }
        break MISSING_BLOCK_LABEL_38;
        obj;
        gra;
        JVM INSTR monitorexit ;
        throw obj;
        k = obj;
        gra;
        JVM INSTR monitorexit ;
    }

    final boolean a()
    {
label0:
        {
            synchronized (a)
            {
                if (k != null)
                {
                    break label0;
                }
            }
            return false;
        }
        k = null;
        gra;
        JVM INSTR monitorexit ;
        return true;
        exception;
        gra;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final boolean b()
    {
        return !c.isClosed() && !c.isInputShutdown() && !c.isOutputShutdown();
    }

    final boolean c()
    {
        return f == null || f.a();
    }

    final long d()
    {
        if (f == null)
        {
            return h;
        } else
        {
            return f.b();
        }
    }

    final boolean e()
    {
        return f != null;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Connection{")).append(b.a.b).append(":").append(b.a.c).append(", proxy=").append(b.b).append(" hostAddress=").append(b.c.getAddress().getHostAddress()).append(" cipherSuite=");
        String s;
        if (i != null)
        {
            s = i.a;
        } else
        {
            s = "none";
        }
        return stringbuilder.append(s).append(" protocol=").append(g).append('}').toString();
    }
}
