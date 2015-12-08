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

public class b extends n
{

    public b()
    {
    }

    protected ValueGoal a(e e1)
    {
        return e1.f;
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
        s1 = a1.a(0x7f0b0002, s, al.j());
        return s1;
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f020110, 0x7f02020f), new o.a(this, 0x7f020111, 0x7f020212), new o.a(this, 0x7f02010f, 0x7f020211), new o.a(this, 0x7f020108, 0x7f020210)
        });
    }

    protected String b()
    {
        return i().getString(0x7f0802c1);
    }

    protected int c()
    {
        return 0x7f02010c;
    }

    protected int d()
    {
        return 0x7f02020a;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.a;
    }

    public CharSequence f()
    {
        return bh.b(i(), 0x7f0802bf);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL;
    }

    protected double h()
    {
        if (c.b() == -1)
        {
            return a.c().doubleValue();
        } else
        {
            return (double)c.b();
        }
    }
}
