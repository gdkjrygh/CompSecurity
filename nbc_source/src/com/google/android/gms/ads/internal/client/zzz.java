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
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfo;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzg, zzk, AdSizeParcel, zze, 
//            zzc, zzr, zzb, zzi, 
//            zzx, zza

public class zzz
{

    private final Context mContext;
    private final zzg zznH;
    private String zzoL;
    private zza zzrU;
    private AdListener zzrV;
    private final zzee zzsR;
    private zzr zzsT;
    private String zzsU;
    private InAppPurchaseListener zzsW;
    private PlayStorePurchaseListener zzsX;
    private OnCustomRenderedAdLoadedListener zzsY;
    private PublisherInterstitialAd zzsZ;
    private AppEventListener zzsq;

    public zzz(Context context)
    {
        this(context, zzg.zzcw(), null);
    }

    public zzz(Context context, zzg zzg1, PublisherInterstitialAd publisherinterstitialad)
    {
        zzsR = new zzee();
        mContext = context;
        zznH = zzg1;
        zzsZ = publisherinterstitialad;
    }

    private void zzL(String s)
        throws RemoteException
    {
        if (zzoL == null)
        {
            zzM(s);
        }
        zzsT = zzk.zzcB().zzb(mContext, new AdSizeParcel(), zzoL, zzsR);
        if (zzrV != null)
        {
            zzsT.zza(new zzc(zzrV));
        }
        if (zzrU != null)
        {
            zzsT.zza(new com.google.android.gms.ads.internal.client.zzb(zzrU));
        }
        if (zzsq != null)
        {
            zzsT.zza(new zzi(zzsq));
        }
        if (zzsW != null)
        {
            zzsT.zza(new zzfk(zzsW));
        }
        if (zzsX != null)
        {
            zzsT.zza(new zzfo(zzsX), zzsU);
        }
        if (zzsY != null)
        {
            zzsT.zza(new zzcj(zzsY));
        }
    }

    private void zzM(String s)
    {
        if (zzsT == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        zzrV = adlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
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
        if (zzoL != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            zzoL = s;
            return;
        }
    }

    public void show()
    {
        try
        {
            zzM("show");
            zzsT.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to show interstitial.", remoteexception);
        }
    }

    public void zza(zza zza1)
    {
        zzrU = zza1;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
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
            if (zzsT == null)
            {
                zzL("loadAd");
            }
            if (zzsT.zza(zznH.zza(mContext, zzx1)))
            {
                zzsR.zzf(zzx1.zzcJ());
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
