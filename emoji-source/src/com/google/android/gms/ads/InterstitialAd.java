// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.av;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final av ky;

    public InterstitialAd(Context context)
    {
        ky = new av(context);
    }

    public AdListener getAdListener()
    {
        return ky.getAdListener();
    }

    public String getAdUnitId()
    {
        return ky.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return ky.getInAppPurchaseListener();
    }

    public boolean isLoaded()
    {
        return ky.isLoaded();
    }

    public void loadAd(AdRequest adrequest)
    {
        ky.a(adrequest.T());
    }

    public void setAdListener(AdListener adlistener)
    {
        ky.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        ky.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        ky.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        ky.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }

    public void show()
    {
        ky.show();
    }
}
