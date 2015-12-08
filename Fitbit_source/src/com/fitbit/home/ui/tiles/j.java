// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import com.fitbit.data.domain.ValueGoal;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            o, e

public abstract class j extends com.fitbit.home.ui.tiles.o
{

    private static final String b = "GoalTile";
    protected ValueGoal a;

    public j()
    {
    }

    private boolean l()
    {
        boolean flag;
label0:
        {
label1:
            {
                boolean flag1 = false;
                ValueGoal valuegoal;
                if (u == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
                valuegoal = a(u);
                if (valuegoal != null && valuegoal.s() != null)
                {
                    flag = flag1;
                    if (valuegoal.r() != null)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            return flag;
        }
        return flag;
    }

    protected boolean N_()
    {
        return !ServerGateway.a().d() && l() && !o.i(v);
    }

    public void O_()
    {
        if (N_())
        {
            o();
            return;
        }
        if (a != null)
        {
            try
            {
                a = (ValueGoal)a.clone();
                a.a(Double.valueOf(0.0D));
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                a = null;
            }
        }
        R_();
    }

    protected abstract ValueGoal a(e e);

    public void b(e e)
    {
        ValueGoal valuegoal = a(e);
        if (valuegoal == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        try
        {
            a = (ValueGoal)valuegoal.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            com.fitbit.e.a.e("GoalTile", "Exception Cloning data for goalData", clonenotsupportedexception, new Object[0]);
            a = valuegoal;
        }
        super.b(e);
        return;
        a = null;
        break MISSING_BLOCK_LABEL_21;
    }

    protected abstract com.fitbit.data.domain.Goal.GoalType g();

    protected double j()
    {
        return ValueGoal.a(a);
    }

    protected double k()
    {
        return ValueGoal.b(a);
    }
}
