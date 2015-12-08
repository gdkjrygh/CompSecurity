// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;

public final class isv extends View
    implements oiz
{

    Paint a;
    Path b;
    boolean c;
    int d;
    int e;
    int f;
    private float g;
    private float h[];

    public isv(Context context)
    {
        this(context, null);
    }

    private isv(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isv(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0);
        b = new Path();
        setLayerType(1, null);
    }

    public final void a(msx amsx[])
    {
        b.reset();
        if (amsx.length == 0)
        {
            return;
        }
        b.moveTo(amsx[0].a, amsx[0].b);
        int j = amsx.length;
        for (int i = 0; i < j; i++)
        {
            msx msx1 = amsx[i];
            b.cubicTo(msx1.c, msx1.d, msx1.e, msx1.f, msx1.g, msx1.h);
        }

        b();
    }

    public final void ax_()
    {
        a = null;
        b.reset();
        d = 0;
        e = 0;
        c = false;
    }

    void b()
    {
        g = (new PathMeasure(b, false)).getLength();
        if (c)
        {
            h = new float[(int)Math.ceil(g / (float)f) << 1];
        }
        if (c)
        {
            a.setPathEffect(new DashPathEffect(new float[] {
                (float)d, (float)e
            }, 0.0F));
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        if (b.isEmpty() || a == null)
        {
            return;
        } else
        {
            canvas.save();
            canvas.translate(getPaddingTop(), getPaddingLeft());
            canvas.drawPath(b, a);
            canvas.restore();
            return;
        }
    }

    public final void setLinePercentDrawn(float f1)
    {
        int j = 0;
        if (a == null)
        {
            return;
        }
        float f4 = f1 * g;
        if (c && h.length > 0)
        {
            float f2 = 0.0F;
            do
            {
                f1 = f4 - f2;
                int i;
                if (f1 > (float)f)
                {
                    float af[] = h;
                    int k = j + 1;
                    af[j] = d;
                    af = h;
                    i = k + 1;
                    af[k] = e;
                    f1 = f2 + (float)f;
                } else
                if (f1 > (float)d)
                {
                    float af1[] = h;
                    int l = j + 1;
                    af1[j] = d;
                    f1 = d;
                    af1 = h;
                    i = l + 1;
                    af1[l] = g - (f2 + f1);
                    f1 = g;
                } else
                {
                    float af2[] = h;
                    int i1 = j + 1;
                    af2[j] = f1;
                    af2 = h;
                    i = i1 + 1;
                    af2[i1] = g - (f2 + f1);
                    f1 = g;
                }
                j = i;
                f2 = f1;
            } while (f1 < f4);
            for (; i < h.length; i++)
            {
                h[i] = 0.0F;
            }

            a.setPathEffect(new DashPathEffect(h, 0.0F));
        } else
        {
            Paint paint = a;
            f1 = g;
            float f3 = g;
            float f5 = g;
            paint.setPathEffect(new DashPathEffect(new float[] {
                f1, f3
            }, f5 - f4));
        }
        postInvalidate();
    }
}
