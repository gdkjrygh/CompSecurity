// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class gui
{

    private static final grv g = new grv() {

        public final grn a()
        {
            return null;
        }

        public final long b()
        {
            return 0L;
        }

        public final hcj c()
        {
            return new hch();
        }

    };
    final gro a;
    public gqz b;
    public grw c;
    public final grq d;
    public hcv e;
    public hci f;
    private gqk h;
    private guq i;
    private final grt j;
    private gus k;
    private long l;
    private boolean m;
    private boolean n;
    private grq o;
    private grt p;
    private grt q;
    private final boolean r;
    private final boolean s;
    private gtv t;
    private gtw u;

    public gui(gro gro1, grq grq1, boolean flag, boolean flag1, boolean flag2, gqz gqz1, guq guq1, 
            gup gup1, grt grt1)
    {
        l = -1L;
        a = gro1;
        d = grq1;
        n = flag;
        r = flag1;
        s = flag2;
        b = gqz1;
        i = guq1;
        e = gup1;
        j = grt1;
        if (gqz1 != null)
        {
            gsf.b.b(gqz1, this);
            c = gqz1.b;
            return;
        } else
        {
            c = null;
            return;
        }
    }

    static gqz a(gui gui1)
    {
        return gui1.b;
    }

    private static grh a(grh grh1, grh grh2)
    {
        boolean flag = false;
        gri gri1 = new gri();
        int k1 = grh1.a.length / 2;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s1 = grh1.a(i1);
            String s2 = grh1.b(i1);
            if ((!"Warning".equalsIgnoreCase(s1) || !s2.startsWith("1")) && (!gum.a(s1) || grh2.a(s1) == null))
            {
                gri1.a(s1, s2);
            }
        }

        k1 = grh2.a.length / 2;
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            grh1 = grh2.a(j1);
            if (!"Content-Length".equalsIgnoreCase(grh1) && gum.a(grh1))
            {
                gri1.a(grh1, grh2.b(j1));
            }
        }

        return gri1.a();
    }

    static grq a(gui gui1, grq grq1)
    {
        gui1.o = grq1;
        return grq1;
    }

    private void a(guq guq1, IOException ioexception)
    {
        if (gsf.b.b(b) > 0)
        {
            return;
        }
        grw grw1 = b.b;
        if (grw1.b.type() != java.net.Proxy.Type.DIRECT && guq1.a.k != null)
        {
            guq1.a.k.connectFailed(guq1.b.b(), grw1.b.address(), ioexception);
        }
        guq1.c.a(grw1);
    }

    public static boolean a(grt grt1)
    {
        if (!grt1.a.b.equals("HEAD"))
        {
            int i1 = grt1.c;
            if ((i1 < 100 || i1 >= 200) && i1 != 204 && i1 != 304)
            {
                return true;
            }
            if (gum.a(grt1) != -1L || "chunked".equalsIgnoreCase(grt1.a("Transfer-Encoding", null)))
            {
                return true;
            }
        }
        return false;
    }

    private static grt b(grt grt1)
    {
        grt grt2 = grt1;
        if (grt1 != null)
        {
            grt2 = grt1;
            if (grt1.g != null)
            {
                grt1 = grt1.f();
                grt1.g = null;
                grt2 = grt1.a();
            }
        }
        return grt2;
    }

    static gus b(gui gui1)
    {
        return gui1.k;
    }

    private grt c(grt grt1)
    {
        while (!m || !"gzip".equalsIgnoreCase(q.a("Content-Encoding", null)) || grt1.g == null) 
        {
            return grt1;
        }
        hco hco1 = new hco(grt1.g.c());
        grh grh1 = grt1.f.b().b("Content-Encoding").b("Content-Length").a();
        grt1 = grt1.f().a(grh1);
        grt1.g = new gun(grh1, hcq.a(hco1));
        return grt1.a();
    }

    static grt c(gui gui1)
    {
        return gui1.m();
    }

    private gqz l()
    {
        gra gra1;
        gra1 = a.p;
        do
        {
            gqz gqz1 = gra1.a(h);
            if (gqz1 == null)
            {
                break;
            }
            if (o.b.equals("GET") || gsf.b.c(gqz1))
            {
                return gqz1;
            }
            gsp.a(gqz1.c);
        } while (true);
        guq guq1 = i;
_L8:
        if (guq1.c()) goto _L2; else goto _L1
_L1:
        if (guq1.b()) goto _L4; else goto _L3
_L3:
        if (!guq1.d())
        {
            throw new NoSuchElementException();
        }
          goto _L5
        IOException ioexception;
        ioexception;
        throw new RouteException(ioexception);
_L5:
        Object obj = (grw)guq1.j.remove(0);
_L7:
        return new gqz(gra1, ((grw) (obj)));
_L4:
        if (!guq1.b())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(guq1.a.b).append("; exhausted proxy configurations: ").append(guq1.f).toString());
        }
        obj = guq1.f;
        int i1 = guq1.g;
        guq1.g = i1 + 1;
        obj = (Proxy)((List) (obj)).get(i1);
        guq1.a(((Proxy) (obj)));
        guq1.d = ((Proxy) (obj));
_L2:
        if (!guq1.c())
        {
            throw new SocketException((new StringBuilder("No route to ")).append(guq1.a.b).append("; exhausted inet socket addresses: ").append(guq1.h).toString());
        }
        obj = guq1.h;
        int j1 = guq1.i;
        guq1.i = j1 + 1;
        guq1.e = (InetSocketAddress)((List) (obj)).get(j1);
        obj = new grw(guq1.a, guq1.d, guq1.e);
        if (!guq1.c.c(((grw) (obj)))) goto _L7; else goto _L6
_L6:
        guq1.j.add(obj);
          goto _L8
    }

    private grt m()
    {
        k.a();
        Object obj = k.b();
        obj.a = o;
        obj.e = b.i;
        grt grt1 = ((gru) (obj)).a(gum.a, Long.toString(l)).a(gum.b, Long.toString(System.currentTimeMillis())).a();
        obj = grt1;
        if (!s)
        {
            obj = grt1.f();
            obj.g = k.a(grt1);
            obj = ((gru) (obj)).a();
        }
        gsf.b.a(b, ((grt) (obj)).b);
        return ((grt) (obj));
    }

    public final gui a(RouteException routeexception)
    {
        boolean flag1;
        flag1 = false;
        if (i != null && b != null)
        {
            a(i, routeexception.lastException);
        }
        if (i == null && b == null || i != null && !i.a()) goto _L2; else goto _L1
_L1:
        if (a.s) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L6:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return null;
_L4:
        routeexception = routeexception.lastException;
        flag = flag1;
        if (routeexception instanceof ProtocolException)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (routeexception instanceof InterruptedIOException)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (routeexception instanceof SSLHandshakeException)
        {
            flag = flag1;
            if (routeexception.getCause() instanceof CertificateException)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = flag1;
        if (!(routeexception instanceof SSLPeerUnverifiedException))
        {
            flag = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        routeexception = i();
        return new gui(a, d, n, r, s, routeexception, i, (gup)e, j);
    }

    public final gui a(IOException ioexception, hcv hcv1)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        if (i != null && b != null)
        {
            a(i, ioexception);
        }
        boolean flag;
        if (hcv1 == null || (hcv1 instanceof gup))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == null && b == null || i != null && !i.a()) goto _L2; else goto _L1
_L1:
        if (a.s) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L6:
        if (flag1 && flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return null;
_L4:
        flag1 = flag2;
        if (!(ioexception instanceof ProtocolException))
        {
            flag1 = flag2;
            if (!(ioexception instanceof InterruptedIOException))
            {
                flag1 = true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        ioexception = i();
        return new gui(a, d, n, r, s, ioexception, i, (gup)hcv1, j);
    }

    public final void a()
    {
        if (u == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        grq grq2;
        gtx gtx1;
        if (k != null)
        {
            throw new IllegalStateException();
        }
        obj = d;
        Object obj1 = ((grq) (obj)).c();
        if (((grq) (obj)).a("Host") == null)
        {
            ((grr) (obj1)).a("Host", gsp.a(((grq) (obj)).a));
        }
        if ((b == null || b.g != Protocol.a) && ((grq) (obj)).a("Connection") == null)
        {
            ((grr) (obj1)).a("Connection", "Keep-Alive");
        }
        if (((grq) (obj)).a("Accept-Encoding") == null)
        {
            m = true;
            ((grr) (obj1)).a("Accept-Encoding", "gzip");
        }
        Object obj2 = a.i;
        if (obj2 != null)
        {
            java.util.Map map = gum.a(((grr) (obj1)).b().c, null);
            gum.a(((grr) (obj1)), ((CookieHandler) (obj2)).get(((grq) (obj)).b(), map));
        }
        if (((grq) (obj)).a("User-Agent") == null)
        {
            ((grr) (obj1)).a("User-Agent", "okhttp/2.5.0");
        }
        grq2 = ((grr) (obj1)).b();
        gsg gsg1 = gsf.b.a(a);
        if (gsg1 != null)
        {
            obj1 = gsg1.a(grq2);
        } else
        {
            obj1 = null;
        }
        gtx1 = new gtx(System.currentTimeMillis(), grq2, ((grt) (obj1)));
        if (gtx1.c != null) goto _L4; else goto _L3
_L3:
        obj = new gtw(gtx1.b, null, (byte)0);
_L14:
        obj2 = obj;
        if (((gtw) (obj)).a != null)
        {
            obj2 = obj;
            if (gtx1.b.d().j)
            {
                obj2 = new gtw(null, null, (byte)0);
            }
        }
        u = ((gtw) (obj2));
        o = u.a;
        p = u.b;
        if (gsg1 != null)
        {
            gsg1.a(u);
        }
        if (obj1 != null && p == null)
        {
            gsp.a(((grt) (obj1)).g);
        }
        if (o == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_1355;
        }
        if (b != null)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_1174;
_L4:
        if (!gtx1.b.e() || gtx1.c.e != null) goto _L6; else goto _L5
_L5:
        obj = new gtw(gtx1.b, null, (byte)0);
          goto _L7
_L6:
        if (gtw.a(gtx1.c, gtx1.b)) goto _L9; else goto _L8
_L8:
        obj = new gtw(gtx1.b, null, (byte)0);
          goto _L7
_L9:
        gqq gqq1 = gtx1.b.d();
        if (!gqq1.b && !gtx.a(gtx1.b)) goto _L11; else goto _L10
_L10:
        obj = new gtw(gtx1.b, null, (byte)0);
          goto _L7
_L11:
        long l1;
        long l3;
        long l5;
        long l6;
        long l7;
        if (gtx1.d != null)
        {
            l1 = Math.max(0L, gtx1.j - gtx1.d.getTime());
        } else
        {
            l1 = 0L;
        }
        l3 = l1;
        if (gtx1.l != -1)
        {
            l3 = Math.max(l1, TimeUnit.SECONDS.toMillis(gtx1.l));
        }
        l7 = l3 + (gtx1.j - gtx1.i) + (gtx1.a - gtx1.j);
        obj = gtx1.c.j();
        if (((gqq) (obj)).d == -1) goto _L13; else goto _L12
_L12:
        l1 = TimeUnit.SECONDS.toMillis(((gqq) (obj)).d);
_L15:
        l3 = l1;
        if (gqq1.d != -1)
        {
            l3 = Math.min(l1, TimeUnit.SECONDS.toMillis(gqq1.d));
        }
        l1 = 0L;
        if (gqq1.i != -1)
        {
            l1 = TimeUnit.SECONDS.toMillis(gqq1.i);
        }
        l6 = 0L;
        obj = gtx1.c.j();
        l5 = l6;
        if (!((gqq) (obj)).g)
        {
            l5 = l6;
            if (gqq1.h != -1)
            {
                l5 = TimeUnit.SECONDS.toMillis(gqq1.h);
            }
        }
        if (!((gqq) (obj)).b && l7 + l1 < l5 + l3)
        {
            obj = gtx1.c.f();
            if (l1 + l7 >= l3)
            {
                ((gru) (obj)).b("Warning", "110 HttpURLConnection \"Response is stale\"");
            }
            if (l7 > 0x5265c00L)
            {
                StringBuilder stringbuilder;
                boolean flag;
                long l4;
                if (gtx1.c.j().d == -1 && gtx1.h == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    ((gru) (obj)).b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
            }
            obj = new gtw(null, ((gru) (obj)).a(), (byte)0);
        } else
        {
            obj = gtx1.b.c();
            if (gtx1.k != null)
            {
                ((grr) (obj)).a("If-None-Match", gtx1.k);
            } else
            if (gtx1.f != null)
            {
                ((grr) (obj)).a("If-Modified-Since", gtx1.g);
            } else
            if (gtx1.d != null)
            {
                ((grr) (obj)).a("If-Modified-Since", gtx1.e);
            }
            obj = ((grr) (obj)).b();
            if (gtx.a(((grq) (obj))))
            {
                obj = new gtw(((grq) (obj)), gtx1.c, (byte)0);
            } else
            {
                obj = new gtw(((grq) (obj)), null, (byte)0);
            }
        }
_L7:
        if (true) goto _L14; else goto _L13
_L13:
        if (gtx1.h != null)
        {
            if (gtx1.d != null)
            {
                l1 = gtx1.d.getTime();
            } else
            {
                l1 = gtx1.j;
            }
            l4 = gtx1.h.getTime() - l1;
            l1 = l4;
            if (l4 <= 0L)
            {
                l1 = 0L;
            }
        } else
        {
label0:
            {
                if (gtx1.f == null)
                {
                    break label0;
                }
                obj = gtx1.c.a.a;
                if (((grj) (obj)).e == null)
                {
                    obj = null;
                } else
                {
                    stringbuilder = new StringBuilder();
                    grj.b(stringbuilder, ((grj) (obj)).e);
                    obj = stringbuilder.toString();
                }
                if (obj != null)
                {
                    break label0;
                }
                if (gtx1.d != null)
                {
                    l1 = gtx1.d.getTime();
                } else
                {
                    l1 = gtx1.i;
                }
                l1 -= gtx1.f.getTime();
                if (l1 > 0L)
                {
                    l1 /= 10L;
                } else
                {
                    l1 = 0L;
                }
            }
        }
          goto _L15
        l1 = 0L;
          goto _L15
        if (i == null)
        {
            gro gro2 = a;
            grq grq3 = o;
            javax.net.ssl.SSLSocketFactory sslsocketfactory = null;
            javax.net.ssl.HostnameVerifier hostnameverifier = null;
            gqw gqw = null;
            if (grq3.e())
            {
                sslsocketfactory = gro2.l;
                hostnameverifier = gro2.m;
                gqw = gro2.n;
            }
            h = new gqk(grq3.a.c, grq3.a.d, gro2.k, sslsocketfactory, hostnameverifier, gqw, gro2.o, gro2.c, gro2.d, gro2.e, gro2.h);
            try
            {
                gqk gqk1 = h;
                grq grq1 = o;
                gro gro1 = a;
                i = new guq(gqk1, grq1.a, gro1);
            }
            catch (IOException ioexception)
            {
                throw new RequestException(ioexception);
            }
        }
        b = l();
        gsf.b.a(a, b, this, o);
        c = b.b;
        k = gsf.b.a(b, this);
        if (r && c() && e == null)
        {
            long l2 = gum.a(grq2);
            if (n)
            {
                if (l2 > 0x7fffffffL)
                {
                    throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                }
                if (l2 != -1L)
                {
                    k.a(o);
                    e = new gup((int)l2);
                    return;
                } else
                {
                    e = new gup();
                    return;
                }
            } else
            {
                k.a(o);
                e = k.a(o, l2);
                return;
            }
        }
        if (true) goto _L1; else goto _L16
_L16:
        if (b != null)
        {
            gsf.b.a(a.p, b);
            b = null;
        }
        if (p != null)
        {
            gru gru1 = p.f();
            gru1.a = d;
            q = gru1.c(b(j)).b(b(p)).a();
        } else
        {
            gru gru2 = new gru();
            gru2.a = d;
            gru2 = gru2.c(b(j));
            gru2.b = Protocol.b;
            gru2.c = 504;
            gru2.d = "Unsatisfiable Request (only-if-cached)";
            gru2.g = g;
            q = gru2.a();
        }
        q = c(q);
        return;
    }

    public final void a(grh grh1)
    {
        CookieHandler cookiehandler = a.i;
        if (cookiehandler != null)
        {
            cookiehandler.put(d.b(), gum.a(grh1, null));
        }
    }

    public final boolean a(grj grj1)
    {
        grj grj2 = d.a;
        return grj2.c.equals(grj1.c) && grj2.d == grj1.d && grj2.a.equals(grj1.a);
    }

    public final void b()
    {
        if (l != -1L)
        {
            throw new IllegalStateException();
        } else
        {
            l = System.currentTimeMillis();
            return;
        }
    }

    final boolean c()
    {
        return guk.c(d.b);
    }

    public final hcv d()
    {
        if (u == null)
        {
            throw new IllegalStateException();
        } else
        {
            return e;
        }
    }

    public final boolean e()
    {
        return q != null;
    }

    public final grt f()
    {
        if (q == null)
        {
            throw new IllegalStateException();
        } else
        {
            return q;
        }
    }

    public final void g()
    {
        if (k != null && b != null)
        {
            k.c();
        }
        b = null;
    }

    public final void h()
    {
        if (k != null)
        {
            k.a(this);
            return;
        }
        gqz gqz1 = b;
        if (gqz1 != null)
        {
            try
            {
                gsf.b.a(gqz1, this);
                return;
            }
            catch (IOException ioexception) { }
        }
        return;
    }

    public final gqz i()
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        gsp.a(f);
_L4:
        if (q == null)
        {
            if (b != null)
            {
                gsp.a(b.c);
            }
            b = null;
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (e != null)
        {
            gsp.a(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
        gsp.a(q.g);
        if (k != null && b != null && !k.d())
        {
            gsp.a(b.c);
            b = null;
            return null;
        }
        if (b != null && !gsf.b.a(b))
        {
            b = null;
        }
        gqz gqz1 = b;
        b = null;
        return gqz1;
    }

    public final void j()
    {
        boolean flag = true;
        if (q == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (o == null && p == null)
        {
            throw new IllegalStateException("call sendRequest() first!");
        }
        if (o == null) goto _L1; else goto _L3
_L3:
        if (!s) goto _L5; else goto _L4
_L4:
        k.a(o);
_L9:
        Object obj = m();
_L8:
        Object obj2;
        a(((grt) (obj)).f);
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        obj2 = p;
        if (((grt) (obj)).c != 304) goto _L7; else goto _L6
_L6:
        if (flag)
        {
            obj2 = p.f();
            obj2.a = d;
            q = ((gru) (obj2)).c(b(j)).a(a(p.f, ((grt) (obj)).f)).b(b(p)).a(b(((grt) (obj)))).a();
            ((grt) (obj)).g.close();
            g();
            obj = gsf.b.a(a);
            ((gsg) (obj)).a();
            ((gsg) (obj)).a(p, b(q));
            q = c(q);
            return;
        }
        break MISSING_BLOCK_LABEL_493;
_L5:
label0:
        {
            if (r)
            {
                break label0;
            }
            obj = (new guj(this, 0, o)).a(o);
        }
          goto _L8
        if (f != null && f.b().b > 0L)
        {
            f.d();
        }
        if (l == -1L)
        {
            if (gum.a(o) == -1L && (e instanceof gup))
            {
                long l1 = ((gup)e).a.b;
                o = o.c().a("Content-Length", Long.toString(l1)).b();
            }
            k.a(o);
        }
        if (e != null)
        {
            if (f != null)
            {
                f.close();
            } else
            {
                e.close();
            }
            if (e instanceof gup)
            {
                k.a((gup)e);
            }
        }
          goto _L9
_L7:
        obj2 = ((grt) (obj2)).f.b("Last-Modified");
        if (obj2 == null) goto _L11; else goto _L10
_L10:
        Date date = ((grt) (obj)).f.b("Last-Modified");
        if (date != null && date.getTime() < ((Date) (obj2)).getTime()) goto _L6; else goto _L11
_L11:
        flag = false;
          goto _L6
        gsp.a(p.g);
        gru gru1 = ((grt) (obj)).f();
        gru1.a = d;
        q = gru1.c(b(j)).b(b(p)).a(b(((grt) (obj)))).a();
        if (!a(q)) goto _L1; else goto _L12
_L12:
        Object obj1 = gsf.b.a(a);
        grt grt1;
        Object obj3;
        hcv hcv1;
        if (obj1 != null)
        {
            if (!gtw.a(q, o))
            {
                if (guk.a(o.b))
                {
                    try
                    {
                        ((gsg) (obj1)).b(o);
                    }
                    catch (IOException ioexception) { }
                }
            } else
            {
                t = ((gsg) (obj1)).a(b(q));
            }
        }
        obj3 = t;
        grt1 = q;
        if (obj3 != null) goto _L14; else goto _L13
_L13:
        obj1 = grt1;
_L16:
        q = c(((grt) (obj1)));
        return;
_L14:
        hcv1 = ((gtv) (obj3)).b();
        obj1 = grt1;
        if (hcv1 != null)
        {
            obj1 = new hcw(grt1.g.c(), ((gtv) (obj3)), hcq.a(hcv1)) {

                private boolean a;
                private hcj b;
                private gtv c;
                private hci d;

                public final hcx T_()
                {
                    return b.T_();
                }

                public final long a(hch hch1, long l2)
                {
                    try
                    {
                        l2 = b.a(hch1, l2);
                    }
                    // Misplaced declaration of an exception variable
                    catch (hch hch1)
                    {
                        if (!a)
                        {
                            a = true;
                            c.a();
                        }
                        throw hch1;
                    }
                    if (l2 == -1L)
                    {
                        if (!a)
                        {
                            a = true;
                            d.close();
                        }
                        return -1L;
                    } else
                    {
                        hch1.a(d.b(), hch1.b - l2, l2);
                        d.t();
                        return l2;
                    }
                }

                public final void close()
                {
                    if (!a && !gsp.a(this, TimeUnit.MILLISECONDS))
                    {
                        a = true;
                        c.a();
                    }
                    b.close();
                }

            
            {
                b = hcj1;
                c = gtv1;
                d = hci1;
                super();
            }
            };
            obj3 = grt1.f();
            obj3.g = new gun(grt1.f, hcq.a(((hcw) (obj1))));
            obj1 = ((gru) (obj3)).a();
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final grq k()
    {
        if (q == null)
        {
            throw new IllegalStateException();
        }
        Object obj;
        if (c != null)
        {
            obj = c.b;
        } else
        {
            obj = a.c;
        }
        switch (q.c)
        {
        default:
            return null;

        case 407: 
            if (((Proxy) (obj)).type() != java.net.Proxy.Type.HTTP)
            {
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            // fall through

        case 401: 
            return gum.a(a.o, q, ((Proxy) (obj)));

        case 307: 
        case 308: 
            if (!d.b.equals("GET") && !d.b.equals("HEAD"))
            {
                return null;
            }
            break;

        case 300: 
        case 301: 
        case 302: 
        case 303: 
            break;
        }
        if (!a.r)
        {
            return null;
        }
        obj = q.b("Location");
        if (obj == null)
        {
            return null;
        }
        obj = d.a.c(((String) (obj)));
        if (obj == null)
        {
            return null;
        }
        if (!((grj) (obj)).a.equals(d.a.a) && !a.q)
        {
            return null;
        }
        grr grr1 = d.c();
        if (guk.c(d.b))
        {
            grr1.a("GET", null);
            grr1.b("Transfer-Encoding");
            grr1.b("Content-Length");
            grr1.b("Content-Type");
        }
        if (!a(((grj) (obj))))
        {
            grr1.b("Authorization");
        }
        return grr1.a(((grj) (obj))).b();
    }

}
