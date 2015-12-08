// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.view.MotionEvent;
import com.nbcsports.liveextra.ui.core.TouchHelper;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            TimelineGestureWrapper

class this._cls0 extends android.view.estureListener
{

    final TimelineGestureWrapper this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(TimelineGestureWrapper.access$000(TimelineGestureWrapper.this).getDeltaY()) > 125F && Math.abs(f1) > (float)TimelineGestureWrapper.access$000(TimelineGestureWrapper.this).minFlingVelocity)
        {
            if (TimelineGestureWrapper.access$200(TimelineGestureWrapper.this).(com.nbcsports.liveextra.ui.core.))
            {
                TimelineGestureWrapper.access$100(TimelineGestureWrapper.this).onHideTimeline();
                return true;
            }
            if (!TimelineGestureWrapper.access$200(TimelineGestureWrapper.this).(com.nbcsports.liveextra.ui.core.));
        }
        return false;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(TimelineGestureWrapper.access$000(TimelineGestureWrapper.this).getDeltaY()) <= 250F) goto _L2; else goto _L1
_L1:
        if (!TimelineGestureWrapper.access$000(TimelineGestureWrapper.this).getAction().(com.nbcsports.liveextra.ui.core.)) goto _L4; else goto _L3
_L3:
        if (TimelineGestureWrapper.access$100(TimelineGestureWrapper.this) != null) goto _L5; else goto _L2
_L2:
        return false;
_L5:
        TimelineGestureWrapper.access$100(TimelineGestureWrapper.this).onHideTimeline();
        return true;
_L4:
        if (TimelineGestureWrapper.access$000(TimelineGestureWrapper.this).getAction().(com.nbcsports.liveextra.ui.core.))
        {
            return true;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    stener()
    {
        this$0 = TimelineGestureWrapper.this;
        super();
    }
}
