// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.a;
import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.j;
import com.squareup.okhttp.o;
import com.squareup.okhttp.p;
import com.squareup.okhttp.r;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import okio.c;
import okio.e;
import okio.l;
import okio.q;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            k, RouteException, o, l, 
//            i, q, b, c, 
//            n

public final class h
{
    public final class a
        implements com.squareup.okhttp.q.a
    {

        final h a;
        private final int b;
        private final t c;
        private int d;

        public final v a(t t1)
            throws IOException
        {
            d = d + 1;
            if (b > 0)
            {
                com.squareup.okhttp.q q1 = (com.squareup.okhttp.q)a.b.i.get(b - 1);
                com.squareup.okhttp.a a2 = com.squareup.okhttp.internal.http.h.a(a).b.a;
                if (!t1.a.c.equals(a2.b) || t1.a.d != a2.c)
                {
                    throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must retain the same host and port").toString());
                }
                if (d > 1)
                {
                    throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must call proceed() exactly once").toString());
                }
            }
            if (b >= a.b.i.size()) goto _L2; else goto _L1
_L1:
            a a1 = a. new a(b + 1, t1);
            com.squareup.okhttp.q q2 = (com.squareup.okhttp.q)a.b.i.get(b);
            t1 = q2.a();
            if (a1.d != 1)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q2).append(" must call proceed() exactly once").toString());
            }
_L4:
            return t1;
_L2:
            v v1;
            int i1;
            h.b(a).a(t1);
            com.squareup.okhttp.internal.http.h.a(a, t1);
            if (a.c() && t1.d != null)
            {
                okio.d d1 = okio.l.a(h.b(a).a(t1, t1.d.b()));
                t1.d.a(d1);
                d1.close();
            }
            v1 = com.squareup.okhttp.internal.http.h.c(a);
            i1 = v1.c;
            if (i1 == 204)
            {
                break; /* Loop/switch isn't completed */
            }
            t1 = v1;
            if (i1 != 205) goto _L4; else goto _L3
_L3:
            t1 = v1;
            if (v1.g.b() > 0L)
            {
                throw new ProtocolException((new StringBuilder("HTTP ")).append(i1).append(" had non-zero Content-Length: ").append(v1.g.b()).toString());
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public a(int i1, t t1)
        {
            a = h.this;
            super();
            b = i1;
            c = t1;
        }
    }


    public static final w a = new w() {

        public final r a()
        {
            return null;
        }

        public final long b()
        {
            return 0L;
        }

        public final e c()
        {
            return new c();
        }

    };
    public final s b;
    public i c;
    public com.squareup.okhttp.a d;
    public com.squareup.okhttp.internal.http.o e;
    public x f;
    public final v g;
    public com.squareup.okhttp.internal.http.q h;
    public long i;
    public boolean j;
    public final boolean k;
    public final t l;
    public t m;
    public v n;
    public v o;
    public q p;
    public okio.d q;
    public final boolean r;
    public final boolean s;
    public b t;
    public com.squareup.okhttp.internal.http.c u;

    public h(s s1, t t1, boolean flag, boolean flag1, boolean flag2, i i1, com.squareup.okhttp.internal.http.o o1, 
            n n1, v v1)
    {
        i = -1L;
        b = s1;
        l = t1;
        k = flag;
        r = flag1;
        s = flag2;
        c = i1;
        e = o1;
        p = n1;
        g = v1;
        if (i1 != null)
        {
            d.b.b(i1, this);
            f = i1.b;
            return;
        } else
        {
            f = null;
            return;
        }
    }

    static i a(h h1)
    {
        return h1.c;
    }

    public static o a(o o1, o o2)
        throws IOException
    {
        boolean flag = false;
        com.squareup.okhttp.o.a a1 = new com.squareup.okhttp.o.a();
        int k1 = o1.a.length / 2;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s1 = o1.a(i1);
            String s2 = o1.b(i1);
            if ((!"Warning".equalsIgnoreCase(s1) || !s2.startsWith("1")) && (!com.squareup.okhttp.internal.http.k.a(s1) || o2.a(s1) == null))
            {
                a1.a(s1, s2);
            }
        }

        k1 = o2.a.length / 2;
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            o1 = o2.a(j1);
            if (!"Content-Length".equalsIgnoreCase(o1) && com.squareup.okhttp.internal.http.k.a(o1))
            {
                a1.a(o1, o2.b(j1));
            }
        }

        return a1.a();
    }

    static t a(h h1, t t1)
    {
        h1.m = t1;
        return t1;
    }

    public static v a(v v1)
    {
        v v2 = v1;
        if (v1 != null)
        {
            v2 = v1;
            if (v1.g != null)
            {
                v1 = v1.e();
                v1.g = null;
                v2 = v1.a();
            }
        }
        return v2;
    }

    public static boolean a(v v1, v v2)
    {
        if (v2.c != 304) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        v1 = v1.f.b("Last-Modified");
        if (v1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        v2 = v2.f.b("Last-Modified");
        if (v2 != null && v2.getTime() < v1.getTime()) goto _L1; else goto _L3
_L3:
        return false;
    }

    static com.squareup.okhttp.internal.http.q b(h h1)
    {
        return h1.h;
    }

    static v c(h h1)
        throws IOException
    {
        return h1.g();
    }

    public static boolean c(v v1)
    {
        if (!v1.a.b.equals("HEAD"))
        {
            int i1 = v1.c;
            if ((i1 < 100 || i1 >= 200) && i1 != 204 && i1 != 304)
            {
                return true;
            }
            if (com.squareup.okhttp.internal.http.k.a(v1) != -1L || "chunked".equalsIgnoreCase(v1.a("Transfer-Encoding")))
            {
                return true;
            }
        }
        return false;
    }

    public final i a()
        throws RouteException
    {
        j j1;
        j1 = b.r;
        do
        {
            i i1 = j1.a(d);
            if (i1 == null)
            {
                break;
            }
            if (m.b.equals("GET") || d.b.c(i1))
            {
                return i1;
            }
            com.squareup.okhttp.internal.k.a(i1.c);
        } while (true);
        com.squareup.okhttp.internal.http.o o1 = e;
_L8:
        if (o1.c()) goto _L2; else goto _L1
_L1:
        if (o1.b()) goto _L4; else goto _L3
_L3:
        if (!o1.d())
        {
            throw new NoSuchElementException();
        }
          goto _L5
        IOException ioexception;
        ioexception;
        throw new RouteException(ioexception);
_L5:
        Object obj = (x)o1.j.remove(0);
_L7:
        return new i(j1, ((x) (obj)));
_L4:
        if (!o1.b())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(o1.a.b).append("; exhausted proxy configurations: ").append(o1.f).toString());
        }
        obj = o1.f;
        int k1 = o1.g;
        o1.g = k1 + 1;
        obj = (Proxy)((List) (obj)).get(k1);
        o1.a(((Proxy) (obj)));
        o1.d = ((Proxy) (obj));
_L2:
        if (!o1.c())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(o1.a.b).append("; exhausted inet socket addresses: ").append(o1.h).toString());
        }
        obj = o1.h;
        int l1 = o1.i;
        o1.i = l1 + 1;
        o1.e = (InetSocketAddress)((List) (obj)).get(l1);
        obj = new x(o1.a, o1.d, o1.e);
        if (!o1.c.c(((x) (obj)))) goto _L7; else goto _L6
_L6:
        o1.j.add(obj);
          goto _L8
    }

    public final void a(com.squareup.okhttp.internal.http.o o1, IOException ioexception)
    {
        if (d.b.b(c) > 0)
        {
            return;
        }
        x x1 = c.b;
        if (x1.b.type() != java.net.Proxy.Type.DIRECT && o1.a.k != null)
        {
            o1.a.k.connectFailed(o1.b.b(), x1.b.address(), ioexception);
        }
        o1.c.a(x1);
    }

    public final void a(o o1)
        throws IOException
    {
        CookieHandler cookiehandler = b.k;
        if (cookiehandler != null)
        {
            cookiehandler.put(l.a(), com.squareup.okhttp.internal.http.k.b(o1));
        }
    }

    public final boolean a(p p1)
    {
        p p2 = l.a;
        return p2.c.equals(p1.c) && p2.d == p1.d && p2.a.equals(p1.a);
    }

    public final v b(v v1)
        throws IOException
    {
        while (!j || !"gzip".equalsIgnoreCase(o.a("Content-Encoding")) || v1.g == null) 
        {
            return v1;
        }
        okio.j j1 = new okio.j(v1.g.c());
        o o1 = v1.f.a().b("Content-Encoding").b("Content-Length").a();
        v1 = v1.e().a(o1);
        v1.g = new com.squareup.okhttp.internal.http.l(o1, okio.l.a(j1));
        return v1.a();
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

    public final boolean c()
    {
        return com.squareup.okhttp.internal.http.i.c(l.b);
    }

    public final v d()
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
        com.squareup.okhttp.internal.k.a(q);
_L4:
        if (o == null)
        {
            if (c != null)
            {
                com.squareup.okhttp.internal.k.a(c.c);
            }
            c = null;
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (p != null)
        {
            com.squareup.okhttp.internal.k.a(p);
        }
        if (true) goto _L4; else goto _L3
_L3:
        com.squareup.okhttp.internal.k.a(o.g);
        if (h != null && c != null && !h.d())
        {
            com.squareup.okhttp.internal.k.a(c.c);
            c = null;
            return null;
        }
        if (c != null && !d.b.a(c))
        {
            c = null;
        }
        i i1 = c;
        c = null;
        return i1;
    }

    public final v g()
        throws IOException
    {
        h.a();
        Object obj = h.b();
        obj.a = m;
        obj.e = c.i;
        v v1 = ((com.squareup.okhttp.v.a) (obj)).a(k.b, Long.toString(i)).a(com.squareup.okhttp.internal.http.k.c, Long.toString(System.currentTimeMillis())).a();
        obj = v1;
        if (!s)
        {
            obj = v1.e();
            obj.g = h.a(v1);
            obj = ((com.squareup.okhttp.v.a) (obj)).a();
        }
        d.b.a(c, ((v) (obj)).b);
        return ((v) (obj));
    }


    // Unreferenced inner class com/squareup/okhttp/internal/http/h$2

/* anonymous class */
    public final class _cls2
        implements okio.r
    {

        boolean a;
        final e b;
        final b c;
        final okio.d d;
        final h e;

        public final long a(c c1, long l1)
            throws IOException
        {
            try
            {
                l1 = b.a(c1, l1);
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                if (!a)
                {
                    a = true;
                    c.a();
                }
                throw c1;
            }
            if (l1 == -1L)
            {
                if (!a)
                {
                    a = true;
                    d.close();
                }
                return -1L;
            } else
            {
                c1.a(d.b(), c1.b - l1, l1);
                d.s();
                return l1;
            }
        }

        public final void close()
            throws IOException
        {
            if (!a && !com.squareup.okhttp.internal.k.a(this, TimeUnit.MILLISECONDS))
            {
                a = true;
                c.a();
            }
            b.close();
        }

        public final okio.s q_()
        {
            return b.q_();
        }

            public 
            {
                e = h.this;
                b = e1;
                c = b1;
                d = d1;
                super();
            }
    }

}
