// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package com.google.android.play.image:
//            AvatarCropTransformation, BitmapTransformation, FifeUrlUtils, BitmapLoader

public class FifeImageView extends ImageView
    implements BitmapLoader.BitmapLoadedHandler
{
    public static interface OnLoadedListener
    {

        public abstract void onLoaded$3adf1739();

        public abstract void onLoadedAndFadedIn$3ef8e495();
    }


    private static boolean IS_HC_OR_ABOVE;
    private static boolean IS_ICS_OR_ABOVE;
    public BitmapLoader mBitmapLoader;
    private BitmapTransformation mBitmapTransformation;
    private boolean mBlockLayout;
    public Drawable mDefaultDrawable;
    private float mDefaultZoom;
    private int mDesiredHeight;
    private int mDesiredWidth;
    private Animation mFadeInAnimation;
    private android.view.animation.Animation.AnimationListener mFadeInAnimationListener;
    private android.animation.Animator.AnimatorListener mFadeInAnimatorListener;
    private int mFadeInDuration;
    private final PointF mFocusPoint;
    private boolean mForegroundBoundsChanged;
    private Drawable mForegroundDrawable;
    private Handler mHandler;
    private boolean mHasDefaultZoom;
    boolean mIsLoaded;
    private final Matrix mMatrix;
    private boolean mMayBlockLayout;
    public OnLoadedListener mOnLoadedListener;
    private float mRequestScaleFactor;
    private final Rect mSelfBounds;
    public boolean mSupportsFifeUrlOptions;
    private boolean mToFadeInAfterLoad;
    public String mUrl;

    public FifeImageView(Context context)
    {
        this(context, null);
    }

    public FifeImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FifeImageView(Context context, AttributeSet attributeset, int i)
    {
        Resources resources;
        TypedArray typedarray;
        super(context, attributeset, i);
        mSelfBounds = new Rect();
        mForegroundBoundsChanged = false;
        mFocusPoint = new PointF(0.5F, 0.5F);
        mMatrix = new Matrix();
        typedarray = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.FifeImageView);
        mToFadeInAfterLoad = typedarray.getBoolean(4, true);
        mMayBlockLayout = typedarray.getBoolean(0, false);
        mHasDefaultZoom = typedarray.hasValue(3);
        if (mHasDefaultZoom)
        {
            mDefaultZoom = typedarray.getFraction(3, 1, 1, 1.0F);
            super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        } else
        {
            mDefaultZoom = 1.0F;
        }
        resources = context.getResources();
        if (!typedarray.getBoolean(1, false)) goto _L2; else goto _L1
_L1:
        mBitmapTransformation = AvatarCropTransformation.getFullAvatarCrop(resources);
_L4:
        mRequestScaleFactor = typedarray.getFraction(5, 1, 1, 1.0F);
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010109
        });
        attributeset = context.getDrawable(0);
        if (attributeset != null)
        {
            setForeground(attributeset);
        }
        context.recycle();
        mFadeInDuration = resources.getInteger(0x10e0000);
        mHandler = new Handler(Looper.getMainLooper());
        return;
_L2:
        if (typedarray.getBoolean(2, false))
        {
            mBitmapTransformation = AvatarCropTransformation.getNoRingAvatarCrop(resources);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void blockLayoutIfPossible()
    {
        if (mMayBlockLayout)
        {
            mBlockLayout = true;
        }
    }

    private void invokeOnFadeInDone()
    {
        if (mOnLoadedListener != null)
        {
            mOnLoadedListener._mth3ef8e495();
        }
    }

    private void loadFromCache(Bitmap bitmap, boolean flag)
    {
        setImageBitmap(bitmap);
        setLoaded$7c48010f(flag);
    }

    private void updateMatrix()
    {
        Drawable drawable = getDrawable();
        float f = getWidth();
        float f1 = getHeight();
        if (drawable == null || f == 0.0F || f1 == 0.0F)
        {
            return;
        }
        float f2 = drawable.getIntrinsicWidth();
        float f3 = drawable.getIntrinsicHeight();
        if (f2 <= 0.0F || f3 <= 0.0F)
        {
            mMatrix.reset();
        } else
        {
            float f5 = Math.max(f / f2, f1 / f3);
            float f4 = Math.max(f2 - f / f5, 0.0F);
            f5 = Math.max(f3 - f1 / f5, 0.0F);
            float f6 = f4 * mFocusPoint.x;
            float f7 = f5 * mFocusPoint.y;
            float f8 = f2 * (mDefaultZoom - 1.0F);
            float f9 = f3 * (mDefaultZoom - 1.0F);
            RectF rectf = new RectF(f8 / 2.0F + f6, f9 / 2.0F + f7, f2 - (f4 - f6) - f8 / 2.0F, f3 - (f5 - f7) - f9 / 2.0F);
            RectF rectf1 = new RectF(0.0F, 0.0F, f, f1);
            mMatrix.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.FILL);
        }
        super.setImageMatrix(mMatrix);
    }

    public void drawableHotspotChanged(float f, float f1)
    {
        super.drawableHotspotChanged(f, f1);
        if (mForegroundDrawable != null)
        {
            mForegroundDrawable.setHotspot(f, f1);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mForegroundDrawable != null && mForegroundDrawable.isStateful())
        {
            mForegroundDrawable.setState(getDrawableState());
        }
        if (mBitmapTransformation != null)
        {
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (IS_HC_OR_ABOVE && mForegroundDrawable != null)
        {
            mForegroundDrawable.jumpToCurrentState();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag1;
        int i;
        int j;
        flag1 = false;
        super.onDraw(canvas);
        i = getWidth();
        j = getHeight();
        if (mBitmapTransformation != null) goto _L2; else goto _L1
_L1:
        if (mForegroundDrawable != null)
        {
            if (mForegroundBoundsChanged)
            {
                mForegroundBoundsChanged = false;
                Rect rect = mSelfBounds;
                rect.set(0, 0, getWidth(), getHeight());
                mForegroundDrawable.setBounds(rect);
            }
            mForegroundDrawable.draw(canvas);
        }
_L4:
        return;
_L2:
        boolean flag;
label0:
        {
            flag = flag1;
            if (!isPressed())
            {
                break label0;
            }
            if (!isDuplicateParentStateEnabled())
            {
                flag = flag1;
                if (!isClickable())
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            mBitmapTransformation.drawPressedOverlay(canvas, i, j);
        }
        if (isFocused())
        {
            mBitmapTransformation.drawFocusedOverlay(canvas, i, j);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onLayout(final boolean isLoaded, int i, int j, int k, int l)
    {
        super.onLayout(isLoaded, i, j, k, l);
        i = getWidth();
        j = getHeight();
        if (i == 0 && j == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        mDesiredWidth = 0;
        mDesiredHeight = 0;
        obj = getLayoutParams();
        float f;
        if (((android.view.ViewGroup.LayoutParams) (obj)).width == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (((android.view.ViewGroup.LayoutParams) (obj)).height == -1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0 && j != 0) goto _L4; else goto _L3
_L3:
        if (i != 0)
        {
            mDesiredWidth = getWidth();
        } else
        {
label0:
            {
                if (((android.view.ViewGroup.LayoutParams) (obj)).width <= 0)
                {
                    break label0;
                }
                mDesiredWidth = getWidth();
                if (((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
                {
                    mDesiredHeight = ((android.view.ViewGroup.LayoutParams) (obj)).height;
                }
            }
        }
_L8:
        if (mBitmapTransformation != null)
        {
            i = mBitmapTransformation.getTransformationInset(mDesiredWidth, mDesiredHeight);
        } else
        {
            i = 0;
        }
        if (mDesiredWidth > 0)
        {
            mDesiredWidth = mDesiredWidth - i;
        }
        if (mDesiredHeight > 0)
        {
            mDesiredHeight = mDesiredHeight - i;
        }
        f = FifeUrlUtils.getNetworkScaleFactor(getContext());
        mDesiredWidth = (int)(mRequestScaleFactor * f * (float)mDesiredWidth);
        mDesiredHeight = (int)(f * mRequestScaleFactor * (float)mDesiredHeight);
        isLoaded = TextUtils.isEmpty(mUrl);
        if (!isLoaded && (mDesiredWidth > 0 || mDesiredHeight > 0)) goto _L6; else goto _L5
_L5:
        obj = (BitmapLoader.BitmapContainer)getTag();
        if (obj != null)
        {
            ((BitmapLoader.BitmapContainer) (obj)).cancelRequest();
            setImageBitmap(null);
        }
        if (isLoaded && mBitmapTransformation != null)
        {
            obj = mBitmapTransformation.transform(null, getWidth(), getHeight());
            setImageBitmap(((Bitmap) (obj)));
            if (obj != null)
            {
                isLoaded = true;
            } else
            {
                isLoaded = false;
            }
            setLoaded$7c48010f(isLoaded);
        }
_L2:
        mForegroundBoundsChanged = true;
        return;
        if (j == 0) goto _L4; else goto _L7
_L7:
        mDesiredHeight = getHeight();
          goto _L8
_L4:
        mDesiredWidth = getWidth();
        mDesiredHeight = getHeight();
          goto _L8
_L6:
        i = 0;
        j = 0;
        if (mSupportsFifeUrlOptions)
        {
            i = mDesiredWidth;
            j = mDesiredHeight;
        }
        obj = (BitmapLoader.BitmapContainer)getTag();
        if (obj == null || ((BitmapLoader.BitmapContainer) (obj)).mRequestUrl == null)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        if (((BitmapLoader.BitmapContainer) (obj)).mRequestUrl.equals(mUrl) && ((BitmapLoader.BitmapContainer) (obj)).mRequestWidth == i && ((BitmapLoader.BitmapContainer) (obj)).mRequestHeight == j) goto _L2; else goto _L9
_L9:
        ((BitmapLoader.BitmapContainer) (obj)).cancelRequest();
        BitmapLoader bitmaploader = mBitmapLoader;
        String s = mUrl;
        final Object finalBitmap;
        if (i > 0 || j > 0)
        {
            finalBitmap = FifeUrlUtils.buildFifeUrl(s, i, j);
        } else
        {
            finalBitmap = s;
        }
        new BitmapLoader._cls1(bitmaploader, i, j, ((String) (finalBitmap)), s, false);
        if (TextUtils.isEmpty(s))
        {
            finalBitmap = new BitmapLoader.BitmapContainer(bitmaploader, null, null, null, i, j, null);
            setTag(finalBitmap);
            finalBitmap = ((BitmapLoader.BitmapContainer) (finalBitmap)).mBitmap;
            if (finalBitmap != null)
            {
                if (mBitmapTransformation != null)
                {
                    finalBitmap = mBitmapTransformation.transform(((Bitmap) (finalBitmap)), getWidth(), getHeight());
                }
                if (finalBitmap != null)
                {
                    isLoaded = true;
                } else
                {
                    isLoaded = false;
                }
                if (mMayBlockLayout)
                {
                    loadFromCache(((Bitmap) (finalBitmap)), isLoaded);
                } else
                {
                    mHandler.post(new Runnable() {

                        final FifeImageView this$0;
                        final Bitmap val$finalBitmap;
                        final boolean val$isLoaded;

                        public final void run()
                        {
                            loadFromCache(finalBitmap, isLoaded);
                        }

            
            {
                this$0 = FifeImageView.this;
                finalBitmap = bitmap;
                isLoaded = flag;
                super();
            }
                    });
                }
            } else
            {
                setImageDrawable(mDefaultDrawable);
            }
        } else
        {
            throw new NullPointerException();
        }
          goto _L2
    }

    public final void onResponse(BitmapLoader.BitmapContainer bitmapcontainer)
    {
        boolean flag1 = true;
        Bitmap bitmap = bitmapcontainer.mBitmap;
        if (bitmap == null)
        {
            setLoaded$7c48010f(false);
            return;
        }
        bitmapcontainer = bitmap;
        if (mBitmapTransformation != null)
        {
            bitmapcontainer = mBitmapTransformation.transform(bitmap, getWidth(), getHeight());
        }
        boolean flag;
        if (!mIsLoaded)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setImageBitmap(bitmapcontainer);
        if (bitmapcontainer == null)
        {
            flag1 = false;
        }
        setLoaded$7c48010f(flag1);
        if (flag && mToFadeInAfterLoad)
        {
            if (IS_ICS_OR_ABOVE)
            {
                if (mFadeInAnimatorListener == null && mOnLoadedListener != null)
                {
                    mFadeInAnimatorListener = new AnimatorListenerAdapter() {

                        final FifeImageView this$0;

                        public final void onAnimationEnd(Animator animator)
                        {
                            invokeOnFadeInDone();
                        }

            
            {
                this$0 = FifeImageView.this;
                super();
            }
                    };
                }
                setAlpha(0.0F);
                animate().alpha(1.0F).setDuration(mFadeInDuration).setListener(mFadeInAnimatorListener);
                return;
            }
            if (mFadeInAnimation == null)
            {
                mFadeInAnimation = AnimationUtils.loadAnimation(getContext(), 0x7f050017);
            }
            if (mFadeInAnimationListener == null && mOnLoadedListener != null)
            {
                mFadeInAnimationListener = new android.view.animation.Animation.AnimationListener() {

                    final FifeImageView this$0;

                    public final void onAnimationEnd(Animation animation)
                    {
                        invokeOnFadeInDone();
                    }

                    public final void onAnimationRepeat(Animation animation)
                    {
                    }

                    public final void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$0 = FifeImageView.this;
                super();
            }
                };
            }
            mFadeInAnimation.setAnimationListener(mFadeInAnimationListener);
            startAnimation(mFadeInAnimation);
            return;
        } else
        {
            invokeOnFadeInDone();
            return;
        }
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((BitmapLoader.BitmapContainer)obj);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (mHasDefaultZoom)
        {
            updateMatrix();
        }
        mForegroundBoundsChanged = true;
    }

    public void requestLayout()
    {
        if (!mBlockLayout)
        {
            super.requestLayout();
        }
    }

    public void setForeground(Drawable drawable)
    {
        if (mForegroundDrawable != drawable)
        {
            if (mForegroundDrawable != null)
            {
                mForegroundDrawable.setCallback(null);
                unscheduleDrawable(mForegroundDrawable);
            }
            mForegroundDrawable = drawable;
            if (drawable != null)
            {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful())
                {
                    drawable.setState(getDrawableState());
                }
            } else
            {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        blockLayoutIfPossible();
        super.setImageDrawable(drawable);
        mBlockLayout = false;
        if (mHasDefaultZoom)
        {
            updateMatrix();
        }
    }

    public void setImageMatrix(Matrix matrix)
    {
        if (mHasDefaultZoom)
        {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        } else
        {
            super.setImageMatrix(matrix);
            return;
        }
    }

    public void setImageResource(int i)
    {
        blockLayoutIfPossible();
        super.setImageResource(i);
        mBlockLayout = false;
        if (mHasDefaultZoom)
        {
            updateMatrix();
        }
    }

    public void setImageURI(Uri uri)
    {
        blockLayoutIfPossible();
        super.setImageURI(uri);
        mBlockLayout = false;
    }

    public final void setLoaded$7c48010f(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        mIsLoaded = flag;
        if (mIsLoaded && mOnLoadedListener != null)
        {
            mOnLoadedListener._mth3adf1739();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (mHasDefaultZoom)
        {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        } else
        {
            super.setScaleType(scaletype);
            return;
        }
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (mForegroundDrawable != null)
        {
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mForegroundDrawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mForegroundDrawable;
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HC_OR_ABOVE = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        IS_ICS_OR_ABOVE = flag;
    }


}
