// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Xw
    implements Cloneable
{

    static final List a;
    static final List b;
    private static SSLSocketFactory z;
    private Xf A;
    final XN c;
    Xp d;
    public Proxy e;
    public List f;
    public List g;
    public final List h;
    public final List i;
    public ProxySelector j;
    public CookieHandler k;
    XI l;
    public SocketFactory m;
    public SSLSocketFactory n;
    public HostnameVerifier o;
    public Xi p;
    public Xe q;
    public Xm r;
    XK s;
    public boolean t;
    public boolean u;
    public boolean v;
    int w;
    public int x;
    int y;

    public Xw()
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        c = new XN();
        d = new Xp();
    }

    Xw(Xw xw)
    {
        h = new ArrayList();
        i = new ArrayList();
        t = true;
        u = true;
        v = true;
        c = xw.c;
        d = xw.d;
        e = xw.e;
        f = xw.f;
        g = xw.g;
        h.addAll(xw.h);
        i.addAll(xw.i);
        j = xw.j;
        k = xw.k;
        A = xw.A;
        XI xi;
        if (A != null)
        {
            xi = A.a;
        } else
        {
            xi = xw.l;
        }
        l = xi;
        m = xw.m;
        n = xw.n;
        o = xw.o;
        p = xw.p;
        q = xw.q;
        r = xw.r;
        s = xw.s;
        t = xw.t;
        u = xw.u;
        v = xw.v;
        w = xw.w;
        x = xw.x;
        y = xw.y;
    }

    static XK a(Xw xw)
    {
        return xw.s;
    }

    public final Xf a()
    {
        return A;
    }

    public final Xh a(Xy xy)
    {
        return new Xh(this, xy);
    }

    public final Xw a(Xf xf)
    {
        A = xf;
        l = null;
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
            y = (int)l1;
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

    public final Xw c()
    {
        return new Xw(this);
    }

    public Object clone()
    {
        return c();
    }

    static 
    {
        a = XO.a(new Xx[] {
            Xx.d, Xx.c, Xx.b
        });
        b = XO.a(new Xn[] {
            Xn.a, Xn.b, Xn.c
        });
        XH.b = new XH() {

            public final XI a(Xw xw)
            {
                return xw.l;
            }

            public final Yi a(Xl xl, XV xv)
            {
                if (xl.f != null)
                {
                    return new Yg(xv, xl.f);
                } else
                {
                    return new XX(xv, xl.e);
                }
            }

            public final void a(Xl xl, Xx xx)
            {
                if (xx == null)
                {
                    throw new IllegalArgumentException("protocol == null");
                } else
                {
                    xl.g = xx;
                    return;
                }
            }

            public final void a(Xl xl, Object obj)
            {
label0:
                {
                    if (xl.e())
                    {
                        throw new IllegalStateException();
                    }
                    synchronized (xl.a)
                    {
                        if (xl.k == obj)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                xl.k = null;
                xm;
                JVM INSTR monitorexit ;
                xl.c.close();
                return;
                xl;
                xm;
                JVM INSTR monitorexit ;
                throw xl;
            }

            public final void a(Xm xm, Xl xl)
            {
label0:
                {
                    if (!xl.e() && xl.a())
                    {
                        if (xl.b())
                        {
                            break label0;
                        }
                        XO.a(xl.c);
                    }
                    return;
                }
                try
                {
                    XM.a().b(xl.c);
                }
                // Misplaced declaration of an exception variable
                catch (Xm xm)
                {
                    XM.a();
                    XM.a((new StringBuilder("Unable to untagSocket(): ")).append(xm).toString());
                    XO.a(xl.c);
                    return;
                }
                xm;
                JVM INSTR monitorenter ;
                xm.a(xl);
                xl.j = xl.j + 1;
                if (xl.f != null)
                {
                    throw new IllegalStateException("spdyConnection != null");
                }
                break MISSING_BLOCK_LABEL_110;
                xl;
                xm;
                JVM INSTR monitorexit ;
                throw xl;
                xl.h = System.nanoTime();
                xm;
                JVM INSTR monitorexit ;
            }

            public final void a(Xn xn, SSLSocket sslsocket, boolean flag)
            {
                String as[] = null;
                if (xn.e != null)
                {
                    as = sslsocket.getEnabledCipherSuites();
                    as = (String[])XO.a(java/lang/String, xn.e, as);
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
                as1 = (String[])XO.a(java/lang/String, xn.f, as1);
                xn = (new Xn.a(xn)).a(as).b(as1).b();
                sslsocket.setEnabledProtocols(xn.f);
                xn = xn.e;
                if (xn != null)
                {
                    sslsocket.setEnabledCipherSuites(xn);
                }
            }

            public final void a(Xr.a a1, String s1)
            {
                a1.a(s1);
            }

            public final void a(Xw xw, Xl xl, XV xv, Xy xy)
            {
                xl.a(xv);
                if (xl.d)
                {
                    break MISSING_BLOCK_LABEL_442;
                }
                xv = xl.b.a.j;
                int i1 = xw.w;
                int k1 = xw.x;
                int i2 = xw.y;
                boolean flag = xw.v;
                if (xl.d)
                {
                    throw new IllegalStateException("already connected");
                }
                Yf yf = new Yf(xl, xl.a);
                if (xl.b.a.e != null)
                {
                    xv = yf.a(i1, k1, i2, xy, xl.b, xv, flag);
                } else
                {
                    if (!xv.contains(Xn.c))
                    {
                        throw new Yd(new UnknownServiceException((new StringBuilder("CLEARTEXT communication not supported: ")).append(xv).toString()));
                    }
                    xv = new Yf.a(Yf.a(k1, i1, xl.b));
                }
                xl.c = ((Yf.a) (xv)).a;
                xl.i = ((Yf.a) (xv)).c;
                if (((Yf.a) (xv)).b == null)
                {
                    xv = Xx.b;
                } else
                {
                    xv = ((Yf.a) (xv)).b;
                }
                xl.g = xv;
                if (xl.g != Xx.c && xl.g != Xx.d) goto _L2; else goto _L1
_L1:
                xl.c.setSoTimeout(0);
                xv = new Yy.a(xl.b.a.b, xl.c);
                xv.d = xl.g;
                xl.f = new Yy(xv, (byte)0);
                xv = xl.f;
                ((Yy) (xv)).i.a();
                ((Yy) (xv)).i.b(((Yy) (xv)).e);
                i1 = ((Yy) (xv)).e.b();
                if (i1 != 0x10000)
                {
                    try
                    {
                        ((Yy) (xv)).i.a(0, i1 - 0x10000);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Xw xw)
                    {
                        throw new Yd(xw);
                    }
                }
                xl.d = true;
                if (!xl.e()) goto _L4; else goto _L3
_L3:
                xv = xw.r;
                if (!xl.e())
                {
                    throw new IllegalArgumentException();
                }
                  goto _L5
_L2:
                xl.e = new XT(xl.a, xl, xl.c);
                break MISSING_BLOCK_LABEL_276;
_L5:
                if (!xl.b()) goto _L4; else goto _L6
_L6:
                xv;
                JVM INSTR monitorenter ;
                xv.a(xl);
                xv;
                JVM INSTR monitorexit ;
_L4:
                xw.c.b(xl.b);
                int j1;
                int l1;
                j1 = xw.x;
                l1 = xw.y;
                if (!xl.d)
                {
                    throw new IllegalStateException("setTimeouts - not connected");
                }
                break MISSING_BLOCK_LABEL_477;
                xw;
                xv;
                JVM INSTR monitorexit ;
                throw xw;
                if (xl.e != null)
                {
                    try
                    {
                        xl.c.setSoTimeout(j1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Xw xw)
                    {
                        throw new Yd(xw);
                    }
                    xl.e.a(j1, l1);
                }
                return;
            }

            public final boolean a(Xl xl)
            {
                return xl.a();
            }

            public final int b(Xl xl)
            {
                return xl.j;
            }

            public final XN b(Xw xw)
            {
                return xw.c;
            }

            public final void b(Xl xl, XV xv)
            {
                xl.a(xv);
            }

            public final XK c(Xw xw)
            {
                return Xw.a(xw);
            }

            public final boolean c(Xl xl)
            {
                if (xl.e != null)
                {
                    return xl.e.b();
                } else
                {
                    return true;
                }
            }

        };
    }
}
