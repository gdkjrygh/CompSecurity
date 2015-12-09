// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.widget.LinearLayout;
import android.widget.ScrollView;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsLandingFragment

class at
    implements Runnable
{

    final RewardsLandingFragment a;

    at(RewardsLandingFragment rewardslandingfragment)
    {
        a = rewardslandingfragment;
        super();
    }

    public void run()
    {
        a.scrollView.smoothScrollTo(0, a.rewardsDetails.getTop());
    }
}
