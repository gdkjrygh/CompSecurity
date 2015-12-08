// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static class iShort
    implements InternalParser, InternalPrinter
{

    private static Map cParseCache = new ConcurrentHashMap();
    private final DateTimeFieldType iFieldType;
    private final boolean iShort;

    private String print(long l, Chronology chronology, Locale locale)
    {
        chronology = iFieldType.getField(chronology);
        if (iShort)
        {
            return chronology.getAsShortText(l, locale);
        } else
        {
            return chronology.getAsText(l, locale);
        }
    }

    private String print(ReadablePartial readablepartial, Locale locale)
    {
        if (readablepartial.isSupported(iFieldType))
        {
            DateTimeField datetimefield = iFieldType.getField(readablepartial.getChronology());
            if (iShort)
            {
                return datetimefield.getAsShortText(readablepartial, locale);
            } else
            {
                return datetimefield.getAsText(readablepartial, locale);
            }
        } else
        {
            return "\uFFFD";
        }
    }

    public int estimateParsedLength()
    {
        return estimatePrintedLength();
    }

    public int estimatePrintedLength()
    {
        return !iShort ? 20 : 6;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        Locale locale = datetimeparserbucket.getLocale();
        Object obj = (Map)cParseCache.get(locale);
        if (obj == null)
        {
            obj = new ConcurrentHashMap();
            cParseCache.put(locale, obj);
        }
        Object obj1 = ((Object) ((Object[])((Map) (obj)).get(iFieldType)));
        int j;
        if (obj1 == null)
        {
            obj1 = new ConcurrentHashMap(32);
            org.joda.time.tField tfield = (new MutableDateTime(0L, DateTimeZone.UTC)).property(iFieldType);
            j = tfield.ValueOverall();
            int l = tfield.ValueOverall();
            if (l - j > 32)
            {
                return ~i;
            }
            int k = tfield.TextLength(locale);
            for (; j <= l; j++)
            {
                tfield.TextLength(j);
                ((Map) (obj1)).put(tfield.Text(locale), Boolean.TRUE);
                ((Map) (obj1)).put(tfield.Text(locale).toLowerCase(locale), Boolean.TRUE);
                ((Map) (obj1)).put(tfield.Text(locale).toUpperCase(locale), Boolean.TRUE);
                ((Map) (obj1)).put(tfield.Text(locale), Boolean.TRUE);
                ((Map) (obj1)).put(tfield.Text(locale).toLowerCase(locale), Boolean.TRUE);
                ((Map) (obj1)).put(tfield.Text(locale).toUpperCase(locale), Boolean.TRUE);
            }

            j = k;
            if ("en".equals(locale.getLanguage()))
            {
                j = k;
                if (iFieldType == DateTimeFieldType.era())
                {
                    ((Map) (obj1)).put("BCE", Boolean.TRUE);
                    ((Map) (obj1)).put("bce", Boolean.TRUE);
                    ((Map) (obj1)).put("CE", Boolean.TRUE);
                    ((Map) (obj1)).put("ce", Boolean.TRUE);
                    j = 3;
                }
            }
            ((Map) (obj)).put(iFieldType, ((Object) (new Object[] {
                obj1, Integer.valueOf(j)
            })));
            obj = obj1;
        } else
        {
            obj = (Map)obj1[0];
            j = ((Integer)obj1[1]).intValue();
        }
        for (j = Math.min(charsequence.length(), j + i); j > i; j--)
        {
            obj1 = charsequence.subSequence(i, j).toString();
            if (((Map) (obj)).containsKey(obj1))
            {
                datetimeparserbucket.saveField(iFieldType, ((String) (obj1)), locale);
                return j;
            }
        }

        return ~i;
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        try
        {
            appendable.append(print(l, chronology, locale));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Chronology chronology)
        {
            appendable.append('\uFFFD');
        }
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        try
        {
            appendable.append(print(readablepartial, locale));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReadablePartial readablepartial)
        {
            appendable.append('\uFFFD');
        }
    }


    (DateTimeFieldType datetimefieldtype, boolean flag)
    {
        iFieldType = datetimefieldtype;
        iShort = flag;
    }
}
