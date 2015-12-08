// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.view.animation;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.FloatMath;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class AnimatorProxy extends Animation
{

    public static final boolean NEEDS_PROXY;
    private static final WeakHashMap PROXIES = new WeakHashMap();
    private final RectF mAfter = new RectF();
    private float mAlpha;
    private final RectF mBefore = new RectF();
    private float mScaleX;
    private float mScaleY;
    private final Matrix mTempMatrix = new Matrix();
    private float mTranslationX;
    private float mTranslationY;
    private final WeakReference mView;

    private AnimatorProxy(View view)
    {
        mAlpha = 1.0F;
        mScaleX = 1.0F;
        mScaleY = 1.0F;
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        mView = new WeakReference(view);
    }

    private void computeRect(RectF rectf, View view)
    {
        rectf.set(0.0F, 0.0F, view.getWidth(), view.getHeight());
        Matrix matrix = mTempMatrix;
        matrix.reset();
        transformMatrix(matrix, view);
        mTempMatrix.mapRect(rectf);
        rectf.offset(view.getLeft(), view.getTop());
        if (rectf.right < rectf.left)
        {
            float f = rectf.right;
            rectf.right = rectf.left;
            rectf.left = f;
        }
        if (rectf.bottom < rectf.top)
        {
            float f1 = rectf.top;
            rectf.top = rectf.bottom;
            rectf.bottom = f1;
        }
    }

    private void invalidateAfterUpdate()
    {
        View view = (View)mView.get();
        View view1;
        if (view != null)
        {
            if ((view1 = (View)view.getParent()) != null)
            {
                view.setAnimation(this);
                RectF rectf = mAfter;
                computeRect(rectf, view);
                rectf.union(mBefore);
                view1.invalidate((int)FloatMath.floor(rectf.left), (int)FloatMath.floor(rectf.top), (int)FloatMath.ceil(rectf.right), (int)FloatMath.ceil(rectf.bottom));
                return;
            }
        }
    }

    private void prepareForUpdate()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            computeRect(mBefore, view);
        }
    }

    private void transformMatrix(Matrix matrix, View view)
    {
        float f3 = view.getWidth();
        float f2 = view.getHeight();
        float f = mScaleX;
        float f1 = mScaleY;
        if (f != 1.0F || f1 != 1.0F)
        {
            f3 = (f * f3 - f3) / 2.0F;
            f2 = (f1 * f2 - f2) / 2.0F;
            matrix.postScale(f, f1);
            matrix.postTranslate(-f3, -f2);
        }
        matrix.postTranslate(mTranslationX, mTranslationY);
    }

    public static AnimatorProxy wrap(View view)
    {
        AnimatorProxy animatorproxy1 = (AnimatorProxy)PROXIES.get(view);
        AnimatorProxy animatorproxy = animatorproxy1;
        if (animatorproxy1 == null)
        {
            animatorproxy = new AnimatorProxy(view);
            PROXIES.put(view, animatorproxy);
        }
        return animatorproxy;
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            transformation.setAlpha(mAlpha);
            transformMatrix(transformation.getMatrix(), view);
        }
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getScaleX()
    {
        return mScaleX;
    }

    public float getScaleY()
    {
        return mScaleY;
    }

    public int getScrollX()
    {
        View view = (View)mView.get();
        if (view == null)
        {
            return 0;
        } else
        {
            return view.getScrollX();
        }
    }

    public int getScrollY()
    {
        View view = (View)mView.get();
        if (view == null)
        {
            return 0;
        } else
        {
            return view.getScrollY();
        }
    }

    public float getTranslationX()
    {
        return mTranslationX;
    }

    public float getTranslationY()
    {
        return mTranslationY;
    }

    public void reset()
    {
    }

    public void setAlpha(float f)
    {
        if (mAlpha != f)
        {
            mAlpha = f;
            View view = (View)mView.get();
            if (view != null)
            {
                view.invalidate();
            }
        }
    }

    public void setScaleX(float f)
    {
        if (mScaleX != f)
        {
            prepareForUpdate();
            mScaleX = f;
            invalidateAfterUpdate();
        }
    }

    public void setScaleY(float f)
    {
        if (mScaleY != f)
        {
            prepareForUpdate();
            mScaleY = f;
            invalidateAfterUpdate();
        }
    }

    public void setScrollX(int i)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            view.scrollTo(i, view.getScrollY());
        }
    }

    public void setScrollY(int i)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            view.scrollTo(view.getScrollY(), i);
        }
    }

    public void setTranslationX(float f)
    {
        if (mTranslationX != f)
        {
            prepareForUpdate();
            mTranslationX = f;
            invalidateAfterUpdate();
        }
    }

    public void setTranslationY(float f)
    {
        if (mTranslationY != f)
        {
            prepareForUpdate();
            mTranslationY = f;
            invalidateAfterUpdate();
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        NEEDS_PROXY = flag;
    }
}
