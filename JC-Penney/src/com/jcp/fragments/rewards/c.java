// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment

class c
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final BaseRewardsEnrollFragment a;
    final BaseRewardsEnrollFragment..ViewInjector b;

    c(BaseRewardsEnrollFragment..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        b = viewinjector;
        a = baserewardsenrollfragment;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.stateSelected(adapterview, view, i, l);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
