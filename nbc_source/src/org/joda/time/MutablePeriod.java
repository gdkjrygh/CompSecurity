// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            ReadWritablePeriod, PeriodType, Period, ReadableDuration, 
//            ReadableInterval, DurationFieldType, DateTimeUtils, Chronology, 
//            ReadableInstant, ReadablePeriod

public class MutablePeriod extends BasePeriod
    implements Serializable, Cloneable, ReadWritablePeriod
{

    private static final long serialVersionUID = 0x2fb0ba168501a285L;

    public MutablePeriod()
    {
        super(0L, null, null);
    }

    public MutablePeriod(int i, int j, int k, int l)
    {
        super(0, 0, 0, 0, i, j, k, l, PeriodType.standard());
    }

    public MutablePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        super(i, j, k, l, i1, j1, k1, l1, PeriodType.standard());
    }

    public MutablePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, PeriodType periodtype)
    {
        super(i, j, k, l, i1, j1, k1, l1, periodtype);
    }

    public MutablePeriod(long l)
    {
        super(l);
    }

    public MutablePeriod(long l, long l1)
    {
        super(l, l1, null, null);
    }

    public MutablePeriod(long l, long l1, Chronology chronology)
    {
        super(l, l1, null, chronology);
    }

    public MutablePeriod(long l, long l1, PeriodType periodtype)
    {
        super(l, l1, periodtype, null);
    }

    public MutablePeriod(long l, long l1, PeriodType periodtype, Chronology chronology)
    {
        super(l, l1, periodtype, chronology);
    }

    public MutablePeriod(long l, Chronology chronology)
    {
        super(l, null, chronology);
    }

    public MutablePeriod(long l, PeriodType periodtype)
    {
        super(l, periodtype, null);
    }

    public MutablePeriod(long l, PeriodType periodtype, Chronology chronology)
    {
        super(l, periodtype, chronology);
    }

    public MutablePeriod(Object obj)
    {
        super(obj, null, null);
    }

    public MutablePeriod(Object obj, Chronology chronology)
    {
        super(obj, null, chronology);
    }

    public MutablePeriod(Object obj, PeriodType periodtype)
    {
        super(obj, periodtype, null);
    }

    public MutablePeriod(Object obj, PeriodType periodtype, Chronology chronology)
    {
        super(obj, periodtype, chronology);
    }

    public MutablePeriod(PeriodType periodtype)
    {
        super(0L, periodtype, null);
    }

    public MutablePeriod(ReadableDuration readableduration, ReadableInstant readableinstant)
    {
        super(readableduration, readableinstant, null);
    }

    public MutablePeriod(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
    {
        super(readableduration, readableinstant, periodtype);
    }

    public MutablePeriod(ReadableInstant readableinstant, ReadableDuration readableduration)
    {
        super(readableinstant, readableduration, null);
    }

    public MutablePeriod(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
    {
        super(readableinstant, readableduration, periodtype);
    }

    public MutablePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        super(readableinstant, readableinstant1, null);
    }

    public MutablePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
    {
        super(readableinstant, readableinstant1, periodtype);
    }

    public static MutablePeriod parse(String s)
    {
        return parse(s, ISOPeriodFormat.standard());
    }

    public static MutablePeriod parse(String s, PeriodFormatter periodformatter)
    {
        return periodformatter.parsePeriod(s).toMutablePeriod();
    }

    public void add(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        setPeriod(FieldUtils.safeAdd(getYears(), i), FieldUtils.safeAdd(getMonths(), j), FieldUtils.safeAdd(getWeeks(), k), FieldUtils.safeAdd(getDays(), l), FieldUtils.safeAdd(getHours(), i1), FieldUtils.safeAdd(getMinutes(), j1), FieldUtils.safeAdd(getSeconds(), k1), FieldUtils.safeAdd(getMillis(), l1));
    }

    public void add(long l)
    {
        add(((ReadablePeriod) (new Period(l, getPeriodType()))));
    }

    public void add(long l, Chronology chronology)
    {
        add(((ReadablePeriod) (new Period(l, getPeriodType(), chronology))));
    }

    public void add(DurationFieldType durationfieldtype, int i)
    {
        super.addField(durationfieldtype, i);
    }

    public void add(ReadableDuration readableduration)
    {
        if (readableduration != null)
        {
            add(((ReadablePeriod) (new Period(readableduration.getMillis(), getPeriodType()))));
        }
    }

    public void add(ReadableInterval readableinterval)
    {
        if (readableinterval != null)
        {
            add(((ReadablePeriod) (readableinterval.toPeriod(getPeriodType()))));
        }
    }

    public void add(ReadablePeriod readableperiod)
    {
        super.addPeriod(readableperiod);
    }

    public void addDays(int i)
    {
        super.addField(DurationFieldType.days(), i);
    }

    public void addHours(int i)
    {
        super.addField(DurationFieldType.hours(), i);
    }

    public void addMillis(int i)
    {
        super.addField(DurationFieldType.millis(), i);
    }

    public void addMinutes(int i)
    {
        super.addField(DurationFieldType.minutes(), i);
    }

    public void addMonths(int i)
    {
        super.addField(DurationFieldType.months(), i);
    }

    public void addSeconds(int i)
    {
        super.addField(DurationFieldType.seconds(), i);
    }

    public void addWeeks(int i)
    {
        super.addField(DurationFieldType.weeks(), i);
    }

    public void addYears(int i)
    {
        super.addField(DurationFieldType.years(), i);
    }

    public void clear()
    {
        super.setValues(new int[size()]);
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError("Clone error");
        }
        return obj;
    }

    public MutablePeriod copy()
    {
        return (MutablePeriod)clone();
    }

    public int getDays()
    {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours()
    {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis()
    {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes()
    {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths()
    {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds()
    {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks()
    {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears()
    {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public void mergePeriod(ReadablePeriod readableperiod)
    {
        super.mergePeriod(readableperiod);
    }

    public void set(DurationFieldType durationfieldtype, int i)
    {
        super.setField(durationfieldtype, i);
    }

    public void setDays(int i)
    {
        super.setField(DurationFieldType.days(), i);
    }

    public void setHours(int i)
    {
        super.setField(DurationFieldType.hours(), i);
    }

    public void setMillis(int i)
    {
        super.setField(DurationFieldType.millis(), i);
    }

    public void setMinutes(int i)
    {
        super.setField(DurationFieldType.minutes(), i);
    }

    public void setMonths(int i)
    {
        super.setField(DurationFieldType.months(), i);
    }

    public void setPeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        super.setPeriod(i, j, k, l, i1, j1, k1, l1);
    }

    public void setPeriod(long l)
    {
        setPeriod(l, ((Chronology) (null)));
    }

    public void setPeriod(long l, long l1)
    {
        setPeriod(l, l1, null);
    }

    public void setPeriod(long l, long l1, Chronology chronology)
    {
        setValues(DateTimeUtils.getChronology(chronology).get(this, l, l1));
    }

    public void setPeriod(long l, Chronology chronology)
    {
        setValues(DateTimeUtils.getChronology(chronology).get(this, l));
    }

    public void setPeriod(ReadableDuration readableduration)
    {
        setPeriod(readableduration, ((Chronology) (null)));
    }

    public void setPeriod(ReadableDuration readableduration, Chronology chronology)
    {
        setPeriod(DateTimeUtils.getDurationMillis(readableduration), chronology);
    }

    public void setPeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        if (readableinstant == readableinstant1)
        {
            setPeriod(0L);
            return;
        } else
        {
            setPeriod(DateTimeUtils.getInstantMillis(readableinstant), DateTimeUtils.getInstantMillis(readableinstant1), DateTimeUtils.getIntervalChronology(readableinstant, readableinstant1));
            return;
        }
    }

    public void setPeriod(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            setPeriod(0L);
            return;
        } else
        {
            Chronology chronology = DateTimeUtils.getChronology(readableinterval.getChronology());
            setPeriod(readableinterval.getStartMillis(), readableinterval.getEndMillis(), chronology);
            return;
        }
    }

    public void setPeriod(ReadablePeriod readableperiod)
    {
        super.setPeriod(readableperiod);
    }

    public void setSeconds(int i)
    {
        super.setField(DurationFieldType.seconds(), i);
    }

    public void setValue(int i, int j)
    {
        super.setValue(i, j);
    }

    public void setWeeks(int i)
    {
        super.setField(DurationFieldType.weeks(), i);
    }

    public void setYears(int i)
    {
        super.setField(DurationFieldType.years(), i);
    }
}
