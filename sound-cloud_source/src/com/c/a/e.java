// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.g;
import c.o;
import c.x;
import com.c.a.a.a.a;
import com.c.a.a.a.c;
import com.c.a.a.a.h;
import com.c.a.a.a.j;
import com.c.a.a.a.k;
import com.c.a.a.a.m;
import com.c.a.a.a.q;
import com.c.a.a.a.r;
import com.c.a.a.a.u;
import com.c.a.a.c.b;
import com.c.a.a.d;
import com.c.a.a.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

// Referenced classes of package com.c.a:
//            t, f, j, n, 
//            w, x, r, i, 
//            v, d, A, B, 
//            C, q

public final class e
{
    final class a
        implements q.a
    {

        final e a;
        private final int b;
        private final w c;
        private final boolean d;

        public final A a(w w1)
            throws IOException
        {
            if (b < a.a.h.size())
            {
                a. new a(b + 1, w1, d);
                return ((com.c.a.q)a.a.h.get(b)).a();
            } else
            {
                return a.a(w1, d);
            }
        }

        a(int l, w w1, boolean flag)
        {
            a = e.this;
            super();
            b = l;
            c = w1;
            d = flag;
        }
    }


    final t a;
    volatile boolean b;
    w c;
    h d;
    private boolean e;

    protected e(t t1, w w1)
    {
        t t2 = new t(t1);
        if (t2.j == null)
        {
            t2.j = ProxySelector.getDefault();
        }
        if (t2.k == null)
        {
            t2.k = CookieHandler.getDefault();
        }
        if (t2.m == null)
        {
            t2.m = SocketFactory.getDefault();
        }
        if (t2.n == null)
        {
            t2.n = t1.a();
        }
        if (t2.o == null)
        {
            t2.o = b.a;
        }
        if (t2.p == null)
        {
            t2.p = com.c.a.f.a;
        }
        if (t2.q == null)
        {
            t2.q = com.c.a.a.a.a.a;
        }
        if (t2.r == null)
        {
            t2.r = com.c.a.j.a();
        }
        if (t2.f == null)
        {
            t2.f = com.c.a.t.a;
        }
        if (t2.g == null)
        {
            t2.g = com.c.a.t.b;
        }
        if (t2.s == null)
        {
            t2.s = d.a;
        }
        a = t2;
        c = w1;
    }

    public final A a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        e = true;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        a.d.a(this);
        obj = (new a(0, c, false)).a(c);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        throw new IOException("Canceled");
        obj;
        a.d.b(this);
        throw obj;
        a.d.b(this);
        return ((A) (obj));
    }

    final A a(w w1, boolean flag)
        throws IOException
    {
        int l;
        com.c.a.x x1 = w1.d;
        if (x1 != null)
        {
            w1 = w1.c();
            com.c.a.r r1 = x1.contentType();
            if (r1 != null)
            {
                w1.a("Content-Type", r1.toString());
            }
            long l1 = x1.contentLength();
            if (l1 != -1L)
            {
                w1.a("Content-Length", Long.toString(l1));
                w1.b("Transfer-Encoding");
            } else
            {
                w1.a("Transfer-Encoding", "chunked");
                w1.b("Content-Length");
            }
            w1 = w1.a();
        }
        d = new h(a, w1, false, false, flag, null, null, null);
        l = 0;
_L11:
        if (!b) goto _L2; else goto _L1
_L1:
        d.e();
        w1 = null;
_L84:
        return w1;
_L2:
        Object obj3 = d;
        if (((h) (obj3)).u != null) goto _L4; else goto _L3
_L3:
        if (((h) (obj3)).h != null)
        {
            throw new IllegalStateException();
        }
          goto _L5
        Object obj;
        obj;
        w1 = d;
        if (((h) (w1)).e != null && ((h) (w1)).c != null)
        {
            r r2 = ((h) (w1)).e;
            if (com.c.a.a.a.b.b(((h) (w1)).c) <= 0)
            {
                r2.a(((h) (w1)).c.b, ((IOException) (obj)));
            }
        }
        if (((h) (w1)).e == null && ((h) (w1)).c == null) goto _L7; else goto _L6
_L6:
        if (((h) (w1)).e == null) goto _L9; else goto _L8
_L8:
        boolean flag1;
        long l2;
        long l3;
        Object obj1 = ((h) (w1)).e;
        Object obj4;
        com.c.a.a.a.c.a a1;
        long l4;
        long l5;
        long l6;
        if (((r) (obj1)).d() || ((r) (obj1)).b() || ((r) (obj1)).a() || ((r) (obj1)).e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L7; else goto _L9
_L9:
        if (!((h) (w1)).b.v)
        {
            flag1 = false;
        } else
        if ((obj instanceof SSLPeerUnverifiedException) || (obj instanceof SSLHandshakeException) && (((IOException) (obj)).getCause() instanceof CertificateException))
        {
            flag1 = false;
        } else
        if (obj instanceof ProtocolException)
        {
            flag1 = false;
        } else
        if (obj instanceof InterruptedIOException)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag1) goto _L10; else goto _L7
_L7:
        w1 = null;
_L76:
        if (w1 != null)
        {
            d = w1;
        } else
        {
            throw obj;
        }
          goto _L11
_L5:
        w1 = ((h) (obj3)).l;
        obj = w1.c();
        if (w1.a("Host") == null)
        {
            ((w.a) (obj)).a("Host", h.a(w1.a()));
        }
        if ((((h) (obj3)).c == null || ((h) (obj3)).c.g != com.c.a.v.a) && w1.a("Connection") == null)
        {
            ((w.a) (obj)).a("Connection", "Keep-Alive");
        }
        if (w1.a("Accept-Encoding") == null)
        {
            obj3.j = true;
            ((w.a) (obj)).a("Accept-Encoding", "gzip");
        }
        obj1 = ((h) (obj3)).b.k;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        obj4 = m.b(((w.a) (obj)).a().c);
        m.a(((w.a) (obj)), ((CookieHandler) (obj1)).get(w1.b(), ((java.util.Map) (obj4))));
        if (w1.a("User-Agent") == null)
        {
            ((w.a) (obj)).a("User-Agent", "okhttp/2.3.0");
        }
        obj4 = ((w.a) (obj)).a();
        w1 = com.c.a.a.a.b.a(((h) (obj3)).b);
        if (w1 == null) goto _L13; else goto _L12
_L12:
        obj = w1.a();
_L88:
        a1 = new com.c.a.a.a.c.a(System.currentTimeMillis(), ((w) (obj4)), ((A) (obj)));
        if (a1.c != null) goto _L15; else goto _L14
_L14:
        w1 = new c(a1.b, null, (byte)0);
_L23:
        obj1 = w1;
        if (((c) (w1)).a == null)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        obj1 = w1;
        if (a1.b.d().k)
        {
            obj1 = new c(null, null, (byte)0);
        }
        obj3.u = ((c) (obj1));
        obj3.m = ((h) (obj3)).u.a;
        obj3.n = ((h) (obj3)).u.b;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_646;
        }
        if (((h) (obj3)).n == null)
        {
            i.a(((A) (obj)).g);
        }
        if (((h) (obj3)).m == null) goto _L17; else goto _L16
_L16:
        if (((h) (obj3)).c != null) goto _L19; else goto _L18
_L18:
        if (((h) (obj3)).c != null)
        {
            throw new IllegalStateException();
        }
          goto _L20
_L15:
        if (!a1.b.e() || a1.c.e != null) goto _L22; else goto _L21
_L21:
        w1 = new c(a1.b, null, (byte)0);
          goto _L23
_L22:
label0:
        {
            if (com.c.a.a.a.c.a(a1.c, a1.b))
            {
                break label0;
            }
            w1 = new c(a1.b, null, (byte)0);
        }
          goto _L23
label1:
        {
            w1 = a1.b.d();
            if (!((com.c.a.d) (w1)).c && !com.c.a.a.a.c.a.a(a1.b))
            {
                break label1;
            }
            w1 = new c(a1.b, null, (byte)0);
        }
          goto _L23
        if (a1.d == null) goto _L25; else goto _L24
_L24:
        l2 = Math.max(0L, a1.j - a1.d.getTime());
_L89:
        l3 = l2;
        if (a1.l != -1)
        {
            l3 = Math.max(l2, TimeUnit.SECONDS.toMillis(a1.l));
        }
        l6 = l3 + (a1.j - a1.i) + (a1.a - a1.j);
        obj1 = a1.c.d();
        if (((com.c.a.d) (obj1)).e == -1) goto _L27; else goto _L26
_L26:
        l2 = TimeUnit.SECONDS.toMillis(((com.c.a.d) (obj1)).e);
_L32:
        if (((com.c.a.d) (w1)).e != -1)
        {
            l2 = Math.min(l2, TimeUnit.SECONDS.toMillis(((com.c.a.d) (w1)).e));
        }
        if (((com.c.a.d) (w1)).j == -1) goto _L29; else goto _L28
_L28:
        l3 = TimeUnit.SECONDS.toMillis(((com.c.a.d) (w1)).j);
_L87:
        l5 = 0L;
        obj1 = a1.c.d();
        l4 = l5;
        if (((com.c.a.d) (obj1)).h)
        {
            break MISSING_BLOCK_LABEL_1015;
        }
        l4 = l5;
        if (((com.c.a.d) (w1)).i != -1)
        {
            l4 = TimeUnit.SECONDS.toMillis(((com.c.a.d) (w1)).i);
        }
        if (((com.c.a.d) (obj1)).c || l6 + l3 >= l4 + l2) goto _L31; else goto _L30
_L30:
        w1 = a1.c.b();
        if (l3 + l6 < l2)
        {
            break MISSING_BLOCK_LABEL_1068;
        }
        w1.b("Warning", "110 HttpURLConnection \"Response is stale\"");
        if (l6 <= 0x5265c00L)
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        Object obj2;
        if (a1.c.d().e == -1 && a1.h == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        w1.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
        w1 = new c(null, w1.a(), (byte)0);
          goto _L23
_L27:
        if (a1.h == null)
        {
            break MISSING_BLOCK_LABEL_1202;
        }
        if (a1.d == null)
        {
            break MISSING_BLOCK_LABEL_1192;
        }
        l2 = a1.d.getTime();
_L33:
        l3 = a1.h.getTime() - l2;
        l2 = l3;
        if (l3 <= 0L)
        {
            l2 = 0L;
        }
          goto _L32
        l2 = a1.j;
          goto _L33
        if (a1.f == null || a1.c.a.a().getQuery() != null) goto _L35; else goto _L34
_L34:
        if (a1.d == null) goto _L37; else goto _L36
_L36:
        l2 = a1.d.getTime();
_L40:
        l2 -= a1.f.getTime();
        if (l2 <= 0L) goto _L39; else goto _L38
_L38:
        l2 /= 10L;
          goto _L32
_L37:
        l2 = a1.i;
          goto _L40
_L31:
        w1 = a1.b.c();
        if (a1.k == null) goto _L42; else goto _L41
_L41:
        w1.a("If-None-Match", a1.k);
_L45:
        w1 = w1.a();
        if (!com.c.a.a.a.c.a.a(w1))
        {
            break MISSING_BLOCK_LABEL_1394;
        }
        w1 = new c(w1, a1.c, (byte)0);
          goto _L23
_L42:
        if (a1.f == null) goto _L44; else goto _L43
_L43:
        w1.a("If-Modified-Since", a1.g);
          goto _L45
_L44:
        if (a1.d == null) goto _L45; else goto _L46
_L46:
        w1.a("If-Modified-Since", a1.e);
          goto _L45
        w1 = new c(w1, null, (byte)0);
          goto _L23
_L20:
        if (((h) (obj3)).e == null)
        {
            obj3.d = h.a(((h) (obj3)).b, ((h) (obj3)).m);
            w1 = ((h) (obj3)).d;
            obj = ((h) (obj3)).m;
            obj1 = ((h) (obj3)).b;
            obj3.e = new r(w1, ((w) (obj)).b(), ((t) (obj1)), ((w) (obj)));
        }
        w1 = ((h) (obj3)).a();
        com.c.a.a.a.b.a(((h) (obj3)).b, w1, ((h) (obj3)), ((h) (obj3)).m);
        obj3.c = w1;
        obj3.f = ((h) (obj3)).c.b;
_L19:
        obj3.h = com.c.a.a.a.b.a(((h) (obj3)).c, ((h) (obj3)));
        if (!((h) (obj3)).r || !((h) (obj3)).c() || ((h) (obj3)).p != null) goto _L4; else goto _L47
_L47:
        l2 = m.a(((w) (obj4)));
        if (!((h) (obj3)).k) goto _L49; else goto _L48
_L48:
        if (l2 <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_1594;
        }
        throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
        if (l2 == -1L) goto _L51; else goto _L50
_L50:
        ((h) (obj3)).h.a(((h) (obj3)).m);
        obj3.p = new q((int)l2);
_L4:
        obj2 = d;
        if (((h) (obj2)).o != null) goto _L53; else goto _L52
_L52:
        if (((h) (obj2)).m == null && ((h) (obj2)).n == null)
        {
            throw new IllegalStateException("call sendRequest() first!");
        }
          goto _L54
_L51:
        obj3.p = new q();
          goto _L4
_L49:
        ((h) (obj3)).h.a(((h) (obj3)).m);
        obj3.p = ((h) (obj3)).h.a(((h) (obj3)).m, l2);
          goto _L4
_L17:
        if (((h) (obj3)).c != null)
        {
            com.c.a.a.a.b.a(((h) (obj3)).b.r, ((h) (obj3)).c);
            obj3.c = null;
        }
        if (((h) (obj3)).n == null)
        {
            break MISSING_BLOCK_LABEL_1837;
        }
        w1 = ((h) (obj3)).n.b();
        w1.a = ((h) (obj3)).l;
        obj3.o = w1.c(h.a(((h) (obj3)).g)).b(h.a(((h) (obj3)).n)).a();
_L55:
        obj3.o = ((h) (obj3)).b(((h) (obj3)).o);
          goto _L4
        w1 = new A.a();
        w1.a = ((h) (obj3)).l;
        w1 = w1.c(h.a(((h) (obj3)).g));
        w1.b = com.c.a.v.b;
        w1.c = 504;
        w1.d = "Unsatisfiable Request (only-if-cached)";
        w1.g = h.a;
        obj3.o = w1.a();
          goto _L55
_L54:
        if (((h) (obj2)).m == null) goto _L53; else goto _L56
_L56:
        if (!((h) (obj2)).s) goto _L58; else goto _L57
_L57:
        ((h) (obj2)).h.a(((h) (obj2)).m);
_L65:
        w1 = ((h) (obj2)).g();
_L63:
        ((h) (obj2)).a(((A) (w1)).f);
        if (((h) (obj2)).n == null) goto _L60; else goto _L59
_L59:
        if (!h.a(((h) (obj2)).n, w1)) goto _L62; else goto _L61
_L61:
        obj = ((h) (obj2)).n.b();
        obj.a = ((h) (obj2)).l;
        obj2.o = ((A.a) (obj)).c(h.a(((h) (obj2)).g)).a(h.a(((h) (obj2)).n.f, ((A) (w1)).f)).b(h.a(((h) (obj2)).n)).a(h.a(w1)).a();
        ((A) (w1)).g.close();
        ((h) (obj2)).e();
        com.c.a.a.a.b.a(((h) (obj2)).b);
        h.a(((h) (obj2)).o);
        obj2.o = ((h) (obj2)).b(((h) (obj2)).o);
          goto _L53
_L58:
label2:
        {
            if (((h) (obj2)).r)
            {
                break label2;
            }
            w1 = (new com.c.a.a.a.h.a(((h) (obj2)), 0, ((h) (obj2)).m)).a(((h) (obj2)).m);
        }
          goto _L63
        if (((h) (obj2)).q != null && ((h) (obj2)).q.a().b > 0L)
        {
            ((h) (obj2)).q.b();
        }
        if (((h) (obj2)).i == -1L)
        {
            if (m.a(((h) (obj2)).m) == -1L && (((h) (obj2)).p instanceof q))
            {
                l2 = ((q)((h) (obj2)).p).a.b;
                obj2.m = ((h) (obj2)).m.c().a("Content-Length", Long.toString(l2)).a();
            }
            ((h) (obj2)).h.a(((h) (obj2)).m);
        }
        if (((h) (obj2)).p == null) goto _L65; else goto _L64
_L64:
        if (((h) (obj2)).q == null)
        {
            break MISSING_BLOCK_LABEL_2350;
        }
        ((h) (obj2)).q.close();
_L66:
        if (((h) (obj2)).p instanceof q)
        {
            ((h) (obj2)).h.a((q)((h) (obj2)).p);
        }
          goto _L65
        ((h) (obj2)).p.close();
          goto _L66
_L62:
        i.a(((h) (obj2)).n.g);
_L60:
        obj = w1.b();
        obj.a = ((h) (obj2)).l;
        obj2.o = ((A.a) (obj)).c(h.a(((h) (obj2)).g)).b(h.a(((h) (obj2)).n)).a(h.a(w1)).a();
        if (!h.c(((h) (obj2)).o)) goto _L53; else goto _L67
_L67:
        w1 = com.c.a.a.a.b.a(((h) (obj2)).b);
        if (w1 == null) goto _L69; else goto _L68
_L68:
        if (com.c.a.a.a.c.a(((h) (obj2)).o, ((h) (obj2)).m)) goto _L71; else goto _L70
_L70:
        w1 = ((h) (obj2)).m.b;
        if (!w1.equals("POST") && !w1.equals("PATCH") && !w1.equals("PUT"))
        {
            w1.equals("DELETE");
        }
_L69:
        obj3 = ((h) (obj2)).t;
        obj = ((h) (obj2)).o;
        if (obj3 != null) goto _L73; else goto _L72
_L72:
        w1 = ((w) (obj));
_L75:
        obj2.o = ((h) (obj2)).b(w1);
          goto _L53
_L71:
        h.a(((h) (obj2)).o);
        obj2.t = w1.b();
          goto _L69
_L73:
        obj4 = ((com.c.a.a.a.b) (obj3)).a();
        w1 = ((w) (obj));
        if (obj4 == null) goto _L75; else goto _L74
_L74:
        w1 = new j(((h) (obj2)), ((A) (obj)).g.c(), ((com.c.a.a.a.b) (obj3)), o.a(((x) (obj4))));
        obj3 = ((A) (obj)).b();
        obj3.g = new com.c.a.a.a.o(((A) (obj)).f, o.a(w1));
        w1 = ((A.a) (obj3)).a();
          goto _L75
_L10:
        obj2 = w1.f();
        w1 = new h(((h) (w1)).b, ((h) (w1)).l, ((h) (w1)).k, ((h) (w1)).r, ((h) (w1)).s, ((com.c.a.i) (obj2)), ((h) (w1)).e, ((h) (w1)).g);
          goto _L76
_L53:
        obj = d.d();
        obj2 = d;
        if (((h) (obj2)).o == null)
        {
            throw new IllegalStateException();
        }
        if (((h) (obj2)).f != null)
        {
            w1 = ((h) (obj2)).f.b;
        } else
        {
            w1 = ((h) (obj2)).b.e;
        }
        ((h) (obj2)).o.c;
        JVM INSTR lookupswitch 8: default 2864
    //                   300: 2973
    //                   301: 2973
    //                   302: 2973
    //                   303: 2973
    //                   307: 2939
    //                   308: 2939
    //                   401: 2918
    //                   407: 2897;
           goto _L77 _L78 _L78 _L78 _L78 _L79 _L79 _L80 _L81
_L77:
        w1 = null;
_L85:
        if (w1 != null) goto _L83; else goto _L82
_L82:
        w1 = ((w) (obj));
        if (!flag)
        {
            d.e();
            return ((A) (obj));
        }
          goto _L84
_L81:
        if (w1.type() != java.net.Proxy.Type.HTTP)
        {
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        }
_L80:
        w1 = m.a(((h) (obj2)).b.q, ((h) (obj2)).o, w1);
          goto _L85
_L79:
        if (!((h) (obj2)).l.b.equals("GET") && !((h) (obj2)).l.b.equals("HEAD")) goto _L77; else goto _L78
_L78:
        if (!((h) (obj2)).b.u || (w1 = ((h) (obj2)).o.a("Location")) == null || (!(w1 = new URL(((h) (obj2)).l.a(), w1)).getProtocol().equals("https") && !w1.getProtocol().equals("http") || !w1.getProtocol().equals(((h) (obj2)).l.a().getProtocol()) && !((h) (obj2)).b.t)) goto _L77; else goto _L86
_L86:
        obj3 = ((h) (obj2)).l.c();
        if (k.a(((h) (obj2)).l.b))
        {
            ((w.a) (obj3)).a("GET", null);
            ((w.a) (obj3)).b("Transfer-Encoding");
            ((w.a) (obj3)).b("Content-Length");
            ((w.a) (obj3)).b("Content-Type");
        }
        if (!((h) (obj2)).b(w1))
        {
            ((w.a) (obj3)).b("Authorization");
        }
        w1 = ((w.a) (obj3)).a(w1).a();
          goto _L85
_L83:
        l++;
        if (l > 20)
        {
            throw new ProtocolException((new StringBuilder("Too many follow-up requests: ")).append(l).toString());
        }
        if (!d.b(w1.a()))
        {
            d.e();
        }
        obj2 = d.f();
        d = new h(a, w1, false, false, flag, ((com.c.a.i) (obj2)), null, ((A) (obj)));
          goto _L11
_L29:
        l3 = 0L;
          goto _L87
_L13:
        obj = null;
          goto _L88
_L25:
        l2 = 0L;
          goto _L89
_L39:
        l2 = 0L;
          goto _L32
_L35:
        l2 = 0L;
          goto _L32
    }
}
