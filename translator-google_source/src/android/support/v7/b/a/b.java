// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.b.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;

public class b extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private Drawable a;

    public b(Drawable drawable)
    {
        if (a != null)
        {
            a.setCallback(null);
        }
        a = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas)
    {
        a.draw(canvas);
    }

    public int getChangingConfigurations()
    {
        return a.getChangingConfigurations();
    }

    public Drawable getCurrent()
    {
        return a.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return a.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return a.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return a.getMinimumWidth();
    }

    public int getOpacity()
    {
        return a.getOpacity();
    }

    public boolean getPadding(Rect rect)
    {
        return a.getPadding(rect);
    }

    public int[] getState()
    {
        return a.getState();
    }

    public Region getTransparentRegion()
    {
        return a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public boolean isAutoMirrored()
    {
        return android.support.v4.a.a.a.b(a);
    }

    public boolean isStateful()
    {
        return a.isStateful();
    }

    public void jumpToCurrentState()
    {
        android.support.v4.a.a.a.a(a);
    }

    protected void onBoundsChange(Rect rect)
    {
        a.setBounds(rect);
    }

    protected boolean onLevelChange(int i)
    {
        return a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setAutoMirrored(boolean flag)
    {
        android.support.v4.a.a.a.a(a, flag);
    }

    public void setChangingConfigurations(int i)
    {
        a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        a.setDither(flag);
    }

    public void setFilterBitmap(boolean flag)
    {
        a.setFilterBitmap(flag);
    }

    public void setHotspot(float f, float f1)
    {
        android.support.v4.a.a.a.a(a, f, f1);
    }

    public void setHotspotBounds(int i, int j, int k, int l)
    {
        android.support.v4.a.a.a.a(a, i, j, k, l);
    }

    public boolean setState(int ai[])
    {
        return a.setState(ai);
    }

    public void setTint(int i)
    {
        android.support.v4.a.a.a.a(a, i);
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        android.support.v4.a.a.a.a(a, colorstatelist);
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        android.support.v4.a.a.a.a(a, mode);
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1) || a.setVisible(flag, flag1);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }
}
