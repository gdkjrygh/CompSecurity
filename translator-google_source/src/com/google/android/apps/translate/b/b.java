// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.b;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class b extends Drawable
{

    private final RectF a = new RectF();
    private final Paint b = new Paint();

    public b(Resources resources, int i)
    {
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setColor(resources.getColor(i));
    }

    public final void draw(Canvas canvas)
    {
        if (getLevel() >= 360)
        {
            canvas.drawOval(a, b);
        } else
        if (getLevel() > 0)
        {
            canvas.drawArc(a, -90F, getLevel(), true, b);
            return;
        }
    }

    public final int getOpacity()
    {
        return -3;
    }

    protected final boolean onLevelChange(int i)
    {
        return true;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setBounds(int i, int j, int k, int l)
    {
        a.set(i, j, k, l);
        super.setBounds(i, j, k, l);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
