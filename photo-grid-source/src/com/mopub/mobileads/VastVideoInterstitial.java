// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.CacheService;
import com.mopub.mobileads.factories.VastManagerFactory;
import com.mopub.mobileads.util.vast.VastManager;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            ResponseBodyInterstitial, MoPubErrorCode, MraidVideoPlayerActivity

class VastVideoInterstitial extends ResponseBodyInterstitial
    implements com.mopub.mobileads.util.vast.VastManager.VastManagerListener
{

    private CustomEventInterstitial.CustomEventInterstitialListener d;
    private String e;
    private VastManager f;
    private VastVideoConfiguration g;

    VastVideoInterstitial()
    {
    }

    protected final void a(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
    {
        d = customeventinterstitiallistener;
        if (!CacheService.initializeDiskCache(a))
        {
            d.onInterstitialFailed(MoPubErrorCode.VIDEO_CACHE_ERROR);
            return;
        } else
        {
            f = VastManagerFactory.create(a);
            f.prepareVastVideoConfiguration(e, this);
            return;
        }
    }

    protected final void a(Map map)
    {
        e = (String)map.get("Html-Response-Body");
    }

    public void onInvalidate()
    {
        if (f != null)
        {
            f.cancel();
        }
        super.onInvalidate();
    }

    public void onVastVideoConfigurationPrepared(VastVideoConfiguration vastvideoconfiguration)
    {
        if (vastvideoconfiguration == null)
        {
            d.onInterstitialFailed(MoPubErrorCode.VIDEO_DOWNLOAD_ERROR);
            return;
        } else
        {
            g = vastvideoconfiguration;
            d.onInterstitialLoaded();
            return;
        }
    }

    public void showInterstitial()
    {
        MraidVideoPlayerActivity.a(a, g, c);
    }
}
