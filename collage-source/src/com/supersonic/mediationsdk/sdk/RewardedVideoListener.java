// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import com.supersonic.mediationsdk.logger.SupersonicError;
import com.supersonic.mediationsdk.model.Placement;

public interface RewardedVideoListener
{

    public abstract void onRewardedVideoAdClosed();

    public abstract void onRewardedVideoAdOpened();

    public abstract void onRewardedVideoAdRewarded(Placement placement);

    public abstract void onRewardedVideoInitFail(SupersonicError supersonicerror);

    public abstract void onRewardedVideoInitSuccess();

    public abstract void onRewardedVideoShowFail(SupersonicError supersonicerror);

    public abstract void onVideoAvailabilityChanged(boolean flag);

    public abstract void onVideoEnd();

    public abstract void onVideoStart();
}
