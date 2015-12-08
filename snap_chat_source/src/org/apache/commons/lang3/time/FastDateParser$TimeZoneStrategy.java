// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateParser

static class validTimeZoneChars extends validTimeZoneChars
{

    private final SortedMap tzNames;
    private final String validTimeZoneChars;

    boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
    {
        stringbuilder.append(validTimeZoneChars);
        return true;
    }

    void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
    {
        if (s.charAt(0) != '+' && s.charAt(0) != '-') goto _L2; else goto _L1
_L1:
        fastdateparser = TimeZone.getTimeZone((new StringBuilder("GMT")).append(s).toString());
_L4:
        calendar.setTimeZone(fastdateparser);
        return;
_L2:
        if (!s.startsWith("GMT"))
        {
            break; /* Loop/switch isn't completed */
        }
        fastdateparser = TimeZone.getTimeZone(s);
        if (true) goto _L4; else goto _L3
_L3:
        TimeZone timezone = (TimeZone)tzNames.get(s);
        fastdateparser = timezone;
        if (timezone == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" is not a supported timezone name").toString());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    (Locale locale)
    {
        super(null);
        tzNames = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        locale = DateFormatSymbols.getInstance(locale).getZoneStrings();
        int j = locale.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = locale[i];
            if (obj[0].startsWith("GMT"))
            {
                continue;
            }
            TimeZone timezone = TimeZone.getTimeZone(obj[0]);
            if (!tzNames.containsKey(obj[1]))
            {
                tzNames.put(obj[1], timezone);
            }
            if (!tzNames.containsKey(obj[2]))
            {
                tzNames.put(obj[2], timezone);
            }
            if (!timezone.useDaylightTime())
            {
                continue;
            }
            if (!tzNames.containsKey(obj[3]))
            {
                tzNames.put(obj[3], timezone);
            }
            if (!tzNames.containsKey(obj[4]))
            {
                tzNames.put(obj[4], timezone);
            }
        }

        locale = new StringBuilder();
        locale.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
        for (Iterator iterator = tzNames.keySet().iterator(); iterator.hasNext(); FastDateParser.access$100(locale, (String)iterator.next(), false).append('|')) { }
        locale.setCharAt(locale.length() - 1, ')');
        validTimeZoneChars = locale.toString();
    }
}
