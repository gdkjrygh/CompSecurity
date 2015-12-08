// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.education;

import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;
import com.pinterest.schemas.experiences.Experience;

final class b
    implements Runnable
{

    final BaseFragment a;
    final Education b;

    public final void run()
    {
        while (a != null && !a.isActive() || b.getEid().equals(String.valueOf(Experience.NOOP.getValue()))) 
        {
            return;
        }
        Events.post(new EducationEvent(b));
    }

    l.Education(BaseFragment basefragment, Education education)
    {
        a = basefragment;
        b = education;
        super();
    }
}
