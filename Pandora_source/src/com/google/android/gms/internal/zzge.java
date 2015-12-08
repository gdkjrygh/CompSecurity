// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzdf, zzgd, zzak, zzdb, 
//            zzl, zzk, zzbp, zzbr, 
//            zzby, zzbz, zzbv, zzfl, 
//            zzbs, zzbw, zzbu, zzbq, 
//            zzdh

public class zzge extends WebViewClient
{
    private static class a
        implements zzf
    {

        private zzgd a;
        private zzf b;

        public void zzaj()
        {
            b.zzaj();
            a.zzfo();
        }

        public void zzak()
        {
            b.zzak();
            a.zzdy();
        }

        public a(zzgd zzgd1, zzf zzf1)
        {
            a = zzgd1;
            b = zzf1;
        }
    }

    private class b
        implements zzbs
    {

        final zzge a;

        public void zza(zzgd zzgd1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                com.google.android.gms.internal.zzge.zza(a);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    com.google.android.gms.internal.zzge.zzb(a);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    com.google.android.gms.internal.zzge.zzc(a);
                    return;
                }
            }
        }

        private b()
        {
            a = zzge.this;
            super();
        }

    }

    public static interface zza
    {

        public abstract void zza(zzgd zzgd1, boolean flag);
    }


    private final HashMap zzDd;
    private zzf zzDe;
    private boolean zzDf;
    private zzi zzDg;
    private final zzdf zzDh;
    private boolean zzDi;
    private boolean zzDj;
    private boolean zzDk;
    private int zzDl;
    protected final zzgd zznp;
    private boolean zzod;
    private final Object zzoe;
    private com.google.android.gms.ads.internal.client.zza zzpG;
    private zzbw zztF;
    private com.google.android.gms.ads.internal.zzb zztH;
    private zzdb zztI;
    private zzbu zztK;
    private zzbq zzth;
    private zzdh zzvz;
    private zza zzxX;

    public zzge(zzgd zzgd1, boolean flag)
    {
        this(zzgd1, flag, new zzdf(zzgd1, zzgd1.zzfq(), new zzak(zzgd1.getContext())), null);
    }

    zzge(zzgd zzgd1, boolean flag, zzdf zzdf1, zzdb zzdb1)
    {
        zzDd = new HashMap();
        zzoe = new Object();
        zzDf = false;
        zznp = zzgd1;
        zzod = flag;
        zzDh = zzdf1;
        zztI = zzdb1;
    }

    static void zza(zzge zzge1)
    {
        zzge1.zzfC();
    }

    static void zzb(zzge zzge1)
    {
        zzge1.zzfD();
    }

    static void zzc(zzge zzge1)
    {
        zzge1.zzfE();
    }

    private static boolean zzf(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void zzfC()
    {
        zzDl = zzDl + 1;
        zzfF();
    }

    private void zzfD()
    {
        zzDl = zzDl - 1;
        zzfF();
    }

    private void zzfE()
    {
        zzDk = true;
        zzfF();
    }

    public final void onLoadResource(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            zzg(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (!zzDi || !"about:blank".equals(s))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzam("Blank page loaded, 1...");
                zznp.zzfy();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        zzDj = true;
        zzfF();
        return;
        s;
        webview;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void reset()
    {
        synchronized (zzoe)
        {
            zzDd.clear();
            zzpG = null;
            zzDe = null;
            zzxX = null;
            zzth = null;
            zzDf = false;
            zzod = false;
            zztK = null;
            zzDg = null;
            if (zztI != null)
            {
                zztI.zzn(true);
                zztI = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        zzg(uri);
_L4:
        return true;
_L2:
        if (zzDf && webview == zznp && zzf(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (zznp.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        zzk zzk1 = zznp.zzfv();
        webview = uri;
        if (zzk1 != null)
        {
            webview = uri;
            try
            {
                if (zzk1.zzb(uri))
                {
                    webview = zzk1.zza(uri, zznp.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        if (zztH == null || zztH.zzaF())
        {
            zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            zztH.zze(s);
        }
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzD(boolean flag)
    {
        zzDf = flag;
    }

    public void zza(int i, int j, boolean flag)
    {
        zzDh.zze(i, j);
        if (zztI != null)
        {
            zztI.zza(i, j, flag);
        }
    }

    public final void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        zzf zzf1 = null;
        boolean flag = zznp.zzfx();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag && !zznp.zzah().zzpY)
        {
            zza1 = null;
        } else
        {
            zza1 = zzpG;
        }
        if (!flag)
        {
            zzf1 = zzDe;
        }
        zza(new AdOverlayInfoParcel(adlauncherintentinfoparcel, zza1, zzf1, zzDg, zznp.zzfw()));
    }

    public void zza(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        zzd zzd1;
        android.content.Context context;
        boolean flag;
        if (zztI != null)
        {
            flag = zztI.zzdg();
        } else
        {
            flag = false;
        }
        zzd1 = zzh.zzaO();
        context = zznp.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zzd1.zza(context, adoverlayinfoparcel, flag1);
    }

    public void zza(zza zza1)
    {
        zzxX = zza1;
    }

    public final void zza(String s, zzbs zzbs1)
    {
        Object obj1 = zzoe;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)zzDd.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        zzDd.put(s, obj);
        ((List) (obj)).add(zzbs1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void zza(boolean flag, int i)
    {
        com.google.android.gms.ads.internal.client.zza zza1;
        if (zznp.zzfx() && !zznp.zzah().zzpY)
        {
            zza1 = null;
        } else
        {
            zza1 = zzpG;
        }
        zza(new AdOverlayInfoParcel(zza1, zzDe, zzDg, zznp, flag, i, zznp.zzfw()));
    }

    public final void zza(boolean flag, int i, String s)
    {
        Object obj = null;
        boolean flag1 = zznp.zzfx();
        com.google.android.gms.ads.internal.client.zza zza1;
        if (flag1 && !zznp.zzah().zzpY)
        {
            zza1 = null;
        } else
        {
            zza1 = zzpG;
        }
        if (!flag1)
        {
            obj = new a(zznp, zzDe);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzf) (obj)), zzth, zzDg, zznp, flag, i, s, zznp.zzfw(), zztK));
    }

    public final void zza(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = zznp.zzfx();
        com.google.android.gms.ads.internal.client.zza zza1;
        Object obj;
        if (flag1 && !zznp.zzah().zzpY)
        {
            zza1 = null;
        } else
        {
            zza1 = zzpG;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new a(zznp, zzDe);
        }
        zza(new AdOverlayInfoParcel(zza1, ((zzf) (obj)), zzth, zzDg, zznp, flag, i, s, s1, zznp.zzfw(), zztK));
    }

    public void zzb(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf1, zzbq zzbq, zzi zzi, boolean flag, zzbu zzbu, zzbw zzbw, 
            com.google.android.gms.ads.internal.zzb zzb1, zzdh zzdh)
    {
        com.google.android.gms.ads.internal.zzb zzb2 = zzb1;
        if (zzb1 == null)
        {
            zzb2 = new com.google.android.gms.ads.internal.zzb(false);
        }
        zztI = new zzdb(zznp, zzdh);
        zza("/appEvent", new zzbp(zzbq));
        zza("/canOpenURLs", zzbr.zztj);
        zza("/canOpenIntents", zzbr.zztk);
        zza("/click", zzbr.zztl);
        zza("/close", zzbr.zztm);
        zza("/customClose", zzbr.zztn);
        zza("/delayPageLoaded", new b());
        zza("/httpTrack", zzbr.zzto);
        zza("/log", zzbr.zztp);
        zza("/mraid", new zzby(zzb2, zztI));
        zza("/open", new zzbz(zzbu, zzb2, zztI));
        zza("/precache", zzbr.zzts);
        zza("/touch", zzbr.zztq);
        zza("/video", zzbr.zztr);
        if (zzbw != null)
        {
            zza("/setInterstitialProperties", new zzbv(zzbw));
        }
        zzpG = zza1;
        zzDe = zzf1;
        zzth = zzbq;
        zztK = zzbu;
        zzDg = zzi;
        zztH = zzb2;
        zzvz = zzdh;
        zztF = zzbw;
        zzD(flag);
    }

    public final void zzb(String s, zzbs zzbs1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        s = (List)zzDd.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s.remove(zzbs1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean zzbg()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzod;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzd(int i, int j)
    {
        if (zztI != null)
        {
            zztI.zzd(i, j);
        }
    }

    public final void zzdv()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzc zzc1;
        zzDf = false;
        zzod = true;
        zznp.zzfz();
        zzc1 = zznp.zzfr();
        if (zzc1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (zzj.zzbJ().zzfk())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzfl.zzCr.post(new Runnable(zzc1) {

            final zzc a;
            final zzge b;

            public void run()
            {
                a.zzdv();
            }

            
            {
                b = zzge.this;
                a = zzc1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzc1.zzdv();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.google.android.gms.ads.internal.zzb zzfA()
    {
        return zztH;
    }

    public void zzfB()
    {
        synchronized (zzoe)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzam("Loading blank page in WebView, 2...");
            zzDi = true;
            zznp.zzao("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzfF()
    {
        if (zzxX != null && (zzDj && zzDl <= 0 || zzDk))
        {
            zza zza1 = zzxX;
            zzgd zzgd1 = zznp;
            boolean flag;
            if (!zzDk)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zza1.zza(zzgd1, flag);
            zzxX = null;
        }
    }

    public void zzfG()
    {
        if (zzbg())
        {
            zzDh.zzdm();
        }
    }

    public void zzg(Uri uri)
    {
        String s = uri.getPath();
        Object obj = (List)zzDd.get(s);
        if (obj != null)
        {
            uri = zzh.zzaQ().zzd(uri);
            if (com.google.android.gms.ads.internal.util.client.zzb.zzC(2))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzbs)((Iterator) (obj)).next()).zza(zznp, uri)) { }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
        }
    }
}
