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
//            ko, ry, cm, cy, 
//            cx, qa, qd, kg, 
//            ae, ad, sd, fk, 
//            fo, se, gl, gm, 
//            gi, sa, fz, sb, 
//            fl, sc, gh, gj, 
//            kq

public class zzja extends WebViewClient
{

    private static final String b[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String c[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    protected ry a;
    private final HashMap d;
    private final Object e;
    private zza f;
    private zzg g;
    private sb h;
    private fl i;
    private sc j;
    private boolean k;
    private gh l;
    private gj m;
    private boolean n;
    private boolean o;
    private zzn p;
    private final ko q;
    private zze r;
    private kg s;
    private kq t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public zzja(ry ry1, boolean flag)
    {
        this(ry1, flag, new ko(ry1, ry1.f(), new cm(ry1.getContext())), null);
    }

    zzja(ry ry1, boolean flag, ko ko1, kg kg1)
    {
        d = new HashMap();
        e = new Object();
        k = false;
        a = ry1;
        n = flag;
        q = ko1;
        s = kg1;
    }

    static sc zza(zzja zzja1, sc sc)
    {
        zzja1.j = sc;
        return sc;
    }

    private void zza(Context context, String s1, String s2, String s3)
    {
        cq cq = cy.af;
        if (!((Boolean)zzp.zzbE().a(cq)).booleanValue())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("err", s1);
            bundle.putString("code", s2);
            bundle.putString("host", zzaK(s3));
            zzp.zzbv();
            qa.a(context, a.n().zzJu, "gmob-apps", bundle, true);
            return;
        }
    }

    static void zza(zzja zzja1)
    {
        zzja1.zzht();
    }

    private String zzaK(String s1)
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

    static void zzb(zzja zzja1)
    {
        zzja1.zzhu();
    }

    static void zzc(zzja zzja1)
    {
        zzja1.zzhv();
    }

    static sc zzd(zzja zzja1)
    {
        return zzja1.j;
    }

    private static boolean zzg(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void zzht()
    {
        synchronized (e)
        {
            o = true;
        }
        y = y + 1;
        zzhw();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzhu()
    {
        y = y - 1;
        zzhw();
    }

    private void zzhv()
    {
        x = true;
        zzhw();
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder("Loading resource: ")).append(s1).toString());
        webview = Uri.parse(s1);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            zzh(webview);
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
                com.google.android.gms.ads.internal.util.client.zzb.v("Blank page loaded, 1...");
                a.r();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        w = true;
        zzhw();
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
        zza(a.getContext(), "http_err", s3, s2);
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
            zza(a.getContext(), "ssl_err", s1, zzp.zzbx().a(sslerror));
        }
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public final void reset()
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
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString());
        obj = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(((Uri) (obj)).getScheme()) || !"mobileads.google.com".equalsIgnoreCase(((Uri) (obj)).getHost())) goto _L2; else goto _L1
_L1:
        zzh(((Uri) (obj)));
_L4:
        return true;
_L2:
        if (k && webview == a.a() && zzg(((Uri) (obj))))
        {
            if (!u)
            {
                u = true;
                if (f != null)
                {
                    obj = cy.T;
                    if (((Boolean)zzp.zzbE().a(((cq) (obj)))).booleanValue())
                    {
                        f.onAdClicked();
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webview, s1);
        }
        if (a.a().willNotDraw())
        {
            break MISSING_BLOCK_LABEL_280;
        }
        ad ad1 = a.m();
        webview = ((WebView) (obj));
        if (ad1 != null)
        {
            webview = ((WebView) (obj));
            try
            {
                if (ad1.a(((Uri) (obj))))
                {
                    webview = ad1.a(((Uri) (obj)), a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = ((WebView) (obj));
            }
        }
        if (r == null || r.zzbe())
        {
            zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            r.zzp(s1);
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzF(boolean flag)
    {
        k = flag;
    }

    public void zza(int i1, int j1, boolean flag)
    {
        q.a(i1, j1);
        if (s != null)
        {
            s.a(i1, j1, flag);
        }
    }

    public final void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        zzg zzg1 = null;
        boolean flag = a.o();
        zza zza1;
        if (flag && !a.j().zztf)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        if (!flag)
        {
            zzg1 = g;
        }
        zza(new AdOverlayInfoParcel(adlauncherintentinfoparcel, zza1, zzg1, p, a.n()));
    }

    public void zza(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        com.google.android.gms.ads.internal.overlay.zze zze1;
        Context context;
        boolean flag;
        if (s != null)
        {
            flag = s.a();
        } else
        {
            flag = false;
        }
        zze1 = zzp.zzbt();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zze1.zza(context, adoverlayinfoparcel, flag1);
    }

    public void zza(sb sb1)
    {
        h = sb1;
    }

    public void zza(sc sc)
    {
        j = sc;
    }

    public final void zza(String s1, fz fz1)
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
        ((List) (obj)).add(fz1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void zza(boolean flag, int i1)
    {
        zza zza1;
        if (a.o() && !a.j().zztf)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        zza(new AdOverlayInfoParcel(zza1, g, p, a, flag, i1, a.n()));
    }

    public final void zza(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.o();
        zza zza1;
        if (flag1 && !a.j().zztf)
        {
            zza1 = null;
        } else
        {
            zza1 = f;
        }
        if (!flag1)
        {
            obj = new sd(a, g);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), i, p, a, flag, i1, s1, a.n(), l));
    }

    public final void zza(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.o();
        zza zza1;
        Object obj;
        if (flag1 && !a.j().zztf)
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
            obj = new sd(a, g);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzg) (obj)), i, p, a, flag, i1, s1, s2, a.n(), l));
    }

    public void zzb(zza zza1, zzg zzg1, fl fl, zzn zzn, boolean flag, gh gh, gj gj, 
            zze zze1, kq kq)
    {
        zze zze2 = zze1;
        if (zze1 == null)
        {
            zze2 = new zze(false);
        }
        s = new kg(a, kq);
        zza("/appEvent", new fk(fl));
        zza("/backButton", fo.j);
        zza("/canOpenURLs", fo.b);
        zza("/canOpenIntents", fo.c);
        zza("/click", fo.d);
        zza("/close", fo.e);
        zza("/customClose", fo.f);
        zza("/instrument", fo.m);
        zza("/delayPageLoaded", new se(this, (byte)0));
        zza("/httpTrack", fo.g);
        zza("/log", fo.h);
        zza("/mraid", new gl(zze2, s));
        zza("/mraidLoaded", q);
        zza("/open", new gm(gh, zze2, s));
        zza("/precache", fo.l);
        zza("/touch", fo.i);
        zza("/video", fo.k);
        if (gj != null)
        {
            zza("/setInterstitialProperties", new gi(gj));
        }
        f = zza1;
        g = zzg1;
        i = fl;
        l = gh;
        p = zzn;
        r = zze2;
        t = kq;
        m = gj;
        zzF(flag);
        u = false;
    }

    public final void zzb(String s1, fz fz1)
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
        s1.remove(fz1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public boolean zzbY()
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

    public void zzd(int i1, int j1)
    {
        if (s != null)
        {
            s.a(i1, j1);
        }
    }

    public void zze(ry ry1)
    {
        a = ry1;
    }

    public final void zzeG()
    {
        synchronized (e)
        {
            k = false;
            n = true;
            qa.a(new sa(this));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzh(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)d.get(s1);
        if (obj != null)
        {
            zzp.zzbv();
            uri = qa.a(uri);
            if (com.google.android.gms.ads.internal.util.client.zzb.zzN(2))
            {
                com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder("Received GMSG: ")).append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((fz)((Iterator) (obj)).next()).zza(a, uri)) { }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    public zze zzhq()
    {
        return r;
    }

    public boolean zzhr()
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

    public void zzhs()
    {
        synchronized (e)
        {
            com.google.android.gms.ads.internal.util.client.zzb.v("Loading blank page in WebView, 2...");
            v = true;
            a.a("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzhw()
    {
        if (h != null && (w && y <= 0 || x))
        {
            sb sb1 = h;
            ry ry1 = a;
            boolean flag;
            if (!x)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sb1.a(ry1, flag);
            h = null;
        }
        a.y();
    }

}
