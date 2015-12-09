// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            g

public static abstract class 
{

    final Rect a = new Rect();
    final Point b = new Point();

    protected abstract void a(Canvas canvas, Rect rect);

    protected abstract void a(Point point);

    public ()
    {
    }
}
