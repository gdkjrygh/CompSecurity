// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            g, t, ChartLegend, e, 
//            ChartNamedCollection, ChartSeries, h, ChartCollection, 
//            l

public abstract class com.artfulbits.aiCharts.Base.f
{
    public static final class a extends com.artfulbits.aiCharts.Base.f
    {

        final boolean a(int i)
        {
            return (i & 0x200) == 512;
        }

        protected final List b()
        {
            return a.l().f();
        }

        public a()
        {
            this(((t) (h.a)));
        }

        public a(t t1)
        {
            super(t1);
        }
    }

    public static final class b extends com.artfulbits.aiCharts.Base.f
    {

        protected final ChartCollection d;

        protected final List b()
        {
            return d;
        }

        public final List d()
        {
            return d;
        }

        public b()
        {
            this(null, ((t) (h.a)));
        }

        public b(Collection collection)
        {
            this(collection, ((t) (h.a)));
        }

        public b(Collection collection, t t1)
        {
            super(t1);
        /* block-local class not found */
        class _cls1 {}

            d = new ChartCollection(new _cls1());
            if (collection != null)
            {
                d.addAll(collection);
            }
        }
    }

    public static final class c extends com.artfulbits.aiCharts.Base.f
    {

        private final com.artfulbits.aiCharts.Base.f d[];

        public final List a()
        {
            c.clear();
            com.artfulbits.aiCharts.Base.f af[] = d;
            int j = af.length;
            for (int i = 0; i < j; i++)
            {
                com.artfulbits.aiCharts.Base.f f1 = af[i];
                c.addAll(f1.a());
            }

            return c;
        }

        final void a(ChartLegend chartlegend)
        {
            a(chartlegend);
            com.artfulbits.aiCharts.Base.f af[] = d;
            int j = af.length;
            for (int i = 0; i < j; i++)
            {
                af[i].a(chartlegend);
            }

        }

        public transient c(com.artfulbits.aiCharts.Base.f af[])
        {
            super(null);
            d = af;
        }
    }

    public static final class d extends com.artfulbits.aiCharts.Base.f
    {

        final boolean a(int i)
        {
            return (i & 0x20) == 32 || (i & 0x10) == 16;
        }

        protected final List b()
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = c().iterator(); iterator.hasNext(); arraylist.addAll(((ChartSeries)iterator.next()).F().a)) { }
            return arraylist;
        }

        public d()
        {
            this(((t) (h.a)));
        }

        public d(t t1)
        {
            super(t1);
        }
    }

    public static final class e extends com.artfulbits.aiCharts.Base.f
    {

        final boolean a(int i)
        {
            return (i & 0x10) == 16;
        }

        protected final List b()
        {
            return c();
        }

        public e()
        {
            this(((t) (h.a)));
        }

        public e(t t1)
        {
            super(t1);
        }
    }

    public static final class f extends com.artfulbits.aiCharts.Base.f
    {

        final boolean a(int i)
        {
            return (i & 0x20) == 32 || (i & 0x10) == 16;
        }

        protected final List b()
        {
            ArrayList arraylist1 = c();
            ArrayList arraylist;
            if (arraylist1.size() == 1)
            {
                arraylist = ((ChartSeries)arraylist1.get(0)).F().a;
            } else
            {
                arraylist = arraylist1;
                if (arraylist1.size() <= 0)
                {
                    return b();
                }
            }
            return arraylist;
        }

        public f()
        {
            this(((t) (h.a)));
        }

        public f(t t1)
        {
            super(t1);
        }
    }


    protected ChartLegend a;
    protected final t b;
    protected final Vector c = new Vector();

    protected com.artfulbits.aiCharts.Base.f(t t1)
    {
        b = t1;
    }

    protected List a()
    {
        List list = b();
        if (list != null)
        {
            int j = list.size();
            c.setSize(j);
            for (int i = 0; i < j; i++)
            {
                g g1 = (g)c.get(i);
                g1 = (g)b.a(list.get(i), g1);
                g1.a(a);
                c.set(i, g1);
            }

        }
        return c;
    }

    void a(ChartLegend chartlegend)
    {
        if (a != null && chartlegend != null && a != chartlegend)
        {
            throw new InvalidParameterException("Legend is already set.");
        } else
        {
            a = chartlegend;
            c.clear();
            return;
        }
    }

    boolean a(int i)
    {
        return false;
    }

    protected List b()
    {
        return null;
    }

    protected ArrayList c()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.l().c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChartSeries chartseries = (ChartSeries)iterator.next();
            if (chartseries.P() == a)
            {
                arraylist.add(chartseries);
            }
        } while (true);
        return arraylist;
    }
}
