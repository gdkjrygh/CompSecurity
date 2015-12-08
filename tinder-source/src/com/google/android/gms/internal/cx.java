// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.e;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            bp, cw, q, v, 
//            u, cl, aq, bl, 
//            el, am, ap, at, 
//            au, cm, zzao, e, 
//            an, ar, as, br

public class cx extends WebViewClient
{
    public static interface a
    {

        public abstract void a(cw cw1);
    }

    public static interface b
    {
    }

    private static final class c
        implements e
    {

        private cw a;
        private e b;

        public final void a()
        {
            b.a();
            a.a();
        }

        public final void b()
        {
            b.b();
            a.b();
        }

        public c(cw cw1, e e1)
        {
            a = cw1;
            b = e1;
        }
    }

    private final class d
        implements aq
    {

        final cx a;

        public final void a(cw cw1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                com.google.android.gms.internal.cx.a(a);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    com.google.android.gms.internal.cx.b(a);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    cx.c(a);
                    return;
                }
            }
        }

        private d()
        {
            a = cx.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final String q[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String r[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    protected cw a;
    final HashMap b;
    final Object c;
    com.google.android.gms.ads.internal.client.a d;
    e e;
    public a f;
    an g;
    b h;
    boolean i;
    ar j;
    boolean k;
    boolean l;
    j m;
    public com.google.android.gms.ads.internal.b n;
    bl o;
    boolean p;
    private as s;
    private final bp t;
    private br u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public cx(cw cw1, boolean flag)
    {
        this(cw1, flag, new bp(cw1, cw1.d(), new q(cw1.getContext())));
    }

    private cx(cw cw1, boolean flag, bp bp1)
    {
        b = new HashMap();
        c = new Object();
        i = false;
        a = cw1;
        k = flag;
        t = bp1;
        o = null;
    }

    private void a(Context context, String s1, String s2, String s3)
    {
        Object obj;
        obj = v.af;
        if (!((Boolean)com.google.android.gms.ads.internal.d.i().a(((r) (obj)))).booleanValue())
        {
            return;
        }
        obj = new Bundle();
        ((Bundle) (obj)).putString("err", s1);
        ((Bundle) (obj)).putString("code", s2);
        if (TextUtils.isEmpty(s3)) goto _L2; else goto _L1
_L1:
        s1 = Uri.parse(s3);
        if (s1.getHost() == null) goto _L2; else goto _L3
_L3:
        s1 = s1.getHost();
_L5:
        ((Bundle) (obj)).putString("host", s1);
        com.google.android.gms.ads.internal.d.c();
        com.google.android.gms.internal.cl.a(context, a.l().b, "gmob-apps", ((Bundle) (obj)));
        return;
_L2:
        s1 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)b.get(s1);
        if (obj != null)
        {
            com.google.android.gms.ads.internal.d.c();
            uri = com.google.android.gms.internal.cl.a(uri);
            if (com.google.android.gms.ads.internal.util.client.b.a(2))
            {
                com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("Received GMSG: ")).append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((aq)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    private void a(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        Context context;
        Intent intent;
        boolean flag;
        if (o != null)
        {
            flag = o.a();
        } else
        {
            flag = false;
        }
        com.google.android.gms.ads.internal.d.b();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        if (adoverlayinfoparcel.l == 4 && adoverlayinfoparcel.d == null)
        {
            Object obj;
            if (adoverlayinfoparcel.c != null)
            {
                obj = adoverlayinfoparcel.c;
            }
            com.google.android.gms.ads.internal.d.a();
            obj = adoverlayinfoparcel.b;
            adoverlayinfoparcel = adoverlayinfoparcel.j;
            com.google.android.gms.ads.internal.overlay.a.a(context, ((AdLauncherIntentInfoParcel) (obj)));
            return;
        }
        intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", flag1);
        AdOverlayInfoParcel.a(intent, adoverlayinfoparcel);
        if (!com.google.android.gms.internal.el.a(21))
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        com.google.android.gms.ads.internal.d.c();
        com.google.android.gms.internal.cl.a(context, intent);
    }

    static void a(cx cx1)
    {
        synchronized (cx1.c)
        {
            cx1.l = true;
        }
        cx1.y = cx1.y + 1;
        cx1.c();
        return;
        cx1;
        obj;
        JVM INSTR monitorexit ;
        throw cx1;
    }

    private void a(String s1, aq aq1)
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)b.get(s1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        b.put(s1, obj);
        ((List) (obj)).add(aq1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static void b(cx cx1)
    {
        cx1.y = cx1.y - 1;
        cx1.c();
    }

    private void c()
    {
        if (f != null && (w && y <= 0 || x))
        {
            f.a(a);
            f = null;
        }
        a.u();
    }

    static void c(cx cx1)
    {
        cx1.x = true;
        cx1.c();
    }

    static b d(cx cx1)
    {
        return cx1.h;
    }

    static b e(cx cx1)
    {
        cx1.h = null;
        return null;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        e e1 = null;
        boolean flag = a.m();
        com.google.android.gms.ads.internal.client.a a1;
        if (flag && !a.h().e)
        {
            a1 = null;
        } else
        {
            a1 = d;
        }
        if (!flag)
        {
            e1 = e;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, a1, e1, m, a.l()));
    }

    public final void a(an an, j j1, ar ar, com.google.android.gms.ads.internal.b b1)
    {
        com.google.android.gms.ads.internal.b b2 = b1;
        if (b1 == null)
        {
            b2 = new com.google.android.gms.ads.internal.b((byte)0);
        }
        o = new bl(a);
        a("/appEvent", ((aq) (new am(an))));
        a("/backButton", com.google.android.gms.internal.ap.j);
        a("/canOpenURLs", com.google.android.gms.internal.ap.b);
        a("/canOpenIntents", ap.c);
        a("/click", com.google.android.gms.internal.ap.d);
        a("/close", com.google.android.gms.internal.ap.e);
        a("/customClose", ap.f);
        a("/instrument", ap.m);
        a("/delayPageLoaded", ((aq) (new d((byte)0))));
        a("/httpTrack", ap.g);
        a("/log", ap.h);
        a("/mraid", ((aq) (new at(b2, o))));
        a("/mraidLoaded", ((aq) (t)));
        a("/open", ((aq) (new au(ar, b2, o))));
        a("/precache", ap.l);
        a("/touch", ap.i);
        a("/video", ap.k);
        d = null;
        e = null;
        g = an;
        j = ar;
        m = j1;
        n = b2;
        u = null;
        s = null;
        i = true;
        p = false;
    }

    public final void a(cw cw1)
    {
        a = cw1;
    }

    public final void a(boolean flag, int i1)
    {
        com.google.android.gms.ads.internal.client.a a1;
        if (a.m() && !a.h().e)
        {
            a1 = null;
        } else
        {
            a1 = d;
        }
        a(new AdOverlayInfoParcel(a1, e, m, a, flag, i1, a.l()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.m();
        com.google.android.gms.ads.internal.client.a a1;
        if (flag1 && !a.h().e)
        {
            a1 = null;
        } else
        {
            a1 = d;
        }
        if (!flag1)
        {
            obj = new c(a, e);
        }
        a(new AdOverlayInfoParcel(a1, ((e) (obj)), g, m, a, flag, i1, s1, a.l(), j));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.m();
        com.google.android.gms.ads.internal.client.a a1;
        Object obj;
        if (flag1 && !a.h().e)
        {
            a1 = null;
        } else
        {
            a1 = d;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new c(a, e);
        }
        a(new AdOverlayInfoParcel(a1, ((e) (obj)), g, m, a, flag, i1, s1, s2, a.l(), j));
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (c)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (c)
        {
            com.google.android.gms.ads.internal.util.client.b.d("Loading blank page in WebView, 2...");
            v = true;
            a.a("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("Loading resource: ")).append(s1).toString());
        webview = Uri.parse(s1);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            a(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s1)
    {
label0:
        {
            synchronized (c)
            {
                if (!v || !"about:blank".equals(s1))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.d("Blank page loaded, 1...");
                a.o();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        w = true;
        c();
        return;
        s1;
        webview;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void onReceivedError(WebView webview, int i1, String s1, String s2)
    {
        String s3;
        if (i1 < 0 && -i1 - 1 < q.length)
        {
            s3 = q[-i1 - 1];
        } else
        {
            s3 = String.valueOf(i1);
        }
        a(a.getContext(), "http_err", s3, s2);
        super.onReceivedError(webview, i1, s1, s2);
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (sslerror != null)
        {
            int i1 = sslerror.getPrimaryError();
            String s1;
            if (i1 >= 0 && i1 < r.length)
            {
                s1 = r[i1];
            } else
            {
                s1 = String.valueOf(i1);
            }
            a(a.getContext(), "ssl_err", s1, com.google.android.gms.ads.internal.d.e().a(sslerror));
        }
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
    {
        switch (keyevent.getKeyCode())
        {
        default:
            return false;

        case 79: // 'O'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        case 91: // '['
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 222: 
            return true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        Object obj;
        com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString());
        obj = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(((Uri) (obj)).getScheme()) || !"mobileads.google.com".equalsIgnoreCase(((Uri) (obj)).getHost())) goto _L2; else goto _L1
_L1:
        a(((Uri) (obj)));
_L4:
        return true;
_L2:
        if (i && webview == a.getWebView())
        {
            String s2 = ((Uri) (obj)).getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s2) || "https".equalsIgnoreCase(s2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (!p)
                {
                    p = true;
                    if (d != null)
                    {
                        obj = v.T;
                        ((Boolean)com.google.android.gms.ads.internal.d.i().a(((r) (obj)))).booleanValue();
                    }
                }
                return super.shouldOverrideUrlLoading(webview, s1);
            }
        }
        if (a.getWebView().willNotDraw())
        {
            break MISSING_BLOCK_LABEL_303;
        }
        com.google.android.gms.internal.e e1 = a.k();
        webview = ((WebView) (obj));
        if (e1 != null)
        {
            webview = ((WebView) (obj));
            try
            {
                if (e1.a(((Uri) (obj))))
                {
                    a.getContext();
                    webview = e1.b(((Uri) (obj)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = ((WebView) (obj));
            }
        }
        if (n == null || n.a())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a("Action was blocked because no click was detected.");
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }


    // Unreferenced inner class com/google/android/gms/internal/cx$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final cx a;

        public final void run()
        {
            a.a.t();
            zzd zzd1 = a.a.f();
            if (zzd1 != null)
            {
                zzd1.l.removeView(zzd1.f);
                zzd1.a(true);
            }
            if (com.google.android.gms.internal.cx.d(a) != null)
            {
                com.google.android.gms.internal.cx.d(a);
                com.google.android.gms.internal.cx.e(a);
            }
        }

            
            {
                a = cx.this;
                super();
            }
    }

}
