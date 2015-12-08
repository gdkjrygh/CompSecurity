// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

public abstract class BaseSingleFieldPeriod
    implements Serializable, Comparable, ReadablePeriod
{

    private static final long START_1972 = 0xeaf625800L;
    private static final long serialVersionUID = 0x8898d4e461cL;
    private volatile int iPeriod;

    protected BaseSingleFieldPeriod(int i)
    {
        iPeriod = i;
    }

    protected static int between(ReadableInstant readableinstant, ReadableInstant readableinstant1, DurationFieldType durationfieldtype)
    {
        if (readableinstant == null || readableinstant1 == null)
        {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        } else
        {
            return durationfieldtype.getField(DateTimeUtils.getInstantChronology(readableinstant)).getDifference(readableinstant1.getMillis(), readableinstant.getMillis());
        }
    }

    protected static int between(ReadablePartial readablepartial, ReadablePartial readablepartial1, ReadablePeriod readableperiod)
    {
        if (readablepartial == null || readablepartial1 == null)
        {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (readablepartial.size() != readablepartial1.size())
        {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int j = readablepartial.size();
        for (int i = 0; i < j; i++)
        {
            if (readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
            {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }

        if (!DateTimeUtils.isContiguous(readablepartial))
        {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else
        {
            Chronology chronology = DateTimeUtils.getChronology(readablepartial.getChronology()).withUTC();
            return chronology.get(readableperiod, chronology.set(readablepartial, 0xeaf625800L), chronology.set(readablepartial1, 0xeaf625800L))[0];
        }
    }

    protected static int standardPeriodIn(ReadablePeriod readableperiod, long l)
    {
        int i = 0;
        if (readableperiod == null)
        {
            return 0;
        }
        ISOChronology isochronology = ISOChronology.getInstanceUTC();
        long l1;
        long l2;
        for (l1 = 0L; i < readableperiod.size(); l1 = l2)
        {
            int j = readableperiod.getValue(i);
            l2 = l1;
            if (j != 0)
            {
                DurationField durationfield = readableperiod.getFieldType(i).getField(isochronology);
                if (!durationfield.isPrecise())
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Cannot convert period to duration as ").append(durationfield.getName()).append(" is not precise in the period ").append(readableperiod).toString());
                }
                l2 = FieldUtils.safeAdd(l1, FieldUtils.safeMultiply(durationfield.getUnitMillis(), j));
            }
            i++;
        }

        return FieldUtils.safeToInt(l1 / l);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((BaseSingleFieldPeriod)obj);
    }

    public int compareTo(BaseSingleFieldPeriod basesinglefieldperiod)
    {
        if (basesinglefieldperiod.getClass() != getClass())
        {
            throw new ClassCastException((new StringBuilder()).append(getClass()).append(" cannot be compared to ").append(basesinglefieldperiod.getClass()).toString());
        }
        int i = basesinglefieldperiod.getValue();
        int j = getValue();
        if (j > i)
        {
            return 1;
        }
        return j >= i ? 0 : -1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ReadablePeriod))
            {
                return false;
            }
            obj = (ReadablePeriod)obj;
            if (((ReadablePeriod) (obj)).getPeriodType() != getPeriodType() || ((ReadablePeriod) (obj)).getValue(0) != getValue())
            {
                return false;
            }
        }
        return true;
    }

    public int get(DurationFieldType durationfieldtype)
    {
        if (durationfieldtype == getFieldType())
        {
            return getValue();
        } else
        {
            return 0;
        }
    }

    public abstract DurationFieldType getFieldType();

    public DurationFieldType getFieldType(int i)
    {
        if (i != 0)
        {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else
        {
            return getFieldType();
        }
    }

    public abstract PeriodType getPeriodType();

    protected int getValue()
    {
        return iPeriod;
    }

    public int getValue(int i)
    {
        if (i != 0)
        {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else
        {
            return getValue();
        }
    }

    public int hashCode()
    {
        return (getValue() + 459) * 27 + getFieldType().hashCode();
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        return durationfieldtype == getFieldType();
    }

    protected void setValue(int i)
    {
        iPeriod = i;
    }

    public int size()
    {
        return 1;
    }

    public MutablePeriod toMutablePeriod()
    {
        MutablePeriod mutableperiod = new MutablePeriod();
        mutableperiod.add(this);
        return mutableperiod;
    }

    public Period toPeriod()
    {
        return Period.ZERO.withFields(this);
    }
}
