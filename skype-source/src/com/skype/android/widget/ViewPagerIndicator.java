// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ViewPagerIndicator extends View
    implements android.support.v4.view.ViewPager.f
{

    public int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Paint f;
    private int g;
    private int h;
    private float i;

    public ViewPagerIndicator(Context context)
    {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = -1;
        f = new Paint();
        f.setAntiAlias(true);
        context = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.ViewPagerIndicator, j, 0);
        b = context.getColor(1, getResources().getColor(0x7f0f00d3));
        c = context.getColor(3, getResources().getColor(0x7f0f00f6));
        d = context.getDimensionPixelSize(2, getResources().getDimensionPixelSize(0x7f0c0271));
        i = context.getDimensionPixelSize(0, (int)((float)d * 1.1F));
        e = d + context.getDimensionPixelOffset(4, getResources().getDimensionPixelSize(0x7f0c0270));
        context.recycle();
        g = 0;
        h = 0;
    }

    private static int a(int j, int k)
    {
label0:
        {
            int i1 = android.view.View.MeasureSpec.getMode(j);
            int l = android.view.View.MeasureSpec.getSize(j);
            if (i1 != 0x40000000)
            {
                j = k;
                if (i1 != 0x80000000)
                {
                    break label0;
                }
                j = k;
                if (k <= l)
                {
                    break label0;
                }
            }
            j = l;
        }
        return j;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j = 0;
        while (j < h) 
        {
            Paint paint = f;
            float f1;
            float f2;
            float f3;
            int k;
            if (g == j)
            {
                k = b;
            } else
            {
                k = c;
            }
            paint.setColor(k);
            f2 = e * j + e / 2;
            f3 = getHeight() / 2;
            if (g == j)
            {
                f1 = i;
            } else
            {
                f1 = d;
            }
            canvas.drawCircle(f2, f3, f1 / 2.0F, f);
            j++;
        }
    }

    protected void onMeasure(int j, int k)
    {
        setMeasuredDimension(a(j, e * h), a(k, (int)i));
    }

    public void onPageScrollStateChanged(int j)
    {
    }

    public void onPageScrolled(int j, float f1, int k)
    {
    }

    public void onPageSelected(int j)
    {
        setCurrentPage(j);
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        super.onSizeChanged(j, k, l, i1);
        a = k;
    }

    public void setCurrentPage(int j)
    {
        g = j;
        invalidate();
    }

    public void setTotalPages(int j)
    {
        h = j;
        invalidate();
    }
}
