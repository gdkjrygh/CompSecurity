// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import b.a.a.a.e;
import b.a.a.a.q;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package b.a.a.a.a.e:
//            m, o, p, n, 
//            c, e

public final class b
    implements m
{

    private final q a;
    private n b;
    private SSLSocketFactory c;
    private boolean d;

    public b()
    {
        this(((q) (new e((byte)0))));
    }

    public b(q q1)
    {
        a = q1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = false;
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private SSLSocketFactory b()
    {
        this;
        JVM INSTR monitorenter ;
        SSLSocketFactory sslsocketfactory;
        if (c == null && !d)
        {
            c = c();
        }
        sslsocketfactory = c;
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception;
        exception;
        throw exception;
    }

    private SSLSocketFactory c()
    {
        this;
        JVM INSTR monitorenter ;
        d = true;
        Object obj;
        obj = b;
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] {
            new o(new p(((n) (obj)).a(), ((n) (obj)).b()), ((n) (obj)))
        }, null);
        obj = sslcontext.getSocketFactory();
        a.a("Fabric", "Custom SSL pinning enabled");
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((SSLSocketFactory) (obj));
        Object obj1;
        obj1;
        a.c("Fabric", "Exception while validating pinned certs", ((Throwable) (obj1)));
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public final b.a.a.a.a.e.e a(int i, String s, Map map)
    {
        c.a[i - 1];
        JVM INSTR tableswitch 1 4: default 36
    //                   1 46
    //                   2 106
    //                   3 115
    //                   4 123;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_123;
_L1:
        throw new IllegalArgumentException("Unsupported HTTP method!");
_L2:
        map = e.a(s, map);
_L6:
        if (s != null && s.toLowerCase(Locale.US).startsWith("https"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && b != null)
        {
            s = b();
            if (s != null)
            {
                ((HttpsURLConnection)map.a()).setSSLSocketFactory(s);
            }
        }
        return map;
_L3:
        map = e.b(s, map);
          goto _L6
_L4:
        map = e.a(s);
          goto _L6
        map = e.b(s);
          goto _L6
    }

    public final void a(n n1)
    {
        if (b != n1)
        {
            b = n1;
            a();
        }
    }
}
