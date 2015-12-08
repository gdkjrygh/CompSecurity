// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

public class SwipeDetector
    implements android.view.View.OnTouchListener
{
    public static interface SwipeDetectorListener
    {

        public abstract void onTouchMove(MotionEvent motionevent, float f, float f1, float f2, float f3, float f4, float f5);

        public abstract void onTouchUp(MotionEvent motionevent, float f, float f1, float f2, float f3, boolean flag, boolean flag1, 
                boolean flag2, boolean flag3, boolean flag4);
    }


    private static final float DEGREES_180 = 180F;
    private static final float DEGREES_270 = 270F;
    private static final float DEGREES_360 = 360F;
    private static final float DEGREES_90 = 90F;
    private static final float THRESHOLD_ADJUSTMENT_STARTING_COORDINATE = 46F;
    float VELOCITY_PERCENT_OF_NORMAL_SWIPE;
    private boolean mAlwaysInTapRegion;
    private float mClickThreshold;
    private float mClickThresholdSquared;
    private float mDeltaX;
    private float mDeltaY;
    private float mDragOffsetX;
    private float mDragOffsetY;
    private float mEndX;
    private float mEndY;
    private float mLeftBounds;
    private float mRightBounds;
    private float mStartX;
    private float mStartY;
    private SwipeDetectorListener mSwipeDetectorListener;
    private float mSwipeDownAngle;
    private float mSwipeRightAngle;
    private float mSwipeThreshold;
    private float mSwipeUpAngle;
    private boolean mSwipeUpEnabled;
    private float mTopSwipeThreshold;
    private float mUpSwipeVelocitySlop;
    private int mVelocityDistanceMin;
    private int mVelocityDistanceMinSwipeUp;
    private float mVelocitySlop;
    private VelocityTracker mVelocityTracker;
    private float mVelocityX;
    private float mVelocityY;

    public SwipeDetector(SwipeDetectorListener swipedetectorlistener)
    {
        VELOCITY_PERCENT_OF_NORMAL_SWIPE = 0.4F;
        mSwipeRightAngle = 70F;
        mSwipeUpAngle = 15F;
        mSwipeDownAngle = 70F;
        mSwipeDetectorListener = swipedetectorlistener;
    }

    private void calculateSwipeBounds(MotionEvent motionevent, float f, float f1)
    {
        boolean flag;
        boolean flag1;
        boolean flag5;
        boolean flag6;
        f1 = (float)Math.toDegrees(Math.atan2(-f1, f));
        f = f1;
        if (f1 < 0.0F)
        {
            f = f1 + 360F;
        }
        f1 = 360F - mSwipeRightAngle;
        float f2 = mSwipeRightAngle;
        float f3 = 90F - mSwipeUpAngle;
        float f4 = 90F + mSwipeUpAngle;
        float f5 = 180F - mSwipeRightAngle;
        float f6 = 180F + mSwipeRightAngle;
        float f7 = 270F - mSwipeDownAngle;
        float f8 = 270F + mSwipeDownAngle;
        String.format("Swipe boundaries --\nswipeRightStart[%s] swipeRightEnd[%s]\nswipeUpStart[%s] swipeUpEnd[%s]\nswipeLeftStart[%s] swipeLeftEnd[%s]\n +swipeDownStart[%s]swipeDownEnd[%s]\n", new Object[] {
            Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)
        });
        double d;
        double d1;
        StringBuilder stringbuilder;
        int i;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (f >= f1 || f <= f2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f >= f5 && f <= f6)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f >= f3 && f <= f4)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (f >= f7 && f <= f8)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        String.format("swipe detection:\nswipeRight[%s]\nswipeUp[%s]\nswipeLeft[%s]\nswipeDown[%s]\n ", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag2), Boolean.valueOf(flag1), Boolean.valueOf(flag3)
        });
        if (Math.abs(mVelocityY) >= mUpSwipeVelocitySlop && Math.abs(mDeltaY) > (float)mVelocityDistanceMin)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (Math.abs(mVelocityY) < mUpSwipeVelocitySlop && mEndY < mTopSwipeThreshold + 70F && withinLeftRightBounds())
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (f >= 46F && f <= f2)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        stringbuilder = (new StringBuilder("degrees: ")).append(f).append("<= swipeRightBoundaryEnds: (").append(f2).append(") ");
        if (f <= f2)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        stringbuilder = stringbuilder.append(flag6).append(", degrees >= THRESHOLD_ADJUSTMENT_STARTING_COORDINATE):");
        if (f >= 46F)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        stringbuilder.append(flag6);
        d1 = Math.abs(mVelocityX);
        if (flag5)
        {
            d = (double)mVelocitySlop - 0.59999999999999998D;
        } else
        {
            d = mVelocitySlop;
        }
        if (d1 < d)
        {
            break MISSING_BLOCK_LABEL_728;
        }
        f = Math.abs(mDeltaX);
        if (flag5)
        {
            i = mVelocityDistanceMin - 180;
        } else
        {
            i = mVelocityDistanceMin;
        }
        if (f <= (float)i)
        {
            break MISSING_BLOCK_LABEL_728;
        }
        flag6 = true;
_L1:
        (new StringBuilder("velocityDistanceMin:")).append(mVelocityDistanceMin).append("adjustFlingRequirements:").append(flag5);
        if (Math.abs(mDeltaX) > mSwipeThreshold && !flag6 && mEndY > mTopSwipeThreshold + 70F)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (mSwipeUpEnabled && flag2 && (flag3 || flag4))
        {
            String.format("swipe interaction: within coordinate bounds of upSwipe, satisifies isFling[%s] isDrag[%s]", new Object[] {
                Boolean.valueOf(flag3), Boolean.valueOf(flag4)
            });
            mSwipeDetectorListener.onTouchUp(motionevent, mDeltaX, mDeltaY, mVelocityX, mVelocityY, false, false, true, false, false);
            return;
        }
        break MISSING_BLOCK_LABEL_740;
        flag6 = false;
          goto _L1
        if ((flag1 || flag) && (flag6 || flag5))
        {
            String.format("swipe interaction: within bounds of leftSwipe[%s] rightSwipe[%s], satisfies isFling[%s] isDrag[%s]", new Object[] {
                Boolean.valueOf(flag1), Boolean.valueOf(flag), Boolean.valueOf(flag6), Boolean.valueOf(flag5)
            });
            mSwipeDetectorListener.onTouchUp(motionevent, mDeltaX, mDeltaY, mVelocityX, mVelocityY, false, false, false, flag, flag1);
            return;
        } else
        {
            String.format("swipe interaction: within bounds of leftSwipe[%s] rightSwipe[%s], satisfies isFling[%s] isDrag[%s]", new Object[] {
                Boolean.valueOf(flag1), Boolean.valueOf(flag), Boolean.valueOf(flag6), Boolean.valueOf(flag5)
            });
            (new StringBuilder("swipe interaction: non-swipe or dead zone. mDeltaX:")).append(mDeltaX).append(", swipeThreshold:").append(mSwipeThreshold);
            mSwipeDetectorListener.onTouchUp(motionevent, mDeltaX, mDeltaY, mVelocityX, mVelocityY, true, mAlwaysInTapRegion, false, false, false);
            return;
        }
    }

    private boolean withinLeftRightBounds()
    {
        (new StringBuilder("mEndx:")).append(mEndX).append(", getLeftBounds:").append(getLeftBounds()).append(", getRightBounds").append(getRightBounds());
        return mEndX > getLeftBounds() && mEndX < getRightBounds();
    }

    public float getDeltaX()
    {
        return mDeltaX;
    }

    public float getDeltaY()
    {
        return mDeltaY;
    }

    public float getDragOffsetX()
    {
        return mDragOffsetX;
    }

    public float getDragOffsetY()
    {
        return mDragOffsetY;
    }

    public float getEndX()
    {
        return mEndX;
    }

    public float getEndY()
    {
        return mEndY;
    }

    public float getLeftBounds()
    {
        return mLeftBounds;
    }

    public float getRightBounds()
    {
        return mRightBounds;
    }

    public float getStartX()
    {
        return mStartX;
    }

    public float getStartY()
    {
        return mStartY;
    }

    public float getSwipeThreshold()
    {
        return mSwipeThreshold;
    }

    public float getTopSwipeThreshold()
    {
        return mTopSwipeThreshold;
    }

    public float getVelocityX()
    {
        return mVelocityX;
    }

    public float getVelocityY()
    {
        return mVelocityY;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 68
    //                   2 263
    //                   3 426;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        mStartX = motionevent.getRawX();
        mStartY = motionevent.getRawY();
        mVelocityTracker = VelocityTracker.obtain();
        mAlwaysInTapRegion = true;
        return true;
_L3:
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.computeCurrentVelocity(1);
        mVelocityX = mVelocityTracker.getXVelocity();
        mVelocityY = mVelocityTracker.getYVelocity();
        mEndX = motionevent.getRawX();
        mEndY = motionevent.getRawY();
        mDeltaX = motionevent.getRawX() - mStartX;
        mDeltaY = motionevent.getRawY() - mStartY;
        String.format("swipe values: deltaX[%s], deltaY[%s], velocityX[%s], velocityY[%s], upSwipeVelocitySlop[%s], velocityDistanceMinSwipeup[%s], topSwipeThreshold[%s]", new Object[] {
            Float.valueOf(mDeltaX), Float.valueOf(mDeltaY), Float.valueOf(mVelocityX), Float.valueOf(mVelocityY), Float.valueOf(mUpSwipeVelocitySlop), Integer.valueOf(mVelocityDistanceMinSwipeUp), Float.valueOf(mTopSwipeThreshold)
        });
        calculateSwipeBounds(motionevent, mDeltaX, mDeltaY);
        mVelocityTracker.recycle();
        mVelocityTracker = null;
        return true;
_L4:
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        mDeltaX = motionevent.getRawX() - mStartX;
        mDeltaY = motionevent.getRawY() - mStartY;
        if (mAlwaysInTapRegion && mDeltaX * mDeltaX + mDeltaY * mDeltaY > mClickThresholdSquared)
        {
            mAlwaysInTapRegion = false;
        }
        mDragOffsetX = Math.min(1.0F, Math.abs(mDeltaX) / mSwipeThreshold);
        mDragOffsetY = Math.min(1.0F, Math.abs(mDeltaY) / mTopSwipeThreshold);
        mSwipeDetectorListener.onTouchMove(motionevent, mDragOffsetX, mDragOffsetY, mDeltaX, mDeltaY, mVelocityX, mVelocityY);
        return true;
_L5:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setClickThreshold(float f)
    {
        mClickThreshold = f;
        mClickThresholdSquared = mClickThreshold * mClickThreshold;
    }

    public void setLeftBounds(float f)
    {
        mLeftBounds = f;
    }

    public void setMinimumSwipeVelocity(float f)
    {
        mVelocitySlop = f;
    }

    public void setMinimumUpSwipeVelocity(float f)
    {
        mUpSwipeVelocitySlop = f;
    }

    public void setRightBounds(float f)
    {
        mRightBounds = f;
    }

    public void setSwipeBoundaries(float f, float f1)
    {
        setSwipeBoundaries(f, f1, f1);
    }

    public void setSwipeBoundaries(float f, float f1, float f2)
    {
        mSwipeRightAngle = f;
        mSwipeUpAngle = f1;
        mSwipeDownAngle = f2;
    }

    public void setSwipeThreshold(float f)
    {
        mSwipeThreshold = f;
        mVelocityDistanceMin = (int)(VELOCITY_PERCENT_OF_NORMAL_SWIPE * f);
    }

    public void setSwipeUpEnabled(boolean flag)
    {
        mSwipeUpEnabled = flag;
    }

    public void setTopSwipeThreshold(float f)
    {
        mTopSwipeThreshold = f;
        mVelocityDistanceMinSwipeUp = (int)(VELOCITY_PERCENT_OF_NORMAL_SWIPE * f);
    }
}
