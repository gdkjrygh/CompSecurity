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
import com.google.android.gms.b.d;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.lx;
import com.google.android.gms.internal.md;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzh, zzk, zzl, AdSizeParcel, 
//            zzs, zzc, zzj, zzb, 
//            zze, zzy, zza

public class zzz
{

    private final io a;
    private final zzh b;
    private final AtomicBoolean c;
    private AdListener d;
    private com.google.android.gms.ads.internal.client.zza e;
    private zzs f;
    private AdSize g[];
    private String h;
    private String i;
    private ViewGroup j;
    private AppEventListener k;
    private InAppPurchaseListener l;
    private PlayStorePurchaseListener m;
    private OnCustomRenderedAdLoadedListener n;
    private boolean o;

    public zzz(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, zzh.zzcB(), (byte)0);
    }

    public zzz(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, zzh.zzcB(), (byte)0);
    }

    private zzz(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzh zzh1)
    {
        a = new io();
        j = viewgroup;
        b = zzh1;
        f = null;
        c = new AtomicBoolean(false);
        if (attributeset != null)
        {
            zzh1 = viewgroup.getContext();
            try
            {
                attributeset = new zzk(zzh1, attributeset);
                g = attributeset.zzi(flag);
                h = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                zzl.zzcF().zza(viewgroup, new AdSizeParcel(zzh1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                zzl.zzcF().zza(viewgroup, new AdSizeParcel(zzh1, g[0]), "Ads by Google");
            }
        }
    }

    private zzz(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, zzh zzh1, byte byte0)
    {
        this(viewgroup, attributeset, flag, zzh1);
    }

    public void destroy()
    {
        try
        {
            if (f != null)
            {
                f.destroy();
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
        return d;
    }

    public AdSize getAdSize()
    {
        Object obj;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = f.zzaN();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((AdSizeParcel) (obj)).zzcD();
        return ((AdSize) (obj));
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get the current AdSize.", remoteexception);
        if (g != null)
        {
            return g[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return g;
    }

    public String getAdUnitId()
    {
        return h;
    }

    public AppEventListener getAppEventListener()
    {
        return k;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return l;
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
        return n;
    }

    public boolean isLoading()
    {
        boolean flag;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        flag = f.isLoading();
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
            if (f != null)
            {
                f.pause();
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
        if (!c.getAndSet(true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (f == null) goto _L1; else goto _L3
_L3:
        f.zzaP();
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
            if (f != null)
            {
                f.resume();
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (g != null)
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
        if (h != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            h = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        k = appeventlistener;
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
        if (m != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        l = inapppurchaselistener;
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

    public void setManualImpressionsEnabled(boolean flag)
    {
        o = flag;
        try
        {
            if (f != null)
            {
                f.setManualImpressionsEnabled(o);
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
        n = oncustomrenderedadloadedlistener;
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
        zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", oncustomrenderedadloadedlistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (l != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        m = playstorepurchaselistener;
        i = s;
        if (f == null) goto _L2; else goto _L1
_L1:
        zzs zzs1 = f;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
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

    public void zza(com.google.android.gms.ads.internal.client.zza zza1)
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
        if (f != null) goto _L2; else goto _L1
_L1:
        if ((g == null || h == null) && f == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
          goto _L3
_L5:
        return;
_L3:
        android.content.Context context = j.getContext();
        f = zzl.zzcG().zza(context, new AdSizeParcel(context, g), h, a);
        if (d != null)
        {
            f.zza(new zzc(d));
        }
        if (e != null)
        {
            f.zza(new com.google.android.gms.ads.internal.client.zzb(e));
        }
        if (k != null)
        {
            f.zza(new zzj(k));
        }
        if (l != null)
        {
            f.zza(new lx(l));
        }
        if (m != null)
        {
            f.zza(new md(m), i);
        }
        if (n != null)
        {
            f.zza(new dv(n));
        }
        f.zza(zzl.zzcH());
        f.setManualImpressionsEnabled(o);
        com.google.android.gms.b.a a1 = f.zzaM();
        if (a1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        try
        {
            if (f.zzb(b.zza(j.getContext(), zzy1)))
            {
                a.a(zzy1.zzcO());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (zzy zzy1)
        {
            zzb.zzd("Failed to load ad.", zzy1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        j.addView((View)com.google.android.gms.b.d.a(a1));
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Failed to get an ad frame.", remoteexception);
          goto _L2
        if (true) goto _L5; else goto _L6
_L6:
    }

    public transient void zza(AdSize aadsize[])
    {
        g = aadsize;
        try
        {
            if (f != null)
            {
                f.zza(new AdSizeParcel(j.getContext(), g));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            zzb.zzd("Failed to set the ad size.", aadsize);
        }
        j.requestLayout();
    }
}
