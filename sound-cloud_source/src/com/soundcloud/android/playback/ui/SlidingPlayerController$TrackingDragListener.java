// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            SlidingPlayerController

private class <init>
    implements android.view..TrackingDragListener
{

    final SlidingPlayerController this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            SlidingPlayerController.access$502(SlidingPlayerController.this, false);
        } else
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            SlidingPlayerController.access$502(SlidingPlayerController.this, true);
            return false;
        }
        return false;
    }

    private ()
    {
        this$0 = SlidingPlayerController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
