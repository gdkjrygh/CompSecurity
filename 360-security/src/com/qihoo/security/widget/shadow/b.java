// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            a, e

public class b
    implements a
{

    private final ShapeDrawable a = new ShapeDrawable(new OvalShape());
    private final ShapeDrawable b = new ShapeDrawable(new OvalShape());
    private final RectF c = new RectF();
    private final RectF d = new RectF();

    public b()
    {
    }

    public void a(Canvas canvas)
    {
        canvas.drawOval(d, b.getPaint());
        canvas.drawOval(c, a.getPaint());
    }

    public void a(e e1, int i, int j, int k, int l)
    {
        c.left = i;
        c.top = (float)j + e1.c;
        c.right = k;
        c.bottom = (float)l + e1.c;
        d.left = i;
        d.top = (float)j + e1.d;
        d.right = k;
        d.bottom = (float)l + e1.d;
        a.getPaint().setColor(Color.argb(e1.a, 0, 0, 0));
        if (0.0F < e1.e)
        {
            a.getPaint().setMaskFilter(new BlurMaskFilter(e1.e, android.graphics.BlurMaskFilter.Blur.NORMAL));
        } else
        {
            a.getPaint().setMaskFilter(null);
        }
        b.getPaint().setColor(Color.argb(e1.b, 0, 0, 0));
        if (0.0F < e1.f)
        {
            b.getPaint().setMaskFilter(new BlurMaskFilter(e1.f, android.graphics.BlurMaskFilter.Blur.NORMAL));
            return;
        } else
        {
            b.getPaint().setMaskFilter(null);
            return;
        }
    }
}
