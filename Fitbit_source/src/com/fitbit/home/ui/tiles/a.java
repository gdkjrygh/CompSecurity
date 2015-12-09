// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.util.al;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            j, e

public class a extends j
{

    public a()
    {
    }

    protected ValueGoal a(e e1)
    {
        return e1.i;
    }

    protected String a(String s)
    {
        String s1 = null;
        com.a.a.a.a a1;
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
        s1 = a1.a(0x7f0b0000, s, al.j());
        return s1;
    }

    protected o.a[] a()
    {
        return (new o.a[] {
            new o.a(this, 0x7f020040, 0x7f02020f), new o.a(this, 0x7f020041, 0x7f020212), new o.a(this, 0x7f02003f, 0x7f020211), new o.a(this, 0x7f02003d, 0x7f020210)
        });
    }

    protected String b()
    {
        return i().getString(0x7f0802a2);
    }

    protected int c()
    {
        return 0x7f02003e;
    }

    protected int d()
    {
        return 0x7f020209;
    }

    protected com.fitbit.savedstate.UISavedState.AnimatedGoalType e()
    {
        return com.fitbit.savedstate.UISavedState.AnimatedGoalType.e;
    }

    public CharSequence f()
    {
        return i().getText(0x7f080032);
    }

    protected com.fitbit.data.domain.Goal.GoalType g()
    {
        return com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL;
    }
}
