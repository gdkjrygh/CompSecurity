// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;

public final class HexagonShape extends RectShape
{

    public HexagonShape()
    {
    }

    private Path getPath()
    {
        RectF rectf = rect();
        float f3 = rectf.bottom - rectf.top;
        float f2 = (float)((Math.sqrt(3D) / 2D) * (double)f3);
        float f = (rectf.left + rectf.right) / 2.0F;
        float f1 = f3 / 4F;
        f3 = (3F * f3) / 4F;
        float f4 = f - f2 / 2.0F;
        f2 = f + f2 / 2.0F;
        Path path = new Path();
        path.moveTo(f, rectf.top);
        path.lineTo(f4, f1);
        path.lineTo(f4, f3);
        path.lineTo(f, rectf.bottom);
        path.lineTo(f2, f3);
        path.lineTo(f2, f1);
        path.lineTo(f, rectf.top);
        return path;
    }

    public final void draw(Canvas canvas, Paint paint)
    {
        canvas.drawPath(getPath(), paint);
    }

    public final void getOutline(Outline outline)
    {
        outline.setConvexPath(getPath());
    }
}
