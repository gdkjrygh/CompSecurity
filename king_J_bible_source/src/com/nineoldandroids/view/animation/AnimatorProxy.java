// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
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
    private final Camera mCamera = new Camera();
    private boolean mHasPivot;
    private float mPivotX;
    private float mPivotY;
    private float mRotationX;
    private float mRotationY;
    private float mRotationZ;
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
        if (view == null || view.getParent() == null)
        {
            return;
        } else
        {
            RectF rectf = mAfter;
            computeRect(rectf, view);
            rectf.union(mBefore);
            ((View)view.getParent()).invalidate((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
            return;
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
        float f2 = view.getWidth();
        float f3 = view.getHeight();
        boolean flag = mHasPivot;
        float f;
        float f1;
        float f4;
        float f5;
        float f6;
        if (flag)
        {
            f = mPivotX;
        } else
        {
            f = f2 / 2.0F;
        }
        if (flag)
        {
            f1 = mPivotY;
        } else
        {
            f1 = f3 / 2.0F;
        }
        f4 = mRotationX;
        f5 = mRotationY;
        f6 = mRotationZ;
        if (f4 != 0.0F || f5 != 0.0F || f6 != 0.0F)
        {
            view = mCamera;
            view.save();
            view.rotateX(f4);
            view.rotateY(f5);
            view.rotateZ(-f6);
            view.getMatrix(matrix);
            view.restore();
            matrix.preTranslate(-f, -f1);
            matrix.postTranslate(f, f1);
        }
        f4 = mScaleX;
        f5 = mScaleY;
        if (f4 != 1.0F || f5 != 1.0F)
        {
            matrix.postScale(f4, f5);
            matrix.postTranslate(-(f / f2) * (f4 * f2 - f2), -(f1 / f3) * (f5 * f3 - f3));
        }
        matrix.postTranslate(mTranslationX, mTranslationY);
    }

    public static AnimatorProxy wrap(View view)
    {
        AnimatorProxy animatorproxy;
label0:
        {
            AnimatorProxy animatorproxy1 = (AnimatorProxy)PROXIES.get(view);
            if (animatorproxy1 != null)
            {
                animatorproxy = animatorproxy1;
                if (animatorproxy1 == view.getAnimation())
                {
                    break label0;
                }
            }
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

    public float getPivotX()
    {
        return mPivotX;
    }

    public float getPivotY()
    {
        return mPivotY;
    }

    public float getRotation()
    {
        return mRotationZ;
    }

    public float getRotationX()
    {
        return mRotationX;
    }

    public float getRotationY()
    {
        return mRotationY;
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

    public float getX()
    {
        View view = (View)mView.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getLeft() + mTranslationX;
        }
    }

    public float getY()
    {
        View view = (View)mView.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getTop() + mTranslationY;
        }
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

    public void setPivotX(float f)
    {
        if (!mHasPivot || mPivotX != f)
        {
            prepareForUpdate();
            mHasPivot = true;
            mPivotX = f;
            invalidateAfterUpdate();
        }
    }

    public void setPivotY(float f)
    {
        if (!mHasPivot || mPivotY != f)
        {
            prepareForUpdate();
            mHasPivot = true;
            mPivotY = f;
            invalidateAfterUpdate();
        }
    }

    public void setRotation(float f)
    {
        if (mRotationZ != f)
        {
            prepareForUpdate();
            mRotationZ = f;
            invalidateAfterUpdate();
        }
    }

    public void setRotationX(float f)
    {
        if (mRotationX != f)
        {
            prepareForUpdate();
            mRotationX = f;
            invalidateAfterUpdate();
        }
    }

    public void setRotationY(float f)
    {
        if (mRotationY != f)
        {
            prepareForUpdate();
            mRotationY = f;
            invalidateAfterUpdate();
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
            view.scrollTo(view.getScrollX(), i);
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

    public void setX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            setTranslationX(f - (float)view.getLeft());
        }
    }

    public void setY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            setTranslationY(f - (float)view.getTop());
        }
    }

    static 
    {
        boolean flag;
        if (Integer.valueOf(android.os.Build.VERSION.SDK).intValue() < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        NEEDS_PROXY = flag;
    }
}
