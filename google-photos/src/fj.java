// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class fj extends Drawable
    implements android.graphics.drawable.Drawable.Callback, fi
{

    private static android.graphics.PorterDuff.Mode b;
    Drawable a;
    private ColorStateList c;
    private android.graphics.PorterDuff.Mode d;
    private int e;
    private android.graphics.PorterDuff.Mode f;
    private boolean g;

    public fj(Drawable drawable)
    {
        d = b;
        a(drawable);
    }

    private boolean a(int ai[])
    {
        if (c != null && d != null)
        {
            int i = c.getColorForState(ai, c.getDefaultColor());
            ai = d;
            if (!g || i != e || ai != f)
            {
                setColorFilter(i, ai);
                e = i;
                f = ai;
                g = true;
                return true;
            }
        } else
        {
            g = false;
            clearColorFilter();
        }
        return false;
    }

    public final Drawable a()
    {
        return a;
    }

    public final void a(Drawable drawable)
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
        invalidateSelf();
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

    public boolean isStateful()
    {
        return c != null && c.isStateful() || a.isStateful();
    }

    public Drawable mutate()
    {
        Drawable drawable = a;
        Drawable drawable1 = drawable.mutate();
        if (drawable1 != drawable)
        {
            a(drawable1);
        }
        return this;
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

    public boolean setState(int ai[])
    {
        boolean flag = a.setState(ai);
        return a(ai) || flag;
    }

    public void setTint(int i)
    {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        c = colorstatelist;
        a(getState());
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        d = mode;
        a(getState());
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return super.setVisible(flag, flag1) || a.setVisible(flag, flag1);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }

    static 
    {
        b = android.graphics.PorterDuff.Mode.SRC_IN;
    }
}
