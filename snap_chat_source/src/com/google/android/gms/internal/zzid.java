// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzef, zzic, zzbu, zzab, 
//            zzho, zzhx, zzcv, zzeb, 
//            zzl, zzk, zzu, zzek, 
//            zzba, zzeo, zzem, zzcs, 
//            zzcu, zzcz, zzda, zzcx, 
//            zzbe, zzhw, zzel, zzat, 
//            zzcy, zzcw, zzct, zzeh, 
//            zzep, zzes

public class zzid extends WebViewClient
{
    public static interface zza
    {

        public abstract void zza(zzic zzic1, boolean flag);
    }

    class zzb
        implements zzcv
    {

        final zzid zzzZ;

        public void zza(zzic zzic1, Map map)
        {
            if (map.keySet().contains("start"))
            {
                zzid.zza(zzzZ);
            } else
            {
                if (map.keySet().contains("stop"))
                {
                    zzid.zzb(zzzZ);
                    return;
                }
                if (map.keySet().contains("cancel"))
                {
                    zzid.zzc(zzzZ);
                    return;
                }
            }
        }

        private zzb()
        {
            zzzZ = zzid.this;
            super();
        }

    }


    protected final zzic zzmu;
    private boolean zzng;
    private final Object zznh;
    private zzat zzoJ;
    private zzcy zzrJ;
    private zzu zzrK;
    private zzeb zzrL;
    private zzcw zzrN;
    private zzct zzry;
    private zzeh zztq;
    private zza zzvD;
    private final HashMap zzzQ;
    private zzep zzzR;
    private boolean zzzS;
    private zzes zzzT;
    private final zzef zzzU;
    private boolean zzzV;
    private boolean zzzW;
    private int zzzX;

    public zzid(zzic zzic1, boolean flag)
    {
        this(zzic1, flag, new zzef(zzic1, zzic1.zzeE(), new zzbu(zzic1.getContext())));
    }

    zzid(zzic zzic1, boolean flag, zzef zzef1)
    {
        zzzQ = new HashMap();
        zznh = new Object();
        zzzS = false;
        zzmu = zzic1;
        zzng = flag;
        zzzU = zzef1;
    }

    static void zza(zzid zzid1)
    {
        zzid1.zzeN();
    }

    static void zzb(zzid zzid1)
    {
        zzid1.zzeO();
    }

    static void zzc(zzid zzid1)
    {
        zzid1.zzeP();
    }

    private void zzeN()
    {
        zzzX = zzzX + 1;
        zzeQ();
    }

    private void zzeO()
    {
        zzzX = zzzX - 1;
        zzeQ();
    }

    private void zzeP()
    {
        zzzW = true;
        zzeQ();
    }

    private static boolean zzf(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void zzg(Uri uri)
    {
        String s = uri.getPath();
        Object obj = (List)zzzQ.get(s);
        if (obj != null)
        {
            uri = zzab.zzaM().zzd(uri);
            if (zzhx.zzA(2))
            {
                zzhx.zzab((new StringBuilder("Received GMSG: ")).append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); zzhx.zzab((new StringBuilder("  ")).append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzcv)((Iterator) (obj)).next()).zza(zzmu, uri)) { }
        } else
        {
            zzhx.zzab((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    public final void onLoadResource(WebView webview, String s)
    {
        zzhx.zzab((new StringBuilder("Loading resource: ")).append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            zzg(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        zzzV = true;
        zzeQ();
    }

    public final void reset()
    {
        synchronized (zznh)
        {
            zzzQ.clear();
            zzoJ = null;
            zzzR = null;
            zzvD = null;
            zzry = null;
            zzzS = false;
            zzng = false;
            zzrN = null;
            zzzT = null;
            if (zzrL != null)
            {
                zzrL.zzm(true);
                zzrL = null;
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
        zzhx.zzab((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        zzg(uri);
_L4:
        return true;
_L2:
        if (zzzS && webview == zzmu && zzf(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (zzmu.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        zzk zzk1 = zzmu.zzeI();
        webview = uri;
        if (zzk1 != null)
        {
            webview = uri;
            try
            {
                if (zzk1.zzb(uri))
                {
                    webview = zzk1.zza(uri, zzmu.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                zzhx.zzac((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
                webview = uri;
            }
        }
        if (zzrK == null || zzrK.zzaB())
        {
            zza(new zzek("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            zzrK.zzd(s);
        }
        continue; /* Loop/switch isn't completed */
        zzhx.zzac((new StringBuilder("AdWebView unable to handle URL: ")).append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzC(boolean flag)
    {
        zzzS = flag;
    }

    public final void zza(zzek zzek1)
    {
        zzep zzep = null;
        boolean flag = zzmu.zzeK();
        zzat zzat;
        if (flag && !zzmu.zzad().zzpb)
        {
            zzat = null;
        } else
        {
            zzat = zzoJ;
        }
        if (!flag)
        {
            zzep = zzzR;
        }
        zza(new zzeo(zzek1, zzat, zzep, zzzT, zzmu.zzeJ()));
    }

    public void zza(zzeo zzeo1)
    {
        boolean flag1 = false;
        zzem zzem1;
        android.content.Context context;
        boolean flag;
        if (zzrL != null)
        {
            flag = zzrL.zzcP();
        } else
        {
            flag = false;
        }
        zzem1 = zzab.zzaK();
        context = zzmu.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        zzem1.zza(context, zzeo1, flag1);
    }

    public void zza(zza zza1)
    {
        zzvD = zza1;
    }

    public final void zza(String s, zzcv zzcv1)
    {
        Object obj1 = zznh;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)zzzQ.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new ArrayList();
        zzzQ.put(s, obj);
        ((List) (obj)).add(zzcv1);
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
        zzat zzat;
        if (zzmu.zzeK() && !zzmu.zzad().zzpb)
        {
            zzat = null;
        } else
        {
            zzat = zzoJ;
        }
        zza(new zzeo(zzat, zzzR, zzzT, zzmu, flag, i, zzmu.zzeJ()));
    }

    public final void zza(boolean flag, int i, String s)
    {
        zzep zzep = null;
        boolean flag1 = zzmu.zzeK();
        zzat zzat;
        if (flag1 && !zzmu.zzad().zzpb)
        {
            zzat = null;
        } else
        {
            zzat = zzoJ;
        }
        if (!flag1)
        {
            zzep = zzzR;
        }
        zza(new zzeo(zzat, zzep, zzry, zzzT, zzmu, flag, i, s, zzmu.zzeJ(), zzrN));
    }

    public final void zza(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = zzmu.zzeK();
        zzat zzat;
        zzep zzep;
        if (flag1 && !zzmu.zzad().zzpb)
        {
            zzat = null;
        } else
        {
            zzat = zzoJ;
        }
        if (flag1)
        {
            zzep = null;
        } else
        {
            zzep = zzzR;
        }
        zza(new zzeo(zzat, zzep, zzry, zzzT, zzmu, flag, i, s, s1, zzmu.zzeJ(), zzrN));
    }

    public void zzb(int i, int j)
    {
        zzzU.zzf(i, j);
        if (zzrL != null)
        {
            zzrL.zzb(i, j);
        }
    }

    public void zzb(zzat zzat, zzep zzep, zzct zzct, zzes zzes, boolean flag, zzcw zzcw, zzcy zzcy, 
            zzu zzu1, zzeh zzeh)
    {
        zzu zzu2 = zzu1;
        if (zzu1 == null)
        {
            zzu2 = new zzu(false);
        }
        zzrL = new zzeb(zzmu, zzeh);
        zza("/appEvent", new zzcs(zzct));
        zza("/canOpenURLs", zzcu.zzrA);
        zza("/canOpenIntents", zzcu.zzrB);
        zza("/click", zzcu.zzrC);
        zza("/close", zzcu.zzrD);
        zza("/customClose", zzcu.zzrE);
        zza("/delayPageLoaded", new zzb());
        zza("/httpTrack", zzcu.zzrF);
        zza("/log", zzcu.zzrG);
        zza("/mraid", new zzcz(zzu2, zzrL));
        zza("/open", new zzda(zzcw, zzu2, zzrL));
        zza("/touch", zzcu.zzrH);
        zza("/video", zzcu.zzrI);
        if (zzcy != null)
        {
            zza("/setInterstitialProperties", new zzcx(zzcy));
        }
        zzoJ = zzat;
        zzzR = zzep;
        zzry = zzct;
        zzrN = zzcw;
        zzzT = zzes;
        zzrK = zzu2;
        zztq = zzeh;
        zzrJ = zzcy;
        zzC(flag);
    }

    public final void zzb(String s, zzcv zzcv1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        s = (List)zzzQ.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s.remove(zzcv1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean zzba()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzng;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzde()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzel zzel1;
        zzzS = false;
        zzng = true;
        zzmu.zzeL();
        zzel1 = zzmu.zzeF();
        if (zzel1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (zzbe.zzbD().zzeC())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzhw.zzzG.post(new Runnable(zzel1) {

            final zzel zzzY;
            final zzid zzzZ;

            public void run()
            {
                zzzY.zzde();
            }

            
            {
                zzzZ = zzid.this;
                zzzY = zzel1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzel1.zzde();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zze(int i, int j)
    {
        if (zzrL != null)
        {
            zzrL.zze(i, j);
        }
    }

    public zzu zzeM()
    {
        return zzrK;
    }

    public final void zzeQ()
    {
        if (zzvD != null && (zzzV && zzzX == 0 || zzzW))
        {
            zza zza1 = zzvD;
            zzic zzic1 = zzmu;
            boolean flag;
            if (!zzzW)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zza1.zza(zzic1, flag);
            zzvD = null;
        }
    }

    public void zzeR()
    {
        if (zzba())
        {
            zzzU.zzcV();
        }
    }
}
