// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.arist.model.skin.b;
import com.arist.model.skin.m;

// Referenced classes of package com.arist.model.scan:
//            g

public class MusicScanProgressView extends View
    implements m
{

    float a;
    boolean b;
    Paint c;
    SweepGradient d;
    Paint e;
    boolean f;
    int g;
    Handler h;

    public MusicScanProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 270F;
        b = false;
        f = false;
        g = 0xff0d96ff;
        h = new g(this);
        c = new Paint(1);
        c.setStyle(android.graphics.Paint.Style.FILL);
        e = new Paint(1);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setStrokeWidth(3F);
    }

    public final void a()
    {
        if (!b)
        {
            b = true;
            h.removeMessages(0);
            h.sendEmptyMessage(0);
        }
    }

    public final void a(int i)
    {
        g = i;
        e.setColor(i);
    }

    public final void b()
    {
        if (b)
        {
            b = false;
            h.removeMessages(0);
        }
    }

    public final void c()
    {
        if (b)
        {
            b = false;
            f = true;
        }
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f2 = getWidth();
        float f1 = getHeight();
        f2 /= 2.0F;
        float f3 = f1 / 2.0F;
        int i;
        if (f2 > f3)
        {
            f1 = f3;
        } else
        {
            f1 = f2;
        }
        i = 3;
        do
        {
            if (i < 0)
            {
                float f4 = (float)((double)f1 / Math.sqrt(2D));
                float f5 = f2 - f1;
                float f6 = f3 - f1;
                canvas.drawLine(f5, f6 + f1, f5 + f1 * 2.0F, f6 + f1, e);
                canvas.drawLine(f5 + f1, f6, f5 + f1, f6 + f5 + f1 * 2.0F, e);
                canvas.drawLine((f5 + f1) - f4, (f6 + f1) - f4, f5 + f1 + f4, f6 + f1 + f4, e);
                canvas.drawLine(f5 + f1 + f4, (f6 + f1) - f4, (f5 + f1) - f4, f6 + f1 + f4, e);
                canvas.save();
                canvas.rotate(a, f2, f3);
                canvas.drawCircle(f2, f3, f1, c);
                canvas.restore();
                return;
            }
            Paint paint = e;
            int j;
            if (i < 3)
            {
                j = 2;
            } else
            {
                j = 3;
            }
            paint.setStrokeWidth(j);
            canvas.drawCircle(f2, f3, ((float)(i + 1) * f1) / 4F - 2.0F, e);
            i--;
        } while (true);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        d = new SweepGradient((float)i / 2.0F, (float)j / 2.0F, new int[] {
            0xffffff, 0xffffff, g
        }, null);
        c.setShader(d);
    }
}
