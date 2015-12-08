// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.danlew.android.joda;

import android.content.Context;
import android.content.res.Resources;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;

public class DateUtils
{

    private static final DateTime EPOCH;
    public static final int FORMAT_ABBREV_ALL = 0x80000;
    public static final int FORMAT_ABBREV_MONTH = 0x10000;
    public static final int FORMAT_ABBREV_RELATIVE = 0x40000;
    public static final int FORMAT_ABBREV_TIME = 16384;
    public static final int FORMAT_ABBREV_WEEKDAY = 32768;
    public static final int FORMAT_NO_MIDNIGHT = 2048;
    public static final int FORMAT_NO_MONTH_DAY = 32;
    public static final int FORMAT_NO_NOON = 512;
    public static final int FORMAT_NO_YEAR = 8;
    public static final int FORMAT_NUMERIC_DATE = 0x20000;
    public static final int FORMAT_SHOW_DATE = 16;
    public static final int FORMAT_SHOW_TIME = 1;
    public static final int FORMAT_SHOW_WEEKDAY = 2;
    public static final int FORMAT_SHOW_YEAR = 4;
    private static final int FORMAT_UTC = 8192;

    public DateUtils()
    {
    }

    private static String formatDateRange(Context context, long l, long l1, int i)
    {
        long l2 = l1;
        if (l != l1)
        {
            l2 = l1 + 1000L;
        }
        return android.text.format.DateUtils.formatDateRange(context, l, l2, i | 0x2000);
    }

    public static String formatDateRange(Context context, ReadableInstant readableinstant, ReadableInstant readableinstant1, int i)
    {
        return formatDateRange(context, toMillis(readableinstant), toMillis(readableinstant1), i);
    }

    public static String formatDateRange(Context context, ReadablePartial readablepartial, ReadablePartial readablepartial1, int i)
    {
        return formatDateRange(context, toMillis(readablepartial), toMillis(readablepartial1), i);
    }

    public static String formatDateTime(Context context, ReadableInstant readableinstant, int i)
    {
        return android.text.format.DateUtils.formatDateTime(context, toMillis(readableinstant), i | 0x2000);
    }

    public static String formatDateTime(Context context, ReadablePartial readablepartial, int i)
    {
        return android.text.format.DateUtils.formatDateTime(context, toMillis(readablepartial), i | 0x2000);
    }

    public static CharSequence formatDuration(Context context, ReadableDuration readableduration)
    {
        context = context.getResources();
        readableduration = readableduration.toDuration();
        int i = (int)readableduration.getStandardHours();
        if (i != 0)
        {
            return context.getQuantityString(R.plurals.joda_time_android_duration_hours, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        i = (int)readableduration.getStandardMinutes();
        if (i != 0)
        {
            return context.getQuantityString(R.plurals.joda_time_android_duration_minutes, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            int j = (int)readableduration.getStandardSeconds();
            return context.getQuantityString(R.plurals.joda_time_android_duration_seconds, j, new Object[] {
                Integer.valueOf(j)
            });
        }
    }

    public static String formatElapsedTime(StringBuilder stringbuilder, ReadableDuration readableduration)
    {
        return android.text.format.DateUtils.formatElapsedTime(stringbuilder, readableduration.toDuration().toStandardSeconds().getSeconds());
    }

    public static String formatElapsedTime(ReadableDuration readableduration)
    {
        return formatElapsedTime(null, readableduration);
    }

    public static CharSequence getRelativeDateTimeString(Context context, ReadableInstant readableinstant, ReadablePeriod readableperiod, int i)
    {
        Resources resources = context.getResources();
        Object obj = DateTime.now(readableinstant.getZone()).withMillisOfSecond(0);
        DateTime datetime = (new DateTime(readableinstant)).withMillisOfSecond(0);
        Duration duration;
        Duration duration1;
        boolean flag;
        if (!((DateTime) (obj)).isBefore(datetime))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            duration = new Duration(datetime, ((ReadableInstant) (obj)));
        } else
        {
            duration = new Duration(((ReadableInstant) (obj)), datetime);
        }
        duration1 = Days.ONE.toPeriod().toDurationTo(datetime);
        if (readableperiod == null)
        {
            readableperiod = duration1;
        } else
        {
            if (flag)
            {
                obj = readableperiod.toPeriod().toDurationTo(((ReadableInstant) (obj)));
            } else
            {
                obj = readableperiod.toPeriod().toDurationFrom(((ReadableInstant) (obj)));
            }
            readableperiod = Weeks.ONE.toPeriod().toDurationTo(datetime);
            if (!((Duration) (obj)).isLongerThan(readableperiod))
            {
                readableperiod = ((ReadablePeriod) (obj));
                if (((Duration) (obj)).isShorterThan(duration1))
                {
                    readableperiod = duration1;
                }
            }
        }
        obj = formatDateRange(context, readableinstant, readableinstant, 1);
        if (!duration.isLongerThan(readableperiod))
        {
            context = getRelativeTimeSpanString(context, readableinstant, i);
            return resources.getString(R.string.joda_time_android_relative_time, new Object[] {
                context, obj
            });
        } else
        {
            context = getRelativeTimeSpanString(context, readableinstant, false);
            return resources.getString(R.string.joda_time_android_date_time, new Object[] {
                context, obj
            });
        }
    }

    public static CharSequence getRelativeDateTimeString(Context context, ReadablePartial readablepartial, ReadablePeriod readableperiod, int i)
    {
        if (!readablepartial.isSupported(DateTimeFieldType.hourOfDay()) || !readablepartial.isSupported(DateTimeFieldType.minuteOfHour()))
        {
            throw new IllegalArgumentException("getRelativeDateTimeString() must be passed a ReadablePartial that supports time, otherwise it makes no sense");
        } else
        {
            return getRelativeDateTimeString(context, ((ReadableInstant) (readablepartial.toDateTime(DateTime.now()))), readableperiod, i);
        }
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableinstant)
    {
        return getRelativeTimeSpanString(context, readableinstant, 0x10014);
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableinstant, int i)
    {
        Object obj;
        DateTime datetime;
        boolean flag;
        boolean flag1;
        long l;
        if ((0xc0000 & i) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = DateTime.now(readableinstant.getZone()).withMillisOfSecond(0);
        datetime = (new DateTime(readableinstant)).withMillisOfSecond(0);
        if (!((DateTime) (obj)).isBefore(datetime))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = new Interval(datetime, ((ReadableInstant) (obj)));
        } else
        {
            obj = new Interval(((ReadableInstant) (obj)), datetime);
        }
        if (Minutes.minutesIn(((org.joda.time.ReadableInterval) (obj))).isLessThan(Minutes.ONE))
        {
            l = Seconds.secondsIn(((org.joda.time.ReadableInterval) (obj))).getSeconds();
            if (flag1)
            {
                if (flag)
                {
                    i = R.plurals.joda_time_android_abbrev_num_seconds_ago;
                } else
                {
                    i = R.plurals.joda_time_android_num_seconds_ago;
                }
            } else
            if (flag)
            {
                i = R.plurals.joda_time_android_abbrev_in_num_seconds;
            } else
            {
                i = R.plurals.joda_time_android_in_num_seconds;
            }
        } else
        if (Hours.hoursIn(((org.joda.time.ReadableInterval) (obj))).isLessThan(Hours.ONE))
        {
            l = Minutes.minutesIn(((org.joda.time.ReadableInterval) (obj))).getMinutes();
            if (flag1)
            {
                if (flag)
                {
                    i = R.plurals.joda_time_android_abbrev_num_minutes_ago;
                } else
                {
                    i = R.plurals.joda_time_android_num_minutes_ago;
                }
            } else
            if (flag)
            {
                i = R.plurals.joda_time_android_abbrev_in_num_minutes;
            } else
            {
                i = R.plurals.joda_time_android_in_num_minutes;
            }
        } else
        if (Days.daysIn(((org.joda.time.ReadableInterval) (obj))).isLessThan(Days.ONE))
        {
            l = Hours.hoursIn(((org.joda.time.ReadableInterval) (obj))).getHours();
            if (flag1)
            {
                if (flag)
                {
                    i = R.plurals.joda_time_android_abbrev_num_hours_ago;
                } else
                {
                    i = R.plurals.joda_time_android_num_hours_ago;
                }
            } else
            if (flag)
            {
                i = R.plurals.joda_time_android_abbrev_in_num_hours;
            } else
            {
                i = R.plurals.joda_time_android_in_num_hours;
            }
        } else
        if (Weeks.weeksIn(((org.joda.time.ReadableInterval) (obj))).isLessThan(Weeks.ONE))
        {
            l = Days.daysIn(((org.joda.time.ReadableInterval) (obj))).getDays();
            if (flag1)
            {
                if (flag)
                {
                    i = R.plurals.joda_time_android_abbrev_num_days_ago;
                } else
                {
                    i = R.plurals.joda_time_android_num_days_ago;
                }
            } else
            if (flag)
            {
                i = R.plurals.joda_time_android_abbrev_in_num_days;
            } else
            {
                i = R.plurals.joda_time_android_in_num_days;
            }
        } else
        {
            return formatDateRange(context, readableinstant, readableinstant, i);
        }
        return String.format(context.getResources().getQuantityString(i, (int)l), new Object[] {
            Long.valueOf(l)
        });
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableinstant, boolean flag)
    {
        Object obj = LocalDate.now();
        LocalDate localdate = new LocalDate(readableinstant);
        int i;
        if (Days.daysBetween(((ReadablePartial) (obj)), localdate).getDays() == 0)
        {
            readableinstant = formatDateRange(context, readableinstant, readableinstant, 1);
            i = R.string.joda_time_android_preposition_for_time;
        } else
        if (Years.yearsBetween(((ReadablePartial) (obj)), localdate).getYears() != 0)
        {
            readableinstant = formatDateRange(context, readableinstant, readableinstant, 0x20014);
            i = R.string.joda_time_android_preposition_for_date;
        } else
        {
            readableinstant = formatDateRange(context, readableinstant, readableinstant, 0x10010);
            i = R.string.joda_time_android_preposition_for_date;
        }
        obj = readableinstant;
        if (flag)
        {
            obj = context.getString(i, new Object[] {
                readableinstant
            });
        }
        return ((CharSequence) (obj));
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablepartial)
    {
        return getRelativeTimeSpanString(context, ((ReadableInstant) (readablepartial.toDateTime(DateTime.now()))));
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablepartial, int i)
    {
        return getRelativeTimeSpanString(context, ((ReadableInstant) (readablepartial.toDateTime(DateTime.now()))), i);
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablepartial, boolean flag)
    {
        return getRelativeTimeSpanString(context, ((ReadableInstant) (readablepartial.toDateTime(DateTime.now()))), flag);
    }

    public static boolean isToday(ReadableInstant readableinstant)
    {
        return LocalDate.now().compareTo(new LocalDate(readableinstant)) == 0;
    }

    public static boolean isToday(ReadablePartial readablepartial)
    {
        if (!readablepartial.isSupported(DateTimeFieldType.dayOfMonth()) || !readablepartial.isSupported(DateTimeFieldType.monthOfYear()) || !readablepartial.isSupported(DateTimeFieldType.year()))
        {
            throw new IllegalArgumentException("isToday() must be passed a ReadablePartial that supports day of month, month of year and year.");
        }
        if (readablepartial instanceof LocalDate)
        {
            readablepartial = (LocalDate)readablepartial;
        } else
        {
            readablepartial = new LocalDate(readablepartial);
        }
        return LocalDate.now().compareTo(readablepartial) == 0;
    }

    private static long toMillis(ReadableInstant readableinstant)
    {
        if (readableinstant instanceof DateTime)
        {
            readableinstant = (DateTime)readableinstant;
        } else
        {
            readableinstant = new DateTime(readableinstant);
        }
        return readableinstant.withZoneRetainFields(DateTimeZone.UTC).getMillis();
    }

    private static long toMillis(ReadablePartial readablepartial)
    {
        return readablepartial.toDateTime(EPOCH).getMillis();
    }

    static 
    {
        EPOCH = new DateTime(0L, DateTimeZone.UTC);
    }
}
