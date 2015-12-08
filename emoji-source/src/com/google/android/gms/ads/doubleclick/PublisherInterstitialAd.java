// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.av;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherInterstitialAd
{

    private final av ky;

    public PublisherInterstitialAd(Context context)
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

    public AppEventListener getAppEventListener()
    {
        return ky.getAppEventListener();
    }

    public boolean isLoaded()
    {
        return ky.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        ky.a(publisheradrequest.T());
    }

    public void setAdListener(AdListener adlistener)
    {
        ky.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        ky.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        ky.setAppEventListener(appeventlistener);
    }

    public void show()
    {
        ky.show();
    }
}
