// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public class Duration
    implements Parcelable
{
    public static final class Unit extends Enum
    {

        public static final Unit a;
        public static final Unit b;
        public static final Unit c;
        public static final Unit d;
        private static final Unit e[];
        private final long factor;
        private final boolean leadIn;
        private final TimeUnit unit;

        static long a(Unit unit1)
        {
            return unit1.factor;
        }

        static boolean b(Unit unit1)
        {
            return unit1.leadIn;
        }

        public static Unit valueOf(String s)
        {
            return (Unit)Enum.valueOf(com/fitbit/runtrack/Duration$Unit, s);
        }

        public static Unit[] values()
        {
            return (Unit[])e.clone();
        }

        protected long a(long l)
        {
            if (factor != 0L)
            {
                return l / factor;
            } else
            {
                return unit.convert(l, TimeUnit.MILLISECONDS);
            }
        }

        protected long b(long l)
        {
            if (factor != 0L)
            {
                return factor * l;
            } else
            {
                return TimeUnit.MILLISECONDS.convert(l, unit);
            }
        }

        static 
        {
            a = new Unit("Hours", 0, 0x36ee80L, false);
            b = new Unit("Minutes", 1, 60000L, true);
            c = new Unit("Seconds", 2, TimeUnit.SECONDS, true);
            d = new Unit("Tenths", 3, 100L, false);
            e = (new Unit[] {
                a, b, c, d
            });
        }

        private Unit(String s, int i, long l, boolean flag)
        {
            super(s, i);
            factor = l;
            unit = null;
            leadIn = flag;
        }

        private Unit(String s, int i, TimeUnit timeunit, boolean flag)
        {
            super(s, i);
            factor = 0L;
            unit = timeunit;
            leadIn = flag;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Duration a(Parcel parcel)
        {
            return new Duration(parcel.readLong());
        }

        public Duration[] a(int i)
        {
            return new Duration[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    EnumMap a;
    private final long b;

    public Duration(long l)
    {
        b = l;
        a = new EnumMap(com/fitbit/runtrack/Duration$Unit);
    }

    public static Duration a(long l, long l1)
    {
        return new Duration(l1 - l);
    }

    public static Duration a(Date date, Date date1)
    {
        return a(date.getTime(), date1.getTime());
    }

    private long b(Unit unit)
    {
        if (a.containsKey(unit))
        {
            return ((Long)a.get(unit)).longValue();
        }
        long l = b;
        Unit aunit[] = Unit.values();
        int j = aunit.length;
        for (int i = 0; i < j; i++)
        {
            Unit unit1 = aunit[i];
            long l1 = unit1.a(l);
            if (unit1 == unit)
            {
                a.put(unit, Long.valueOf(l1));
                return l1;
            }
            l -= unit1.b(l1);
        }

        return l;
    }

    private long c(Unit unit)
    {
        return unit.a(b);
    }

    public long a()
    {
        return c(Unit.b);
    }

    public long a(TimeUnit timeunit)
    {
        return timeunit.convert(b, TimeUnit.MILLISECONDS);
    }

    public Duration a(Long long1)
    {
        return new Duration(b + long1.longValue());
    }

    public String a(Unit unit)
    {
        Unit unit1;
        StringBuilder stringbuilder;
        Unit aunit[];
        int i;
        int j;
        stringbuilder = new StringBuilder();
        unit1 = null;
        aunit = Unit.values();
        j = aunit.length;
        i = 0;
_L2:
        Unit unit2;
label0:
        {
            if (i < j)
            {
                unit2 = aunit[i];
                if (unit2.ordinal() <= unit.ordinal())
                {
                    break label0;
                }
            }
            return stringbuilder.toString();
        }
        if (b(unit2) != 0L || !TextUtils.isEmpty(stringbuilder))
        {
            break; /* Loop/switch isn't completed */
        }
        unit1 = unit2;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s;
        boolean flag;
        if (Unit.a(unit2) != 0L && Unit.a(unit2) < 1000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.isEmpty(stringbuilder) && unit1 != null && Unit.b(unit1))
        {
            if (Unit.a(unit1) != 0L && Unit.a(unit1) < 1000L)
            {
                s = "%s";
            } else
            {
                s = "%02d";
            }
            stringbuilder.append(String.format(s, new Object[] {
                Integer.valueOf(0)
            }));
        }
        if (!TextUtils.isEmpty(stringbuilder))
        {
            char c1;
            if (flag)
            {
                c1 = '.';
            } else
            {
                c1 = ':';
            }
            stringbuilder.append(c1);
        }
        if (flag)
        {
            s = "%s";
        } else
        {
            s = "%02d";
        }
        stringbuilder.append(String.format(s, new Object[] {
            Long.valueOf(b(unit2))
        }));
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public long b()
    {
        return c(Unit.a);
    }

    public int c()
    {
        return (int)b(Unit.a);
    }

    public int d()
    {
        return (int)b(Unit.b);
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return (int)b(Unit.d);
    }

    public int f()
    {
        return (int)b(Unit.c);
    }

    public String toString()
    {
        if (b < 60000L)
        {
            return String.format("%s:%02d:%s", new Object[] {
                Integer.valueOf(d()), Integer.valueOf(f()), Integer.valueOf(e())
            });
        } else
        {
            return DateUtils.formatElapsedTime(TimeUnit.SECONDS.convert(b, TimeUnit.MILLISECONDS));
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(b);
    }

}
