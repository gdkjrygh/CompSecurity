// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static class iValue
    implements InternalParser, InternalPrinter
{

    private final char iValue;

    public int estimateParsedLength()
    {
        return 1;
    }

    public int estimatePrintedLength()
    {
        return 1;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        if (i >= charsequence.length())
        {
            return ~i;
        }
        char c1 = charsequence.charAt(i);
        char c = iValue;
        if (c1 != c)
        {
            c1 = Character.toUpperCase(c1);
            c = Character.toUpperCase(c);
            if (c1 != c && Character.toLowerCase(c1) != Character.toLowerCase(c))
            {
                return ~i;
            }
        }
        return i + 1;
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        appendable.append(iValue);
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        appendable.append(iValue);
    }

    (char c)
    {
        iValue = c;
    }
}
