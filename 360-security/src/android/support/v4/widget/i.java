// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.s;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            a

final class i
{

    private static final Interpolator a = android.support.v4.widget.a.a();
    private final Paint b = new Paint();
    private final RectF c = new RectF();
    private float d;
    private long e;
    private long f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private View l;
    private Rect m;

    public i(View view)
    {
        m = new Rect();
        l = view;
        h = 0xb3000000;
        i = 0x80000000;
        j = 0x4d000000;
        k = 0x1a000000;
    }

    private void a(Canvas canvas, float f1, float f2, int i1, float f3)
    {
        b.setColor(i1);
        canvas.save();
        canvas.translate(f1, f2);
        f2 = a.getInterpolation(f3);
        canvas.scale(f2, f2);
        canvas.drawCircle(0.0F, 0.0F, f1, b);
        canvas.restore();
    }

    private void a(Canvas canvas, int i1, int j1)
    {
        b.setColor(h);
        canvas.drawCircle(i1, j1, (float)i1 * d, b);
    }

    void a()
    {
        if (!g)
        {
            d = 0.0F;
            e = AnimationUtils.currentAnimationTimeMillis();
            g = true;
            l.postInvalidate();
        }
    }

    void a(float f1)
    {
        d = f1;
        e = 0L;
        s.b(l);
    }

    void a(int i1, int j1, int k1, int l1)
    {
        m.left = i1;
        m.top = j1;
        m.right = k1;
        m.bottom = l1;
    }

    void a(Canvas canvas)
    {
label0:
        {
            {
                int j1 = m.width();
                int i2 = m.height();
                int k1 = j1 / 2;
                int l1 = i2 / 2;
                int i1 = canvas.save();
                canvas.clipRect(m);
                if (!g && f <= 0L)
                {
                    break label0;
                }
                long l2 = AnimationUtils.currentAnimationTimeMillis();
                long l3 = e;
                long l4 = (l2 - e) / 2000L;
                float f1 = (float)((l2 - l3) % 2000L) / 20F;
                if (!g)
                {
                    if (l2 - f >= 1000L)
                    {
                        f = 0L;
                        return;
                    }
                    float f2 = (float)((l2 - f) % 1000L) / 10F / 100F;
                    float f7 = j1 / 2;
                    f2 = a.getInterpolation(f2) * f7;
                    c.set((float)k1 - f2, 0.0F, f2 + (float)k1, i2);
                    canvas.saveLayerAlpha(c, 0, 0);
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (l4 == 0L)
                {
                    canvas.drawColor(h);
                } else
                if (f1 >= 0.0F && f1 < 25F)
                {
                    canvas.drawColor(k);
                } else
                if (f1 >= 25F && f1 < 50F)
                {
                    canvas.drawColor(h);
                } else
                if (f1 >= 50F && f1 < 75F)
                {
                    canvas.drawColor(i);
                } else
                {
                    canvas.drawColor(j);
                }
                if (f1 >= 0.0F && f1 <= 25F)
                {
                    float f3 = ((25F + f1) * 2.0F) / 100F;
                    a(canvas, k1, l1, h, f3);
                }
                if (f1 >= 0.0F && f1 <= 50F)
                {
                    float f4 = (2.0F * f1) / 100F;
                    a(canvas, k1, l1, i, f4);
                }
                if (f1 >= 25F && f1 <= 75F)
                {
                    float f5 = ((f1 - 25F) * 2.0F) / 100F;
                    a(canvas, k1, l1, j, f5);
                }
                if (f1 >= 50F && f1 <= 100F)
                {
                    float f6 = ((f1 - 50F) * 2.0F) / 100F;
                    a(canvas, k1, l1, k, f6);
                }
                if (f1 >= 75F && f1 <= 100F)
                {
                    f1 = ((f1 - 75F) * 2.0F) / 100F;
                    a(canvas, k1, l1, h, f1);
                }
                if (d > 0.0F && j1 != 0)
                {
                    canvas.restoreToCount(i1);
                    i1 = canvas.save();
                    canvas.clipRect(m);
                    a(canvas, k1, l1);
                }
                s.b(l);
                j1 = i1;
            }
            canvas.restoreToCount(j1);
            return;
        }
        j1 = i1;
        if (d > 0.0F)
        {
            j1 = i1;
            if ((double)d <= 1.0D)
            {
                a(canvas, k1, l1);
                j1 = i1;
            }
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_465;
        }
    }

    void b()
    {
        if (g)
        {
            d = 0.0F;
            f = AnimationUtils.currentAnimationTimeMillis();
            g = false;
            l.postInvalidate();
        }
    }

}
