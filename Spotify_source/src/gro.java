// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.http.RouteException;
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

public class gro
    implements Cloneable
{

    private static final List w;
    private static final List x;
    private static SSLSocketFactory y;
    private gsi A;
    final gso a;
    gre b;
    public Proxy c;
    public List d;
    public List e;
    final List f;
    public final List g;
    public ProxySelector h;
    public CookieHandler i;
    gsg j;
    public SocketFactory k;
    public SSLSocketFactory l;
    public HostnameVerifier m;
    public gqw n;
    public gql o;
    public gra p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    int v;
    private gqm z;

    public gro()
    {
        f = new ArrayList();
        g = new ArrayList();
        q = true;
        r = true;
        s = true;
        t = 10000;
        u = 10000;
        v = 10000;
        a = new gso();
        b = new gre();
    }

    private gro(gro gro1)
    {
        f = new ArrayList();
        g = new ArrayList();
        q = true;
        r = true;
        s = true;
        t = 10000;
        u = 10000;
        v = 10000;
        a = gro1.a;
        b = gro1.b;
        c = gro1.c;
        d = gro1.d;
        e = gro1.e;
        f.addAll(gro1.f);
        g.addAll(gro1.g);
        h = gro1.h;
        i = gro1.i;
        z = gro1.z;
        gsg gsg;
        if (z != null)
        {
            gsg = z.a;
        } else
        {
            gsg = gro1.j;
        }
        j = gsg;
        k = gro1.k;
        l = gro1.l;
        m = gro1.m;
        n = gro1.n;
        o = gro1.o;
        p = gro1.p;
        A = gro1.A;
        q = gro1.q;
        r = gro1.r;
        s = gro1.s;
        t = gro1.t;
        u = gro1.u;
        v = gro1.v;
    }

    static gsi a(gro gro1)
    {
        return gro1.A;
    }

    private SSLSocketFactory d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = y;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, null, null);
        y = ((SSLContext) (obj)).getSocketFactory();
        obj = y;
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

    public final gqs a(grq grq)
    {
        return new gqs(this, grq);
    }

    public final gro a(gqm gqm1)
    {
        z = gqm1;
        j = null;
        return this;
    }

    public final List a()
    {
        return f;
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
            t = (int)l2;
            return;
        }
    }

    public final void a(TimeUnit timeunit)
    {
        if (20000L < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        long l1 = timeunit.toMillis(20000L);
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l1 == 0L && 20000L > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        } else
        {
            v = (int)l1;
            return;
        }
    }

    final gro b()
    {
        gro gro1 = new gro(this);
        if (gro1.h == null)
        {
            gro1.h = ProxySelector.getDefault();
        }
        if (gro1.i == null)
        {
            gro1.i = CookieHandler.getDefault();
        }
        if (gro1.k == null)
        {
            gro1.k = SocketFactory.getDefault();
        }
        if (gro1.l == null)
        {
            gro1.l = d();
        }
        if (gro1.m == null)
        {
            gro1.m = guy.a;
        }
        if (gro1.n == null)
        {
            gro1.n = gqw.a;
        }
        if (gro1.o == null)
        {
            gro1.o = gtu.a;
        }
        if (gro1.p == null)
        {
            gro1.p = gra.a();
        }
        if (gro1.d == null)
        {
            gro1.d = w;
        }
        if (gro1.e == null)
        {
            gro1.e = x;
        }
        if (gro1.A == null)
        {
            gro1.A = gsi.a;
        }
        return gro1;
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
            u = (int)l2;
            return;
        }
    }

    public final gro c()
    {
        return new gro(this);
    }

    public Object clone()
    {
        return c();
    }

    static 
    {
        w = gsp.a(new Protocol[] {
            Protocol.d, Protocol.c, Protocol.b
        });
        x = gsp.a(new grb[] {
            grb.a, grb.b, grb.c
        });
        gsf.b = new gsf() {

            public final gsg a(gro gro1)
            {
                return gro1.j;
            }

            public final gus a(gqz gqz1, gui gui)
            {
                if (gqz1.f != null)
                {
                    return new gty(gui, gqz1.f);
                } else
                {
                    return new gul(gui, gqz1.e);
                }
            }

            public final void a(gqz gqz1, Protocol protocol)
            {
                if (protocol == null)
                {
                    throw new IllegalArgumentException("protocol == null");
                } else
                {
                    gqz1.g = protocol;
                    return;
                }
            }

            public final void a(gqz gqz1, Object obj)
            {
label0:
                {
                    if (gqz1.e())
                    {
                        throw new IllegalStateException();
                    }
                    synchronized (gqz1.a)
                    {
                        if (gqz1.k == obj)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                gqz1.k = null;
                gra1;
                JVM INSTR monitorexit ;
                if (gqz1.c != null)
                {
                    gqz1.c.close();
                    return;
                } else
                {
                    return;
                }
                gqz1;
                gra1;
                JVM INSTR monitorexit ;
                throw gqz1;
            }

            public final void a(gra gra1, gqz gqz1)
            {
label0:
                {
                    if (!gqz1.e() && gqz1.a())
                    {
                        if (gqz1.b())
                        {
                            break label0;
                        }
                        gsp.a(gqz1.c);
                    }
                    return;
                }
                try
                {
                    gsk.a().b(gqz1.c);
                }
                // Misplaced declaration of an exception variable
                catch (gra gra1)
                {
                    gsk.a();
                    gsk.a((new StringBuilder("Unable to untagSocket(): ")).append(gra1).toString());
                    gsp.a(gqz1.c);
                    return;
                }
                gra1;
                JVM INSTR monitorenter ;
                gra1.a(gqz1);
                gqz1.j = gqz1.j + 1;
                if (gqz1.f != null)
                {
                    throw new IllegalStateException("framedConnection != null");
                }
                break MISSING_BLOCK_LABEL_110;
                gqz1;
                gra1;
                JVM INSTR monitorexit ;
                throw gqz1;
                gqz1.h = System.nanoTime();
                gra1;
                JVM INSTR monitorexit ;
            }

            public final void a(grb grb1, SSLSocket sslsocket, boolean flag)
            {
                String as[] = null;
                if (grb1.e != null)
                {
                    as = sslsocket.getEnabledCipherSuites();
                    as = (String[])gsp.a(java/lang/String, grb1.e, as);
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
                as1 = (String[])gsp.a(java/lang/String, grb1.f, as1);
                grb1 = (new grc(grb1)).a(as).b(as1).b();
                sslsocket.setEnabledProtocols(grb1.f);
                grb1 = grb1.e;
                if (grb1 != null)
                {
                    sslsocket.setEnabledCipherSuites(grb1);
                }
            }

            public final void a(gri gri1, String s1)
            {
                gri1.a(s1);
            }

            public final void a(gro gro1, gqz gqz1, gui gui, grq grq)
            {
                gqz1.a(gui);
                if (gqz1.d) goto _L2; else goto _L1
_L1:
                grz grz1;
                Proxy proxy;
                gqk gqk1;
                int j1;
                int k1;
                int l1;
                boolean flag1;
                List list = gqz1.b.a.j;
                j1 = gro1.t;
                k1 = gro1.u;
                l1 = gro1.v;
                flag1 = gro1.s;
                if (gqz1.d)
                {
                    throw new IllegalStateException("already connected");
                }
                Object obj = null;
                grz1 = new grz(list);
                proxy = gqz1.b.b;
                gqk1 = gqz1.b.a;
                gui = obj;
                if (gqz1.b.a.e == null)
                {
                    gui = obj;
                    if (!list.contains(grb.c))
                    {
                        throw new RouteException(new UnknownServiceException((new StringBuilder("CLEARTEXT communication not supported: ")).append(list).toString()));
                    }
                }
                  goto _L3
_L9:
                Object obj1 = new Socket(proxy);
_L10:
                gqz1.c = ((Socket) (obj1));
                gqz1.c.setSoTimeout(k1);
                gsk.a().a(gqz1.c, gqz1.b.c, j1);
                if (gqz1.b.a.e != null)
                {
                    gqz1.a(k1, l1, grq, grz1);
                }
                if (gqz1.g != Protocol.c && gqz1.g != Protocol.d) goto _L5; else goto _L4
_L4:
                int i1;
                gqz1.c.setSoTimeout(0);
                obj1 = new gsu(gqz1.b.a.b, gqz1.c);
                obj1.d = gqz1.g;
                gqz1.f = new gst(((gsu) (obj1)), (byte)0);
                obj1 = gqz1.f;
                ((gst) (obj1)).i.a();
                ((gst) (obj1)).i.b(((gst) (obj1)).e);
                i1 = ((gst) (obj1)).e.b();
                if (i1 == 0x10000)
                {
                    break MISSING_BLOCK_LABEL_373;
                }
                ((gst) (obj1)).i.a(0, i1 - 0x10000);
_L11:
                gqz1.d = true;
_L3:
                if (gqz1.d) goto _L7; else goto _L6
_L6:
                if (proxy.type() != java.net.Proxy.Type.DIRECT && proxy.type() != java.net.Proxy.Type.HTTP) goto _L9; else goto _L8
_L8:
                obj1 = gqk1.d.createSocket();
                  goto _L10
_L5:
                gqz1.e = new gua(gqz1.a, gqz1, gqz1.c);
                  goto _L11
                IOException ioexception;
                ioexception;
                gsp.a(gqz1.c);
                gqz1.c = null;
                Object obj2;
                boolean flag;
                if (gui == null)
                {
                    obj2 = new RouteException(ioexception);
                } else
                {
                    RouteException.a(ioexception, ((RouteException) (gui)).lastException);
                    gui.lastException = ioexception;
                    obj2 = gui;
                }
                if (!flag1)
                {
                    break; /* Loop/switch isn't completed */
                }
                grz1.b = true;
                if (!(ioexception instanceof ProtocolException) && !(ioexception instanceof InterruptedIOException) && (!(ioexception instanceof SSLHandshakeException) || !(ioexception.getCause() instanceof CertificateException)) && !(ioexception instanceof SSLPeerUnverifiedException) && ((ioexception instanceof SSLHandshakeException) || (ioexception instanceof SSLProtocolException)) && grz1.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gui = ((gui) (obj2));
                if (flag) goto _L3; else goto _L12
_L12:
                throw obj2;
_L7:
                if (!gqz1.e()) goto _L14; else goto _L13
_L13:
                gui = gro1.p;
                if (!gqz1.e())
                {
                    throw new IllegalArgumentException();
                }
                if (!gqz1.b()) goto _L14; else goto _L15
_L15:
                gui;
                JVM INSTR monitorenter ;
                gui.a(gqz1);
                gui;
                JVM INSTR monitorexit ;
_L14:
                gro1.a.b(gqz1.b);
_L2:
                flag = gro1.u;
                j1 = gro1.v;
                if (!gqz1.d)
                {
                    throw new IllegalStateException("setTimeouts - not connected");
                }
                break MISSING_BLOCK_LABEL_680;
                gro1;
                gui;
                JVM INSTR monitorexit ;
                throw gro1;
                if (gqz1.e == null)
                {
                    break MISSING_BLOCK_LABEL_707;
                }
                gqz1.c.setSoTimeout(flag);
                gqz1.e.a(flag, j1);
                return;
                gro1;
                throw new RouteException(gro1);
                  goto _L10
            }

            public final boolean a(gqz gqz1)
            {
                return gqz1.a();
            }

            public final int b(gqz gqz1)
            {
                return gqz1.j;
            }

            public final gso b(gro gro1)
            {
                return gro1.a;
            }

            public final void b(gqz gqz1, gui gui)
            {
                gqz1.a(gui);
            }

            public final gsi c(gro gro1)
            {
                return gro.a(gro1);
            }

            public final boolean c(gqz gqz1)
            {
                if (gqz1.e != null)
                {
                    return gqz1.e.b();
                } else
                {
                    return true;
                }
            }

        };
    }
}
