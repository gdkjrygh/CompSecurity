// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.customview;

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

// Referenced classes of package com.phunware.nbc.sochi.customview:
//            PageIndicator

public class LinePageIndicator extends View
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


    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mGapWidth;
    private boolean mIsDragging;
    private float mLastMotionX;
    private float mLineWidth;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private final Paint mPaintSelected;
    private final Paint mPaintUnselected;
    private int mTouchSlop;
    private ViewPager mViewPager;

    public LinePageIndicator(Context context)
    {
        this(context, null);
    }

    public LinePageIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010123);
    }

    public LinePageIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mPaintUnselected = new Paint(1);
        mPaintSelected = new Paint(1);
        mLastMotionX = -1F;
        mActivePointerId = -1;
        if (isInEditMode())
        {
            return;
        }
        Object obj = getResources();
        int j = ((Resources) (obj)).getColor(0x7f0e0029);
        int k = ((Resources) (obj)).getColor(0x7f0e002a);
        float f = ((Resources) (obj)).getDimension(0x7f09005f);
        float f1 = ((Resources) (obj)).getDimension(0x7f09005e);
        float f2 = ((Resources) (obj)).getDimension(0x7f090060);
        boolean flag = ((Resources) (obj)).getBoolean(0x7f0b000a);
        attributeset = context.obtainStyledAttributes(attributeset, air.com.nbcuni.com.nbcsports.liveextra.R.styleable.LinePageIndicator, i, 0);
        mCentered = attributeset.getBoolean(1, flag);
        mLineWidth = attributeset.getDimension(5, f);
        mGapWidth = attributeset.getDimension(6, f1);
        setStrokeWidth(attributeset.getDimension(3, f2));
        mPaintUnselected.setColor(attributeset.getColor(4, k));
        mPaintSelected.setColor(attributeset.getColor(2, j));
        obj = attributeset.getDrawable(0);
        if (obj != null)
        {
            setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        }
        attributeset.recycle();
        mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    private int measureHeight(int i)
    {
        int j;
        j = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        if (j != 0x40000000) goto _L2; else goto _L1
_L1:
        float f = i;
_L4:
        return (int)Math.ceil(f);
_L2:
        float f1 = mPaintSelected.getStrokeWidth() + (float)getPaddingTop() + (float)getPaddingBottom();
        f = f1;
        if (j == 0x80000000)
        {
            f = Math.min(f1, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int measureWidth(int i)
    {
        int j;
        j = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        if (j != 0x40000000 && mViewPager != null) goto _L2; else goto _L1
_L1:
        float f = i;
_L4:
        return (int)Math.ceil(f);
_L2:
        int k = mViewPager.getAdapter().getCount();
        float f1 = (float)(getPaddingLeft() + getPaddingRight()) + (float)k * mLineWidth + (float)(k - 1) * mGapWidth;
        f = f1;
        if (j == 0x80000000)
        {
            f = Math.min(f1, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public float getGapWidth()
    {
        return mGapWidth;
    }

    public float getLineWidth()
    {
        return mLineWidth;
    }

    public int getSelectedColor()
    {
        return mPaintSelected.getColor();
    }

    public float getStrokeWidth()
    {
        return mPaintSelected.getStrokeWidth();
    }

    public int getUnselectedColor()
    {
        return mPaintUnselected.getColor();
    }

    public boolean isCentered()
    {
        return mCentered;
    }

    public void notifyDataSetChanged()
    {
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mViewPager != null) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = mViewPager.getAdapter().getCount()) != 0)
        {
            if (mCurrentPage >= j)
            {
                setCurrentItem(j - 1);
                return;
            }
            float f5 = mLineWidth + mGapWidth;
            float f7 = j;
            float f8 = mGapWidth;
            float f = getPaddingTop();
            float f3 = getPaddingLeft();
            float f9 = getPaddingRight();
            float f6 = f + ((float)getHeight() - f - (float)getPaddingBottom()) / 2.0F;
            float f1 = f3;
            f = f1;
            if (mCentered)
            {
                f = f1 + (((float)getWidth() - f3 - f9) / 2.0F - (f7 * f5 - f8) / 2.0F);
            }
            int i = 0;
            while (i < j) 
            {
                float f2 = f + (float)i * f5;
                float f4 = mLineWidth;
                Paint paint;
                if (i == mCurrentPage)
                {
                    paint = mPaintSelected;
                } else
                {
                    paint = mPaintUnselected;
                }
                canvas.drawLine(f2, f6, f2 + f4, f6, paint);
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(measureWidth(i), measureHeight(j));
    }

    public void onPageScrollStateChanged(int i)
    {
        if (mListener != null)
        {
            mListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (mListener != null)
        {
            mListener.onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        mCurrentPage = i;
        invalidate();
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
        int i;
        if (super.onTouchEvent(motionevent))
        {
            return true;
        }
        if (mViewPager == null || mViewPager.getAdapter().getCount() == 0)
        {
            return false;
        }
        i = motionevent.getAction() & 0xff;
        i;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 90
    //                   1 198
    //                   2 110
    //                   3 198
    //                   4 88
    //                   5 349
    //                   6 378;
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
            int l = mViewPager.getAdapter().getCount();
            int i1 = getWidth();
            float f1 = (float)i1 / 2.0F;
            float f3 = (float)i1 / 6F;
            if (mCurrentPage > 0 && motionevent.getX() < f1 - f3)
            {
                if (i != 3)
                {
                    mViewPager.setCurrentItem(mCurrentPage - 1);
                }
                return true;
            }
            if (mCurrentPage < l - 1 && motionevent.getX() > f1 + f3)
            {
                if (i != 3)
                {
                    mViewPager.setCurrentItem(mCurrentPage + 1);
                }
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

    public void setCentered(boolean flag)
    {
        mCentered = flag;
        invalidate();
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

    public void setGapWidth(float f)
    {
        mGapWidth = f;
        invalidate();
    }

    public void setLineWidth(float f)
    {
        mLineWidth = f;
        invalidate();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        mListener = onpagechangelistener;
    }

    public void setSelectedColor(int i)
    {
        mPaintSelected.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f)
    {
        mPaintSelected.setStrokeWidth(f);
        mPaintUnselected.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i)
    {
        mPaintUnselected.setColor(i);
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
            return;
        }
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
        setViewPager(viewpager);
        setCurrentItem(i);
    }
}
