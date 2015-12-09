// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment

class e
    implements TextWatcher
{

    final RewardsBonusPointsPromoFragment a;
    final RewardsBonusPointsPromoFragment..ViewInjector b;

    e(RewardsBonusPointsPromoFragment..ViewInjector viewinjector, RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        b = viewinjector;
        a = rewardsbonuspointspromofragment;
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
        a.phoneNumberTextChanged(charsequence);
    }
}
