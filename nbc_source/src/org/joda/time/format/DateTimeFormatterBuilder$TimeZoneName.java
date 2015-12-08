// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static class iParseLookup
    implements InternalParser, InternalPrinter
{

    static final int LONG_NAME = 0;
    static final int SHORT_NAME = 1;
    private final Map iParseLookup;
    private final int iType;

    private String print(long l, DateTimeZone datetimezone, Locale locale)
    {
        if (datetimezone == null)
        {
            return "";
        }
        switch (iType)
        {
        default:
            return "";

        case 0: // '\0'
            return datetimezone.getName(l, locale);

        case 1: // '\001'
            return datetimezone.getShortName(l, locale);
        }
    }

    public int estimateParsedLength()
    {
        return iType != 1 ? 20 : 4;
    }

    public int estimatePrintedLength()
    {
        return iType != 1 ? 20 : 4;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        String s;
        String s1;
        Map map;
        map = iParseLookup;
        String s2;
        Iterator iterator;
        if (map == null)
        {
            map = DateTimeUtils.getDefaultTimeZoneNames();
        }
        s = null;
        iterator = map.keySet().iterator();
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = (String)iterator.next();
        if (!DateTimeFormatterBuilder.csStartsWith(charsequence, i, s2))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_134;
            }
            s1 = s2;
        }
_L4:
        s = s1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
        if (s != null)
        {
            datetimeparserbucket.setZone((DateTimeZone)map.get(s));
            return s.length() + i;
        } else
        {
            return ~i;
        }
        s1 = s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        appendable.append(print(l - (long)i, datetimezone, locale));
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
    }

    (int i, Map map)
    {
        iType = i;
        iParseLookup = map;
    }
}
