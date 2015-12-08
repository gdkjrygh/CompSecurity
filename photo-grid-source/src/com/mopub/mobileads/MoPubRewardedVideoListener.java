// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.MoPubReward;
import java.util.Set;

// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode

public interface MoPubRewardedVideoListener
{

    public abstract void onRewardedVideoClosed(String s);

    public abstract void onRewardedVideoCompleted(Set set, MoPubReward mopubreward);

    public abstract void onRewardedVideoLoadFailure(String s, MoPubErrorCode mopuberrorcode);

    public abstract void onRewardedVideoLoadSuccess(String s);

    public abstract void onRewardedVideoPlaybackError(String s, MoPubErrorCode mopuberrorcode);

    public abstract void onRewardedVideoStarted(String s);
}
