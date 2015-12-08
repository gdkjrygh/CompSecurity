// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class DrawingDebugView extends View
{
    public static class Point extends ShapeBase
    {

        private android.graphics.Point mPoint;

        public void draw(Canvas canvas, Paint paint1)
        {
            canvas.drawPoint(mPoint.x, mPoint.y, paint1);
        }

        public Point(android.graphics.Point point)
        {
            mPoint = point;
        }
    }

    public static abstract class ShapeBase
    {

        public abstract void draw(Canvas canvas, Paint paint1);

        public ShapeBase()
        {
        }
    }


    private static DrawingDebugView mInstance;
    private static ArrayList sShapes = new ArrayList();
    private Paint paint;

    public DrawingDebugView(Context context)
    {
        super(context);
        paint = new Paint();
        mInstance = this;
    }

    public DrawingDebugView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        paint = new Paint();
        mInstance = this;
    }

    public DrawingDebugView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        paint = new Paint();
        mInstance = this;
    }

    public DrawingDebugView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        paint = new Paint();
        mInstance = this;
    }

    public static void addPoint(android.graphics.Point point)
    {
        sShapes.add(new Point(point));
        if (mInstance != null)
        {
            mInstance.invalidate();
        }
    }

    public static void addShape(ShapeBase shapebase)
    {
        sShapes.add(shapebase);
        if (mInstance != null)
        {
            mInstance.invalidate();
        }
    }

    public static void clearShapes()
    {
        sShapes.clear();
        if (mInstance != null)
        {
            mInstance.invalidate();
        }
    }

    public void onDraw(Canvas canvas)
    {
        setVisibility(8);
    }

}
