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

public class h extends n
{

    public h()
    {
    }

    protected ValueGoal a(e e1)
    {
        return e1.h;
    }

    protected String a(String s)
    {
        String s1 = null;
        a a1;
        try
        {
            a1 = FitBitApplication.a().e();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s1 = a1.a(0x7f0b000b, s, al.j());
        return s1;
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f0201e9, 0x7f02020f), new o.a(this, 0x7f0201ea, 0x7f020212), new o.a(this, 0x7f0201e8, 0x7f020211), new o.a(this, 0x7f0201e5, 0x7f020210)
        });
    }

    protected String b()
    {
        return i().getString(0x7f0802f4);
    }

    protected int c()
    {
        return 0x7f0201e6;
    }

    protected int d()
    {
        return 0x7f02020e;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.c;
    }

    public CharSequence f()
    {
        return bh.b(i(), 0x7f0802f3);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL;
    }

    protected double h()
    {
        double d2 = c.c();
        double d1 = d2;
        if (d2 == -1D)
        {
            d1 = a.c().doubleValue();
        }
        return d1;
    }
}
