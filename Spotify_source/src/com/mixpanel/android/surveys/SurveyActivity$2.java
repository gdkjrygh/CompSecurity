// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class 
    implements android.view.ner
{

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view.setBackgroundResource(0x7f020154);
        } else
        {
            view.setBackgroundResource(0x7f020153);
        }
        return false;
    }

    ()
    {
    }
}
