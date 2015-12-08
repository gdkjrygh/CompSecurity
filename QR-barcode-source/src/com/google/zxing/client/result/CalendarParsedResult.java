// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class CalendarParsedResult extends ParsedResult
{

    private static final DateFormat DATE_FORMAT;
    private static final Pattern DATE_TIME = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    private static final DateFormat DATE_TIME_FORMAT;
    private static final Pattern RFC2445_DURATION = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
    private static final long RFC2445_DURATION_FIELD_UNITS[] = {
        0x240c8400L, 0x5265c00L, 0x36ee80L, 60000L, 1000L
    };
    private final String attendees[];
    private final String description;
    private final Date end;
    private final boolean endAllDay;
    private final double latitude;
    private final String location;
    private final double longitude;
    private final String organizer;
    private final Date start;
    private final boolean startAllDay;
    private final String summary;

    public CalendarParsedResult(String s, String s1, String s2, String s3, String s4, String s5, String as[], 
            String s6, double d, double d1)
    {
        super(ParsedResultType.CALENDAR);
        summary = s;
        boolean flag;
        try
        {
            start = parseDate(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s.toString());
        }
        if (s2 == null)
        {
            long l = parseDurationMS(s3);
            if (l < 0L)
            {
                s = null;
            } else
            {
                s = new Date(l + start.getTime());
            }
            end = s;
        } else
        {
            try
            {
                end = parseDate(s2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException(s.toString());
            }
        }
        if (s1.length() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        startAllDay = flag;
        if (s2 != null && s2.length() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        endAllDay = flag;
        location = s4;
        organizer = s5;
        attendees = as;
        description = s6;
        latitude = d;
        longitude = d1;
    }

    private static String format(boolean flag, Date date)
    {
        if (date == null)
        {
            return null;
        }
        DateFormat dateformat;
        if (flag)
        {
            dateformat = DateFormat.getDateInstance(2);
        } else
        {
            dateformat = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateformat.format(date);
    }

    private static Date parseDate(String s)
        throws ParseException
    {
        if (!DATE_TIME.matcher(s).matches())
        {
            throw new ParseException(s, 0);
        }
        if (s.length() == 8)
        {
            return DATE_FORMAT.parse(s);
        }
        if (s.length() == 16 && s.charAt(15) == 'Z')
        {
            s = DATE_TIME_FORMAT.parse(s.substring(0, 15));
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            long l = s.getTime() + (long)gregoriancalendar.get(15);
            gregoriancalendar.setTime(new Date(l));
            return new Date(l + (long)gregoriancalendar.get(16));
        } else
        {
            return DATE_TIME_FORMAT.parse(s);
        }
    }

    private static long parseDurationMS(CharSequence charsequence)
    {
        long l1 = -1L;
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return l1;
_L2:
        if (!(charsequence = RFC2445_DURATION.matcher(charsequence)).matches())
        {
            continue;
        }
        long l = 0L;
        int i = 0;
        do
        {
            l1 = l;
            if (i >= RFC2445_DURATION_FIELD_UNITS.length)
            {
                continue;
            }
            String s = charsequence.group(i + 1);
            l1 = l;
            if (s != null)
            {
                l1 = RFC2445_DURATION_FIELD_UNITS[i];
                l1 = l + (long)Integer.parseInt(s) * l1;
            }
            i++;
            l = l1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public String[] getAttendees()
    {
        return attendees;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        maybeAppend(summary, stringbuilder);
        maybeAppend(format(startAllDay, start), stringbuilder);
        maybeAppend(format(endAllDay, end), stringbuilder);
        maybeAppend(location, stringbuilder);
        maybeAppend(organizer, stringbuilder);
        maybeAppend(attendees, stringbuilder);
        maybeAppend(description, stringbuilder);
        return stringbuilder.toString();
    }

    public Date getEnd()
    {
        return end;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public String getLocation()
    {
        return location;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getOrganizer()
    {
        return organizer;
    }

    public Date getStart()
    {
        return start;
    }

    public String getSummary()
    {
        return summary;
    }

    public boolean isEndAllDay()
    {
        return endAllDay;
    }

    public boolean isStartAllDay()
    {
        return startAllDay;
    }

    static 
    {
        DATE_FORMAT = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT"));
        DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }
}
