// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfy extends Drawable
{

    private final Drawable a;
    private final float b;
    private final int c;

    public dfy(Drawable drawable, float f, int i)
    {
        a = drawable;
        b = f;
        c = i;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0)
        {
            throw new IllegalArgumentException("drawable must have an intrinsic size");
        } else
        {
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        if (c != 0)
        {
            canvas.drawColor(c);
        }
        Rect rect = getBounds();
        float f = a.getIntrinsicWidth();
        float f1 = a.getIntrinsicHeight();
        int i = canvas.save();
        canvas.translate(rect.exactCenterX(), rect.exactCenterY());
        float f2 = Math.min(rect.width(), rect.height());
        float f3 = Math.max(f, f1);
        canvas.scale(f2 / f3, f2 / f3);
        canvas.scale(b, b);
        canvas.translate(-f / 2.0F, -f1 / 2.0F);
        a.draw(canvas);
        canvas.restoreToCount(i);
    }

    public final int getIntrinsicHeight()
    {
        return (int)((float)a.getIntrinsicHeight() / b);
    }

    public final int getIntrinsicWidth()
    {
        return (int)((float)a.getIntrinsicWidth() / b);
    }

    public final int getMinimumHeight()
    {
        return (int)((float)a.getMinimumHeight() / b);
    }

    public final int getMinimumWidth()
    {
        return (int)((float)a.getMinimumWidth() / b);
    }

    public final int getOpacity()
    {
        return a.getOpacity();
    }

    public final int[] getState()
    {
        return a.getState();
    }

    public final boolean isStateful()
    {
        return a.isStateful();
    }

    public final void jumpToCurrentState()
    {
        a.jumpToCurrentState();
    }

    protected final boolean onLevelChange(int i)
    {
        return a.setLevel(i);
    }

    protected final boolean onStateChange(int ai[])
    {
        return a.setState(ai);
    }

    public final void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public final boolean setState(int ai[])
    {
        return a.setState(ai);
    }
}
