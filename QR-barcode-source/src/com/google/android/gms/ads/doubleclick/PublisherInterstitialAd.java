// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.bi;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherInterstitialAd
{

    private final bi lj;

    public PublisherInterstitialAd(Context context)
    {
        lj = new bi(context, this);
    }

    public AdListener getAdListener()
    {
        return lj.getAdListener();
    }

    public String getAdUnitId()
    {
        return lj.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return lj.getAppEventListener();
    }

    public String getMediationAdapterClassName()
    {
        return lj.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return lj.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        lj.a(publisheradrequest.V());
    }

    public void setAdListener(AdListener adlistener)
    {
        lj.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        lj.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        lj.setAppEventListener(appeventlistener);
    }

    public void show()
    {
        lj.show();
    }
}
