// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.reward;

import com.google.android.gms.ads.AdRequest;

// Referenced classes of package com.google.android.gms.ads.reward:
//            RewardedVideoAdListener

public interface RewardedVideoAd
{

    public abstract void destroy();

    public abstract RewardedVideoAdListener getRewardedVideoAdListener();

    public abstract String getUserId();

    public abstract boolean isLoaded();

    public abstract void loadAd(String s, AdRequest adrequest);

    public abstract void pause();

    public abstract void resume();

    public abstract void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener);

    public abstract void setUserId(String s);

    public abstract void show();
}
