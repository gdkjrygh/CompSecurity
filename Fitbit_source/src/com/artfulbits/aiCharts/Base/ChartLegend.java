// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartLayoutElement, ab, f, g, 
//            v, e, ChartNamedCollection, ac

public final class ChartLegend extends ChartLayoutElement
    implements ab
{
    public static final class LayoutMode extends Enum
    {

        public static final LayoutMode a;
        public static final LayoutMode b;
        public static final LayoutMode c;
        public static final LayoutMode d;
        private static final LayoutMode e[];

        public static LayoutMode valueOf(String s1)
        {
            return (LayoutMode)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartLegend$LayoutMode, s1);
        }

        public static LayoutMode[] values()
        {
            return (LayoutMode[])e.clone();
        }

        static 
        {
            a = new LayoutMode("Vertical", 0);
            b = new LayoutMode("Horizontal", 1);
            c = new LayoutMode("Auto", 2);
            d = new LayoutMode("Flow", 3);
            e = (new LayoutMode[] {
                a, b, c, d
            });
        }

        private LayoutMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private LayoutMode i;
    private String j;
    private final Point k;
    private int l;
    private int m;
    private int n;
    private int o;
    private Drawable p;
    private List q;
    private final ArrayList r;
    private Point s;
    private TextPaint t;
    private f u;
    private final ac v;

    public ChartLegend()
    {
        this(null, ((f) (new f.f())));
    }

    public ChartLegend(f f1)
    {
        this(null, f1);
    }

    public ChartLegend(String s1)
    {
        this(s1, ((f) (new f.f())));
    }

    public ChartLegend(String s1, f f1)
    {
        i = LayoutMode.c;
        j = null;
        k = new Point(4, 4);
        l = 0;
        m = 0;
        p = null;
        q = null;
        r = new ArrayList();
        s = new Point();
        t = new TextPaint();
        v = new ac() {

            private ChartLegend a;

            public final void a(int i1)
            {
                if (ChartLegend.a(a).a(i1))
                {
                    ChartLegend.a(a, null);
                    a.f.b(1);
                }
            }

            
            {
                a = ChartLegend.this;
                super();
            }
        };
        j = s1;
        t.setColor(-1);
        t.setAntiAlias(true);
        u = f1;
        u.a(this);
    }

    static f a(ChartLegend chartlegend)
    {
        return chartlegend.u;
    }

    static List a(ChartLegend chartlegend, List list)
    {
        chartlegend.q = null;
        return null;
    }

    private List o()
    {
        if (q == null)
        {
            q = u.a();
            if (q == null)
            {
                throw new NullPointerException("Legend items provider cannot return null for legend items");
            }
        }
        return q;
    }

    public final String a()
    {
        return j;
    }

    public final void a(int i1)
    {
        k.set(i1, i1);
        b(true);
    }

    public final void a(int i1, int j1)
    {
        k.set(i1, j1);
        b(true);
    }

    protected final void a(Resources resources, String s1, int i1, AttributeSet attributeset)
    {
        if (!"name".equalsIgnoreCase(s1)) goto _L2; else goto _L1
_L1:
        a(attributeset.getAttributeValue(i1));
_L4:
        super.a(resources, s1, i1, attributeset);
        return;
_L2:
        if ("background".equalsIgnoreCase(s1))
        {
            int j1 = attributeset.getAttributeResourceValue(i1, -1);
            if (j1 != -1 && resources != null)
            {
                p = resources.getDrawable(j1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Canvas canvas)
    {
        List list = o();
        if (p != null)
        {
            p.setBounds(a);
            p.draw(canvas);
        }
        int j1 = list.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((g)list.get(i1)).a(canvas);
        }

    }

    public final void a(Point point)
    {
        boolean flag2 = false;
        List list = o();
        Rect rect = new Rect();
        Point point1 = new Point();
        if (p != null)
        {
            p.getPadding(rect);
        }
        boolean flag;
        int j2;
        if (i == LayoutMode.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r.clear();
        s.set(0, 0);
        j2 = list.size();
        for (int j1 = 0; j1 < j2; j1++)
        {
            ((g)list.get(j1)).a(point1, r);
            s.x = Math.max(point1.x, s.x);
            s.y = Math.max(point1.y, s.y);
        }

        if (flag)
        {
            l = 0;
            m = 0;
            int k2 = list.size();
            int i1 = 0;
            int k1 = ((flag2) ? 1 : 0);
            while (k1 < k2) 
            {
                g g1 = (g)list.get(k1);
                int i2 = g1.c.x + i1 + k.x;
                if (i2 > point.x)
                {
                    l = Math.max(i1, l);
                    m = m + (s.y + k.y);
                    i1 = g1.c.x + k.x;
                } else
                {
                    i1 = i2;
                }
                k1++;
            }
            l = Math.max(i1, l);
            m = m + (s.y + k.y);
        } else
        {
            boolean flag1;
            if (i == LayoutMode.b || i == LayoutMode.c && !b.vertical)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            s.x = 0;
            for (Iterator iterator = r.iterator(); iterator.hasNext();)
            {
                Integer integer = (Integer)iterator.next();
                Point point2 = s;
                int l1 = point2.x;
                point2.x = integer.intValue() + l1;
            }

            if (flag1)
            {
                n = com.artfulbits.aiCharts.Base.v.a((point.x - k.x - rect.left - rect.right) / (s.x + k.x), 1, list.size());
                o = (int)Math.ceil((float)list.size() / (float)n);
                o = com.artfulbits.aiCharts.Base.v.a(o, 1, list.size());
            } else
            {
                o = com.artfulbits.aiCharts.Base.v.a((point.y - k.x - rect.top - rect.bottom) / (s.y + k.y), 1, list.size());
                n = (int)Math.ceil((float)list.size() / (float)o);
                n = com.artfulbits.aiCharts.Base.v.a(n, 1, list.size());
            }
            l = n * (s.x + k.x);
            m = o * (s.y + k.y);
        }
        d = k.x + l + rect.left + rect.right;
        e = k.y + m + rect.left + rect.right;
        point.set(d, e);
    }

    public final void a(Drawable drawable)
    {
        if (p != drawable)
        {
            p = drawable;
            b(true);
        }
    }

    public final void a(LayoutMode layoutmode)
    {
        i = layoutmode;
    }

    protected final void a(e e1)
    {
        if (f != null)
        {
            f.b(v);
        }
        super.a(e1);
        if (f != null)
        {
            f.a(v);
        }
    }

    public final void a(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("provider");
        } else
        {
            u.a(null);
            u = f1;
            u.a(this);
            n();
            return;
        }
    }

    public final void a(String s1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(j, s1))
        {
            if (f != null)
            {
                f.d().c(s1);
            }
            j = s1;
            b(true);
        }
    }

    protected final g b(int i1, int j1)
    {
        List list = o();
        int l1 = list.size();
        for (int k1 = 0; k1 < l1; k1++)
        {
            if (((g)list.get(k1)).b.contains(i1, j1))
            {
                return (g)list.get(k1);
            }
        }

        return null;
    }

    public final void b(Point point)
    {
        point.set(k.x, k.y);
    }

    public final void c(Rect rect)
    {
        boolean flag = false;
        super.c(rect);
        rect = o();
        Rect rect1 = new Rect();
        int i1;
        int j1;
        int k1;
        int i2;
        int k2;
        int l2;
        int j3;
        int k3;
        int l3;
        if (i == LayoutMode.d)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        l3 = a.left + k.x;
        k3 = a.top + k.y;
        j3 = a.right - k.x;
        l2 = a.bottom - k.y;
        k2 = l2;
        k1 = j3;
        j1 = k3;
        i1 = l3;
        if (p != null)
        {
            p.getPadding(rect1);
            i1 = l3 + rect1.left;
            j1 = k3 + rect1.top;
            k1 = j3 - rect1.right;
            k2 = l2 - rect1.bottom;
        }
        if (rect.size() > 0)
        {
            if (i2 != 0)
            {
                rect1.set(i1, j1, k1, k2);
                i2 = rect.size();
                for (j1 = 0; j1 < i2; j1++)
                {
                    g g1 = (g)rect.get(j1);
                    if (rect1.left + g1.c.x > k1)
                    {
                        rect1.left = i1;
                        rect1.top = rect1.top + (k.y + s.y);
                    }
                    rect1.right = rect1.left + g1.c.x;
                    rect1.bottom = rect1.top + s.y;
                    g1.a(rect1, null, false);
                    k2 = rect1.left;
                    rect1.left = g1.c.x + k.x + k2;
                }

            } else
            {
                int j2 = (k1 - i1) / n;
                k2 = (k2 - j1) / o;
                int i3 = rect.size();
                for (int l1 = ((flag) ? 1 : 0); l1 < i3; l1++)
                {
                    g g2 = (g)rect.get(l1);
                    rect1.left = (l1 % n) * j2 + i1;
                    rect1.top = (l1 / n) * k2 + j1;
                    rect1.right = rect1.left + j2;
                    rect1.bottom = rect1.top + k2;
                    Gravity.apply(17, s.x, s.y, rect1, g2.b);
                    g2.a(g2.b, r, true);
                }

            }
        }
    }

    public final LayoutMode i()
    {
        return i;
    }

    public final f j()
    {
        return u;
    }

    public final Drawable k()
    {
        return p;
    }

    public final TextPaint m()
    {
        return t;
    }

    protected final void n()
    {
        q = null;
    }
}
