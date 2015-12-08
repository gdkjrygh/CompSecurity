// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzaa a;

    public InterstitialAd(Context context)
    {
        a = new zzaa(context);
    }

    public final AdListener getAdListener()
    {
        return a.getAdListener();
    }

    public final String getAdUnitId()
    {
        return a.getAdUnitId();
    }

    public final InAppPurchaseListener getInAppPurchaseListener()
    {
        return a.getInAppPurchaseListener();
    }

    public final String getMediationAdapterClassName()
    {
        return a.getMediationAdapterClassName();
    }

    public final boolean isLoaded()
    {
        return a.isLoaded();
    }

    public final boolean isLoading()
    {
        return a.isLoading();
    }

    public final void loadAd(AdRequest adrequest)
    {
        a.zza(adrequest.zzaF());
    }

    public final void setAdListener(AdListener adlistener)
    {
        a.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            a.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            a.zza(null);
            return;
        }
    }

    public final void setAdUnitId(String s)
    {
        a.setAdUnitId(s);
    }

    public final void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        a.setInAppPurchaseListener(inapppurchaselistener);
    }

    public final void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        a.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public final void show()
    {
        a.show();
    }
}
