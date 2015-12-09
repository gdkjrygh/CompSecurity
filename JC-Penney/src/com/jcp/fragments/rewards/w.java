// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsDashboardFragment

class w extends DebouncingOnClickListener
{

    final RewardsDashboardFragment a;
    final RewardsDashboardFragment..ViewInjector b;

    w(RewardsDashboardFragment..ViewInjector viewinjector, RewardsDashboardFragment rewardsdashboardfragment)
    {
        b = viewinjector;
        a = rewardsdashboardfragment;
        super();
    }

    public void doClick(View view)
    {
        a.launchRewardCardActivity();
    }
}
