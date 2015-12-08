// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class a
    implements android.content.nClickListener
{

    final SurveyActivity a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.findViewById(com.mixpanel.android._android_activity_survey_id).setVisibility(0);
        SurveyActivity.a(a, true);
        SurveyActivity.a(a, SurveyActivity.d(a));
    }

    r(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }
}
