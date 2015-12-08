// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationCardView

class  extends com.pinterest.kit.utils.tionListener
{

    final EducationCardView this$0;
    final com.pinterest.kit.utils.tionListener val$listener;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        EducationCardView.access$000(EducationCardView.this, null, val$listener);
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    ()
    {
        this$0 = final_educationcardview;
        val$listener = com.pinterest.kit.utils.tionListener.this;
        super();
    }
}
