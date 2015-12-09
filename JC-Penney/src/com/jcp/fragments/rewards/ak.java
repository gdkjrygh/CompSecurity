// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import com.jcp.b.b;
import com.jcp.c.l;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment

class ak
    implements Runnable
{

    final String a;
    final RewardsEnrollFragment b;

    ak(RewardsEnrollFragment rewardsenrollfragment, String s)
    {
        b = rewardsenrollfragment;
        a = s;
        super();
    }

    public void run()
    {
        l l1 = new l(b.i());
        l1.a(b);
        l1.a(com.jcp.b.b.x(a), 0, true);
    }
}
