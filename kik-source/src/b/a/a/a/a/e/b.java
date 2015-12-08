// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import b.a.a.a.c;
import b.a.a.a.o;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package b.a.a.a.a.e:
//            g, i, j, h, 
//            d, c

public final class b
    implements g
{

    private final o a;
    private h b;
    private SSLSocketFactory c;
    private boolean d;

    public b()
    {
        this(((o) (new c((byte)0))));
    }

    public b(o o1)
    {
        a = o1;
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
        SSLSocketFactory sslsocketfactory = null;
        this;
        JVM INSTR monitorenter ;
        d = true;
        Object obj;
        obj = b;
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] {
            new i(new j(((h) (obj)).a(), ((h) (obj)).b()), ((h) (obj)))
        }, null);
        obj = sslcontext.getSocketFactory();
        sslsocketfactory = ((SSLSocketFactory) (obj));
_L2:
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception1;
        exception1;
        a.b("Fabric", "Exception while validating pinned certs", exception1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public final d a(int k, String s, Map map)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.a.a.a.a.e.c.a().length];
                try
                {
                    a[c.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[c.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.a.a.a.a.e.c.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.d - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[k - 1];
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
        map = b.a.a.a.a.e.d.a(s, map);
_L6:
        if (s != null && s.toLowerCase(Locale.US).startsWith("https"))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0 && b != null)
        {
            s = b();
            if (s != null)
            {
                ((HttpsURLConnection)map.a()).setSSLSocketFactory(s);
            }
        }
        return map;
_L3:
        map = b.a.a.a.a.e.d.b(s, map);
          goto _L6
_L4:
        map = b.a.a.a.a.e.d.a(s);
          goto _L6
        map = b.a.a.a.a.e.d.b(s);
          goto _L6
    }

    public final void a(h h1)
    {
        if (b != h1)
        {
            b = h1;
            a();
        }
    }
}
