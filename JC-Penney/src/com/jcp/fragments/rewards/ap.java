// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollStaticPageFragment

class ap extends DebouncingOnClickListener
{

    final RewardsEnrollStaticPageFragment a;
    final RewardsEnrollStaticPageFragment..ViewInjector b;

    ap(RewardsEnrollStaticPageFragment..ViewInjector viewinjector, RewardsEnrollStaticPageFragment rewardsenrollstaticpagefragment)
    {
        b = viewinjector;
        a = rewardsenrollstaticpagefragment;
        super();
    }

    public void doClick(View view)
    {
        a.noThanksButton();
    }
}
