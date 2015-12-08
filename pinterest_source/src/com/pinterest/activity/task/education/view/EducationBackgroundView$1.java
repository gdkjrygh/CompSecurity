// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.app.Activity;
import android.support.v4.view.ModifiedViewPager;
import com.pinterest.activity.task.education.adapter.EducationBackgroundViewAdapter;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationBackgroundView

class this._cls0 extends com.pinterest.kit.utils.stener
{

    final EducationBackgroundView this$0;

    public void onAnimationCancel(Animator animator)
    {
        animator = getContext();
        if ((animator instanceof Activity) && !((Activity)animator).isFinishing())
        {
            EducationBackgroundView.access$000(EducationBackgroundView.this).setCurrentItem(0, false);
            EducationBackgroundView.access$200(EducationBackgroundView.this).setSteps(EducationBackgroundView.access$100(EducationBackgroundView.this));
            setAlpha(0.0F);
            EducationBackgroundView.access$300(EducationBackgroundView.this);
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    Adapter()
    {
        this$0 = EducationBackgroundView.this;
        super();
    }
}
