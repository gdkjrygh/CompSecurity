// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.ExperiencesApi;

// Referenced classes of package com.pinterest.experience:
//            ExperienceValue

final class a
    implements com.pinterest.activity.task.dialog.artListener
{

    final ExperienceValue a;

    public final void onStart(BaseDialog basedialog)
    {
        ExperiencesApi.b(a.d);
        AnalyticsApi.b(String.format("%s_%s_%d", new Object[] {
            "SURVEY", a.e, Integer.valueOf(a.b)
        }));
    }

    (ExperienceValue experiencevalue)
    {
        a = experiencevalue;
        super();
    }
}
