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

final class BasicDayOfYearDateTimeField extends PreciseDurationDateTimeField
{

    private static final long serialVersionUID = 0xa156194023cc5ab3L;
    private final BasicChronology iChronology;

    BasicDayOfYearDateTimeField(BasicChronology basicchronology, DurationField durationfield)
    {
        super(DateTimeFieldType.dayOfYear(), durationfield);
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.dayOfYear();
    }

    public int get(long l)
    {
        return iChronology.getDayOfYear(l);
    }

    public int getMaximumValue()
    {
        return iChronology.getDaysInYearMax();
    }

    public int getMaximumValue(long l)
    {
        int i = iChronology.getYear(l);
        return iChronology.getDaysInYear(i);
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        if (readablepartial.isSupported(DateTimeFieldType.year()))
        {
            int i = readablepartial.get(DateTimeFieldType.year());
            return iChronology.getDaysInYear(i);
        } else
        {
            return iChronology.getDaysInYearMax();
        }
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        int j = readablepartial.size();
        for (int i = 0; i < j; i++)
        {
            if (readablepartial.getFieldType(i) == DateTimeFieldType.year())
            {
                i = ai[i];
                return iChronology.getDaysInYear(i);
            }
        }

        return iChronology.getDaysInYearMax();
    }

    protected int getMaximumValueForSet(long l, int i)
    {
        int j = iChronology.getDaysInYearMax() - 1;
        if (i > j || i < 1)
        {
            j = getMaximumValue(l);
        }
        return j;
    }

    public int getMinimumValue()
    {
        return 1;
    }

    public DurationField getRangeDurationField()
    {
        return iChronology.years();
    }

    public boolean isLeap(long l)
    {
        return iChronology.isLeapDay(l);
    }
}
