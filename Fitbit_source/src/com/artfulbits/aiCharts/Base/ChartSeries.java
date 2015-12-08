// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import com.artfulbits.aiCharts.Types.x;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            k, ab, ChartPointDeclaration, l, 
//            a, q, i, e, 
//            ChartNamedCollection, ChartLegend, j, ChartAxis, 
//            r

public final class ChartSeries extends k
    implements ab
{
    static final class a extends Vector
    {

        final void a(Comparator comparator)
        {
            Arrays.sort(elementData, 0, elementCount, comparator);
        }

        final void a(List list)
        {
            elementCount = list.size();
            if (elementData.length < elementCount)
            {
                elementData = new j[elementCount];
            }
            for (int i1 = elementCount - 1; i1 >= 0; i1--)
            {
                elementData[i1] = list.get(i1);
            }

        }

        a()
        {
        }
    }

    public static final class b extends Drawable
    {

        private final k a;
        private int b;
        private int c;

        public final void draw(Canvas canvas)
        {
            ChartSeries chartseries = null;
            if (!(a instanceof j)) goto _L2; else goto _L1
_L1:
            chartseries = ((j)a).c();
_L4:
            if (chartseries != null)
            {
                chartseries.H().a(canvas, getBounds(), a);
            }
            return;
_L2:
            if (a instanceof ChartSeries)
            {
                chartseries = (ChartSeries)a;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final int getIntrinsicHeight()
        {
            return c;
        }

        public final int getIntrinsicWidth()
        {
            return b;
        }

        public final int getOpacity()
        {
            return 0;
        }

        public final void setAlpha(int i1)
        {
        }

        public final void setColorFilter(ColorFilter colorfilter)
        {
        }

        public b(k k1)
        {
            this(k1, 10, 10);
        }

        public b(k k1, int i1, int j1)
        {
            if (k1 == null)
            {
                throw new IllegalArgumentException("attributes");
            } else
            {
                a = k1;
                b = i1;
                c = j1;
                return;
            }
        }
    }


    protected ChartAxis.ValueType a;
    private String b;
    private final l e;
    private ChartPointDeclaration f;
    private q g;
    private e h;
    private String i;
    private String j;
    private ChartAxis k;
    private ChartAxis l;
    private r m;
    private r n;
    private final a o;
    private final List p;
    private boolean q;

    public ChartSeries()
    {
        this(((String) (null)));
    }

    public ChartSeries(q q1)
    {
        this(null, q1);
    }

    public ChartSeries(Class class1)
    {
        this(null, class1);
    }

    public ChartSeries(String s)
    {
        this(s, x.c());
    }

    public ChartSeries(String s, q q1)
    {
        f = ChartPointDeclaration.a;
        g = x.c();
        h = null;
        i = null;
        j = null;
        m = null;
        n = null;
        o = new a();
        p = Collections.unmodifiableList(o);
        q = true;
        a = ChartAxis.ValueType.a;
        if (q1 == null)
        {
            throw new InvalidParameterException("type");
        } else
        {
            b = s;
            e = new l(this);
            g = q1;
            return;
        }
    }

    public ChartSeries(String s, Class class1)
    {
        this(s, x.b(class1));
    }

    public final ChartAxis C()
    {
        if (l == null)
        {
            Object obj = O();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((com.artfulbits.aiCharts.Base.a) (obj)).e();
            }
            l = ((ChartAxis) (obj));
        }
        return l;
    }

    public final ChartAxis D()
    {
        if (g.e())
        {
            return C();
        } else
        {
            return b();
        }
    }

    public final ChartAxis E()
    {
        if (g.e())
        {
            return b();
        } else
        {
            return C();
        }
    }

    public final l F()
    {
        return e;
    }

    public final ChartPointDeclaration G()
    {
        return f;
    }

    public final q H()
    {
        return g;
    }

    public final List I()
    {
        return p;
    }

    public final boolean J()
    {
        return q;
    }

    protected final r K()
    {
        if (m == null)
        {
            m = g.a(this);
        }
        return m;
    }

    protected final r L()
    {
        if (n == null)
        {
            n = g.b(this);
        }
        return n;
    }

    protected final void M()
    {
        m = null;
        n = null;
        com.artfulbits.aiCharts.Base.a a1 = O();
        if (a1 != null)
        {
            a1.b(3);
        }
    }

    protected final i N()
    {
        if (h == null)
        {
            return i.a;
        } else
        {
            return h.j();
        }
    }

    protected final com.artfulbits.aiCharts.Base.a O()
    {
        if (h != null)
        {
            ChartNamedCollection chartnamedcollection = h.b();
            if (chartnamedcollection.size() > 0)
            {
                if (i == null)
                {
                    return (com.artfulbits.aiCharts.Base.a)chartnamedcollection.get(0);
                } else
                {
                    return (com.artfulbits.aiCharts.Base.a)chartnamedcollection.a(i);
                }
            }
        }
        return null;
    }

    protected final ChartLegend P()
    {
        if (h != null)
        {
            ChartNamedCollection chartnamedcollection = h.d();
            if (chartnamedcollection.size() > 0)
            {
                if (j == null)
                {
                    return (ChartLegend)chartnamedcollection.get(0);
                } else
                {
                    return (ChartLegend)chartnamedcollection.a(j);
                }
            }
        }
        return null;
    }

    public final String a()
    {
        return b;
    }

    protected final void a(int i1, Object obj, Object obj1)
    {
        super.a(i1, obj, obj1);
        M();
    }

    protected final void a(Resources resources, String s, int i1, AttributeSet attributeset)
    {
        if (!"name".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        b = attributeset.getAttributeValue(i1);
_L4:
        return;
_L2:
        if ("area".equalsIgnoreCase(s))
        {
            i = attributeset.getAttributeValue(i1);
            return;
        }
        if ("legend".equalsIgnoreCase(s))
        {
            j = attributeset.getAttributeValue(i1);
            return;
        }
        if ("type".equalsIgnoreCase(s))
        {
            a(x.a(attributeset.getAttributeValue(i1)));
            return;
        }
        if (!"random".equalsIgnoreCase(s))
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = attributeset.getAttributeIntValue(i1, 10);
        resources = new Random();
        i1 = 0;
        while (i1 < j1) 
        {
            e.a(i1, new double[] {
                (double)resources.nextInt(100)
            });
            i1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("points".equalsIgnoreCase(s))
        {
            resources = attributeset.getAttributeValue(i1).split(",", -1);
            e.a();
            for (i1 = 0; i1 < resources.length; i1++)
            {
                e.a(i1, new double[] {
                    Double.parseDouble(resources[i1])
                });
            }

            e.b();
            return;
        } else
        {
            super.a(resources, s, i1, attributeset);
            return;
        }
    }

    public final void a(ChartAxis chartaxis)
    {
        k = chartaxis;
        M();
    }

    protected final void a(e e1)
    {
        super.a(e1);
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((j)iterator.next()).a(e1)) { }
        M();
        h = e1;
        M();
    }

    protected final void a(j j1, j j2)
    {
        if (j2 != null)
        {
            o.remove(j2);
        }
        if (j1 != null)
        {
            int i1 = Collections.binarySearch(o, j1, j.a);
            a a1 = o;
            if (i1 < 0)
            {
                i1 = -i1 - 1;
            } else
            {
                i1++;
            }
            a1.add(i1, j1);
        }
        if (j1 == null && j2 == null)
        {
            o.clear();
        }
        m = null;
        n = null;
        if (h != null)
        {
            h.b(32);
        }
        M();
    }

    public final void a(q q1)
    {
        if (q1 == null)
        {
            throw new InvalidParameterException("type");
        }
        if (g != q1)
        {
            g = q1;
            M();
        }
    }

    public final void a(Class class1)
    {
        a(x.b(class1));
    }

    public final void a(String s)
    {
        if (h != null)
        {
            h.c().c(s);
        }
        b = s;
    }

    protected final void a(List list)
    {
        o.a(list);
        o.a(j.a);
        m = null;
        n = null;
        if (h != null)
        {
            h.b(32);
        }
        M();
    }

    public final void a(boolean flag)
    {
        if (q != flag)
        {
            q = flag;
            M();
        }
    }

    public final ChartAxis b()
    {
        if (k == null)
        {
            Object obj = O();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((com.artfulbits.aiCharts.Base.a) (obj)).d();
            }
            k = ((ChartAxis) (obj));
        }
        return k;
    }

    public final void b(ChartAxis chartaxis)
    {
        l = chartaxis;
        M();
    }

    public final String c()
    {
        return i;
    }

    public final String d()
    {
        return j;
    }

    protected final Integer e()
    {
        Integer integer1 = super.e();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = integer1;
            if (h != null)
            {
                try
                {
                    integer = h.j().b(h.c().indexOf(this));
                }
                catch (NullPointerException nullpointerexception)
                {
                    Log.i("ss", nullpointerexception.getMessage());
                    return integer1;
                }
            }
        }
        return integer;
    }

    public final void e(String s)
    {
        M();
        i = s;
        M();
    }

    public final void f(String s)
    {
        ChartLegend chartlegend = P();
        if (chartlegend != null)
        {
            chartlegend.n();
        }
        j = s;
        s = P();
        if (s != null)
        {
            s.n();
        }
    }

    protected final e l()
    {
        return h;
    }
}
