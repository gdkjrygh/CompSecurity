// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.os.Handler;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeSDKPlayerInterface;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.yume.android.player:
//            B, u, v, w, 
//            m, ag, YuMePlayerInterfaceImpl, G, 
//            x

final class t
{

    B a;
    private DefaultHttpClient b;
    private volatile HashMap c;
    private volatile ArrayList d;
    private int e;
    private String f;
    private w g;
    private Handler h;
    private Handler i;

    public t()
    {
        a = B.a();
        c = null;
        d = null;
        e = 8;
        f = null;
        g = null;
        h = new u(this);
        i = new v(this);
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, "ISO-8859-1");
        HttpProtocolParams.setUseExpectContinue(basichttpparams, true);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
        sslsocketfactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        schemeregistry.register(new Scheme("https", sslsocketfactory, 443));
        b = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        g = new w(this);
        b.setRedirectHandler(g);
    }

    private m a(String s, Handler handler, int j)
    {
        s = new m(s);
        s.a(handler);
        s.a(b);
        s.a(b());
        s.a(j);
        return s;
    }

    private static boolean a(HashMap hashmap, String s)
    {
        if (hashmap == null)
        {
            return false;
        }
        return (m)hashmap.get(s) != null;
    }

    private String b()
    {
        if (!ag.a(f) && !ag.a(f))
        {
            try
            {
                f = YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_GetUserAgent();
                a.b((new StringBuilder("User Agent received from SDK: ")).append(f).toString());
            }
            catch (YuMeException yumeexception)
            {
                yumeexception.printStackTrace();
            }
        }
        return f;
    }

    private void b(m m1)
    {
        String s = m1.b();
        if (c == null)
        {
            c = new HashMap();
        }
        if (c != null)
        {
            c.put(s, m1);
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        if (d != null)
        {
            d.add(s);
        }
    }

    public final void a()
    {
        ClientConnectionManager clientconnectionmanager;
        if (b != null)
        {
            clientconnectionmanager = b.getConnectionManager();
        } else
        {
            clientconnectionmanager = null;
        }
        if (clientconnectionmanager != null)
        {
            clientconnectionmanager.shutdown();
        }
        b = null;
        c = null;
        d = null;
        g = null;
    }

    final void a(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        m1 = m1.b();
        if (c != null)
        {
            c.remove(m1);
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        j = d.indexOf(m1);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        d.set(j, null);
        if (c != null && c.size() == 0)
        {
            c = null;
            d = null;
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        m1.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        m1;
        throw m1;
    }

    public final void a(String s, G g1)
    {
        if (ag.a(s) && !a(c, s))
        {
            a.b((new StringBuilder("Fetching Overlay: ")).append(ag.e(s)).toString());
            s = a(s, i, e);
            if (s != null)
            {
                s.b = g1;
                b(s);
                s.a();
                return;
            }
        }
    }

    public final void a(String s, x x)
    {
        if (ag.a(s) && !a(c, s))
        {
            a.b((new StringBuilder("Using Remote Image Ad: ")).append(ag.e(s)).toString());
            s = a(s, h, e);
            if (s != null)
            {
                s.a = x;
                b(s);
                s.a();
                return;
            }
        }
    }
}
