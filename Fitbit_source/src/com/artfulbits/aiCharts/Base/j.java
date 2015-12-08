// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            k, ChartSeries, q, l, 
//            i, z, ChartPointDeclaration, e

public final class j extends k
{

    protected static final Comparator a = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (j)obj;
            obj1 = (j)obj1;
            if (((j) (obj)).b < ((j) (obj1)).b)
            {
                return -1;
            }
            return ((j) (obj)).b <= ((j) (obj1)).b ? 0 : 1;
        }

    };
    double b;
    private double e[];
    private ChartSeries f;
    private String g;

    public transient j(double d1, double ad[])
    {
        b = (0.0D / 0.0D);
        e = null;
        f = null;
        g = null;
        b = d1;
        e = ad;
    }

    public j(j j1)
    {
        super(j1);
        b = (0.0D / 0.0D);
        e = null;
        f = null;
        g = null;
        g = j1.g;
        b = j1.b;
        e = (double[])j1.e.clone();
    }

    public final double a()
    {
        return b;
    }

    public final double a(int i1)
    {
        return e[i1];
    }

    public final void a(double d1)
    {
        if (b != d1)
        {
            b = d1;
            if (f != null)
            {
                f.a(this, this);
            }
        }
    }

    public final void a(double d1, double d2)
    {
        b = d1;
        if (e.length == 1)
        {
            e[0] = d2;
        } else
        {
            e = (new double[] {
                d2
            });
        }
        if (f != null)
        {
            f.a(this, this);
        }
    }

    protected final void a(int i1, Object obj, Object obj1)
    {
        if (f != null)
        {
            f.a(i1, obj, obj1);
        }
        super.a(i1, obj, obj1);
    }

    protected final void a(ChartSeries chartseries)
    {
        f = chartseries;
        a(((k) (chartseries)));
    }

    public final void a(String s)
    {
        g = s;
    }

    public final transient void a(double ad[])
    {
        if (!Arrays.equals(e, ad))
        {
            e = ad;
            a(1, this, this);
        }
    }

    public final void b(double d1)
    {
        if (e.length == 1)
        {
            e[0] = d1;
        } else
        {
            e = (new double[] {
                d1
            });
        }
        a(1, this, this);
    }

    public final double[] b()
    {
        return e;
    }

    public final ChartSeries c()
    {
        return f;
    }

    public final String d()
    {
        return g;
    }

    protected final Integer e()
    {
        Integer integer1 = super.e();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = integer1;
            if (f.H().f())
            {
                integer = Integer.valueOf(f.N().a(f.F().a(this)));
            }
        }
        return integer;
    }

    public final String f()
    {
        String s = x();
        Object obj = z();
        if (obj != null)
        {
            obj = ((z) (obj)).a(this);
        } else
        {
            obj = s;
            if (s == null)
            {
                int i1 = f.G().b;
                return Double.toString(z.a(e[i1]));
            }
        }
        return ((String) (obj));
    }

    protected final e l()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.l();
        }
    }

    public final String toString()
    {
        return f();
    }

}
