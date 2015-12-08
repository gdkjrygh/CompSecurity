// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseGraphic, EducationPulseAnimation

class val.pulse extends com.pinterest.kit.utils.stener
{

    final EducationPulseAnimation this$0;
    final EducationPulseGraphic val$pulse;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        val$pulse.setScaleX(0.6F);
        val$pulse.setScaleY(0.6F);
        val$pulse.setTranslationX(EducationPulseAnimation.access$100(EducationPulseAnimation.this));
        val$pulse.setTranslationY(EducationPulseAnimation.access$200(EducationPulseAnimation.this));
        EducationPulseAnimation.access$000(EducationPulseAnimation.this).setStartDelay(500L);
        EducationPulseAnimation.access$000(EducationPulseAnimation.this).start();
    }

    ()
    {
        this$0 = final_educationpulseanimation;
        val$pulse = EducationPulseGraphic.this;
        super();
    }
}
