// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class TriangleView extends View
{

    private Paint a;
    private Path b;
    private boolean c;

    public TriangleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Path();
        b.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        a = new Paint();
        a.setColor(0xfff3f3f3);
        a.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.TriangleView, 0, 0);
        c = context.getBoolean(0, true);
        context.recycle();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f = getHeight();
        float f1 = getWidth();
        if (c)
        {
            b.moveTo(0.0F, f * 0.2F);
            b.lineTo(0.0F, f * 0.4F);
            b.lineTo(f * 0.15F, f * 0.3F);
        } else
        {
            b.moveTo(f1, f * 0.2F);
            b.lineTo(f1, f * 0.4F);
            b.lineTo(f1 - f * 0.15F, f * 0.3F);
        }
        b.close();
        canvas.drawPath(b, a);
        b.reset();
    }
}
