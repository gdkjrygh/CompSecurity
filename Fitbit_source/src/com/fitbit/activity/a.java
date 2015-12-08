// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity;

import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLevel;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class a
{

    private a()
    {
    }

    public static double a(double d, Date date)
    {
        com.fitbit.data.domain.Profile profile = an.a().b();
        return Math.ceil((ActivityBusinessLogic.a().a(profile, date) / 24D / 60D) * d);
    }

    public static ActivityLevel a(ActivityItem activityitem, double d)
    {
        if (activityitem.c() && !activityitem.d().isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((ActivityLevel) (obj1));
_L2:
        double d3;
        Object obj;
        Iterator iterator;
        d3 = 1.7976931348623157E+308D;
        obj = (ActivityLevel)activityitem.d().get(0);
        double d1 = d3;
        if (((ActivityLevel) (obj)).f() != null)
        {
            d1 = d3;
            if (((ActivityLevel) (obj)).f().doubleValue() > 0.0D)
            {
                d1 = Math.abs(((ActivityLevel) (obj)).f().doubleValue() - d);
            }
        }
        d3 = d1;
        if (((ActivityLevel) (obj)).g() != null)
        {
            d3 = d1;
            if (((ActivityLevel) (obj)).g().doubleValue() > 0.0D)
            {
                d3 = d1;
                if (d1 > Math.abs(((ActivityLevel) (obj)).g().doubleValue() - d))
                {
                    d3 = Math.abs(((ActivityLevel) (obj)).g().doubleValue() - d);
                }
            }
        }
        iterator = activityitem.d().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_378;
        }
        activityitem = (ActivityLevel)iterator.next();
        if (activityitem.f() == null || activityitem.f().doubleValue() <= 0.0D || activityitem.f().doubleValue() > d || activityitem.g() == null || activityitem.g().doubleValue() <= 0.0D)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = activityitem;
        if (activityitem.g().doubleValue() >= d) goto _L4; else goto _L3
_L3:
        Object obj2 = obj;
        double d2 = d3;
        if (activityitem.f() != null)
        {
            obj2 = obj;
            d2 = d3;
            if (activityitem.f().doubleValue() > 0.0D)
            {
                obj2 = obj;
                d2 = d3;
                if (d3 > Math.abs(activityitem.f().doubleValue() - d))
                {
                    d2 = Math.abs(activityitem.f().doubleValue() - d);
                    obj2 = activityitem;
                }
            }
        }
        if (activityitem.g() != null && activityitem.g().doubleValue() > 0.0D && d2 > Math.abs(activityitem.g().doubleValue() - d))
        {
            d2 = Math.abs(activityitem.g().doubleValue() - d);
        } else
        {
            activityitem = ((ActivityItem) (obj2));
        }
        obj = activityitem;
        d3 = d2;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        return ((ActivityLevel) (obj));
    }
}
