// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.MotionEvent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor

final class istener extends android.view..SimpleOnGestureListener
{

    final VideoMonitor this$0;

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        if (!VideoMonitor.access$300(VideoMonitor.this))
        {
            VideoMonitor.access$302(VideoMonitor.this, true);
            VideoMonitor.access$400().info("TAP doubletap");
            VideoMonitor.access$500(VideoMonitor.this);
            analytics.c(AnalyticsEvent.bb);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (!VideoMonitor.access$300(VideoMonitor.this))
        {
            VideoMonitor.access$302(VideoMonitor.this, true);
            VideoMonitor.access$400().info("TAP single confrmd");
            VideoMonitor.access$500(VideoMonitor.this);
            analytics.c(AnalyticsEvent.be);
            return true;
        } else
        {
            return false;
        }
    }

    istener()
    {
        this$0 = VideoMonitor.this;
        super();
    }
}
