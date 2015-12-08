// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.g;
import c.m;
import c.o;
import c.x;
import com.c.a.A;
import com.c.a.B;
import com.c.a.C;
import com.c.a.a.a;
import com.c.a.i;
import com.c.a.j;
import com.c.a.l;
import com.c.a.p;
import com.c.a.q;
import com.c.a.t;
import com.c.a.w;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.c.a.a.a:
//            i, m, r, o, 
//            k, u, b, c

public final class h
{
    public final class a
        implements com.c.a.q.a
    {

        final h a;
        private final int b;
        private final w c;
        private int d;

        public final A a(w w1)
            throws IOException
        {
            d = d + 1;
            if (b > 0)
            {
                q q1 = (q)a.b.i.get(b - 1);
                com.c.a.a a1 = com.c.a.a.a.h.a(a).b.a;
                if (!w1.a().getHost().equals(a1.b) || com.c.a.a.i.a(w1.a()) != a1.c)
                {
                    throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must retain the same host and port").toString());
                }
                if (d > 1)
                {
                    throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must call proceed() exactly once").toString());
                }
            }
            if (b < a.b.i.size())
            {
                w1 = a. new a(b + 1, w1);
                q q2 = (q)a.b.i.get(b);
                A a2 = q2.a();
                if (((a) (w1)).d != 1)
                {
                    throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q2).append(" must call proceed() exactly once").toString());
                } else
                {
                    return a2;
                }
            }
            h.b(a).a(w1);
            if (a.c() && w1.d != null)
            {
                g g1 = c.o.a(h.b(a).a(w1, w1.d.contentLength()));
                w1.d.writeTo(g1);
                g1.close();
            }
            return h.c(a);
        }

        public a(int i1, w w1)
        {
            a = h.this;
            super();
            b = i1;
            c = w1;
        }
    }


    public static final B a = new com.c.a.a.a.i();
    public final t b;
    public i c;
    public com.c.a.a d;
    public r e;
    public C f;
    public final A g;
    public u h;
    public long i;
    public boolean j;
    public final boolean k;
    public final w l;
    public w m;
    public A n;
    public A o;
    public x p;
    public g q;
    public final boolean r;
    public final boolean s;
    public b t;
    public c u;

    public h(t t1, w w1, boolean flag, boolean flag1, boolean flag2, i i1, r r1, 
            A a1)
    {
        i = -1L;
        b = t1;
        l = w1;
        k = flag;
        r = flag1;
        s = flag2;
        c = i1;
        e = r1;
        p = null;
        g = a1;
        if (i1 != null)
        {
            com.c.a.a.a.b.b(i1, this);
            f = i1.b;
            return;
        } else
        {
            f = null;
            return;
        }
    }

    public static A a(A a1)
    {
        A a2 = a1;
        if (a1 != null)
        {
            a2 = a1;
            if (a1.g != null)
            {
                a1 = a1.b();
                a1.g = null;
                a2 = a1.a();
            }
        }
        return a2;
    }

    public static com.c.a.a a(t t1, w w1)
        throws UnknownHostException
    {
        com.c.a.f f1 = null;
        String s1 = w1.a().getHost();
        if (s1 == null || s1.length() == 0)
        {
            throw new UnknownHostException(w1.a().toString());
        }
        javax.net.ssl.SSLSocketFactory sslsocketfactory;
        javax.net.ssl.HostnameVerifier hostnameverifier;
        if (w1.e())
        {
            sslsocketfactory = t1.n;
            hostnameverifier = t1.o;
            f1 = t1.p;
        } else
        {
            hostnameverifier = null;
            sslsocketfactory = null;
        }
        return new com.c.a.a(s1, com.c.a.a.i.a(w1.a()), t1.m, sslsocketfactory, hostnameverifier, f1, t1.q, t1.e, t1.f, t1.g, t1.j);
    }

    static i a(h h1)
    {
        return h1.c;
    }

    public static p a(p p1, p p2)
        throws IOException
    {
        boolean flag = false;
        com.c.a.p.a a1 = new com.c.a.p.a();
        int k1 = p1.a.length / 2;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s1 = p1.a(i1);
            String s2 = p1.b(i1);
            if ((!"Warning".equalsIgnoreCase(s1) || !s2.startsWith("1")) && (!com.c.a.a.a.m.a(s1) || p2.a(s1) == null))
            {
                a1.a(s1, s2);
            }
        }

        k1 = p2.a.length / 2;
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            p1 = p2.a(j1);
            if (!"Content-Length".equalsIgnoreCase(p1) && com.c.a.a.a.m.a(p1))
            {
                a1.a(p1, p2.b(j1));
            }
        }

        return a1.a();
    }

    public static String a(URL url)
    {
        if (com.c.a.a.i.a(url) != com.c.a.a.i.a(url.getProtocol()))
        {
            return (new StringBuilder()).append(url.getHost()).append(":").append(url.getPort()).toString();
        } else
        {
            return url.getHost();
        }
    }

    public static boolean a(A a1, A a2)
    {
        if (a2.c != 304) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        a1 = a1.f.b("Last-Modified");
        if (a1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a2 = a2.f.b("Last-Modified");
        if (a2 != null && a2.getTime() < a1.getTime()) goto _L1; else goto _L3
_L3:
        return false;
    }

    static u b(h h1)
    {
        return h1.h;
    }

    static A c(h h1)
        throws IOException
    {
        return h1.g();
    }

    public static boolean c(A a1)
    {
        if (!a1.a.b.equals("HEAD"))
        {
            int i1 = a1.c;
            if ((i1 < 100 || i1 >= 200) && i1 != 204 && i1 != 304)
            {
                return true;
            }
            if (com.c.a.a.a.m.a(a1) != -1L || "chunked".equalsIgnoreCase(a1.a("Transfer-Encoding")))
            {
                return true;
            }
        }
        return false;
    }

    public final i a()
        throws IOException
    {
        r r1;
        j j1;
        j1 = b.r;
        do
        {
            i i1 = j1.a(d);
            if (i1 == null)
            {
                break;
            }
            if (m.b.equals("GET") || com.c.a.a.a.b.c(i1))
            {
                return i1;
            }
            i1.c.close();
        } while (true);
        r1 = e;
_L10:
        if (r1.d()) goto _L2; else goto _L1
_L1:
        if (r1.b()) goto _L4; else goto _L3
_L3:
        if (r1.a()) goto _L6; else goto _L5
_L5:
        Object obj;
        if (!r1.e())
        {
            throw new NoSuchElementException();
        }
        obj = (C)r1.m.remove(0);
_L8:
        return new i(j1, ((C) (obj)));
_L6:
        if (!r1.a())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(r1.a.b).append("; exhausted proxy configurations: ").append(r1.g).toString());
        }
        obj = r1.g;
        int k1 = r1.h;
        r1.h = k1 + 1;
        obj = (Proxy)((List) (obj)).get(k1);
        r1.a(((Proxy) (obj)));
        r1.d = ((Proxy) (obj));
_L4:
        if (!r1.b())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(r1.a.b).append("; exhausted inet socket addresses: ").append(r1.i).toString());
        }
        obj = r1.i;
        int l1 = r1.j;
        r1.j = l1 + 1;
        obj = (InetSocketAddress)((List) (obj)).get(l1);
        r1.c();
        r1.e = ((InetSocketAddress) (obj));
_L2:
        C c1;
        if (r1.k.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder("No route to ");
            if (r1.b.getScheme() != null)
            {
                obj = (new StringBuilder()).append(r1.b.getScheme()).append("://").toString();
            } else
            {
                obj = "//";
            }
            throw new UnknownServiceException(stringbuilder.append(((String) (obj))).append(r1.a.b).append("; no connection specs").toString());
        }
        if (!r1.d())
        {
            StringBuilder stringbuilder1 = new StringBuilder("No route to ");
            if (r1.b.getScheme() != null)
            {
                obj = (new StringBuilder()).append(r1.b.getScheme()).append("://").toString();
            } else
            {
                obj = "//";
            }
            throw new SocketException(stringbuilder1.append(((String) (obj))).append(r1.a.b).append("; exhausted connection specs: ").append(r1.k).toString());
        }
        obj = r1.k;
        int i2 = r1.l;
        r1.l = i2 + 1;
        r1.f = (l)((List) (obj)).get(i2);
        boolean flag = r1.a(r1.f);
        c1 = new C(r1.a, r1.d, r1.e, r1.f, flag);
        obj = c1;
        if (!r1.c.c(c1)) goto _L8; else goto _L7
_L7:
        r1.m.add(c1);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(p p1)
        throws IOException
    {
        CookieHandler cookiehandler = b.k;
        if (cookiehandler != null)
        {
            cookiehandler.put(l.b(), com.c.a.a.a.m.b(p1));
        }
    }

    public final A b(A a1)
        throws IOException
    {
        while (!j || !"gzip".equalsIgnoreCase(o.a("Content-Encoding")) || a1.g == null) 
        {
            return a1;
        }
        m m1 = new m(a1.g.c());
        p p1 = a1.f.a().a("Content-Encoding").a("Content-Length").a();
        a1 = a1.b().a(p1);
        a1.g = new com.c.a.a.a.o(p1, c.o.a(m1));
        return a1.a();
    }

    public final void b()
    {
        if (i != -1L)
        {
            throw new IllegalStateException();
        } else
        {
            i = System.currentTimeMillis();
            return;
        }
    }

    public final boolean b(URL url)
    {
        URL url1 = l.a();
        return url1.getHost().equals(url.getHost()) && com.c.a.a.i.a(url1) == com.c.a.a.i.a(url) && url1.getProtocol().equals(url.getProtocol());
    }

    public final boolean c()
    {
        return com.c.a.a.a.k.a(l.b);
    }

    public final A d()
    {
        if (o == null)
        {
            throw new IllegalStateException();
        } else
        {
            return o;
        }
    }

    public final void e()
        throws IOException
    {
        if (h != null && c != null)
        {
            h.c();
        }
        c = null;
    }

    public final i f()
    {
        if (q == null) goto _L2; else goto _L1
_L1:
        com.c.a.a.i.a(q);
_L4:
        if (o == null)
        {
            if (c != null)
            {
                com.c.a.a.i.a(c.c);
            }
            c = null;
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (p != null)
        {
            com.c.a.a.i.a(p);
        }
        if (true) goto _L4; else goto _L3
_L3:
        com.c.a.a.i.a(o.g);
        if (h != null && c != null && !h.d())
        {
            com.c.a.a.i.a(c.c);
            c = null;
            return null;
        }
        if (c != null && !com.c.a.a.a.b.a(c))
        {
            c = null;
        }
        i i1 = c;
        c = null;
        return i1;
    }

    public final A g()
        throws IOException
    {
        h.a();
        Object obj = h.b();
        obj.a = m;
        obj.e = c.i;
        A a1 = ((com.c.a.A.a) (obj)).a(m.b, Long.toString(i)).a(m.c, Long.toString(System.currentTimeMillis())).a();
        obj = a1;
        if (!s)
        {
            obj = a1.b();
            obj.g = h.a(a1);
            obj = ((com.c.a.A.a) (obj)).a();
        }
        com.c.a.a.a.b.a(c, ((A) (obj)).b);
        return ((A) (obj));
    }

}
