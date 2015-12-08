// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            GestureDetectorCompat

static interface 
{

    public abstract boolean isLongpressEnabled();

    public abstract boolean onTouchEvent(MotionEvent motionevent);

    public abstract void setIsLongpressEnabled(boolean flag);

    public abstract void setOnDoubleTapListener(android.view.CompatImpl compatimpl);
}
