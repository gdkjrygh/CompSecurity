// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.DialogInterface;
import com.jcp.e.ag;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment

class al
    implements android.content.DialogInterface.OnClickListener
{

    final RewardsEnrollFragment a;

    al(RewardsEnrollFragment rewardsenrollfragment)
    {
        a = rewardsenrollfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.h.a(false, true);
    }
}
