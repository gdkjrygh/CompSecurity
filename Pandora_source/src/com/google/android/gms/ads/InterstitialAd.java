// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzv zzme;

    public InterstitialAd(Context context)
    {
        zzme = new zzv(context);
    }

    public AdListener getAdListener()
    {
        return zzme.getAdListener();
    }

    public String getAdUnitId()
    {
        return zzme.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zzme.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return zzme.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return zzme.isLoaded();
    }

    public void loadAd(AdRequest adrequest)
    {
        zzme.zza(adrequest.zzac());
    }

    public void setAdListener(AdListener adlistener)
    {
        zzme.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zzme.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zzme.zza(null);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        zzme.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        zzme.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        zzme.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        zzme.show();
    }
}
