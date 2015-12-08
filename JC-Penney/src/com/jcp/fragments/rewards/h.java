// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment

class h extends DebouncingOnClickListener
{

    final RewardsBonusPointsPromoFragment a;
    final RewardsBonusPointsPromoFragment..ViewInjector b;

    h(RewardsBonusPointsPromoFragment..ViewInjector viewinjector, RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        b = viewinjector;
        a = rewardsbonuspointspromofragment;
        super();
    }

    public void doClick(View view)
    {
        a.enrollNow();
    }
}
