// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzaz, zzdq, zzbe, zzba, 
//            zzaw, zzav, zzbi, zzau, 
//            zzbc, zzft, zzfx, zzck, 
//            zzhx, zzbo, zzat

public class zzbq
{

    private final Context mContext;
    private zzat zzoJ;
    private AdListener zzoK;
    private final zzdq zzpD;
    private final zzaz zzpE;
    private zzbi zzpG;
    private String zzpH;
    private InAppPurchaseListener zzpJ;
    private PlayStorePurchaseListener zzpK;
    private OnCustomRenderedAdLoadedListener zzpL;
    private PublisherInterstitialAd zzpM;
    private AppEventListener zzpd;
    private String zzpf;

    public zzbq(Context context)
    {
        this(context, zzaz.zzbA(), null);
    }

    public zzbq(Context context, zzaz zzaz1, PublisherInterstitialAd publisherinterstitialad)
    {
        zzpD = new zzdq();
        mContext = context;
        zzpE = zzaz1;
        zzpM = publisherinterstitialad;
    }

    private void zzy(String s)
    {
        if (zzpf == null)
        {
            zzz(s);
        }
        zzpG = zzbe.zzbE().zza(mContext, new zzba(), zzpf, zzpD);
        if (zzoK != null)
        {
            zzpG.zza(new zzav(zzoK));
        }
        if (zzoJ != null)
        {
            zzpG.zza(new zzau(zzoJ));
        }
        if (zzpd != null)
        {
            zzpG.zza(new zzbc(zzpd));
        }
        if (zzpJ != null)
        {
            zzpG.zza(new zzft(zzpJ));
        }
        if (zzpK != null)
        {
            zzpG.zza(new zzfx(zzpK), zzpH);
        }
        if (zzpL != null)
        {
            zzpG.zza(new zzck(zzpL));
        }
    }

    private void zzz(String s)
    {
        if (zzpG == null)
        {
            throw new IllegalStateException((new StringBuilder("The ad unit ID must be set on InterstitialAd before ")).append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        zzoK = adlistener;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new zzav(adlistener);
_L3:
        zzbi1.zza(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        zzhx.zzd("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (zzpf != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            zzpf = s;
            return;
        }
    }

    public void show()
    {
        try
        {
            zzz("show");
            zzpG.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Failed to show interstitial.", remoteexception);
        }
    }

    public void zza(zzat zzat)
    {
        zzoJ = zzat;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (zzat == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zzat = new zzau(zzat);
_L3:
        zzbi1.zza(zzat);
_L2:
        return;
        zzat = null;
          goto _L3
        zzat;
        zzhx.zzd("Failed to set the AdClickListener.", zzat);
        return;
    }

    public void zza(zzbo zzbo1)
    {
        try
        {
            if (zzpG == null)
            {
                zzy("loadAd");
            }
            if (zzpG.zza(zzpE.zza(mContext, zzbo1)))
            {
                zzpD.zze(zzbo1.zzbJ());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzbo zzbo1)
        {
            zzhx.zzd("Failed to load ad.", zzbo1);
        }
    }
}
