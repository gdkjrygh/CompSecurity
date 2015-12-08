// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology, BasicYearDateTimeField, GJYearOfEraDateTimeField, GJEraDateTimeField, 
//            GJDayOfWeekDateTimeField, BasicDayOfMonthDateTimeField, BasicDayOfYearDateTimeField, GJMonthOfYearDateTimeField, 
//            BasicWeekyearDateTimeField, BasicWeekOfWeekyearDateTimeField, GJLocaleSymbols

abstract class BasicChronology extends AssembledChronology
{
    private static class HalfdayField extends PreciseDateTimeField
    {

        private static final long serialVersionUID = 0x812436e7a068fe6L;

        public String getAsText(int i, Locale locale)
        {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i);
        }

        public int getMaximumTextLength(Locale locale)
        {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        public long set(long l, String s, Locale locale)
        {
            return set(l, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(s));
        }

        HalfdayField()
        {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }
    }

    private static class YearInfo
    {

        public final long iFirstDayMillis;
        public final int iYear;

        YearInfo(int i, long l)
        {
            iYear = i;
            iFirstDayMillis = l;
        }
    }


    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField = new HalfdayField();
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 0x240c8400L);
    private static final long serialVersionUID = 0x72f3ed8da0b42f1fL;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo iYearInfoCache[] = new YearInfo[1024];

    BasicChronology(Chronology chronology, Object obj, int i)
    {
        super(chronology, obj);
        if (i < 1 || i > 7)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid min days in first week: ").append(i).toString());
        } else
        {
            iMinDaysInFirstWeek = i;
            return;
        }
    }

    private YearInfo getYearInfo(int i)
    {
        YearInfo yearinfo;
label0:
        {
            YearInfo yearinfo1 = iYearInfoCache[i & 0x3ff];
            if (yearinfo1 != null)
            {
                yearinfo = yearinfo1;
                if (yearinfo1.iYear == i)
                {
                    break label0;
                }
            }
            yearinfo = new YearInfo(i, calculateFirstDayOfYearMillis(i));
            iYearInfoCache[i & 0x3ff] = yearinfo;
        }
        return yearinfo;
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        fields.year = new BasicYearDateTimeField(this);
        fields.yearOfEra = new GJYearOfEraDateTimeField(fields.year, this);
        fields.centuryOfEra = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuries = fields.centuryOfEra.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField)fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    abstract long calculateFirstDayOfYearMillis(int i);

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && getClass() == obj.getClass())
            {
                if (getMinimumDaysInFirstWeek() != ((BasicChronology) (obj = (BasicChronology)obj)).getMinimumDaysInFirstWeek() || !getZone().equals(((BasicChronology) (obj)).getZone()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    abstract long getApproxMillisAtEpochDividedByTwo();

    abstract long getAverageMillisPerMonth();

    abstract long getAverageMillisPerYear();

    abstract long getAverageMillisPerYearDividedByTwo();

    long getDateMidnightMillis(int i, int j, int k)
    {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i, getMinYear(), getMaxYear());
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), j, 1, getMaxMonth(i));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), k, 1, getDaysInYearMonth(i, j));
        return getYearMonthDayMillis(i, j, k);
    }

    public long getDateTimeMillis(int i, int j, int k, int l)
        throws IllegalArgumentException
    {
        Chronology chronology = getBase();
        if (chronology != null)
        {
            return chronology.getDateTimeMillis(i, j, k, l);
        } else
        {
            FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), l, 0, 0x5265bff);
            return getDateMidnightMillis(i, j, k) + (long)l;
        }
    }

    public long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1)
        throws IllegalArgumentException
    {
        Chronology chronology = getBase();
        if (chronology != null)
        {
            return chronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
        } else
        {
            FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), l, 0, 23);
            FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i1, 0, 59);
            FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), j1, 0, 59);
            FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), k1, 0, 999);
            return getDateMidnightMillis(i, j, k) + (long)(0x36ee80 * l) + (long)(60000 * i1) + (long)(j1 * 1000) + (long)k1;
        }
    }

    int getDayOfMonth(long l)
    {
        int i = getYear(l);
        return getDayOfMonth(l, i, getMonthOfYear(l, i));
    }

    int getDayOfMonth(long l, int i)
    {
        return getDayOfMonth(l, i, getMonthOfYear(l, i));
    }

    int getDayOfMonth(long l, int i, int j)
    {
        return (int)((l - (getYearMillis(i) + getTotalMillisByYearMonth(i, j))) / 0x5265c00L) + 1;
    }

    int getDayOfWeek(long l)
    {
        if (l >= 0L)
        {
            l /= 0x5265c00L;
        } else
        {
            long l1 = (l - 0x5265bffL) / 0x5265c00L;
            l = l1;
            if (l1 < -3L)
            {
                return (int)((l1 + 4L) % 7L) + 7;
            }
        }
        return (int)((l + 3L) % 7L) + 1;
    }

    int getDayOfYear(long l)
    {
        return getDayOfYear(l, getYear(l));
    }

    int getDayOfYear(long l, int i)
    {
        return (int)((l - getYearMillis(i)) / 0x5265c00L) + 1;
    }

    int getDaysInMonthMax()
    {
        return 31;
    }

    abstract int getDaysInMonthMax(int i);

    int getDaysInMonthMax(long l)
    {
        int i = getYear(l);
        return getDaysInYearMonth(i, getMonthOfYear(l, i));
    }

    int getDaysInMonthMaxForSet(long l, int i)
    {
        return getDaysInMonthMax(l);
    }

    int getDaysInYear(int i)
    {
        return !isLeapYear(i) ? 365 : 366;
    }

    int getDaysInYearMax()
    {
        return 366;
    }

    abstract int getDaysInYearMonth(int i, int j);

    long getFirstWeekOfYearMillis(int i)
    {
        long l = getYearMillis(i);
        i = getDayOfWeek(l);
        if (i > 8 - iMinDaysInFirstWeek)
        {
            return l + (long)(8 - i) * 0x5265c00L;
        } else
        {
            return l - (long)(i - 1) * 0x5265c00L;
        }
    }

    int getMaxMonth()
    {
        return 12;
    }

    int getMaxMonth(int i)
    {
        return getMaxMonth();
    }

    abstract int getMaxYear();

    int getMillisOfDay(long l)
    {
        if (l >= 0L)
        {
            return (int)(l % 0x5265c00L);
        } else
        {
            return 0x5265bff + (int)((1L + l) % 0x5265c00L);
        }
    }

    abstract int getMinYear();

    public int getMinimumDaysInFirstWeek()
    {
        return iMinDaysInFirstWeek;
    }

    int getMonthOfYear(long l)
    {
        return getMonthOfYear(l, getYear(l));
    }

    abstract int getMonthOfYear(long l, int i);

    abstract long getTotalMillisByYearMonth(int i, int j);

    int getWeekOfWeekyear(long l)
    {
        return getWeekOfWeekyear(l, getYear(l));
    }

    int getWeekOfWeekyear(long l, int i)
    {
        long l1 = getFirstWeekOfYearMillis(i);
        if (l < l1)
        {
            return getWeeksInYear(i - 1);
        }
        if (l >= getFirstWeekOfYearMillis(i + 1))
        {
            return 1;
        } else
        {
            return (int)((l - l1) / 0x240c8400L) + 1;
        }
    }

    int getWeeksInYear(int i)
    {
        long l = getFirstWeekOfYearMillis(i);
        return (int)((getFirstWeekOfYearMillis(i + 1) - l) / 0x240c8400L);
    }

    int getWeekyear(long l)
    {
        int i = getYear(l);
        int j = getWeekOfWeekyear(l, i);
        if (j == 1)
        {
            i = getYear(0x240c8400L + l);
        } else
        if (j > 51)
        {
            return getYear(l - 0x48190800L);
        }
        return i;
    }

    int getYear(long l)
    {
        long l3 = 0x757b12c00L;
        long l5 = getAverageMillisPerYearDividedByTwo();
        long l4 = (l >> 1) + getApproxMillisAtEpochDividedByTwo();
        long l1 = l4;
        if (l4 < 0L)
        {
            l1 = (l4 - l5) + 1L;
        }
        int j = (int)(l1 / l5);
        l4 = getYearMillis(j);
        l1 = l - l4;
        int i;
        if (l1 < 0L)
        {
            i = j - 1;
        } else
        {
            i = j;
            if (l1 >= 0x757b12c00L)
            {
                long l2 = l3;
                if (isLeapYear(j))
                {
                    l2 = 0x75cd78800L;
                }
                i = j;
                if (l2 + l4 <= l)
                {
                    return j + 1;
                }
            }
        }
        return i;
    }

    abstract long getYearDifference(long l, long l1);

    long getYearMillis(int i)
    {
        return getYearInfo(i).iFirstDayMillis;
    }

    long getYearMonthDayMillis(int i, int j, int k)
    {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, j) + (long)(k - 1) * 0x5265c00L;
    }

    long getYearMonthMillis(int i, int j)
    {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, j);
    }

    public DateTimeZone getZone()
    {
        Chronology chronology = getBase();
        if (chronology != null)
        {
            return chronology.getZone();
        } else
        {
            return DateTimeZone.UTC;
        }
    }

    public int hashCode()
    {
        return getClass().getName().hashCode() * 11 + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    boolean isLeapDay(long l)
    {
        return false;
    }

    abstract boolean isLeapYear(int i);

    abstract long setYear(long l, int i);

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(60);
        String s = getClass().getName();
        int i = s.lastIndexOf('.');
        Object obj = s;
        if (i >= 0)
        {
            obj = s.substring(i + 1);
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append('[');
        obj = getZone();
        if (obj != null)
        {
            stringbuilder.append(((DateTimeZone) (obj)).getID());
        }
        if (getMinimumDaysInFirstWeek() != 4)
        {
            stringbuilder.append(",mdfw=");
            stringbuilder.append(getMinimumDaysInFirstWeek());
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    static 
    {
        cMillisField = MillisDurationField.INSTANCE;
        cSecondsField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cMinutesField = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cHoursField = new PreciseDurationField(DurationFieldType.hours(), 0x36ee80L);
        cHalfdaysField = new PreciseDurationField(DurationFieldType.halfdays(), 0x2932e00L);
        cDaysField = new PreciseDurationField(DurationFieldType.days(), 0x5265c00L);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), cMillisField, cSecondsField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), cMillisField, cDaysField);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), cSecondsField, cMinutesField);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), cSecondsField, cDaysField);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), cMinutesField, cHoursField);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), cMinutesField, cDaysField);
        cHourOfDayField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), cHoursField, cDaysField);
        cHourOfHalfdayField = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), cHoursField, cHalfdaysField);
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(cHourOfDayField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(cHourOfHalfdayField, DateTimeFieldType.clockhourOfHalfday());
    }


}
