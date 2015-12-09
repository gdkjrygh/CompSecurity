// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class a
    implements android.view.ner
{

    private SurveyActivity a;

    public final void onClick(View view)
    {
        a.finish();
        UpdateDisplayState.a(SurveyActivity.b(a));
    }

    ate(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }
}
