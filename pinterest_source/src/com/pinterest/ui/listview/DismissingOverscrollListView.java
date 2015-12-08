// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ListView;

public class DismissingOverscrollListView extends ListView
{

    private boolean _didOverscroll;
    private GestureDetector _gestureDetector;
    private android.view.GestureDetector.SimpleOnGestureListener onSwipeRecognizer;

    public DismissingOverscrollListView(Context context)
    {
        this(context, null);
    }

    public DismissingOverscrollListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DismissingOverscrollListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onSwipeRecognizer = new _cls2();
        init();
    }

    private void init()
    {
        _gestureDetector = new GestureDetector(getContext(), onSwipeRecognizer);
        setSelectionFromTop(0, 1);
        setOnTouchListener(new _cls1());
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 30;
           goto _L1 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        _didOverscroll = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected boolean overScrollBy(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag)
    {
        if (flag)
        {
            boolean flag1;
            if (j < 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            _didOverscroll = flag1;
        }
        return super.overScrollBy(i, j, k, l, i1, j1, k1, l1, flag);
    }



    private class _cls2 extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private final int SWIPE_MAX_OFF_PATH = (int)(Device.getDensity() * 150F);
        private final int SWIPE_MIN_DISTANCE = (int)(Device.getDensity() * 120F);
        private final int SWIPE_THRESHOLD_VELOCITY = (int)(Device.getDensity() * 3000F);
        final DismissingOverscrollListView this$0;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (Math.abs(motionevent.getX() - motionevent1.getX()) > (float)SWIPE_MAX_OFF_PATH)
            {
                return false;
            }
            if (motionevent1.getY() - motionevent.getY() <= (float)SWIPE_MIN_DISTANCE || Math.abs(f1) <= (float)SWIPE_THRESHOLD_VELOCITY)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            motionevent = (Activity)getContext();
            if (motionevent == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            if (!_didOverscroll)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            motionevent.onBackPressed();
            return false;
            motionevent;
            return false;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return super.onScroll(motionevent, motionevent1, f, f1);
        }

        _cls2()
        {
            this$0 = DismissingOverscrollListView.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final DismissingOverscrollListView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            return _gestureDetector != null && _gestureDetector.onTouchEvent(motionevent);
        }

        _cls1()
        {
            this$0 = DismissingOverscrollListView.this;
            super();
        }
    }

}
