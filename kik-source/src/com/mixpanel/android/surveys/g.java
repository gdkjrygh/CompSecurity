// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class g
    implements android.view.View.OnClickListener
{

    final SurveyActivity a;

    g(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
        UpdateDisplayState.a(SurveyActivity.a(a));
    }
}
