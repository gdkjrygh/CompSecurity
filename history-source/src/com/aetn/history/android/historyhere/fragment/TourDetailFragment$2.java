// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            TourDetailFragment

class val.showTourInMap
    implements android.animation.ener
{

    final TourDetailFragment this$0;
    final boolean val$showTourInMap;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (!val$showTourInMap)
        {
            getFragmentManager().popBackStack();
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ()
    {
        this$0 = final_tourdetailfragment;
        val$showTourInMap = Z.this;
        super();
    }
}
