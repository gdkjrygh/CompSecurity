// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.DialogInterface;
import android.widget.RelativeLayout;

// Referenced classes of package com.jcp.fragments.rewards:
//            k, RewardsBonusPointsPromoFragment

class l
    implements android.content.DialogInterface.OnClickListener
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.greyOutScreen.setVisibility(8);
    }
}
