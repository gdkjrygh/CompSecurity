// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bi;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final bi lj;

    public InterstitialAd(Context context)
    {
        lj = new bi(context);
    }

    public AdListener getAdListener()
    {
        return lj.getAdListener();
    }

    public String getAdUnitId()
    {
        return lj.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return lj.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return lj.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return lj.isLoaded();
    }

    public void loadAd(AdRequest adrequest)
    {
        lj.a(adrequest.V());
    }

    public void setAdListener(AdListener adlistener)
    {
        lj.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        lj.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        lj.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        lj.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        lj.show();
    }
}
