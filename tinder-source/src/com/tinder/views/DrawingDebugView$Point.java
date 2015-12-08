// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

// Referenced classes of package com.tinder.views:
//            DrawingDebugView

public static class mPoint extends ase
{

    private Point mPoint;

    public void draw(Canvas canvas, Paint paint)
    {
        canvas.drawPoint(mPoint.x, mPoint.y, paint);
    }

    public ase(Point point)
    {
        mPoint = point;
    }
}
