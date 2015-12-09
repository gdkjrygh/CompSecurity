// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import java.util.Date;

// Referenced classes of package com.fitbit.data.domain:
//            Length

public class p
    implements Cloneable
{

    protected double calories;
    protected Date date;
    protected Length distance;
    protected int steps;

    public p(int i, double d, Length length, Date date1)
    {
        steps = i;
        calories = d;
        distance = length;
        date = date1;
    }

    public p clone()
    {
        return new p(steps, calories, distance, new Date(date.getTime()));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public double getCalories()
    {
        return calories;
    }

    public Date getDate()
    {
        return date;
    }

    public Length getDistance()
    {
        return distance;
    }

    public int getSteps()
    {
        return steps;
    }
}
