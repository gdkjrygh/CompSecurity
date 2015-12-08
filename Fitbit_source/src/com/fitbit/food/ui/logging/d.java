// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.h;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.food.ui.logging:
//            FoodLogSaveModel

public final class d
{

    private static final double a = 999999D;
    private double b;
    private h c;
    private List d;
    private double e;
    private boolean f;
    private double g;
    private double h;
    private double i;
    private double j;

    public d()
    {
        g = 0.0D;
        h = 0.0D;
        i = 0.0D;
        j = 0.0D;
    }

    private h a(String s)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (s.equals(h1.a()))
            {
                return h1;
            }
        }

        return null;
    }

    public double a()
    {
        return b;
    }

    public void a(double d1)
    {
        b = d1;
    }

    public void a(FoodItem fooditem)
    {
        if (c == null)
        {
            return;
        }
        if (f)
        {
            c(r.a().a(b, c, fooditem.k()));
            e(r.a().a(b, c, fooditem.m()));
            d(r.a().a(b, c, fooditem.l()));
            b(r.a().a(b, c, j));
            return;
        } else
        {
            b(r.a().a(b, c, fooditem.c().doubleValue()));
            return;
        }
    }

    public void a(FoodLogEntry foodlogentry)
    {
        if (foodlogentry != null)
        {
            FoodItem fooditem = foodlogentry.getFoodItem();
            a(foodlogentry.getAmount());
            a(fooditem.b());
            a(a(foodlogentry.getUnitName()));
            b(foodlogentry.getCalories());
            a(fooditem.i());
            if (f)
            {
                c(fooditem.k());
                d(fooditem.l());
                e(fooditem.m());
                if (c != null)
                {
                    f(r.a().b(b, c, foodlogentry.getCalories()));
                    return;
                }
            }
        }
    }

    public void a(h h1)
    {
        c = h1;
    }

    public void a(FoodLogSaveModel foodlogsavemodel)
    {
        if (foodlogsavemodel != null)
        {
            a(foodlogsavemodel.servingSize);
            a(a(foodlogsavemodel.servingUnit));
            f(foodlogsavemodel.estimateCalories);
        }
    }

    public void a(List list)
    {
        d = list;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public List b()
    {
        return d;
    }

    public void b(double d1)
    {
        e = d1;
    }

    public h c()
    {
        return c;
    }

    public void c(double d1)
    {
        g = d1;
    }

    public double d()
    {
        return e;
    }

    public void d(double d1)
    {
        h = d1;
    }

    public void e()
    {
        while (c == null || !f) 
        {
            return;
        }
        f(r.a().b(b, c, e));
    }

    public void e(double d1)
    {
        i = d1;
    }

    public void f(double d1)
    {
        j = d1;
    }

    public boolean f()
    {
        return Math.abs(b) >= 0.0001D && Math.abs(b) <= 999999D;
    }

    public double g()
    {
        return g;
    }

    public double h()
    {
        return h;
    }

    public double i()
    {
        return i;
    }

    public boolean j()
    {
        return f;
    }

    public double k()
    {
        return j;
    }
}
