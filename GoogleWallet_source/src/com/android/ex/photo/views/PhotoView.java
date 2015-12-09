// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ScaleGestureDetectorCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;

public class PhotoView extends View
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{
    static final class RotateRunnable
        implements Runnable
    {

        private float mAppliedRotation;
        private final PhotoView mHeader;
        private long mLastRuntime;
        private boolean mRunning;
        private boolean mStop;
        private float mTargetRotation;
        private float mVelocity;

        public final void run()
        {
            if (!mStop) goto _L2; else goto _L1
_L1:
            return;
_L2:
label0:
            {
                if (mAppliedRotation == mTargetRotation)
                {
                    continue; /* Loop/switch isn't completed */
                }
                long l1 = System.currentTimeMillis();
                float f;
                float f1;
                long l;
                if (mLastRuntime != -1L)
                {
                    l = l1 - mLastRuntime;
                } else
                {
                    l = 0L;
                }
                f1 = mVelocity * (float)l;
                if (mAppliedRotation >= mTargetRotation || mAppliedRotation + f1 <= mTargetRotation)
                {
                    f = f1;
                    if (mAppliedRotation <= mTargetRotation)
                    {
                        break label0;
                    }
                    f = f1;
                    if (mAppliedRotation + f1 >= mTargetRotation)
                    {
                        break label0;
                    }
                }
                f = mTargetRotation - mAppliedRotation;
            }
            mHeader.rotate(f, false);
            mAppliedRotation = mAppliedRotation + f;
            if (mAppliedRotation == mTargetRotation)
            {
                stop();
            }
            mLastRuntime = l1;
            if (mStop) goto _L1; else goto _L3
_L3:
            mHeader.post(this);
            return;
        }

        public final void start(float f)
        {
            if (mRunning)
            {
                return;
            } else
            {
                mTargetRotation = f;
                mVelocity = mTargetRotation / 500F;
                mAppliedRotation = 0.0F;
                mLastRuntime = -1L;
                mStop = false;
                mRunning = true;
                mHeader.post(this);
                return;
            }
        }

        public final void stop()
        {
            mRunning = false;
            mStop = true;
        }

        public RotateRunnable(PhotoView photoview)
        {
            mHeader = photoview;
        }
    }

    static final class ScaleRunnable
        implements Runnable
    {

        private float mCenterX;
        private float mCenterY;
        private final PhotoView mHeader;
        private boolean mRunning;
        private float mStartScale;
        private long mStartTime;
        private boolean mStop;
        private float mTargetScale;
        private float mVelocity;
        private boolean mZoomingIn;

        public final void run()
        {
            if (!mStop) goto _L2; else goto _L1
_L1:
            return;
_L2:
            long l = System.currentTimeMillis();
            long l1 = mStartTime;
            float f = mStartScale + mVelocity * (float)(l - l1);
            mHeader.scale(f, mCenterX, mCenterY);
            if (f != mTargetScale)
            {
                boolean flag1 = mZoomingIn;
                boolean flag;
                if (f > mTargetScale)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag1 != flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            mHeader.scale(mTargetScale, mCenterX, mCenterY);
            stop();
            if (mStop) goto _L1; else goto _L3
_L3:
            mHeader.post(this);
            return;
        }

        public final boolean start(float f, float f1, float f2, float f3)
        {
            if (mRunning)
            {
                return false;
            }
            mCenterX = f2;
            mCenterY = f3;
            mTargetScale = f1;
            mStartTime = System.currentTimeMillis();
            mStartScale = f;
            boolean flag;
            if (mTargetScale > mStartScale)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mZoomingIn = flag;
            mVelocity = (mTargetScale - mStartScale) / 200F;
            mRunning = true;
            mStop = false;
            mHeader.post(this);
            return true;
        }

        public final void stop()
        {
            mRunning = false;
            mStop = true;
        }


        public ScaleRunnable(PhotoView photoview)
        {
            mHeader = photoview;
        }
    }

    static final class SnapRunnable
        implements Runnable
    {

        private final PhotoView mHeader;
        private boolean mRunning;
        private long mStartRunTime;
        private boolean mStop;
        private float mTranslateX;
        private float mTranslateY;

        public final void run()
        {
            if (!mStop) goto _L2; else goto _L1
_L1:
            return;
_L2:
            float f;
            float f1;
            float f2;
            long l = System.currentTimeMillis();
            if (mStartRunTime != -1L)
            {
                f = l - mStartRunTime;
            } else
            {
                f = 0.0F;
            }
            if (mStartRunTime == -1L)
            {
                mStartRunTime = l;
            }
            if (f < 100F)
            {
                break; /* Loop/switch isn't completed */
            }
            f2 = mTranslateX;
            f1 = mTranslateY;
_L6:
            mHeader.translate(f2, f1);
            mTranslateX = mTranslateX - f2;
            mTranslateY = mTranslateY - f1;
            if (mTranslateX == 0.0F && mTranslateY == 0.0F)
            {
                stop();
            }
            if (!mStop)
            {
                mHeader.post(this);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            float f3;
label0:
            {
                f1 = (mTranslateX / (100F - f)) * 10F;
                f3 = (mTranslateY / (100F - f)) * 10F;
                if (Math.abs(f1) <= Math.abs(mTranslateX))
                {
                    f = f1;
                    if (!Float.isNaN(f1))
                    {
                        break label0;
                    }
                }
                f = mTranslateX;
            }
            if (Math.abs(f3) > Math.abs(mTranslateY)) goto _L5; else goto _L4
_L4:
            f2 = f;
            f1 = f3;
            if (!Float.isNaN(f3)) goto _L6; else goto _L5
_L5:
            f1 = mTranslateY;
            f2 = f;
              goto _L6
        }

        public final boolean start(float f, float f1)
        {
            if (mRunning)
            {
                return false;
            } else
            {
                mStartRunTime = -1L;
                mTranslateX = f;
                mTranslateY = f1;
                mStop = false;
                mRunning = true;
                mHeader.postDelayed(this, 250L);
                return true;
            }
        }

        public final void stop()
        {
            mRunning = false;
            mStop = true;
        }

        public SnapRunnable(PhotoView photoview)
        {
            mStartRunTime = -1L;
            mHeader = photoview;
        }
    }

    static final class TranslateRunnable
        implements Runnable
    {

        private float mDecelerationX;
        private float mDecelerationY;
        private final PhotoView mHeader;
        private long mLastRunTime;
        private boolean mRunning;
        private boolean mStop;
        private float mVelocityX;
        private float mVelocityY;

        public final void run()
        {
            float f = 1000F;
            if (!mStop) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i;
            long l = System.currentTimeMillis();
            float f1;
            float f2;
            if (mLastRunTime != -1L)
            {
                f1 = (float)(l - mLastRunTime) / 1000F;
            } else
            {
                f1 = 0.0F;
            }
            i = mHeader.translate(mVelocityX * f1, mVelocityY * f1);
            mLastRunTime = l;
            f2 = mDecelerationX * f1;
            if (Math.abs(mVelocityX) > Math.abs(f2))
            {
                mVelocityX = mVelocityX - f2;
            } else
            {
                mVelocityX = 0.0F;
            }
            f1 = mDecelerationY * f1;
            if (Math.abs(mVelocityY) > Math.abs(f1))
            {
                mVelocityY = mVelocityY - f1;
            } else
            {
                mVelocityY = 0.0F;
            }
            if ((mVelocityX != 0.0F || mVelocityY != 0.0F) && i != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            stop();
            mHeader.snap();
_L4:
            if (!mStop)
            {
                mHeader.post(this);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (i == 1)
            {
                if (mVelocityX <= 0.0F)
                {
                    f = -1000F;
                }
                mDecelerationX = f;
                mDecelerationY = 0.0F;
                mVelocityY = 0.0F;
            } else
            if (i == 2)
            {
                mDecelerationX = 0.0F;
                if (mVelocityY <= 0.0F)
                {
                    f = -1000F;
                }
                mDecelerationY = f;
                mVelocityX = 0.0F;
            }
              goto _L4
            if (true) goto _L1; else goto _L5
_L5:
        }

        public final boolean start(float f, float f1)
        {
            if (mRunning)
            {
                return false;
            } else
            {
                mLastRunTime = -1L;
                mVelocityX = f;
                mVelocityY = f1;
                f = (float)Math.atan2(mVelocityY, mVelocityX);
                mDecelerationX = (float)(Math.cos(f) * 1000D);
                mDecelerationY = (float)(Math.sin(f) * 1000D);
                mStop = false;
                mRunning = true;
                mHeader.post(this);
                return true;
            }
        }

        public final void stop()
        {
            mRunning = false;
            mStop = true;
        }


        public TranslateRunnable(PhotoView photoview)
        {
            mLastRunTime = -1L;
            mHeader = photoview;
        }
    }


    private static Paint sCropDimPaint;
    private static Paint sCropPaint;
    private static int sCropSize;
    private static boolean sInitialized;
    private static int sTouchSlopSquare;
    private static Bitmap sVideoImage;
    private static Bitmap sVideoNotReadyImage;
    private boolean mAllowCrop;
    private Rect mCropRect;
    private int mCropSize;
    private boolean mDoubleTapDebounce;
    private boolean mDoubleTapOccurred;
    private boolean mDoubleTapToZoomEnabled;
    private float mDownFocusX;
    private float mDownFocusY;
    private Matrix mDrawMatrix;
    private Drawable mDrawable;
    private android.view.View.OnClickListener mExternalClickListener;
    private int mFixedHeight;
    private boolean mFullScreen;
    private GestureDetectorCompat mGestureDetector;
    private boolean mHaveLayout;
    private boolean mIsDoubleTouch;
    private Matrix mMatrix;
    private float mMaxInitialScaleFactor;
    private float mMaxScale;
    private float mMinScale;
    private Matrix mOriginalMatrix;
    private boolean mQuickScaleEnabled;
    private RotateRunnable mRotateRunnable;
    private float mRotation;
    private ScaleGestureDetector mScaleGetureDetector;
    private ScaleRunnable mScaleRunnable;
    private SnapRunnable mSnapRunnable;
    private RectF mTempDst;
    private RectF mTempSrc;
    private boolean mTransformsEnabled;
    private RectF mTranslateRect;
    private TranslateRunnable mTranslateRunnable;
    private float mValues[];
    private byte mVideoBlob[];
    private boolean mVideoReady;

    public PhotoView(Context context)
    {
        super(context);
        mMatrix = new Matrix();
        mOriginalMatrix = new Matrix();
        mFixedHeight = -1;
        mCropRect = new Rect();
        mDoubleTapToZoomEnabled = true;
        mTempSrc = new RectF();
        mTempDst = new RectF();
        mTranslateRect = new RectF();
        mValues = new float[9];
        initialize();
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMatrix = new Matrix();
        mOriginalMatrix = new Matrix();
        mFixedHeight = -1;
        mCropRect = new Rect();
        mDoubleTapToZoomEnabled = true;
        mTempSrc = new RectF();
        mTempDst = new RectF();
        mTranslateRect = new RectF();
        mValues = new float[9];
        initialize();
    }

    public PhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMatrix = new Matrix();
        mOriginalMatrix = new Matrix();
        mFixedHeight = -1;
        mCropRect = new Rect();
        mDoubleTapToZoomEnabled = true;
        mTempSrc = new RectF();
        mTempDst = new RectF();
        mTranslateRect = new RectF();
        mValues = new float[9];
        initialize();
    }

    private void configureBounds(boolean flag)
    {
        if (mDrawable == null || !mHaveLayout)
        {
            return;
        }
        int j = mDrawable.getIntrinsicWidth();
        int k = mDrawable.getIntrinsicHeight();
        int i = getWidth();
        int l = getHeight();
        boolean flag1;
        if ((j < 0 || i == j) && (k < 0 || l == k))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mDrawable.setBounds(0, 0, j, k);
        if (flag || mMinScale == 0.0F && mDrawable != null && mHaveLayout)
        {
            generateMatrix();
            generateScale();
        }
        if (flag1 || mMatrix.isIdentity())
        {
            mDrawMatrix = null;
            return;
        } else
        {
            mDrawMatrix = mMatrix;
            return;
        }
    }

    private void generateMatrix()
    {
        int k = mDrawable.getIntrinsicWidth();
        int l = mDrawable.getIntrinsicHeight();
        int i;
        int j;
        boolean flag;
        if (mAllowCrop)
        {
            i = sCropSize;
        } else
        {
            i = getWidth();
        }
        if (mAllowCrop)
        {
            j = sCropSize;
        } else
        {
            j = getHeight();
        }
        if ((k < 0 || i == k) && (l < 0 || j == l))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !mAllowCrop)
        {
            mMatrix.reset();
        } else
        {
            mTempSrc.set(0.0F, 0.0F, k, l);
            RectF rectf;
            if (mAllowCrop)
            {
                mTempDst.set(mCropRect);
            } else
            {
                mTempDst.set(0.0F, 0.0F, i, j);
            }
            rectf = new RectF((float)(i / 2) - ((float)k * mMaxInitialScaleFactor) / 2.0F, (float)(j / 2) - ((float)l * mMaxInitialScaleFactor) / 2.0F, (float)(i / 2) + ((float)k * mMaxInitialScaleFactor) / 2.0F, (float)(j / 2) + ((float)l * mMaxInitialScaleFactor) / 2.0F);
            if (mTempDst.contains(rectf))
            {
                mMatrix.setRectToRect(mTempSrc, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
            } else
            {
                mMatrix.setRectToRect(mTempSrc, mTempDst, android.graphics.Matrix.ScaleToFit.CENTER);
            }
        }
        mOriginalMatrix.set(mMatrix);
    }

    private void generateScale()
    {
        int k = mDrawable.getIntrinsicWidth();
        int l = mDrawable.getIntrinsicHeight();
        int i;
        int j;
        if (mAllowCrop)
        {
            i = getCropSize();
        } else
        {
            i = getWidth();
        }
        if (mAllowCrop)
        {
            j = getCropSize();
        } else
        {
            j = getHeight();
        }
        if (k < i && l < j && !mAllowCrop)
        {
            mMinScale = 1.0F;
        } else
        {
            mMinScale = getScale();
        }
        mMaxScale = Math.max(mMinScale * 4F, 4F);
    }

    private int getCropSize()
    {
        if (mCropSize > 0)
        {
            return mCropSize;
        } else
        {
            return sCropSize;
        }
    }

    private float getScale()
    {
        mMatrix.getValues(mValues);
        return mValues[0];
    }

    private void initialize()
    {
        Context context = getContext();
        if (!sInitialized)
        {
            sInitialized = true;
            Resources resources = context.getApplicationContext().getResources();
            sCropSize = resources.getDimensionPixelSize(com.android.ex.photo.R.dimen.photo_crop_width);
            Paint paint = new Paint();
            sCropDimPaint = paint;
            paint.setAntiAlias(true);
            sCropDimPaint.setColor(resources.getColor(com.android.ex.photo.R.color.photo_crop_dim_color));
            sCropDimPaint.setStyle(android.graphics.Paint.Style.FILL);
            paint = new Paint();
            sCropPaint = paint;
            paint.setAntiAlias(true);
            sCropPaint.setColor(resources.getColor(com.android.ex.photo.R.color.photo_crop_highlight_color));
            sCropPaint.setStyle(android.graphics.Paint.Style.STROKE);
            sCropPaint.setStrokeWidth(resources.getDimension(com.android.ex.photo.R.dimen.photo_crop_stroke_width));
            int i = ViewConfiguration.get(context).getScaledTouchSlop();
            sTouchSlopSquare = i * i;
        }
        mGestureDetector = new GestureDetectorCompat(context, this, null);
        mScaleGetureDetector = new ScaleGestureDetector(context, this);
        mQuickScaleEnabled = ScaleGestureDetectorCompat.isQuickScaleEnabled(mScaleGetureDetector);
        mScaleRunnable = new ScaleRunnable(this);
        mTranslateRunnable = new TranslateRunnable(this);
        mSnapRunnable = new SnapRunnable(this);
        mRotateRunnable = new RotateRunnable(this);
    }

    private void rotate(float f, boolean flag)
    {
        if (flag)
        {
            mRotateRunnable.start(f);
            return;
        } else
        {
            mRotation = mRotation + f;
            mMatrix.postRotate(f, getWidth() / 2, getHeight() / 2);
            invalidate();
            return;
        }
    }

    private void scale(float f, float f1, float f2)
    {
        mMatrix.postRotate(-mRotation, getWidth() / 2, getHeight() / 2);
        f = Math.min(Math.max(f, mMinScale), mMaxScale * 1.5F) / getScale();
        mMatrix.postScale(f, f, f1, f2);
        mMatrix.postRotate(mRotation, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    private boolean scale(MotionEvent motionevent)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = flag2;
        if (mDoubleTapToZoomEnabled)
        {
            flag = flag2;
            if (mTransformsEnabled)
            {
                flag = flag2;
                if (mDoubleTapOccurred)
                {
                    flag = flag1;
                    if (!mDoubleTapDebounce)
                    {
                        float f5 = getScale();
                        float f;
                        float f1;
                        float f2;
                        if (f5 > mMinScale)
                        {
                            f2 = mMinScale;
                            f = f2 / f5;
                            f1 = ((float)(getWidth() / 2) - mTranslateRect.centerX() * f) / (1.0F - f);
                            f = ((float)(getHeight() / 2) - mTranslateRect.centerY() * f) / (1.0F - f);
                        } else
                        {
                            f = Math.max(mMinScale, f5 * 2.0F);
                            f2 = Math.min(mMaxScale, f);
                            f1 = f2 / f5;
                            f = ((float)getWidth() - mTranslateRect.width()) / f1;
                            f1 = ((float)getHeight() - mTranslateRect.height()) / f1;
                            if (mTranslateRect.width() <= f * 2.0F)
                            {
                                f = mTranslateRect.centerX();
                            } else
                            {
                                f = Math.min(Math.max(mTranslateRect.left + f, motionevent.getX()), mTranslateRect.right - f);
                            }
                            if (mTranslateRect.height() <= f1 * 2.0F)
                            {
                                float f3 = mTranslateRect.centerY();
                                f1 = f;
                                f = f3;
                            } else
                            {
                                float f4 = Math.min(Math.max(mTranslateRect.top + f1, motionevent.getY()), mTranslateRect.bottom - f1);
                                f1 = f;
                                f = f4;
                            }
                        }
                        mScaleRunnable.start(f5, f2, f1, f);
                        flag = true;
                    }
                    mDoubleTapDebounce = false;
                }
            }
        }
        mDoubleTapOccurred = false;
        return flag;
    }

    private void snap()
    {
        mTranslateRect.set(mTempSrc);
        mMatrix.mapRect(mTranslateRect);
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        if (mAllowCrop)
        {
            f = mCropRect.left;
        } else
        {
            f = 0.0F;
        }
        if (mAllowCrop)
        {
            f1 = mCropRect.right;
        } else
        {
            f1 = getWidth();
        }
        f2 = mTranslateRect.left;
        f3 = mTranslateRect.right;
        if (f3 - f2 < f1 - f)
        {
            f += (f1 - f - (f3 + f2)) / 2.0F;
        } else
        if (f2 > f)
        {
            f -= f2;
        } else
        if (f3 < f1)
        {
            f = f1 - f3;
        } else
        {
            f = 0.0F;
        }
        if (mAllowCrop)
        {
            f1 = mCropRect.top;
        } else
        {
            f1 = 0.0F;
        }
        if (mAllowCrop)
        {
            f2 = mCropRect.bottom;
        } else
        {
            f2 = getHeight();
        }
        f3 = mTranslateRect.top;
        f4 = mTranslateRect.bottom;
        if (f4 - f3 < f2 - f1)
        {
            f1 += (f2 - f1 - (f4 + f3)) / 2.0F;
        } else
        if (f3 > f1)
        {
            f1 -= f3;
        } else
        if (f4 < f2)
        {
            f1 = f2 - f4;
        } else
        {
            f1 = 0.0F;
        }
        if (Math.abs(f) > 20F || Math.abs(f1) > 20F)
        {
            mSnapRunnable.start(f, f1);
            return;
        } else
        {
            mMatrix.postTranslate(f, f1);
            invalidate();
            return;
        }
    }

    private int translate(float f, float f1)
    {
        mTranslateRect.set(mTempSrc);
        mMatrix.mapRect(mTranslateRect);
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean flag;
        boolean flag1;
        if (mAllowCrop)
        {
            f2 = mCropRect.left;
        } else
        {
            f2 = 0.0F;
        }
        if (mAllowCrop)
        {
            f3 = mCropRect.right;
        } else
        {
            f3 = getWidth();
        }
        f4 = mTranslateRect.left;
        f5 = mTranslateRect.right;
        if (mAllowCrop)
        {
            f2 = Math.max(f2 - mTranslateRect.right, Math.min(f3 - mTranslateRect.left, f));
        } else
        if (f5 - f4 < f3 - f2)
        {
            f2 += (f3 - f2 - (f5 + f4)) / 2.0F;
        } else
        {
            f2 = Math.max(f3 - f5, Math.min(f2 - f4, f));
        }
        if (mAllowCrop)
        {
            f3 = mCropRect.top;
        } else
        {
            f3 = 0.0F;
        }
        if (mAllowCrop)
        {
            f4 = mCropRect.bottom;
        } else
        {
            f4 = getHeight();
        }
        f5 = mTranslateRect.top;
        f6 = mTranslateRect.bottom;
        if (mAllowCrop)
        {
            f3 = Math.max(f3 - mTranslateRect.bottom, Math.min(f4 - mTranslateRect.top, f1));
        } else
        if (f6 - f5 < f4 - f3)
        {
            f3 += (f4 - f3 - (f6 + f5)) / 2.0F;
        } else
        {
            f3 = Math.max(f4 - f6, Math.min(f3 - f5, f1));
        }
        mMatrix.postTranslate(f2, f3);
        invalidate();
        if (f2 == f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f3 == f1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            return 3;
        }
        if (flag)
        {
            return 1;
        }
        return !flag1 ? 0 : 2;
    }

    public final void bindDrawable(Drawable drawable)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (drawable != null)
        {
            flag = flag1;
            if (drawable != mDrawable)
            {
                if (mDrawable != null)
                {
                    mDrawable.setCallback(null);
                }
                mDrawable = drawable;
                mMinScale = 0.0F;
                mDrawable.setCallback(this);
                flag = true;
            }
        }
        configureBounds(flag);
        invalidate();
    }

    public final void bindPhoto(Bitmap bitmap)
    {
        boolean flag2 = mDrawable instanceof BitmapDrawable;
        boolean flag;
        boolean flag1;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (mDrawable != null)
        {
            flag1 = flag;
            if (flag2)
            {
                if (bitmap == ((BitmapDrawable)mDrawable).getBitmap())
                {
                    return;
                }
                if (bitmap != null && (mDrawable.getIntrinsicWidth() != bitmap.getWidth() || mDrawable.getIntrinsicHeight() != bitmap.getHeight()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mMinScale = 0.0F;
                mDrawable = null;
                flag1 = flag;
            }
        }
        if (mDrawable == null && bitmap != null)
        {
            mDrawable = new BitmapDrawable(getResources(), bitmap);
        }
        configureBounds(flag1);
        invalidate();
    }

    public final void clear()
    {
        mGestureDetector = null;
        mScaleGetureDetector = null;
        mDrawable = null;
        mScaleRunnable.stop();
        mScaleRunnable = null;
        mTranslateRunnable.stop();
        mTranslateRunnable = null;
        mSnapRunnable.stop();
        mSnapRunnable = null;
        mRotateRunnable.stop();
        mRotateRunnable = null;
        setOnClickListener(null);
        mExternalClickListener = null;
        mDoubleTapOccurred = false;
    }

    public final void enableImageTransforms(boolean flag)
    {
        mTransformsEnabled = flag;
        if (!mTransformsEnabled)
        {
            resetTransformations();
        }
    }

    public final boolean interceptMoveLeft(float f, float f1)
    {
        if (mTransformsEnabled)
        {
            if (mTranslateRunnable.mRunning)
            {
                return true;
            }
            mMatrix.getValues(mValues);
            mTranslateRect.set(mTempSrc);
            mMatrix.mapRect(mTranslateRect);
            f = getWidth();
            f1 = mValues[2];
            float f2 = mTranslateRect.right - mTranslateRect.left;
            if (mTransformsEnabled && f2 > f && f1 != 0.0F)
            {
                return f < f2 + f1 ? true : true;
            }
        }
        return false;
    }

    public final boolean interceptMoveRight(float f, float f1)
    {
        if (mTransformsEnabled)
        {
            if (mTranslateRunnable.mRunning)
            {
                return true;
            }
            mMatrix.getValues(mValues);
            mTranslateRect.set(mTempSrc);
            mMatrix.mapRect(mTranslateRect);
            f = getWidth();
            f1 = mValues[2];
            float f2 = mTranslateRect.right - mTranslateRect.left;
            if (mTransformsEnabled && f2 > f)
            {
                if (f1 == 0.0F)
                {
                    return true;
                }
                if (f < f2 + f1)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (mDrawable == drawable)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    public final boolean isPhotoBound()
    {
        return mDrawable != null;
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        mDoubleTapOccurred = true;
        if (!mQuickScaleEnabled)
        {
            return scale(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 59
    //                   2 72;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        if (mQuickScaleEnabled)
        {
            mDownFocusX = motionevent.getX();
            mDownFocusY = motionevent.getY();
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mQuickScaleEnabled)
        {
            return scale(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mQuickScaleEnabled && mDoubleTapOccurred)
        {
            int i = (int)(motionevent.getX() - mDownFocusX);
            int j = (int)(motionevent.getY() - mDownFocusY);
            if (i * i + j * j > sTouchSlopSquare)
            {
                mDoubleTapOccurred = false;
                return false;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (mTransformsEnabled)
        {
            mTranslateRunnable.stop();
            mSnapRunnable.stop();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mDrawable != null)
        {
            int i = canvas.getSaveCount();
            canvas.save();
            if (mDrawMatrix != null)
            {
                canvas.concat(mDrawMatrix);
            }
            mDrawable.draw(canvas);
            canvas.restoreToCount(i);
            if (mVideoBlob != null)
            {
                Bitmap bitmap;
                int j;
                int k;
                if (mVideoReady)
                {
                    bitmap = sVideoImage;
                } else
                {
                    bitmap = sVideoNotReadyImage;
                }
                j = (getWidth() - bitmap.getWidth()) / 2;
                k = (getHeight() - bitmap.getHeight()) / 2;
                canvas.drawBitmap(bitmap, j, k, null);
            }
            mTranslateRect.set(mDrawable.getBounds());
            if (mDrawMatrix != null)
            {
                mDrawMatrix.mapRect(mTranslateRect);
            }
            if (mAllowCrop)
            {
                j = canvas.getSaveCount();
                canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), sCropDimPaint);
                canvas.save();
                canvas.clipRect(mCropRect);
                if (mDrawMatrix != null)
                {
                    canvas.concat(mDrawMatrix);
                }
                mDrawable.draw(canvas);
                canvas.restoreToCount(j);
                canvas.drawRect(mCropRect, sCropPaint);
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (mTransformsEnabled && !mScaleRunnable.mRunning)
        {
            mTranslateRunnable.start(f, f1);
        }
        return true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mHaveLayout = true;
        i = getWidth();
        j = getHeight();
        if (mAllowCrop)
        {
            mCropSize = Math.min(sCropSize, Math.min(i, j));
            i = (i - mCropSize) / 2;
            j = (j - mCropSize) / 2;
            k = mCropSize;
            l = mCropSize;
            mCropRect.set(i, j, i + k, j + l);
        }
        configureBounds(flag);
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i, int j)
    {
        if (mFixedHeight != -1)
        {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(mFixedHeight, 0x80000000));
            setMeasuredDimension(getMeasuredWidth(), mFixedHeight);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (mTransformsEnabled)
        {
            mIsDoubleTouch = false;
            scale(getScale() * scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (mTransformsEnabled)
        {
            mScaleRunnable.stop();
            mIsDoubleTouch = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        float f2 = getScale();
        if (f2 > mMaxScale)
        {
            float f4 = 1.0F / (1.0F - mMaxScale / f2);
            float f7 = 1.0F - f4;
            float f = getWidth() / 2;
            float f1 = getHeight() / 2;
            float f5 = mTranslateRect.left * f7;
            float f3 = mTranslateRect.top * f7;
            float f6 = (float)getWidth() * f4 + mTranslateRect.right * f7;
            f4 = (float)getHeight() * f4 + mTranslateRect.bottom * f7;
            if (f6 > f5)
            {
                f = (f6 + f5) / 2.0F;
            } else
            {
                f = Math.min(Math.max(f6, f), f5);
            }
            if (f4 > f3)
            {
                f1 = (f4 + f3) / 2.0F;
            } else
            {
                f1 = Math.min(Math.max(f4, f1), f3);
            }
            mScaleRunnable.start(f2, mMaxScale, f, f1);
        }
        if (mTransformsEnabled && mIsDoubleTouch)
        {
            mDoubleTapDebounce = true;
            resetTransformations();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (mTransformsEnabled && !mScaleRunnable.mRunning)
        {
            translate(-f, -f1);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (mExternalClickListener != null && !mIsDoubleTouch)
        {
            mExternalClickListener.onClick(this);
        }
        mIsDoubleTouch = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mScaleGetureDetector != null && mGestureDetector != null)
        {
            mScaleGetureDetector.onTouchEvent(motionevent);
            mGestureDetector.onTouchEvent(motionevent);
            switch (motionevent.getAction())
            {
            case 2: // '\002'
            default:
                return true;

            case 1: // '\001'
            case 3: // '\003'
                break;
            }
            if (!mTranslateRunnable.mRunning)
            {
                snap();
                return true;
            }
        }
        return true;
    }

    public final void resetTransformations()
    {
        mMatrix.set(mOriginalMatrix);
        invalidate();
    }

    public void setFixedHeight(int i)
    {
        boolean flag;
        if (i != mFixedHeight)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mFixedHeight = i;
        setMeasuredDimension(getMeasuredWidth(), mFixedHeight);
        if (flag)
        {
            configureBounds(true);
            requestLayout();
        }
    }

    public void setFullScreen(boolean flag, boolean flag1)
    {
        if (flag != mFullScreen)
        {
            mFullScreen = flag;
            requestLayout();
            invalidate();
        }
    }

    public void setMaxInitialScale(float f)
    {
        mMaxInitialScaleFactor = f;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mExternalClickListener = onclicklistener;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return mDrawable == drawable || super.verifyDrawable(drawable);
    }




}
