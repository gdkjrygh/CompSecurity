// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.a.b;

// Referenced classes of package com.bumptech.glide.g.b:
//            j

public final class i extends b
{

    private b a;
    private j b;
    private boolean c;

    i(j j1, b b1, Resources resources)
    {
        b = j1;
        if (b1 == null)
        {
            if (resources != null)
            {
                a = (b)j.a(j1).newDrawable(resources);
                return;
            } else
            {
                a = (b)j.a(j1).newDrawable();
                return;
            }
        } else
        {
            a = b1;
            return;
        }
    }

    public i(b b1, int k)
    {
        this(new j(b1.getConstantState(), k), b1, null);
    }

    public final void a(int k)
    {
        a.a(k);
    }

    public final boolean a()
    {
        return a.a();
    }

    public final void clearColorFilter()
    {
        a.clearColorFilter();
    }

    public final void draw(Canvas canvas)
    {
        a.draw(canvas);
    }

    public final int getAlpha()
    {
        return a.getAlpha();
    }

    public final android.graphics.drawable.Drawable.Callback getCallback()
    {
        return a.getCallback();
    }

    public final int getChangingConfigurations()
    {
        return a.getChangingConfigurations();
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return b;
    }

    public final Drawable getCurrent()
    {
        return a.getCurrent();
    }

    public final int getIntrinsicHeight()
    {
        return com.bumptech.glide.g.b.j.b(b);
    }

    public final int getIntrinsicWidth()
    {
        return com.bumptech.glide.g.b.j.b(b);
    }

    public final int getMinimumHeight()
    {
        return a.getMinimumHeight();
    }

    public final int getMinimumWidth()
    {
        return a.getMinimumWidth();
    }

    public final int getOpacity()
    {
        return a.getOpacity();
    }

    public final boolean getPadding(Rect rect)
    {
        return a.getPadding(rect);
    }

    public final void invalidateSelf()
    {
        super.invalidateSelf();
        a.invalidateSelf();
    }

    public final boolean isRunning()
    {
        return a.isRunning();
    }

    public final Drawable mutate()
    {
        if (!c && super.mutate() == this)
        {
            a = (b)a.mutate();
            b = new j(b);
            c = true;
        }
        return this;
    }

    public final void scheduleSelf(Runnable runnable, long l)
    {
        super.scheduleSelf(runnable, l);
        a.scheduleSelf(runnable, l);
    }

    public final void setAlpha(int k)
    {
        a.setAlpha(k);
    }

    public final void setBounds(int k, int l, int i1, int j1)
    {
        super.setBounds(k, l, i1, j1);
        a.setBounds(k, l, i1, j1);
    }

    public final void setBounds(Rect rect)
    {
        super.setBounds(rect);
        a.setBounds(rect);
    }

    public final void setChangingConfigurations(int k)
    {
        a.setChangingConfigurations(k);
    }

    public final void setColorFilter(int k, android.graphics.PorterDuff.Mode mode)
    {
        a.setColorFilter(k, mode);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public final void setDither(boolean flag)
    {
        a.setDither(flag);
    }

    public final void setFilterBitmap(boolean flag)
    {
        a.setFilterBitmap(flag);
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        return a.setVisible(flag, flag1);
    }

    public final void start()
    {
        a.start();
    }

    public final void stop()
    {
        a.stop();
    }

    public final void unscheduleSelf(Runnable runnable)
    {
        super.unscheduleSelf(runnable);
        a.unscheduleSelf(runnable);
    }
}
