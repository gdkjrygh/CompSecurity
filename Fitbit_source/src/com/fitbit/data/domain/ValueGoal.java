// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Goal

public abstract class ValueGoal extends Goal
{

    public ValueGoal()
    {
    }

    public static double a(ValueGoal valuegoal)
    {
        if (valuegoal != null)
        {
            return valuegoal.p().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public static double b(ValueGoal valuegoal)
    {
        if (valuegoal != null)
        {
            return valuegoal.c().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public abstract TimeSeriesObject.TimeSeriesResourceType a();

    public boolean b(Double double1)
    {
        if (double1 != null || p() != null)
        {
            if (double1 != null && p() != null)
            {
                if (double1.intValue() != p().intValue())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Double c()
    {
        Double double1 = (Double)super.d();
        double d1;
        if (double1 != null)
        {
            d1 = double1.doubleValue();
        } else
        {
            d1 = 0.0D;
        }
        return Double.valueOf(d1);
    }

    public Object d()
    {
        return c();
    }

    public Object j()
    {
        return p();
    }

    public Object k()
    {
        return q();
    }

    public Double p()
    {
        Double double1 = (Double)super.j();
        double d1;
        if (double1 != null)
        {
            d1 = double1.doubleValue();
        } else
        {
            d1 = 0.0D;
        }
        return Double.valueOf(d1);
    }

    public Double q()
    {
        Double double1 = (Double)super.k();
        double d1;
        if (double1 != null)
        {
            d1 = double1.doubleValue();
        } else
        {
            d1 = 0.0D;
        }
        return Double.valueOf(d1);
    }

    public Double r()
    {
        return (Double)super.d();
    }

    public Double s()
    {
        return (Double)super.j();
    }
}
