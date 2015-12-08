// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.MotionEvent;

// Referenced classes of package com.tinder.views:
//            DraggableEditText

class this._cls0
    implements android.view.stureListener
{

    final DraggableEditText this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        DraggableEditText.access$000(DraggableEditText.this, Math.round(motionevent1.getRawY() + f) - getHeight() / 2);
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        callOnClick();
        return true;
    }

    eListener()
    {
        this$0 = DraggableEditText.this;
        super();
    }
}
