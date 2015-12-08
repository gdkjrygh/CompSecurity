// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.app:
//            ActionBarDrawerToggle

private static class mWrapped extends Drawable
    implements android.graphics.drawable.apped
{

    private float mOffset;
    private float mOffsetBy;
    private final Rect mTmpRect = new Rect();
    private Drawable mWrapped;

    public void clearColorFilter()
    {
        mWrapped.clearColorFilter();
    }

    public void draw(Canvas canvas)
    {
        mWrapped.copyBounds(mTmpRect);
        canvas.save();
        canvas.translate(mOffsetBy * (float)mTmpRect.width() * -mOffset, 0.0F);
        mWrapped.draw(canvas);
        canvas.restore();
    }

    public int getChangingConfigurations()
    {
        return mWrapped.getChangingConfigurations();
    }

    public android.graphics.drawable.apped getConstantState()
    {
        return super.getConstantState();
    }

    public Drawable getCurrent()
    {
        return mWrapped.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return mWrapped.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return mWrapped.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return mWrapped.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return mWrapped.getMinimumWidth();
    }

    public float getOffset()
    {
        return mOffset;
    }

    public int getOpacity()
    {
        return mWrapped.getOpacity();
    }

    public boolean getPadding(Rect rect)
    {
        return mWrapped.getPadding(rect);
    }

    public int[] getState()
    {
        return mWrapped.getState();
    }

    public Region getTransparentRegion()
    {
        return mWrapped.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == mWrapped)
        {
            invalidateSelf();
        }
    }

    public boolean isStateful()
    {
        return mWrapped.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mWrapped.setBounds(rect);
    }

    protected boolean onStateChange(int ai[])
    {
        mWrapped.setState(ai);
        return super.onStateChange(ai);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (drawable == mWrapped)
        {
            scheduleSelf(runnable, l);
        }
    }

    public void setAlpha(int i)
    {
        mWrapped.setAlpha(i);
    }

    public void setChangingConfigurations(int i)
    {
        mWrapped.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, android.graphics.wable wable)
    {
        mWrapped.setColorFilter(i, wable);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mWrapped.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        mWrapped.setDither(flag);
    }

    public void setFilterBitmap(boolean flag)
    {
        mWrapped.setFilterBitmap(flag);
    }

    public void setOffset(float f)
    {
        mOffset = f;
        invalidateSelf();
    }

    public void setOffsetBy(float f)
    {
        mOffsetBy = f;
        invalidateSelf();
    }

    public boolean setState(int ai[])
    {
        return mWrapped.setState(ai);
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (drawable == mWrapped)
        {
            unscheduleSelf(runnable);
        }
    }

    public (Drawable drawable)
    {
        mWrapped = drawable;
    }
}
