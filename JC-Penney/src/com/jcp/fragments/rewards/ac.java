// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment

class ac extends DebouncingOnClickListener
{

    final RewardsEnrollFragment a;
    final RewardsEnrollFragment..ViewInjector b;

    ac(RewardsEnrollFragment..ViewInjector viewinjector, RewardsEnrollFragment rewardsenrollfragment)
    {
        b = viewinjector;
        a = rewardsenrollfragment;
        super();
    }

    public void doClick(View view)
    {
        a.createRewardsAccount();
    }
}
