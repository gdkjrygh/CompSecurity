// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.DialogInterface;
import com.jcp.fragments.s;
import com.jcp.fragments.t;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment

class m
    implements android.content.DialogInterface.OnClickListener
{

    final RewardsBonusPointsPromoFragment a;

    m(RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        a = rewardsbonuspointspromofragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        s.a(a.i()).o();
    }
}
