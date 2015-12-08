// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.view.View;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseView

class ner extends com.pinterest.ui.scrollview.ScrollViewListener
{

    final EducationPulseView this$0;
    final int val$distance;
    final BaseFragment val$f;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (j > val$distance)
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.USPEND));
            if (val$f != null)
            {
                val$f.setScrollListener(null);
            }
        }
    }

    ner()
    {
        this$0 = final_educationpulseview;
        val$distance = i;
        val$f = BaseFragment.this;
        super();
    }
}
