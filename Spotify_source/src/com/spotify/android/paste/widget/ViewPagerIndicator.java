// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import dfh;
import dft;
import dgn;
import java.util.List;
import jz;
import lu;

public class ViewPagerIndicator extends View
    implements lu
{

    private int a;
    private int b;
    private float c;
    private Paint d;
    private Paint e;
    private ViewPager f;
    private lu g;

    public ViewPagerIndicator(Context context)
    {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f3);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dgn.a(com/spotify/android/paste/widget/ViewPagerIndicator, this);
        int j = dft.b(10F, context.getResources());
        int k = dft.a(6F, context.getResources());
        context = context.obtainStyledAttributes(attributeset, dfh.aV, i, 0);
        a = context.getDimensionPixelSize(dfh.aY, j);
        b = context.getDimensionPixelOffset(dfh.aZ, k);
        i = context.getColor(dfh.aX, 0xff888888);
        j = context.getColor(dfh.aW, -1);
        context.recycle();
        d = new Paint();
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.FILL);
        d.setColor(i);
        e = new Paint();
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setColor(j);
    }

    public final int a()
    {
        return a;
    }

    public final void a(int i)
    {
        c = i;
        postInvalidate();
        if (g != null)
        {
            g.a(i);
        }
    }

    public final void a(int i, float f1, int j)
    {
        if (f1 <= 0.0F)
        {
            f1 = 0.0F;
        }
        c = (float)i + f1;
        postInvalidate();
        if (g != null)
        {
            g.a(i, f1, j);
        }
    }

    public final void a(ViewPager viewpager)
    {
        if (f != null)
        {
            ViewPager viewpager1 = f;
            if (viewpager1.c != null)
            {
                viewpager1.c.remove(this);
            }
        }
        f = viewpager;
        f.a(this);
        c = f.b;
        invalidate();
    }

    public final void a(lu lu1)
    {
        g = lu1;
    }

    public final void b(int i)
    {
        if (g != null)
        {
            g.b(i);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int j = 0;
        int i;
        if (f != null)
        {
            i = f.a.b();
        } else
        {
            i = 0;
        }
        if (i <= 1)
        {
            return;
        }
        int k = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        float f1 = (float)a / 2.0F;
        for (; j < i; j++)
        {
            canvas.drawCircle((float)((a + b) * j) + f1, f1, f1, d);
        }

        canvas.drawCircle(c * (float)(a + b) + f1, f1, f1, e);
        canvas.restoreToCount(k);
    }

    protected void onMeasure(int i, int j)
    {
        if (f != null)
        {
            i = f.a.b();
        } else
        {
            i = 0;
        }
        if (i <= 1)
        {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        } else
        {
            j = a;
            int k = b;
            int l = a;
            int i1 = getPaddingLeft();
            int j1 = getPaddingRight();
            int k1 = getPaddingTop();
            int l1 = getPaddingBottom();
            setVisibility(0);
            setMeasuredDimension((i - 1) * k + j * i + (i1 + j1), l + (k1 + l1));
            return;
        }
    }
}
