// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            x, ab, ChartAxis, ChartCollection, 
//            ChartSeries, q, m, e, 
//            ChartNamedCollection, ChartAxisScale, r, j, 
//            ac

public final class com.artfulbits.aiCharts.Base.a extends x
    implements ab, u.a
{
    static final class a
    {

        private Class a;
        private String b;
        private ChartSeries c;

        public final boolean equals(Object obj)
        {
            if (!(obj instanceof a)) goto _L2; else goto _L1
_L1:
            obj = (a)obj;
            if (c == null) goto _L4; else goto _L3
_L3:
            if (c != ((a) (obj)).c) goto _L6; else goto _L5
_L5:
            return true;
_L6:
            return false;
_L4:
            if (a != ((a) (obj)).a)
            {
                return false;
            }
            if (b != ((a) (obj)).b)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (obj instanceof ChartSeries)
            {
                obj = (ChartSeries)obj;
                if (c != null)
                {
                    if (c != obj)
                    {
                        return false;
                    }
                } else
                {
                    if (a != ((ChartSeries) (obj)).H().getClass())
                    {
                        return false;
                    }
                    if (b != ((ChartSeries) (obj)).a(q.a))
                    {
                        return false;
                    }
                }
            } else
            {
                return false;
            }
            if (true) goto _L5; else goto _L7
_L7:
        }

        public a(ChartSeries chartseries)
        {
            q q1 = chartseries.H();
            ChartSeries chartseries1;
            if (q1.b())
            {
                chartseries1 = null;
            } else
            {
                chartseries1 = chartseries;
            }
            c = chartseries1;
            a = q1.getClass();
            b = (String)chartseries.a(q.a);
        }
    }


    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 2;
    protected static final int d = 3;
    protected ChartSeries e;
    protected final ArrayList f;
    protected final Hashtable g;
    private String h;
    private ChartAxis i;
    private ChartAxis j;
    private ChartCollection k;
    private Drawable l;
    private Drawable m;
    private final ArrayList n;
    private double o;
    private ArrayList p;
    private boolean q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private boolean u;
    private e v;
    private int w;
    private final ac x;

    public com.artfulbits.aiCharts.Base.a()
    {
        this(new ChartAxis(ChartAxis.Position.f), new ChartAxis(ChartAxis.Position.a));
    }

    public com.artfulbits.aiCharts.Base.a(ChartAxis chartaxis, ChartAxis chartaxis1)
    {
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        e = null;
        f = new ArrayList();
        n = new ArrayList();
        o = (0.0D / 0.0D);
        q = true;
        r = new Rect();
        s = new Rect();
        t = new Rect(0, 0, 0, 0);
        u = false;
        v = null;
        w = 3;
        g = new Hashtable();
        x = new ac() {

            private com.artfulbits.aiCharts.Base.a a;

            public static int a(Alignment alignment, Alignment alignment1)
            {
                return alignment.ordinal() | alignment1.ordinal() << 4;
            }

            public static Alignment b(int i1)
            {
                return Alignment.values()[i1 & 0xf];
            }

            public static Alignment c(int i1)
            {
                return Alignment.values()[i1 >> 4 & 0xf];
            }

            public final void a(int i1)
            {
                switch (i1)
                {
                default:
                    return;

                case 16: // '\020'
                case 64: // '@'
                    a.b(3);
                    break;
                }
            }

            
            {
                a = com.artfulbits.aiCharts.Base.a.this;
                super();
            }
        };
        k = new ChartCollection(new ChartCollection.a() {

            private com.artfulbits.aiCharts.Base.a a;

            public final void a(Object obj, Object obj1, int i1)
            {
                obj = (ChartAxis)obj;
                obj1 = (ChartAxis)obj1;
                if (obj != null)
                {
                    ((ChartAxis) (obj)).a(a);
                }
                if (obj1 != null)
                {
                    ((ChartAxis) (obj1)).a(null);
                }
            }

            
            {
                a = com.artfulbits.aiCharts.Base.a.this;
                super();
            }
        });
        i = chartaxis;
        j = chartaxis1;
        k.add(i);
        k.add(j);
    }

    public com.artfulbits.aiCharts.Base.a(String s1)
    {
        this();
        a(s1);
    }

    private void b(int i1, int j1, int k1, int l1)
    {
        Object obj = e.H().g();
        int i3 = k1 - i1;
        int j3 = l1 - j1;
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[ChartAxis.Position.values().length];
                try
                {
                    a[ChartAxis.Position.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[ChartAxis.Position.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ChartAxis.Position.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ChartAxis.Position.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ChartAxis.Position.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ChartAxis.Position.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        float f1;
        int i2;
        int l2;
        int k3;
        if (obj == CoordinateSystem.a)
        {
            k3 = k.size();
            i2 = 0;
            int k2 = l1;
            l1 = j1;
            j1 = i1;
            i1 = k2;
        } else
        {
            if (obj == CoordinateSystem.b)
            {
                k1 = i3 >> 1;
                l1 = j3 >> 1;
                int j2 = i1 + k1;
                j1 += l1;
                i1 = Math.min(k1, l1);
                if (i.C())
                {
                    i1 = (int)i.a(i3, j3);
                }
                Iterator iterator = k.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ChartAxis chartaxis = (ChartAxis)iterator.next();
                    if (chartaxis.C() && chartaxis != i)
                    {
                        chartaxis.a(k1, l1);
                    }
                } while (true);
                t.set(j2 - i1, j1 - i1, j2 + i1, i1 + j1);
                return;
            }
            t.set(i1, j1, k1, l1);
            return;
        }
        if (i2 >= k3) goto _L2; else goto _L1
_L1:
        obj = (ChartAxis)k.get(i2);
        if (!((ChartAxis) (obj)).C()) goto _L4; else goto _L3
_L3:
        _cls3.a[((ChartAxis) (obj)).d().ordinal()];
        JVM INSTR tableswitch 1 6: default 136
    //                   1 173
    //                   2 204
    //                   3 235
    //                   4 262
    //                   5 291
    //                   6 291;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L9
_L4:
        l2 = k1;
        k1 = l1;
        l1 = j1;
        j1 = l2;
_L10:
        l2 = i2 + 1;
        i2 = l1;
        l1 = k1;
        k1 = j1;
        j1 = i2;
        i2 = l2;
        continue; /* Loop/switch isn't completed */
_L5:
        f1 = j1;
        l2 = (int)(((ChartAxis) (obj)).a(i3, j3) + f1);
        j1 = k1;
        k1 = l1;
        l1 = l2;
        continue; /* Loop/switch isn't completed */
_L6:
        f1 = l1;
        l2 = (int)(((ChartAxis) (obj)).a(i3, j3) + f1);
        l1 = j1;
        j1 = k1;
        k1 = l2;
        continue; /* Loop/switch isn't completed */
_L7:
        l2 = (int)((float)k1 - ((ChartAxis) (obj)).a(i3, j3));
        k1 = l1;
        l1 = j1;
        j1 = l2;
        continue; /* Loop/switch isn't completed */
_L8:
        i1 = (int)((float)i1 - ((ChartAxis) (obj)).a(i3, j3));
        l2 = j1;
        j1 = k1;
        k1 = l1;
        l1 = l2;
        if (true) goto _L10; else goto _L9
_L9:
        ((ChartAxis) (obj)).a(i3, j3);
        if (true) goto _L4; else goto _L2
_L2:
        t.set(j1, l1, k1, i1);
        return;
        if (true) goto _L12; else goto _L11
_L12:
        break MISSING_BLOCK_LABEL_55;
_L11:
    }

    private void q()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        Object obj;
        f1 = t.left;
        f4 = t.top;
        f3 = t.right;
        f2 = t.bottom;
        obj = e.H().g();
        if (obj != CoordinateSystem.a) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = k.size();
        i1 = 0;
_L20:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        obj = (ChartAxis)k.get(i1);
        if (!((ChartAxis) (obj)).C()) goto _L6; else goto _L5
_L5:
        _cls3.a[((ChartAxis) (obj)).d().ordinal()];
        JVM INSTR tableswitch 1 6: default 148
    //                   1 185
    //                   2 241
    //                   3 303
    //                   4 361
    //                   5 413
    //                   6 473;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L6:
        float f5 = f2;
        f2 = f3;
        f3 = f4;
        f4 = f1;
        f1 = f5;
_L13:
        i1++;
        float f6 = f4;
        f4 = f3;
        f3 = f2;
        f2 = f1;
        f1 = f6;
        continue; /* Loop/switch isn't completed */
_L7:
        ((ChartAxis) (obj)).a(f1 - ((ChartAxis) (obj)).e, t.top, f1, t.bottom);
        float f7 = ((ChartAxis) (obj)).e;
        f7 = f1 - f7;
        f1 = f2;
        f2 = f3;
        f3 = f4;
        f4 = f7;
        continue; /* Loop/switch isn't completed */
_L8:
        ((ChartAxis) (obj)).a(t.left, f4 - ((ChartAxis) (obj)).e, t.right, f4);
        float f13 = ((ChartAxis) (obj)).e;
        float f8 = f1;
        f4 -= f13;
        f1 = f2;
        f2 = f3;
        f3 = f4;
        f4 = f8;
        continue; /* Loop/switch isn't completed */
_L9:
        ((ChartAxis) (obj)).a(f3, t.top, ((ChartAxis) (obj)).e + f3, t.bottom);
        float f14 = ((ChartAxis) (obj)).e;
        float f9 = f1;
        f3 = f14 + f3;
        f1 = f2;
        f2 = f3;
        f3 = f4;
        f4 = f9;
        continue; /* Loop/switch isn't completed */
_L10:
        ((ChartAxis) (obj)).a(t.left, f2, t.right, ((ChartAxis) (obj)).e + f2);
        float f10 = ((ChartAxis) (obj)).e + f2;
        f2 = f3;
        f3 = f4;
        f4 = f1;
        f1 = f10;
        continue; /* Loop/switch isn't completed */
_L11:
        ((ChartAxis) (obj)).a(t.left, t.centerY(), t.right, (float)t.centerY() + ((ChartAxis) (obj)).e);
        float f11 = f1;
        f1 = f2;
        f2 = f3;
        f3 = f4;
        f4 = f11;
        if (true) goto _L13; else goto _L12
_L12:
        ((ChartAxis) (obj)).a((float)t.centerX() - ((ChartAxis) (obj)).e, t.top, t.centerX(), t.bottom);
        if (true) goto _L6; else goto _L2
_L2:
        if (obj != CoordinateSystem.b) goto _L4; else goto _L14
_L14:
        float f12;
        float f15;
        float f16;
        float f17;
        f12 = (f3 - f1) / 2.0F;
        f15 = (f2 - f4) / 2.0F;
        f16 = f1 + f12;
        f17 = f4 + f15;
        if (i.C())
        {
            i.b(f1, f4, f3, f2);
        }
        obj = k.iterator();
_L17:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L15
_L15:
        ChartAxis chartaxis = (ChartAxis)((Iterator) (obj)).next();
        if (!chartaxis.C() || chartaxis == i) goto _L17; else goto _L16
_L16:
        ChartAxis.Position position = chartaxis.d();
        switch (_cls3.a[position.ordinal()])
        {
        case 1: // '\001'
            chartaxis.a(f16 - chartaxis.e, f17 - f15, f16, f17);
            break;

        case 2: // '\002'
            chartaxis.a(f16, f17 - chartaxis.e, f16 + f12, f17);
            break;

        case 4: // '\004'
            chartaxis.a(f16, f17, f16 + f12, chartaxis.e + f17);
            break;

        case 3: // '\003'
            chartaxis.a(f16, f17 - f15, chartaxis.e + f16, f17);
            break;
        }
        if (true) goto _L17; else goto _L18
_L18:
_L4:
        return;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final String a()
    {
        return h;
    }

    public final void a(int i1)
    {
        r.set(i1, i1, i1, i1);
        b(1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        r.set(i1, j1, k1, l1);
        b(1);
    }

    protected final void a(int i1, int j1, List list)
    {
        if (i() != CoordinateSystem.c)
        {
            Iterator iterator = k.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ChartAxis chartaxis = (ChartAxis)iterator.next();
                if (chartaxis.B().contains(i1, j1))
                {
                    list.add(chartaxis);
                }
            } while (true);
        }
        Iterator iterator1 = g.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Region region = (Region)iterator1.next();
            if (region.contains(i1, j1))
            {
                list.add(g.get(region));
            }
        } while (true);
    }

    protected final void a(Resources resources, String s1, int i1, AttributeSet attributeset)
    {
        if (!"name".equalsIgnoreCase(s1)) goto _L2; else goto _L1
_L1:
        h = attributeset.getAttributeValue(i1);
_L4:
        return;
_L2:
        if (!"grid".equalsIgnoreCase(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = attributeset.getAttributeResourceValue(i1, -1);
        if (i1 != -1 && resources != null)
        {
            m = resources.getDrawable(i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"background".equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        i1 = attributeset.getAttributeResourceValue(i1, -1);
        if (i1 != -1 && resources != null)
        {
            l = resources.getDrawable(i1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected final void a(Canvas canvas)
    {
        boolean flag = false;
        p();
        g.clear();
        if (l != null)
        {
            l.setBounds(s);
            l.draw(canvas);
        }
        if (e != null)
        {
            Object obj = e.H().g();
            ChartCollection chartcollection = k;
            int l2 = chartcollection.size();
            if (obj == CoordinateSystem.a)
            {
                if (m != null)
                {
                    m.setBounds(t);
                    m.draw(canvas);
                }
                for (int i1 = 0; i1 < l2; i1++)
                {
                    ChartAxis chartaxis1 = (ChartAxis)chartcollection.get(i1);
                    if (chartaxis1.e())
                    {
                        chartaxis1.b(canvas, t);
                    }
                }

                for (int j1 = 0; j1 < l2; j1++)
                {
                    ((ChartAxis)chartcollection.get(j1)).a(canvas, t);
                }

            } else
            if (obj == CoordinateSystem.b)
            {
                if (m != null)
                {
                    Path path = new Path();
                    float f1 = Math.min(t.width(), t.height());
                    path.addCircle(t.centerX(), t.centerY(), 0.5F * f1, android.graphics.Path.Direction.CW);
                    canvas.save(2);
                    canvas.clipPath(path);
                    m.setBounds(t);
                    m.draw(canvas);
                    canvas.restore();
                }
                int k1 = 0;
                while (k1 < l2) 
                {
                    ChartAxis chartaxis2 = (ChartAxis)chartcollection.get(k1);
                    if (chartaxis2.e())
                    {
                        if (chartaxis2 == i)
                        {
                            chartaxis2.c(canvas, t);
                        } else
                        {
                            chartaxis2.d(canvas, t);
                        }
                    }
                    k1++;
                }
            }
            canvas.save(2);
            canvas.clipRect(t);
            n.clear();
            int i3 = f.size();
            for (int l1 = 0; l1 < i3; l1++)
            {
                m m1 = com.artfulbits.aiCharts.Base.m.a(canvas, (ChartSeries)f.get(l1), t);
                m1.a();
                n.add(m1);
            }

            canvas.restore();
            int i2;
            if (obj == CoordinateSystem.a)
            {
                int j2 = 0;
                do
                {
                    i2 = ((flag) ? 1 : 0);
                    if (j2 >= l2)
                    {
                        break;
                    }
                    obj = (ChartAxis)chartcollection.get(j2);
                    if (((ChartAxis) (obj)).C())
                    {
                        ((ChartAxis) (obj)).a(canvas);
                    }
                    j2++;
                } while (true);
            } else
            {
                i2 = ((flag) ? 1 : 0);
                if (obj == CoordinateSystem.b)
                {
                    int k2 = 0;
                    do
                    {
                        i2 = ((flag) ? 1 : 0);
                        if (k2 >= l2)
                        {
                            break;
                        }
                        ChartAxis chartaxis = (ChartAxis)chartcollection.get(k2);
                        if (chartaxis == i)
                        {
                            if (chartaxis.C())
                            {
                                chartaxis.b(canvas);
                            }
                        } else
                        if (chartaxis.C())
                        {
                            chartaxis.a(canvas);
                        }
                        k2++;
                    } while (true);
                }
            }
            for (; i2 < i3; i2++)
            {
                canvas = (m)n.get(i2);
                canvas.b();
                canvas.d();
            }

        }
    }

    public final void a(Point point)
    {
    }

    public final void a(Rect rect)
    {
        if (rect == null)
        {
            q = true;
        } else
        {
            c(rect);
            q = false;
        }
        if (v != null)
        {
            v.b(1);
        }
    }

    public final void a(Drawable drawable)
    {
        if (m != drawable)
        {
            m = drawable;
            b(1);
        }
    }

    public final void a(ChartAxis chartaxis)
    {
        if (i != chartaxis)
        {
            i = chartaxis;
            b(3);
        }
    }

    protected final void a(e e1)
    {
        if (v != e1)
        {
            if (v != null)
            {
                v.b(x);
            }
            v = e1;
            w = 3;
            if (v != null)
            {
                v.a(x);
            }
        }
    }

    public final void a(String s1)
    {
        if (v != null)
        {
            v.b().c(s1);
        }
        h = s1;
        b(3);
    }

    public final Drawable b()
    {
        return m;
    }

    protected final x b(String s1)
    {
        if ("area.xaxis".equalsIgnoreCase(s1))
        {
            return i;
        }
        if ("area.yaxis".equalsIgnoreCase(s1))
        {
            return j;
        } else
        {
            return null;
        }
    }

    protected final void b(int i1)
    {
        if (!u)
        {
            w = w | i1;
            if (v != null)
            {
                v.b(0);
            }
        }
    }

    public final void b(Rect rect)
    {
        if (rect != null)
        {
            rect.set(r);
        }
    }

    public final void b(Drawable drawable)
    {
        if (l != drawable)
        {
            l = drawable;
            b(1);
        }
    }

    public final void b(ChartAxis chartaxis)
    {
        if (j != chartaxis)
        {
            j = chartaxis;
            b(3);
        }
    }

    public final Drawable c()
    {
        return l;
    }

    public final void c(Rect rect)
    {
        s.set(rect);
        w = w | 1;
    }

    public final ChartAxis d()
    {
        return i;
    }

    protected final void d(Rect rect)
    {
        o();
        t.set(rect);
        q();
    }

    public final ChartAxis e()
    {
        return j;
    }

    public final Rect f()
    {
        return s;
    }

    public final Rect g()
    {
        p();
        return t;
    }

    public final List h()
    {
        return k;
    }

    public final CoordinateSystem i()
    {
        if (e == null)
        {
            return CoordinateSystem.c;
        } else
        {
            return e.H().g();
        }
    }

    protected final boolean j()
    {
        return q;
    }

    public final void k()
    {
        e = null;
        f.clear();
        o = (0.0D / 0.0D);
        p = null;
        if (v != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i1;
        int j1;
        obj = v.c();
        j1 = ((ChartNamedCollection) (obj)).size();
        i1 = 0;
_L4:
        Object obj1;
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (ChartSeries)((ChartNamedCollection) (obj)).get(i1);
        if (((ChartSeries) (obj1)).O() == this)
        {
            if (e != null)
            {
                break; /* Loop/switch isn't completed */
            }
            e = ((ChartSeries) (obj1));
            f.add(obj1);
        }
_L6:
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        if (!e.H().a(((ChartSeries) (obj1)).H()) || !((ChartSeries) (obj1)).H().a(e.H())) goto _L6; else goto _L5
_L5:
        f.add(obj1);
          goto _L6
        if (e == null || e.H().g() == CoordinateSystem.c) goto _L1; else goto _L7
_L7:
        int k1;
        obj1 = k;
        k1 = ((ChartCollection) (obj1)).size();
        i1 = 0;
_L13:
        if (i1 >= k1) goto _L1; else goto _L8
_L8:
        ChartAxis chartaxis = (ChartAxis)((ChartCollection) (obj1)).get(i1);
        if (!chartaxis.a().r()) goto _L10; else goto _L9
_L9:
        double d1;
        double d2;
        ArrayList arraylist;
        int l1;
        d1 = -1.7976931348623157E+308D;
        d2 = 1.7976931348623157E+308D;
        arraylist = f;
        l1 = arraylist.size();
        obj = null;
        j1 = 0;
_L12:
        double d5;
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        ChartSeries chartseries = (ChartSeries)arraylist.get(j1);
        double d3;
        if (chartseries.D() == chartaxis)
        {
            obj = chartseries.K();
        } else
        if (chartseries.E() == chartaxis)
        {
            obj = chartseries.L();
        }
        d5 = d1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        d3 = d1;
        if (d1 < ((r) (obj)).b)
        {
            d3 = ((r) (obj)).b;
        }
        d5 = d3;
        if (d2 <= ((r) (obj)).a)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        d2 = ((r) (obj)).a;
        d1 = d3;
_L14:
        j1++;
        if (true) goto _L12; else goto _L11
_L11:
        double d4;
        if (d2 > d1)
        {
            d5 = 0.0D;
            d4 = 1.0D;
        } else
        {
            d4 = d1;
            d5 = d2;
            if (d2 == d1)
            {
                d5 = d2 - 0.5D;
                d4 = d1 + 0.5D;
            }
        }
        chartaxis.a().f(d5, d4);
_L10:
        i1++;
          goto _L13
        d1 = d5;
          goto _L14
    }

    protected final e l()
    {
        return v;
    }

    final double m()
    {
        if (Double.isNaN(o))
        {
            double d1 = 1.7976931348623157E+308D;
            int l1 = f.size();
            for (int i1 = 0; i1 < l1; i1++)
            {
                List list = ((ChartSeries)f.get(i1)).I();
                int i2 = list.size();
                int k1 = 0;
                j j1 = null;
                while (k1 < i2) 
                {
                    j j2 = (j)list.get(k1);
                    double d2 = d1;
                    if (j1 != null)
                    {
                        d2 = d1;
                        if (j1.b != j2.b)
                        {
                            d2 = Math.min(j2.b - j1.b, d1);
                        }
                    }
                    k1++;
                    j1 = j2;
                    d1 = d2;
                }
            }

            o = d1;
        }
        return o;
    }

    final List n()
    {
        if (p == null)
        {
            p = new ArrayList();
            Iterator iterator = f.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (ChartSeries)iterator.next();
                if (((ChartSeries) (obj)).H().a())
                {
                    obj = new a(((ChartSeries) (obj)));
                    if (!p.contains(obj))
                    {
                        p.add(obj);
                    }
                }
            } while (true);
        }
        return p;
    }

    protected final void o()
    {
        if ((w & 2) == 2)
        {
            k();
            w = w ^ 2;
        }
    }

    protected final void p()
    {
        o();
        u = true;
        if ((w & 1) == 1)
        {
            if (e != null)
            {
                Rect rect = s;
                if (l != null)
                {
                    rect = new Rect();
                    l.getPadding(rect);
                    rect.left = s.left + rect.left;
                    rect.top = s.top + rect.top;
                    rect.right = s.right - rect.right;
                    rect.bottom = s.bottom - rect.bottom;
                }
                b(rect.left + r.left, rect.top + r.top, rect.right - r.right, rect.bottom - r.bottom);
                q();
            }
            w = w ^ 1;
        }
        u = false;
    }
}
