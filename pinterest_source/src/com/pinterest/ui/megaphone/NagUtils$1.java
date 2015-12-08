// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.experience.DisplayData;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.schemas.experiences.ExperienceCompleteAction;

// Referenced classes of package com.pinterest.ui.megaphone:
//            NagUtils, MegaphoneView

final class val.nag
    implements android.view.kListener
{

    final Context val$context;
    final DisplayData val$displayData;
    final ExperienceValue val$expValue;
    final MegaphoneView val$nag;

    public final void onClick(View view)
    {
        AnalyticsApi.b(String.format("%s%s_%d", new Object[] {
            "NAG_BT2_", val$expValue.e, Integer.valueOf(val$expValue.b)
        }));
        if (!TextUtils.isEmpty(val$displayData.d))
        {
            Location.navigateUri(val$context, val$displayData.d);
            NagUtils.access$000(val$expValue);
        }
        if (ExperienceCompleteAction.COMPLETE.equals(val$displayData.h))
        {
            val$expValue.a();
            val$nag.hide();
            Experiences.c(val$expValue.e);
        } else
        {
            if (ExperienceCompleteAction.COMPLETE_AND_SHOW.equals(val$displayData.h))
            {
                val$expValue.a();
                return;
            }
            if (ExperienceCompleteAction.DONT_COMPLETE_AND_HIDE.equals(val$displayData.h))
            {
                val$nag.hide();
                Experiences.c(val$expValue.e);
                return;
            }
        }
    }

    ew()
    {
        val$expValue = experiencevalue;
        val$displayData = displaydata;
        val$context = context1;
        val$nag = megaphoneview;
        super();
    }
}
