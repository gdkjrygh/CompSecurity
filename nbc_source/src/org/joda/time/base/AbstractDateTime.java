// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.base:
//            AbstractInstant

public abstract class AbstractDateTime extends AbstractInstant
    implements ReadableDateTime
{

    protected AbstractDateTime()
    {
    }

    public int get(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else
        {
            return datetimefieldtype.getField(getChronology()).get(getMillis());
        }
    }

    public int getCenturyOfEra()
    {
        return getChronology().centuryOfEra().get(getMillis());
    }

    public int getDayOfMonth()
    {
        return getChronology().dayOfMonth().get(getMillis());
    }

    public int getDayOfWeek()
    {
        return getChronology().dayOfWeek().get(getMillis());
    }

    public int getDayOfYear()
    {
        return getChronology().dayOfYear().get(getMillis());
    }

    public int getEra()
    {
        return getChronology().era().get(getMillis());
    }

    public int getHourOfDay()
    {
        return getChronology().hourOfDay().get(getMillis());
    }

    public int getMillisOfDay()
    {
        return getChronology().millisOfDay().get(getMillis());
    }

    public int getMillisOfSecond()
    {
        return getChronology().millisOfSecond().get(getMillis());
    }

    public int getMinuteOfDay()
    {
        return getChronology().minuteOfDay().get(getMillis());
    }

    public int getMinuteOfHour()
    {
        return getChronology().minuteOfHour().get(getMillis());
    }

    public int getMonthOfYear()
    {
        return getChronology().monthOfYear().get(getMillis());
    }

    public int getSecondOfDay()
    {
        return getChronology().secondOfDay().get(getMillis());
    }

    public int getSecondOfMinute()
    {
        return getChronology().secondOfMinute().get(getMillis());
    }

    public int getWeekOfWeekyear()
    {
        return getChronology().weekOfWeekyear().get(getMillis());
    }

    public int getWeekyear()
    {
        return getChronology().weekyear().get(getMillis());
    }

    public int getYear()
    {
        return getChronology().year().get(getMillis());
    }

    public int getYearOfCentury()
    {
        return getChronology().yearOfCentury().get(getMillis());
    }

    public int getYearOfEra()
    {
        return getChronology().yearOfEra().get(getMillis());
    }

    public Calendar toCalendar(Locale locale)
    {
        Locale locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        locale = Calendar.getInstance(getZone().toTimeZone(), locale1);
        locale.setTime(toDate());
        return locale;
    }

    public GregorianCalendar toGregorianCalendar()
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(getZone().toTimeZone());
        gregoriancalendar.setTime(toDate());
        return gregoriancalendar;
    }

    public String toString()
    {
        return super.toString();
    }

    public String toString(String s)
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).print(this);
        }
    }

    public String toString(String s, Locale locale)
        throws IllegalArgumentException
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).withLocale(locale).print(this);
        }
    }
}
