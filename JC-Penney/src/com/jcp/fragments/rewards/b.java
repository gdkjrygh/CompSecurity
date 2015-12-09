// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment

class b extends DebouncingOnClickListener
{

    final BaseRewardsEnrollFragment a;
    final BaseRewardsEnrollFragment..ViewInjector b;

    b(BaseRewardsEnrollFragment..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        b = viewinjector;
        a = baserewardsenrollfragment;
        super();
    }

    public void doClick(View view)
    {
        a.onBirthDateClick();
    }
}
