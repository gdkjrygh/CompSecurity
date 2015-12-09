// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.RelativeLayout;
import com.jcp.util.au;
import com.jcp.widget.f;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment, l

class k extends f
{

    final RewardsBonusPointsPromoFragment a;

    k(RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        a = rewardsbonuspointspromofragment;
        super();
    }

    public void onClick(View view)
    {
        a.greyOutScreen.setVisibility(0);
        au.a(a.i(), a.a(0x7f07035e), a.a(0x7f070172), a.a(0x7f070049), null, new l(this), null);
    }
}
