// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            eb, hi, aq, ay, 
//            ax, gm, cf, dw, 
//            cb, ce, cl, cm, 
//            ci, gn, p, o, 
//            cc, ch, cj, ed

public class hj extends WebViewClient
{
    public static interface a
    {

        public abstract void a(hi hi1, boolean flag);
    }

    public static interface b
    {

        public abstract void a();
    }

    private static final class c
        implements f
    {

        private hi a;
        private f b;

        public final void a_()
        {
            b.a_();
            a.b();
        }

        public final void b_()
        {
            b.b_();
            a.c();
        }

        public c(hi hi1, f f1)
        {
            a = hi1;
            b = f1;
        }
    }

    private final class d
        implements cf
    {

        final hj a;

        public final void a(hi hi1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                com.google.android.gms.internal.hj.a(a);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    com.google.android.gms.internal.hj.b(a);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    hj.c(a);
                    return;
                }
            }
        }

        private d()
        {
            a = hj.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final String b[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String c[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    protected final hi a;
    private final HashMap d;
    private final Object e;
    private com.google.android.gms.ads.internal.client.a f;
    private f g;
    private a h;
    private cc i;
    private b j;
    private boolean k;
    private ch l;
    private cj m;
    private boolean n;
    private boolean o;
    private j p;
    private final eb q;
    private e r;
    private dw s;
    private ed t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public hj(hi hi1, boolean flag)
    {
        this(hi1, flag, new eb(hi1, hi1.e(), new aq(hi1.getContext())));
    }

    private hj(hi hi1, boolean flag, eb eb1)
    {
        d = new HashMap();
        e = new Object();
        k = false;
        a = hi1;
        n = flag;
        q = eb1;
        s = null;
    }

    private void a(Context context, String s1, String s2, String s3)
    {
        Object obj;
        obj = ay.af;
        if (!((Boolean)com.google.android.gms.ads.internal.p.n().a(((au) (obj)))).booleanValue())
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
        com.google.android.gms.ads.internal.p.e();
        com.google.android.gms.internal.gm.a(context, a.m().b, "gmob-apps", ((Bundle) (obj)), true);
        return;
_L2:
        s1 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Uri uri)
    {
        Object obj = uri.getPath();
        obj = (List)d.get(obj);
        if (obj != null)
        {
            com.google.android.gms.ads.internal.p.e();
            uri = com.google.android.gms.internal.gm.a(uri);
            if (com.google.android.gms.ads.internal.util.client.b.a(2))
            {
                com.google.android.gms.ads.internal.util.client.b.a(2);
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.b.a(2))
                {
                    String s1 = (String)iterator.next();
                    (new StringBuilder("  ")).append(s1).append(": ").append((String)uri.get(s1));
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((cf)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            (new StringBuilder("No GMSG handler found for GMSG: ")).append(uri);
            com.google.android.gms.ads.internal.util.client.b.a(2);
        }
    }

    private void a(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        Context context;
        boolean flag;
        if (s != null)
        {
            flag = s.a();
        } else
        {
            flag = false;
        }
        com.google.android.gms.ads.internal.p.c();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        com.google.android.gms.ads.internal.overlay.d.a(context, adoverlayinfoparcel, flag1);
    }

    static void a(hj hj1)
    {
        synchronized (hj1.e)
        {
            hj1.o = true;
        }
        hj1.y = hj1.y + 1;
        hj1.h();
        return;
        hj1;
        obj;
        JVM INSTR monitorexit ;
        throw hj1;
    }

    static void b(hj hj1)
    {
        hj1.y = hj1.y - 1;
        hj1.h();
    }

    static void c(hj hj1)
    {
        hj1.x = true;
        hj1.h();
    }

    static b d(hj hj1)
    {
        return hj1.j;
    }

    static b e(hj hj1)
    {
        hj1.j = null;
        return null;
    }

    private void h()
    {
        if (h != null && (w && y <= 0 || x))
        {
            a a1 = h;
            hi hi1 = a;
            boolean flag;
            if (!x)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.a(hi1, flag);
            h = null;
        }
    }

    public final e a()
    {
        return r;
    }

    public final void a(int i1, int j1)
    {
        if (s != null)
        {
            s.a(i1, j1);
        }
    }

    public final void a(int i1, int j1, boolean flag)
    {
        q.a(i1, j1);
        if (s != null)
        {
            s.a(i1, j1, flag);
        }
    }

    public final void a(com.google.android.gms.ads.internal.client.a a1, f f1, cc cc, j j1, boolean flag, ch ch, cj cj, 
            e e1, ed ed)
    {
        e e2 = e1;
        if (e1 == null)
        {
            e2 = new e((byte)0);
        }
        s = new dw(a, ed);
        a("/appEvent", ((cf) (new cb(cc))));
        a("/backButton", com.google.android.gms.internal.ce.j);
        a("/canOpenURLs", com.google.android.gms.internal.ce.b);
        a("/canOpenIntents", ce.c);
        a("/click", com.google.android.gms.internal.ce.d);
        a("/close", com.google.android.gms.internal.ce.e);
        a("/customClose", com.google.android.gms.internal.ce.f);
        a("/delayPageLoaded", ((cf) (new d((byte)0))));
        a("/httpTrack", ce.g);
        a("/log", ce.h);
        a("/mraid", ((cf) (new cl(e2, s))));
        a("/mraidLoaded", ((cf) (q)));
        a("/open", ((cf) (new cm(ch, e2, s))));
        a("/precache", ce.l);
        a("/touch", ce.i);
        a("/video", ce.k);
        if (cj != null)
        {
            a("/setInterstitialProperties", ((cf) (new ci(cj))));
        }
        f = a1;
        g = f1;
        i = cc;
        l = ch;
        p = j1;
        r = e2;
        t = ed;
        m = cj;
        k = flag;
        u = false;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        f f1 = null;
        boolean flag = a.n();
        com.google.android.gms.ads.internal.client.a a1;
        if (flag && !a.i().e)
        {
            a1 = null;
        } else
        {
            a1 = f;
        }
        if (!flag)
        {
            f1 = g;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, a1, f1, p, a.m()));
    }

    public final void a(a a1)
    {
        h = a1;
    }

    public final void a(b b1)
    {
        j = b1;
    }

    public final void a(String s1, cf cf1)
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)d.get(s1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        d.put(s1, obj);
        ((List) (obj)).add(cf1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(boolean flag, int i1)
    {
        com.google.android.gms.ads.internal.client.a a1;
        if (a.n() && !a.i().e)
        {
            a1 = null;
        } else
        {
            a1 = f;
        }
        a(new AdOverlayInfoParcel(a1, g, p, a, flag, i1, a.m()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.n();
        com.google.android.gms.ads.internal.client.a a1;
        if (flag1 && !a.i().e)
        {
            a1 = null;
        } else
        {
            a1 = f;
        }
        if (!flag1)
        {
            obj = new c(a, g);
        }
        a(new AdOverlayInfoParcel(a1, ((f) (obj)), i, p, a, flag, i1, s1, a.m(), l));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.n();
        com.google.android.gms.ads.internal.client.a a1;
        Object obj;
        if (flag1 && !a.i().e)
        {
            a1 = null;
        } else
        {
            a1 = f;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new c(a, g);
        }
        a(new AdOverlayInfoParcel(a1, ((f) (obj)), i, p, a, flag, i1, s1, s2, a.m(), l));
    }

    public final void b(String s1, cf cf1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        s1 = (List)d.get(s1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s1.remove(cf1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (e)
        {
            flag = n;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean c()
    {
        boolean flag;
        synchronized (e)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (e)
        {
            com.google.android.gms.ads.internal.util.client.b.a(2);
            v = true;
            a.a("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        synchronized (e)
        {
            d.clear();
            f = null;
            g = null;
            h = null;
            i = null;
            k = false;
            n = false;
            o = false;
            l = null;
            p = null;
            j = null;
            if (s != null)
            {
                s.a(true);
                s = null;
            }
            u = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        k = false;
    }

    public final void g()
    {
        synchronized (e)
        {
            k = false;
            n = true;
            com.google.android.gms.internal.gm.a(new Runnable() {

                final hj a;

                public final void run()
                {
                    a.a.t();
                    com.google.android.gms.ads.internal.overlay.c c1 = a.a.g();
                    if (c1 != null)
                    {
                        c1.n();
                    }
                    if (com.google.android.gms.internal.hj.d(a) != null)
                    {
                        com.google.android.gms.internal.hj.d(a).a();
                        com.google.android.gms.internal.hj.e(a);
                    }
                }

            
            {
                a = hj.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
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
            synchronized (e)
            {
                if (!v || !"about:blank".equals(s1))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.a(2);
                a.q();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        w = true;
        h();
        return;
        s1;
        webview;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void onReceivedError(WebView webview, int i1, String s1, String s2)
    {
        String s3;
        if (i1 < 0 && -i1 - 1 < b.length)
        {
            s3 = b[-i1 - 1];
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
            if (i1 >= 0 && i1 < c.length)
            {
                s1 = c[i1];
            } else
            {
                s1 = String.valueOf(i1);
            }
            a(a.getContext(), "ssl_err", s1, com.google.android.gms.ads.internal.p.g().a(sslerror));
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
        com.google.android.gms.ads.internal.util.client.b.a(2);
        obj = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(((Uri) (obj)).getScheme()) || !"mobileads.google.com".equalsIgnoreCase(((Uri) (obj)).getHost())) goto _L2; else goto _L1
_L1:
        a(((Uri) (obj)));
_L4:
        return true;
_L2:
        if (k && webview == a)
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
                if (!u)
                {
                    u = true;
                    if (f != null)
                    {
                        obj = ay.T;
                        if (((Boolean)com.google.android.gms.ads.internal.p.n().a(((au) (obj)))).booleanValue())
                        {
                            f.e();
                        }
                    }
                }
                return super.shouldOverrideUrlLoading(webview, s1);
            }
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_292;
        }
        o o1 = a.l();
        webview = ((WebView) (obj));
        if (o1 != null)
        {
            webview = ((WebView) (obj));
            try
            {
                if (o1.a(((Uri) (obj))))
                {
                    webview = o1.a(((Uri) (obj)), a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = ((WebView) (obj));
            }
        }
        if (r == null || r.b())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            r.a(s1);
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

}
