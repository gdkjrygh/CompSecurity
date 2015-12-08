// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class TriangleView extends View
{

    private final Paint a = new Paint(6);
    private final Path b = new Path();

    public TriangleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a.setColor(0xff1ebbd1);
        a.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        a.setAntiAlias(true);
        b.setFillType(android.graphics.Path.FillType.EVEN_ODD);
    }

    public final void a(int i)
    {
        a.setColor(i);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getWidth();
        int j = getHeight();
        b.reset();
        b.moveTo(0.0F, j);
        b.lineTo(i, j);
        b.lineTo(i / 2, 0.0F);
        b.lineTo(0.0F, j);
        b.close();
        canvas.drawPath(b, a);
    }
}
