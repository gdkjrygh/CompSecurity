// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.a;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.e;
import com.squareup.okhttp.internal.framed.b;
import com.squareup.okhttp.internal.framed.c;
import com.squareup.okhttp.internal.framed.m;
import com.squareup.okhttp.internal.g;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.f;
import com.squareup.okhttp.internal.http.h;
import com.squareup.okhttp.internal.http.q;
import com.squareup.okhttp.internal.i;
import com.squareup.okhttp.internal.j;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, k, m, c, 
//            e, g, b, j, 
//            t, i, x, a, 
//            f

public class s
    implements Cloneable
{

    static final List a;
    static final List b;
    private static SSLSocketFactory z;
    private com.squareup.okhttp.c A;
    final j c;
    com.squareup.okhttp.m d;
    public Proxy e;
    public List f;
    public List g;
    final List h;
    public final List i;
    public ProxySelector j;
    public CookieHandler k;
    e l;
    public SocketFactory m;
    public SSLSocketFactory n;
    public HostnameVerifier o;
    public com.squareup.okhttp.g p;
    public com.squareup.okhttp.b q;
    public com.squareup.okhttp.j r;
    g s;
    public boolean t;
    public boolean u;
    public boolean v;
    int w;
    public int x;
    int y;

    public s()
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        w = 10000;
        x = 10000;
        y = 10000;
        c = new j();
        d = new com.squareup.okhttp.m();
    }

    s(s s1)
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        w = 10000;
        x = 10000;
        y = 10000;
        c = s1.c;
        d = s1.d;
        e = s1.e;
        f = s1.f;
        g = s1.g;
        h.addAll(s1.h);
        i.addAll(s1.i);
        j = s1.j;
        k = s1.k;
        A = s1.A;
        e e1;
        if (A != null)
        {
            e1 = A.a;
        } else
        {
            e1 = s1.l;
        }
        l = e1;
        m = s1.m;
        n = s1.n;
        o = s1.o;
        p = s1.p;
        q = s1.q;
        r = s1.r;
        s = s1.s;
        t = s1.t;
        u = s1.u;
        v = s1.v;
        w = s1.w;
        x = s1.x;
        y = s1.y;
    }

    static g a(s s1)
    {
        return s1.s;
    }

    public final com.squareup.okhttp.e a(t t1)
    {
        return new com.squareup.okhttp.e(this, t1);
    }

    public final com.squareup.okhttp.m a()
    {
        return d;
    }

    public final s a(com.squareup.okhttp.c c1)
    {
        A = c1;
        l = null;
        return this;
    }

    public final s a(HostnameVerifier hostnameverifier)
    {
        o = hostnameverifier;
        return this;
    }

    public final s a(SSLSocketFactory sslsocketfactory)
    {
        n = sslsocketfactory;
        return this;
    }

    public final void a(long l1, TimeUnit timeunit)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        long l2 = timeunit.toMillis(l1);
        if (l2 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l2 == 0L && l1 > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        } else
        {
            w = (int)l2;
            return;
        }
    }

    final SSLSocketFactory b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = z;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, null, null);
        z = ((SSLContext) (obj)).getSocketFactory();
        obj = z;
        this;
        JVM INSTR monitorexit ;
        return ((SSLSocketFactory) (obj));
        Object obj1;
        obj1;
        throw new AssertionError();
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final void b(long l1, TimeUnit timeunit)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        long l2 = timeunit.toMillis(l1);
        if (l2 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l2 == 0L && l1 > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        } else
        {
            x = (int)l2;
            return;
        }
    }

    public final s c()
    {
        return new s(this);
    }

    public final void c(long l1, TimeUnit timeunit)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        long l2 = timeunit.toMillis(l1);
        if (l2 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l2 == 0L && l1 > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        } else
        {
            y = (int)l2;
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    static 
    {
        a = com.squareup.okhttp.internal.k.a(new Protocol[] {
            com.squareup.okhttp.Protocol.d, com.squareup.okhttp.Protocol.c, com.squareup.okhttp.Protocol.b
        });
        b = com.squareup.okhttp.internal.k.a(new com.squareup.okhttp.k[] {
            com.squareup.okhttp.k.a, com.squareup.okhttp.k.b, com.squareup.okhttp.k.c
        });
        d.b = new d() {

            public final e a(s s1)
            {
                return s1.l;
            }

            public final q a(com.squareup.okhttp.i i1, h h1)
                throws IOException
            {
                if (i1.f != null)
                {
                    return new com.squareup.okhttp.internal.http.d(h1, i1.f);
                } else
                {
                    return new com.squareup.okhttp.internal.http.j(h1, i1.e);
                }
            }

            public final void a(com.squareup.okhttp.e e1)
                throws IOException
            {
                e1.e.e();
            }

            public final void a(com.squareup.okhttp.e e1, com.squareup.okhttp.f f1)
            {
                e1;
                JVM INSTR monitorenter ;
                if (e1.b)
                {
                    throw new IllegalStateException("Already Executed");
                }
                break MISSING_BLOCK_LABEL_24;
                f1;
                e1;
                JVM INSTR monitorexit ;
                throw f1;
                e1.b = true;
                e1;
                JVM INSTR monitorexit ;
                e1.a.d.a(new e.b(e1, f1, (byte)0));
                return;
            }

            public final void a(com.squareup.okhttp.i i1, Protocol protocol)
            {
                if (protocol == null)
                {
                    throw new IllegalArgumentException("protocol == null");
                } else
                {
                    i1.g = protocol;
                    return;
                }
            }

            public final void a(com.squareup.okhttp.i i1, Object obj)
                throws IOException
            {
label0:
                {
                    if (i1.e())
                    {
                        throw new IllegalStateException();
                    }
                    synchronized (i1.a)
                    {
                        if (i1.k == obj)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                i1.k = null;
                j1;
                JVM INSTR monitorexit ;
                if (i1.c != null)
                {
                    i1.c.close();
                    return;
                } else
                {
                    return;
                }
                i1;
                j1;
                JVM INSTR monitorexit ;
                throw i1;
            }

            public final void a(com.squareup.okhttp.j j1, com.squareup.okhttp.i i1)
            {
label0:
                {
                    if (!i1.e() && i1.a())
                    {
                        if (i1.b())
                        {
                            break label0;
                        }
                        com.squareup.okhttp.internal.k.a(i1.c);
                    }
                    return;
                }
                try
                {
                    com.squareup.okhttp.internal.i.a().b(i1.c);
                }
                // Misplaced declaration of an exception variable
                catch (com.squareup.okhttp.j j1)
                {
                    com.squareup.okhttp.internal.i.a();
                    com.squareup.okhttp.internal.i.a((new StringBuilder("Unable to untagSocket(): ")).append(j1).toString());
                    com.squareup.okhttp.internal.k.a(i1.c);
                    return;
                }
                j1;
                JVM INSTR monitorenter ;
                j1.a(i1);
                i1.j = i1.j + 1;
                if (i1.f != null)
                {
                    throw new IllegalStateException("framedConnection != null");
                }
                break MISSING_BLOCK_LABEL_110;
                i1;
                j1;
                JVM INSTR monitorexit ;
                throw i1;
                i1.h = System.nanoTime();
                j1;
                JVM INSTR monitorexit ;
            }

            public final void a(com.squareup.okhttp.k k1, SSLSocket sslsocket, boolean flag)
            {
                String as[] = null;
                if (k1.e != null)
                {
                    as = sslsocket.getEnabledCipherSuites();
                    as = (String[])com.squareup.okhttp.internal.k.a(java/lang/String, k1.e, as);
                }
                if (flag && Arrays.asList(sslsocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV"))
                {
                    String as1[];
                    if (as == null)
                    {
                        as = sslsocket.getEnabledCipherSuites();
                    }
                    as1 = new String[as.length + 1];
                    System.arraycopy(as, 0, as1, 0, as.length);
                    as1[as1.length - 1] = "TLS_FALLBACK_SCSV";
                    as = as1;
                }
                as1 = sslsocket.getEnabledProtocols();
                as1 = (String[])com.squareup.okhttp.internal.k.a(java/lang/String, k1.f, as1);
                k1 = (new k.a(k1)).a(as).b(as1).b();
                sslsocket.setEnabledProtocols(k1.f);
                k1 = k1.e;
                if (k1 != null)
                {
                    sslsocket.setEnabledCipherSuites(k1);
                }
            }

            public final void a(o.a a1, String s1)
            {
                a1.a(s1);
            }

            public final void a(s s1, com.squareup.okhttp.i i1, h h1, t t1)
                throws RouteException
            {
                i1.a(h1);
                if (i1.d) goto _L2; else goto _L1
_L1:
                a a1;
                Proxy proxy;
                com.squareup.okhttp.a a2;
                int k1;
                int l1;
                int i2;
                boolean flag1;
                List list = i1.b.a.j;
                k1 = s1.w;
                l1 = s1.x;
                i2 = s1.y;
                flag1 = s1.v;
                if (i1.d)
                {
                    throw new IllegalStateException("already connected");
                }
                Object obj = null;
                a1 = new a(list);
                proxy = i1.b.b;
                a2 = i1.b.a;
                h1 = obj;
                if (i1.b.a.e == null)
                {
                    h1 = obj;
                    if (!list.contains(com.squareup.okhttp.k.c))
                    {
                        throw new RouteException(new UnknownServiceException((new StringBuilder("CLEARTEXT communication not supported: ")).append(list).toString()));
                    }
                }
                  goto _L3
_L9:
                Object obj1 = new Socket(proxy);
_L10:
                i1.c = ((Socket) (obj1));
                i1.c.setSoTimeout(l1);
                com.squareup.okhttp.internal.i.a().a(i1.c, i1.b.c, k1);
                if (i1.b.a.e != null)
                {
                    i1.a(l1, i2, t1, a1);
                }
                if (i1.g != com.squareup.okhttp.Protocol.c && i1.g != com.squareup.okhttp.Protocol.d) goto _L5; else goto _L4
_L4:
                int j1;
                i1.c.setSoTimeout(0);
                obj1 = new com.squareup.okhttp.internal.framed.c.a(i1.b.a.b, i1.c);
                obj1.d = i1.g;
                i1.f = new c(((com.squareup.okhttp.internal.framed.c.a) (obj1)), (byte)0);
                obj1 = i1.f;
                ((c) (obj1)).i.a();
                ((c) (obj1)).i.b(((c) (obj1)).e);
                j1 = ((c) (obj1)).e.b();
                if (j1 == 0x10000)
                {
                    break MISSING_BLOCK_LABEL_374;
                }
                ((c) (obj1)).i.a(0, j1 - 0x10000);
_L11:
                i1.d = true;
_L3:
                if (i1.d) goto _L7; else goto _L6
_L6:
                if (proxy.type() != java.net.Proxy.Type.DIRECT && proxy.type() != java.net.Proxy.Type.HTTP) goto _L9; else goto _L8
_L8:
                obj1 = a2.d.createSocket();
                  goto _L10
_L5:
                i1.e = new f(i1.a, i1, i1.c);
                  goto _L11
                IOException ioexception;
                ioexception;
                com.squareup.okhttp.internal.k.a(i1.c);
                i1.c = null;
                Object obj2;
                boolean flag;
                if (h1 == null)
                {
                    obj2 = new RouteException(ioexception);
                } else
                {
                    RouteException.a(ioexception, ((RouteException) (h1)).a);
                    h1.a = ioexception;
                    obj2 = h1;
                }
                if (!flag1)
                {
                    break; /* Loop/switch isn't completed */
                }
                a1.b = true;
                if (!(ioexception instanceof ProtocolException) && !(ioexception instanceof InterruptedIOException) && (!(ioexception instanceof SSLHandshakeException) || !(ioexception.getCause() instanceof CertificateException)) && !(ioexception instanceof SSLPeerUnverifiedException) && ((ioexception instanceof SSLHandshakeException) || (ioexception instanceof SSLProtocolException)) && a1.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                h1 = ((h) (obj2));
                if (flag) goto _L3; else goto _L12
_L12:
                throw obj2;
_L7:
                if (!i1.e()) goto _L14; else goto _L13
_L13:
                h1 = s1.r;
                if (!i1.e())
                {
                    throw new IllegalArgumentException();
                }
                if (!i1.b()) goto _L14; else goto _L15
_L15:
                h1;
                JVM INSTR monitorenter ;
                h1.a(i1);
                h1;
                JVM INSTR monitorexit ;
_L14:
                s1.c.b(i1.b);
_L2:
                flag = s1.x;
                k1 = s1.y;
                if (!i1.d)
                {
                    throw new IllegalStateException("setTimeouts - not connected");
                }
                break MISSING_BLOCK_LABEL_681;
                s1;
                h1;
                JVM INSTR monitorexit ;
                throw s1;
                if (i1.e == null)
                {
                    break MISSING_BLOCK_LABEL_708;
                }
                i1.c.setSoTimeout(flag);
                i1.e.a(flag, k1);
                return;
                s1;
                throw new RouteException(s1);
                  goto _L10
            }

            public final boolean a(com.squareup.okhttp.i i1)
            {
                return i1.a();
            }

            public final int b(com.squareup.okhttp.i i1)
            {
                return i1.j;
            }

            public final com.squareup.okhttp.i b(com.squareup.okhttp.e e1)
            {
                return e1.e.c;
            }

            public final j b(s s1)
            {
                return s1.c;
            }

            public final void b(com.squareup.okhttp.i i1, h h1)
            {
                i1.a(h1);
            }

            public final void b(com.squareup.okhttp.i i1, Object obj)
            {
                i1.a(obj);
            }

            public final g c(s s1)
            {
                return com.squareup.okhttp.s.a(s1);
            }

            public final boolean c(com.squareup.okhttp.i i1)
            {
                if (i1.e != null)
                {
                    return i1.e.b();
                } else
                {
                    return true;
                }
            }

            public final okio.e d(com.squareup.okhttp.i i1)
            {
                if (i1.e == null)
                {
                    throw new UnsupportedOperationException();
                } else
                {
                    return i1.e.c;
                }
            }

            public final okio.d e(com.squareup.okhttp.i i1)
            {
                if (i1.e == null)
                {
                    throw new UnsupportedOperationException();
                } else
                {
                    return i1.e.d;
                }
            }

        };
    }
}
