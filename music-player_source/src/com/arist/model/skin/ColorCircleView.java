// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.arist.c.g;

public class ColorCircleView extends View
{

    Paint a;
    private int b;

    public ColorCircleView(Context context)
    {
        super(context);
        b = 0xffff0000;
        a = new Paint(1);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setColor(b);
    }

    public ColorCircleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0xffff0000;
        a = new Paint(1);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setColor(b);
    }

    public final void a(int i)
    {
        b = i;
        a.setColor(i);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, a);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
        i = Math.min(g.a(getContext(), 80F), getMeasuredWidth());
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
    }
}
