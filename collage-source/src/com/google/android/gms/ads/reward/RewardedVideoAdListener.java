// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.reward;


// Referenced classes of package com.google.android.gms.ads.reward:
//            RewardItem

public interface RewardedVideoAdListener
{

    public abstract void onRewarded(RewardItem rewarditem);

    public abstract void onRewardedVideoAdClosed();

    public abstract void onRewardedVideoAdFailedToLoad(int i);

    public abstract void onRewardedVideoAdLeftApplication();

    public abstract void onRewardedVideoAdLoaded();

    public abstract void onRewardedVideoAdOpened();

    public abstract void onRewardedVideoStarted();
}
