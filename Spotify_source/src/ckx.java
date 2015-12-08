// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
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
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ckx extends WebViewClient
{

    private static final String k[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String l[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    protected ckw a;
    final HashMap b;
    final Object c;
    public cky d;
    public ckz e;
    boolean f;
    boolean g;
    public final cgf h;
    public bkg i;
    public cga j;
    private bfe m;
    private bhs n;
    private cde o;
    private cdo p;
    private boolean q;
    private bhz r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;

    public ckx(ckw ckw1, boolean flag)
    {
        this(ckw1, flag, new cgf(ckw1, ckw1.f(), new cat(ckw1.getContext())));
    }

    private ckx(ckw ckw1, boolean flag, cgf cgf1)
    {
        b = new HashMap();
        c = new Object();
        f = false;
        a = ckw1;
        g = flag;
        h = cgf1;
        j = null;
    }

    private void a(Context context, String s1, String s2, String s3)
    {
        Object obj;
        obj = cbb.O;
        if (!((Boolean)bkv.n().a(((cax) (obj)))).booleanValue())
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
        bkv.e();
        cjj.a(context, a.n().b, "gmob-apps", ((Bundle) (obj)), true);
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
            bkv.e();
            uri = cjj.a(uri);
            if (bka.a(2))
            {
                bka.d((new StringBuilder("Received GMSG: ")).append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); bka.d((new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((cdi)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            bka.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    static void a(ckx ckx1)
    {
        synchronized (ckx1.c)
        {
            ckx1.q = true;
        }
        ckx1.w = ckx1.w + 1;
        ckx1.e();
        return;
        ckx1;
        obj;
        JVM INSTR monitorexit ;
        throw ckx1;
    }

    private void a(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        Context context;
        boolean flag;
        if (j != null)
        {
            flag = j.b();
        } else
        {
            flag = false;
        }
        bkv.c();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        bhq.a(context, adoverlayinfoparcel, flag1);
    }

    static void b(ckx ckx1)
    {
        ckx1.w = ckx1.w - 1;
        ckx1.e();
    }

    static void c(ckx ckx1)
    {
        ckx1.v = true;
        ckx1.e();
    }

    static ckz d(ckx ckx1)
    {
        return ckx1.e;
    }

    static ckz e(ckx ckx1)
    {
        ckx1.e = null;
        return null;
    }

    private void e()
    {
        if (d != null && (u && w <= 0 || v))
        {
            cky cky1 = d;
            ckw ckw1 = a;
            boolean flag;
            if (!v)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cky1.a(ckw1, flag);
            d = null;
        }
        a.y();
    }

    public final void a(bfe bfe1, bhs bhs, cde cde, bhz bhz, boolean flag, cdo cdo, cdq cdq, 
            bkg bkg1, cgh cgh)
    {
        bkg bkg2 = bkg1;
        if (bkg1 == null)
        {
            bkg2 = new bkg((byte)0);
        }
        j = new cga(a, cgh);
        a("/appEvent", ((cdi) (new cdd(cde))));
        a("/backButton", cdh.i);
        a("/canOpenURLs", cdh.a);
        a("/canOpenIntents", cdh.b);
        a("/click", cdh.c);
        a("/close", cdh.d);
        a("/customClose", cdh.e);
        a("/instrument", cdh.l);
        a("/delayPageLoaded", ((cdi) (new clb(this, (byte)0))));
        a("/httpTrack", cdh.f);
        a("/log", cdh.g);
        a("/mraid", ((cdi) (new cds(bkg2, j))));
        a("/mraidLoaded", ((cdi) (h)));
        a("/open", ((cdi) (new cdt(cdo, bkg2, j))));
        a("/precache", cdh.k);
        a("/touch", cdh.h);
        a("/video", cdh.j);
        if (cdq != null)
        {
            a("/setInterstitialProperties", ((cdi) (new cdp(cdq))));
        }
        m = bfe1;
        n = bhs;
        o = cde;
        p = cdo;
        r = bhz;
        i = bkg2;
        f = flag;
        s = false;
    }

    public final void a(ckw ckw1)
    {
        a = ckw1;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        bhs bhs = null;
        boolean flag = a.o();
        bfe bfe1;
        if (flag && !a.j().e)
        {
            bfe1 = null;
        } else
        {
            bfe1 = m;
        }
        if (!flag)
        {
            bhs = n;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, bfe1, bhs, r, a.n()));
    }

    public final void a(String s1, cdi cdi1)
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
        ((List) (obj)).add(cdi1);
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
        bfe bfe1;
        if (a.o() && !a.j().e)
        {
            bfe1 = null;
        } else
        {
            bfe1 = m;
        }
        a(new AdOverlayInfoParcel(bfe1, n, r, a, flag, i1, a.n()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.o();
        bfe bfe1;
        if (flag1 && !a.j().e)
        {
            bfe1 = null;
        } else
        {
            bfe1 = m;
        }
        if (!flag1)
        {
            obj = new cla(a, n);
        }
        a(new AdOverlayInfoParcel(bfe1, ((bhs) (obj)), o, r, a, flag, i1, s1, a.n(), p));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.o();
        bfe bfe1;
        Object obj;
        if (flag1 && !a.j().e)
        {
            bfe1 = null;
        } else
        {
            bfe1 = m;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new cla(a, n);
        }
        a(new AdOverlayInfoParcel(bfe1, ((bhs) (obj)), o, r, a, flag, i1, s1, s2, a.n(), p));
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (c)
        {
            flag = g;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (c)
        {
            flag = q;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        synchronized (c)
        {
            bka.d("Loading blank page in WebView, 2...");
            t = true;
            a.a("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (c)
        {
            b.clear();
            m = null;
            n = null;
            d = null;
            o = null;
            f = false;
            g = false;
            q = false;
            p = null;
            r = null;
            e = null;
            if (j != null)
            {
                j.a(true);
                j = null;
            }
            s = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        bka.d((new StringBuilder("Loading resource: ")).append(s1).toString());
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
                if (!t || !"about:blank".equals(s1))
                {
                    break label0;
                }
                bka.d("Blank page loaded, 1...");
                a.r();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        u = true;
        e();
        return;
        s1;
        webview;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void onReceivedError(WebView webview, int i1, String s1, String s2)
    {
        String s3;
        if (i1 < 0 && -i1 - 1 < 15)
        {
            s3 = k[-i1 - 1];
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
            if (i1 >= 0 && i1 < 6)
            {
                s1 = l[i1];
            } else
            {
                s1 = String.valueOf(i1);
            }
            a(a.getContext(), "ssl_err", s1, bkv.g().a(sslerror));
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
        bka.d((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString());
        obj = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(((Uri) (obj)).getScheme()) || !"mobileads.google.com".equalsIgnoreCase(((Uri) (obj)).getHost())) goto _L2; else goto _L1
_L1:
        a(((Uri) (obj)));
_L4:
        return true;
_L2:
        if (f && webview == a.a())
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
                if (!s)
                {
                    s = true;
                    if (m != null)
                    {
                        obj = cbb.G;
                        if (((Boolean)bkv.n().a(((cax) (obj)))).booleanValue())
                        {
                            m.e();
                        }
                    }
                }
                return super.shouldOverrideUrlLoading(webview, s1);
            }
        }
        if (a.a().willNotDraw())
        {
            break MISSING_BLOCK_LABEL_315;
        }
        bzm bzm1 = a.m();
        webview = ((WebView) (obj));
        if (bzm1 != null)
        {
            webview = ((WebView) (obj));
            try
            {
                if (bzm1.a(((Uri) (obj))))
                {
                    webview = bzm1.a(((Uri) (obj)), a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                bka.e((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = ((WebView) (obj));
            }
        }
        if (i == null || i.a())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            i.a(s1);
        }
        continue; /* Loop/switch isn't completed */
        bka.e((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }


    // Unreferenced inner class ckx$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private ckx a;

        public final void run()
        {
            a.a.x();
            zzd zzd1 = a.a.h();
            if (zzd1 != null)
            {
                zzd1.g.removeView(zzd1.c);
                zzd1.a(true);
            }
            if (ckx.d(a) != null)
            {
                ckx.d(a).a();
                ckx.e(a);
            }
        }

            
            {
                a = ckx.this;
                super();
            }
    }

}
