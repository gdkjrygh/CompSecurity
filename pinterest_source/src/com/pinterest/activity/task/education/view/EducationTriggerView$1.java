// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationTriggerView

class this._cls0 extends com.pinterest.kit.utils.nListener
{

    final EducationTriggerView this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        if (EducationTriggerView.access$000(EducationTriggerView.this))
        {
            if (EducationTriggerView.access$100(EducationTriggerView.this) != null && EducationTriggerView.access$100(EducationTriggerView.this).getEducation() != null)
            {
                EducationTriggerView.access$100(EducationTriggerView.this).getEducation().setTriggered(true);
            }
            Events.post(EducationTriggerView.access$100(EducationTriggerView.this));
        }
    }

    ()
    {
        this$0 = EducationTriggerView.this;
        super();
    }
}
