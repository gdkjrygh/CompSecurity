// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class ovl extends Drawable
{

    private static final ovm c = new ovm();
    public ovg a;
    public long b;
    private final Paint d = new Paint();
    private final ObjectAnimator e;
    private float f;
    private float g;

    public ovl()
    {
        f = 1.0F;
        g = f;
        d.setFilterBitmap(true);
        d.setAntiAlias(true);
        d.setDither(true);
        e = ObjectAnimator.ofFloat(this, c, new float[] {
            f
        });
    }

    private static float a(float f1, float f2, float f3, float f4, float f5)
    {
        boolean flag1 = true;
        boolean flag;
        if (0.0F < f3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (f4 < 1.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (f1 <= 0.0F)
        {
            return f4;
        }
        if (f1 >= f3)
        {
            return 1.0F;
        } else
        {
            return f4 + (f1 / f3) * (1.0F - f4);
        }
    }

    static float a(ovl ovl1)
    {
        return ovl1.g;
    }

    static float a(ovl ovl1, float f1)
    {
        ovl1.g = f1;
        return f1;
    }

    private Bitmap a()
    {
        if (a != null)
        {
            return a.c();
        } else
        {
            return null;
        }
    }

    public final void a(ovg ovg1)
    {
        if (ovg1 != a)
        {
            if (a != null)
            {
                a.e();
            }
            if (ovg1 != null)
            {
                ovg1 = ovg1.d();
            } else
            {
                ovg1 = null;
            }
            a = ovg1;
            invalidateSelf();
        }
    }

    public final void a(boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        e.cancel();
        if (g != f1)
        {
            g = f1;
            invalidateSelf();
        }
        f = f1;
    }

    public final void a(boolean flag, int i)
    {
        if (f == 1.0F)
        {
            return;
        } else
        {
            e.cancel();
            e.setFloatValues(new float[] {
                1.0F
            });
            e.setStartDelay(i);
            e.setDuration(150L);
            e.start();
            f = 1.0F;
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        if (rect.isEmpty())
        {
            return;
        }
        int i = d.getAlpha();
        float f1 = a(g, 0.0F, 0.7F, 0.0F, 1.0F);
        float f2 = a(g, 0.0F, 1.0F, 0.5F, 1.0F);
        d.setAlpha((int)(f1 * (float)i));
        canvas.save();
        canvas.scale(f2, f2, rect.exactCenterX(), rect.exactCenterY());
        Bitmap bitmap = a();
        if (bitmap != null)
        {
            canvas.drawBitmap(bitmap, null, rect, d);
        } else
        {
            canvas.drawRect(rect, d);
        }
        canvas.restore();
        d.setAlpha(i);
    }

    public final int getAlpha()
    {
        return d.getAlpha();
    }

    public final int getOpacity()
    {
        Bitmap bitmap = a();
        return d.getAlpha() >= 255 && g >= 1.0F && (bitmap == null || !bitmap.hasAlpha()) ? -1 : -3;
    }

    public final void setAlpha(int i)
    {
        if (i != d.getAlpha())
        {
            d.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
        invalidateSelf();
    }

}
