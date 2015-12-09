// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.caverock.androidsvg.SVG;

public class h extends Drawable
    implements Cloneable
{

    private final a a;
    private Picture b;

    public h(SVG svg)
    {
    /* block-local class not found */
    class a {}

        a = new a(svg);
    }

    private h(a a1)
    {
        a = a1;
    }

    h(a a1, _cls1 _pcls1)
    {
        this(a1);
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        return getConstantState().newDrawable();
    }

    public void draw(Canvas canvas)
    {
        if (b == null)
        {
            b = a.a(a).b();
        }
        canvas.drawPicture(b, getBounds());
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return a;
    }

    public int getIntrinsicHeight()
    {
        return -1;
    }

    public int getIntrinsicWidth()
    {
        return -1;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
    }

    public void setBounds(Rect rect)
    {
        super.setBounds(rect);
        a.a(a).a(rect.left, rect.top, rect.right, rect.height());
        b = a.a(a).a(rect.width(), rect.height());
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
