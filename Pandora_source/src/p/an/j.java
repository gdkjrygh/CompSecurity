// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.an;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p.ad.b;

public class j extends b
{
    static class a extends android.graphics.drawable.Drawable.ConstantState
    {

        private final android.graphics.drawable.Drawable.ConstantState a;
        private final int b;

        static android.graphics.drawable.Drawable.ConstantState a(a a1)
        {
            return a1.a;
        }

        static int b(a a1)
        {
            return a1.b;
        }

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return newDrawable(null);
        }

        public Drawable newDrawable(Resources resources)
        {
            return new j(this, null, resources);
        }

        a(android.graphics.drawable.Drawable.ConstantState constantstate, int i)
        {
            a = constantstate;
            b = i;
        }

        a(a a1)
        {
            this(a1.a, a1.b);
        }
    }


    private b a;
    private a b;
    private boolean c;

    public j(b b1, int i)
    {
        this(new a(b1.getConstantState(), i), b1, null);
    }

    j(a a1, b b1, Resources resources)
    {
        b = a1;
        if (b1 == null)
        {
            if (resources != null)
            {
                a = (b)a.a(a1).newDrawable(resources);
                return;
            } else
            {
                a = (b)a.a(a1).newDrawable();
                return;
            }
        } else
        {
            a = b1;
            return;
        }
    }

    public void a(int i)
    {
        a.a(i);
    }

    public boolean a()
    {
        return a.a();
    }

    public void clearColorFilter()
    {
        a.clearColorFilter();
    }

    public void draw(Canvas canvas)
    {
        a.draw(canvas);
    }

    public int getAlpha()
    {
        return a.getAlpha();
    }

    public android.graphics.drawable.Drawable.Callback getCallback()
    {
        return a.getCallback();
    }

    public int getChangingConfigurations()
    {
        return a.getChangingConfigurations();
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return b;
    }

    public Drawable getCurrent()
    {
        return a.getCurrent();
    }

    public int getIntrinsicHeight()
    {
        return p.an.a.b(b);
    }

    public int getIntrinsicWidth()
    {
        return p.an.a.b(b);
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

    public void invalidateSelf()
    {
        super.invalidateSelf();
        a.invalidateSelf();
    }

    public boolean isRunning()
    {
        return a.isRunning();
    }

    public Drawable mutate()
    {
        if (!c && super.mutate() == this)
        {
            a = (b)a.mutate();
            b = new a(b);
            c = true;
        }
        return this;
    }

    public void scheduleSelf(Runnable runnable, long l)
    {
        super.scheduleSelf(runnable, l);
        a.scheduleSelf(runnable, l);
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setBounds(int i, int k, int l, int i1)
    {
        super.setBounds(i, k, l, i1);
        a.setBounds(i, k, l, i1);
    }

    public void setBounds(Rect rect)
    {
        super.setBounds(rect);
        a.setBounds(rect);
    }

    public void setChangingConfigurations(int i)
    {
        a.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
    {
        a.setColorFilter(i, mode);
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

    public boolean setVisible(boolean flag, boolean flag1)
    {
        return a.setVisible(flag, flag1);
    }

    public void start()
    {
        a.start();
    }

    public void stop()
    {
        a.stop();
    }

    public void unscheduleSelf(Runnable runnable)
    {
        super.unscheduleSelf(runnable);
        a.unscheduleSelf(runnable);
    }
}
