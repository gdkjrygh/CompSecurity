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
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfo;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzg, zzj, zzk, AdSizeParcel, 
//            zzr, zze, zzc, zzb, 
//            zzi, zzx, zza

public class zzy
{

    private final zzg zznH;
    private String zzoL;
    private com.google.android.gms.ads.internal.client.zza zzrU;
    private AdListener zzrV;
    private final zzee zzsR;
    private final AtomicBoolean zzsS;
    private zzr zzsT;
    private String zzsU;
    private ViewGroup zzsV;
    private InAppPurchaseListener zzsW;
    private PlayStorePurchaseListener zzsX;
    private OnCustomRenderedAdLoadedListener zzsY;
    private AppEventListener zzsq;
    private AdSize zzsr[];

    public zzy(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, zzg.zzcw());
    }

    zzy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzg zzg1)
    {
        this(viewgroup, attributeset, flag, zzg1, null);
    }

    zzy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzg zzg1, zzr zzr1)
    {
        zzsR = new zzee();
        zzsV = viewgroup;
        zznH = zzg1;
        zzsT = zzr1;
        zzsS = new AtomicBoolean(false);
        if (attributeset != null)
        {
            zzg1 = viewgroup.getContext();
            try
            {
                attributeset = new zzj(zzg1, attributeset);
                zzsr = attributeset.zzi(flag);
                zzoL = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                zzk.zzcA().zza(viewgroup, new AdSizeParcel(zzg1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                zzk.zzcA().zza(viewgroup, new AdSizeParcel(zzg1, zzsr[0]), "Ads by Google");
            }
        }
    }

    private void zzcN()
    {
        com.google.android.gms.dynamic.zzd zzd = zzsT.zzaM();
        if (zzd == null)
        {
            return;
        }
        try
        {
            zzsV.addView((View)zze.zzn(zzd));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void zzcO()
        throws RemoteException
    {
        if ((zzsr == null || zzoL == null) && zzsT == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = zzsV.getContext();
        zzsT = zzk.zzcB().zza(context, new AdSizeParcel(context, zzsr), zzoL, zzsR);
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
        zzsT.zza(zzk.zzcC());
        zzcN();
    }

    public void destroy()
    {
        try
        {
            if (zzsT != null)
            {
                zzsT.destroy();
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
        return zzrV;
    }

    public AdSize getAdSize()
    {
        Object obj;
        if (zzsT == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = zzsT.zzaN();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = ((AdSizeParcel) (obj)).zzcy();
        return ((AdSize) (obj));
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the current AdSize.", remoteexception);
        if (zzsr != null)
        {
            return zzsr[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return zzsr;
    }

    public String getAdUnitId()
    {
        return zzoL;
    }

    public AppEventListener getAppEventListener()
    {
        return zzsq;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zzsW;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (zzsT == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        s = zzsT.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zzsY;
    }

    public void pause()
    {
        try
        {
            if (zzsT != null)
            {
                zzsT.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to call pause.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (zzsT != null)
            {
                zzsT.resume();
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (zzsr != null)
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
        if (zzoL != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            zzoL = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzsq = appeventlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
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
        if (zzsX != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        zzsW = inapppurchaselistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inapppurchaselistener = new zzfk(inapppurchaselistener);
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
        zzsY = oncustomrenderedadloadedlistener;
        if (zzsT == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zzsT;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new zzcj(oncustomrenderedadloadedlistener);
_L3:
        zzr1.zza(oncustomrenderedadloadedlistener);
_L2:
        return;
        oncustomrenderedadloadedlistener = null;
          goto _L3
        oncustomrenderedadloadedlistener;
        zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1)
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
                zzcO();
            }
            if (zzsT.zza(zznH.zza(zzsV.getContext(), zzx1)))
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

    public transient void zza(AdSize aadsize[])
    {
        zzsr = aadsize;
        try
        {
            if (zzsT != null)
            {
                zzsT.zza(new AdSizeParcel(zzsV.getContext(), zzsr));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            zzb.zzd("Failed to set the ad size.", aadsize);
        }
        zzsV.requestLayout();
    }
}
