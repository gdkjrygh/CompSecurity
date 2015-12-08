// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.view.MotionEvent;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            ArtworkAdOverlayView

private final class <init>
    implements android.view.layView.TapToClickListener
{

    final ArtworkAdOverlayView this$0;

    public final boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        performClick();
        return true;
    }

    private ()
    {
        this$0 = ArtworkAdOverlayView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
