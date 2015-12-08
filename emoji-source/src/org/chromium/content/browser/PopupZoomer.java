// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;

class PopupZoomer extends View
{
    public static interface OnTapListener
    {

        public abstract boolean onLongPress(View view, MotionEvent motionevent);

        public abstract boolean onSingleTap(View view, MotionEvent motionevent);
    }

    public static interface OnVisibilityChangedListener
    {

        public abstract void onPopupZoomerHidden(PopupZoomer popupzoomer);

        public abstract void onPopupZoomerShown(PopupZoomer popupzoomer);
    }

    private static class ReverseInterpolator
        implements Interpolator
    {

        private final Interpolator mInterpolator;

        public float getInterpolation(float f)
        {
            f = 1.0F - f;
            if (mInterpolator == null)
            {
                return f;
            } else
            {
                return mInterpolator.getInterpolation(f);
            }
        }

        public ReverseInterpolator(Interpolator interpolator)
        {
            mInterpolator = interpolator;
        }
    }


    private static final long ANIMATION_DURATION = 300L;
    private static final String LOGTAG = "PopupZoomer";
    private static final int ZOOM_BOUNDS_MARGIN = 25;
    private static float sOverlayCornerRadius;
    private static Drawable sOverlayDrawable;
    private static Rect sOverlayPadding;
    private boolean mAnimating;
    private long mAnimationStartTime;
    private float mBottomExtrusion;
    private RectF mClipRect;
    private RectF mDrawRect;
    private GestureDetector mGestureDetector;
    private final Interpolator mHideInterpolator;
    private float mLeftExtrusion;
    private float mMaxScrollX;
    private float mMaxScrollY;
    private float mMinScrollX;
    private float mMinScrollY;
    private boolean mNeedsToInitDimensions;
    private OnTapListener mOnTapListener;
    private OnVisibilityChangedListener mOnVisibilityChangedListener;
    private float mPopupScrollX;
    private float mPopupScrollY;
    private float mRightExtrusion;
    private float mScale;
    private float mShiftX;
    private float mShiftY;
    private final Interpolator mShowInterpolator = new OvershootInterpolator();
    private boolean mShowing;
    private Rect mTargetBounds;
    private long mTimeLeft;
    private float mTopExtrusion;
    private final PointF mTouch = new PointF();
    private RectF mViewClipRect;
    private Bitmap mZoomedBitmap;

    public PopupZoomer(Context context)
    {
        super(context);
        mOnTapListener = null;
        mOnVisibilityChangedListener = null;
        mHideInterpolator = new ReverseInterpolator(mShowInterpolator);
        mAnimating = false;
        mShowing = false;
        mAnimationStartTime = 0L;
        mTimeLeft = 0L;
        mShiftX = 0.0F;
        mShiftY = 0.0F;
        mScale = 1.0F;
        setVisibility(4);
        setFocusable(true);
        setFocusableInTouchMode(true);
        mGestureDetector = new GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() {

            final PopupZoomer this$0;

            private boolean handleTapOrPress(MotionEvent motionevent, boolean flag)
            {
                if (!mAnimating)
                {
                    float f = motionevent.getX();
                    float f1 = motionevent.getY();
                    if (isTouchOutsideArea(f, f1))
                    {
                        hide(true);
                        return true;
                    }
                    if (mOnTapListener != null)
                    {
                        PointF pointf = convertTouchPoint(f, f1);
                        motionevent = MotionEvent.obtainNoHistory(motionevent);
                        motionevent.setLocation(pointf.x, pointf.y);
                        if (flag)
                        {
                            mOnTapListener.onLongPress(PopupZoomer.this, motionevent);
                        } else
                        {
                            mOnTapListener.onSingleTap(PopupZoomer.this, motionevent);
                        }
                        hide(true);
                        return true;
                    }
                }
                return true;
            }

            public void onLongPress(MotionEvent motionevent)
            {
                handleTapOrPress(motionevent, true);
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                if (mAnimating)
                {
                    return true;
                }
                if (isTouchOutsideArea(motionevent.getX(), motionevent.getY()))
                {
                    hide(true);
                    return true;
                } else
                {
                    scroll(f, f1);
                    return true;
                }
            }

            public boolean onSingleTapUp(MotionEvent motionevent)
            {
                return handleTapOrPress(motionevent, false);
            }

            
            {
                this$0 = PopupZoomer.this;
                super();
            }
        });
    }

    private static float constrain(float f, float f1, float f2)
    {
        if (f < f1)
        {
            return f1;
        }
        if (f > f2)
        {
            return f2;
        } else
        {
            return f;
        }
    }

    private static int constrain(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    private PointF convertTouchPoint(float f, float f1)
    {
        float f2 = mShiftX;
        float f3 = mShiftY;
        return new PointF(mTouch.x + (f - f2 - mTouch.x - mPopupScrollX) / mScale, mTouch.y + (f1 - f3 - mTouch.y - mPopupScrollY) / mScale);
    }

    private static float getOverlayCornerRadius(Context context)
    {
        if (sOverlayCornerRadius == 0.0F)
        {
            try
            {
                sOverlayCornerRadius = context.getResources().getDimension(org.chromium.content.R.dimen.link_preview_overlay_radius);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("PopupZoomer", "No corner radius resource for PopupZoomer overlay found.");
                sOverlayCornerRadius = 1.0F;
            }
        }
        return sOverlayCornerRadius;
    }

    private static Drawable getOverlayDrawable(Context context)
    {
        if (sOverlayDrawable == null)
        {
            try
            {
                sOverlayDrawable = context.getResources().getDrawable(org.chromium.content.R.drawable.ondemand_overlay);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("PopupZoomer", "No drawable resource for PopupZoomer overlay found.");
                sOverlayDrawable = new ColorDrawable();
            }
            sOverlayPadding = new Rect();
            sOverlayDrawable.getPadding(sOverlayPadding);
        }
        return sOverlayDrawable;
    }

    private void hideImmediately()
    {
        mAnimating = false;
        mShowing = false;
        mTimeLeft = 0L;
        if (mOnVisibilityChangedListener != null)
        {
            mOnVisibilityChangedListener.onPopupZoomerHidden(this);
        }
        setVisibility(4);
        mZoomedBitmap.recycle();
        mZoomedBitmap = null;
    }

    private void initDimensions()
    {
        if (mTargetBounds == null || mTouch == null)
        {
            return;
        }
        mScale = (float)mZoomedBitmap.getWidth() / (float)mTargetBounds.width();
        float f = mTouch.x - mScale * (mTouch.x - (float)mTargetBounds.left);
        float f1 = mTouch.y - mScale * (mTouch.y - (float)mTargetBounds.top);
        mClipRect = new RectF(f, f1, f + (float)mZoomedBitmap.getWidth(), f1 + (float)mZoomedBitmap.getHeight());
        int i = getWidth();
        int j = getHeight();
        mViewClipRect = new RectF(25F, 25F, i - 25, j - 25);
        mShiftX = 0.0F;
        mShiftY = 0.0F;
        float f2;
        float f3;
        float f4;
        float f5;
        if (mClipRect.left < 25F)
        {
            mShiftX = 25F - mClipRect.left;
            RectF rectf = mClipRect;
            rectf.left = rectf.left + mShiftX;
            rectf = mClipRect;
            rectf.right = rectf.right + mShiftX;
        } else
        if (mClipRect.right > (float)(i - 25))
        {
            mShiftX = (float)(i - 25) - mClipRect.right;
            RectF rectf2 = mClipRect;
            rectf2.right = rectf2.right + mShiftX;
            rectf2 = mClipRect;
            rectf2.left = rectf2.left + mShiftX;
        }
        if (mClipRect.top < 25F)
        {
            mShiftY = 25F - mClipRect.top;
            RectF rectf1 = mClipRect;
            rectf1.top = rectf1.top + mShiftY;
            rectf1 = mClipRect;
            rectf1.bottom = rectf1.bottom + mShiftY;
        } else
        if (mClipRect.bottom > (float)(j - 25))
        {
            mShiftY = (float)(j - 25) - mClipRect.bottom;
            RectF rectf3 = mClipRect;
            rectf3.bottom = rectf3.bottom + mShiftY;
            rectf3 = mClipRect;
            rectf3.top = rectf3.top + mShiftY;
        }
        mMaxScrollY = 0.0F;
        mMinScrollY = 0.0F;
        mMaxScrollX = 0.0F;
        mMinScrollX = 0.0F;
        if (mViewClipRect.right + mShiftX < mClipRect.right)
        {
            mMinScrollX = mViewClipRect.right - mClipRect.right;
        }
        if (mViewClipRect.left + mShiftX > mClipRect.left)
        {
            mMaxScrollX = mViewClipRect.left - mClipRect.left;
        }
        if (mViewClipRect.top + mShiftY > mClipRect.top)
        {
            mMaxScrollY = mViewClipRect.top - mClipRect.top;
        }
        if (mViewClipRect.bottom + mShiftY < mClipRect.bottom)
        {
            mMinScrollY = mViewClipRect.bottom - mClipRect.bottom;
        }
        mClipRect.intersect(mViewClipRect);
        mLeftExtrusion = mTouch.x - mClipRect.left;
        mRightExtrusion = mClipRect.right - mTouch.x;
        mTopExtrusion = mTouch.y - mClipRect.top;
        mBottomExtrusion = mClipRect.bottom - mTouch.y;
        f = (mTouch.x - (float)mTargetBounds.centerX()) / ((float)mTargetBounds.width() / 2.0F);
        f1 = (mTouch.y - (float)mTargetBounds.centerY()) / ((float)mTargetBounds.height() / 2.0F);
        f2 = mMaxScrollX;
        f3 = mMinScrollX;
        f4 = mMaxScrollY;
        f5 = mMinScrollY;
        mPopupScrollX = (f2 - f3) * (f + 0.5F) * -1F;
        mPopupScrollY = (f4 - f5) * (f1 + 0.5F) * -1F;
        mPopupScrollX = constrain(mPopupScrollX, mMinScrollX, mMaxScrollX);
        mPopupScrollY = constrain(mPopupScrollY, mMinScrollY, mMaxScrollY);
        mDrawRect = new RectF();
    }

    private boolean isTouchOutsideArea(float f, float f1)
    {
        return !mClipRect.contains(f, f1);
    }

    private void scroll(float f, float f1)
    {
        mPopupScrollX = constrain(mPopupScrollX - f, mMinScrollX, mMaxScrollX);
        mPopupScrollY = constrain(mPopupScrollY - f1, mMinScrollY, mMaxScrollY);
        invalidate();
    }

    private void setTargetBounds(Rect rect)
    {
        mTargetBounds = rect;
    }

    private void startAnimation(boolean flag)
    {
        mAnimating = true;
        mShowing = flag;
        mTimeLeft = 0L;
        if (!flag) goto _L2; else goto _L1
_L1:
        setVisibility(0);
        mNeedsToInitDimensions = true;
        if (mOnVisibilityChangedListener != null)
        {
            mOnVisibilityChangedListener.onPopupZoomerShown(this);
        }
_L4:
        mAnimationStartTime = SystemClock.uptimeMillis();
        invalidate();
        return;
_L2:
        mTimeLeft = (mAnimationStartTime + 300L) - SystemClock.uptimeMillis();
        if (mTimeLeft < 0L)
        {
            mTimeLeft = 0L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean acceptZeroSizeView()
    {
        return false;
    }

    public void hide(boolean flag)
    {
        if (!mShowing)
        {
            return;
        }
        if (flag)
        {
            startAnimation(false);
            return;
        } else
        {
            hideImmediately();
            return;
        }
    }

    public boolean isShowing()
    {
        return mShowing || mAnimating;
    }

    protected void onDraw(Canvas canvas)
    {
        while (!isShowing() || mZoomedBitmap == null || !acceptZeroSizeView() && (getWidth() == 0 || getHeight() == 0)) 
        {
            return;
        }
        if (mNeedsToInitDimensions)
        {
            mNeedsToInitDimensions = false;
            initDimensions();
        }
        canvas.save();
        float f = constrain((float)((SystemClock.uptimeMillis() - mAnimationStartTime) + mTimeLeft) / 300F, 0.0F, 1.0F);
        if (f >= 1.0F)
        {
            mAnimating = false;
            if (!isShowing())
            {
                hideImmediately();
                return;
            }
        } else
        {
            invalidate();
        }
        float f1;
        float f2;
        float f3;
        Drawable drawable;
        if (mShowing)
        {
            f = mShowInterpolator.getInterpolation(f);
        } else
        {
            f = mHideInterpolator.getInterpolation(f);
        }
        canvas.drawARGB((int)(80F * f), 0, 0, 0);
        canvas.save();
        f1 = ((mScale - 1.0F) * f) / mScale + 1.0F / mScale;
        f2 = (-mShiftX * (1.0F - f)) / mScale;
        f3 = (-mShiftY * (1.0F - f)) / mScale;
        mDrawRect.left = (mTouch.x - mLeftExtrusion * f1) + f2;
        mDrawRect.top = (mTouch.y - mTopExtrusion * f1) + f3;
        mDrawRect.right = mTouch.x + mRightExtrusion * f1 + f2;
        mDrawRect.bottom = mTouch.y + mBottomExtrusion * f1 + f3;
        canvas.clipRect(mDrawRect);
        canvas.scale(f1, f1, mDrawRect.left, mDrawRect.top);
        canvas.translate(mPopupScrollX, mPopupScrollY);
        canvas.drawBitmap(mZoomedBitmap, mDrawRect.left, mDrawRect.top, null);
        canvas.restore();
        drawable = getOverlayDrawable(getContext());
        drawable.setBounds((int)mDrawRect.left - sOverlayPadding.left, (int)mDrawRect.top - sOverlayPadding.top, (int)mDrawRect.right + sOverlayPadding.right, (int)mDrawRect.bottom + sOverlayPadding.bottom);
        drawable.setAlpha(constrain((int)(255F * f), 0, 255));
        drawable.draw(canvas);
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mGestureDetector.onTouchEvent(motionevent);
        return true;
    }

    public void setBitmap(Bitmap bitmap)
    {
        if (mZoomedBitmap != null)
        {
            mZoomedBitmap.recycle();
            mZoomedBitmap = null;
        }
        mZoomedBitmap = bitmap;
        bitmap = new Canvas(mZoomedBitmap);
        Object obj = new Path();
        RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        float f = getOverlayCornerRadius(getContext());
        ((Path) (obj)).addRoundRect(rectf, f, f, android.graphics.Path.Direction.CCW);
        bitmap.clipPath(((Path) (obj)), android.graphics.Region.Op.XOR);
        obj = new Paint();
        ((Paint) (obj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        ((Paint) (obj)).setColor(0);
        bitmap.drawPaint(((Paint) (obj)));
    }

    public void setLastTouch(float f, float f1)
    {
        mTouch.x = f;
        mTouch.y = f1;
    }

    public void setOnTapListener(OnTapListener ontaplistener)
    {
        mOnTapListener = ontaplistener;
    }

    public void setOnVisibilityChangedListener(OnVisibilityChangedListener onvisibilitychangedlistener)
    {
        mOnVisibilityChangedListener = onvisibilitychangedlistener;
    }

    public void show(Rect rect)
    {
        if (mShowing || mZoomedBitmap == null)
        {
            return;
        } else
        {
            setTargetBounds(rect);
            startAnimation(true);
            return;
        }
    }





}
