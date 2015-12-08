// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.MotionEvent;
import android.view.View;
import com.android.a.c;

// Referenced classes of package com.android.slyce.report.surveys:
//            k

class m
    implements android.view.View.OnTouchListener
{

    final k a;

    m(k k)
    {
        a = k;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view.setBackgroundResource(c.com_mixpanel_android_cta_button_highlight);
        } else
        {
            view.setBackgroundResource(c.com_mixpanel_android_cta_button);
        }
        return false;
    }
}
