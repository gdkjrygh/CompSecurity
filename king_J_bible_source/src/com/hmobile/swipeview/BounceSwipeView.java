// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.hmobile.swipeview:
//            SwipeView, AnimationUtil

public class BounceSwipeView extends SwipeView
{
    private class BounceViewOnTouchListener
        implements android.view.View.OnTouchListener
    {

        final BounceSwipeView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (mOnTouchListener != null && mOnTouchListener.onTouch(view, motionevent))
            {
                return true;
            }
            if (!mBounceEnabled) goto _L2; else goto _L1
_L1:
            motionevent.getAction();
            JVM INSTR tableswitch 1 2: default 64
        //                       1 423
        //                       2 66;
               goto _L2 _L3 _L4
_L2:
            return false;
_L4:
            int i = (getPageCount() - 1) * getPageWidth() - getPageWidth() % 2;
            if (getScrollX() == 0 && !mAtEdge || getScrollX() == i && !mAtEdge)
            {
                mAtEdge = true;
                mAtEdgeStartPosition = motionevent.getX();
                mAtEdgePreviousPosition = motionevent.getX();
            } else
            {
                if (getScrollX() == 0)
                {
                    mAtEdgePreviousPosition = motionevent.getX();
                    mBouncingSide = true;
                    setPadding((int)(mAtEdgePreviousPosition - mAtEdgeStartPosition) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                    return true;
                }
                if (getScrollX() >= i)
                {
                    mAtEdgePreviousPosition = motionevent.getX();
                    mBouncingSide = false;
                    int j = (int)(mAtEdgeStartPosition - mAtEdgePreviousPosition) / 2;
                    if (j >= mPaddingRight)
                    {
                        setPadding(getPaddingLeft(), getPaddingTop(), j, getPaddingBottom());
                    } else
                    {
                        setPadding(getPaddingLeft(), getPaddingTop(), mPaddingRight, getPaddingBottom());
                    }
                    scrollTo((int)((float)i + (mAtEdgeStartPosition - mAtEdgePreviousPosition) / 2.0F), getScrollY());
                    return true;
                }
                mAtEdge = false;
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L3:
            if (mAtEdge)
            {
                mAtEdge = false;
                mAtEdgePreviousPosition = 0.0F;
                mAtEdgeStartPosition = 0.0F;
                doBounceBackEaseAnimation();
                return true;
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        private BounceViewOnTouchListener()
        {
            this$0 = BounceSwipeView.this;
            super();
        }

        BounceViewOnTouchListener(BounceViewOnTouchListener bounceviewontouchlistener)
        {
            this();
        }
    }


    private static final int ANIMATION_DURATION = 120;
    private static final boolean BOUNCING_ON_LEFT = true;
    private static final boolean BOUNCING_ON_RIGHT = false;
    private static final int FRAME_DURATION = 30;
    private static final int NUMBER_OF_FRAMES = 4;
    private boolean mAtEdge;
    private float mAtEdgePreviousPosition;
    private float mAtEdgeStartPosition;
    private boolean mBounceEnabled;
    private boolean mBouncingSide;
    private Context mContext;
    private int mCurrentAnimationFrame;
    Handler mEaseAnimationFrameHandler;
    private android.view.View.OnTouchListener mOnTouchListener;
    private int mPaddingChange;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingStartValue;
    private SharedPreferences mSharedPreferences;

    public BounceSwipeView(Context context)
    {
        super(context);
        mAtEdge = false;
        mBounceEnabled = true;
        mContext = context;
        initBounceSwipeView();
    }

    public BounceSwipeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAtEdge = false;
        mBounceEnabled = true;
        mContext = context;
        initBounceSwipeView();
    }

    public BounceSwipeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAtEdge = false;
        mBounceEnabled = true;
        mContext = context;
        initBounceSwipeView();
    }

    private void doBounceBackEaseAnimation()
    {
        if (!mBouncingSide) goto _L2; else goto _L1
_L1:
        mPaddingChange = getPaddingLeft() - mPaddingLeft;
        mPaddingStartValue = getPaddingLeft();
_L4:
        mCurrentAnimationFrame = 0;
        mEaseAnimationFrameHandler.removeMessages(0);
        mEaseAnimationFrameHandler.sendEmptyMessage(0);
        return;
_L2:
        if (!mBouncingSide)
        {
            mPaddingChange = getPaddingRight() - mPaddingRight;
            mPaddingStartValue = getPaddingRight();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void initBounceSwipeView()
    {
        super.setOnTouchListener(new BounceViewOnTouchListener(null));
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        mEaseAnimationFrameHandler = new Handler() {

            final BounceSwipeView this$0;

            public void handleMessage(Message message)
            {
                int i = AnimationUtil.quadraticOutEase(mCurrentAnimationFrame, mPaddingStartValue, -mPaddingChange, 4F);
                if (!mBouncingSide) goto _L2; else goto _L1
_L1:
                setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
_L4:
                message = BounceSwipeView.this;
                message.mCurrentAnimationFrame = ((BounceSwipeView) (message)).mCurrentAnimationFrame + 1;
                if (mCurrentAnimationFrame <= 4)
                {
                    mEaseAnimationFrameHandler.sendEmptyMessageDelayed(0, 30L);
                }
                return;
_L2:
                if (!mBouncingSide)
                {
                    setPadding(getPaddingLeft(), getPaddingTop(), i, getPaddingBottom());
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = BounceSwipeView.this;
                super();
            }
        };
    }

    public void doAtEdgeAnimation()
    {
        if (getCurrentPage() != 0) goto _L2; else goto _L1
_L1:
        mBouncingSide = true;
        setPadding(getPaddingLeft() + 50, getPaddingTop(), getPaddingRight(), getPaddingBottom());
_L4:
        doBounceBackEaseAnimation();
        return;
_L2:
        if (getCurrentPage() == getPageCount() - 1)
        {
            mBouncingSide = false;
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight() + 50, getPaddingBottom());
            scrollTo(getScrollX() + 50, getScrollY());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean getBounceEnabled()
    {
        return mBounceEnabled;
    }

    public void setBounceEnabled(boolean flag)
    {
        mBounceEnabled = flag;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        mOnTouchListener = ontouchlistener;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        mPaddingLeft = i;
        mPaddingRight = k;
        super.setPadding(i, j, k, l);
    }

















}
