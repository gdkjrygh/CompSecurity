// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment

class a
    implements android.view.View.OnTouchListener
{

    final BaseRewardsEnrollFragment a;
    final BaseRewardsEnrollFragment..ViewInjector b;

    a(BaseRewardsEnrollFragment..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        b = viewinjector;
        a = baserewardsenrollfragment;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onAddressLineOneTouch(view, motionevent);
    }
}
