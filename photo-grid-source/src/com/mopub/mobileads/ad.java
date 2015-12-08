// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.network.TrackingRequest;

// Referenced classes of package com.mopub.mobileads:
//            ah, MoPubRewardedVideoManager, AdRequestStatusMapping

final class ad extends ah
{

    ad(Class class1, String s)
    {
        super(class1, s);
    }

    protected final void a(String s)
    {
        TrackingRequest.makeTrackingHttpRequest(MoPubRewardedVideoManager.b(MoPubRewardedVideoManager.a()).h(s), MoPubRewardedVideoManager.c(MoPubRewardedVideoManager.a()));
        MoPubRewardedVideoManager.b(MoPubRewardedVideoManager.a()).j(s);
    }
}
