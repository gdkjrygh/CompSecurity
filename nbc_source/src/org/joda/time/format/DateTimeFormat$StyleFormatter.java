// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormat, DateTimeFormatter, 
//            DateTimeParserBucket

static class iType
    implements InternalParser, InternalPrinter
{

    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private final int iDateStyle;
    private final int iTimeStyle;
    private final int iType;

    private DateTimeFormatter getFormatter(Locale locale)
    {
        Object obj;
label0:
        {
            obj = locale;
            if (locale == null)
            {
                obj = Locale.getDefault();
            }
            acheKey achekey = new acheKey(iType, iDateStyle, iTimeStyle, ((Locale) (obj)));
            DateTimeFormatter datetimeformatter = (DateTimeFormatter)cCache.get(achekey);
            locale = datetimeformatter;
            if (datetimeformatter == null)
            {
                obj = DateTimeFormat.forPattern(getPattern(((Locale) (obj))));
                locale = (DateTimeFormatter)cCache.putIfAbsent(achekey, obj);
                if (locale == null)
                {
                    break label0;
                }
            }
            return locale;
        }
        return ((DateTimeFormatter) (obj));
    }

    public int estimateParsedLength()
    {
        return 40;
    }

    public int estimatePrintedLength()
    {
        return 40;
    }

    String getPattern(Locale locale)
    {
        DateFormat dateformat = null;
        iType;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 66
    //                   1 78
    //                   2 90;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_90;
_L5:
        if (!(dateformat instanceof SimpleDateFormat))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No datetime pattern for locale: ").append(locale).toString());
        } else
        {
            return ((SimpleDateFormat)dateformat).toPattern();
        }
_L2:
        dateformat = DateFormat.getDateInstance(iDateStyle, locale);
          goto _L5
_L3:
        dateformat = DateFormat.getTimeInstance(iTimeStyle, locale);
          goto _L5
        dateformat = DateFormat.getDateTimeInstance(iDateStyle, iTimeStyle, locale);
          goto _L5
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        return getFormatter(datetimeparserbucket.getLocale()).getParser0().parseInto(datetimeparserbucket, charsequence, i);
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        getFormatter(locale).getPrinter0().printTo(appendable, l, chronology, i, datetimezone, locale);
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        getFormatter(locale).getPrinter0().printTo(appendable, readablepartial, locale);
    }


    acheKey(int i, int j, int k)
    {
        iDateStyle = i;
        iTimeStyle = j;
        iType = k;
    }
}
