// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator

public class UnderlinePageIndicator extends View
    implements PageIndicator
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int currentPage;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(currentPage);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            currentPage = parcel.readInt();
        }


        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final int FADE_FRAME_MS = 30;
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private int mCurrentPage;
    private int mFadeBy;
    private int mFadeDelay;
    private int mFadeLength;
    private final Runnable mFadeRunnable;
    private boolean mFades;
    private boolean mIsDragging;
    private float mLastMotionX;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private final Paint mPaint;
    private float mPositionOffset;
    private int mScrollState;
    private int mTouchSlop;
    private ViewPager mViewPager;

    public UnderlinePageIndicator(Context context)
    {
        this(context, null);
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, R.attr.vpiUnderlinePageIndicatorStyle);
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPaint = new Paint(1);
        mLastMotionX = -1F;
        mActivePointerId = -1;
        mFadeRunnable = new Runnable() {

            final UnderlinePageIndicator this$0;

            public void run()
            {
                int i1 = Math.max(mPaint.getAlpha() - mFadeBy, 0);
                mPaint.setAlpha(i1);
                invalidate();
                if (i1 > 0)
                {
                    postDelayed(this, 30L);
                }
            }

            
            {
                this$0 = UnderlinePageIndicator.this;
                super();
            }
        };
        if (isInEditMode())
        {
            return;
        } else
        {
            Resources resources = getResources();
            boolean flag = resources.getBoolean(R.bool.default_underline_indicator_fades);
            int j = resources.getInteger(R.integer.default_underline_indicator_fade_delay);
            int k = resources.getInteger(R.integer.default_underline_indicator_fade_length);
            int l = resources.getColor(R.color.default_underline_indicator_selected_color);
            attributeset = context.obtainStyledAttributes(attributeset, R.styleable.UnderlinePageIndicator, i, 0);
            setFades(attributeset.getBoolean(1, flag));
            setSelectedColor(attributeset.getColor(0, l));
            setFadeDelay(attributeset.getInteger(2, j));
            setFadeLength(attributeset.getInteger(3, k));
            attributeset.recycle();
            mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
            return;
        }
    }

    public int getFadeDelay()
    {
        return mFadeDelay;
    }

    public int getFadeLength()
    {
        return mFadeLength;
    }

    public boolean getFades()
    {
        return mFades;
    }

    public int getSelectedColor()
    {
        return mPaint.getColor();
    }

    public void notifyDataSetChanged()
    {
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i;
        if (mViewPager != null)
        {
            if ((i = mViewPager.getAdapter().getCount()) != 0)
            {
                if (mCurrentPage >= i)
                {
                    setCurrentItem(i - 1);
                    return;
                } else
                {
                    int j = getPaddingLeft();
                    float f = (float)(getWidth() - j - getPaddingRight()) / (1.0F * (float)i);
                    float f1 = (float)j + ((float)mCurrentPage + mPositionOffset) * f;
                    canvas.drawRect(f1, getPaddingTop(), f1 + f, getHeight() - getPaddingBottom(), mPaint);
                    return;
                }
            }
        }
    }

    public void onPageScrollStateChanged(int i)
    {
        mScrollState = i;
        if (mListener != null)
        {
            mListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        mCurrentPage = i;
        mPositionOffset = f;
        if (!mFades) goto _L2; else goto _L1
_L1:
        if (j <= 0) goto _L4; else goto _L3
_L3:
        removeCallbacks(mFadeRunnable);
        mPaint.setAlpha(255);
_L2:
        invalidate();
        if (mListener != null)
        {
            mListener.onPageScrolled(i, f, j);
        }
        return;
_L4:
        if (mScrollState != 1)
        {
            postDelayed(mFadeRunnable, mFadeDelay);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onPageSelected(int i)
    {
        if (mScrollState == 0)
        {
            mCurrentPage = i;
            mPositionOffset = 0.0F;
            invalidate();
            mFadeRunnable.run();
        }
        if (mListener != null)
        {
            mListener.onPageSelected(i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        mCurrentPage = ((SavedState) (parcelable)).currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.currentPage = mCurrentPage;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (super.onTouchEvent(motionevent))
        {
            return true;
        }
        if (mViewPager == null || mViewPager.getAdapter().getCount() == 0)
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 84
    //                   0 86
    //                   1 194
    //                   2 106
    //                   3 194
    //                   4 84
    //                   5 333
    //                   6 362;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mLastMotionX = motionevent.getX();
        continue; /* Loop/switch isn't completed */
_L4:
        float f = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        float f2 = f - mLastMotionX;
        if (!mIsDragging && Math.abs(f2) > (float)mTouchSlop)
        {
            mIsDragging = true;
        }
        if (mIsDragging)
        {
            mLastMotionX = f;
            if (mViewPager.isFakeDragging() || mViewPager.beginFakeDrag())
            {
                mViewPager.fakeDragBy(f2);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!mIsDragging)
        {
            int i = mViewPager.getAdapter().getCount();
            int l = getWidth();
            float f1 = (float)l / 2.0F;
            float f3 = (float)l / 6F;
            if (mCurrentPage > 0 && motionevent.getX() < f1 - f3)
            {
                mViewPager.setCurrentItem(mCurrentPage - 1);
                return true;
            }
            if (mCurrentPage < i - 1 && motionevent.getX() > f1 + f3)
            {
                mViewPager.setCurrentItem(mCurrentPage + 1);
                return true;
            }
        }
        mIsDragging = false;
        mActivePointerId = -1;
        if (mViewPager.isFakeDragging())
        {
            mViewPager.endFakeDrag();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int j = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, j);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, j);
        continue; /* Loop/switch isn't completed */
_L6:
        int k = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, k) == mActivePointerId)
        {
            if (k == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, k);
        }
        mLastMotionX = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setCurrentItem(int i)
    {
        if (mViewPager == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            mViewPager.setCurrentItem(i);
            mCurrentPage = i;
            invalidate();
            return;
        }
    }

    public void setFadeDelay(int i)
    {
        mFadeDelay = i;
    }

    public void setFadeLength(int i)
    {
        mFadeLength = i;
        mFadeBy = 255 / (mFadeLength / 30);
    }

    public void setFades(boolean flag)
    {
label0:
        {
            if (flag != mFades)
            {
                mFades = flag;
                if (!flag)
                {
                    break label0;
                }
                post(mFadeRunnable);
            }
            return;
        }
        removeCallbacks(mFadeRunnable);
        mPaint.setAlpha(255);
        invalidate();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        mListener = onpagechangelistener;
    }

    public void setSelectedColor(int i)
    {
        mPaint.setColor(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewpager)
    {
        if (mViewPager == viewpager)
        {
            return;
        }
        if (mViewPager != null)
        {
            mViewPager.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            mViewPager = viewpager;
            mViewPager.setOnPageChangeListener(this);
            invalidate();
            post(new Runnable() {

                final UnderlinePageIndicator this$0;

                public void run()
                {
                    if (mFades)
                    {
                        post(mFadeRunnable);
                    }
                }

            
            {
                this$0 = UnderlinePageIndicator.this;
                super();
            }
            });
            return;
        }
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
        setViewPager(viewpager);
        setCurrentItem(i);
    }




}
