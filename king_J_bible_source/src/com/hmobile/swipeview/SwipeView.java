// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.swipeview:
//            PageControl

public class SwipeView extends HorizontalScrollView
{
    public static interface OnPageChangedListener
    {

        public abstract void onPageChanged(int i, int j);
    }

    private class SwipeOnTouchListener
        implements android.view.View.OnTouchListener
    {

        private int mDistanceX;
        private boolean mFirstMotionEvent;
        private int mPreviousDirection;
        private boolean mSendingDummyMotionEvent;
        final SwipeView this$0;

        private boolean actionDown(MotionEvent motionevent)
        {
            mMotionStartX = (int)motionevent.getX();
            mMotionStartY = (int)motionevent.getY();
            mFirstMotionEvent = false;
            return false;
        }

        private boolean actionMove(MotionEvent motionevent)
        {
            int j = mMotionStartX - (int)motionevent.getX();
            int i;
            if (j < 0)
            {
                if (mDistanceX + 4 <= j)
                {
                    i = 1;
                } else
                {
                    i = -1;
                }
            } else
            if (mDistanceX - 4 <= j)
            {
                i = 1;
            } else
            {
                i = -1;
            }
            if (i != mPreviousDirection && !mFirstMotionEvent)
            {
                mMotionStartX = (int)motionevent.getX();
                mDistanceX = mMotionStartX - (int)motionevent.getX();
            } else
            {
                mDistanceX = j;
            }
            mPreviousDirection = i;
            if (mJustInterceptedAndIgnored)
            {
                mSendingDummyMotionEvent = true;
                dispatchTouchEvent(MotionEvent.obtain(motionevent.getDownTime(), motionevent.getEventTime(), 0, mMotionStartX, mMotionStartY, motionevent.getPressure(), motionevent.getSize(), motionevent.getMetaState(), motionevent.getXPrecision(), motionevent.getYPrecision(), motionevent.getDeviceId(), motionevent.getEdgeFlags()));
                mJustInterceptedAndIgnored = false;
                return true;
            } else
            {
                return false;
            }
        }

        private boolean actionUp(MotionEvent motionevent)
        {
            float f1 = getScrollX();
            float f = mLinearLayout.getMeasuredWidth() / mPageWidth;
            f1 /= mPageWidth;
            if (mPreviousDirection == 1)
            {
                if (mDistanceX > SwipeView.DEFAULT_SWIPE_THRESHOLD)
                {
                    if ((float)mCurrentPage < f - 1.0F)
                    {
                        f = (int)(f1 + 1.0F) * mPageWidth;
                    } else
                    {
                        f = mCurrentPage * mPageWidth;
                    }
                } else
                if ((float)Math.round(f1) == f - 1.0F)
                {
                    f = (int)(f1 + 1.0F) * mPageWidth;
                } else
                {
                    f = mCurrentPage * mPageWidth;
                }
            } else
            if (mDistanceX < -SwipeView.DEFAULT_SWIPE_THRESHOLD)
            {
                f = (int)f1 * mPageWidth;
            } else
            if (Math.round(f1) == 0)
            {
                f = (int)f1 * mPageWidth;
            } else
            {
                f = mCurrentPage * mPageWidth;
            }
            smoothScrollToPage((int)f / mPageWidth);
            mFirstMotionEvent = true;
            mDistanceX = 0;
            mMostlyScrollingInX = false;
            mMostlyScrollingInY = false;
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if ((mOnTouchListener != null && !mJustInterceptedAndIgnored || mOnTouchListener != null && mSendingDummyMotionEvent) && mOnTouchListener.onTouch(view, motionevent))
            {
                if (motionevent.getAction() == 1)
                {
                    actionUp(motionevent);
                }
                return true;
            }
            if (mSendingDummyMotionEvent)
            {
                mSendingDummyMotionEvent = false;
                return false;
            }
            switch (motionevent.getAction())
            {
            default:
                return false;

            case 0: // '\0'
                return actionDown(motionevent);

            case 2: // '\002'
                return actionMove(motionevent);

            case 1: // '\001'
                return actionUp(motionevent);
            }
        }

        private SwipeOnTouchListener()
        {
            this$0 = SwipeView.this;
            super();
            mSendingDummyMotionEvent = false;
            mFirstMotionEvent = true;
        }

        SwipeOnTouchListener(SwipeOnTouchListener swipeontouchlistener)
        {
            this();
        }
    }


    private static int DEFAULT_SWIPE_THRESHOLD = 60;
    private int SCREEN_WIDTH;
    protected boolean mCallScrollToPageInOnLayout;
    private Context mContext;
    private int mCurrentPage;
    private boolean mJustInterceptedAndIgnored;
    private LinearLayout mLinearLayout;
    private boolean mMostlyScrollingInX;
    private boolean mMostlyScrollingInY;
    private int mMotionStartX;
    private int mMotionStartY;
    private OnPageChangedListener mOnPageChangedListener;
    private android.view.View.OnTouchListener mOnTouchListener;
    private PageControl mPageControl;
    private int mPageWidth;
    private SwipeOnTouchListener mSwipeOnTouchListener;

    public SwipeView(Context context)
    {
        super(context);
        mMostlyScrollingInX = false;
        mMostlyScrollingInY = false;
        mJustInterceptedAndIgnored = false;
        mCallScrollToPageInOnLayout = false;
        mCurrentPage = 0;
        mPageWidth = 0;
        mOnPageChangedListener = null;
        mPageControl = null;
        mContext = context;
        initSwipeView();
    }

    public SwipeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMostlyScrollingInX = false;
        mMostlyScrollingInY = false;
        mJustInterceptedAndIgnored = false;
        mCallScrollToPageInOnLayout = false;
        mCurrentPage = 0;
        mPageWidth = 0;
        mOnPageChangedListener = null;
        mPageControl = null;
        mContext = context;
        initSwipeView();
    }

    public SwipeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMostlyScrollingInX = false;
        mMostlyScrollingInY = false;
        mJustInterceptedAndIgnored = false;
        mCallScrollToPageInOnLayout = false;
        mCurrentPage = 0;
        mPageWidth = 0;
        mOnPageChangedListener = null;
        mPageControl = null;
        mContext = context;
        initSwipeView();
    }

    private void detectMostlyScrollingDirection(MotionEvent motionevent)
    {
        if (!mMostlyScrollingInX && !mMostlyScrollingInY)
        {
            float f = Math.abs((float)mMotionStartX - motionevent.getX());
            float f1 = Math.abs((float)mMotionStartY - motionevent.getY());
            if (f1 > f + 5F)
            {
                mMostlyScrollingInY = true;
            } else
            if (f > f1 + 5F)
            {
                mMostlyScrollingInX = true;
                return;
            }
        }
    }

    private void initSwipeView()
    {
        Log.i("uk.co.jasonfry.android.tools.ui.SwipeView", "Initialising SwipeView");
        mLinearLayout = new LinearLayout(mContext);
        mLinearLayout.setOrientation(0);
        super.addView(mLinearLayout, -1, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setSmoothScrollingEnabled(true);
        setHorizontalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        SCREEN_WIDTH = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getWidth();
        mPageWidth = SCREEN_WIDTH;
        mCurrentPage = 0;
        mSwipeOnTouchListener = new SwipeOnTouchListener(null);
        super.setOnTouchListener(mSwipeOnTouchListener);
    }

    private void scrollToPage(int i, boolean flag)
    {
        boolean flag1 = false;
        int k = mCurrentPage;
        int j;
        if (i >= getPageCount() && getPageCount() > 0)
        {
            j = i - 1;
        } else
        {
            j = i;
            if (i < 0)
            {
                j = 0;
            }
        }
        if (flag)
        {
            smoothScrollTo(mPageWidth * j, 0);
        } else
        {
            scrollTo(mPageWidth * j, 0);
        }
        mCurrentPage = j;
        if (mOnPageChangedListener != null && k != j)
        {
            mOnPageChangedListener.onPageChanged(k, j);
        }
        if (mPageControl != null && k != j)
        {
            mPageControl.setCurrentPage(j);
        }
        if (mCallScrollToPageInOnLayout)
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        mCallScrollToPageInOnLayout = flag;
    }

    public void addView(View view)
    {
        addView(view, -1);
    }

    public void addView(View view, int i)
    {
        Object obj;
        if (view.getLayoutParams() == null)
        {
            obj = new android.widget.FrameLayout.LayoutParams(mPageWidth, -1);
        } else
        {
            obj = view.getLayoutParams();
            obj.width = mPageWidth;
        }
        addView(view, i, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        requestLayout();
        invalidate();
        mLinearLayout.addView(view, i, layoutparams);
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        addView(view, -1, layoutparams);
    }

    public int calculatePageSize(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return setPageWidth(marginlayoutparams.leftMargin + marginlayoutparams.width + marginlayoutparams.rightMargin);
    }

    public LinearLayout getChildContainer()
    {
        return mLinearLayout;
    }

    public int getCurrentPage()
    {
        return mCurrentPage;
    }

    public OnPageChangedListener getOnPageChangedListener()
    {
        return mOnPageChangedListener;
    }

    public PageControl getPageControl()
    {
        return mPageControl;
    }

    public int getPageCount()
    {
        return mLinearLayout.getChildCount();
    }

    public int getPageWidth()
    {
        return mPageWidth;
    }

    public int getSwipeThreshold()
    {
        return DEFAULT_SWIPE_THRESHOLD;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onInterceptTouchEvent(motionevent);
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        mMotionStartX = (int)motionevent.getX();
        mMotionStartY = (int)motionevent.getY();
        if (!mJustInterceptedAndIgnored)
        {
            mMostlyScrollingInX = false;
            mMostlyScrollingInY = false;
        }
_L8:
        if (!mMostlyScrollingInY) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        return flag;
_L2:
        if (motionevent.getAction() == 2)
        {
            detectMostlyScrollingDirection(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!mMostlyScrollingInX) goto _L6; else goto _L5
_L5:
        mJustInterceptedAndIgnored = true;
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (mCallScrollToPageInOnLayout)
        {
            scrollToPage(mCurrentPage);
            mCallScrollToPageInOnLayout = false;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect)
    {
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void requestChildFocus(View view, View view1)
    {
        requestFocus();
    }

    public void scrollToPage(int i)
    {
        scrollToPage(i, false);
    }

    public void setCurrentPage(int i)
    {
        mCurrentPage = i;
    }

    public void setOnPageChangedListener(OnPageChangedListener onpagechangedlistener)
    {
        mOnPageChangedListener = onpagechangedlistener;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        mOnTouchListener = ontouchlistener;
    }

    public void setPageControl(PageControl pagecontrol)
    {
        mPageControl = pagecontrol;
        pagecontrol.setPageCount(getPageCount());
        pagecontrol.setCurrentPage(mCurrentPage);
        pagecontrol.setOnPageControlClickListener(new PageControl.OnPageControlClickListener() {

            final SwipeView this$0;

            public void goBackwards()
            {
                smoothScrollToPage(mCurrentPage - 1);
            }

            public void goForwards()
            {
                smoothScrollToPage(mCurrentPage + 1);
            }

            
            {
                this$0 = SwipeView.this;
                super();
            }
        });
    }

    public int setPageWidth(int i)
    {
        mPageWidth = i;
        return (SCREEN_WIDTH - mPageWidth) / 2;
    }

    public void setSwipeThreshold(int i)
    {
        DEFAULT_SWIPE_THRESHOLD = i;
    }

    public void smoothScrollToPage(int i)
    {
        scrollToPage(i, true);
    }














}
