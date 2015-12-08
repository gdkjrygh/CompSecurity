// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final SurveyActivity a;

    i(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.findViewById(com.mixpanel.android.a.c.a).setVisibility(0);
        SurveyActivity.c(a);
        SurveyActivity.a(a, SurveyActivity.d(a));
    }
}
