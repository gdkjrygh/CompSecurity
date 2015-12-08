// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public abstract class CircleDrawable extends Drawable
{

    private final Paint a = new Paint();

    public CircleDrawable()
    {
        a.setAntiAlias(true);
        a.setStrokeWidth(3F);
        a.setColor(-1);
        a.setStyle(android.graphics.Paint.Style.STROKE);
    }

    protected final Paint a()
    {
        return a;
    }

    protected final int b()
    {
        return getBounds().width() / 2;
    }

    protected final int c()
    {
        return getBounds().height() / 2;
    }

    protected final int d()
    {
        return Math.min(b(), c());
    }

    public void draw(Canvas canvas)
    {
        canvas.drawCircle(b(), c(), d(), a);
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
