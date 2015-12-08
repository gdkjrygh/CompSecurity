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
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ex;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzg, zzk, AdSizeParcel, zze, 
//            zzc, zzr, zzb, zzi, 
//            zzx, zza

public class zzz
{

    private final Context mContext;
    private final zzg zznK;
    private String zzoZ;
    private AppEventListener zzsK;
    private zza zzsn;
    private AdListener zzso;
    private final dh zztk;
    private zzr zztm;
    private String zztn;
    private InAppPurchaseListener zztp;
    private PlayStorePurchaseListener zztq;
    private OnCustomRenderedAdLoadedListener zztr;
    private PublisherInterstitialAd zzts;

    public zzz(Context context)
    {
        this(context, zzg.zzcA(), null);
    }

    public zzz(Context context, PublisherInterstitialAd publisherinterstitialad)
    {
        this(context, zzg.zzcA(), publisherinterstitialad);
    }

    public zzz(Context context, zzg zzg1, PublisherInterstitialAd publisherinterstitialad)
    {
        zztk = new dh();
        mContext = context;
        zznK = zzg1;
        zzts = publisherinterstitialad;
    }

    private void zzM(String s)
        throws RemoteException
    {
        if (zzoZ == null)
        {
            zzN(s);
        }
        zztm = zzk.zzcF().zzb(mContext, new AdSizeParcel(), zzoZ, zztk);
        if (zzso != null)
        {
            zztm.zza(new zzc(zzso));
        }
        if (zzsn != null)
        {
            zztm.zza(new com.google.android.gms.ads.internal.client.zzb(zzsn));
        }
        if (zzsK != null)
        {
            zztm.zza(new zzi(zzsK));
        }
        if (zztp != null)
        {
            zztm.zza(new et(zztp));
        }
        if (zztq != null)
        {
            zztm.zza(new ex(zztq), zztn);
        }
        if (zztr != null)
        {
            zztm.zza(new bi(zztr));
        }
    }

    private void zzN(String s)
    {
        if (zztm == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public AdListener getAdListener()
    {
        return zzso;
    }

    public String getAdUnitId()
    {
        return zzoZ;
    }

    public AppEventListener getAppEventListener()
    {
        return zzsK;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zztp;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (zztm == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = zztm.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zztr;
    }

    public boolean isLoaded()
    {
        if (zztm == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zztm.isReady();
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
        if (zztm == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zztm.isLoading();
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
        zzso = adlistener;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new zzc(adlistener);
_L3:
        zzr1.zza(adlistener);
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
        if (zzoZ != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            zzoZ = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzsK = appeventlistener;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new zzi(appeventlistener);
_L3:
        zzr1.zza(appeventlistener);
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
        if (zztq != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        zztp = inapppurchaselistener;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new et(inapppurchaselistener);
_L3:
        zzr1.zza(inapppurchaselistener);
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
        zztr = oncustomrenderedadloadedlistener;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new bi(oncustomrenderedadloadedlistener);
_L3:
        zzr1.zza(oncustomrenderedadloadedlistener);
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
        if (zztp != null)
        {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        zztq = playstorepurchaselistener;
        zztn = s;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        playstorepurchaselistener = new ex(playstorepurchaselistener);
_L3:
        zzr1.zza(playstorepurchaselistener, s);
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
            zzN("show");
            zztm.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to show interstitial.", remoteexception);
        }
    }

    public void zza(zza zza1)
    {
        zzsn = zza1;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (zza1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zza1 = new com.google.android.gms.ads.internal.client.zzb(zza1);
_L3:
        zzr1.zza(zza1);
_L2:
        return;
        zza1 = null;
          goto _L3
        zza1;
        zzb.zzd("Failed to set the AdClickListener.", zza1);
        return;
    }

    public void zza(zzx zzx1)
    {
        try
        {
            if (zztm == null)
            {
                zzM("loadAd");
            }
            if (zztm.zza(zznK.zza(mContext, zzx1)))
            {
                zztk.a(zzx1.zzcN());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzx zzx1)
        {
            zzb.zzd("Failed to load ad.", zzx1);
        }
    }
}
