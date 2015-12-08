// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class IcsProgressBar extends View
{
    private class AccessibilityEventSender
        implements Runnable
    {

        final IcsProgressBar this$0;

        public void run()
        {
            sendAccessibilityEvent(4);
        }

        private AccessibilityEventSender()
        {
            this$0 = IcsProgressBar.this;
            super();
        }

        AccessibilityEventSender(AccessibilityEventSender accessibilityeventsender)
        {
            this();
        }
    }

    private class RefreshProgressRunnable
        implements Runnable
    {

        private boolean mFromUser;
        private int mId;
        private int mProgress;
        final IcsProgressBar this$0;

        public void run()
        {
            doRefreshProgress(mId, mProgress, mFromUser, true);
            mRefreshProgressRunnable = this;
        }

        public void setup(int i, int j, boolean flag)
        {
            mId = i;
            mProgress = j;
            mFromUser = flag;
        }

        RefreshProgressRunnable(int i, int j, boolean flag)
        {
            this$0 = IcsProgressBar.this;
            super();
            mId = i;
            mProgress = j;
            mFromUser = flag;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
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
        int progress;
        int secondaryProgress;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(progress);
            parcel.writeInt(secondaryProgress);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            progress = parcel.readInt();
            secondaryProgress = parcel.readInt();
        }

        SavedState(Parcel parcel, SavedState savedstate)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final int ANIMATION_RESOLUTION = 200;
    private static final boolean IS_HONEYCOMB;
    private static final int MAX_LEVEL = 10000;
    private static final int ProgressBar[] = {
        0x101011f, 0x1010120, 0x1010136, 0x1010137, 0x1010138, 0x1010139, 0x101013a, 0x101013b, 0x101013c, 0x101013d, 
        0x101013e, 0x101013f, 0x1010140, 0x1010141, 0x101031a
    };
    private static final int ProgressBar_animationResolution = 14;
    private static final int ProgressBar_indeterminate = 5;
    private static final int ProgressBar_indeterminateBehavior = 10;
    private static final int ProgressBar_indeterminateDrawable = 7;
    private static final int ProgressBar_indeterminateDuration = 9;
    private static final int ProgressBar_indeterminateOnly = 6;
    private static final int ProgressBar_interpolator = 13;
    private static final int ProgressBar_max = 2;
    private static final int ProgressBar_maxHeight = 1;
    private static final int ProgressBar_maxWidth = 0;
    private static final int ProgressBar_minHeight = 12;
    private static final int ProgressBar_minWidth = 11;
    private static final int ProgressBar_progress = 3;
    private static final int ProgressBar_progressDrawable = 8;
    private static final int ProgressBar_secondaryProgress = 4;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private AccessibilityEventSender mAccessibilityEventSender;
    private AccessibilityManager mAccessibilityManager;
    private AlphaAnimation mAnimation;
    private int mAnimationResolution;
    private int mBehavior;
    private Drawable mCurrentDrawable;
    private int mDuration;
    private boolean mInDrawing;
    private boolean mIndeterminate;
    private Drawable mIndeterminateDrawable;
    private int mIndeterminateRealLeft;
    private int mIndeterminateRealTop;
    private Interpolator mInterpolator;
    private long mLastDrawTime;
    private int mMax;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mNoInvalidate;
    private boolean mOnlyIndeterminate;
    private int mProgress;
    private Drawable mProgressDrawable;
    private RefreshProgressRunnable mRefreshProgressRunnable;
    Bitmap mSampleTile;
    private int mSecondaryProgress;
    private boolean mShouldStartAnimationDrawable;
    private Transformation mTransformation;
    private long mUiThreadId;

    public IcsProgressBar(Context context)
    {
        this(context, null);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010077);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset, int i, int j)
    {
        boolean flag = false;
        super(context, attributeset, i);
        mUiThreadId = Thread.currentThread().getId();
        initProgressBar();
        attributeset = context.obtainStyledAttributes(attributeset, ProgressBar, i, j);
        mNoInvalidate = true;
        Drawable drawable = attributeset.getDrawable(8);
        if (drawable != null)
        {
            setProgressDrawable(tileify(drawable, false));
        }
        mDuration = attributeset.getInt(9, mDuration);
        mMinWidth = attributeset.getDimensionPixelSize(11, mMinWidth);
        mMaxWidth = attributeset.getDimensionPixelSize(0, mMaxWidth);
        mMinHeight = attributeset.getDimensionPixelSize(12, mMinHeight);
        mMaxHeight = attributeset.getDimensionPixelSize(1, mMaxHeight);
        mBehavior = attributeset.getInt(10, mBehavior);
        i = attributeset.getResourceId(13, 0x10a000b);
        if (i > 0)
        {
            setInterpolator(context, i);
        }
        setMax(attributeset.getInt(2, mMax));
        setProgress(attributeset.getInt(3, mProgress));
        setSecondaryProgress(attributeset.getInt(4, mSecondaryProgress));
        drawable = attributeset.getDrawable(7);
        if (drawable != null)
        {
            setIndeterminateDrawable(tileifyIndeterminate(drawable));
        }
        mOnlyIndeterminate = attributeset.getBoolean(6, mOnlyIndeterminate);
        mNoInvalidate = false;
        if (mOnlyIndeterminate || attributeset.getBoolean(5, mIndeterminate))
        {
            flag = true;
        }
        setIndeterminate(flag);
        mAnimationResolution = attributeset.getInteger(14, 200);
        attributeset.recycle();
        mAccessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
    }

    private void doRefreshProgress(int i, int j, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mMax <= 0) goto _L2; else goto _L1
_L1:
        float f = (float)j / (float)mMax;
_L6:
        Drawable drawable = mCurrentDrawable;
        if (drawable == null) goto _L4; else goto _L3
_L3:
        Object obj = null;
        if (drawable instanceof LayerDrawable)
        {
            obj = ((LayerDrawable)drawable).findDrawableByLayerId(i);
        }
          goto _L5
_L8:
        ((Drawable) (obj)).setLevel(j);
_L7:
        if (!flag1 || i != 0x102000d)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        onProgressRefresh(f, flag);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = 0.0F;
          goto _L6
_L9:
        obj = drawable;
        break; /* Loop/switch isn't completed */
_L4:
        invalidate();
          goto _L7
        obj;
        throw obj;
_L5:
        j = (int)(10000F * f);
        if (obj == null) goto _L9; else goto _L8
    }

    private void initProgressBar()
    {
        mMax = 100;
        mProgress = 0;
        mSecondaryProgress = 0;
        mIndeterminate = false;
        mOnlyIndeterminate = false;
        mDuration = 4000;
        mBehavior = 1;
        mMinWidth = 24;
        mMaxWidth = 48;
        mMinHeight = 24;
        mMaxHeight = 48;
    }

    private void refreshProgress(int i, int j, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (mUiThreadId != Thread.currentThread().getId()) goto _L2; else goto _L1
_L1:
        doRefreshProgress(i, j, flag, true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        if (mRefreshProgressRunnable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = mRefreshProgressRunnable;
        mRefreshProgressRunnable = null;
        ((RefreshProgressRunnable) (obj)).setup(i, j, flag);
_L5:
        post(((Runnable) (obj)));
        if (true) goto _L4; else goto _L3
        obj;
        throw obj;
_L3:
        obj = new RefreshProgressRunnable(i, j, flag);
          goto _L5
    }

    private void scheduleAccessibilityEventSender()
    {
        if (mAccessibilityEventSender == null)
        {
            mAccessibilityEventSender = new AccessibilityEventSender(null);
        } else
        {
            removeCallbacks(mAccessibilityEventSender);
        }
        postDelayed(mAccessibilityEventSender, 200L);
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
        Object obj;
        int i;
        int j;
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            j = drawable.getNumberOfLayers();
            obj = new Drawable[j];
            i = 0;
        } else
        {
            if (drawable instanceof BitmapDrawable)
            {
                drawable = ((BitmapDrawable)drawable).getBitmap();
                if (mSampleTile == null)
                {
                    mSampleTile = drawable;
                }
                ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
                drawable = new BitmapShader(drawable, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                shapedrawable.getPaint().setShader(drawable);
                drawable = shapedrawable;
                if (flag)
                {
                    drawable = new ClipDrawable(shapedrawable, 3, 1);
                }
                return drawable;
            }
            return drawable;
        }
        if (i < j) goto _L2; else goto _L1
_L1:
        obj = new LayerDrawable(((Drawable []) (obj)));
        i = 0;
_L4:
        if (i >= j)
        {
            return ((Drawable) (obj));
        }
        break MISSING_BLOCK_LABEL_114;
_L2:
        int k = drawable.getId(i);
        Drawable drawable1 = drawable.getDrawable(i);
        if (k != 0x102000d && k != 0x102000f)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj[i] = tileify(drawable1, flag);
        i++;
        break MISSING_BLOCK_LABEL_27;
        ((LayerDrawable) (obj)).setId(i, drawable.getId(i));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Drawable tileifyIndeterminate(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof AnimationDrawable)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        drawable = (AnimationDrawable)drawable;
        j = drawable.getNumberOfFrames();
        obj = new AnimationDrawable();
        ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        ((AnimationDrawable) (obj)).setLevel(10000);
_L2:
        return ((Drawable) (obj));
_L4:
        Drawable drawable1 = tileify(drawable.getFrame(i), true);
        drawable1.setLevel(10000);
        ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateDrawableBounds(int i, int j)
    {
        int i1 = i - getPaddingRight() - getPaddingLeft();
        int j1 = j - getPaddingBottom() - getPaddingTop();
        boolean flag = false;
        boolean flag1 = false;
        int k = j1;
        int l = i1;
        if (mIndeterminateDrawable != null)
        {
            k = j1;
            int l1 = ((flag1) ? 1 : 0);
            l = i1;
            int k1 = ((flag) ? 1 : 0);
            if (mOnlyIndeterminate)
            {
                k = j1;
                l1 = ((flag1) ? 1 : 0);
                l = i1;
                k1 = ((flag) ? 1 : 0);
                if (!(mIndeterminateDrawable instanceof AnimationDrawable))
                {
                    k = mIndeterminateDrawable.getIntrinsicWidth();
                    l = mIndeterminateDrawable.getIntrinsicHeight();
                    float f = (float)k / (float)l;
                    float f1 = (float)i / (float)j;
                    k = j1;
                    l1 = ((flag1) ? 1 : 0);
                    l = i1;
                    k1 = ((flag) ? 1 : 0);
                    if (f != f1)
                    {
                        if (f1 > f)
                        {
                            j = (int)((float)j * f);
                            l1 = (i - j) / 2;
                            l = l1 + j;
                            k1 = ((flag) ? 1 : 0);
                            k = j1;
                        } else
                        {
                            i = (int)((float)i * (1.0F / f));
                            k1 = (j - i) / 2;
                            k = k1 + i;
                            l1 = ((flag1) ? 1 : 0);
                            l = i1;
                        }
                    }
                }
            }
            mIndeterminateDrawable.setBounds(0, 0, l - l1, k - k1);
            mIndeterminateRealLeft = l1;
            mIndeterminateRealTop = k1;
        }
        if (mProgressDrawable != null)
        {
            mProgressDrawable.setBounds(0, 0, l, k);
        }
    }

    private void updateDrawableState()
    {
        int ai[] = getDrawableState();
        if (mProgressDrawable != null && mProgressDrawable.isStateful())
        {
            mProgressDrawable.setState(ai);
        }
        if (mIndeterminateDrawable != null && mIndeterminateDrawable.isStateful())
        {
            mIndeterminateDrawable.setState(ai);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        updateDrawableState();
    }

    Drawable getCurrentDrawable()
    {
        return mCurrentDrawable;
    }

    Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    public Drawable getIndeterminateDrawable()
    {
        return mIndeterminateDrawable;
    }

    public Interpolator getInterpolator()
    {
        return mInterpolator;
    }

    public int getMax()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mMax;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = mProgress;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Drawable getProgressDrawable()
    {
        return mProgressDrawable;
    }

    public int getSecondaryProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = mSecondaryProgress;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void incrementProgressBy(int i)
    {
        this;
        JVM INSTR monitorenter ;
        setProgress(mProgress + i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void incrementSecondaryProgressBy(int i)
    {
        this;
        JVM INSTR monitorenter ;
        setSecondaryProgress(mSecondaryProgress + i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void invalidateDrawable(Drawable drawable)
    {
label0:
        {
            if (!mInDrawing)
            {
                if (!verifyDrawable(drawable))
                {
                    break label0;
                }
                drawable = drawable.getBounds();
                int i = getScrollX() + getPaddingLeft();
                int j = getScrollY() + getPaddingTop();
                invalidate(((Rect) (drawable)).left + i, ((Rect) (drawable)).top + j, ((Rect) (drawable)).right + i, ((Rect) (drawable)).bottom + j);
            }
            return;
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isIndeterminate()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (mProgressDrawable != null)
        {
            mProgressDrawable.jumpToCurrentState();
        }
        if (mIndeterminateDrawable != null)
        {
            mIndeterminateDrawable.jumpToCurrentState();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mIndeterminate)
        {
            startAnimation();
        }
    }

    protected void onDetachedFromWindow()
    {
        if (mIndeterminate)
        {
            stopAnimation();
        }
        if (mRefreshProgressRunnable != null)
        {
            removeCallbacks(mRefreshProgressRunnable);
        }
        if (mAccessibilityEventSender != null)
        {
            removeCallbacks(mAccessibilityEventSender);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable;
        super.onDraw(canvas);
        drawable = mCurrentDrawable;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        float f;
        canvas.save();
        canvas.translate(getPaddingLeft() + mIndeterminateRealLeft, getPaddingTop() + mIndeterminateRealTop);
        long l = getDrawingTime();
        if (mAnimation == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        mAnimation.getTransformation(l, mTransformation);
        f = mTransformation.getAlpha();
        mInDrawing = true;
        drawable.setLevel((int)(10000F * f));
        mInDrawing = false;
        if (SystemClock.uptimeMillis() - mLastDrawTime >= (long)mAnimationResolution)
        {
            mLastDrawTime = SystemClock.uptimeMillis();
            postInvalidateDelayed(mAnimationResolution);
        }
        drawable.draw(canvas);
        canvas.restore();
        if (mShouldStartAnimationDrawable && (drawable instanceof Animatable))
        {
            ((Animatable)drawable).start();
            mShouldStartAnimationDrawable = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        mInDrawing = false;
        throw canvas;
        canvas;
        this;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setItemCount(mMax);
        accessibilityevent.setCurrentItemIndex(mProgress);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable = mCurrentDrawable;
        int k;
        int l;
        l = 0;
        k = 0;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = Math.max(mMinWidth, Math.min(mMaxWidth, drawable.getIntrinsicWidth()));
        k = Math.max(mMinHeight, Math.min(mMaxHeight, drawable.getIntrinsicHeight()));
        updateDrawableState();
        l += getPaddingLeft() + getPaddingRight();
        k += getPaddingTop() + getPaddingBottom();
        if (!IS_HONEYCOMB) goto _L2; else goto _L1
_L1:
        setMeasuredDimension(View.resolveSizeAndState(l, i, 0), View.resolveSizeAndState(k, j, 0));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void onProgressRefresh(float f, boolean flag)
    {
        if (mAccessibilityManager.isEnabled())
        {
            scheduleAccessibilityEventSender();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setProgress(((SavedState) (parcelable)).progress);
        setSecondaryProgress(((SavedState) (parcelable)).secondaryProgress);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.progress = mProgress;
        savedstate.secondaryProgress = mSecondaryProgress;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        updateDrawableBounds(i, j);
    }

    protected void onVisibilityChanged(View view, int i)
    {
label0:
        {
            super.onVisibilityChanged(view, i);
            if (mIndeterminate)
            {
                if (i != 8 && i != 4)
                {
                    break label0;
                }
                stopAnimation();
            }
            return;
        }
        startAnimation();
    }

    public void postInvalidate()
    {
        if (!mNoInvalidate)
        {
            super.postInvalidate();
        }
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (mOnlyIndeterminate && mIndeterminate || flag == mIndeterminate) goto _L2; else goto _L1
_L1:
        mIndeterminate = flag;
        if (!flag) goto _L4; else goto _L3
_L3:
        mCurrentDrawable = mIndeterminateDrawable;
        startAnimation();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        mCurrentDrawable = mProgressDrawable;
        stopAnimation();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void setIndeterminateDrawable(Drawable drawable)
    {
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        mIndeterminateDrawable = drawable;
        if (mIndeterminate)
        {
            mCurrentDrawable = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Context context, int i)
    {
        setInterpolator(AnimationUtils.loadInterpolator(context, i));
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }

    public void setMax(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (j != mMax)
        {
            mMax = j;
            postInvalidate();
            if (mProgress > j)
            {
                mProgress = j;
            }
            refreshProgress(0x102000d, mProgress, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        setProgress(i, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void setProgress(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mIndeterminate;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
        if (j > mMax)
        {
            i = mMax;
        }
        if (i != mProgress)
        {
            mProgress = i;
            refreshProgress(0x102000d, mProgress, flag);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgressDrawable(Drawable drawable)
    {
        boolean flag;
        if (mProgressDrawable != null && drawable != mProgressDrawable)
        {
            mProgressDrawable.setCallback(null);
            flag = true;
        } else
        {
            flag = false;
        }
        if (drawable != null)
        {
            drawable.setCallback(this);
            int i = drawable.getMinimumHeight();
            if (mMaxHeight < i)
            {
                mMaxHeight = i;
                requestLayout();
            }
        }
        mProgressDrawable = drawable;
        if (!mIndeterminate)
        {
            mCurrentDrawable = drawable;
            postInvalidate();
        }
        if (flag)
        {
            updateDrawableBounds(getWidth(), getHeight());
            updateDrawableState();
            doRefreshProgress(0x102000d, mProgress, false, false);
            doRefreshProgress(0x102000f, mSecondaryProgress, false, false);
        }
    }

    public void setSecondaryProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
        if (j > mMax)
        {
            i = mMax;
        }
        if (i != mSecondaryProgress)
        {
            mSecondaryProgress = i;
            refreshProgress(0x102000f, mSecondaryProgress, false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setVisibility(int i)
    {
label0:
        {
            if (getVisibility() != i)
            {
                super.setVisibility(i);
                if (mIndeterminate)
                {
                    if (i != 8 && i != 4)
                    {
                        break label0;
                    }
                    stopAnimation();
                }
            }
            return;
        }
        startAnimation();
    }

    void startAnimation()
    {
        if (getVisibility() != 0)
        {
            return;
        }
        if (mIndeterminateDrawable instanceof Animatable)
        {
            mShouldStartAnimationDrawable = true;
            mAnimation = null;
        } else
        {
            if (mInterpolator == null)
            {
                mInterpolator = new LinearInterpolator();
            }
            mTransformation = new Transformation();
            mAnimation = new AlphaAnimation(0.0F, 1.0F);
            mAnimation.setRepeatMode(mBehavior);
            mAnimation.setRepeatCount(-1);
            mAnimation.setDuration(mDuration);
            mAnimation.setInterpolator(mInterpolator);
            mAnimation.setStartTime(-1L);
        }
        postInvalidate();
    }

    void stopAnimation()
    {
        mAnimation = null;
        mTransformation = null;
        if (mIndeterminateDrawable instanceof Animatable)
        {
            ((Animatable)mIndeterminateDrawable).stop();
            mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == mProgressDrawable || drawable == mIndeterminateDrawable || super.verifyDrawable(drawable);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB = flag;
    }


}
