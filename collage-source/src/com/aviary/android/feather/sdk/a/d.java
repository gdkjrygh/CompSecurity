// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public class d extends Drawable
{

    private float a;
    private int b;
    private int c;
    private int d;
    private float e;
    private android.graphics.Paint.FontMetrics f;
    private String g;
    private Paint h;
    private Paint i;
    private Rect j;
    private int k;
    private int l;
    private int m;
    private int n;

    public d(Context context, int i1, String s)
    {
        a = 10F;
        m = 0;
        Typeface typeface = Typeface.DEFAULT;
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(null, com.aviary.android.feather.sdk.R.styleable.AviaryPluginDividerDrawable, com.aviary.android.feather.sdk.R.attr.aviaryEffectThumbDividerTextStyle, -1);
        d = typedarray.getColor(0, 0);
        b = typedarray.getDimensionPixelSize(4, 0);
        c = typedarray.getColor(3, 0);
        e = typedarray.getFloat(1, 0.9F);
        String s1 = typedarray.getString(2);
        try
        {
            context = com.aviary.android.feather.sdk.utils.d.a(context.getAssets(), s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = typeface;
        }
        typedarray.recycle();
        g = s;
        h = new Paint(385);
        h.setColor(d);
        h.setStyle(android.graphics.Paint.Style.FILL);
        if (context != null)
        {
            h.setTypeface(context);
        }
        i = new Paint(h);
        i.setColor(c);
        i.setStyle(android.graphics.Paint.Style.STROKE);
        i.setStrokeWidth(b);
        j = new Rect();
        f = new android.graphics.Paint.FontMetrics();
    }

    protected final void a()
    {
        a = (float)k * e;
        h.setTextSize(a);
        i.setTextSize(a);
        h.getTextBounds(g, 0, g.length(), j);
        h.getFontMetrics(f);
        m = (int)(((float)k / 2.0F + a / 2.0F) - f.bottom / 2.0F);
        n = (int)((double)l * 0.90000000000000002D);
    }

    public void a(String s)
    {
        g = s;
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    public void clearColorFilter()
    {
    }

    public void draw(Canvas canvas)
    {
        int i1 = canvas.save(1);
        canvas.rotate(-90F);
        canvas.translate(-l + (l - j.width()) / 2, m);
        if (j.width() > n)
        {
            float f1 = (float)n / (float)j.width();
            canvas.scale(f1, f1, j.centerX(), j.centerY());
        }
        if (b > 0)
        {
            canvas.drawText(g, 0.0F, 0.0F, i);
        }
        canvas.drawText(g, 0.0F, 0.0F, h);
        canvas.restoreToCount(i1);
    }

    public int getIntrinsicHeight()
    {
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth()
    {
        return super.getIntrinsicWidth();
    }

    public int getMinimumHeight()
    {
        return super.getMinimumHeight();
    }

    public int getMinimumWidth()
    {
        return super.getMinimumWidth();
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        k = rect.width();
        l = rect.height();
        a();
    }

    public void setAlpha(int i1)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
