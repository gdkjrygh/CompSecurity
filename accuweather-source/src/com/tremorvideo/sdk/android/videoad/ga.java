// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class ga extends Drawable
{

    Bitmap a;
    Bitmap b;
    Bitmap c;

    public ga(Bitmap bitmap, Bitmap bitmap1)
    {
        a = bitmap;
        b = bitmap1;
        c = bitmap;
    }

    public void draw(Canvas canvas)
    {
        Rect rect = copyBounds();
        Rect rect1 = new Rect(rect.left, rect.top, rect.left + a.getWidth(), rect.bottom);
        canvas.drawBitmap(a, null, rect1, null);
        rect1 = new Rect();
        rect1.left = rect.left + a.getWidth();
        rect1.right = rect.right - c.getWidth() - 1;
        rect1.top = rect.top;
        rect1.bottom = rect.bottom;
        canvas.drawBitmap(b, null, rect1, null);
        if (c == a)
        {
            Matrix matrix = new Matrix();
            matrix.postTranslate(-c.getWidth(), 0.0F);
            matrix.postScale(-1F, (float)rect.height() / (float)c.getHeight());
            matrix.postTranslate(rect1.right, rect.top);
            canvas.drawBitmap(c, matrix, null);
            return;
        } else
        {
            rect = new Rect(rect1.right, rect.top, rect1.right + c.getWidth(), rect.bottom);
            canvas.drawBitmap(c, null, rect, null);
            return;
        }
    }

    public int getIntrinsicHeight()
    {
        return a.getHeight();
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
