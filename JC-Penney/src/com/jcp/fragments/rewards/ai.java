// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment

class ai
    implements TextWatcher
{

    final RewardsEnrollFragment a;
    final RewardsEnrollFragment..ViewInjector b;

    ai(RewardsEnrollFragment..ViewInjector viewinjector, RewardsEnrollFragment rewardsenrollfragment)
    {
        b = viewinjector;
        a = rewardsenrollfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.onAddressChanged();
    }
}
