// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology

public static final class 
{

    public DurationField centuries;
    public DateTimeField centuryOfEra;
    public DateTimeField clockhourOfDay;
    public DateTimeField clockhourOfHalfday;
    public DateTimeField dayOfMonth;
    public DateTimeField dayOfWeek;
    public DateTimeField dayOfYear;
    public DurationField days;
    public DateTimeField era;
    public DurationField eras;
    public DateTimeField halfdayOfDay;
    public DurationField halfdays;
    public DateTimeField hourOfDay;
    public DateTimeField hourOfHalfday;
    public DurationField hours;
    public DurationField millis;
    public DateTimeField millisOfDay;
    public DateTimeField millisOfSecond;
    public DateTimeField minuteOfDay;
    public DateTimeField minuteOfHour;
    public DurationField minutes;
    public DateTimeField monthOfYear;
    public DurationField months;
    public DateTimeField secondOfDay;
    public DateTimeField secondOfMinute;
    public DurationField seconds;
    public DateTimeField weekOfWeekyear;
    public DurationField weeks;
    public DateTimeField weekyear;
    public DateTimeField weekyearOfCentury;
    public DurationField weekyears;
    public DateTimeField year;
    public DateTimeField yearOfCentury;
    public DateTimeField yearOfEra;
    public DurationField years;

    private static boolean isSupported(DateTimeField datetimefield)
    {
        if (datetimefield == null)
        {
            return false;
        } else
        {
            return datetimefield.isSupported();
        }
    }

    private static boolean isSupported(DurationField durationfield)
    {
        if (durationfield == null)
        {
            return false;
        } else
        {
            return durationfield.isSupported();
        }
    }

    public void copyFieldsFrom(Chronology chronology)
    {
        Object obj = chronology.millis();
        if (isSupported(((DurationField) (obj))))
        {
            millis = ((DurationField) (obj));
        }
        obj = chronology.seconds();
        if (isSupported(((DurationField) (obj))))
        {
            seconds = ((DurationField) (obj));
        }
        obj = chronology.minutes();
        if (isSupported(((DurationField) (obj))))
        {
            minutes = ((DurationField) (obj));
        }
        obj = chronology.hours();
        if (isSupported(((DurationField) (obj))))
        {
            hours = ((DurationField) (obj));
        }
        obj = chronology.halfdays();
        if (isSupported(((DurationField) (obj))))
        {
            halfdays = ((DurationField) (obj));
        }
        obj = chronology.days();
        if (isSupported(((DurationField) (obj))))
        {
            days = ((DurationField) (obj));
        }
        obj = chronology.weeks();
        if (isSupported(((DurationField) (obj))))
        {
            weeks = ((DurationField) (obj));
        }
        obj = chronology.weekyears();
        if (isSupported(((DurationField) (obj))))
        {
            weekyears = ((DurationField) (obj));
        }
        obj = chronology.months();
        if (isSupported(((DurationField) (obj))))
        {
            months = ((DurationField) (obj));
        }
        obj = chronology.years();
        if (isSupported(((DurationField) (obj))))
        {
            years = ((DurationField) (obj));
        }
        obj = chronology.centuries();
        if (isSupported(((DurationField) (obj))))
        {
            centuries = ((DurationField) (obj));
        }
        obj = chronology.eras();
        if (isSupported(((DurationField) (obj))))
        {
            eras = ((DurationField) (obj));
        }
        obj = chronology.millisOfSecond();
        if (isSupported(((DateTimeField) (obj))))
        {
            millisOfSecond = ((DateTimeField) (obj));
        }
        obj = chronology.millisOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            millisOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.secondOfMinute();
        if (isSupported(((DateTimeField) (obj))))
        {
            secondOfMinute = ((DateTimeField) (obj));
        }
        obj = chronology.secondOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            secondOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.minuteOfHour();
        if (isSupported(((DateTimeField) (obj))))
        {
            minuteOfHour = ((DateTimeField) (obj));
        }
        obj = chronology.minuteOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            minuteOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.hourOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            hourOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.clockhourOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            clockhourOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.hourOfHalfday();
        if (isSupported(((DateTimeField) (obj))))
        {
            hourOfHalfday = ((DateTimeField) (obj));
        }
        obj = chronology.clockhourOfHalfday();
        if (isSupported(((DateTimeField) (obj))))
        {
            clockhourOfHalfday = ((DateTimeField) (obj));
        }
        obj = chronology.halfdayOfDay();
        if (isSupported(((DateTimeField) (obj))))
        {
            halfdayOfDay = ((DateTimeField) (obj));
        }
        obj = chronology.dayOfWeek();
        if (isSupported(((DateTimeField) (obj))))
        {
            dayOfWeek = ((DateTimeField) (obj));
        }
        obj = chronology.dayOfMonth();
        if (isSupported(((DateTimeField) (obj))))
        {
            dayOfMonth = ((DateTimeField) (obj));
        }
        obj = chronology.dayOfYear();
        if (isSupported(((DateTimeField) (obj))))
        {
            dayOfYear = ((DateTimeField) (obj));
        }
        obj = chronology.weekOfWeekyear();
        if (isSupported(((DateTimeField) (obj))))
        {
            weekOfWeekyear = ((DateTimeField) (obj));
        }
        obj = chronology.weekyear();
        if (isSupported(((DateTimeField) (obj))))
        {
            weekyear = ((DateTimeField) (obj));
        }
        obj = chronology.weekyearOfCentury();
        if (isSupported(((DateTimeField) (obj))))
        {
            weekyearOfCentury = ((DateTimeField) (obj));
        }
        obj = chronology.monthOfYear();
        if (isSupported(((DateTimeField) (obj))))
        {
            monthOfYear = ((DateTimeField) (obj));
        }
        obj = chronology.year();
        if (isSupported(((DateTimeField) (obj))))
        {
            year = ((DateTimeField) (obj));
        }
        obj = chronology.yearOfEra();
        if (isSupported(((DateTimeField) (obj))))
        {
            yearOfEra = ((DateTimeField) (obj));
        }
        obj = chronology.yearOfCentury();
        if (isSupported(((DateTimeField) (obj))))
        {
            yearOfCentury = ((DateTimeField) (obj));
        }
        obj = chronology.centuryOfEra();
        if (isSupported(((DateTimeField) (obj))))
        {
            centuryOfEra = ((DateTimeField) (obj));
        }
        chronology = chronology.era();
        if (isSupported(chronology))
        {
            era = chronology;
        }
    }

    ()
    {
    }
}
