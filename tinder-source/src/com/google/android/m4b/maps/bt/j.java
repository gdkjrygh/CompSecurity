// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.cg.ai;
import com.google.android.m4b.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            l, h, d, k

public final class j
    implements l, com.google.android.m4b.maps.cg.ai.a
{

    private final ai a;
    private final boolean b;
    private h c;
    private Paint d;

    public j(ai ai1, boolean flag, h h1)
    {
        d = new Paint();
        a = ai1;
        c = h1;
        b = flag;
        ai1 = c;
        ((h) (ai1)).a.add(this);
        ((h) (ai1)).d.invalidate();
    }

    private static void a(Path path, List list, k k1)
    {
        float f = k1.b();
        int l1 = (int)Math.ceil(((float)k1.f - f) / (2.0F * f));
        for (int i1 = -l1; i1 <= l1; i1++)
        {
            Point point = k1.a((LatLng)list.get(0));
            path.moveTo((float)point.x + (float)i1 * f, point.y);
            int j1 = 1;
            Point point1 = point;
            int i = 0;
            Point point2 = point;
            while (j1 < list.size()) 
            {
                point2 = k1.a((LatLng)list.get(j1));
                if ((float)(point2.x - point1.x) > f / 2.0F)
                {
                    i--;
                } else
                if ((float)(point2.x - point1.x) < -f / 2.0F)
                {
                    i++;
                }
                path.lineTo((float)point2.x + (float)(i1 + i) * f, point2.y);
                j1++;
                point1 = point2;
            }
            if ((float)point.x == (float)point2.x + (float)i * f && point.y == point2.y)
            {
                path.close();
            }
        }

    }

    public final void a()
    {
        h h1 = c;
        h1.a.remove(this);
        h1.d.invalidate();
    }

    public final void a(int i)
    {
        c.d.invalidate();
    }

    public final void a(Canvas canvas, k k1)
    {
        if (a.h())
        {
            Path path = new Path();
            a(path, ((List) (a.c())), k1);
            for (com.google.android.m4b.maps.aa.x x = a.d().a(); x.hasNext(); a(path, ((List) ((ae)x.next())), k1)) { }
            d.setAntiAlias(true);
            path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            if (b && a.g() != 0)
            {
                d.setColor(a.g());
                d.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawPath(path, d);
            }
            if (a.f() != 0)
            {
                d.setColor(a.f());
                d.setStrokeWidth(a.e());
                d.setStyle(android.graphics.Paint.Style.STROKE);
                canvas.drawPath(path, d);
                return;
            }
        }
    }

    public final float b()
    {
        return a.i();
    }
}
