// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            ReadablePeriod, PeriodType, ReadablePartial, DurationFieldType, 
//            DateTimeFieldType, DateTimeUtils, Days, Duration, 
//            Hours, Minutes, Seconds, Weeks, 
//            Chronology, ReadableDuration, ReadableInstant

public final class Period extends BasePeriod
    implements Serializable, ReadablePeriod
{

    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 0xa48bf3088c66fdbL;

    public Period()
    {
        super(0L, null, null);
    }

    public Period(int i, int j, int k, int l)
    {
        super(0, 0, 0, 0, i, j, k, l, PeriodType.standard());
    }

    public Period(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        super(i, j, k, l, i1, j1, k1, l1, PeriodType.standard());
    }

    public Period(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, PeriodType periodtype)
    {
        super(i, j, k, l, i1, j1, k1, l1, periodtype);
    }

    public Period(long l)
    {
        super(l);
    }

    public Period(long l, long l1)
    {
        super(l, l1, null, null);
    }

    public Period(long l, long l1, Chronology chronology)
    {
        super(l, l1, null, chronology);
    }

    public Period(long l, long l1, PeriodType periodtype)
    {
        super(l, l1, periodtype, null);
    }

    public Period(long l, long l1, PeriodType periodtype, Chronology chronology)
    {
        super(l, l1, periodtype, chronology);
    }

    public Period(long l, Chronology chronology)
    {
        super(l, null, chronology);
    }

    public Period(long l, PeriodType periodtype)
    {
        super(l, periodtype, null);
    }

    public Period(long l, PeriodType periodtype, Chronology chronology)
    {
        super(l, periodtype, chronology);
    }

    public Period(Object obj)
    {
        super(obj, null, null);
    }

    public Period(Object obj, Chronology chronology)
    {
        super(obj, null, chronology);
    }

    public Period(Object obj, PeriodType periodtype)
    {
        super(obj, periodtype, null);
    }

    public Period(Object obj, PeriodType periodtype, Chronology chronology)
    {
        super(obj, periodtype, chronology);
    }

    public Period(ReadableDuration readableduration, ReadableInstant readableinstant)
    {
        super(readableduration, readableinstant, null);
    }

    public Period(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
    {
        super(readableduration, readableinstant, periodtype);
    }

    public Period(ReadableInstant readableinstant, ReadableDuration readableduration)
    {
        super(readableinstant, readableduration, null);
    }

    public Period(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
    {
        super(readableinstant, readableduration, periodtype);
    }

    public Period(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        super(readableinstant, readableinstant1, null);
    }

    public Period(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
    {
        super(readableinstant, readableinstant1, periodtype);
    }

    public Period(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        super(readablepartial, readablepartial1, null);
    }

    public Period(ReadablePartial readablepartial, ReadablePartial readablepartial1, PeriodType periodtype)
    {
        super(readablepartial, readablepartial1, periodtype);
    }

    private Period(int ai[], PeriodType periodtype)
    {
        super(ai, periodtype);
    }

    private void checkYearsAndMonths(String s)
    {
        if (getMonths() != 0)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Cannot convert to ").append(s).append(" as this period contains months and months vary in length").toString());
        }
        if (getYears() != 0)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Cannot convert to ").append(s).append(" as this period contains years and years vary in length").toString());
        } else
        {
            return;
        }
    }

    public static Period days(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, 0, i, 0, 0, 0, 0
        }, periodtype);
    }

    public static Period fieldDifference(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if (readablepartial == null || readablepartial1 == null)
        {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (readablepartial.size() != readablepartial1.size())
        {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        DurationFieldType adurationfieldtype[] = new DurationFieldType[readablepartial.size()];
        int ai[] = new int[readablepartial.size()];
        int i = 0;
        for (int j = readablepartial.size(); i < j; i++)
        {
            if (readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
            {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
            adurationfieldtype[i] = readablepartial.getFieldType(i).getDurationType();
            if (i > 0 && adurationfieldtype[i - 1] == adurationfieldtype[i])
            {
                throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
            }
            ai[i] = readablepartial1.getValue(i) - readablepartial.getValue(i);
        }

        return new Period(ai, PeriodType.forFields(adurationfieldtype));
    }

    public static Period hours(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, 0, 0, i, 0, 0, 0
        }, periodtype);
    }

    public static Period millis(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, 0, 0, 0, 0, 0, i
        }, periodtype);
    }

    public static Period minutes(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, 0, 0, 0, i, 0, 0
        }, periodtype);
    }

    public static Period months(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, i, 0, 0, 0, 0, 0, 0
        }, periodtype);
    }

    public static Period parse(String s)
    {
        return parse(s, ISOPeriodFormat.standard());
    }

    public static Period parse(String s, PeriodFormatter periodformatter)
    {
        return periodformatter.parsePeriod(s);
    }

    public static Period seconds(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, 0, 0, 0, 0, i, 0
        }, periodtype);
    }

    public static Period weeks(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            0, 0, i, 0, 0, 0, 0, 0
        }, periodtype);
    }

    public static Period years(int i)
    {
        PeriodType periodtype = PeriodType.standard();
        return new Period(new int[] {
            i, 0, 0, 0, 0, 0, 0, 0, 0
        }, periodtype);
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

    public Period minus(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, ai, -readableperiod.get(DurationFieldType.YEARS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, ai, -readableperiod.get(DurationFieldType.MONTHS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, ai, -readableperiod.get(DurationFieldType.WEEKS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, ai, -readableperiod.get(DurationFieldType.DAYS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, ai, -readableperiod.get(DurationFieldType.HOURS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, ai, -readableperiod.get(DurationFieldType.MINUTES_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, ai, -readableperiod.get(DurationFieldType.SECONDS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, ai, -readableperiod.get(DurationFieldType.MILLIS_TYPE));
            return new Period(ai, getPeriodType());
        }
    }

    public Period minusDays(int i)
    {
        return plusDays(-i);
    }

    public Period minusHours(int i)
    {
        return plusHours(-i);
    }

    public Period minusMillis(int i)
    {
        return plusMillis(-i);
    }

    public Period minusMinutes(int i)
    {
        return plusMinutes(-i);
    }

    public Period minusMonths(int i)
    {
        return plusMonths(-i);
    }

    public Period minusSeconds(int i)
    {
        return plusSeconds(-i);
    }

    public Period minusWeeks(int i)
    {
        return plusWeeks(-i);
    }

    public Period minusYears(int i)
    {
        return plusYears(-i);
    }

    public Period multipliedBy(int i)
    {
        if (this == ZERO || i == 1)
        {
            return this;
        }
        int ai[] = getValues();
        for (int j = 0; j < ai.length; j++)
        {
            ai[j] = FieldUtils.safeMultiply(ai[j], i);
        }

        return new Period(ai, getPeriodType());
    }

    public Period negated()
    {
        return multipliedBy(-1);
    }

    public Period normalizedStandard()
    {
        return normalizedStandard(PeriodType.standard());
    }

    public Period normalizedStandard(PeriodType periodtype)
    {
label0:
        {
            PeriodType periodtype1 = DateTimeUtils.getPeriodType(periodtype);
            Object obj = new Period((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L + (long)getDays() * 0x5265c00L + (long)getWeeks() * 0x240c8400L, periodtype1, ISOChronology.getInstanceUTC());
            int i = getYears();
            int l = getMonths();
            if (i == 0)
            {
                periodtype = ((PeriodType) (obj));
                if (l == 0)
                {
                    break label0;
                }
            }
            long l1 = i;
            long l2 = (long)l + l1 * 12L;
            l1 = l2;
            periodtype = ((PeriodType) (obj));
            if (periodtype1.isSupported(DurationFieldType.YEARS_TYPE))
            {
                int j = FieldUtils.safeToInt(l2 / 12L);
                periodtype = ((Period) (obj)).withYears(j);
                l1 = l2 - (long)(j * 12);
            }
            l2 = l1;
            obj = periodtype;
            if (periodtype1.isSupported(DurationFieldType.MONTHS_TYPE))
            {
                int k = FieldUtils.safeToInt(l1);
                obj = periodtype.withMonths(k);
                l2 = l1 - (long)k;
            }
            periodtype = ((PeriodType) (obj));
            if (l2 != 0L)
            {
                throw new UnsupportedOperationException((new StringBuilder()).append("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ").append(toString()).toString());
            }
        }
        return periodtype;
    }

    public Period plus(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, ai, readableperiod.get(DurationFieldType.YEARS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, ai, readableperiod.get(DurationFieldType.MONTHS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, ai, readableperiod.get(DurationFieldType.WEEKS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, ai, readableperiod.get(DurationFieldType.DAYS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, ai, readableperiod.get(DurationFieldType.HOURS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, ai, readableperiod.get(DurationFieldType.MINUTES_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, ai, readableperiod.get(DurationFieldType.SECONDS_TYPE));
            getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, ai, readableperiod.get(DurationFieldType.MILLIS_TYPE));
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period plusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, ai, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period toPeriod()
    {
        return this;
    }

    public Days toStandardDays()
    {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L) / 0x5265c00L, getDays()), (long)getWeeks() * 7L)));
    }

    public Duration toStandardDuration()
    {
        checkYearsAndMonths("Duration");
        return new Duration((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L + (long)getHours() * 0x36ee80L + (long)getDays() * 0x5265c00L + (long)getWeeks() * 0x240c8400L);
    }

    public Hours toStandardHours()
    {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L + (long)getMinutes() * 60000L) / 0x36ee80L, getHours()), (long)getDays() * 24L), (long)getWeeks() * 168L)));
    }

    public Minutes toStandardMinutes()
    {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((long)getMillis() + (long)getSeconds() * 1000L) / 60000L, getMinutes()), (long)getHours() * 60L), (long)getDays() * 1440L), (long)getWeeks() * 10080L)));
    }

    public Seconds toStandardSeconds()
    {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), (long)getMinutes() * 60L), (long)getHours() * 3600L), (long)getDays() * 0x15180L), (long)getWeeks() * 0x93a80L)));
    }

    public Weeks toStandardWeeks()
    {
        checkYearsAndMonths("Weeks");
        long l = getMillis();
        long l1 = getSeconds();
        long l2 = getMinutes();
        long l3 = getHours();
        long l4 = getDays();
        long l5 = getWeeks();
        return Weeks.weeks(FieldUtils.safeToInt((l + l1 * 1000L + l2 * 60000L + l3 * 0x36ee80L + l4 * 0x5265c00L) / 0x240c8400L + l5));
    }

    public Period withDays(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withField(DurationFieldType durationfieldtype, int i)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        } else
        {
            int ai[] = getValues();
            super.setFieldInto(ai, durationfieldtype, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i == 0)
        {
            return this;
        } else
        {
            int ai[] = getValues();
            super.addFieldInto(ai, durationfieldtype, i);
            return new Period(ai, getPeriodType());
        }
    }

    public Period withFields(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            return this;
        } else
        {
            return new Period(super.mergePeriodInto(getValues(), readableperiod), getPeriodType());
        }
    }

    public Period withHours(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withMillis(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withMinutes(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withMonths(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodtype)
    {
        periodtype = DateTimeUtils.getPeriodType(periodtype);
        if (periodtype.equals(getPeriodType()))
        {
            return this;
        } else
        {
            return new Period(this, periodtype);
        }
    }

    public Period withSeconds(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withWeeks(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

    public Period withYears(int i)
    {
        int ai[] = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, ai, i);
        return new Period(ai, getPeriodType());
    }

}
