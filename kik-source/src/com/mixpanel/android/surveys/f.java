// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class f
    implements android.view.View.OnTouchListener
{

    final SurveyActivity a;

    f(SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view.setBackgroundResource(com.mixpanel.android.a.b.b);
        } else
        {
            view.setBackgroundResource(com.mixpanel.android.a.b.a);
        }
        return false;
    }
}
