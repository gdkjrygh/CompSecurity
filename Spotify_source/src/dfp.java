// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfp extends Drawable
{

    private final Drawable a;
    private float b;
    private final Paint c = new Paint(1);
    private final Paint d = new Paint(1);
    private ColorStateList e;
    private ColorStateList f;
    private int g;
    private int h;
    private int i;

    public dfp(Drawable drawable, float f1)
    {
        g = 255;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0)
        {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        } else
        {
            a = drawable;
            b = f1;
            d.setStyle(android.graphics.Paint.Style.FILL);
            c.setStyle(android.graphics.Paint.Style.STROKE);
            c.setStrokeWidth(0.0F);
            return;
        }
    }

    private void a()
    {
        c.setAlpha((Color.alpha(h) * g) / 255);
        d.setAlpha((Color.alpha(i) * g) / 255);
    }

    private int b()
    {
        return (int)((float)Math.max(a.getIntrinsicWidth(), a.getIntrinsicHeight()) / b);
    }

    public final void a(float f1)
    {
        if (f1 < 0.0F)
        {
            throw new IllegalArgumentException("Negative strokeWidth is not supported.");
        } else
        {
            c.setStrokeWidth(f1);
            invalidateSelf();
            return;
        }
    }

    public final void a(int j)
    {
        f = ColorStateList.valueOf(j);
        d.setColor(j);
        i = j;
        a();
        invalidateSelf();
    }

    public final void a(ColorStateList colorstatelist)
    {
        e = colorstatelist;
        onStateChange(getState());
        invalidateSelf();
    }

    public final void b(int j)
    {
        e = ColorStateList.valueOf(j);
        c.setColor(j);
        h = j;
        a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int j = canvas.save();
        canvas.translate(rect.exactCenterX(), rect.exactCenterY());
        float f1 = Math.min(rect.width(), rect.height());
        float f2 = f1 / 2.0F - c.getStrokeWidth() / 2.0F;
        canvas.drawCircle(0.0F, 0.0F, f2, d);
        if (c.getStrokeWidth() > 0.0F)
        {
            canvas.drawCircle(0.0F, 0.0F, f2, c);
        }
        int k = a.getIntrinsicWidth();
        int l = a.getIntrinsicHeight();
        f2 = Math.max(k, l);
        canvas.scale(f1 / f2, f1 / f2);
        canvas.scale(b, b);
        canvas.translate((float)(-k) / 2.0F, (float)(-l) / 2.0F);
        a.draw(canvas);
        canvas.restoreToCount(j);
    }

    public final int getIntrinsicHeight()
    {
        return b();
    }

    public final int getIntrinsicWidth()
    {
        return b();
    }

    public final int getOpacity()
    {
        int j = d.getAlpha();
        if (j == 0)
        {
            j = -2;
        } else
        if (j == 255)
        {
            j = -1;
        } else
        {
            j = -3;
        }
        if (j == -1)
        {
            return -1;
        }
        if (j == -3)
        {
            return -3;
        } else
        {
            return a.getOpacity();
        }
    }

    public final boolean isStateful()
    {
        return f != null && f.isStateful() || e != null && e.isStateful() || a.isStateful();
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
    }

    protected final boolean onStateChange(int ai[])
    {
        int j;
        int k;
        if (a.isStateful())
        {
            j = a.setState(ai) | false;
        } else
        {
            j = 0;
        }
        if (f != null)
        {
            j = d.getColor();
            k = f.getColorForState(ai, j);
            d.setColor(k);
            i = k;
            int l;
            if (k != j)
            {
                j = 1;
            } else
            {
                j = 0;
            }
        }
        k = j;
        if (e != null)
        {
            k = c.getColor();
            l = e.getColorForState(ai, k);
            c.setColor(l);
            h = l;
            if (l != k)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            k = j | k;
        }
        a();
        if (k != 0)
        {
            invalidateSelf();
            return true;
        } else
        {
            return false;
        }
    }

    public final void setAlpha(int j)
    {
        g = j;
        a();
        a.setAlpha(j);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
        c.setColorFilter(colorfilter);
        a.setColorFilter(colorfilter);
        invalidateSelf();
    }
}
