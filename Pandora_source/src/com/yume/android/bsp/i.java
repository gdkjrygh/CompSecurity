// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.yume.android.sdk.YuMeSDKBSPInterface;
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
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.json.JSONObject;

// Referenced classes of package com.yume.android.bsp:
//            p, j, k, YuMeBSPInterfaceImpl, 
//            c, o, f, g, 
//            r, a, h, b, 
//            l

final class i
{

    p a;
    volatile HashMap b;
    c c;
    Handler d;
    Handler e;
    private DefaultHttpClient f;
    private HttpContext g;
    private o h;
    private String i;

    public i()
    {
        a = p.a();
        b = null;
        g = null;
        c = null;
        h = null;
        i = null;
        d = new j(this);
        e = new k(this);
        Object obj = YuMeBSPInterfaceImpl.a.YuMeSDKBSP_GetApplicationContext();
        if (obj != null)
        {
            c = new c(((Context) (obj)));
            if (c != null)
            {
                g = new BasicHttpContext();
                if (g != null)
                {
                    g.setAttribute("http.cookie-store", c);
                }
            }
        }
        obj = new BasicHttpParams();
        HttpProtocolParams.setVersion(((org.apache.http.params.HttpParams) (obj)), HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(((org.apache.http.params.HttpParams) (obj)), "ISO-8859-1");
        HttpProtocolParams.setUseExpectContinue(((org.apache.http.params.HttpParams) (obj)), true);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
        sslsocketfactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        schemeregistry.register(new Scheme("https", sslsocketfactory, 443));
        f = new DefaultHttpClient(new ThreadSafeClientConnManager(((org.apache.http.params.HttpParams) (obj)), schemeregistry), ((org.apache.http.params.HttpParams) (obj)));
        h = new o(this);
        f.setRedirectHandler(h);
        d();
    }

    private f a(String s, Handler handler, int i1, h h1, int j1)
    {
        s = new f(s);
        s.a(g);
        s.a(f);
        s.a(handler);
        s.b(i);
        s.a(j1);
        s.b(i1);
        handler = new g();
        handler.a = h1;
        s.a(handler);
        return s;
    }

    private void d()
    {
        Object obj2 = null;
        Object obj;
        Object obj1;
        PackageManager packagemanager;
        if (YuMeBSPInterfaceImpl.a != null)
        {
            obj = YuMeBSPInterfaceImpl.a.YuMeSDKBSP_GetApplicationContext();
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        i = (new WebView(((Context) (obj)))).getSettings().getUserAgentString();
        if (!r.a(i)) goto _L2; else goto _L3
_L3:
        if (YuMeBSPInterfaceImpl.a != null)
        {
            obj1 = YuMeBSPInterfaceImpl.a.YuMeSDKBSP_GetApplicationContext();
        } else
        {
            obj1 = null;
        }
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        packagemanager = ((Context) (obj1)).getPackageManager();
        obj = packagemanager.getApplicationInfo(((Context) (obj1)).getPackageName(), 0);
        obj1 = packagemanager.getPackageInfo(((Context) (obj1)).getPackageName(), 0);
_L6:
        if (obj != null)
        {
            obj = packagemanager.getApplicationLabel(((android.content.pm.ApplicationInfo) (obj)));
        } else
        {
            obj = "Unknown App Name";
        }
        obj = (String)obj;
        i = (new StringBuilder(String.valueOf(i))).append(" ").append(((String) (obj))).toString();
        if (obj1 != null)
        {
            obj = ((PackageInfo) (obj1)).versionName;
        } else
        {
            obj = "Unknown App Version";
        }
        i = (new StringBuilder(String.valueOf(i))).append(" ").append(((String) (obj))).toString();
_L5:
        a.a((new StringBuilder("Device User Agent (BSP): ")).append(i).toString());
_L2:
        return;
        obj1;
        obj = null;
_L7:
        ((android.content.pm.PackageManager.NameNotFoundException) (obj1)).printStackTrace();
        obj1 = obj2;
          goto _L6
        obj1;
          goto _L7
    }

    public final void a()
    {
        ClientConnectionManager clientconnectionmanager;
        if (f != null)
        {
            clientconnectionmanager = f.getConnectionManager();
        } else
        {
            clientconnectionmanager = null;
        }
        if (clientconnectionmanager != null)
        {
            clientconnectionmanager.shutdown();
        }
        h = null;
        b = null;
        f = null;
        g = null;
    }

    final void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.remove(Integer.valueOf(f1.d()));
            if (b.size() == 0)
            {
                b = null;
            }
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        f1.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        f1;
        throw f1;
    }

    public final void a(String s, int i1)
    {
        if (r.a(s))
        {
            if ((s = a(s, e, YuMeBSPInterfaceImpl.c.a, h.c, i1)) != null)
            {
                s.a();
                return;
            }
        }
    }

    public final void a(String s, JSONObject jsonobject, String s1, int i1)
    {
        if (r.a(s))
        {
            if ((s = a(s, d, YuMeBSPInterfaceImpl.c.a, h.b, i1)) != null)
            {
                if (jsonobject != null)
                {
                    s.a(jsonobject);
                    s.a(s1);
                }
                if (b == null)
                {
                    b = new HashMap();
                }
                b.put(Integer.valueOf(s.d()), s);
                if (jsonobject != null)
                {
                    com.yume.android.bsp.b.a().a(s);
                    return;
                } else
                {
                    s.a();
                    return;
                }
            }
        }
    }

    final String b()
    {
        if (!r.a(i))
        {
            d();
        }
        return i;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = b;
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.a("Aborting BSP Downloads...");
        (new Thread(new l(this))).start();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
