// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastCircleFragment

class this._cls0
    implements android.view.eCastCircleFragment._cls3
{

    final MinuteCastCircleFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && !MinuteCastCircleFragment.access$300(MinuteCastCircleFragment.this))
        {
            MinuteCastCircleFragment.access$400(MinuteCastCircleFragment.this);
        }
        return true;
    }

    ()
    {
        this$0 = MinuteCastCircleFragment.this;
        super();
    }
}
