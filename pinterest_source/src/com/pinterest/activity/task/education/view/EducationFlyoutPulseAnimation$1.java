// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationFlyoutPulseAnimation

class this._cls0 extends com.pinterest.kit.utils.
{

    final EducationFlyoutPulseAnimation this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        EducationFlyoutPulseAnimation.access$000(EducationFlyoutPulseAnimation.this).setScaleX(1.0F);
        EducationFlyoutPulseAnimation.access$000(EducationFlyoutPulseAnimation.this).setScaleY(1.0F);
        EducationFlyoutPulseAnimation.access$100(EducationFlyoutPulseAnimation.this).setStartDelay(1500L);
        EducationFlyoutPulseAnimation.access$100(EducationFlyoutPulseAnimation.this).start();
    }

    ()
    {
        this$0 = EducationFlyoutPulseAnimation.this;
        super();
    }
}
