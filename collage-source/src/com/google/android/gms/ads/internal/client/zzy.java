// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ex;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzg, zzj, zzk, AdSizeParcel, 
//            zzr, zzc, zzi, zzb, 
//            zzx, zze, zza

public class zzy
{

    private final zzg zznK;
    private boolean zzoM;
    private String zzoZ;
    private AppEventListener zzsK;
    private AdSize zzsL[];
    private com.google.android.gms.ads.internal.client.zza zzsn;
    private AdListener zzso;
    private final dh zztk;
    private final AtomicBoolean zztl;
    private zzr zztm;
    private String zztn;
    private ViewGroup zzto;
    private InAppPurchaseListener zztp;
    private PlayStorePurchaseListener zztq;
    private OnCustomRenderedAdLoadedListener zztr;

    public zzy(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, zzg.zzcA());
    }

    public zzy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, zzg.zzcA());
    }

    zzy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzg zzg1)
    {
        this(viewgroup, attributeset, flag, zzg1, null);
    }

    zzy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzg zzg1, zzr zzr1)
    {
        zztk = new dh();
        zzto = viewgroup;
        zznK = zzg1;
        zztm = zzr1;
        zztl = new AtomicBoolean(false);
        if (attributeset != null)
        {
            zzg1 = viewgroup.getContext();
            try
            {
                attributeset = new zzj(zzg1, attributeset);
                zzsL = attributeset.zzi(flag);
                zzoZ = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                zzk.zzcE().zza(viewgroup, new AdSizeParcel(zzg1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                zzk.zzcE().zza(viewgroup, new AdSizeParcel(zzg1, zzsL[0]), "Ads by Google");
            }
        }
    }

    private void zzcR()
    {
        com.google.android.gms.a.a a = zztm.zzaM();
        if (a == null)
        {
            return;
        }
        try
        {
            zzto.addView((View)b.a(a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    public void destroy()
    {
        try
        {
            if (zztm != null)
            {
                zztm.destroy();
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
        return zzso;
    }

    public AdSize getAdSize()
    {
        Object obj;
        if (zztm == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = zztm.zzaN();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((AdSizeParcel) (obj)).zzcC();
        return ((AdSize) (obj));
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the current AdSize.", remoteexception);
        if (zzsL != null)
        {
            return zzsL[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return zzsL;
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

    public boolean isLoading()
    {
        boolean flag;
        if (zztm == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        flag = zztm.isLoading();
        return flag;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to check if ad is loading.", remoteexception);
        return false;
    }

    public void pause()
    {
        try
        {
            if (zztm != null)
            {
                zztm.pause();
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
        if (!zztl.getAndSet(true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (zztm == null) goto _L1; else goto _L3
_L3:
        zztm.zzaP();
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
            if (zztm != null)
            {
                zztm.resume();
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (zzsL != null)
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
        if (zzoZ != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
            break MISSING_BLOCK_LABEL_56;
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

    public void setManualImpressionsEnabled(boolean flag)
    {
        zzoM = flag;
        try
        {
            if (zztm != null)
            {
                zztm.setManualImpressionsEnabled(zzoM);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to set manual impressions.", remoteexception);
        }
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
        zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (zztp != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        zztq = playstorepurchaselistener;
        zztn = s;
        if (zztm == null) goto _L2; else goto _L1
_L1:
        zzr zzr1 = zztm;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
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

    public void zza(com.google.android.gms.ads.internal.client.zza zza1)
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
                zzcS();
            }
            if (zztm.zza(zznK.zza(zzto.getContext(), zzx1)))
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

    public transient void zza(AdSize aadsize[])
    {
        zzsL = aadsize;
        try
        {
            if (zztm != null)
            {
                zztm.zza(new AdSizeParcel(zzto.getContext(), zzsL));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            zzb.zzd("Failed to set the ad size.", aadsize);
        }
        zzto.requestLayout();
    }

    void zzcS()
        throws RemoteException
    {
        if ((zzsL == null || zzoZ == null) && zztm == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        zztm = zzcT();
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
        zztm.zza(zzk.zzcG());
        zztm.setManualImpressionsEnabled(zzoM);
        zzcR();
    }

    protected zzr zzcT()
        throws RemoteException
    {
        android.content.Context context = zzto.getContext();
        return zzk.zzcF().zza(context, new AdSizeParcel(context, zzsL), zzoZ, zztk);
    }
}
