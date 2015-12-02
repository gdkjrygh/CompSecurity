// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

public class y extends ImageSpan
{

    private WeakReference a;

    public y(BitmapDrawable bitmapdrawable)
    {
        super(bitmapdrawable, 0);
    }

    private int a(Paint paint, int i)
    {
        paint = (TextPaint)paint;
        return (int)((float)i * ((TextPaint) (paint)).density + 0.5F);
    }

    private Drawable a()
    {
        Object obj = a;
        Drawable drawable = null;
        if (obj != null)
        {
            drawable = (Drawable)((WeakReference) (obj)).get();
        }
        obj = drawable;
        if (drawable == null)
        {
            obj = getDrawable();
            a = new WeakReference(obj);
        }
        return ((Drawable) (obj));
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        charsequence = a();
        canvas.save();
        i = charsequence.getBounds().bottom;
        j = a(paint, 2);
        canvas.translate((float)a(paint, 1) + f, i1 - i - j);
        charsequence.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        charsequence = a().getBounds();
        i = a(paint, 2);
        return ((Rect) (charsequence)).right + i;
    }
}
