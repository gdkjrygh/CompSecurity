// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.widget.Spinner;
import com.fitbit.data.domain.Measurable;
import com.fitbit.data.domain.m;
import com.fitbit.util.format.e;
import java.text.DecimalFormat;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

public abstract class e
{

    protected Measurable b;
    protected Measurable c;
    protected Measurable d;
    final MeasurablePicker e;

    private double a()
    {
        if (e())
        {
            return (double)(Math.round(d.a(c.a()).b()) / (long)((int)MeasurablePicker.a(e) + 1));
        } else
        {
            return d.a(b.a()).b();
        }
    }

    private String a(double d1, String s)
    {
        return String.format(e.getContext().getString(0x7f080220), new Object[] {
            com.fitbit.util.format.e.a(d1, MeasurablePicker.h(e)), s
        });
    }

    private String a(double d1, String s, boolean flag)
    {
        if (MeasurablePicker.d(e) && b.b() == -1D)
        {
            return s;
        }
        if (!flag)
        {
            return a(d1, s);
        } else
        {
            return a(d1);
        }
    }

    private String a(Measurable measurable, boolean flag)
    {
        return a(measurable.b(), ((m)measurable.a()).getShortDisplayName(), flag);
    }

    private boolean a(Measurable measurable, double d1)
    {
        return a(measurable, false).equals(a(d1, ((m)measurable.a()).getShortDisplayName(), false));
    }

    private double h()
    {
        if (e())
        {
            return (double)(Math.round(d.a(c.a()).b()) % (long)((int)MeasurablePicker.a(e) + 1));
        } else
        {
            return 0.0D;
        }
    }

    protected String a(double d1)
    {
        DecimalFormat decimalformat;
        if (e())
        {
            decimalformat = new DecimalFormat("#");
        } else
        {
            decimalformat = new DecimalFormat();
            decimalformat.setMaximumFractionDigits(MeasurablePicker.h(e));
        }
        return decimalformat.format(d1);
    }

    public String a(boolean flag)
    {
        Measurable measurable = b;
        if (flag || e.j.getVisibility() == 0 && !e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(measurable, flag);
    }

    protected void a(Measurable measurable)
    {
        d = measurable;
    }

    protected void a(Measurable measurable, Measurable measurable1)
    {
        b = measurable;
        c = measurable1;
        b();
    }

    public String b(boolean flag)
    {
        return a(c, flag);
    }

    protected void b()
    {
        b.a(a());
        if (e())
        {
            c.a(h());
        }
        e.c(MeasurablePicker.f(e));
    }

    public void b(double d1)
    {
        b.a(d1);
        c();
    }

    public void b(Measurable measurable)
    {
        measurable = measurable.a(d.a());
        d.a(measurable.b());
        b();
    }

    protected void c()
    {
        double d2 = b.a(d.a()).b();
        double d1;
        boolean flag;
        boolean flag1;
        if (b.b() == a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        d1 = d2;
        if (e())
        {
            d1 = d2 + c.a(d.a()).b();
            flag1 = flag & a(c, h());
        }
        if (!flag1)
        {
            d.a(d1);
            MeasurablePicker.g(e);
        }
    }

    public void c(double d1)
    {
        c.a(d1);
        c();
    }

    protected Measurable d()
    {
        if (d == null || b == null)
        {
            return null;
        } else
        {
            return d.a(b.a());
        }
    }

    public boolean e()
    {
        return c != null;
    }

    public double f()
    {
        return b.b();
    }

    public double g()
    {
        return c.b();
    }

    public (MeasurablePicker measurablepicker)
    {
        e = measurablepicker;
        super();
    }
}
