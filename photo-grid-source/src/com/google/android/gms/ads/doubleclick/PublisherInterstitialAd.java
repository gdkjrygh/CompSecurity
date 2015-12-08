// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zzaa;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherInterstitialAd
{

    private final zzaa a;

    public PublisherInterstitialAd(Context context)
    {
        a = new zzaa(context, this);
    }

    public final AdListener getAdListener()
    {
        return a.getAdListener();
    }

    public final String getAdUnitId()
    {
        return a.getAdUnitId();
    }

    public final AppEventListener getAppEventListener()
    {
        return a.getAppEventListener();
    }

    public final String getMediationAdapterClassName()
    {
        return a.getMediationAdapterClassName();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return a.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded()
    {
        return a.isLoaded();
    }

    public final void loadAd(PublisherAdRequest publisheradrequest)
    {
        a.zza(publisheradrequest.zzaF());
    }

    public final void setAdListener(AdListener adlistener)
    {
        a.setAdListener(adlistener);
    }

    public final void setAdUnitId(String s)
    {
        a.setAdUnitId(s);
    }

    public final void setAppEventListener(AppEventListener appeventlistener)
    {
        a.setAppEventListener(appeventlistener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        a.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
    }

    public final void show()
    {
        a.show();
    }
}
