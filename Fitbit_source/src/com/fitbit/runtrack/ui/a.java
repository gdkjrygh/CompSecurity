// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import java.lang.reflect.Array;

public class a extends ShapeDrawable
{

    Path a;
    final float b;
    private final Paint c = new Paint();
    private ColorStateList d;
    private ColorStateList e;

    public a(float f)
    {
        b = f;
        c.setAntiAlias(true);
        c.setStyle(android.graphics.Paint.Style.STROKE);
    }

    public void a(float f)
    {
        c.setStrokeWidth(f);
    }

    public void a(int i)
    {
        a(new ColorStateList((int[][])Array.newInstance(Integer.TYPE, new int[] {
            0, 0
        }), new int[] {
            i
        }));
    }

    public void a(ColorStateList colorstatelist)
    {
        e = colorstatelist;
    }

    public void b(int i)
    {
        b(new ColorStateList((int[][])Array.newInstance(Integer.TYPE, new int[] {
            0, 0
        }), new int[] {
            i
        }));
    }

    public void b(ColorStateList colorstatelist)
    {
        d = colorstatelist;
    }

    public void draw(Canvas canvas)
    {
        if (a != null)
        {
            canvas.save();
            canvas.translate(getBounds().width() / 2, getBounds().height() / 2);
            canvas.scale(0.99F, 0.99F);
            canvas.translate(-getBounds().width() / 2, -getBounds().height() / 2);
            if (e != null)
            {
                c.setStyle(android.graphics.Paint.Style.FILL);
                c.setColor(e.getColorForState(getState(), e.getDefaultColor()));
                canvas.drawPath(a, c);
            }
            if (d != null)
            {
                c.setStyle(android.graphics.Paint.Style.STROKE);
                int i = d.getColorForState(getState(), d.getDefaultColor());
                c.setColor(i);
                canvas.drawPath(a, c);
            }
            canvas.restore();
        }
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isStateful()
    {
        return true;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a = new Path();
        int i = (int)(b * (float)rect.width());
        a.moveTo(rect.left + i, rect.top);
        a.lineTo((rect.left + rect.width()) - i, rect.top);
        RectF rectf = new RectF(rect);
        rectf.left = rect.right - i * 2;
        a.arcTo(rectf, -90F, 180F);
        a.lineTo(rect.left + i, rect.bottom);
        rectf = new RectF(rect);
        rectf.right = i * 2 + rect.left;
        a.arcTo(rectf, 90F, 180F);
        a.close();
    }

    protected boolean onStateChange(int ai[])
    {
        boolean flag1 = super.onStateChange(ai);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (d != null)
            {
                flag = d.isStateful();
            }
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (e != null)
            {
                flag1 = e.isStateful();
            }
        }
        return flag1;
    }

    public void setAlpha(int i)
    {
        c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        c.setColorFilter(colorfilter);
    }

    public boolean setState(int ai[])
    {
        boolean flag = super.setState(ai);
        if (flag)
        {
            invalidateSelf();
        }
        return flag;
    }
}
