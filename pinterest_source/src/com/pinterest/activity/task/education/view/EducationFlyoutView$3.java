// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationFlyoutView

class val.listener extends com.pinterest.kit.utils.onListener
{

    final EducationFlyoutView this$0;
    final com.pinterest.kit.utils.onListener val$listener;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        EducationFlyoutView.access$300(EducationFlyoutView.this).removeListener(val$listener);
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    ()
    {
        this$0 = final_educationflyoutview;
        val$listener = com.pinterest.kit.utils.onListener.this;
        super();
    }
}
