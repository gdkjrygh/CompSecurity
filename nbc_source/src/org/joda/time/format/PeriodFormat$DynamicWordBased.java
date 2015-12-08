// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodParser, PeriodPrinter, PeriodFormat, PeriodFormatter

static class iFormatter
    implements PeriodParser, PeriodPrinter
{

    private final PeriodFormatter iFormatter;

    private PeriodParser getParser(Locale locale)
    {
        if (locale != null && !locale.equals(iFormatter.getLocale()))
        {
            return PeriodFormat.wordBased(locale).getParser();
        } else
        {
            return iFormatter.getParser();
        }
    }

    private PeriodPrinter getPrinter(Locale locale)
    {
        if (locale != null && !locale.equals(iFormatter.getLocale()))
        {
            return PeriodFormat.wordBased(locale).getPrinter();
        } else
        {
            return iFormatter.getPrinter();
        }
    }

    public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
    {
        return getPrinter(locale).calculatePrintedLength(readableperiod, locale);
    }

    public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
    {
        return getPrinter(locale).countFieldsToPrint(readableperiod, i, locale);
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
    {
        return getParser(locale).parseInto(readwritableperiod, s, i, locale);
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
        throws IOException
    {
        getPrinter(locale).printTo(writer, readableperiod, locale);
    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
    {
        getPrinter(locale).printTo(stringbuffer, readableperiod, locale);
    }

    (PeriodFormatter periodformatter)
    {
        iFormatter = periodformatter;
    }
}
