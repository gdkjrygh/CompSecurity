// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableWrapper

class DrawableWrapperDonut extends Drawable
    implements android.graphics.drawable.Drawable.Callback, DrawableWrapper
{

    static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private android.graphics.PorterDuff.Mode mCurrentMode;
    Drawable mDrawable;
    private ColorStateList mTintList;
    private android.graphics.PorterDuff.Mode mTintMode;

    DrawableWrapperDonut(Drawable drawable)
    {
        mTintMode = DEFAULT_MODE;
        setWrappedDrawable(drawable);
    }

    private boolean updateTint(int ai[])
    {
        if (mTintList != null && mTintMode != null)
        {
            int i = mTintList.getColorForState(ai, mTintList.getDefaultColor());
            ai = mTintMode;
            if (!mColorFilterSet || i != mCurrentColor || ai != mCurrentMode)
            {
                setColorFilter(i, ai);
                mCurrentColor = i;
                mCurrentMode = ai;
                mColorFilterSet = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas)
    {
        mDrawable.draw(canvas);
    }

    public int getChangingConfigurations()
    {
        return mDrawable.getChangingConfigurations();
    }

    public Drawable getCurrent()
    {
        return mDrawable.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return mDrawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return mDrawable.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return mDrawable.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return mDrawable.getMinimumWidth();
    }

    public int getOpacity()
    {
        return mDrawable.getOpacity();
    }

    public boolean getPadding(Rect rect)
    {
        return mDrawable.getPadding(rect);
    }

    public int[] getState()
    {
        return mDrawable.getState();
    }

    public Region getTransparentRegion()
    {
        return mDrawable.getTransparentRegion();
    }

    public Drawable getWrappedDrawable()
    {
        return mDrawable;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public boolean isStateful()
    {
        return mTintList != null && mTintList.isStateful() || mDrawable.isStateful();
    }

    public Drawable mutate()
    {
        Drawable drawable = mDrawable;
        Drawable drawable1 = drawable.mutate();
        if (drawable1 != drawable)
        {
            setWrappedDrawable(drawable1);
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        mDrawable.setBounds(rect);
    }

    protected boolean onLevelChange(int i)
    {
        return mDrawable.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public void setAlpha(int i)
    {
        mDrawable.setAlpha(i);
    }

    public void setChangingConfigurations(int i)
    {
        mDrawable.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mDrawable.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        mDrawable.setDither(flag);
    }

    public void setFilterBitmap(boolean flag)
    {
        mDrawable.setFilterBitmap(flag);
    }

    public boolean setState(int ai[])
    {
        boolean flag = mDrawable.setState(ai);
        return updateTint(ai) || flag;
    }

    public void setTint(int i)
    {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        mTintList = colorstatelist;
        updateTint(getState());
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        mTintMode = mode;
        updateTint(getState());
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
    }

    public void setWrappedDrawable(Drawable drawable)
    {
        if (mDrawable != null)
        {
            mDrawable.setCallback(null);
        }
        mDrawable = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }

    static 
    {
        DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    }
}
