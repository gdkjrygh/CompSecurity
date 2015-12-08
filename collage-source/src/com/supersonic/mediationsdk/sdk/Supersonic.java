// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import com.supersonic.mediationsdk.logger.LoggingApi;
import com.supersonic.mediationsdk.model.Placement;

// Referenced classes of package com.supersonic.mediationsdk.sdk:
//            InterstitialApi, OfferwallApi, RewardedVideoApi

public interface Supersonic
    extends LoggingApi, InterstitialApi, OfferwallApi, RewardedVideoApi
{

    public abstract Placement getPlacementInfo(String s);

    public abstract void removeInterstitialListener();

    public abstract void removeOfferwallListener();

    public abstract void removeRewardedVideoListener();
}
