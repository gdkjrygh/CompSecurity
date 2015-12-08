// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;


// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment

class j
    implements Runnable
{

    final RewardsBonusPointsPromoFragment a;

    j(RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        a = rewardsbonuspointspromofragment;
        super();
    }

    public void run()
    {
        RewardsBonusPointsPromoFragment.a(a);
    }
}
