// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.aw;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final aw kw;

    public InterstitialAd(Context context)
    {
        kw = new aw(context);
    }

    public AdListener getAdListener()
    {
        return kw.getAdListener();
    }

    public String getAdUnitId()
    {
        return kw.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return kw.getInAppPurchaseListener();
    }

    public boolean isLoaded()
    {
        return kw.isLoaded();
    }

    public void loadAd(AdRequest adrequest)
    {
        kw.a(adrequest.O());
    }

    public void setAdListener(AdListener adlistener)
    {
        kw.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        kw.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        kw.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        kw.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        kw.show();
    }
}
