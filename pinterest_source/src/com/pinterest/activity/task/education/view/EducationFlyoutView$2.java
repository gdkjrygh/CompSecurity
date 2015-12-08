// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationFlyoutView

class this._cls0 extends com.pinterest.kit.utils.onListener
{

    final EducationFlyoutView this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        if (EducationFlyoutView.access$000(EducationFlyoutView.this))
        {
            if (EducationFlyoutView.access$200(EducationFlyoutView.this) != null && EducationFlyoutView.access$200(EducationFlyoutView.this).getEducation() != null)
            {
                EducationFlyoutView.access$200(EducationFlyoutView.this).getEducation().setTriggered(true);
            }
            Events.post(EducationFlyoutView.access$200(EducationFlyoutView.this));
        }
    }

    ()
    {
        this$0 = EducationFlyoutView.this;
        super();
    }
}
