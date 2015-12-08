// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.experience:
//            SurveyDisplayData, ExperienceValue, Experiences

final class d
    implements android.widget.temClickListener
{

    final SurveyDisplayData a;
    final Context b;
    final ExperienceValue c;
    final BaseDialog d;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a.b[i].b;
        if (!TextUtils.isEmpty(adapterview))
        {
            ActivityHelper.goIntentView(b, adapterview);
            c.a();
        } else
        {
            c.c();
        }
        AnalyticsApi.b(String.format("%s_%s_%d_%d", new Object[] {
            "SURVEY", c.e, Integer.valueOf(c.b), Integer.valueOf(i)
        }));
        Experiences.c(c.e);
        d.dismiss();
    }

    ialog(SurveyDisplayData surveydisplaydata, Context context, ExperienceValue experiencevalue, BaseDialog basedialog)
    {
        a = surveydisplaydata;
        b = context;
        c = experiencevalue;
        d = basedialog;
        super();
    }
}
