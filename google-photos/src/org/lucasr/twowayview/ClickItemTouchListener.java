// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import afb;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import kp;

abstract class ClickItemTouchListener
    implements afb
{

    private static final String LOGTAG = "ClickItemTouchListener";
    private final kp mGestureDetector;

    ClickItemTouchListener(RecyclerView recyclerview)
    {
        mGestureDetector = new ItemClickGestureDetector(recyclerview.getContext(), new ItemClickGestureListener(recyclerview));
    }

    private boolean hasAdapter(RecyclerView recyclerview)
    {
        return recyclerview.d != null;
    }

    private boolean isAttachedToWindow(RecyclerView recyclerview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return recyclerview.isAttachedToWindow();
        }
        return recyclerview.getHandler() != null;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        if (!isAttachedToWindow(recyclerview) || !hasAdapter(recyclerview))
        {
            return false;
        } else
        {
            mGestureDetector.onTouchEvent(motionevent);
            return false;
        }
    }

    public void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
    }

    abstract boolean performItemClick(RecyclerView recyclerview, View view, int i, long l);

    abstract boolean performItemLongClick(RecyclerView recyclerview, View view, int i, long l);

    private class ItemClickGestureDetector extends kp
    {

        private final ItemClickGestureListener mGestureListener;
        final ClickItemTouchListener this$0;

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if ((motionevent.getAction() & 0xff) == 1)
            {
                mGestureListener.dispatchSingleTapUpIfNeeded(motionevent);
            }
            return flag;
        }

        public ItemClickGestureDetector(Context context, ItemClickGestureListener itemclickgesturelistener)
        {
            this$0 = ClickItemTouchListener.this;
            super(context, itemclickgesturelistener);
            mGestureListener = itemclickgesturelistener;
        }
    }


    private class ItemClickGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
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

        public ItemClickGestureListener(RecyclerView recyclerview)
        {
            this$0 = ClickItemTouchListener.this;
            super();
            mHostView = recyclerview;
        }
    }

}
