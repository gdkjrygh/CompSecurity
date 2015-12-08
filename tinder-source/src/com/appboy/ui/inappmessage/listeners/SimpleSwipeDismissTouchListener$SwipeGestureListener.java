// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.view.MotionEvent;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//            SimpleSwipeDismissTouchListener

private final class <init> extends android.view.er.SwipeGestureListener
{

    private static final int SWIPE_DISTANCE_THRESHOLD = 120;
    private static final int SWIPE_VELOCITY_THRESHOLD = 90;
    final SimpleSwipeDismissTouchListener this$0;

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        f1 = motionevent1.getX() - motionevent.getX();
        float f2 = motionevent1.getY();
        float f3 = motionevent.getY();
        if (Math.abs(f1) > Math.abs(f2 - f3) && Math.abs(f1) > 120F && Math.abs(f) > 90F)
        {
            if (f1 > 0.0F)
            {
                onSwipeRight();
            } else
            {
                onSwipeLeft();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = SimpleSwipeDismissTouchListener.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
