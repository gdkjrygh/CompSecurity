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

// Referenced classes of package com.pinterest.ui.megaphone:
//            MegaphoneView

final class val.context
    implements android.view.kListener
{

    final Context val$context;
    final DisplayData val$displayData;
    final ExperienceValue val$expValue;
    final MegaphoneView val$nag;

    public final void onClick(View view)
    {
        AnalyticsApi.b(String.format("%s%s_%d", new Object[] {
            "NAG_BT1_", val$expValue.e, Integer.valueOf(val$expValue.b)
        }));
        if (TextUtils.isEmpty(val$displayData.b))
        {
            val$expValue.c();
            Experiences.c(val$expValue.e);
            return;
        } else
        {
            val$nag.setDismissable(false);
            Location.navigateUri(val$context, val$displayData.b);
            return;
        }
    }

    ew()
    {
        val$expValue = experiencevalue;
        val$displayData = displaydata;
        val$nag = megaphoneview;
        val$context = context1;
        super();
    }
}
