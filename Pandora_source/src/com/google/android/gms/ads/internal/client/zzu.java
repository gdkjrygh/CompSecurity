// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzbd;
import com.google.android.gms.internal.zzcq;
import com.google.android.gms.internal.zzdw;
import com.google.android.gms.internal.zzea;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzf, zzi, zzj, AdSizeParcel, 
//            zzn, zzd, zzc, zzb, 
//            zzh, zzt, zza

public class zzu
{

    private com.google.android.gms.ads.internal.client.zza zzpG;
    private AdListener zzpH;
    private final zzcq zzqB;
    private final zzf zzqC;
    private final AtomicBoolean zzqD;
    private zzn zzqE;
    private String zzqF;
    private ViewGroup zzqG;
    private InAppPurchaseListener zzqH;
    private PlayStorePurchaseListener zzqI;
    private OnCustomRenderedAdLoadedListener zzqJ;
    private AppEventListener zzqb;
    private AdSize zzqc[];
    private String zzqd;

    public zzu(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, zzf.zzbG());
    }

    public zzu(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, zzf.zzbG());
    }

    zzu(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzf zzf1)
    {
        this(viewgroup, attributeset, flag, zzf1, null);
    }

    zzu(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzf zzf1, zzn zzn1)
    {
        zzqB = new zzcq();
        zzqG = viewgroup;
        zzqC = zzf1;
        zzqE = zzn1;
        zzqD = new AtomicBoolean(false);
        if (attributeset != null)
        {
            zzf1 = viewgroup.getContext();
            try
            {
                attributeset = new zzi(zzf1, attributeset);
                zzqc = attributeset.zzj(flag);
                zzqd = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                zzj.zzbJ().zza(viewgroup, new AdSizeParcel(zzf1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                zzj.zzbJ().zza(viewgroup, new AdSizeParcel(zzf1, zzqc[0]), "Ads by Google");
            }
        }
    }

    private void zzbT()
    {
        com.google.android.gms.dynamic.zzd zzd1 = zzqE.zzag();
        if (zzd1 == null)
        {
            return;
        }
        try
        {
            zzqG.addView((View)zze.zzg(zzd1));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void zzbU()
        throws RemoteException
    {
        if ((zzqc == null || zzqd == null) && zzqE == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = zzqG.getContext();
        zzqE = zzj.zzbK().zza(context, new AdSizeParcel(context, zzqc), zzqd, zzqB);
        if (zzpH != null)
        {
            zzqE.zza(new zzc(zzpH));
        }
        if (zzpG != null)
        {
            zzqE.zza(new com.google.android.gms.ads.internal.client.zzb(zzpG));
        }
        if (zzqb != null)
        {
            zzqE.zza(new zzh(zzqb));
        }
        if (zzqH != null)
        {
            zzqE.zza(new zzdw(zzqH));
        }
        if (zzqI != null)
        {
            zzqE.zza(new zzea(zzqI), zzqF);
        }
        if (zzqJ != null)
        {
            zzqE.zza(new zzbd(zzqJ));
        }
        zzqE.zza(zzj.zzbL());
        zzbT();
    }

    public void destroy()
    {
        try
        {
            if (zzqE != null)
            {
                zzqE.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return zzpH;
    }

    public AdSize getAdSize()
    {
        Object obj;
        if (zzqE == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = zzqE.zzah();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = ((AdSizeParcel) (obj)).zzbH();
        return ((AdSize) (obj));
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the current AdSize.", remoteexception);
        if (zzqc != null)
        {
            return zzqc[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return zzqc;
    }

    public String getAdUnitId()
    {
        return zzqd;
    }

    public AppEventListener getAppEventListener()
    {
        return zzqb;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zzqH;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (zzqE == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        s = zzqE.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zzqJ;
    }

    public void pause()
    {
        try
        {
            if (zzqE != null)
            {
                zzqE.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        if (!zzqD.getAndSet(true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (zzqE == null) goto _L1; else goto _L3
_L3:
        zzqE.zzar();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to record impression.", remoteexception);
        return;
    }

    public void resume()
    {
        try
        {
            if (zzqE != null)
            {
                zzqE.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to call resume.", remoteexception);
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        zzpH = adlistener;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new zzc(adlistener);
_L3:
        zzn1.zza(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        zzb.zzd("Failed to set the AdListener.", adlistener);
        return;
    }

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (zzqc != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            zza(aadsize);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        if (zzqd != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            zzqd = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzqb = appeventlistener;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new zzh(appeventlistener);
_L3:
        zzn1.zza(appeventlistener);
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
        if (zzqI != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        zzqH = inapppurchaselistener;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inapppurchaselistener = new zzdw(inapppurchaselistener);
_L3:
        zzn1.zza(inapppurchaselistener);
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
        zzqJ = oncustomrenderedadloadedlistener;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new zzbd(oncustomrenderedadloadedlistener);
_L3:
        zzn1.zza(oncustomrenderedadloadedlistener);
_L2:
        return;
        oncustomrenderedadloadedlistener = null;
          goto _L3
        oncustomrenderedadloadedlistener;
        zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (zzqH != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        zzqI = playstorepurchaselistener;
        zzqF = s;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        playstorepurchaselistener = new zzea(playstorepurchaselistener);
_L3:
        zzn1.zza(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        zzb.zzd("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1)
    {
        zzpG = zza1;
        if (zzqE == null) goto _L2; else goto _L1
_L1:
        zzn zzn1 = zzqE;
        if (zza1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        zza1 = new com.google.android.gms.ads.internal.client.zzb(zza1);
_L3:
        zzn1.zza(zza1);
_L2:
        return;
        zza1 = null;
          goto _L3
        zza1;
        zzb.zzd("Failed to set the AdClickListener.", zza1);
        return;
    }

    public void zza(zzt zzt1)
    {
        try
        {
            if (zzqE == null)
            {
                zzbU();
            }
            if (zzqE.zza(zzqC.zza(zzqG.getContext(), zzt1)))
            {
                zzqB.zze(zzt1.zzbP());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzt zzt1)
        {
            zzb.zzd("Failed to load ad.", zzt1);
        }
    }

    public transient void zza(AdSize aadsize[])
    {
        zzqc = aadsize;
        try
        {
            if (zzqE != null)
            {
                zzqE.zza(new AdSizeParcel(zzqG.getContext(), zzqc));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            zzb.zzd("Failed to set the ad size.", aadsize);
        }
        zzqG.requestLayout();
    }
}
