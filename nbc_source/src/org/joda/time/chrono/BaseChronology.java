// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public abstract class BaseChronology extends Chronology
    implements Serializable
{

    private static final long serialVersionUID = 0x9a8a961c50f00a64L;

    protected BaseChronology()
    {
    }

    public long add(long l, long l1, int i)
    {
        if (l1 == 0L || i == 0)
        {
            return l;
        } else
        {
            return FieldUtils.safeAdd(l, FieldUtils.safeMultiply(l1, i));
        }
    }

    public long add(ReadablePeriod readableperiod, long l, int i)
    {
        long l1 = l;
        if (i != 0)
        {
            l1 = l;
            if (readableperiod != null)
            {
                int k = readableperiod.size();
                for (int j = 0; j < k;)
                {
                    long l2 = readableperiod.getValue(j);
                    l1 = l;
                    if (l2 != 0L)
                    {
                        l1 = readableperiod.getFieldType(j).getField(this).add(l, l2 * (long)i);
                    }
                    j++;
                    l = l1;
                }

                l1 = l;
            }
        }
        return l1;
    }

    public DurationField centuries()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    public DateTimeField centuryOfEra()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    public DateTimeField clockhourOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    public DateTimeField clockhourOfHalfday()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    public DateTimeField dayOfMonth()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    public DateTimeField dayOfWeek()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    public DateTimeField dayOfYear()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    public DurationField days()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    public DateTimeField era()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    public DurationField eras()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int[] get(ReadablePartial readablepartial, long l)
    {
        int j = readablepartial.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = readablepartial.getFieldType(i).getField(this).get(l);
        }

        return ai;
    }

    public int[] get(ReadablePeriod readableperiod, long l)
    {
        int j = readableperiod.size();
        int ai[] = new int[j];
        if (l != 0L)
        {
            long l1 = 0L;
            for (int i = 0; i < j;)
            {
                DurationField durationfield = readableperiod.getFieldType(i).getField(this);
                long l2 = l1;
                if (durationfield.isPrecise())
                {
                    int k = durationfield.getDifference(l, l1);
                    l2 = durationfield.add(l1, k);
                    ai[i] = k;
                }
                i++;
                l1 = l2;
            }

        }
        return ai;
    }

    public int[] get(ReadablePeriod readableperiod, long l, long l1)
    {
        int j = readableperiod.size();
        int ai[] = new int[j];
        if (l != l1)
        {
            for (int i = 0; i < j;)
            {
                DurationField durationfield = readableperiod.getFieldType(i).getField(this);
                int k = durationfield.getDifference(l1, l);
                long l2 = l;
                if (k != 0)
                {
                    l2 = durationfield.add(l, k);
                }
                ai[i] = k;
                i++;
                l = l2;
            }

        }
        return ai;
    }

    public long getDateTimeMillis(int i, int j, int k, int l)
        throws IllegalArgumentException
    {
        long l1 = year().set(0L, i);
        l1 = monthOfYear().set(l1, j);
        l1 = dayOfMonth().set(l1, k);
        return millisOfDay().set(l1, l);
    }

    public long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1)
        throws IllegalArgumentException
    {
        long l1 = year().set(0L, i);
        l1 = monthOfYear().set(l1, j);
        l1 = dayOfMonth().set(l1, k);
        l1 = hourOfDay().set(l1, l);
        l1 = minuteOfHour().set(l1, i1);
        l1 = secondOfMinute().set(l1, j1);
        return millisOfSecond().set(l1, k1);
    }

    public long getDateTimeMillis(long l, int i, int j, int k, int i1)
        throws IllegalArgumentException
    {
        l = hourOfDay().set(l, i);
        l = minuteOfHour().set(l, j);
        l = secondOfMinute().set(l, k);
        return millisOfSecond().set(l, i1);
    }

    public abstract DateTimeZone getZone();

    public DateTimeField halfdayOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    public DurationField halfdays()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    public DateTimeField hourOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    public DateTimeField hourOfHalfday()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    public DurationField hours()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    public DurationField millis()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    public DateTimeField millisOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    public DateTimeField millisOfSecond()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    public DateTimeField minuteOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    public DateTimeField minuteOfHour()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    public DurationField minutes()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    public DateTimeField monthOfYear()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    public DurationField months()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    public DateTimeField secondOfDay()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    public DateTimeField secondOfMinute()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    public DurationField seconds()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    public long set(ReadablePartial readablepartial, long l)
    {
        int i = 0;
        for (int j = readablepartial.size(); i < j; i++)
        {
            l = readablepartial.getFieldType(i).getField(this).set(l, readablepartial.getValue(i));
        }

        return l;
    }

    public abstract String toString();

    public void validate(ReadablePartial readablepartial, int ai[])
    {
        int k;
        int l;
        boolean flag = false;
        l = readablepartial.size();
        int i = 0;
        do
        {
            k = ((flag) ? 1 : 0);
            if (i >= l)
            {
                break;
            }
            k = ai[i];
            DateTimeField datetimefield = readablepartial.getField(i);
            if (k < datetimefield.getMinimumValue())
            {
                throw new IllegalFieldValueException(datetimefield.getType(), Integer.valueOf(k), Integer.valueOf(datetimefield.getMinimumValue()), null);
            }
            if (k > datetimefield.getMaximumValue())
            {
                throw new IllegalFieldValueException(datetimefield.getType(), Integer.valueOf(k), null, Integer.valueOf(datetimefield.getMaximumValue()));
            }
            i++;
        } while (true);
_L3:
        if (k < l)
        {
            int j = ai[k];
            DateTimeField datetimefield1 = readablepartial.getField(k);
            if (j < datetimefield1.getMinimumValue(readablepartial, ai))
            {
                throw new IllegalFieldValueException(datetimefield1.getType(), Integer.valueOf(j), Integer.valueOf(datetimefield1.getMinimumValue(readablepartial, ai)), null);
            }
            if (j > datetimefield1.getMaximumValue(readablepartial, ai))
            {
                throw new IllegalFieldValueException(datetimefield1.getType(), Integer.valueOf(j), null, Integer.valueOf(datetimefield1.getMaximumValue(readablepartial, ai)));
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        k++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public DateTimeField weekOfWeekyear()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    public DurationField weeks()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    public DateTimeField weekyear()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    public DateTimeField weekyearOfCentury()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    public DurationField weekyears()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    public abstract Chronology withUTC();

    public abstract Chronology withZone(DateTimeZone datetimezone);

    public DateTimeField year()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    public DateTimeField yearOfCentury()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    public DateTimeField yearOfEra()
    {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    public DurationField years()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }
}
