// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.format.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.accuweather.android.utilities:
//            SafeSimpleDateFormat, Logger, UserPreferences, Utilities, 
//            SystemClock, IClock

public class DateUtils
{

    private static final String ABBREVIATED_DAY_NAME_PATTERN = "E";
    private static final SimpleDateFormat CACHE_BUST_DATE_FORMATTER = new SimpleDateFormat("yyyyMMddhhmm");
    private static final String DATE_TIME_PATTERN_NO_GMT_OFFSET = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String FULL_DAY_NAME_PATTERN = "EEEE";
    private static final String TIME_AMPM_NO_MINUTES_PATTERN = "h a";
    private static final String TIME_AMPM_WITH_MINUTES_PATTERN = "h:mm a";
    private static final String TIME_PATTERN = "HH:mm";
    private static SafeSimpleDateFormat abbreviatedDayNameTargetFormatter;
    private static SafeSimpleDateFormat amPmNoMinutesTargetFormatter;
    private static SafeSimpleDateFormat amPmWithMinutesTargetFormatter;
    private static SafeSimpleDateFormat fullDayNameTargetFormatter;
    private static Locale lastLocale;
    private static SafeSimpleDateFormat noGmtOffsetSourceFormatter;
    private static SafeSimpleDateFormat twelveHourSourceFormatter;

    public DateUtils()
    {
    }

    public static int convertFrom12HourTo24HourFormat(int i, String s, Context context)
    {
        String s1 = getCurrentLocaleAmDesignator(context);
        int j;
        if (s.equals(getCurrentLocalePmDesignator(context)) && i != 12)
        {
            j = i + 12;
        } else
        {
            j = i;
            if (s.equals(s1))
            {
                j = i;
                if (i == 12)
                {
                    return 0;
                }
            }
        }
        return j;
    }

    private static String format(String s, SafeSimpleDateFormat safesimpledateformat, SafeSimpleDateFormat safesimpledateformat1)
    {
        try
        {
            safesimpledateformat = safesimpledateformat1.format(safesimpledateformat.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (SafeSimpleDateFormat safesimpledateformat)
        {
            Logger.e(com/accuweather/android/utilities/DateUtils.getName(), (new StringBuilder()).append("Error in format() for dateString ").append(s).toString(), safesimpledateformat);
            return "";
        }
        return safesimpledateformat;
    }

    public static String getAbbreviatedDay(String s, Locale locale)
    {
        reInitDateFormattersForLocaleChange(locale);
        return format(s, noGmtOffsetSourceFormatter, abbreviatedDayNameTargetFormatter);
    }

    public static String getAbbreviatedMonth(int i, Locale locale)
    {
        return (new DateFormatSymbols(locale)).getShortMonths()[i % 12].toUpperCase(locale);
    }

    public static String getAdjustedTimeForCurrentPreferences(String s, Context context)
    {
        String s1 = s;
        String s2;
        String as[];
        String s3;
        int i;
        try
        {
            s = s.toLowerCase();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1.toLowerCase();
        }
        s1 = s;
        if (UserPreferences.isTwelveHourFormat(context))
        {
            return s;
        }
        s1 = s;
        as = s.split(":");
        s2 = as[0];
        s1 = s;
        s3 = as[1].substring(0, 2);
        s1 = s;
        if (!getAmPmDesignator(s).equals(getCurrentLocalePmDesignator(context)))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s1 = s;
        i = Integer.parseInt(s2);
        s1 = s;
        return (new StringBuilder()).append(i + 12).append(":").append(s3).toString();
        s1 = s;
        s = (new StringBuilder()).append(s2).append(":").append(s3).toString();
        return s;
    }

    public static String getAmPmDesignator(String s)
    {
        int i = s.indexOf(" ");
        if (i == -1)
        {
            return s;
        } else
        {
            return s.substring(i + 1).toLowerCase();
        }
    }

    public static String getCurrentLocaleAmDesignator(Context context)
    {
        Locale locale = context.getResources().getConfiguration().locale;
        String s;
        try
        {
            s = getDateFormatSymbolsInstance().getAmPmStrings()[0].toLowerCase(locale);
        }
        catch (Throwable throwable)
        {
            return context.getString(com.accuweather.android.R.string.AM).toLowerCase(locale);
        }
        return s;
    }

    public static String getCurrentLocalePmDesignator(Context context)
    {
        Locale locale = context.getResources().getConfiguration().locale;
        String s;
        try
        {
            s = getDateFormatSymbolsInstance().getAmPmStrings()[1].toLowerCase(locale);
        }
        catch (Throwable throwable)
        {
            return context.getString(com.accuweather.android.R.string.PM).toLowerCase(locale);
        }
        return s;
    }

    private static String getDateComponentSeparator(Locale locale)
    {
        if ("de".equals(locale.getLanguage()))
        {
            return ".";
        } else
        {
            return "/";
        }
    }

    private static DateFormatSymbols getDateFormatSymbolsInstance()
    {
        if (Utilities.isFroyoOrEarlier())
        {
            return new DateFormatSymbols();
        } else
        {
            return DateFormatSymbols.getInstance();
        }
    }

    public static int getDayIndex(int i, String s, Locale locale)
    {
        return getDayIndex(i, s, locale, ((IClock) (new SystemClock())));
    }

    public static int getDayIndex(int i, String s, Locale locale, IClock iclock)
    {
        int j = -(int)(float)Math.round(Float.parseFloat(getHourPortionOfGmtOffset(s)));
        if (j > 0)
        {
            s = (new StringBuilder()).append("+").append(j).toString();
        } else
        {
            s = String.valueOf(j);
        }
        s = TimeZone.getTimeZone(String.format("Etc/GMT%s", new Object[] {
            s
        }));
        locale = iclock.getCalendar(s);
        locale = new GregorianCalendar(locale.get(1), locale.get(2), locale.get(5) + i);
        locale.setTimeZone(s);
        return locale.get(7);
    }

    public static int getDayOfMonth(String s, Context context)
    {
        s = toDate(s, context);
        if (s != null)
        {
            context = Calendar.getInstance(context.getResources().getConfiguration().locale);
            context.setTime(s);
            return context.get(5);
        } else
        {
            return -1;
        }
    }

    public static int getFirstHourOfDay(Context context, String s)
    {
        return convertFrom12HourTo24HourFormat(parseHour(s), getAmPmDesignator(s), context);
    }

    public static String getHourPortionOfGmtOffset(String s)
    {
        if (s.length() <= 2)
        {
            return s;
        } else
        {
            return s.substring(0, 3);
        }
    }

    public static String getLocalizedStringTime(Context context)
    {
        return getLocalizedStringTime(context, Calendar.getInstance(), is24HourFormat(context));
    }

    public static String getLocalizedStringTime(Context context, Calendar calendar, boolean flag)
    {
        if (flag)
        {
            context = "HH:mm";
        } else
        {
            context = "h:mm aa";
        }
        return (new SimpleDateFormat(context)).format(calendar.getTime());
    }

    public static int getMonthIndex(int i, String s, Locale locale)
    {
        int j = Math.round(-Float.parseFloat(getHourPortionOfGmtOffset(s)));
        if (j > 0)
        {
            s = (new StringBuilder()).append("+").append(j).toString();
        } else
        {
            s = String.valueOf(j);
        }
        s = new GregorianCalendar(TimeZone.getTimeZone(String.format("Etc/GMT%s", new Object[] {
            s
        })));
        return (new GregorianCalendar(s.get(1), s.get(2) + i, s.get(5))).get(2);
    }

    public static String getStringCurrentDateWithFormat(String s)
    {
        return (new SimpleDateFormat(s)).format(new Date());
    }

    public static String getUrlCacheBusterValue()
    {
        long l = Math.round((double)System.currentTimeMillis() / 300000D);
        return CACHE_BUST_DATE_FORMATTER.format(new Date(l * 0x493e0L));
    }

    private static void initDateFormatters(Locale locale)
    {
        if (noGmtOffsetSourceFormatter != null)
        {
            noGmtOffsetSourceFormatter.cleanup();
        }
        if (fullDayNameTargetFormatter != null)
        {
            fullDayNameTargetFormatter.cleanup();
        }
        if (abbreviatedDayNameTargetFormatter != null)
        {
            abbreviatedDayNameTargetFormatter.cleanup();
        }
        if (twelveHourSourceFormatter != null)
        {
            twelveHourSourceFormatter.cleanup();
        }
        if (amPmNoMinutesTargetFormatter != null)
        {
            amPmNoMinutesTargetFormatter.cleanup();
        }
        if (amPmWithMinutesTargetFormatter != null)
        {
            amPmWithMinutesTargetFormatter.cleanup();
        }
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().startsWith("ar"))
        {
            noGmtOffsetSourceFormatter = new SafeSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        } else
        {
            noGmtOffsetSourceFormatter = new SafeSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        }
        fullDayNameTargetFormatter = new SafeSimpleDateFormat("EEEE", locale);
        abbreviatedDayNameTargetFormatter = new SafeSimpleDateFormat("E", locale);
        twelveHourSourceFormatter = new SafeSimpleDateFormat("HH:mm", locale);
        amPmNoMinutesTargetFormatter = new SafeSimpleDateFormat("h a", locale);
        amPmWithMinutesTargetFormatter = new SafeSimpleDateFormat("h:mm a", locale);
    }

    public static boolean is24HourFormat(Context context)
    {
        return DateFormat.is24HourFormat(context);
    }

    public static boolean isExpired(IClock iclock, long l, int i)
    {
        boolean flag = false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        calendar.add(12, i);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis(iclock.getCurrentTimeInMillis());
        calendar1.set(13, 0);
        calendar1.set(14, 0);
        if (Logger.isDebugEnabled())
        {
            Logger.d(com/accuweather/android/utilities/DateUtils.getName(), (new StringBuilder()).append("In isExpired(), updateTime = ").append(new Date(l)).append(", cacheExpirationTime = ").append(calendar.getTime()).append(", current time = ").append(calendar1.getTime()).toString());
        }
        if (calendar1.getTimeInMillis() >= calendar.getTimeInMillis())
        {
            flag = true;
        }
        return flag;
    }

    public static int parseHour(String s)
    {
        return Integer.parseInt(s.split(" ")[0]);
    }

    private static void reInitDateFormattersForLocaleChange(Locale locale)
    {
        if (lastLocale == null || !lastLocale.equals(locale))
        {
            initDateFormatters(locale);
        }
        lastLocale = locale;
    }

    public static String to12HourTimeNoMinutesWithAmPm(String s, Locale locale)
    {
        reInitDateFormattersForLocaleChange(locale);
        return format(s.substring(11, 16), twelveHourSourceFormatter, amPmNoMinutesTargetFormatter);
    }

    public static String to12HourTimeWithAmPm(String s, Locale locale)
    {
        reInitDateFormattersForLocaleChange(locale);
        return format(s.substring(11, 16), twelveHourSourceFormatter, amPmWithMinutesTargetFormatter);
    }

    public static String to12HourTimeWithAmPm(String s, Locale locale, String s1)
    {
        reInitDateFormattersForLocaleChange(locale);
        locale = new SafeSimpleDateFormat(s1, locale);
        return format(s.substring(11, 16), twelveHourSourceFormatter, locale);
    }

    public static String to24HourTime(String s)
    {
        return s.substring(11, 16);
    }

    public static Date toDate(String s, Context context)
    {
        try
        {
            s = noGmtOffsetSourceFormatter.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String toFullDayName(String s, Locale locale)
    {
        reInitDateFormattersForLocaleChange(locale);
        return format(s.substring(0, 19), noGmtOffsetSourceFormatter, fullDayNameTargetFormatter);
    }

    public static String toUserPreferredDate(String s, Context context)
    {
        int i;
        int j;
label0:
        {
            reInitDateFormattersForLocaleChange(context.getResources().getConfiguration().locale);
            Date date = toDate(s, context);
            if (date != null)
            {
                s = Calendar.getInstance(context.getResources().getConfiguration().locale);
                s.setTime(date);
                i = s.get(2) + 1;
                j = s.get(5);
                s = getDateComponentSeparator(context.getResources().getConfiguration().locale);
                if (!UserPreferences.isDatePreferenceImperial(context))
                {
                    break label0;
                }
                s = (new StringBuilder()).append(i).append(s).append(j).toString();
            }
            return s;
        }
        return (new StringBuilder()).append(j).append(s).append(i).toString();
    }

}
