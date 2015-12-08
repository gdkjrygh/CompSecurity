// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseAnimation

class this._cls0 extends com.pinterest.kit.utils.stener
{

    final EducationPulseAnimation this$0;

    public void onAnimationCancel(Animator animator)
    {
        if (EducationPulseAnimation.access$000(EducationPulseAnimation.this) != null)
        {
            EducationPulseAnimation.access$000(EducationPulseAnimation.this).setStartDelay(600L);
            EducationPulseAnimation.access$000(EducationPulseAnimation.this).start();
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(null);
    }

    ()
    {
        this$0 = EducationPulseAnimation.this;
        super();
    }
}
