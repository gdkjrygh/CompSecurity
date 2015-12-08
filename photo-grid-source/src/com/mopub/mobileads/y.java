// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mobileads:
//            CustomEventRewardedVideo, MoPubErrorCode, MoPubRewardedVideoManager

final class y
    implements Runnable
{

    final CustomEventRewardedVideo a;
    final MoPubRewardedVideoManager b;

    y(MoPubRewardedVideoManager mopubrewardedvideomanager, CustomEventRewardedVideo customeventrewardedvideo)
    {
        b = mopubrewardedvideomanager;
        a = customeventrewardedvideo;
        super();
    }

    public final void run()
    {
        MoPubLog.d("Custom Event failed to load rewarded video in a timely fashion.");
        MoPubRewardedVideoManager.onRewardedVideoLoadFailure(a.getClass(), a.c(), MoPubErrorCode.NETWORK_TIMEOUT);
    }
}
