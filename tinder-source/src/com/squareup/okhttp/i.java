// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.a;
import com.squareup.okhttp.internal.b.b;
import com.squareup.okhttp.internal.http.f;
import com.squareup.okhttp.internal.k;
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
import okio.c;
import okio.e;
import okio.r;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, x, a, t, 
//            p, v, k, n, 
//            g, j

public final class i
{

    final j a;
    public final x b;
    public Socket c;
    boolean d;
    f e;
    com.squareup.okhttp.internal.framed.c f;
    public Protocol g;
    long h;
    public n i;
    int j;
    Object k;

    public i(j j1, x x1)
    {
        d = false;
        g = com.squareup.okhttp.Protocol.b;
        a = j1;
        b = x1;
    }

    final void a(int l, int i1, t t1, a a1)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj5;
        obj1 = null;
        obj = null;
        boolean flag = true;
        x x1 = b;
        if (x1.a.e == null || x1.b.type() != java.net.Proxy.Type.HTTP)
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        String s;
        Object obj2 = new p.a();
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
        obj5 = t1.a.c;
        if (obj5 == null)
        {
            throw new IllegalArgumentException("host == null");
        }
        s = com.squareup.okhttp.p.a.a(((String) (obj5)), 0, ((String) (obj5)).length());
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected host: ")).append(((String) (obj5))).toString());
        }
        obj2.d = s;
        int j1 = t1.a.d;
        if (j1 <= 0 || j1 > 65535)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected port: ")).append(j1).toString());
        }
        obj2.e = j1;
        obj2 = ((p.a) (obj2)).b();
        obj2 = (new t.a()).a(((p) (obj2))).a("Host", com.squareup.okhttp.internal.k.a(((p) (obj2)))).a("Proxy-Connection", "Keep-Alive");
        obj5 = t1.a("User-Agent");
        if (obj5 != null)
        {
            ((t.a) (obj2)).a("User-Agent", ((String) (obj5)));
        }
        t1 = t1.a("Proxy-Authorization");
        if (t1 != null)
        {
            ((t.a) (obj2)).a("Proxy-Authorization", t1);
        }
        t1 = ((t.a) (obj2)).a();
        obj5 = new f(a, this, c);
        ((f) (obj5)).a(l, i1);
        obj2 = t1.a;
        s = (new StringBuilder("CONNECT ")).append(((p) (obj2)).c).append(":").append(((p) (obj2)).d).append(" HTTP/1.1").toString();
_L7:
        ((f) (obj5)).a(t1.c, s);
        ((f) (obj5)).a();
        Object obj3 = ((f) (obj5)).c();
        obj3.a = t1;
        t1 = ((v.a) (obj3)).a();
        long l2 = com.squareup.okhttp.internal.http.k.a(t1);
        long l1 = l2;
        if (l2 == -1L)
        {
            l1 = 0L;
        }
        obj3 = ((f) (obj5)).a(l1);
        com.squareup.okhttp.internal.k.a(((r) (obj3)), 0x7fffffff, TimeUnit.MILLISECONDS);
        ((r) (obj3)).close();
        ((v) (t1)).c;
        JVM INSTR lookupswitch 2: default 520
    //                   200: 547
    //                   407: 575;
           goto _L3 _L4 _L5
_L3:
        throw new IOException((new StringBuilder("Unexpected response code for CONNECT: ")).append(((v) (t1)).c).toString());
_L4:
        if (((f) (obj5)).c.b().b > 0L)
        {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
          goto _L2
_L5:
        Object obj4;
        obj4 = com.squareup.okhttp.internal.http.k.a(b.a.h, t1, b.b);
        t1 = ((t) (obj4));
        if (obj4 != null) goto _L7; else goto _L6
_L6:
        throw new IOException("Failed to authenticate with proxy");
_L2:
        obj4 = b.a;
        t1 = ((com.squareup.okhttp.a) (obj4)).e;
        t1 = (SSLSocket)t1.createSocket(c, ((com.squareup.okhttp.a) (obj4)).b, ((com.squareup.okhttp.a) (obj4)).c, true);
        obj5 = a1.a(t1);
        if (((com.squareup.okhttp.k) (obj5)).g)
        {
            com.squareup.okhttp.internal.i.a().a(t1, ((com.squareup.okhttp.a) (obj4)).b, ((com.squareup.okhttp.a) (obj4)).i);
        }
        t1.startHandshake();
        obj = com.squareup.okhttp.n.a(t1.getSession());
        if (!((com.squareup.okhttp.a) (obj4)).f.verify(((com.squareup.okhttp.a) (obj4)).b, t1.getSession()))
        {
            a1 = (X509Certificate)((n) (obj)).b.get(0);
            throw new SSLPeerUnverifiedException((new StringBuilder("Hostname ")).append(((com.squareup.okhttp.a) (obj4)).b).append(" not verified:\n    certificate: ").append(com.squareup.okhttp.g.a(a1)).append("\n    DN: ").append(a1.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(com.squareup.okhttp.internal.b.b.a(a1)).toString());
        }
          goto _L8
        a1;
_L16:
        if (com.squareup.okhttp.internal.k.a(a1))
        {
            throw new IOException(a1);
        }
          goto _L9
        obj;
        a1 = t1;
        t1 = ((t) (obj));
_L14:
        if (a1 != null)
        {
            com.squareup.okhttp.internal.i.a().a(a1);
        }
        com.squareup.okhttp.internal.k.a(a1);
        throw t1;
_L8:
        ((com.squareup.okhttp.a) (obj4)).g.a(((com.squareup.okhttp.a) (obj4)).b, ((n) (obj)).b);
        a1 = obj1;
        if (((com.squareup.okhttp.k) (obj5)).g)
        {
            a1 = com.squareup.okhttp.internal.i.a().b(t1);
        }
        if (a1 == null) goto _L11; else goto _L10
_L10:
        a1 = com.squareup.okhttp.Protocol.a(a1);
_L12:
        g = a1;
        i = ((n) (obj));
        c = t1;
        if (t1 != null)
        {
            com.squareup.okhttp.internal.i.a().a(t1);
        }
        return;
_L11:
        a1 = com.squareup.okhttp.Protocol.b;
          goto _L12
_L9:
        throw a1;
        t1;
        a1 = ((a) (obj));
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        a1 = t1;
        t1 = exception;
        if (true) goto _L14; else goto _L13
_L13:
        a1;
        t1 = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    final void a(Object obj)
    {
        if (e())
        {
            return;
        }
        j j1 = a;
        j1;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            throw new IllegalStateException("Connection already has an owner!");
        }
        break MISSING_BLOCK_LABEL_38;
        obj;
        j1;
        JVM INSTR monitorexit ;
        throw obj;
        k = obj;
        j1;
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
        j1;
        JVM INSTR monitorexit ;
        return true;
        exception;
        j1;
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
