// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.k;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            c, e, f, d, 
//            HttpMethod, HttpRequest

public final class b
    implements c
{

    private final k a;
    private d b;
    private SSLSocketFactory c;
    private boolean d;

    public b()
    {
        this(((k) (new io.fabric.sdk.android.b((byte)0))));
    }

    public b(k k1)
    {
        a = k1;
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
            new e(new f(((d) (obj)).a(), ((d) (obj)).b()), ((d) (obj)))
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

    public final HttpRequest a(HttpMethod httpmethod, String s, Map map)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[HttpMethod.values().length];
                try
                {
                    a[HttpMethod.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[HttpMethod.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[HttpMethod.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[HttpMethod.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[httpmethod.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 112
    //                   3 121
    //                   4 129;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_129;
_L1:
        throw new IllegalArgumentException("Unsupported HTTP method!");
_L2:
        httpmethod = HttpRequest.a(s, map);
_L6:
        boolean flag;
        if (s != null && s.toLowerCase(Locale.US).startsWith("https"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && b != null)
        {
            s = b();
            if (s != null)
            {
                ((HttpsURLConnection)httpmethod.a()).setSSLSocketFactory(s);
            }
        }
        return httpmethod;
_L3:
        httpmethod = HttpRequest.b(s, map);
          goto _L6
_L4:
        httpmethod = HttpRequest.a(s);
          goto _L6
        httpmethod = HttpRequest.b(s);
          goto _L6
    }

    public final void a(d d1)
    {
        if (b != d1)
        {
            b = d1;
            a();
        }
    }
}
