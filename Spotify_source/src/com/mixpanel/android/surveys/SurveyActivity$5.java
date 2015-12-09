// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class a
    implements android.content.nClickListener
{

    private SurveyActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.findViewById(0x7f11031b).setVisibility(0);
        SurveyActivity.d(a);
        SurveyActivity.a(a, SurveyActivity.e(a));
    }

    r(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }
}
