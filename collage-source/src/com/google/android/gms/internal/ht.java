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
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ec, hs, aq, ay, 
//            au, gw, dx, ch, 
//            cd, cg, cn, co, 
//            ck, gx, o, n, 
//            ce, cj, cl, ee

public class ht extends WebViewClient
{

    private static final String b[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String c[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    protected final hs a;
    private final HashMap d;
    private final Object e;
    private zza f;
    private zzg g;
    private a h;
    private ce i;
    private b j;
    private boolean k;
    private cj l;
    private cl m;
    private boolean n;
    private boolean o;
    private zzn p;
    private final ec q;
    private zze r;
    private dx s;
    private ee t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public ht(hs hs1, boolean flag)
    {
        this(hs1, flag, new ec(hs1, hs1.d(), new aq(hs1.getContext())), null);
    }

    ht(hs hs1, boolean flag, ec ec1, dx dx1)
    {
        d = new HashMap();
        e = new Object();
        k = false;
        a = hs1;
        n = flag;
        q = ec1;
        s = dx1;
    }

    static b a(ht ht1, b b1)
    {
        ht1.j = b1;
        return b1;
    }

    private String a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return "";
        }
        s1 = Uri.parse(s1);
        if (s1.getHost() != null)
        {
            return s1.getHost();
        } else
        {
            return "";
        }
    }

    private void a(Context context, String s1, String s2, String s3)
    {
        if (!((Boolean)ay.af.c()).booleanValue())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("err", s1);
            bundle.putString("code", s2);
            bundle.putString("host", a(s3));
            zzp.zzbx().a(context, a.l().zzIz, "gmob-apps", bundle, true);
            return;
        }
    }

    static void a(ht ht1)
    {
        ht1.h();
    }

    static void b(ht ht1)
    {
        ht1.i();
    }

    private static boolean b(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    static void c(ht ht1)
    {
        ht1.j();
    }

    static b d(ht ht1)
    {
        return ht1.j;
    }

    private void h()
    {
        synchronized (e)
        {
            o = true;
        }
        y = y + 1;
        e();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void i()
    {
        y = y - 1;
        e();
    }

    private void j()
    {
        x = true;
        e();
    }

    public zze a()
    {
        return r;
    }

    public void a(int i1, int j1)
    {
        if (s != null)
        {
            s.c(i1, j1);
        }
    }

    public void a(int i1, int j1, boolean flag)
    {
        q.a(i1, j1);
        if (s != null)
        {
            s.a(i1, j1, flag);
        }
    }

    public void a(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)d.get(s1);
        if (obj != null)
        {
            uri = zzp.zzbx().a(uri);
            if (zzb.zzM(2))
            {
                zzb.v((new StringBuilder()).append("Received GMSG: ").append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); zzb.v((new StringBuilder()).append("  ").append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ch)((Iterator) (obj)).next()).zza(a, uri)) { }
        } else
        {
            zzb.v((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
        }
    }

    public void a(zza zza1, zzg zzg, ce ce, zzn zzn, boolean flag, cj cj, cl cl, 
            zze zze1, ee ee)
    {
        zze zze2 = zze1;
        if (zze1 == null)
        {
            zze2 = new zze(false);
        }
        s = new dx(a, ee);
        a("/appEvent", ((ch) (new cd(ce))));
        a("/backButton", cg.j);
        a("/canOpenURLs", cg.b);
        a("/canOpenIntents", cg.c);
        a("/click", cg.d);
        a("/close", cg.e);
        a("/customClose", cg.f);
    /* block-local class not found */
    class d {}

        a("/delayPageLoaded", ((ch) (new d(null))));
        a("/httpTrack", cg.g);
        a("/log", cg.h);
        a("/mraid", ((ch) (new cn(zze2, s))));
        a("/mraidLoaded", ((ch) (q)));
        a("/open", ((ch) (new co(cj, zze2, s))));
        a("/precache", cg.l);
        a("/touch", cg.i);
        a("/video", cg.k);
        if (cl != null)
        {
            a("/setInterstitialProperties", ((ch) (new ck(cl))));
        }
        f = zza1;
        g = zzg;
        i = ce;
        l = cj;
        p = zzn;
        r = zze2;
        t = ee;
        m = cl;
        a(flag);
        u = false;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        zzg zzg = null;
        boolean flag = a.m();
        zza zza1;
        if (flag && !a.h().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        if (!flag)
        {
            zzg = g;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, zza1, zzg, p, a.l()));
    }

    public void a(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        com.google.android.gms.ads.internal.overlay.zze zze1;
        Context context;
        boolean flag;
        if (s != null)
        {
            flag = s.b();
        } else
        {
            flag = false;
        }
        zze1 = zzp.zzbv();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zze1.zza(context, adoverlayinfoparcel, flag1);
    }

    public void a(a a1)
    {
        h = a1;
    }

    public void a(b b1)
    {
        j = b1;
    }

    public final void a(String s1, ch ch1)
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
        ((List) (obj)).add(ch1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public final void a(boolean flag, int i1)
    {
        zza zza1;
        if (a.m() && !a.h().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        a(new AdOverlayInfoParcel(zza1, g, p, a, flag, i1, a.l()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.m();
        zza zza1;
        if (flag1 && !a.h().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
    /* block-local class not found */
    class c {}

        if (!flag1)
        {
            obj = new c(a, g);
        }
        a(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), i, p, a, flag, i1, s1, a.l(), l));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.m();
        zza zza1;
        Object obj;
        if (flag1 && !a.h().zzsH)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new c(a, g);
        }
        a(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), i, p, a, flag, i1, s1, s2, a.l(), l));
    }

    public final void b(String s1, ch ch1)
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
        s1.remove(ch1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public boolean b()
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

    public boolean c()
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

    public void d()
    {
        synchronized (e)
        {
            zzb.v("Loading blank page in WebView, 2...");
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
        if (h != null && (w && y <= 0 || x))
        {
            a a1 = h;
            hs hs1 = a;
    /* block-local class not found */
    class a {}

            boolean flag;
            if (!x)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.zza(hs1, flag);
            h = null;
        }
    }

    public final void f()
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

    public final void g()
    {
        synchronized (e)
        {
            k = false;
            n = true;
            gw.a(new zziq._cls1(this));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        zzb.v((new StringBuilder()).append("Loading resource: ").append(s1).toString());
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
                zzb.v("Blank page loaded, 1...");
                a.o();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        w = true;
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
            a(a.getContext(), "ssl_err", s1, zzp.zzbz().a(sslerror));
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
        Uri uri;
        zzb.v((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s1).toString());
        uri = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        a(uri);
_L4:
        return true;
_L2:
        if (k && webview == a && b(uri))
        {
            if (!u)
            {
                u = true;
                if (f != null && ((Boolean)ay.T.c()).booleanValue())
                {
                    f.onAdClicked();
                }
            }
            return super.shouldOverrideUrlLoading(webview, s1);
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_273;
        }
        n n1 = a.k();
        webview = uri;
        if (n1 != null)
        {
            webview = uri;
            try
            {
                if (n1.b(uri))
                {
                    webview = n1.a(uri, a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                zzb.zzaE((new StringBuilder()).append("Unable to append parameter to URL: ").append(s1).toString());
                webview = uri;
            }
        }
        if (r == null || r.zzbe())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            r.zzp(s1);
        }
        continue; /* Loop/switch isn't completed */
        zzb.zzaE((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }


    // Unreferenced inner class com/google/android/gms/internal/ht$b
    /* block-local class not found */
    class b {}

}
