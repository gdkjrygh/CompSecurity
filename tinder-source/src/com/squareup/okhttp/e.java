// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.b.b;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.internal.g;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.a;
import com.squareup.okhttp.internal.http.c;
import com.squareup.okhttp.internal.http.h;
import com.squareup.okhttp.internal.http.i;
import com.squareup.okhttp.internal.http.n;
import com.squareup.okhttp.internal.http.o;
import com.squareup.okhttp.internal.http.q;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.l;

// Referenced classes of package com.squareup.okhttp:
//            s, g, j, m, 
//            t, u, r, i, 
//            Protocol, d, v, p, 
//            a, w, x, q, 
//            f

public final class e
{
    final class a
        implements q.a
    {

        final e a;
        private final int b;
        private final t c;
        private final boolean d;

        public final v a(t t1)
            throws IOException
        {
            if (b < a.a.h.size())
            {
                a. new a(b + 1, t1, d);
                return ((com.squareup.okhttp.q)a.a.h.get(b)).a();
            } else
            {
                return a.a(t1, d);
            }
        }

        a(int i1, t t1, boolean flag)
        {
            a = e.this;
            super();
            b = i1;
            c = t1;
            d = flag;
        }
    }

    final class b extends f
    {

        final e a;
        private final com.squareup.okhttp.f c;
        private final boolean d;

        final String a()
        {
            return a.d.a.c;
        }

        protected final void b()
        {
            boolean flag = true;
            v v1;
            boolean flag1;
            v1 = a.a(d);
            flag1 = a.c;
            if (!flag1) goto _L2; else goto _L1
_L1:
            c.a(new IOException("Canceled"));
_L4:
            a.a.d.b(this);
            return;
_L2:
            c.a(v1);
            if (true) goto _L4; else goto _L3
_L3:
            Object obj;
            obj;
_L10:
            if (!flag) goto _L6; else goto _L5
_L5:
            Logger logger;
            Level level;
            StringBuilder stringbuilder;
            Object obj1;
            logger = d.a;
            level = Level.INFO;
            stringbuilder = new StringBuilder("Callback failure for ");
            obj1 = a;
            String s1;
            if (((e) (obj1)).c)
            {
                s1 = "canceled call";
            } else
            {
                s1 = "call";
            }
            obj1 = ((e) (obj1)).d.a.c("/...");
            logger.log(level, stringbuilder.append((new StringBuilder()).append(s1).append(" to ").append(obj1).toString()).toString(), ((Throwable) (obj)));
_L8:
            a.a.d.b(this);
            return;
_L6:
            com.squareup.okhttp.f f1 = c;
            t t1 = a.e.l;
            f1.a(((IOException) (obj)));
            if (true) goto _L8; else goto _L7
_L7:
            obj;
            a.a.d.b(this);
            throw obj;
            obj;
            flag = false;
            if (true) goto _L10; else goto _L9
_L9:
        }

        private b(com.squareup.okhttp.f f1)
        {
            a = e.this;
            super("OkHttp %s", new Object[] {
                e.this.d.a.toString()
            });
            c = f1;
            d = true;
        }

        b(com.squareup.okhttp.f f1, byte byte0)
        {
            this(f1);
        }
    }


    final s a;
    boolean b;
    public volatile boolean c;
    t d;
    public h e;

    protected e(s s1, t t1)
    {
        s s2 = new s(s1);
        if (s2.j == null)
        {
            s2.j = ProxySelector.getDefault();
        }
        if (s2.k == null)
        {
            s2.k = CookieHandler.getDefault();
        }
        if (s2.m == null)
        {
            s2.m = SocketFactory.getDefault();
        }
        if (s2.n == null)
        {
            s2.n = s1.b();
        }
        if (s2.o == null)
        {
            s2.o = com.squareup.okhttp.internal.b.b.a;
        }
        if (s2.p == null)
        {
            s2.p = com.squareup.okhttp.g.a;
        }
        if (s2.q == null)
        {
            s2.q = com.squareup.okhttp.internal.http.a.a;
        }
        if (s2.r == null)
        {
            s2.r = com.squareup.okhttp.j.a();
        }
        if (s2.f == null)
        {
            s2.f = com.squareup.okhttp.s.a;
        }
        if (s2.g == null)
        {
            s2.g = com.squareup.okhttp.s.b;
        }
        if (s2.s == null)
        {
            s2.s = g.a;
        }
        a = s2;
        d = t1;
    }

    public final v a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        b = true;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        a.d.a(this);
        obj = a(false);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        throw new IOException("Canceled");
        obj;
        a.d.b(this);
        throw obj;
        a.d.b(this);
        return ((v) (obj));
    }

    final v a(t t1, boolean flag)
        throws IOException
    {
        int i1;
        u u1 = t1.d;
        if (u1 != null)
        {
            t1 = t1.b();
            r r1 = u1.a();
            if (r1 != null)
            {
                t1.a("Content-Type", r1.toString());
            }
            long l1 = u1.b();
            if (l1 != -1L)
            {
                t1.a("Content-Length", Long.toString(l1));
                t1.b("Transfer-Encoding");
            } else
            {
                t1.a("Transfer-Encoding", "chunked");
                t1.b("Content-Length");
            }
            t1 = t1.a();
        }
        e = new h(a, t1, false, false, flag, null, null, null, null);
        i1 = 0;
_L16:
        if (c)
        {
            e.e();
            throw new IOException("Canceled");
        }
        Object obj3 = e;
        if (((h) (obj3)).u != null) goto _L2; else goto _L1
_L1:
        if (((h) (obj3)).h != null)
        {
            throw new IllegalStateException();
        }
          goto _L3
        t1;
        throw t1.a();
_L3:
        Object obj;
        Object obj1;
        t1 = ((h) (obj3)).l;
        obj = t1.b();
        if (t1.a("Host") == null)
        {
            ((t.a) (obj)).a("Host", k.a(t1.a));
        }
        if ((((h) (obj3)).c == null || ((h) (obj3)).c.g != com.squareup.okhttp.Protocol.a) && t1.a("Connection") == null)
        {
            ((t.a) (obj)).a("Connection", "Keep-Alive");
        }
        if (t1.a("Accept-Encoding") == null)
        {
            obj3.j = true;
            ((t.a) (obj)).a("Accept-Encoding", "gzip");
        }
        obj1 = ((h) (obj3)).b.k;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        java.util.Map map = com.squareup.okhttp.internal.http.k.b(((t.a) (obj)).a().c);
        com.squareup.okhttp.internal.http.k.a(((t.a) (obj)), ((CookieHandler) (obj1)).get(t1.a(), map));
        Object obj4;
        com.squareup.okhttp.internal.e e1;
        if (t1.a("User-Agent") == null)
        {
            ((t.a) (obj)).a("User-Agent", "okhttp/2.5.0");
        }
        obj4 = ((t.a) (obj)).a();
        e1 = d.b.a(((h) (obj3)).b);
        if (e1 == null) goto _L5; else goto _L4
_L4:
        obj = e1.a(((t) (obj4)));
_L17:
        Object obj5 = new com.squareup.okhttp.internal.http.c.a(System.currentTimeMillis(), ((t) (obj4)), ((v) (obj)));
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).c != null) goto _L7; else goto _L6
_L6:
        t1 = new c(((com.squareup.okhttp.internal.http.c.a) (obj5)).b, null, (byte)0);
_L20:
        obj1 = t1;
        if (((c) (t1)).a == null)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        obj1 = t1;
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).b.c().k)
        {
            obj1 = new c(null, null, (byte)0);
        }
        obj3.u = ((c) (obj1));
        obj3.m = ((h) (obj3)).u.a;
        obj3.n = ((h) (obj3)).u.b;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        e1.a(((h) (obj3)).u);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        if (((h) (obj3)).n == null)
        {
            k.a(((v) (obj)).g);
        }
        if (((h) (obj3)).m == null) goto _L9; else goto _L8
_L8:
        if (((h) (obj3)).c != null) goto _L11; else goto _L10
_L10:
        if (((h) (obj3)).c != null)
        {
            throw new IllegalStateException();
        }
          goto _L12
        obj;
        t1 = e;
        if (((h) (t1)).e != null && ((h) (t1)).c != null)
        {
            t1.a(((h) (t1)).e, ((RouteException) (obj)).a);
        }
        if (((h) (t1)).e == null && ((h) (t1)).c == null || ((h) (t1)).e != null && !((h) (t1)).e.a()) goto _L14; else goto _L13
_L13:
        boolean flag1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        if (!((h) (t1)).b.v)
        {
            flag1 = false;
        } else
        {
            obj2 = ((RouteException) (obj)).a;
            if (obj2 instanceof ProtocolException)
            {
                flag1 = false;
            } else
            if (obj2 instanceof InterruptedIOException)
            {
                flag1 = false;
            } else
            if ((obj2 instanceof SSLHandshakeException) && (((IOException) (obj2)).getCause() instanceof CertificateException))
            {
                flag1 = false;
            } else
            if (obj2 instanceof SSLPeerUnverifiedException)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
        }
        if (flag1) goto _L15; else goto _L14
_L14:
        t1 = null;
_L81:
        if (t1 != null)
        {
            e = t1;
        } else
        {
            throw ((RouteException) (obj)).a;
        }
          goto _L16
_L5:
        obj = null;
          goto _L17
_L7:
        if (!((com.squareup.okhttp.internal.http.c.a) (obj5)).b.d() || ((com.squareup.okhttp.internal.http.c.a) (obj5)).c.e != null) goto _L19; else goto _L18
_L18:
        t1 = new c(((com.squareup.okhttp.internal.http.c.a) (obj5)).b, null, (byte)0);
          goto _L20
        obj;
        t1 = e;
        if (((h) (t1)).e != null && ((h) (t1)).c != null)
        {
            t1.a(((h) (t1)).e, ((IOException) (obj)));
        }
        if (((h) (t1)).e == null && ((h) (t1)).c == null || ((h) (t1)).e != null && !((h) (t1)).e.a()) goto _L22; else goto _L21
_L21:
        if (!((h) (t1)).b.v)
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
        if (flag1) goto _L23; else goto _L22
_L22:
        t1 = null;
_L82:
        if (t1 != null)
        {
            e = t1;
        } else
        {
            throw obj;
        }
          goto _L16
_L19:
label0:
        {
            if (com.squareup.okhttp.internal.http.c.a(((com.squareup.okhttp.internal.http.c.a) (obj5)).c, ((com.squareup.okhttp.internal.http.c.a) (obj5)).b))
            {
                break label0;
            }
            t1 = new c(((com.squareup.okhttp.internal.http.c.a) (obj5)).b, null, (byte)0);
        }
          goto _L20
label1:
        {
            obj1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).b.c();
            if (!((com.squareup.okhttp.d) (obj1)).c && !com.squareup.okhttp.internal.http.c.a.a(((com.squareup.okhttp.internal.http.c.a) (obj5)).b))
            {
                break label1;
            }
            t1 = new c(((com.squareup.okhttp.internal.http.c.a) (obj5)).b, null, (byte)0);
        }
          goto _L20
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).d == null) goto _L25; else goto _L24
_L24:
        l2 = Math.max(0L, ((com.squareup.okhttp.internal.http.c.a) (obj5)).j - ((com.squareup.okhttp.internal.http.c.a) (obj5)).d.getTime());
_L91:
        l3 = l2;
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).l != -1)
        {
            l3 = Math.max(l2, TimeUnit.SECONDS.toMillis(((com.squareup.okhttp.internal.http.c.a) (obj5)).l));
        }
        l6 = l3 + (((com.squareup.okhttp.internal.http.c.a) (obj5)).j - ((com.squareup.okhttp.internal.http.c.a) (obj5)).i) + (((com.squareup.okhttp.internal.http.c.a) (obj5)).a - ((com.squareup.okhttp.internal.http.c.a) (obj5)).j);
        t1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).c.h();
        if (((com.squareup.okhttp.d) (t1)).e == -1) goto _L27; else goto _L26
_L26:
        l2 = TimeUnit.SECONDS.toMillis(((com.squareup.okhttp.d) (t1)).e);
_L32:
        if (((com.squareup.okhttp.d) (obj1)).e != -1)
        {
            l2 = Math.min(l2, TimeUnit.SECONDS.toMillis(((com.squareup.okhttp.d) (obj1)).e));
        }
        if (((com.squareup.okhttp.d) (obj1)).j == -1) goto _L29; else goto _L28
_L28:
        l3 = TimeUnit.SECONDS.toMillis(((com.squareup.okhttp.d) (obj1)).j);
_L90:
        l5 = 0L;
        t1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).c.h();
        l4 = l5;
        if (((com.squareup.okhttp.d) (t1)).h)
        {
            break MISSING_BLOCK_LABEL_1090;
        }
        l4 = l5;
        if (((com.squareup.okhttp.d) (obj1)).i != -1)
        {
            l4 = TimeUnit.SECONDS.toMillis(((com.squareup.okhttp.d) (obj1)).i);
        }
        if (((com.squareup.okhttp.d) (t1)).c || l6 + l3 >= l4 + l2) goto _L31; else goto _L30
_L30:
        t1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).c.e();
        if (l3 + l6 < l2)
        {
            break MISSING_BLOCK_LABEL_1142;
        }
        t1.b("Warning", "110 HttpURLConnection \"Response is stale\"");
        if (l6 <= 0x5265c00L)
        {
            break MISSING_BLOCK_LABEL_1193;
        }
        Object obj2;
        s s1;
        StringBuilder stringbuilder;
        boolean flag2;
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).c.h().e == -1 && ((com.squareup.okhttp.internal.http.c.a) (obj5)).h == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1193;
        }
        t1.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
        t1 = new c(null, t1.a(), (byte)0);
          goto _L20
_L27:
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).h == null)
        {
            break MISSING_BLOCK_LABEL_1276;
        }
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).d == null)
        {
            break MISSING_BLOCK_LABEL_1266;
        }
        l2 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).d.getTime();
_L33:
        l3 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).h.getTime() - l2;
        l2 = l3;
        if (l3 <= 0L)
        {
            l2 = 0L;
        }
          goto _L32
        l2 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).j;
          goto _L33
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).f == null) goto _L35; else goto _L34
_L34:
        t1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).c.a.a;
        if (((p) (t1)).e != null) goto _L37; else goto _L36
_L36:
        t1 = null;
_L43:
        if (t1 != null) goto _L35; else goto _L38
_L38:
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).d == null) goto _L40; else goto _L39
_L39:
        l2 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).d.getTime();
_L44:
        l2 -= ((com.squareup.okhttp.internal.http.c.a) (obj5)).f.getTime();
        if (l2 <= 0L) goto _L42; else goto _L41
_L41:
        l2 /= 10L;
          goto _L32
_L37:
        stringbuilder = new StringBuilder();
        com.squareup.okhttp.p.b(stringbuilder, ((p) (t1)).e);
        t1 = stringbuilder.toString();
          goto _L43
_L40:
        l2 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).i;
          goto _L44
_L31:
        t1 = ((com.squareup.okhttp.internal.http.c.a) (obj5)).b.b();
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).k == null) goto _L46; else goto _L45
_L45:
        t1.a("If-None-Match", ((com.squareup.okhttp.internal.http.c.a) (obj5)).k);
_L49:
        t1 = t1.a();
        if (!com.squareup.okhttp.internal.http.c.a.a(t1))
        {
            break MISSING_BLOCK_LABEL_1503;
        }
        t1 = new c(t1, ((com.squareup.okhttp.internal.http.c.a) (obj5)).c, (byte)0);
          goto _L20
_L46:
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).f == null) goto _L48; else goto _L47
_L47:
        t1.a("If-Modified-Since", ((com.squareup.okhttp.internal.http.c.a) (obj5)).g);
          goto _L49
_L48:
        if (((com.squareup.okhttp.internal.http.c.a) (obj5)).d == null) goto _L49; else goto _L50
_L50:
        t1.a("If-Modified-Since", ((com.squareup.okhttp.internal.http.c.a) (obj5)).e);
          goto _L49
        t1 = new c(t1, null, (byte)0);
          goto _L20
_L12:
        if (((h) (obj3)).e != null)
        {
            break MISSING_BLOCK_LABEL_1673;
        }
        s1 = ((h) (obj3)).b;
        obj5 = ((h) (obj3)).m;
        t1 = null;
        obj = null;
        obj2 = null;
        if (((t) (obj5)).d())
        {
            t1 = s1.n;
            obj = s1.o;
            obj2 = s1.p;
        }
        obj3.d = new com.squareup.okhttp.a(((t) (obj5)).a.c, ((t) (obj5)).a.d, s1.m, t1, ((javax.net.ssl.HostnameVerifier) (obj)), ((com.squareup.okhttp.g) (obj2)), s1.q, s1.e, s1.f, s1.g, s1.j);
        t1 = ((h) (obj3)).d;
        obj = ((h) (obj3)).m;
        obj2 = ((h) (obj3)).b;
        obj3.e = new o(t1, ((t) (obj)).a, ((s) (obj2)));
        obj3.c = ((h) (obj3)).a();
        d.b.a(((h) (obj3)).b, ((h) (obj3)).c, ((h) (obj3)), ((h) (obj3)).m);
        obj3.f = ((h) (obj3)).c.b;
_L11:
        obj3.h = d.b.a(((h) (obj3)).c, ((h) (obj3)));
        if (!((h) (obj3)).r || !((h) (obj3)).c() || ((h) (obj3)).p != null) goto _L2; else goto _L51
_L51:
        l2 = com.squareup.okhttp.internal.http.k.a(((t) (obj4)));
        if (!((h) (obj3)).k) goto _L53; else goto _L52
_L52:
        if (l2 <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_1806;
        }
        throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
        t1;
        throw new RequestException(t1);
        if (l2 == -1L) goto _L55; else goto _L54
_L54:
        ((h) (obj3)).h.a(((h) (obj3)).m);
        obj3.p = new n((int)l2);
_L2:
        obj2 = e;
        if (((h) (obj2)).o != null) goto _L57; else goto _L56
_L56:
        if (((h) (obj2)).m == null && ((h) (obj2)).n == null)
        {
            throw new IllegalStateException("call sendRequest() first!");
        }
          goto _L58
_L55:
        obj3.p = new n();
          goto _L2
_L53:
        ((h) (obj3)).h.a(((h) (obj3)).m);
        obj3.p = ((h) (obj3)).h.a(((h) (obj3)).m, l2);
          goto _L2
_L9:
        if (((h) (obj3)).c != null)
        {
            d.b.a(((h) (obj3)).b.r, ((h) (obj3)).c);
            obj3.c = null;
        }
        if (((h) (obj3)).n == null)
        {
            break MISSING_BLOCK_LABEL_2049;
        }
        t1 = ((h) (obj3)).n.e();
        t1.a = ((h) (obj3)).l;
        obj3.o = t1.c(h.a(((h) (obj3)).g)).b(h.a(((h) (obj3)).n)).a();
_L59:
        obj3.o = ((h) (obj3)).b(((h) (obj3)).o);
          goto _L2
        t1 = new v.a();
        t1.a = ((h) (obj3)).l;
        t1 = t1.c(h.a(((h) (obj3)).g));
        t1.b = com.squareup.okhttp.Protocol.b;
        t1.c = 504;
        t1.d = "Unsatisfiable Request (only-if-cached)";
        t1.g = h.a;
        obj3.o = t1.a();
          goto _L59
_L58:
        if (((h) (obj2)).m == null) goto _L57; else goto _L60
_L60:
        if (!((h) (obj2)).s) goto _L62; else goto _L61
_L61:
        ((h) (obj2)).h.a(((h) (obj2)).m);
_L69:
        t1 = ((h) (obj2)).g();
_L67:
        ((h) (obj2)).a(((v) (t1)).f);
        if (((h) (obj2)).n == null) goto _L64; else goto _L63
_L63:
        if (!h.a(((h) (obj2)).n, t1)) goto _L66; else goto _L65
_L65:
        obj = ((h) (obj2)).n.e();
        obj.a = ((h) (obj2)).l;
        obj2.o = ((v.a) (obj)).c(h.a(((h) (obj2)).g)).a(h.a(((h) (obj2)).n.f, ((v) (t1)).f)).b(h.a(((h) (obj2)).n)).a(h.a(t1)).a();
        ((v) (t1)).g.close();
        ((h) (obj2)).e();
        t1 = d.b.a(((h) (obj2)).b);
        t1.a();
        t1.a(((h) (obj2)).n, h.a(((h) (obj2)).o));
        obj2.o = ((h) (obj2)).b(((h) (obj2)).o);
          goto _L57
_L62:
label2:
        {
            if (((h) (obj2)).r)
            {
                break label2;
            }
            t1 = (new com.squareup.okhttp.internal.http.h.a(((h) (obj2)), 0, ((h) (obj2)).m)).a(((h) (obj2)).m);
        }
          goto _L67
        if (((h) (obj2)).q != null && ((h) (obj2)).q.b().b > 0L)
        {
            ((h) (obj2)).q.c();
        }
        if (((h) (obj2)).i == -1L)
        {
            if (com.squareup.okhttp.internal.http.k.a(((h) (obj2)).m) == -1L && (((h) (obj2)).p instanceof n))
            {
                l2 = ((n)((h) (obj2)).p).a.b;
                obj2.m = ((h) (obj2)).m.b().a("Content-Length", Long.toString(l2)).a();
            }
            ((h) (obj2)).h.a(((h) (obj2)).m);
        }
        if (((h) (obj2)).p == null) goto _L69; else goto _L68
_L68:
        if (((h) (obj2)).q == null)
        {
            break MISSING_BLOCK_LABEL_2578;
        }
        ((h) (obj2)).q.close();
_L70:
        if (((h) (obj2)).p instanceof n)
        {
            ((h) (obj2)).h.a((n)((h) (obj2)).p);
        }
          goto _L69
        ((h) (obj2)).p.close();
          goto _L70
_L66:
        k.a(((h) (obj2)).n.g);
_L64:
        obj = t1.e();
        obj.a = ((h) (obj2)).l;
        obj2.o = ((v.a) (obj)).c(h.a(((h) (obj2)).g)).b(h.a(((h) (obj2)).n)).a(h.a(t1)).a();
        if (!h.c(((h) (obj2)).o)) goto _L57; else goto _L71
_L71:
        t1 = d.b.a(((h) (obj2)).b);
        if (t1 == null) goto _L73; else goto _L72
_L72:
        if (com.squareup.okhttp.internal.http.c.a(((h) (obj2)).o, ((h) (obj2)).m)) goto _L75; else goto _L74
_L74:
        flag2 = i.a(((h) (obj2)).m.b);
        if (!flag2) goto _L73; else goto _L76
_L76:
        try
        {
            t1.b(((h) (obj2)).m);
        }
        // Misplaced declaration of an exception variable
        catch (t t1) { }
_L73:
        obj3 = ((h) (obj2)).t;
        obj = ((h) (obj2)).o;
        if (obj3 != null) goto _L78; else goto _L77
_L77:
        t1 = ((t) (obj));
_L80:
        obj2.o = ((h) (obj2)).b(t1);
          goto _L57
_L75:
        obj2.t = t1.a(h.a(((h) (obj2)).o));
          goto _L73
_L78:
        obj4 = ((com.squareup.okhttp.internal.http.b) (obj3)).b();
        t1 = ((t) (obj));
        if (obj4 == null) goto _L80; else goto _L79
_L79:
        t1 = new com.squareup.okhttp.internal.http.h._cls2(((h) (obj2)), ((v) (obj)).g.c(), ((com.squareup.okhttp.internal.http.b) (obj3)), l.a(((okio.q) (obj4))));
        obj3 = ((v) (obj)).e();
        obj3.g = new com.squareup.okhttp.internal.http.l(((v) (obj)).f, l.a(t1));
        t1 = ((v.a) (obj3)).a();
          goto _L80
_L15:
        obj2 = t1.f();
        t1 = new h(((h) (t1)).b, ((h) (t1)).l, ((h) (t1)).k, ((h) (t1)).r, ((h) (t1)).s, ((com.squareup.okhttp.i) (obj2)), ((h) (t1)).e, (n)((h) (t1)).p, ((h) (t1)).g);
          goto _L81
_L23:
        obj2 = t1.f();
        t1 = new h(((h) (t1)).b, ((h) (t1)).l, ((h) (t1)).k, ((h) (t1)).r, ((h) (t1)).s, ((com.squareup.okhttp.i) (obj2)), ((h) (t1)).e, null, ((h) (t1)).g);
          goto _L82
_L57:
        obj = e.d();
        obj2 = e;
        if (((h) (obj2)).o == null)
        {
            throw new IllegalStateException();
        }
        if (((h) (obj2)).f != null)
        {
            t1 = ((h) (obj2)).f.b;
        } else
        {
            t1 = ((h) (obj2)).b.e;
        }
        ((h) (obj2)).o.c;
        JVM INSTR lookupswitch 8: default 3176
    //                   300: 3283
    //                   301: 3283
    //                   302: 3283
    //                   303: 3283
    //                   307: 3249
    //                   308: 3249
    //                   401: 3228
    //                   407: 3207;
           goto _L83 _L84 _L84 _L84 _L84 _L85 _L85 _L86 _L87
_L83:
        t1 = null;
          goto _L88
_L87:
        if (t1.type() != java.net.Proxy.Type.HTTP)
        {
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        }
_L86:
        t1 = com.squareup.okhttp.internal.http.k.a(((h) (obj2)).b.q, ((h) (obj2)).o, t1);
          goto _L88
_L85:
        if (!((h) (obj2)).l.b.equals("GET") && !((h) (obj2)).l.b.equals("HEAD")) goto _L83; else goto _L84
_L84:
        if (!((h) (obj2)).b.u || (t1 = ((h) (obj2)).o.a("Location")) == null || ((t1 = ((h) (obj2)).l.a.c(t1)) == null || !((p) (t1)).a.equals(((h) (obj2)).l.a.a) && !((h) (obj2)).b.t)) goto _L83; else goto _L89
_L89:
        obj3 = ((h) (obj2)).l.b();
        if (i.c(((h) (obj2)).l.b))
        {
            ((t.a) (obj3)).a("GET", null);
            ((t.a) (obj3)).b("Transfer-Encoding");
            ((t.a) (obj3)).b("Content-Length");
            ((t.a) (obj3)).b("Content-Type");
        }
        if (!((h) (obj2)).a(t1))
        {
            ((t.a) (obj3)).b("Authorization");
        }
        t1 = ((t.a) (obj3)).a(t1).a();
_L88:
        if (t1 == null)
        {
            if (!flag)
            {
                e.e();
            }
            return ((v) (obj));
        }
        i1++;
        if (i1 > 20)
        {
            throw new ProtocolException((new StringBuilder("Too many follow-up requests: ")).append(i1).toString());
        }
        if (!e.a(t1.a))
        {
            e.e();
        }
        obj2 = e.f();
        e = new h(a, t1, false, false, flag, ((com.squareup.okhttp.i) (obj2)), null, null, ((v) (obj)));
          goto _L16
_L29:
        l3 = 0L;
          goto _L90
_L25:
        l2 = 0L;
          goto _L91
_L42:
        l2 = 0L;
          goto _L32
_L35:
        l2 = 0L;
          goto _L32
    }

    final v a(boolean flag)
        throws IOException
    {
        return (new a(0, d, flag)).a(d);
    }
}
