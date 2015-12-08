// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

// Referenced classes of package com.mopub.mobileads.resource:
//            CircleDrawable

public class LearnMoreDrawable extends CircleDrawable
{

    private final Paint a = new Paint(a());
    private Point b;
    private Point c;
    private Point d;
    private Point e;
    private Point f;
    private int g;
    private int h;

    public LearnMoreDrawable()
    {
        a.setStrokeWidth(4.5F);
        a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        g = (int)((double)(0.5F * (float)d()) / Math.sqrt(2D));
        h = (int)(1.5F * (float)g);
        b = new Point(b(), c());
        c = new Point(b);
        c.offset(-g, g);
        d = new Point(b);
        d.offset(g, -g);
        e = new Point(d);
        e.offset(-h, 0);
        f = new Point(d);
        f.offset(0, h);
        canvas.drawLine(c.x, c.y, d.x, d.y, a);
        canvas.drawLine(d.x, d.y, e.x, e.y, a);
        canvas.drawLine(d.x, d.y, f.x, f.y, a);
    }
}
