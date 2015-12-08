// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import b;
import gin;

public final class PageDotsView extends View
{

    public int a;
    public int b;
    private final int c;
    private final int d;
    private final int e;
    private final Paint f;
    private final Paint g;

    public PageDotsView(Context context)
    {
        this(context, null);
    }

    public PageDotsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PageDotsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.getTheme().obtainStyledAttributes(attributeset, gin.c, 0, 0);
        a = Math.max(0, context.getInt(gin.f, 1));
        c = Math.max(0, context.getDimensionPixelSize(gin.e, getResources().getDimensionPixelSize(b.rB)));
        d = context.getColor(gin.d, 0xff000000);
        e = context.getColor(gin.g, -1);
        context.recycle();
        f = new Paint(1);
        f.setStyle(android.graphics.Paint.Style.FILL);
        f.setColor(d);
        g = new Paint(1);
        g.setStyle(android.graphics.Paint.Style.FILL);
        g.setColor(e);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f1 = getPaddingLeft();
        float f2 = getPaddingTop();
        int i = 0;
        while (i < a) 
        {
            float f3 = i;
            float f4 = c;
            float f5 = c;
            float f6 = c / 2;
            Paint paint;
            if (i == b)
            {
                paint = g;
            } else
            {
                paint = f;
            }
            canvas.drawCircle(f1 + (2.0F * f3 + 0.5F) * f4, f2 + f5 * 0.5F, f6, paint);
            i++;
        }
    }

    protected final void onMeasure(int i, int j)
    {
        i = getPaddingLeft();
        j = getPaddingRight();
        int k = getPaddingTop();
        int l = getPaddingBottom();
        setMeasuredDimension(i + j + (c * a + Math.max(0, a - 1) * c), k + l + c);
    }
}
