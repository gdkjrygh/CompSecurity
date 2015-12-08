// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.aw;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherInterstitialAd
{

    private final aw kw;

    public PublisherInterstitialAd(Context context)
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

    public AppEventListener getAppEventListener()
    {
        return kw.getAppEventListener();
    }

    public boolean isLoaded()
    {
        return kw.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        kw.a(publisheradrequest.O());
    }

    public void setAdListener(AdListener adlistener)
    {
        kw.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        kw.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        kw.setAppEventListener(appeventlistener);
    }

    public void show()
    {
        kw.show();
    }
}
