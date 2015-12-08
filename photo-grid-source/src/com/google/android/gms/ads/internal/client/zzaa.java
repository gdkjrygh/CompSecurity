// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.lx;
import com.google.android.gms.internal.md;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzh, zzs, zzc, zzj, 
//            zzb, zzl, AdSizeParcel, zze, 
//            zzy, zza

public class zzaa
{

    private final io a;
    private final Context b;
    private final zzh c;
    private AdListener d;
    private zza e;
    private zzs f;
    private String g;
    private String h;
    private AppEventListener i;
    private PlayStorePurchaseListener j;
    private InAppPurchaseListener k;
    private PublisherInterstitialAd l;
    private OnCustomRenderedAdLoadedListener m;

    public zzaa(Context context)
    {
        this(context, zzh.zzcB(), null);
    }

    public zzaa(Context context, PublisherInterstitialAd publisherinterstitialad)
    {
        this(context, zzh.zzcB(), publisherinterstitialad);
    }

    public zzaa(Context context, zzh zzh1, PublisherInterstitialAd publisherinterstitialad)
    {
        a = new io();
        b = context;
        c = zzh1;
        l = publisherinterstitialad;
    }

    private void a(String s)
    {
        if (f == null)
        {
            throw new IllegalStateException((new StringBuilder("The ad unit ID must be set on InterstitialAd before ")).append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public AdListener getAdListener()
    {
        return d;
    }

    public String getAdUnitId()
    {
        return g;
    }

    public AppEventListener getAppEventListener()
    {
        return i;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return k;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = f.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return m;
    }

    public boolean isLoaded()
    {
        if (f == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = f.isReady();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public boolean isLoading()
    {
        if (f == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = f.isLoading();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to check if ad is loading.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        d = adlistener;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new zzc(adlistener);
_L3:
        zzs1.zza(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        zzb.zzd("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (g != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            g = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        i = appeventlistener;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new zzj(appeventlistener);
_L3:
        zzs1.zza(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        zzb.zzd("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (j != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        k = inapppurchaselistener;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new lx(inapppurchaselistener);
_L3:
        zzs1.zza(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        zzb.zzd("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        m = oncustomrenderedadloadedlistener;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new dv(oncustomrenderedadloadedlistener);
_L3:
        zzs1.zza(oncustomrenderedadloadedlistener);
_L2:
        return;
        oncustomrenderedadloadedlistener = null;
          goto _L3
        oncustomrenderedadloadedlistener;
        zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (k != null)
        {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        j = playstorepurchaselistener;
        h = s;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        playstorepurchaselistener = new md(playstorepurchaselistener);
_L3:
        zzs1.zza(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        zzb.zzd("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            a("show");
            f.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to show interstitial.", remoteexception);
        }
    }

    public void zza(zza zza1)
    {
        e = zza1;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (zza1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zza1 = new com.google.android.gms.ads.internal.client.zzb(zza1);
_L3:
        zzs1.zza(zza1);
_L2:
        return;
        zza1 = null;
          goto _L3
        zza1;
        zzb.zzd("Failed to set the AdClickListener.", zza1);
        return;
    }

    public void zza(zzy zzy1)
    {
        try
        {
            if (f == null)
            {
                if (g == null)
                {
                    a("loadAd");
                }
                f = zzl.zzcG().zzb(b, new AdSizeParcel(), g, a);
                if (d != null)
                {
                    f.zza(new zzc(d));
                }
                if (e != null)
                {
                    f.zza(new com.google.android.gms.ads.internal.client.zzb(e));
                }
                if (i != null)
                {
                    f.zza(new zzj(i));
                }
                if (k != null)
                {
                    f.zza(new lx(k));
                }
                if (j != null)
                {
                    f.zza(new md(j), h);
                }
                if (m != null)
                {
                    f.zza(new dv(m));
                }
            }
            if (f.zzb(c.zza(b, zzy1)))
            {
                a.a(zzy1.zzcO());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzy zzy1)
        {
            zzb.zzd("Failed to load ad.", zzy1);
        }
    }
}
