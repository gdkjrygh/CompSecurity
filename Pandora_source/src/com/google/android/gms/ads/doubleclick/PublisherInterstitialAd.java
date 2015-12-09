// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zzv;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherInterstitialAd
{

    private final zzv zzme;

    public PublisherInterstitialAd(Context context)
    {
        zzme = new zzv(context, this);
    }

    public AdListener getAdListener()
    {
        return zzme.getAdListener();
    }

    public String getAdUnitId()
    {
        return zzme.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return zzme.getAppEventListener();
    }

    public String getMediationAdapterClassName()
    {
        return zzme.getMediationAdapterClassName();
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zzme.getOnCustomRenderedAdLoadedListener();
    }

    public boolean isLoaded()
    {
        return zzme.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        zzme.zza(publisheradrequest.zzac());
    }

    public void setAdListener(AdListener adlistener)
    {
        zzme.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        zzme.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zzme.setAppEventListener(appeventlistener);
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzme.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
    }

    public void show()
    {
        zzme.show();
    }
}
