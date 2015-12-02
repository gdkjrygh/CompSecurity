// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.Projection;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            cv, ThreadViewMapActivityImpl

class cu extends Overlay
{

    final ThreadViewMapActivityImpl a;
    private final Paint b = new Paint();
    private final List c = hq.a();

    cu(ThreadViewMapActivityImpl threadviewmapactivityimpl)
    {
        a = threadviewmapactivityimpl;
        super();
        b.setARGB(30, 0, 0, 0);
        b.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void a()
    {
        c.clear();
    }

    public void a(List list)
    {
        c.addAll(list);
    }

    public void draw(Canvas canvas, MapView mapview, boolean flag)
    {
        if (!flag)
        {
            mapview = mapview.getProjection();
            Point point = new Point();
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                cv cv1 = (cv)iterator.next();
                mapview.toPixels(cv1.getPoint(), point);
                float f = mapview.metersToEquatorPixels(cv1.c());
                canvas.drawCircle(point.x, point.y, f, b);
            }
        }
    }
}
