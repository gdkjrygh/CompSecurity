// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class frg extends Drawable
    implements android.animation.ValueAnimator.AnimatorUpdateListener, Animatable
{

    private static final Interpolator d = new fqh(new float[] {
        0.0F, 0.5F, 0.5178955F, 0.5341797F, 0.5489991F, 0.5625F, 0.5748291F, 0.5861328F, 0.60625F, 0.6240234F, 
        0.640625F, 0.675F, 0.6951172F, 0.71875F, 0.7470703F, 0.78125F, 0.8224609F, 0.8460693F, 0.871875F, 0.9000244F, 
        0.9306641F, 0.9639404F, 1.0F
    }, new float[] {
        0.0F, 0.0F, 0.002868652F, 0.01123047F, 0.02471924F, 0.04296875F, 0.06561279F, 0.09228516F, 0.15625F, 0.2319336F, 
        0.3164062F, 0.5F, 0.5932617F, 0.6835938F, 0.7680664F, 0.84375F, 0.9077148F, 0.9343872F, 0.9570312F, 0.9752808F, 
        0.9887695F, 0.9971313F, 1.0F
    });
    private static final Interpolator e = new fqh(new float[] {
        0.0F, 0.01789551F, 0.03417969F, 0.04899903F, 0.0625F, 0.0748291F, 0.08613282F, 0.10625F, 0.1240234F, 0.140625F, 
        0.175F, 0.1951172F, 0.21875F, 0.2470703F, 0.28125F, 0.3224609F, 0.3460693F, 0.371875F, 0.4000244F, 0.4306641F, 
        0.4639404F, 0.5F, 1.0F
    }, new float[] {
        0.0F, 0.002868652F, 0.01123047F, 0.02471924F, 0.04296875F, 0.06561279F, 0.09228516F, 0.15625F, 0.2319336F, 0.3164062F, 
        0.5F, 0.5932617F, 0.6835938F, 0.7680664F, 0.84375F, 0.9077148F, 0.9343872F, 0.9570312F, 0.9752808F, 0.9887695F, 
        0.9971313F, 1.0F, 1.0F
    });
    public final Paint a = new Paint();
    public float b;
    public float c;
    private final ValueAnimator f = new ValueAnimator();
    private final ValueAnimator g = new ValueAnimator();
    private final ValueAnimator h = new ValueAnimator();
    private final ValueAnimator i = new ValueAnimator();
    private final RectF j = new RectF();
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;

    public frg()
    {
        k = false;
        b = 18F;
        c = 1.0F;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        o = 0.0F;
        a.setColor(0xff40c4ff);
        a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        a.setStrokeJoin(android.graphics.Paint.Join.MITER);
        a.setStrokeWidth(b);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setAntiAlias(true);
        a.setDither(true);
        f.setDuration(6665L);
        f.setInterpolator(new LinearInterpolator());
        f.setRepeatCount(-1);
        f.setFloatValues(new float[] {
            0.0F, 720F
        });
        f.addUpdateListener(this);
        g.setDuration(1333L);
        g.setInterpolator(d);
        g.setRepeatCount(-1);
        g.setFloatValues(new float[] {
            0.0F, 270F
        });
        g.addUpdateListener(this);
        h.setDuration(1333L);
        h.setInterpolator(e);
        h.setRepeatCount(-1);
        h.setFloatValues(new float[] {
            0.0F, 270F
        });
        h.addUpdateListener(this);
        i.setDuration(1333L);
        i.setInterpolator(new LinearInterpolator());
        i.setRepeatCount(-1);
        i.setFloatValues(new float[] {
            0.0F, 90F
        });
        i.addUpdateListener(this);
    }

    private void b()
    {
        if (f.isRunning())
        {
            return;
        } else
        {
            f.start();
            g.start();
            h.start();
            i.start();
            return;
        }
    }

    private void c()
    {
        if (!f.isRunning())
        {
            return;
        } else
        {
            f.cancel();
            g.cancel();
            h.cancel();
            i.cancel();
            return;
        }
    }

    public void a()
    {
        j.set(getBounds());
        float f1 = b / 2.0F;
        RectF rectf = j;
        rectf.bottom = rectf.bottom - f1;
        rectf = j;
        rectf.top = rectf.top + f1;
        rectf = j;
        rectf.right = rectf.right - f1;
        rectf = j;
        rectf.left = f1 + rectf.left;
    }

    public final void draw(Canvas canvas)
    {
        if (c <= 0.0F)
        {
            return;
        }
        canvas.save();
        canvas.rotate(o, j.centerX(), j.centerY());
        if (c < 1.0F)
        {
            canvas.scale(c, c, j.centerX(), j.centerY());
        }
        Path path = new Path();
        float f1 = l + n;
        float f2 = m;
        float f3 = n;
        f.isRunning();
        path.addArc(j, f1, (f2 + f3) - f1);
        canvas.drawPath(path, a);
        canvas.restore();
    }

    public final int getAlpha()
    {
        return a.getAlpha();
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isRunning()
    {
        return p;
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (valueanimator != f) goto _L2; else goto _L1
_L1:
        o = ((Float)valueanimator.getAnimatedValue()).floatValue();
_L4:
        invalidateSelf();
        return;
_L2:
        if (valueanimator == g)
        {
            l = ((Float)valueanimator.getAnimatedValue()).floatValue();
        } else
        if (valueanimator == h)
        {
            m = ((Float)valueanimator.getAnimatedValue()).floatValue();
        } else
        if (valueanimator == i)
        {
            n = ((Float)valueanimator.getAnimatedValue()).floatValue();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a();
    }

    public final void setAlpha(int i1)
    {
        a.setAlpha(i1);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (p)
        {
            if (flag)
            {
                if (flag2 || flag1)
                {
                    b();
                    return flag2;
                }
            } else
            {
                c();
                return flag2;
            }
        }
        return flag2;
    }

    public final void start()
    {
        if (p && f.isRunning())
        {
            return;
        } else
        {
            p = true;
            b();
            invalidateSelf();
            return;
        }
    }

    public final void stop()
    {
        p = false;
        c();
        invalidateSelf();
    }

}
