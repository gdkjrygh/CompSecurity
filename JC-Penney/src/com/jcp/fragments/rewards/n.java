// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConfirmationFragment

class n extends DebouncingOnClickListener
{

    final RewardsConfirmationFragment a;
    final RewardsConfirmationFragment..ViewInjector b;

    n(RewardsConfirmationFragment..ViewInjector viewinjector, RewardsConfirmationFragment rewardsconfirmationfragment)
    {
        b = viewinjector;
        a = rewardsconfirmationfragment;
        super();
    }

    public void doClick(View view)
    {
        a.startShopping();
    }
}
