// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.widget.Button;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationCardView

class  extends com.pinterest.kit.utils.tionListener
{

    final EducationCardView this$0;
    final com.pinterest.activity.task.education.event.itBt val$type;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        setVisibility(4);
        if (val$type != null)
        {
            Events.post(new EducationEvent(val$type));
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    public void onAnimationStart(Animator animator)
    {
        super.onAnimationStart(animator);
        if (_forwardBt != null)
        {
            _forwardBt.setOnClickListener(null);
        }
        if (_exitBt != null)
        {
            _exitBt.setOnClickListener(null);
        }
    }

    ()
    {
        this$0 = final_educationcardview;
        val$type = com.pinterest.activity.task.education.event.al.type.this;
        super();
    }
}
