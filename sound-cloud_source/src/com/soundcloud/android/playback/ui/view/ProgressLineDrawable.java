// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class ProgressLineDrawable extends Drawable
{

    private final int baseline;
    private final Paint paint = new Paint();
    private final int thickness;

    public ProgressLineDrawable(int i, int j, int k)
    {
        baseline = j;
        thickness = k;
        paint.setColor(i);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(getBounds().left, baseline, getBounds().right, baseline + thickness, paint);
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
        paint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        paint.setColorFilter(colorfilter);
    }
}
