// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView, PinGridCell

class istener extends android.view.nGestureListener
{

    final PinterestAdapterView this$0;

    private boolean isEventWithinView(MotionEvent motionevent, View view)
    {
        return PinterestAdapterView.access$700(PinterestAdapterView.this, (int)motionevent.getRawX(), (int)motionevent.getRawY(), view);
    }

    public boolean onDown(MotionEvent motionevent)
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (!(view instanceof PinGridCell))
            {
                view.setPressed(isEventWithinView(motionevent, view));
            }
        }

        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            getChildAt(i).setPressed(false);
        }

        return super.onFling(motionevent, motionevent1, f, f1);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            getChildAt(i).setPressed(false);
        }

        return super.onScroll(motionevent, motionevent1, f, f1);
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (!(view instanceof PinGridCell))
            {
                view.setPressed(false);
            }
        }

        return super.onSingleTapUp(motionevent);
    }

    istener()
    {
        this$0 = PinterestAdapterView.this;
        super();
    }
}
