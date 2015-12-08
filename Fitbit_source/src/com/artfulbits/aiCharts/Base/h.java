// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.artfulbits.aiCharts.a.a;
import com.artfulbits.aiCharts.a.c;
import com.artfulbits.aiCharts.a.d;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            t, z, g, ChartSeries, 
//            j

public final class h
    implements t
{
    static final class a extends g.a
    {

        private final c c;

        protected final void a(Canvas canvas, Rect rect)
        {
            c.f().setBounds(rect);
            c.f().draw(canvas);
        }

        protected final void a(Point point)
        {
            point.set(20, 20);
        }

        public a(c c1)
        {
            c = c1;
        }
    }

    static final class b extends g.a
    {

        private final d c;
        private final Rect d = new Rect();

        protected final void a(Canvas canvas, Rect rect)
        {
            (new Paint()).setAntiAlias(true);
            c.k().setBounds(rect);
            c.k().draw(canvas);
            canvas.drawText(c.j(), rect.centerX(), rect.centerY() + d.height() / 2, c.f());
        }

        protected final void a(Point point)
        {
            String s1 = c.j();
            String s = s1;
            if (s1.length() > 3)
            {
                s = s1.substring(0, 3);
            }
            c.f().getTextBounds(s, 0, s.length(), d);
            int i = Math.max(d.height(), d.width()) + 5;
            point.set(i, i);
        }

        public b(d d1)
        {
            c = d1;
        }
    }


    static final h a = new h();
    private final z b;

    public h()
    {
        this(null);
    }

    public h(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = new z(s);
        }
        b = s;
    }

    public final g a(Object obj, g g1)
    {
        g g2;
        if (g1 == null)
        {
            g2 = new g();
        } else
        {
            g2 = g1;
            if (g1 != obj)
            {
                g1.c();
                g2 = g1;
            }
        }
        if (obj instanceof ChartSeries)
        {
            g1 = (ChartSeries)obj;
            g2.a(new ChartSeries.b(g1));
            if (b == null)
            {
                g2.a(g1.a());
            } else
            {
                g2.a(b.a(g1));
            }
            g2.a(obj);
        } else
        if (obj instanceof j)
        {
            g1 = (j)obj;
            g2.a(new ChartSeries.b(g1));
            if (b == null)
            {
                g2.a(g1.f());
            } else
            {
                g2.a(b.a(g1));
            }
            g2.a(obj);
        } else
        if (obj instanceof com.artfulbits.aiCharts.a.a)
        {
            if (obj instanceof d)
            {
                g1 = (d)obj;
                g2.b().add(new b(g1));
                g2.a(g1.c());
            } else
            if (obj instanceof c)
            {
                g1 = (c)obj;
                g2.b().add(new a(g1));
                g2.a(g1.c());
            }
            g2.a(obj);
        } else
        {
            if (obj instanceof g)
            {
                return (g)obj;
            }
            g2.a(obj.toString());
        }
        return g2;
    }

    public final volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (g)obj1);
    }

}
