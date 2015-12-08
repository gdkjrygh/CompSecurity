// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Enums.Alignment;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartCollection, ChartLegend, aa, v

public final class g
{
    public static abstract class a
    {

        final Rect a = new Rect();
        final Point b = new Point();

        protected abstract void a(Canvas canvas, Rect rect);

        protected abstract void a(Point point);

        public a()
        {
        }
    }

    public final class b extends a
    {

        private Drawable c;
        private g d;

        static Drawable a(b b1, Drawable drawable)
        {
            b1.c = drawable;
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

        protected b(Drawable drawable)
        {
            d = g.this;
            super();
            c = null;
            c = drawable;
        }
    }

    public final class c extends a
    {

        private final aa c = new aa();
        private g d;

        public final String a()
        {
            return c.a;
        }

        protected final void a(Canvas canvas, Rect rect)
        {
            c.a(rect.left, rect.top, rect.right, rect.bottom, g.a(d).m());
            c.a(canvas, g.a(d).m());
        }

        protected final void a(Point point)
        {
            aa aa1 = c;
            int i = point.x;
            i = point.y;
            aa1.a(g.a(d).m());
            point.set((int)c.i, (int)c.j);
        }

        public final void a(Alignment alignment, Alignment alignment1)
        {
            c.e = com.artfulbits.aiCharts.Base.a._cls1.a(alignment, alignment1);
            d.a(false);
        }

        public final void a(String s)
        {
            if (!v.a(c.a, s))
            {
                c.a = s;
                d.a(true);
            }
        }

        public final Alignment b()
        {
            return com.artfulbits.aiCharts.Base.a._cls1.b(c.e);
        }

        public final Alignment c()
        {
            return com.artfulbits.aiCharts.Base.a._cls1.c(c.e);
        }

        protected c(String s)
        {
            d = g.this;
            super();
            c.a = s;
        }
    }


    protected final ChartCollection a;
    protected final Rect b;
    protected final Point c;
    private ChartLegend d;
    private Object e;

    public g()
    {
        b = new Rect();
        c = new Point();
        a = new ChartCollection(new ChartCollection.a() {

            private g a;

            public final void a(Object obj, Object obj1, int i)
            {
                a.a(true);
            }

            
            {
                a = g.this;
                super();
            }
        });
    }

    public transient g(Object aobj[])
    {
        this();
        int j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            if (obj == null)
            {
                a.add(null);
            } else
            if (obj instanceof Drawable)
            {
                a.add(new b((Drawable)obj));
            } else
            if (obj instanceof a)
            {
                a.add((a)obj);
            } else
            {
                a.add(new c(obj.toString()));
            }
            i++;
        }
    }

    static ChartLegend a(g g1)
    {
        return g1.d;
    }

    public final b a(Drawable drawable)
    {
        drawable = new b(drawable);
        a.add(drawable);
        return drawable;
    }

    public final c a(String s)
    {
        s = new c(s);
        a.add(s);
        return s;
    }

    public final void a()
    {
        a.add(null);
    }

    public final void a(int i, Drawable drawable)
    {
        a a1 = (a)a.get(i);
        if (a1 instanceof b)
        {
            b.a((b)a1, drawable);
            return;
        } else
        {
            a.set(i, new b(drawable));
            return;
        }
    }

    public final void a(int i, String s)
    {
        a a1 = (a)a.get(i);
        if (a1 instanceof c)
        {
            ((c)a1).a(s);
            return;
        } else
        {
            a.set(i, new c(s));
            return;
        }
    }

    final void a(Canvas canvas)
    {
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)a.get(i);
            if (a1 != null)
            {
                a1.a(canvas, a1.a);
            }
        }

    }

    final void a(Point point, ArrayList arraylist)
    {
        c.set(0, 0);
        int j = a.size();
        int i = 0;
        while (i < j) 
        {
            a a1 = (a)a.get(i);
            if (a1 != null)
            {
                a1.a(a1.b);
                Point point1 = c;
                point1.x = point1.x + a1.b.x;
                c.y = Math.max(c.y, a1.b.y);
                if (arraylist.size() > i)
                {
                    arraylist.set(i, Integer.valueOf(Math.max(a1.b.x, ((Integer)arraylist.get(i)).intValue())));
                } else
                {
                    arraylist.add(Integer.valueOf(a1.b.x));
                }
            }
            i++;
        }
        point.set(c.x, c.y);
    }

    final void a(Rect rect, ArrayList arraylist, boolean flag)
    {
        int i = rect.left;
        b.set(rect);
        int l = a.size();
        int j = 0;
        while (j < l) 
        {
            a a1 = (a)a.get(j);
            if (a1 != null)
            {
                int k;
                if (flag)
                {
                    k = ((Integer)arraylist.get(j)).intValue();
                } else
                {
                    k = a1.b.x;
                }
                a1.a.set(i, rect.top, i + k, rect.bottom);
                i += k;
            }
            j++;
        }
    }

    protected final void a(ChartLegend chartlegend)
    {
        d = chartlegend;
    }

    public final void a(a a1)
    {
        a.add(a1);
    }

    public final void a(Object obj)
    {
        e = obj;
    }

    protected final void a(boolean flag)
    {
        if (d != null)
        {
            d.b(flag);
        }
    }

    public final List b()
    {
        return a;
    }

    public final void c()
    {
        a.clear();
    }

    public final Object d()
    {
        return e;
    }

    protected final ChartLegend e()
    {
        return d;
    }
}
