// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            i

class j extends Drawable
    implements android.graphics.drawable.Drawable.Callback, i
{

    static final android.graphics.PorterDuff.Mode a;
    Drawable b;
    private ColorStateList c;
    private android.graphics.PorterDuff.Mode d;
    private int e;
    private android.graphics.PorterDuff.Mode f;
    private boolean g;

    j(Drawable drawable)
    {
        d = a;
        a(drawable);
    }

    private boolean a(int ai[])
    {
        if (c != null && d != null)
        {
            int k = c.getColorForState(ai, c.getDefaultColor());
            ai = d;
            if (!g || k != e || ai != f)
            {
                setColorFilter(k, ai);
                e = k;
                f = ai;
                g = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable a()
    {
        return b;
    }

    public final void a(Drawable drawable)
    {
        if (b != null)
        {
            b.setCallback(null);
        }
        b = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas)
    {
        b.draw(canvas);
    }

    public int getChangingConfigurations()
    {
        return b.getChangingConfigurations();
    }

    public Drawable getCurrent()
    {
        return b.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return b.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return b.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return b.getMinimumWidth();
    }

    public int getOpacity()
    {
        return b.getOpacity();
    }

    public boolean getPadding(Rect rect)
    {
        return b.getPadding(rect);
    }

    public int[] getState()
    {
        return b.getState();
    }

    public Region getTransparentRegion()
    {
        return b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public boolean isStateful()
    {
        return c != null && c.isStateful() || b.isStateful();
    }

    public Drawable mutate()
    {
        Drawable drawable = b;
        Drawable drawable1 = drawable.mutate();
        if (drawable1 != drawable)
        {
            a(drawable1);
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        b.setBounds(rect);
    }

    protected boolean onLevelChange(int k)
    {
        return b.setLevel(k);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public void setAlpha(int k)
    {
        b.setAlpha(k);
    }

    public void setChangingConfigurations(int k)
    {
        b.setChangingConfigurations(k);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        b.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        b.setDither(flag);
    }

    public void setFilterBitmap(boolean flag)
    {
        b.setFilterBitmap(flag);
    }

    public boolean setState(int ai[])
    {
        boolean flag = b.setState(ai);
        return a(ai) || flag;
    }

    public void setTint(int k)
    {
        setTintList(ColorStateList.valueOf(k));
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
        return super.setVisible(flag, flag1) || b.setVisible(flag, flag1);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }

    static 
    {
        a = android.graphics.PorterDuff.Mode.SRC_IN;
    }
}
