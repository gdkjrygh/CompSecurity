// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment

class aj
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final RewardsEnrollFragment a;
    final RewardsEnrollFragment..ViewInjector b;

    aj(RewardsEnrollFragment..ViewInjector viewinjector, RewardsEnrollFragment rewardsenrollfragment)
    {
        b = viewinjector;
        a = rewardsenrollfragment;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.onStateChanged();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
