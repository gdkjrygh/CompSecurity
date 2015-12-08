// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

public class MiniCircleImageView extends ImageView
{

    private Paint a;
    private int b;
    private int c;

    public MiniCircleImageView(Context context)
    {
        super(context);
        a();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = new Paint(1);
        a.setColor(getResources().getColor(0x106000b));
        a.setStyle(android.graphics.Paint.Style.STROKE);
        float f = TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
        a.setStrokeWidth(f);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f = b / 2;
        float f1 = c / 2;
        canvas.drawCircle(f, f1, 0.7F * Math.min(f, f1), a);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        b = i;
        c = j;
    }
}
