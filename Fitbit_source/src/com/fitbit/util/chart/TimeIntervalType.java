// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import com.fitbit.util.format.e;

public final class TimeIntervalType extends Enum
{

    public static final TimeIntervalType a;
    public static final TimeIntervalType b;
    public static final TimeIntervalType c;
    public static final TimeIntervalType d;
    public static final TimeIntervalType e;
    public static final TimeIntervalType f;
    public static final TimeIntervalType g;
    private static final TimeIntervalType h[];

    private TimeIntervalType(String s, int i)
    {
        super(s, i);
    }

    public static TimeIntervalType a(long l)
    {
        if (l <= 1000L)
        {
            return a;
        }
        if (l <= 60000L)
        {
            return b;
        }
        if (l <= 0x36ee80L)
        {
            return c;
        }
        if (l <= 0x5265c00L)
        {
            return d;
        }
        if (l <= 0x240c8400L)
        {
            return e;
        }
        if (l <= 0x9a7ec800L)
        {
            return f;
        } else
        {
            return g;
        }
    }

    public static TimeIntervalType valueOf(String s)
    {
        return (TimeIntervalType)Enum.valueOf(com/fitbit/util/chart/TimeIntervalType, s);
    }

    public static TimeIntervalType[] values()
    {
        return (TimeIntervalType[])h.clone();
    }

    public String a(Context context, Filter.Type type, long l)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.b[ordinal()])
        {
        default:
            switch (_cls1.a[type.ordinal()])
            {
            default:
                return com.fitbit.util.format.e.d(context, l);

            case 8: // '\b'
                return com.fitbit.util.format.e.c(context, l);
            }

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return com.fitbit.util.format.e.b(context, l);

        case 5: // '\005'
            switch (_cls1.a[type.ordinal()])
            {
            default:
                return com.fitbit.util.format.e.f(context, l);

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                return com.fitbit.util.format.e.c(l);

            case 4: // '\004'
            case 5: // '\005'
                return com.fitbit.util.format.e.e(context, l);
            }

        case 6: // '\006'
            switch (_cls1.a[type.ordinal()])
            {
            default:
                return com.fitbit.util.format.e.d(context, l);

            case 6: // '\006'
            case 7: // '\007'
                return com.fitbit.util.format.e.c(context, l);
            }
        }
    }

    static 
    {
        a = new TimeIntervalType("SECOND", 0);
        b = new TimeIntervalType("MINUTE", 1);
        c = new TimeIntervalType("HOUR", 2);
        d = new TimeIntervalType("DAY", 3);
        e = new TimeIntervalType("WEEK", 4);
        f = new TimeIntervalType("MONTH", 5);
        g = new TimeIntervalType("YEAR", 6);
        h = (new TimeIntervalType[] {
            a, b, c, d, e, f, g
        });
    }
}
