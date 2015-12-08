// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

// Referenced classes of package com.mopub.mobileads.resource:
//            CircleDrawable

public class CloseButtonDrawable extends CircleDrawable
{

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point e;
    private final Paint f = new Paint(a());
    private int g;

    public CloseButtonDrawable()
    {
        f.setStrokeWidth(4.5F);
        f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        g = (int)((0.5F * (float)d()) / (float)Math.sqrt(2D));
        a = new Point(b(), c());
        b = new Point(a);
        b.offset(-g, g);
        c = new Point(a);
        c.offset(-g, -g);
        d = new Point(a);
        d.offset(g, -g);
        e = new Point(a);
        e.offset(g, g);
        canvas.drawLine(b.x, b.y, d.x, d.y, f);
        canvas.drawLine(c.x, c.y, e.x, e.y, f);
    }
}
