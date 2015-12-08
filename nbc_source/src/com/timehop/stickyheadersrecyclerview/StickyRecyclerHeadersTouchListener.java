// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.timehop.stickyheadersrecyclerview:
//            StickyRecyclerHeadersAdapter, StickyRecyclerHeadersDecoration

public class StickyRecyclerHeadersTouchListener
    implements android.support.v7.widget.RecyclerView.OnItemTouchListener
{
    public static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick(View view, int i, long l);
    }

    private class SingleTapDetector extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final StickyRecyclerHeadersTouchListener this$0;

        public boolean onDoubleTap(MotionEvent motionevent)
        {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            boolean flag = false;
            int i = mDecor.findHeaderPositionUnder((int)motionevent.getX(), (int)motionevent.getY());
            if (i != -1)
            {
                View view = mDecor.getHeaderView(mRecyclerView, i);
                long l = getAdapter().getHeaderId(i);
                mOnHeaderClickListener.onHeaderClick(view, i, l);
                mRecyclerView.playSoundEffect(0);
                view.onTouchEvent(motionevent);
                flag = true;
            }
            return flag;
        }

        private SingleTapDetector()
        {
            this$0 = StickyRecyclerHeadersTouchListener.this;
            super();
        }

    }


    private final StickyRecyclerHeadersDecoration mDecor;
    private OnHeaderClickListener mOnHeaderClickListener;
    private final RecyclerView mRecyclerView;
    private final GestureDetector mTapDetector;

    public StickyRecyclerHeadersTouchListener(RecyclerView recyclerview, StickyRecyclerHeadersDecoration stickyrecyclerheadersdecoration)
    {
        mTapDetector = new GestureDetector(recyclerview.getContext(), new SingleTapDetector());
        mRecyclerView = recyclerview;
        mDecor = stickyrecyclerheadersdecoration;
    }

    public StickyRecyclerHeadersAdapter getAdapter()
    {
        if (mRecyclerView.getAdapter() instanceof StickyRecyclerHeadersAdapter)
        {
            return (StickyRecyclerHeadersAdapter)mRecyclerView.getAdapter();
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("A RecyclerView with ").append(com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersTouchListener.getSimpleName()).append(" requires a ").append(com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersAdapter.getSimpleName()).toString());
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        return mOnHeaderClickListener != null && mTapDetector.onTouchEvent(motionevent);
    }

    public void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
        mOnHeaderClickListener = onheaderclicklistener;
    }



}
