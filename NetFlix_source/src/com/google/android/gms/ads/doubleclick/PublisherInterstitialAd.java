// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.au;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherInterstitialAd
{

    private final au kv;

    public PublisherInterstitialAd(Context context)
    {
        kv = new au(context);
    }

    public AdListener getAdListener()
    {
        return kv.getAdListener();
    }

    public String getAdUnitId()
    {
        return kv.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return kv.getAppEventListener();
    }

    public boolean isLoaded()
    {
        return kv.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        kv.a(publisheradrequest.O());
    }

    public void setAdListener(AdListener adlistener)
    {
        kv.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        kv.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        kv.setAppEventListener(appeventlistener);
    }

    public void show()
    {
        kv.show();
    }
}
