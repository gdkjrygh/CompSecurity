// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.al;
import com.fitbit.util.bh;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            n, e

public class s extends n
{

    public s()
    {
    }

    protected ValueGoal a(e e1)
    {
        return e1.g;
    }

    protected String a(String s1)
    {
        String s2 = null;
        a a1;
        try
        {
            a1 = FitBitApplication.a().e();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return "";
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s2 = a1.a(0x7f0b001d, s1, al.j());
        return s2;
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f020379, 0x7f02020f), new o.a(this, 0x7f02037a, 0x7f020212), new o.a(this, 0x7f020378, 0x7f020211), new o.a(this, 0x7f020375, 0x7f020210)
        });
    }

    protected String b()
    {
        return i().getString(0x7f080356);
    }

    protected int c()
    {
        return 0x7f020376;
    }

    protected int d()
    {
        return 0x7f020213;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.d;
    }

    public CharSequence f()
    {
        return bh.b(i(), 0x7f080355);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL;
    }

    protected double h()
    {
        double d1;
label0:
        {
            double d2 = 0.0D;
            d1 = d2;
            if (c != null)
            {
                d1 = c.a();
                if (d1 != -1D)
                {
                    break label0;
                }
                d1 = d2;
                if (a != null)
                {
                    d1 = a.c().doubleValue();
                }
            }
            return d1;
        }
        return d1;
    }
}
