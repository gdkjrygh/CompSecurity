// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class c extends q
{

    public static final d h = d.a("bubble-min_radius", com/artfulbits/aiCharts/Types/c, java/lang/Integer, Integer.valueOf(10));
    public static final d i = d.a("bubble-max_radius", com/artfulbits/aiCharts/Types/c, java/lang/Integer, Integer.valueOf(20));
    private final y j = new y();

    public c()
    {
    }

    public void a(m m1)
    {
        List list = m1.b.I();
        Object obj = (Integer)m1.b.a(h);
        Object obj1 = (Integer)m1.b.a(i);
        int l = m1.b.G().b;
        int i1 = m1.b.G().c;
        int k1 = ((Integer) (obj)).intValue();
        int k = ((Integer) (obj1)).intValue();
        double d1 = 0.0D;
        obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (j)((Iterator) (obj)).next();
            if (((j) (obj1)).b().length > i1)
            {
                d1 = Math.max(d1, ((j) (obj1)).a(i1));
            }
        } while (true);
        j.a(m1);
        d1 = (double)(k - k1) / d1;
        int l1 = list.size() - 1;
        double d2 = m1.e.a().f();
        double d3 = m1.e.a().g();
        k = a(list, d2, d3, 0, l1);
        l1 = b(list, d2, d3, k, l1);
        obj = new Path();
        obj1 = new PointF();
        RectF rectf = new RectF();
        while (k <= l1) 
        {
            j j1 = (j)list.get(k);
            m1.a(j1.a(), j1.a(l), ((PointF) (obj1)));
            rectf.set(((PointF) (obj1)).x, ((PointF) (obj1)).y, ((PointF) (obj1)).x, ((PointF) (obj1)).y);
            Drawable drawable;
            if (j1.b().length > i1)
            {
                int i2 = (int)((double)k1 + j1.a(i1) * d1);
                rectf.inset(-i2, -i2);
            } else
            {
                rectf.inset(-k1, -k1);
            }
            if (m1.m)
            {
                m1.a(rectf, j1);
            }
            drawable = j1.i();
            if (drawable == null)
            {
                ((Path) (obj)).reset();
                ((Path) (obj)).addOval(rectf, android.graphics.Path.Direction.CW);
                j.e(((Path) (obj)), j1);
            } else
            {
                Rect rect = new Rect();
                rectf.round(rect);
                if (j1.A())
                {
                    drawable.setColorFilter(j1.g(), android.graphics.PorterDuff.Mode.MULTIPLY);
                }
                drawable.setBounds(rect);
                drawable.draw(m1.a);
            }
            k++;
        }
        j.a();
    }

}
