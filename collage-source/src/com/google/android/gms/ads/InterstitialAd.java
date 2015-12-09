// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzz;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzz zznT;

    public InterstitialAd(Context context)
    {
        zznT = new zzz(context);
    }

    public AdListener getAdListener()
    {
        return zznT.getAdListener();
    }

    public String getAdUnitId()
    {
        return zznT.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zznT.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return zznT.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return zznT.isLoaded();
    }

    public boolean isLoading()
    {
        return zznT.isLoading();
    }

    public void loadAd(AdRequest adrequest)
    {
        zznT.zza(adrequest.zzaF());
    }

    public void setAdListener(AdListener adlistener)
    {
        zznT.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zznT.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zznT.zza(null);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        zznT.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        zznT.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        zznT.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        zznT.show();
    }
}
