// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            v, ChartAxis, ChartAxisScale

final class w
{

    private static final DateFormat a = DateFormat.getTimeInstance(3);
    private static final DateFormat b = DateFormat.getDateInstance(3);
    private static final NumberFormat c = NumberFormat.getInstance();
    private static final FieldPosition d = new FieldPosition(0);
    private final ChartAxis e;
    private Format f;
    private boolean g;
    private boolean h;
    private double i;
    private DateFormat j;
    private NumberFormat k;
    private MessageFormat l;
    private final Date m = new Date();
    private final Object n[] = new Object[1];
    private final StringBuffer o = new StringBuffer();

    public w(ChartAxis chartaxis)
    {
        g = false;
        h = false;
        j = null;
        k = null;
        l = null;
        e = chartaxis;
    }

    public final String a(double d1)
    {
        o.setLength(0);
        if (g)
        {
            m.setTime((long)d1);
            if (j != null)
            {
                j.format(m, o, d);
            } else
            if (l != null)
            {
                n[0] = m;
                l.format(n, o, d);
            } else
            if (f != null)
            {
                f.format(m, o, d);
            } else
            if (h)
            {
                a.format(m, o, d);
            } else
            {
                b.format(m, o, d);
            }
        } else
        if (k != null)
        {
            k.format(d1, o, d);
        } else
        if (l != null)
        {
            n[0] = Double.valueOf(d1);
            l.format(n, o, d);
        } else
        if (f != null)
        {
            f.format(Double.valueOf(d1), o, d);
        } else
        {
            d1 = v.c(d1, i);
            c.format(d1, o, d);
        }
        return o.toString();
    }

    public final Format a()
    {
        return f;
    }

    public final void a(Format format)
    {
        j = null;
        k = null;
        l = null;
        if (!(format instanceof DateFormat)) goto _L2; else goto _L1
_L1:
        j = (DateFormat)format;
_L4:
        f = format;
        return;
_L2:
        if (format instanceof NumberFormat)
        {
            k = (NumberFormat)format;
        } else
        if (format instanceof MessageFormat)
        {
            l = (MessageFormat)format;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        boolean flag1 = true;
        boolean flag;
        if (e.E() == ChartAxis.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        i = e.a().i();
        if (e.a().k().Field > ChartAxisScale.IntervalType.f.Field)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

}
