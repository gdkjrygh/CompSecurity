// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class DropdownDividerDrawable extends Drawable
{

    private Rect mDividerRect;
    private Paint mPaint;

    public DropdownDividerDrawable()
    {
        mPaint = new Paint();
        mDividerRect = new Rect();
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(mDividerRect, mPaint);
    }

    public int getOpacity()
    {
        return -1;
    }

    public void onBoundsChange(Rect rect)
    {
        mDividerRect.set(0, 0, rect.width(), mDividerRect.height());
    }

    public void setAlpha(int i)
    {
    }

    public void setColor(int i)
    {
        mPaint.setColor(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public void setHeight(int i)
    {
        mDividerRect.set(0, 0, mDividerRect.right, i);
    }
}
