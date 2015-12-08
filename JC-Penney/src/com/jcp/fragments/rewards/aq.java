// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsLandingFragment

class aq extends DebouncingOnClickListener
{

    final RewardsLandingFragment a;
    final RewardsLandingFragment..ViewInjector b;

    aq(RewardsLandingFragment..ViewInjector viewinjector, RewardsLandingFragment rewardslandingfragment)
    {
        b = viewinjector;
        a = rewardslandingfragment;
        super();
    }

    public void doClick(View view)
    {
        a.learnMore();
    }
}
