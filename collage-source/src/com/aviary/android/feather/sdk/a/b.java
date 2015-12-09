// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class b extends Drawable
{

    int a;
    int b;
    int c;
    int d;
    float e;
    int f;
    int g;
    int h;
    int i;
    int j;
    Matrix k;
    final Rect l;
    final Paint m;

    public b(Context context)
    {
        this(context, com.aviary.android.feather.sdk.R.attr.aviaryOptionPanelTopIndicatorStyle, 0);
    }

    public b(Context context, int i1, int j1)
    {
        k = new Matrix();
        l = new Rect();
        context = context.getTheme().obtainStyledAttributes(null, com.aviary.android.feather.sdk.R.styleable.AviaryGalleryTopIndicator, i1, j1);
        Log.d("gallery-top-indicator", (new StringBuilder()).append("defaultStyle: ").append(i1).toString());
        a = context.getColor(1, 0);
        g = (int)context.getFloat(2, 0.0F);
        b = context.getColor(6, -1);
        c = context.getColor(7, -1);
        d = context.getColor(9, -1);
        e = context.getFloat(4, 1.0F);
        f = context.getDimensionPixelSize(8, 2);
        h = context.getInteger(3, 1);
        i = context.getDimensionPixelSize(5, 0);
        j = context.getDimensionPixelSize(0, 0);
        Log.i("gallery-top-indicator", (new StringBuilder()).append("strokeWidth: ").append(f).toString());
        Log.i("gallery-top-indicator", (new StringBuilder()).append("direction: ").append(h).toString());
        Log.i("gallery-top-indicator", (new StringBuilder()).append("offset: ").append(i).toString());
        context.recycle();
        m = new Paint(1);
    }

    public void draw(Canvas canvas)
    {
        copyBounds(l);
        int i2 = l.height() / 2;
        int i1 = l.width() / 2;
        int j1 = (int)((float)i2 * e);
        int j2 = l.top + f / 2;
        int k1 = l.left - f;
        int l1 = l.right + f;
        Path path = new Path();
        path.moveTo(k1, j2);
        path.lineTo(l1, j2);
        path.lineTo(l1, j2 + i2);
        path.lineTo(k1 + i1 + j1, j2 + i2);
        path.lineTo(k1 + i1, j2 + i2 + j1);
        path.lineTo((k1 + i1) - j1, j2 + i2);
        path.lineTo(k1, j2 + i2);
        path.lineTo(k1, j2);
        if (h == 2)
        {
            k.reset();
            k.setScale(1.0F, -1F, 0.0F, l.height() / 2);
            k.postTranslate(0.0F, i);
            canvas.save(1);
            canvas.concat(k);
        }
        m.setStyle(android.graphics.Paint.Style.FILL);
        if (g > 0)
        {
            path.offset(0.0F, g);
            m.setColor(a);
            canvas.drawPath(path, m);
            path.offset(0.0F, -g);
        }
        m.setColor(b);
        canvas.drawPath(path, m);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setColor(c);
        m.setStrokeWidth(f);
        canvas.drawPath(path, m);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setColor(d);
        if (h == 1)
        {
            canvas.drawLine(f + k1, f + j2, l1 - f, f + j2, m);
            return;
        } else
        {
            i2 = (i2 + j2) - f;
            canvas.drawLine(k1, i2, (k1 + i1) - j1, i2, m);
            canvas.drawLine(k1 + i1 + j1, i2, l1, i2, m);
            canvas.restore();
            return;
        }
    }

    public int getIntrinsicHeight()
    {
        return j;
    }

    public int getMinimumHeight()
    {
        return j;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i1)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
