// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateParser

static class keyValues extends keyValues
{

    private final int field;
    private final Map keyValues;

    boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
    {
        stringbuilder.append('(');
        for (fastdateparser = keyValues.keySet().iterator(); fastdateparser.hasNext(); FastDateParser.access$100(stringbuilder, (String)fastdateparser.next(), false).append('|')) { }
        stringbuilder.setCharAt(stringbuilder.length() - 1, ')');
        return true;
    }

    void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
    {
        fastdateparser = (Integer)keyValues.get(s);
        if (fastdateparser == null)
        {
            fastdateparser = new StringBuilder(s);
            fastdateparser.append(" not in (");
            for (calendar = keyValues.keySet().iterator(); calendar.hasNext(); fastdateparser.append((String)calendar.next()).append(' ')) { }
            fastdateparser.setCharAt(fastdateparser.length() - 1, ')');
            throw new IllegalArgumentException(fastdateparser.toString());
        } else
        {
            calendar.set(field, fastdateparser.intValue());
            return;
        }
    }

    (int i, Calendar calendar, Locale locale)
    {
        super(null);
        field = i;
        keyValues = FastDateParser.access$200(i, calendar, locale);
    }
}
