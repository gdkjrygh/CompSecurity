// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.r;
import com.fitbit.water.Water;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            j, e

public class t extends j
{

    private static Water b;
    private Water c;
    private com.fitbit.data.domain.WaterLogEntry.WaterUnits z;

    public t()
    {
    }

    protected boolean N_()
    {
        return false;
    }

    public void O_()
    {
        if (N_())
        {
            o();
            return;
        }
        if (c != null)
        {
            c = null;
        }
        R_();
    }

    protected ValueGoal a(e e1)
    {
        return e1.j;
    }

    protected String a(String s)
    {
        return z.getQuantityDisplayName(s);
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f0203c6, 0x7f02020f), new o.a(this, 0x7f0203c7, 0x7f020212), new o.a(this, 0x7f0203c5, 0x7f020211), new o.a(this, 0x7f0203c3, 0x7f020210)
        });
    }

    protected String b()
    {
        return i().getString(0x7f080377);
    }

    public void b(e e1)
    {
        c = e1.o;
        com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits;
        if (e1 != null)
        {
            waterunits = r.e();
        } else
        {
            waterunits = com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML;
        }
        z = waterunits;
        super.b(e1);
    }

    protected int c()
    {
        return 0x7f0203c4;
    }

    protected int d()
    {
        return 0x7f020214;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.f;
    }

    public CharSequence f()
    {
        return i().getText(0x7f080561);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.WATER_GOAL;
    }

    protected double j()
    {
        if (z == null)
        {
            com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits;
            if (u != null)
            {
                waterunits = r.e();
            } else
            {
                waterunits = com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML;
            }
            z = waterunits;
        }
        if (a != null)
        {
            b = new Water(a.p().doubleValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
        }
        if (a == null)
        {
            return super.j();
        } else
        {
            return b.a(z).b();
        }
    }

    protected double k()
    {
        if (z == null)
        {
            com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits;
            if (u != null)
            {
                waterunits = r.e();
            } else
            {
                waterunits = com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML;
            }
            z = waterunits;
        }
        if (c == null)
        {
            return 0.0D;
        } else
        {
            return c.a(z).b();
        }
    }

    static 
    {
        b = new Water(64D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ);
    }
}
