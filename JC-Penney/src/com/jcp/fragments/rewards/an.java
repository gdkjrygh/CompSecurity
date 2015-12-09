// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollOptionalInfoFragment

class an extends DebouncingOnClickListener
{

    final RewardsEnrollOptionalInfoFragment a;
    final RewardsEnrollOptionalInfoFragment..ViewInjector b;

    an(RewardsEnrollOptionalInfoFragment..ViewInjector viewinjector, RewardsEnrollOptionalInfoFragment rewardsenrolloptionalinfofragment)
    {
        b = viewinjector;
        a = rewardsenrolloptionalinfofragment;
        super();
    }

    public void doClick(View view)
    {
        a.onSkipClick();
    }
}
