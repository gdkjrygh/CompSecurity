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

class val.locationState extends com.pinterest.kit.utils.Listener
{

    final is._cls0 this$1;
    final int val$locationState;

    public void onAnimationEnd(Animator animator)
    {
        if (val$locationState != EducationFlyoutView.access$100(_fld0))
        {
            return;
        }
        if (EducationFlyoutView.access$200(_fld0) != null && EducationFlyoutView.access$200(_fld0).getEducation() != null)
        {
            EducationFlyoutView.access$200(_fld0).getEducation().setIsFlyout(false);
        }
        Events.post(EducationFlyoutView.access$200(_fld0));
    }

    ()
    {
        this$1 = final_;
        val$locationState = I.this;
        super();
    }
}
