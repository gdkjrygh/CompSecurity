// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import aen;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package org.lucasr.twowayview:
//            ClickItemTouchListener

class mHostView extends android.view.Listener
{

    private final RecyclerView mHostView;
    private View mTargetChild;
    final ClickItemTouchListener this$0;

    public void dispatchSingleTapUpIfNeeded(MotionEvent motionevent)
    {
        if (mTargetChild != null)
        {
            onSingleTapUp(motionevent);
        }
    }

    public boolean onDown(MotionEvent motionevent)
    {
        int i = (int)motionevent.getX();
        int j = (int)motionevent.getY();
        mTargetChild = mHostView.a(i, j);
        return mTargetChild != null;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (mTargetChild != null)
        {
            int i = mHostView.c(mTargetChild);
            long l = mHostView.d.b(i);
            if (performItemLongClick(mHostView, mTargetChild, i, l))
            {
                mTargetChild.setPressed(false);
                mTargetChild = null;
                return;
            }
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        boolean flag = false;
        if (mTargetChild != null)
        {
            mTargetChild.setPressed(false);
            mTargetChild = null;
            flag = true;
        }
        return flag;
    }

    public void onShowPress(MotionEvent motionevent)
    {
        if (mTargetChild != null)
        {
            mTargetChild.setPressed(true);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        boolean flag = false;
        if (mTargetChild != null)
        {
            mTargetChild.setPressed(false);
            int i = mHostView.c(mTargetChild);
            long l = mHostView.d.b(i);
            flag = performItemClick(mHostView, mTargetChild, i, l);
            mTargetChild = null;
        }
        return flag;
    }

    public (RecyclerView recyclerview)
    {
        this$0 = ClickItemTouchListener.this;
        super();
        mHostView = recyclerview;
    }
}
