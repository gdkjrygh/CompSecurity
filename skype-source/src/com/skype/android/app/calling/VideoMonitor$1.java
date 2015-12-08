// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.skype.android.calling.CallView;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor

final class this._cls0 extends View
{

    final int locationOnScreen[] = new int[2];
    final VideoMonitor this$0;

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (VideoMonitor.access$000(VideoMonitor.this) != null)
        {
            VideoMonitor.access$000(VideoMonitor.this).getLocationOnScreen(locationOnScreen);
            motionevent.setLocation(motionevent.getRawX() - (float)locationOnScreen[0], motionevent.getRawY() - (float)locationOnScreen[1]);
            flag = VideoMonitor.access$000(VideoMonitor.this).dispatchTouchEvent(motionevent);
        }
        return flag;
    }

    (Context context)
    {
        this$0 = VideoMonitor.this;
        super(context);
    }
}
