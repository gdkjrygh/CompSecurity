// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.apps.moviemaker.ui.ProgressSpinner;

public final class dah extends Drawable
{

    private final RectF a = new RectF();
    private final TimeInterpolator b;
    private final Paint c = new Paint();
    private final Paint d = new Paint();
    private ProgressSpinner e;

    public dah(ProgressSpinner progressspinner)
    {
        e = progressspinner;
        super();
        b = dac.a;
        c.setAntiAlias(true);
        c.setColor(progressspinner.getResources().getColor(b.cs));
        c.setStyle(android.graphics.Paint.Style.FILL);
        d.setAntiAlias(true);
        d.setColor(progressspinner.getResources().getColor(b.ct));
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public final void draw(Canvas canvas)
    {
        float f2;
        float f4;
        int i;
        f4 = 1.0F;
        float f = getBounds().width() / 2;
        f2 = b.getInterpolation(ddl.c(0.0F, 0.6F, ProgressSpinner.a(e)));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), f2 * f, c);
        float f3;
        if (ProgressSpinner.a(e) < 1.0F)
        {
            f2 = b.getInterpolation(ddl.c(0.2F, 0.8F, ProgressSpinner.a(e)));
            f3 = b.getInterpolation(ddl.c(0.4F, 1.0F, ProgressSpinner.a(e)));
            f2 = f2 * 0.7F * f;
            f3 = 0.5F * f3 * f;
            f = (f2 - f3) / 2.0F + (f - f2);
            f3 = f2 - f3;
        } else
        {
            f = getBounds().width() / 5;
            f3 = getBounds().width() / 10;
        }
        a.set(getBounds());
        a.inset(f, f);
        d.setStrokeWidth(f3);
        i = ((getLevel() + 10000) - ProgressSpinner.b(e)) % 10000;
        if (ProgressSpinner.a(e) >= 1.0F) goto _L2; else goto _L1
_L1:
        f2 = 360F;
_L4:
        if ((double)f3 > 0.10000000000000001D)
        {
            canvas.drawArc(a, -90F + (float)(i * 360) * 1E-04F, ddl.a(f2, -359.9999F, 359.9999F), false, d);
        }
        return;
_L2:
        float f1;
        if (i <= 2500)
        {
            f1 = 360F;
            f2 = 1.0F;
        } else
        if (i <= 5000)
        {
            f2 = 2500F;
            f1 = 0.0F;
        } else
        if (i <= 7500)
        {
            f2 = 5000F;
            f1 = 360F;
        } else
        {
            f2 = 7500F;
            f1 = 0.0F;
        }
        f1 = 360F * b.getInterpolation(((float)i - f2) / 2500F) - f1;
        if (f1 < 0.0F || f1 >= 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        f1 = f4;
_L6:
        f2 = f1;
        if (Math.abs(f1) > 359F)
        {
            f2 = 359.9999F;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f1 >= 0.0F || f1 <= -1F) goto _L6; else goto _L5
_L5:
        f1 = -1F;
          goto _L6
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
