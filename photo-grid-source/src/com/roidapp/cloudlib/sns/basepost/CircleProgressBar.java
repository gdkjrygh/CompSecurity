// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CircleProgressBar extends View
{

    private int a;

    public CircleProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 16;
    }

    public CircleProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 16;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int i = getWidth();
        Paint paint = new Paint();
        Paint paint1 = new Paint();
        int j = Math.round(((float)a / 100F) * 360F);
        paint1.setColor(Color.rgb(181, 181, 181));
        paint.setColor(Color.rgb(255, 83, 83));
        canvas.drawArc(new RectF(0.0F, 0.0F, i, i), -90F, j, true, paint);
        canvas.drawArc(new RectF(0.0F, 0.0F, i, i), -90F, j - 360, true, paint1);
    }
}
