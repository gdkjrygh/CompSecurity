// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationTriggerView

class val.listener extends com.pinterest.kit.utils.nListener
{

    final EducationTriggerView this$0;
    final com.pinterest.kit.utils.nListener val$listener;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        EducationTriggerView.access$200(EducationTriggerView.this).removeListener(val$listener);
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    ()
    {
        this$0 = final_educationtriggerview;
        val$listener = com.pinterest.kit.utils.nListener.this;
        super();
    }
}
