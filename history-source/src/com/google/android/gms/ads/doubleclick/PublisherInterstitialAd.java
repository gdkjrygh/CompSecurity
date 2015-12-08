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

    private final bi lm;

    public PublisherInterstitialAd(Context context)
    {
        lm = new bi(context, this);
    }

    public AdListener getAdListener()
    {
        return lm.getAdListener();
    }

    public String getAdUnitId()
    {
        return lm.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return lm.getAppEventListener();
    }

    public String getMediationAdapterClassName()
    {
        return lm.getMediationAdapterClassName();
    }

    public boolean isLoaded()
    {
        return lm.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        lm.a(publisheradrequest.Y());
    }

    public void setAdListener(AdListener adlistener)
    {
        lm.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        lm.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        lm.setAppEventListener(appeventlistener);
    }

    public void show()
    {
        lm.show();
    }
}
