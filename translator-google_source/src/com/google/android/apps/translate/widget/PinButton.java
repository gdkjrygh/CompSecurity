// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.k;

public class PinButton extends ImageView
{

    private final RectF a = new RectF();
    private final Paint b = new Paint();
    private final Paint c = new Paint();
    private boolean d;
    private float e;

    public PinButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setColor(getResources().getColor(j.focused_background));
        c.setAntiAlias(true);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setColor(getResources().getColor(j.offline_pin_downloading));
        c.setStrokeWidth(getResources().getDisplayMetrics().density);
        e = 0.0F;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (d)
        {
            float f = e;
            canvas.drawArc(a, f, 90F, false, c);
            canvas.drawArc(a, f + 180F, 90F, false, c);
            e = (e + 5F) % 360F;
            postInvalidate();
        }
    }

    protected void onSizeChanged(int i, int l, int i1, int j1)
    {
        super.onSizeChanged(i, l, i1, j1);
        float f = getResources().getDimension(k.offline_pin_circle_padding);
        a.set(f, f, (float)i - f, (float)l - f);
    }

    public void setLoading(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            postInvalidate();
        }
    }

    public void setPressed(boolean flag)
    {
        if (flag != isPressed())
        {
            invalidate();
        }
        super.setPressed(flag);
    }
}
