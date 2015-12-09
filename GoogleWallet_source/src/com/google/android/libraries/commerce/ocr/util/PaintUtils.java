// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.graphics.Paint;

public final class PaintUtils
{

    public static Paint createPaint(int i)
    {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    public static Paint createPaintStroke(int i, int j)
    {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(j);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        return paint;
    }
}
