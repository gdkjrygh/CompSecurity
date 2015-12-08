// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;

public class ConnectingRippleView extends View
{

    private final Paint a = new Paint();
    private final float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private long g;

    public ConnectingRippleView(Context context)
    {
        super(context);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        float f1 = Jo.a(1.0F, context);
        a.setStrokeWidth(f1);
        a.setColor(0xb2b2b2);
        a.setAntiAlias(true);
        b = Jo.a(3F, context);
    }

    protected void onDraw(Canvas canvas)
    {
        long l1 = SystemClock.elapsedRealtime() - g;
        long l = l1;
        if (l1 > 1800L)
        {
            if (!f)
            {
                return;
            }
            l = 0L;
            g = SystemClock.elapsedRealtime();
        }
        float f1 = (float)l / 1800F;
        float f2 = 2.0F * e * f1;
        a.setAlpha((int)((1.0F - f1) * 255F));
        canvas.drawCircle(c, d, f2, a);
        canvas.drawCircle(c, d, f2 + b, a);
        invalidate();
    }

    public void setRippleCenter(float f1, float f2)
    {
        c = f1;
        d = f2;
    }

    public void setRippleScale(float f1)
    {
        e = f1;
    }

    public void setRipplesEnabled(boolean flag)
    {
        if (flag && !f)
        {
            g = SystemClock.elapsedRealtime();
            invalidate();
        }
        f = flag;
    }
}
