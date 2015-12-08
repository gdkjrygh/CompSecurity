// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.google.android.libraries.commerce.ocr.util:
//            ShapeModifier

public final class <init>
{

    private final RectF target;
    final ShapeModifier this$0;

    private static float toFloat(double d)
    {
        return (float)d;
    }

    public final Rect getAsRect()
    {
        return new Rect(Math.round(target.left), Math.round(target.top), Math.round(target.right), Math.round(target.bottom));
    }

    public final target rotate(int i, float f, float f1)
    {
        Matrix matrix = new Matrix();
        matrix.setRotate(i, f, f1);
        matrix.mapRect(target);
        return this;
    }

    public final target scale(Point point, Point point1)
    {
        double d = (double)point1.x / (double)point.x;
        double d1 = (double)point1.y / (double)point.y;
        target.set(toFloat((double)target.left * d), toFloat((double)target.top * d1), toFloat((double)target.right * d), toFloat((double)target.bottom * d1));
        return this;
    }

    public final target scaleToHeight(float f)
    {
        double d = (double)target.height() / (double)target.width();
        float f1 = (float)((double)f / d);
        target.set(target.left, target.top, target.left + f1, target.top + f);
        return this;
    }

    public final target scaleToWidth(float f)
    {
        double d = (double)target.height() / (double)target.width();
        float f1 = (float)((double)f * d);
        target.set(target.left, target.top, target.left + f, target.top + f1);
        return this;
    }

    public final target swapDimensions()
    {
        target.set(target.top, target.left, target.bottom, target.right);
        return this;
    }

    private (Rect rect)
    {
        this$0 = ShapeModifier.this;
        super();
        target = new RectF(rect);
    }

    target(Rect rect, target target1)
    {
        this(rect);
    }

    private <init>(RectF rectf)
    {
        this$0 = ShapeModifier.this;
        super();
        target = new RectF(rectf);
    }

    target(RectF rectf, target target1)
    {
        this(rectf);
    }
}
