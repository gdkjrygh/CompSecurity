// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.slidemenu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import com.arist.MusicPlayer.MyApplication;
import java.util.LinkedList;
import java.util.Queue;

public class SlideHolder extends FrameLayout
{
    public static interface OnSlideListener
    {

        public abstract void onSlideCompleted(boolean flag);
    }

    private class SlideAnimation extends Animation
    {

        private static final float SPEED = 0.6F;
        private float mEnd;
        private float mStart;
        final SlideHolder this$0;

        protected void applyTransformation(float f, Transformation transformation)
        {
            super.applyTransformation(f, transformation);
            float f1 = mEnd;
            float f2 = mStart;
            float f3 = mStart;
            mOffset = (int)((f1 - f2) * f + f3);
            postInvalidate();
        }

        public SlideAnimation(float f, float f1)
        {
            this$0 = SlideHolder.this;
            super();
            mStart = f;
            mEnd = f1;
            setInterpolator(new DecelerateInterpolator());
            setDuration((long)(Math.abs(mEnd - mStart) / 0.6F));
        }
    }


    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = -1;
    protected static final int MODE_FINISHED = 2;
    protected static final int MODE_READY = 0;
    protected static final int MODE_SLIDE = 1;
    private boolean mAlwaysOpened;
    private Bitmap mCachedBitmap;
    private Canvas mCachedCanvas;
    private Paint mCachedPaint;
    private android.view.animation.Animation.AnimationListener mCloseListener = new android.view.animation.Animation.AnimationListener() {

        final SlideHolder this$0;

        public void onAnimationEnd(Animation animation)
        {
            completeClosing();
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
    };
    private boolean mCloseOnRelease;
    private int mDirection;
    private boolean mDispatchWhenOpened;
    private boolean mEnabled;
    private int mEndOffset;
    private byte mFrame;
    private int mHistoricalX;
    private boolean mInterceptTouch;
    private OnSlideListener mListener;
    private View mMenuView;
    private int mMode;
    private int mOffset;
    private android.view.animation.Animation.AnimationListener mOpenListener = new android.view.animation.Animation.AnimationListener() {

        final SlideHolder this$0;

        public void onAnimationEnd(Animation animation)
        {
            completeOpening();
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
    };
    private int mStartOffset;
    private Queue mWhenReady;

    public SlideHolder(Context context)
    {
        super(context);
        mMode = 0;
        mDirection = 1;
        mOffset = 0;
        mEnabled = true;
        mInterceptTouch = true;
        mAlwaysOpened = false;
        mDispatchWhenOpened = false;
        mWhenReady = new LinkedList();
        mFrame = 0;
        mHistoricalX = 0;
        mCloseOnRelease = false;
        initView();
    }

    public SlideHolder(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMode = 0;
        mDirection = 1;
        mOffset = 0;
        mEnabled = true;
        mInterceptTouch = true;
        mAlwaysOpened = false;
        mDispatchWhenOpened = false;
        mWhenReady = new LinkedList();
        mFrame = 0;
        mHistoricalX = 0;
        mCloseOnRelease = false;
        initView();
    }

    public SlideHolder(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMode = 0;
        mDirection = 1;
        mOffset = 0;
        mEnabled = true;
        mInterceptTouch = true;
        mAlwaysOpened = false;
        mDispatchWhenOpened = false;
        mWhenReady = new LinkedList();
        mFrame = 0;
        mHistoricalX = 0;
        mCloseOnRelease = false;
        initView();
    }

    private void completeClosing()
    {
        mOffset = 0;
        requestLayout();
        post(new Runnable() {

            final SlideHolder this$0;

            public void run()
            {
                mMode = 0;
                mMenuView.setVisibility(8);
            }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
        });
        if (mListener != null)
        {
            mListener.onSlideCompleted(false);
        }
    }

    private void completeOpening()
    {
        mOffset = mDirection * mMenuView.getWidth();
        requestLayout();
        post(new Runnable() {

            final SlideHolder this$0;

            public void run()
            {
                mMode = 2;
                mMenuView.setVisibility(0);
            }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
        });
        if (mListener != null)
        {
            mListener.onSlideCompleted(true);
        }
    }

    private void finishSlide()
    {
        if (mDirection * mEndOffset > 0)
        {
            if (mDirection * mOffset > (mDirection * mEndOffset) / 2)
            {
                if (mDirection * mOffset > mDirection * mEndOffset)
                {
                    mOffset = mEndOffset;
                }
                SlideAnimation slideanimation = new SlideAnimation(mOffset, mEndOffset);
                slideanimation.setAnimationListener(mOpenListener);
                startAnimation(slideanimation);
                return;
            }
            if (mDirection * mOffset < mDirection * mStartOffset)
            {
                mOffset = mStartOffset;
            }
            SlideAnimation slideanimation1 = new SlideAnimation(mOffset, mStartOffset);
            slideanimation1.setAnimationListener(mCloseListener);
            startAnimation(slideanimation1);
            return;
        }
        if (mDirection * mOffset < (mDirection * mStartOffset) / 2)
        {
            if (mDirection * mOffset < mDirection * mEndOffset)
            {
                mOffset = mEndOffset;
            }
            SlideAnimation slideanimation2 = new SlideAnimation(mOffset, mEndOffset);
            slideanimation2.setAnimationListener(mCloseListener);
            startAnimation(slideanimation2);
            return;
        }
        if (mDirection * mOffset > mDirection * mStartOffset)
        {
            mOffset = mStartOffset;
        }
        SlideAnimation slideanimation3 = new SlideAnimation(mOffset, mStartOffset);
        slideanimation3.setAnimationListener(mOpenListener);
        startAnimation(slideanimation3);
    }

    private boolean handleTouchEvent(MotionEvent motionevent)
    {
        if (mMenuView.getVisibility() != 8 || MyApplication.getCurrentPage() == 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        float f;
        if (!mEnabled)
        {
            return false;
        }
        f = motionevent.getX();
        if (motionevent.getAction() == 0)
        {
            mHistoricalX = (int)f;
            return true;
        }
        if (motionevent.getAction() != 2) goto _L4; else goto _L3
_L3:
        float f1 = f - (float)mHistoricalX;
        if (((float)mDirection * f1 <= 50F || mMode != 0) && ((float)mDirection * f1 >= -50F || mMode != 2)) goto _L6; else goto _L5
_L5:
        mHistoricalX = (int)f;
        initSlideMode();
_L4:
        if (motionevent.getAction() == 1)
        {
            if (mMode == 1)
            {
                finishSlide();
            }
            mCloseOnRelease = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (mMode != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        mOffset = (int)((float)mOffset + f1);
        mHistoricalX = (int)f;
        if (!isSlideAllowed())
        {
            finishSlide();
        }
        if (true) goto _L4; else goto _L7
_L7:
        return false;
        if (mMode == 1) goto _L1; else goto _L8
_L8:
        return false;
    }

    private void initSlideMode()
    {
        mCloseOnRelease = false;
        View view = getChildAt(1);
        if (mMode == 0)
        {
            mStartOffset = 0;
            mEndOffset = mDirection * getChildAt(0).getWidth();
        } else
        {
            mStartOffset = mDirection * getChildAt(0).getWidth();
            mEndOffset = 0;
        }
        mOffset = mStartOffset;
        if (mCachedBitmap == null || mCachedBitmap.isRecycled() || mCachedBitmap.getWidth() != view.getWidth())
        {
            mCachedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            mCachedCanvas = new Canvas(mCachedBitmap);
        } else
        {
            mCachedCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        }
        view.setVisibility(0);
        mCachedCanvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(mCachedCanvas);
        mMode = 1;
        mMenuView.setVisibility(0);
    }

    private void initView()
    {
        mCachedPaint = new Paint(7);
    }

    private boolean isReadyForSlide()
    {
        return getWidth() > 0 && getHeight() > 0;
    }

    private boolean isSlideAllowed()
    {
        return mDirection * mEndOffset > 0 && mDirection * mOffset < mDirection * mEndOffset && mDirection * mOffset >= mDirection * mStartOffset || mEndOffset == 0 && mDirection * mOffset > mDirection * mEndOffset && mDirection * mOffset <= mDirection * mStartOffset;
    }

    public boolean close()
    {
        if (!isOpened() || mAlwaysOpened || mMode == 1)
        {
            return false;
        }
        if (!isReadyForSlide())
        {
            mWhenReady.add(new Runnable() {

                final SlideHolder this$0;

                public void run()
                {
                    close();
                }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
            });
            return true;
        } else
        {
            initSlideMode();
            SlideAnimation slideanimation = new SlideAnimation(mOffset, mEndOffset);
            slideanimation.setAnimationListener(mCloseListener);
            startAnimation(slideanimation);
            invalidate();
            return true;
        }
    }

    public boolean closeImmediately()
    {
        boolean flag = true;
        if (!isOpened() || mAlwaysOpened || mMode == 1)
        {
            flag = false;
        } else
        {
            if (!isReadyForSlide())
            {
                mWhenReady.add(new Runnable() {

                    final SlideHolder this$0;

                    public void run()
                    {
                        closeImmediately();
                    }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
                });
                return true;
            }
            mMenuView.setVisibility(8);
            mMode = 0;
            requestLayout();
            if (mListener != null)
            {
                mListener.onSlideCompleted(false);
                return true;
            }
        }
        return flag;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        View view;
        if (mMode != 1)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        view = getChildAt(1);
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        if (view.isDirty())
        {
            mCachedCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            view.draw(mCachedCanvas);
        }
_L6:
        int i;
        int j;
        view = getChildAt(0);
        i = view.getScrollX();
        j = view.getScrollY();
        canvas.save();
        if (mDirection != 1) goto _L4; else goto _L3
_L3:
        canvas.clipRect(0.0F, 0.0F, mOffset, view.getHeight(), android.graphics.Region.Op.REPLACE);
_L7:
        canvas.translate(view.getLeft(), view.getTop());
        canvas.translate(-i, -j);
        view.draw(canvas);
        canvas.restore();
        canvas.drawBitmap(mCachedBitmap, mOffset, 0.0F, mCachedPaint);
        return;
_L2:
        byte byte0;
        try
        {
            byte0 = (byte)(mFrame + 1);
            mFrame = byte0;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            return;
        }
        if (byte0 % 5 != 0) goto _L6; else goto _L5
_L5:
        mCachedCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        view.draw(mCachedCanvas);
          goto _L6
_L4:
        int k = view.getWidth();
        int l = view.getLeft();
        canvas.clipRect(l + k + mOffset, 0, l + k, view.getHeight());
          goto _L7
        if (!mAlwaysOpened && mMode == 0)
        {
            mMenuView.setVisibility(8);
        }
        super.dispatchDraw(canvas);
        return;
          goto _L6
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if ((!mEnabled || !mInterceptTouch) && mMode == 0 || mAlwaysOpened)
        {
            flag = super.dispatchTouchEvent(motionevent);
        } else
        {
            if (mMode != 2)
            {
                onTouchEvent(motionevent);
                if (mMode != 1)
                {
                    super.dispatchTouchEvent(motionevent);
                    return true;
                } else
                {
                    motionevent = MotionEvent.obtain(motionevent);
                    motionevent.setAction(3);
                    super.dispatchTouchEvent(motionevent);
                    motionevent.recycle();
                    return true;
                }
            }
            int i = motionevent.getAction();
            Rect rect = new Rect();
            View view = getChildAt(0);
            view.getHitRect(rect);
            if (!rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                if (i == 1 && mCloseOnRelease && !mDispatchWhenOpened)
                {
                    close();
                    mCloseOnRelease = false;
                } else
                {
                    if (i == 0 && !mDispatchWhenOpened)
                    {
                        mCloseOnRelease = true;
                    }
                    onTouchEvent(motionevent);
                }
                if (mDispatchWhenOpened)
                {
                    super.dispatchTouchEvent(motionevent);
                    return true;
                }
            } else
            {
                onTouchEvent(motionevent);
                motionevent.offsetLocation(-view.getLeft(), -view.getTop());
                view.dispatchTouchEvent(motionevent);
                return true;
            }
        }
        return flag;
    }

    public int getMenuOffset()
    {
        return mOffset;
    }

    public boolean isAllowedInterceptTouch()
    {
        return mInterceptTouch;
    }

    public boolean isDispatchTouchWhenOpened()
    {
        return mDispatchWhenOpened;
    }

    public boolean isEnabled()
    {
        return mEnabled;
    }

    public boolean isOpened()
    {
        return mAlwaysOpened || mMode == 2;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = k - i;
        j = l - j;
        Object obj = getChildAt(0);
        k = ((View) (obj)).getMeasuredWidth();
        if (mDirection == 1)
        {
            ((View) (obj)).layout(0, 0, k + 0, j);
        } else
        {
            ((View) (obj)).layout(i - k, 0, i, j);
        }
        if (mAlwaysOpened)
        {
            if (mDirection == 1)
            {
                mOffset = k;
            } else
            {
                mOffset = 0;
            }
        } else
        if (mMode == 2)
        {
            mOffset = mDirection * k;
        } else
        if (mMode == 0)
        {
            mOffset = 0;
        }
        obj = getChildAt(1);
        ((View) (obj)).layout(mOffset + 0, 0, mOffset + 0 + ((View) (obj)).getMeasuredWidth(), j);
        invalidate();
        do
        {
            obj = (Runnable)mWhenReady.poll();
            if (obj == null)
            {
                return;
            }
            ((Runnable) (obj)).run();
        } while (true);
    }

    protected void onMeasure(int i, int j)
    {
        mMenuView = getChildAt(0);
        if (mAlwaysOpened)
        {
            Object obj = getChildAt(1);
            if (mMenuView != null && obj != null)
            {
                measureChild(mMenuView, i, j);
                obj = (android.widget.FrameLayout.LayoutParams)((View) (obj)).getLayoutParams();
                if (mDirection == 1)
                {
                    obj.leftMargin = mMenuView.getMeasuredWidth();
                } else
                {
                    obj.rightMargin = mMenuView.getMeasuredWidth();
                }
            }
        }
        super.onMeasure(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = handleTouchEvent(motionevent);
        invalidate();
        return flag;
    }

    public boolean open()
    {
        if (isOpened() || mAlwaysOpened || mMode == 1)
        {
            return false;
        }
        if (!isReadyForSlide())
        {
            mWhenReady.add(new Runnable() {

                final SlideHolder this$0;

                public void run()
                {
                    open();
                }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
            });
            return true;
        } else
        {
            initSlideMode();
            SlideAnimation slideanimation = new SlideAnimation(mOffset, mEndOffset);
            slideanimation.setAnimationListener(mOpenListener);
            startAnimation(slideanimation);
            invalidate();
            return true;
        }
    }

    public boolean openImmediately()
    {
        boolean flag = true;
        if (isOpened() || mAlwaysOpened || mMode == 1)
        {
            flag = false;
        } else
        {
            if (!isReadyForSlide())
            {
                mWhenReady.add(new Runnable() {

                    final SlideHolder this$0;

                    public void run()
                    {
                        openImmediately();
                    }

            
            {
                this$0 = SlideHolder.this;
                super();
            }
                });
                return true;
            }
            mMenuView.setVisibility(0);
            mMode = 2;
            requestLayout();
            if (mListener != null)
            {
                mListener.onSlideCompleted(true);
                return true;
            }
        }
        return flag;
    }

    public void setAllowInterceptTouch(boolean flag)
    {
        mInterceptTouch = flag;
    }

    public void setAlwaysOpened(boolean flag)
    {
        mAlwaysOpened = flag;
        requestLayout();
    }

    public void setDirection(int i)
    {
        closeImmediately();
        mDirection = i;
    }

    public void setDispatchTouchWhenOpened(boolean flag)
    {
        mDispatchWhenOpened = flag;
    }

    public void setEnabled(boolean flag)
    {
        mEnabled = flag;
    }

    public void setOnSlideListener(OnSlideListener onslidelistener)
    {
        mListener = onslidelistener;
    }

    public void toggle()
    {
        if (isOpened())
        {
            close();
            return;
        } else
        {
            open();
            return;
        }
    }

    public void toggle(boolean flag)
    {
        if (flag)
        {
            toggleImmediately();
            return;
        } else
        {
            toggle();
            return;
        }
    }

    public void toggleImmediately()
    {
        if (isOpened())
        {
            closeImmediately();
            return;
        } else
        {
            openImmediately();
            return;
        }
    }





}
