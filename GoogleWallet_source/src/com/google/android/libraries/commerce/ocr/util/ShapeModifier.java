// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.common.base.Preconditions;

public final class ShapeModifier
{
    public final class ModifiableRectF
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

        public final ModifiableRectF rotate(int i, float f, float f1)
        {
            Matrix matrix = new Matrix();
            matrix.setRotate(i, f, f1);
            matrix.mapRect(target);
            return this;
        }

        public final ModifiableRectF scale(Point point, Point point1)
        {
            double d = (double)point1.x / (double)point.x;
            double d1 = (double)point1.y / (double)point.y;
            target.set(toFloat((double)target.left * d), toFloat((double)target.top * d1), toFloat((double)target.right * d), toFloat((double)target.bottom * d1));
            return this;
        }

        public final ModifiableRectF scaleToHeight(float f)
        {
            double d = (double)target.height() / (double)target.width();
            float f1 = (float)((double)f / d);
            target.set(target.left, target.top, target.left + f1, target.top + f);
            return this;
        }

        public final ModifiableRectF scaleToWidth(float f)
        {
            double d = (double)target.height() / (double)target.width();
            float f1 = (float)((double)f * d);
            target.set(target.left, target.top, target.left + f, target.top + f1);
            return this;
        }

        public final ModifiableRectF swapDimensions()
        {
            target.set(target.top, target.left, target.bottom, target.right);
            return this;
        }

        private ModifiableRectF(Rect rect)
        {
            this$0 = ShapeModifier.this;
            super();
            target = new RectF(rect);
        }


        private ModifiableRectF(RectF rectf)
        {
            this$0 = ShapeModifier.this;
            super();
            target = new RectF(rectf);
        }

    }


    public ShapeModifier()
    {
    }

    public static RectF getCenteredRect(Rect rect, float f, float f1)
    {
        f = ((float)rect.width() - f) / 2.0F;
        f1 = ((float)rect.height() - f1) / 2.0F;
        return new RectF((float)rect.left + f, (float)rect.top + f1, (float)rect.right - f, (float)rect.bottom - f1);
    }

    private RectF resizeBoundingBoxF(Rect rect, float f)
    {
        if (rect == null)
        {
            return null;
        } else
        {
            f = 1.0F - f;
            return getCenteredRect(rect, f * (float)rect.width(), f * (float)rect.height());
        }
    }

    public static Rect toRect(Point point)
    {
        if (point == null)
        {
            return null;
        } else
        {
            return new Rect(new Rect(0, 0, point.x, point.y));
        }
    }

    public final ModifiableRectF getShapeModifier(Rect rect)
    {
        return new ModifiableRectF(rect);
    }

    public final Rect resizeBoundingBox(Rect rect, float f)
    {
        return toRect(resizeBoundingBoxF(rect, f));
    }

    public final Rect scaleToNewResolution(Rect rect, Rect rect1, Point point)
    {
        Preconditions.checkArgument(rect1.contains(rect), String.format("Container[%s] must hold target[%s]", new Object[] {
            rect1, rect
        }));
        return (new ModifiableRectF(rect)).scale(new Point(rect1.right, rect1.bottom), point).getAsRect();
    }

    public final Rect scaleToNewResolutionThenSwapDimensions(Rect rect, Rect rect1, Point point)
    {
        Preconditions.checkArgument(rect1.contains(rect), String.format("Container[%s] must hold target[%s]", new Object[] {
            rect1, rect
        }));
        return (new ModifiableRectF(rect)).scale(new Point(rect1.right, rect1.bottom), point).swapDimensions().getAsRect();
    }

    public final Rect toRect(RectF rectf)
    {
        if (rectf == null)
        {
            return null;
        } else
        {
            return (new ModifiableRectF(rectf)).getAsRect();
        }
    }
}
