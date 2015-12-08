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

final class BasicWeekOfWeekyearDateTimeField extends PreciseDurationDateTimeField
{

    private static final long serialVersionUID = 0xe9f84a9df35832a0L;
    private final BasicChronology iChronology;

    BasicWeekOfWeekyearDateTimeField(BasicChronology basicchronology, DurationField durationfield)
    {
        super(DateTimeFieldType.weekOfWeekyear(), durationfield);
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.weekOfWeekyear();
    }

    public int get(long l)
    {
        return iChronology.getWeekOfWeekyear(l);
    }

    public int getMaximumValue()
    {
        return 53;
    }

    public int getMaximumValue(long l)
    {
        int i = iChronology.getWeekyear(l);
        return iChronology.getWeeksInYear(i);
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        if (readablepartial.isSupported(DateTimeFieldType.weekyear()))
        {
            int i = readablepartial.get(DateTimeFieldType.weekyear());
            return iChronology.getWeeksInYear(i);
        } else
        {
            return 53;
        }
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        int j = readablepartial.size();
        for (int i = 0; i < j; i++)
        {
            if (readablepartial.getFieldType(i) == DateTimeFieldType.weekyear())
            {
                i = ai[i];
                return iChronology.getWeeksInYear(i);
            }
        }

        return 53;
    }

    protected int getMaximumValueForSet(long l, int i)
    {
        int j = 52;
        if (i > 52)
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
        return iChronology.weekyears();
    }

    public long remainder(long l)
    {
        return super.remainder(0xf731400L + l);
    }

    public long roundCeiling(long l)
    {
        return super.roundCeiling(l + 0xf731400L) - 0xf731400L;
    }

    public long roundFloor(long l)
    {
        return super.roundFloor(l + 0xf731400L) - 0xf731400L;
    }
}
