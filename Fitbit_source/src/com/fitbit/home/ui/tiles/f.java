// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            n, e

public class f extends n
{

    public f()
    {
    }

    protected ValueGoal a(com.fitbit.home.ui.tiles.e e1)
    {
        return e1.e;
    }

    protected String a(Double double1)
    {
        return com.fitbit.util.format.e.b(double1.doubleValue());
    }

    protected String a(String s)
    {
        return l().getQuantityDisplayName(a(Double.valueOf(k())));
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f0201a6, 0x7f02020f), new o.a(this, 0x7f0201a7, 0x7f020212), new o.a(this, 0x7f0201a5, 0x7f020211), new o.a(this, 0x7f0201a2, 0x7f020210)
        });
    }

    protected CharSequence b(Double double1)
    {
        if (Double.isNaN(double1.doubleValue()))
        {
            return i().getString(0x7f080426);
        } else
        {
            return com.fitbit.util.format.e.b(double1.doubleValue());
        }
    }

    protected String b()
    {
        String s;
        if (com.fitbit.data.domain.Length.LengthUnits.MILES.equals(l()))
        {
            s = i().getString(0x7f0803d5);
        } else
        {
            s = i().getString(0x7f0802a1);
        }
        return i().getString(0x7f0802e1, new Object[] {
            s
        });
    }

    protected int c()
    {
        return 0x7f0201a3;
    }

    protected int d()
    {
        return 0x7f02020b;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.b;
    }

    public CharSequence f()
    {
        return i().getText(0x7f0802e0);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL;
    }

    protected double h()
    {
        double d2 = c.d();
        double d1 = d2;
        if (d2 == -1D)
        {
            d1 = a.c().doubleValue();
        }
        return (new Length(d1, com.fitbit.data.domain.Length.LengthUnits.MM)).a(com.fitbit.data.domain.Length.LengthUnits.KM).b();
    }

    protected double j()
    {
        return l().convert(ValueGoal.a(a), com.fitbit.data.domain.Length.LengthUnits.KM);
    }

    protected double k()
    {
        return l().convert(ValueGoal.b(a), com.fitbit.data.domain.Length.LengthUnits.KM);
    }

    protected com.fitbit.data.domain.Length.LengthUnits l()
    {
        if (u != null && u.c != null)
        {
            return u.c.t();
        } else
        {
            return com.fitbit.data.domain.Length.LengthUnits.KM;
        }
    }
}
