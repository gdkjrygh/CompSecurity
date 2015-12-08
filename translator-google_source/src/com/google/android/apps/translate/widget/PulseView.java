// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.k;

public class PulseView extends View
{

    private final Paint a;
    private final Paint b = new Paint();
    private final Paint c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private float j;
    private float k;
    private float l;
    private long m;
    private boolean n;

    public PulseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0L;
        n = true;
        context = getResources();
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setColor(context.getColor(j.voice_pulse_color_1));
        c = new Paint(b);
        c.setColor(context.getColor(j.voice_pulse_color_2));
        a = new Paint(b);
        a.setColor(context.getColor(j.voice_pulse_color_border));
        d = context.getDimension(k.pulse_border);
        float f1 = context.getDimension(k.pulse_width);
        float f2 = context.getDimension(k.pulse_height);
        g = context.getDimension(k.pulse_min_radius);
        i = g + 2.0F;
        e = f1 / 2.0F;
        f = f2 - g;
        h = e - g;
    }

    public final void a(float f1)
    {
        float f2;
        f2 = 0.0F;
        if (f1 > 0.0F)
        {
            f2 = f1 / 10F;
        }
        if (l <= k) goto _L2; else goto _L1
_L1:
        if (f2 <= l) goto _L4; else goto _L3
_L3:
        boolean flag;
        l = f2;
        flag = true;
_L6:
        if (flag && n)
        {
            n = false;
            m = System.currentTimeMillis();
            postInvalidate();
        }
        return;
_L2:
        if (f2 > k)
        {
            l = f2;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void draw(Canvas canvas)
    {
        long l1 = System.currentTimeMillis();
        long l2 = l1 - m;
        m = l1;
        float f1 = j;
        j = j - 0.001F * (float)l2;
        float f2;
        boolean flag;
        if (l > k)
        {
            k = k + (float)l2 * 0.00375F;
            if (k >= l)
            {
                k = l;
                l = 0.0F;
            }
            if (j < k)
            {
                j = k;
            }
        } else
        {
            k = k - (float)l2 * 0.0025F;
            if (k <= 0.0F)
            {
                k = 0.0F;
            }
        }
        if (j <= 0.0F)
        {
            j = 0.0F;
        }
        if (j == 0.0F && f1 == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        f1 = g + j * h;
        f2 = g + k * h;
        if (f1 > i)
        {
            canvas.drawCircle(e, f, f1, a);
            canvas.drawCircle(e, f, f1 - d, b);
        }
        if (f2 > i)
        {
            canvas.drawCircle(e, f, f2, c);
        }
        if (!n)
        {
            postInvalidate();
        }
    }
}
