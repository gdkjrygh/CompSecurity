// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zze;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            zzaz, zzdq, zzbd, zzbe, 
//            zzba, zzhw, zzbi, zzhx, 
//            zzaw, zzav, zzau, zzbc, 
//            zzft, zzfx, zzck, zzbo, 
//            zzat

public class zzbp
{

    private zzat zzoJ;
    private AdListener zzoK;
    private final zzdq zzpD;
    private final zzaz zzpE;
    private final AtomicBoolean zzpF;
    private zzbi zzpG;
    private String zzpH;
    private ViewGroup zzpI;
    private InAppPurchaseListener zzpJ;
    private PlayStorePurchaseListener zzpK;
    private OnCustomRenderedAdLoadedListener zzpL;
    private AppEventListener zzpd;
    private AdSize zzpe[];
    private String zzpf;

    public zzbp(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, zzaz.zzbA());
    }

    public zzbp(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, zzaz.zzbA());
    }

    zzbp(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzaz zzaz1)
    {
        this(viewgroup, attributeset, flag, zzaz1, null);
    }

    zzbp(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzaz zzaz1, zzbi zzbi1)
    {
        zzpD = new zzdq();
        zzpI = viewgroup;
        zzpE = zzaz1;
        zzpG = zzbi1;
        zzpF = new AtomicBoolean(false);
        if (attributeset != null)
        {
            zzaz1 = viewgroup.getContext();
            try
            {
                attributeset = new zzbd(zzaz1, attributeset);
                zzpe = attributeset.zzi(flag);
                zzpf = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                zzbe.zzbD().zza(viewgroup, new zzba(zzaz1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                zzbe.zzbD().zza(viewgroup, new zzba(zzaz1, zzpe[0]), "Ads by Google");
            }
        }
    }

    private void zzbN()
    {
        com.google.android.gms.dynamic.zzd zzd = zzpG.zzac();
        if (zzd == null)
        {
            return;
        }
        try
        {
            zzpI.addView((View)zze.zzf(zzd));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void zzbO()
    {
        if ((zzpe == null || zzpf == null) && zzpG == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = zzpI.getContext();
        zzpG = zzbe.zzbE().zza(context, new zzba(context, zzpe), zzpf, zzpD);
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
        zzpG.zza(zzbe.zzbF());
        zzbN();
    }

    public void destroy()
    {
        try
        {
            if (zzpG != null)
            {
                zzpG.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdSize getAdSize()
    {
        Object obj;
        if (zzpG == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = zzpG.zzad();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = ((zzba) (obj)).zzbB();
        return ((AdSize) (obj));
        RemoteException remoteexception;
        remoteexception;
        zzhx.zzd("Failed to get the current AdSize.", remoteexception);
        if (zzpe != null)
        {
            return zzpe[0];
        } else
        {
            return null;
        }
    }

    public void pause()
    {
        try
        {
            if (zzpG != null)
            {
                zzpG.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Failed to call pause.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (zzpG != null)
            {
                zzpG.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Failed to call resume.", remoteexception);
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (zzpe != null)
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
        if (zzpf != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            zzpf = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzpd = appeventlistener;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new zzbc(appeventlistener);
_L3:
        zzbi1.zza(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        zzhx.zzd("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (zzpK != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        zzpJ = inapppurchaselistener;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inapppurchaselistener = new zzft(inapppurchaselistener);
_L3:
        zzbi1.zza(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        zzhx.zzd("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzpL = oncustomrenderedadloadedlistener;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (oncustomrenderedadloadedlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        oncustomrenderedadloadedlistener = new zzck(oncustomrenderedadloadedlistener);
_L3:
        zzbi1.zza(oncustomrenderedadloadedlistener);
_L2:
        return;
        oncustomrenderedadloadedlistener = null;
          goto _L3
        oncustomrenderedadloadedlistener;
        zzhx.zzd("Failed to set the onCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (zzpJ != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        zzpK = playstorepurchaselistener;
        zzpH = s;
        if (zzpG == null) goto _L2; else goto _L1
_L1:
        zzbi zzbi1 = zzpG;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        playstorepurchaselistener = new zzfx(playstorepurchaselistener);
_L3:
        zzbi1.zza(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        zzhx.zzd("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
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
                zzbO();
            }
            if (zzpG.zza(zzpE.zza(zzpI.getContext(), zzbo1)))
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

    public transient void zza(AdSize aadsize[])
    {
        zzpe = aadsize;
        try
        {
            if (zzpG != null)
            {
                zzpG.zza(new zzba(zzpI.getContext(), zzpe));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            zzhx.zzd("Failed to set the ad size.", aadsize);
        }
        zzpI.requestLayout();
    }
}
