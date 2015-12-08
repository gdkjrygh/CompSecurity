// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class a
    implements android.view.ner
{

    final SurveyActivity a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view.setBackgroundResource(com.mixpanel.android.xpanel_android_cta_button_highlight);
        } else
        {
            view.setBackgroundResource(com.mixpanel.android.xpanel_android_cta_button);
        }
        return false;
    }

    (SurveyActivity surveyactivity)
    {
        a = surveyactivity;
        super();
    }
}
