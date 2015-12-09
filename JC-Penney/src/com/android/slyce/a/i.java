// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;
import com.android.slyce.a.a.f;
import com.android.slyce.a.a.h;
import com.android.slyce.a.e.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.android.slyce.a:
//            h, j, aj, n, 
//            ah, l, m, ag, 
//            k, p, g, o, 
//            r, bp

public class i
    implements a, com.android.slyce.a.h
{

    static SSLContext a;
    static final boolean t;
    ag b;
    ah c;
    boolean d;
    SSLEngine e;
    boolean f;
    HostnameVerifier g;
    p h;
    X509Certificate i[];
    h j;
    e k;
    TrustManager l[];
    boolean m;
    boolean n;
    Exception o;
    final aj p = new aj();
    final e q = new n(this);
    aj r;
    com.android.slyce.a.a.a s;
    private int u;
    private String v;
    private boolean w;

    private i(ag ag1, String s1, int i1, SSLEngine sslengine, TrustManager atrustmanager[], HostnameVerifier hostnameverifier, boolean flag)
    {
        r = new aj();
        b = ag1;
        g = hostnameverifier;
        m = flag;
        l = atrustmanager;
        e = sslengine;
        v = s1;
        u = i1;
        e.setUseClientMode(flag);
        c = new ah(ag1);
        c.a(new l(this));
        b.b(new m(this));
        b.a(q);
    }

    public static void a(ag ag1, String s1, int i1, SSLEngine sslengine, TrustManager atrustmanager[], HostnameVerifier hostnameverifier, boolean flag, p p1)
    {
        s1 = new i(ag1, s1, i1, sslengine, atrustmanager, hostnameverifier, flag);
        s1.h = p1;
        ag1.a(new k(p1));
        try
        {
            ((i) (s1)).e.beginHandshake();
            s1.a(((i) (s1)).e.getHandshakeStatus());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            s1.a(((Exception) (ag1)));
        }
    }

    static void a(i i1, Exception exception)
    {
        i1.a(exception);
    }

    static void a(i i1, javax.net.ssl.SSLEngineResult.HandshakeStatus handshakestatus)
    {
        i1.a(handshakestatus);
    }

    private void a(Exception exception)
    {
        p p1 = h;
        if (p1 != null)
        {
            h = null;
            b.a(new f());
            b.a();
            b.d();
            p1.a(exception, null);
        } else
        {
            com.android.slyce.a.a.a a1 = h();
            if (a1 != null)
            {
                a1.a(exception);
                return;
            }
        }
    }

    private void a(javax.net.ssl.SSLEngineResult.HandshakeStatus handshakestatus)
    {
        if (handshakestatus == javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK)
        {
            e.getDelegatedTask().run();
        }
        if (handshakestatus == javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP)
        {
            a(r);
        }
        if (handshakestatus == javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP)
        {
            q.a(this, new aj());
        }
        if (f || e.getHandshakeStatus() != javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && e.getHandshakeStatus() != javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED) goto _L2; else goto _L1
_L1:
        if (!m) goto _L4; else goto _L3
_L3:
        TrustManager atrustmanager[] = l;
        if (atrustmanager != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        handshakestatus = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        handshakestatus.init((KeyStore)null);
        atrustmanager = handshakestatus.getTrustManagers();
        int j1 = atrustmanager.length;
        int i1;
        i1 = 0;
        handshakestatus = null;
_L11:
        Object obj;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        obj = atrustmanager[i1];
        obj = (X509TrustManager)obj;
        i = (X509Certificate[])(X509Certificate[])e.getSession().getPeerCertificates();
        ((X509TrustManager) (obj)).checkServerTrusted(i, "SSL");
        if (v == null) goto _L6; else goto _L5
_L5:
        if (g != null) goto _L8; else goto _L7
_L7:
        (new StrictHostnameVerifier()).verify(v, StrictHostnameVerifier.getCNs(i[0]), StrictHostnameVerifier.getDNSSubjectAlts(i[0]));
_L6:
        i1 = 1;
_L13:
        try
        {
            f = true;
        }
        // Misplaced declaration of an exception variable
        catch (javax.net.ssl.SSLEngineResult.HandshakeStatus handshakestatus)
        {
            throw new RuntimeException(handshakestatus);
        }
        // Misplaced declaration of an exception variable
        catch (javax.net.ssl.SSLEngineResult.HandshakeStatus handshakestatus)
        {
            a(((Exception) (handshakestatus)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (javax.net.ssl.SSLEngineResult.HandshakeStatus handshakestatus)
        {
            a(((Exception) (handshakestatus)));
            return;
        }
        if (i1 != 0) goto _L10; else goto _L9
_L9:
        handshakestatus = new g(handshakestatus);
        a(((Exception) (handshakestatus)));
        if (!handshakestatus.a())
        {
            throw handshakestatus;
        }
          goto _L10
_L8:
        g.verify(v, e.getSession());
          goto _L6
        handshakestatus;
_L12:
        i1++;
          goto _L11
_L4:
        f = true;
_L10:
        h.a(null, this);
        h = null;
        b.a(null);
        l().a(new o(this));
        e();
_L2:
        return;
        handshakestatus;
          goto _L12
        i1 = 0;
          goto _L13
    }

    public static SSLContext c()
    {
        return a;
    }

    int a(int i1)
    {
        int j1 = (i1 * 3) / 2;
        i1 = j1;
        if (j1 == 0)
        {
            i1 = 8192;
        }
        return i1;
    }

    public void a()
    {
        b.a();
    }

    public void a(com.android.slyce.a.a.a a1)
    {
        b.a(a1);
    }

    public void a(e e1)
    {
        k = e1;
    }

    public void a(h h1)
    {
        j = h1;
    }

    public void a(aj aj1)
    {
        ByteBuffer bytebuffer;
        SSLEngineResult sslengineresult;
        while (w || c.c() > 0) 
        {
            return;
        }
        w = true;
        bytebuffer = aj.c(a(aj1.d()));
        sslengineresult = null;
_L9:
        if (!f || aj1.d() != 0) goto _L2; else goto _L1
_L1:
        ByteBuffer bytebuffer1 = bytebuffer;
_L7:
        w = false;
        aj.c(bytebuffer1);
        return;
_L2:
        SSLEngineResult sslengineresult1;
        int i1;
        i1 = aj1.d();
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        ByteBuffer abytebuffer[] = aj1.b();
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        sslengineresult = e.wrap(abytebuffer, bytebuffer);
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        aj1.a(abytebuffer);
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        bytebuffer.flip();
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        r.a(bytebuffer);
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        if (t) goto _L4; else goto _L3
_L3:
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        if (!r.e()) goto _L4; else goto _L5
_L5:
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        throw new AssertionError();
        SSLException sslexception;
        sslexception;
        sslengineresult = sslengineresult1;
        bytebuffer = bytebuffer1;
_L11:
        a(((Exception) (sslexception)));
_L10:
        if (i1 != aj1.d())
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer1 = bytebuffer;
        if (sslengineresult == null) goto _L7; else goto _L6
_L6:
        bytebuffer1 = bytebuffer;
        if (sslengineresult.getHandshakeStatus() != javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP) goto _L7; else goto _L8
_L8:
        bytebuffer1 = bytebuffer;
        if (c.c() != 0) goto _L7; else goto _L9
_L4:
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        if (r.d() <= 0)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        c.a(r);
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        int j1 = bytebuffer.capacity();
        if (sslengineresult.getStatus() != javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        bytebuffer = aj.c(j1 * 2);
        i1 = -1;
          goto _L10
        bytebuffer = aj.c(a(aj1.d()));
        bytebuffer1 = bytebuffer;
        sslengineresult1 = sslengineresult;
        a(sslengineresult.getHandshakeStatus());
          goto _L10
        sslexception;
        bytebuffer = null;
          goto _L11
    }

    void a(aj aj1, ByteBuffer bytebuffer)
    {
        bytebuffer.flip();
        if (bytebuffer.hasRemaining())
        {
            aj1.a(bytebuffer);
            return;
        } else
        {
            aj.c(bytebuffer);
            return;
        }
    }

    public SSLEngine b()
    {
        return e;
    }

    public void b(com.android.slyce.a.a.a a1)
    {
        s = a1;
    }

    public void d()
    {
        b.d();
    }

    public void e()
    {
        com.android.slyce.a.bp.a(this, p);
        if (n && !p.e() && s != null)
        {
            s.a(o);
        }
    }

    public e f()
    {
        return k;
    }

    public h g()
    {
        return j;
    }

    public com.android.slyce.a.a.a h()
    {
        return s;
    }

    public boolean i()
    {
        return b.i();
    }

    public void j()
    {
        b.j();
        e();
    }

    public boolean k()
    {
        return b.k();
    }

    public r l()
    {
        return b.l();
    }

    static 
    {
        Exception exception;
        boolean flag = true;
        j j1;
        if (com/android/slyce/a/i.desiredAssertionStatus())
        {
            flag = false;
        }
        t = flag;
        if (android.os.Build.VERSION.SDK_INT <= 15)
        {
            throw new Exception();
        }
        try
        {
            a = SSLContext.getInstance("Default");
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            try
            {
                a = SSLContext.getInstance("TLS");
                j1 = new j();
                a.init(null, new TrustManager[] {
                    j1
                }, null);
            }
            catch (Exception exception1)
            {
                exception.printStackTrace();
                exception1.printStackTrace();
            }
        }
    }
}
