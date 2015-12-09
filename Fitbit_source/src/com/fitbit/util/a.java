// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.r;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.savedstate.l;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.util.format.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.util:
//            o, an, al

public class a
{

    public a()
    {
    }

    public static double a(double d)
    {
        return a(d, com.fitbit.data.domain.Length.LengthUnits.MM, r.b());
    }

    public static double a(double d, com.fitbit.data.domain.Length.LengthUnits lengthunits, com.fitbit.data.domain.Length.LengthUnits lengthunits1)
    {
        return (new Length(d, lengthunits)).a(lengthunits1).b();
    }

    public static double a(ActivityType activitytype)
    {
        return a(activitytype.a());
    }

    public static double a(com.fitbit.data.domain.Goal.GoalType goaltype)
    {
        double d1 = t.a().a(goaltype, o.b()).p().doubleValue();
        double d = d1;
        if (com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL.equals(goaltype))
        {
            d = b(d1);
        }
        return d;
    }

    public static double a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        return a(l.h(), timeseriesresourcetype);
    }

    public static double a(LiveDataPacket livedatapacket, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        if (livedatapacket == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[Timeframe.values().length];
                try
                {
                    b[Timeframe.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[Timeframe.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[timeseriesresourcetype.ordinal()];
        JVM INSTR tableswitch 1 8: default 60
    //                   1 64
    //                   2 64
    //                   3 70
    //                   4 70
    //                   5 78
    //                   6 78
    //                   7 83
    //                   8 83;
           goto _L2 _L3 _L3 _L4 _L4 _L5 _L5 _L6 _L6
_L2:
        return -1D;
_L3:
        return (double)livedatapacket.b();
_L4:
        return a(livedatapacket.d());
_L5:
        return livedatapacket.c();
_L6:
        return (double)livedatapacket.a();
    }

    public static final double a(Timeframe timeframe, double d)
    {
        switch (_cls1.b[timeframe.ordinal()])
        {
        default:
            return d;

        case 1: // '\001'
            return d * 7D;

        case 2: // '\002'
            return d * 30D;
        }
    }

    public static String a(Context context, ActivityType activitytype, Double double1)
    {
        context = new StringBuilder();
        context.append(e.b(double1.doubleValue()));
        context.append(" ");
        context.append(a(activitytype, double1.doubleValue()));
        return context.toString();
    }

    public static String a(ActivityType activitytype, double d)
    {
        Object obj1;
        com.fitbit.data.domain.Length.LengthUnits lengthunits;
        int i;
        int j = activitytype.f();
        lengthunits = r.b();
        i = j;
        if (ActivityType.c == activitytype)
        {
            i = j;
            if (lengthunits == com.fitbit.data.domain.Length.LengthUnits.MILES)
            {
                i = 0x7f0b000d;
            }
        }
        obj1 = null;
        Object obj = FitBitApplication.a().e();
        if (obj == null) goto _L2; else goto _L1
_L1:
        d = an.a(d, 2);
        int k;
        int i1 = (int)d;
        k = i1;
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k = (int)Math.ceil(d);
        obj = ((com.a.a.a.a) (obj)).a(i, k, al.j());
        activitytype = ((ActivityType) (obj));
_L8:
        obj = activitytype;
_L4:
        return ((String) (obj));
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        notfoundexception = obj1;
        if (false) goto _L4; else goto _L3
_L3:
        notfoundexception = obj1;
        if (ActivityType.c != activitytype) goto _L4; else goto _L5
_L5:
        notfoundexception = obj1;
        if (com.fitbit.data.domain.Length.LengthUnits.KM != lengthunits) goto _L4; else goto _L6
_L6:
        return FitBitApplication.a().getString(0x7f0802a1);
_L2:
        activitytype = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(ActivityType activitytype, List list)
    {
        if (ActivityType.c.equals(activitytype))
        {
            a(list);
        }
    }

    public static void a(List list)
    {
        com.fitbit.data.domain.Length.LengthUnits lengthunits = r.b();
        TimeSeriesObject timeseriesobject;
        for (list = list.iterator(); list.hasNext(); timeseriesobject.a(a(timeseriesobject.b(), com.fitbit.data.domain.Length.LengthUnits.KM, lengthunits)))
        {
            timeseriesobject = (TimeSeriesObject)list.next();
        }

    }

    public static double b(double d)
    {
        return a(d, com.fitbit.data.domain.Length.LengthUnits.KM, r.b());
    }

    public static double b(ActivityType activitytype, double d)
    {
        double d1 = d;
        if (ActivityType.c == activitytype)
        {
            d1 = b(d);
        }
        return d1;
    }
}
