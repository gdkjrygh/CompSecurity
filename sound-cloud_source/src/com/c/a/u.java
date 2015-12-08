// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.a;
import com.c.a.a.a.e;
import com.c.a.a.a.l;
import com.c.a.a.a.s;
import com.c.a.a.b.c;
import com.c.a.a.b.q;
import com.c.a.a.c.b;
import com.c.a.a.d;
import com.c.a.a.g;
import com.c.a.a.h;
import com.c.a.a.i;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.c.a:
//            i, t, j, C, 
//            a, w, l, v, 
//            o, f

final class u extends a
{

    u()
    {
    }

    public final com.c.a.a.a.u a(com.c.a.i k, com.c.a.a.a.h h1)
        throws IOException
    {
        if (k.f != null)
        {
            return new s(h1, k.f);
        } else
        {
            return new l(h1, k.e);
        }
    }

    public final com.c.a.a.b a(t t1)
    {
        return t1.l;
    }

    public final void a(com.c.a.i k, v v1)
    {
        if (v1 == null)
        {
            throw new IllegalArgumentException("protocol == null");
        } else
        {
            k.g = v1;
            return;
        }
    }

    public final void a(j j1, com.c.a.i k)
    {
label0:
        {
            if (!k.e() && k.a())
            {
                if (k.b())
                {
                    break label0;
                }
                i.a(k.c);
            }
            return;
        }
        try
        {
            g.a().b(k.c);
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            g.a();
            g.a((new StringBuilder("Unable to untagSocket(): ")).append(j1).toString());
            i.a(k.c);
            return;
        }
        j1;
        JVM INSTR monitorenter ;
        j1.a(k);
        k.j = k.j + 1;
        if (k.f != null)
        {
            throw new IllegalStateException("spdyConnection != null");
        }
        break MISSING_BLOCK_LABEL_110;
        k;
        j1;
        JVM INSTR monitorexit ;
        throw k;
        k.h = System.nanoTime();
        j1;
        JVM INSTR monitorexit ;
    }

    public final void a(p.a a1, String s1)
    {
        int k = s1.indexOf(":", 1);
        if (k != -1)
        {
            a1.b(s1.substring(0, k), s1.substring(k + 1));
            return;
        }
        if (s1.startsWith(":"))
        {
            a1.b("", s1.substring(1));
            return;
        } else
        {
            a1.b("", s1);
            return;
        }
    }

    public final void a(t t1, com.c.a.i k, com.c.a.a.a.h h1, w w1)
        throws IOException
    {
        g g1;
        SSLSocket sslsocket;
        String as[] = null;
        k.a(h1);
        if (k.d)
        {
            break MISSING_BLOCK_LABEL_1120;
        }
        h1 = k.b;
        int i1;
        int i2;
        int k2;
        if (((C) (h1)).a.e != null && ((C) (h1)).b.type() == java.net.Proxy.Type.HTTP)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            h1 = null;
        } else
        {
            String s1 = w1.a().getHost();
            i1 = i.a(w1.a());
            if (i1 == i.a("https"))
            {
                h1 = s1;
            } else
            {
                h1 = (new StringBuilder()).append(s1).append(":").append(i1).toString();
            }
            h1 = (new w.a()).a(new URL("https", s1, i1, "/")).a("Host", h1).a("Proxy-Connection", "Keep-Alive");
            s1 = w1.a("User-Agent");
            if (s1 != null)
            {
                h1.a("User-Agent", s1);
            }
            w1 = w1.a("Proxy-Authorization");
            if (w1 != null)
            {
                h1.a("Proxy-Authorization", w1);
            }
            h1 = h1.a();
        }
        i1 = t1.w;
        i2 = t1.x;
        k2 = t1.y;
        if (k.d)
        {
            throw new IllegalStateException("already connected");
        }
        com.c.a.l l1;
        C c1;
        if (k.b.b.type() == java.net.Proxy.Type.DIRECT || k.b.b.type() == java.net.Proxy.Type.HTTP)
        {
            k.c = k.b.a..createSocket();
        } else
        {
            k.c = new Socket(k.b.b);
        }
        k.c.setSoTimeout(i2);
        g.a().a(k.c, k.b.c, i1);
        if (k.b.a.e == null) goto _L2; else goto _L1
_L1:
        g1 = g.a();
        if (h1 != null)
        {
            k.a(h1, i2, k2);
        }
        k.c = k.b.a.e.createSocket(k.c, k.b.a.b, k.b.a.c, true);
        sslsocket = (SSLSocket)k.c;
        w1 = k.b.d;
        c1 = k.b;
        h1 = as;
        if (((com.c.a.l) (w1)).e != null)
        {
            h1 = sslsocket.getEnabledCipherSuites();
            h1 = (String[])i.a(java/lang/String, ((com.c.a.l) (w1)).e, h1);
        }
        as = sslsocket.getEnabledProtocols();
        as = (String[])i.a(java/lang/String, ((com.c.a.l) (w1)).f, as);
        l1 = (new l.a(w1)).a(h1).b(as).b();
        sslsocket.setEnabledProtocols(l1.f);
        h1 = l1.e;
        w1 = h1;
        if (c1.e)
        {
            w1 = h1;
            if (Arrays.asList(sslsocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV"))
            {
                if (h1 == null)
                {
                    h1 = sslsocket.getEnabledCipherSuites();
                }
                w1 = new String[h1.length + 1];
                System.arraycopy(h1, 0, w1, 0, h1.length);
                w1[w1.length - 1] = "TLS_FALLBACK_SCSV";
            }
        }
        if (w1 != null)
        {
            sslsocket.setEnabledCipherSuites(w1);
        }
        h1 = g.a();
        if (l1.g)
        {
            h1.a(sslsocket, c1.a.b, c1.a.);
        }
        sslsocket.startHandshake();
        if (!k.b.d.g)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        h1 = g1.b(sslsocket);
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        k.g = com.c.a.v.a(h1);
        g1.a(sslsocket);
        k.i = com.c.a.o.a(sslsocket.getSession());
        if (!k.b.a.f.verify(k.b.a.b, sslsocket.getSession()))
        {
            t1 = (X509Certificate)sslsocket.getSession().getPeerCertificates()[0];
            throw new SSLPeerUnverifiedException((new StringBuilder("Hostname ")).append(k.b.a.b).append(" not verified:\n    certificate: ").append(com.c.a.f.a(t1)).append("\n    DN: ").append(t1.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(com.c.a.a.c.b.a(t1)).toString());
        }
        break MISSING_BLOCK_LABEL_855;
        t1;
        g1.a(sslsocket);
        throw t1;
        k.b.a..a(k.b.a.b, k.i.b);
        if (k.g == com.c.a.v.c || k.g == com.c.a.v.d)
        {
            sslsocket.setSoTimeout(0);
            h1 = new com.c.a.a.b.s.a(k.b.a.b, k.c);
            h1.d = k.g;
            k.f = new com.c.a.a.b.s(h1, (byte)0);
            h1 = k.f;
            ((com.c.a.a.b.s) (h1)).i.a();
            ((com.c.a.a.b.s) (h1)).i.b(((com.c.a.a.b.s) (h1)).e);
            int j1 = ((com.c.a.a.b.s) (h1)).e.b();
            if (j1 != 0x10000)
            {
                ((com.c.a.a.b.s) (h1)).i.a(0, j1 - 0x10000);
            }
        } else
        {
            k.e = new e(k.a, k, k.c);
        }
_L6:
        k.d = true;
        if (!k.e()) goto _L4; else goto _L3
_L3:
        h1 = t1.r;
        if (!k.e())
        {
            throw new IllegalArgumentException();
        }
          goto _L5
_L2:
        k.e = new e(k.a, k, k.c);
          goto _L6
_L5:
        if (!k.b()) goto _L4; else goto _L7
_L7:
        h1;
        JVM INSTR monitorenter ;
        h1.a(k);
        h1;
        JVM INSTR monitorexit ;
_L4:
        t1.c.b(k.b);
        int k1;
        int j2;
        k1 = t1.x;
        j2 = t1.y;
        if (!k.d)
        {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        break MISSING_BLOCK_LABEL_1155;
        t1;
        h1;
        JVM INSTR monitorexit ;
        throw t1;
        if (k.e != null)
        {
            k.c.setSoTimeout(k1);
            k.e.a(k1, j2);
        }
        return;
    }

    public final boolean a(com.c.a.i k)
    {
        return k.a();
    }

    public final int b(com.c.a.i k)
    {
        return k.j;
    }

    public final h b(t t1)
    {
        return t1.c;
    }

    public final void b(com.c.a.i k, com.c.a.a.a.h h1)
    {
        k.a(h1);
    }

    public final d c(t t1)
    {
        return com.c.a.t.a(t1);
    }

    public final boolean c(com.c.a.i k)
    {
        if (k.e != null)
        {
            return k.e.b();
        } else
        {
            return true;
        }
    }
}
