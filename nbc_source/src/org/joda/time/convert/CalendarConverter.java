// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, InstantConverter, PartialConverter

final class CalendarConverter extends AbstractConverter
    implements InstantConverter, PartialConverter
{

    static final CalendarConverter INSTANCE = new CalendarConverter();

    protected CalendarConverter()
    {
    }

    public Chronology getChronology(Object obj, Chronology chronology)
    {
        if (chronology != null)
        {
            return chronology;
        }
        chronology = (Calendar)obj;
        try
        {
            obj = DateTimeZone.forTimeZone(chronology.getTimeZone());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = DateTimeZone.getDefault();
        }
        return getChronology(chronology, ((DateTimeZone) (obj)));
    }

    public Chronology getChronology(Object obj, DateTimeZone datetimezone)
    {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar"))
        {
            return BuddhistChronology.getInstance(datetimezone);
        }
        if (obj instanceof GregorianCalendar)
        {
            long l = ((GregorianCalendar)obj).getGregorianChange().getTime();
            if (l == 0x8000000000000000L)
            {
                return GregorianChronology.getInstance(datetimezone);
            }
            if (l == 0x7fffffffffffffffL)
            {
                return JulianChronology.getInstance(datetimezone);
            } else
            {
                return GJChronology.getInstance(datetimezone, l, 4);
            }
        } else
        {
            return ISOChronology.getInstance(datetimezone);
        }
    }

    public long getInstantMillis(Object obj, Chronology chronology)
    {
        return ((Calendar)obj).getTime().getTime();
    }

    public Class getSupportedType()
    {
        return java/util/Calendar;
    }

}
