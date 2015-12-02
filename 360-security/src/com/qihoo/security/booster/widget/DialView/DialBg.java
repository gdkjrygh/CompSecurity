// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster.widget.DialView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class DialBg extends View
{

    RectF a;
    RectF b;
    private final Paint c = new Paint();
    private final float d;
    private final int e;
    private final float f;
    private final float g;
    private float h;
    private int i;
    private float j;

    public DialBg(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setAntiAlias(true);
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.BoostDialView);
        i = context.getColor(0, 0);
        h = context.getDimension(3, 0.0F);
        g = context.getDimension(4, 0.0F);
        d = context.getDimension(5, 0.0F);
        f = context.getDimension(7, 0.0F);
        e = context.getColor(6, i);
        j = f;
        context.recycle();
    }

    protected void onDraw(Canvas canvas)
    {
        int k = getWidth() / 2;
        canvas.rotate(150F, k, k);
        int l = (int)((float)k - d - f / 2.0F);
        c.setColor(e);
        if (a == null)
        {
            a = new RectF(k - l, k - l, k + l, k + l);
        }
        c.setStrokeWidth(f);
        canvas.drawArc(a, 0.0F, 240F, false, c);
        c.setColor(i);
        l = (int)((float)l - (h / 2.0F + g));
        if (b == null)
        {
            b = new RectF(k - l, k - l, k + l, l + k);
        }
        c.setStrokeWidth(h);
        canvas.drawArc(b, 0.0F, 240F, false, c);
    }
}
