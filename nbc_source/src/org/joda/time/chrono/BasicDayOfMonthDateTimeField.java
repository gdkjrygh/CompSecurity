// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField
{

    private static final long serialVersionUID = 0xbf1729b8dddcd735L;
    private final BasicChronology iChronology;

    BasicDayOfMonthDateTimeField(BasicChronology basicchronology, DurationField durationfield)
    {
        super(DateTimeFieldType.dayOfMonth(), durationfield);
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.dayOfMonth();
    }

    public int get(long l)
    {
        return iChronology.getDayOfMonth(l);
    }

    public int getMaximumValue()
    {
        return iChronology.getDaysInMonthMax();
    }

    public int getMaximumValue(long l)
    {
        return iChronology.getDaysInMonthMax(l);
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        if (readablepartial.isSupported(DateTimeFieldType.monthOfYear()))
        {
            int i = readablepartial.get(DateTimeFieldType.monthOfYear());
            if (readablepartial.isSupported(DateTimeFieldType.year()))
            {
                int j = readablepartial.get(DateTimeFieldType.year());
                return iChronology.getDaysInYearMonth(j, i);
            } else
            {
                return iChronology.getDaysInMonthMax(i);
            }
        } else
        {
            return getMaximumValue();
        }
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        boolean flag = false;
        int j = readablepartial.size();
        for (int i = 0; i < j; i++)
        {
            if (readablepartial.getFieldType(i) == DateTimeFieldType.monthOfYear())
            {
                int k = ai[i];
                for (i = ((flag) ? 1 : 0); i < j; i++)
                {
                    if (readablepartial.getFieldType(i) == DateTimeFieldType.year())
                    {
                        i = ai[i];
                        return iChronology.getDaysInYearMonth(i, k);
                    }
                }

                return iChronology.getDaysInMonthMax(k);
            }
        }

        return getMaximumValue();
    }

    protected int getMaximumValueForSet(long l, int i)
    {
        return iChronology.getDaysInMonthMaxForSet(l, i);
    }

    public int getMinimumValue()
    {
        return 1;
    }

    public DurationField getRangeDurationField()
    {
        return iChronology.months();
    }

    public boolean isLeap(long l)
    {
        return iChronology.isLeapDay(l);
    }
}
