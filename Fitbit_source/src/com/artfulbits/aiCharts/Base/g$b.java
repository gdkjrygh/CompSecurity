// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            g

public final class c extends c
{

    private Drawable c;
    private g d;

    static Drawable a(e e, Drawable drawable)
    {
        e.c = drawable;
        return drawable;
    }

    public final Drawable a()
    {
        return c;
    }

    protected final void a(Canvas canvas, Rect rect)
    {
        int i = rect.centerX();
        int j = rect.centerY();
        int k = Math.min(rect.width(), rect.height()) / 2;
        c.setBounds(i - k, j - k, i + k, j + k);
        c.draw(canvas);
    }

    protected final void a(Point point)
    {
        point.x = c.getIntrinsicWidth();
        point.y = c.getIntrinsicHeight();
    }

    public final void a(Drawable drawable)
    {
        c = drawable;
        d.a(true);
    }

    protected e(g g1, Drawable drawable)
    {
        d = g1;
        super();
        c = null;
        c = drawable;
    }
}
