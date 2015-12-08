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

    private final bi lm;

    public InterstitialAd(Context context)
    {
        lm = new bi(context);
    }

    public AdListener getAdListener()
    {
        return lm.getAdListener();
    }

    public String getAdUnitId()
    {
        return lm.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return lm.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return lm.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return lm.isLoaded();
    }

    public void loadAd(AdRequest adrequest)
    {
        lm.a(adrequest.Y());
    }

    public void setAdListener(AdListener adlistener)
    {
        lm.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        lm.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        lm.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        lm.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        lm.show();
    }
}
