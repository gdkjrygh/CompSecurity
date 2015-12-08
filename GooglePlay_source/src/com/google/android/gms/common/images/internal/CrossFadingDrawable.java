// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.common.util.PlatformVersion;

public final class CrossFadingDrawable extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class EmptyDrawable extends Drawable
    {

        private static final EmptyConstantState EMPTY_CONSTANT_STATE = new EmptyConstantState((byte)0);
        private static final EmptyDrawable EMPTY_DRAWABLE = new EmptyDrawable();

        public final void draw(Canvas canvas)
        {
        }

        public final android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return EMPTY_CONSTANT_STATE;
        }

        public final int getOpacity()
        {
            return -2;
        }

        public final void setAlpha(int i)
        {
        }

        public final void setColorFilter(ColorFilter colorfilter)
        {
        }



        private EmptyDrawable()
        {
        }
    }

    private static final class EmptyDrawable.EmptyConstantState extends android.graphics.drawable.Drawable.ConstantState
    {

        public final int getChangingConfigurations()
        {
            return 0;
        }

        public final Drawable newDrawable()
        {
            return EmptyDrawable.EMPTY_DRAWABLE;
        }

        private EmptyDrawable.EmptyConstantState()
        {
        }

        EmptyDrawable.EmptyConstantState(byte byte0)
        {
            this();
        }
    }

    static final class RealTransitionState extends android.graphics.drawable.Drawable.ConstantState
    {

        int mChangingConfigurations;
        int mChildrenChangingConfigurations;

        public final int getChangingConfigurations()
        {
            return mChangingConfigurations;
        }

        public final Drawable newDrawable()
        {
            return new CrossFadingDrawable(this);
        }

        RealTransitionState(RealTransitionState realtransitionstate)
        {
            if (realtransitionstate != null)
            {
                mChangingConfigurations = realtransitionstate.mChangingConfigurations;
                mChildrenChangingConfigurations = realtransitionstate.mChildrenChangingConfigurations;
            }
        }
    }


    public int mAlpha;
    private boolean mCanConstantState;
    private boolean mCheckedConstantState;
    private boolean mCrossFade;
    public int mDuration;
    public Drawable mEndDrawable;
    public int mFrom;
    private boolean mHaveOpacity;
    public int mMaxAlpha;
    private boolean mMutated;
    private int mOpacity;
    private RealTransitionState mRealTransitionState;
    private Drawable mStartDrawable;
    private long mStartTimeMillis;
    public int mTo;
    public int mTransitionState;

    public CrossFadingDrawable(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = EmptyDrawable.EMPTY_DRAWABLE;
        }
        mStartDrawable = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = mRealTransitionState;
        drawable.mChildrenChangingConfigurations = ((RealTransitionState) (drawable)).mChildrenChangingConfigurations | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = EmptyDrawable.EMPTY_DRAWABLE;
        }
        mEndDrawable = drawable;
        drawable.setCallback(this);
        drawable1 = mRealTransitionState;
        drawable1.mChildrenChangingConfigurations = ((RealTransitionState) (drawable1)).mChildrenChangingConfigurations | drawable.getChangingConfigurations();
    }

    CrossFadingDrawable(RealTransitionState realtransitionstate)
    {
        mTransitionState = 0;
        mMaxAlpha = 255;
        mAlpha = 0;
        mCrossFade = true;
        mRealTransitionState = new RealTransitionState(realtransitionstate);
    }

    private boolean canConstantState()
    {
        if (!mCheckedConstantState)
        {
            boolean flag;
            if (mStartDrawable.getConstantState() != null && mEndDrawable.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mCanConstantState = flag;
            mCheckedConstantState = true;
        }
        return mCanConstantState;
    }

    public final void draw(Canvas canvas)
    {
        boolean flag = true;
        mTransitionState;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 96
    //                   2 114;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        int i;
        boolean flag1;
        i = mAlpha;
        flag1 = mCrossFade;
        drawable = mStartDrawable;
        drawable1 = mEndDrawable;
        if (flag)
        {
            if (!flag1 || i == 0)
            {
                drawable.draw(canvas);
            }
            if (i == mMaxAlpha)
            {
                drawable1.setAlpha(mMaxAlpha);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        mStartTimeMillis = SystemClock.uptimeMillis();
        flag = false;
        mTransitionState = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        if (mStartTimeMillis >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - mStartTimeMillis) / (float)mDuration;
            if (f >= 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                mTransitionState = 0;
            }
            f = Math.min(f, 1.0F);
            mAlpha = (int)(0.0F + (float)(mTo + 0) * f);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(mMaxAlpha - i);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(mMaxAlpha);
        }
        if (i > 0)
        {
            drawable1.setAlpha(i);
            drawable1.draw(canvas);
            drawable1.setAlpha(mMaxAlpha);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | mRealTransitionState.mChangingConfigurations | mRealTransitionState.mChildrenChangingConfigurations;
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            mRealTransitionState.mChangingConfigurations = getChangingConfigurations();
            return mRealTransitionState;
        } else
        {
            return null;
        }
    }

    public final int getIntrinsicHeight()
    {
        return Math.max(mStartDrawable.getIntrinsicHeight(), mEndDrawable.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth()
    {
        return Math.max(mStartDrawable.getIntrinsicWidth(), mEndDrawable.getIntrinsicWidth());
    }

    public final int getOpacity()
    {
        if (!mHaveOpacity)
        {
            mOpacity = Drawable.resolveOpacity(mStartDrawable.getOpacity(), mEndDrawable.getOpacity());
            mHaveOpacity = true;
        }
        return mOpacity;
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        if (PlatformVersion.checkVersion(11))
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.invalidateDrawable(this);
            }
        }
    }

    public final Drawable mutate()
    {
        if (!mMutated && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            mStartDrawable.mutate();
            mEndDrawable.mutate();
            mMutated = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect)
    {
        mStartDrawable.setBounds(rect);
        mEndDrawable.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (PlatformVersion.checkVersion(11))
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.scheduleDrawable(this, runnable, l);
            }
        }
    }

    public final void setAlpha(int i)
    {
        if (mAlpha == mMaxAlpha)
        {
            mAlpha = i;
        }
        mMaxAlpha = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        mStartDrawable.setColorFilter(colorfilter);
        mEndDrawable.setColorFilter(colorfilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (PlatformVersion.checkVersion(11))
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }
}
