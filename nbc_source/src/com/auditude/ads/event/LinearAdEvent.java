// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.session.IPlaybackSession;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class LinearAdEvent extends AdPluginEvent
{

    public static final String AD_BEGIN = "linearAdBegin";
    public static final String AD_END = "linearAdEnd";
    public static final String AD_PAUSED = "linearAdPaused";
    public static final String AD_RESUMED = "linearAdResumed";
    private ILinearAsset asset;
    private boolean auditudeHandlesAd;
    private IOnPageAsset banners[];
    private IPlaybackSession session;

    public LinearAdEvent(String s, ILinearAsset ilinearasset, IOnPageAsset aionpageasset[], IPlaybackSession iplaybacksession, boolean flag)
    {
        this(s, ilinearasset, aionpageasset, iplaybacksession, flag, null);
    }

    public LinearAdEvent(String s, ILinearAsset ilinearasset, IOnPageAsset aionpageasset[], IPlaybackSession iplaybacksession, boolean flag, HashMap hashmap)
    {
        super(s, hashmap);
        asset = ilinearasset;
        banners = aionpageasset;
        session = iplaybacksession;
        auditudeHandlesAd = flag;
    }

    public final ILinearAsset getAsset()
    {
        return asset;
    }

    public final boolean getAuditudeHandlesAd()
    {
        return auditudeHandlesAd;
    }

    public final IOnPageAsset[] getBanners()
    {
        return banners;
    }

    public final IPlaybackSession getSession()
    {
        return session;
    }
}
