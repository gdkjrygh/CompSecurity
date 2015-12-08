// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.widget.ImageView;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListOverlayDetailFragment

class val.set
    implements android.animation.ListOverlayDetailFragment._cls6
{

    final ListOverlayDetailFragment this$0;
    final AnimatorSet val$set;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        ListOverlayDetailFragment.access$700(ListOverlayDetailFragment.this).setPivotX(0.0F);
        ListOverlayDetailFragment.access$700(ListOverlayDetailFragment.this).setPivotY(0.0F);
        val$set.start();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ()
    {
        this$0 = final_listoverlaydetailfragment;
        val$set = AnimatorSet.this;
        super();
    }
}
