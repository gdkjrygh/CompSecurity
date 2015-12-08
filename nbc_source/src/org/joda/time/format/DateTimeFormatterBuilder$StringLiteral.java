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

    private final String iValue;

    public int estimateParsedLength()
    {
        return iValue.length();
    }

    public int estimatePrintedLength()
    {
        return iValue.length();
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charsequence, i, iValue))
        {
            return iValue.length() + i;
        } else
        {
            return ~i;
        }
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

    A(String s)
    {
        iValue = s;
    }
}
