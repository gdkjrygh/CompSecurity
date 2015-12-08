// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ArtworkAdOverlayView extends View
{
    private final class TapToClickListener
        implements android.view.GestureDetector.OnGestureListener
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

        private TapToClickListener()
        {
            this$0 = ArtworkAdOverlayView.this;
            super();
        }

        TapToClickListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private final GestureDetectorCompat gestureDetectorCompat;

    public ArtworkAdOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        gestureDetectorCompat = new GestureDetectorCompat(context, new TapToClickListener(null));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        gestureDetectorCompat.onTouchEvent(motionevent);
        return true;
    }
}
