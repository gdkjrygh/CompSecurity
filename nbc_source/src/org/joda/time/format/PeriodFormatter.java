// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodParser, FormatUtils, PeriodPrinter

public class PeriodFormatter
{

    private final Locale iLocale;
    private final PeriodType iParseType;
    private final PeriodParser iParser;
    private final PeriodPrinter iPrinter;

    public PeriodFormatter(PeriodPrinter periodprinter, PeriodParser periodparser)
    {
        iPrinter = periodprinter;
        iParser = periodparser;
        iLocale = null;
        iParseType = null;
    }

    PeriodFormatter(PeriodPrinter periodprinter, PeriodParser periodparser, Locale locale, PeriodType periodtype)
    {
        iPrinter = periodprinter;
        iParser = periodparser;
        iLocale = locale;
        iParseType = periodtype;
    }

    private void checkParser()
    {
        if (iParser == null)
        {
            throw new UnsupportedOperationException("Parsing not supported");
        } else
        {
            return;
        }
    }

    private void checkPeriod(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            throw new IllegalArgumentException("Period must not be null");
        } else
        {
            return;
        }
    }

    private void checkPrinter()
    {
        if (iPrinter == null)
        {
            throw new UnsupportedOperationException("Printing not supported");
        } else
        {
            return;
        }
    }

    public Locale getLocale()
    {
        return iLocale;
    }

    public PeriodType getParseType()
    {
        return iParseType;
    }

    public PeriodParser getParser()
    {
        return iParser;
    }

    public PeriodPrinter getPrinter()
    {
        return iPrinter;
    }

    public boolean isParser()
    {
        return iParser != null;
    }

    public boolean isPrinter()
    {
        return iPrinter != null;
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i)
    {
        checkParser();
        checkPeriod(readwritableperiod);
        return getParser().parseInto(readwritableperiod, s, i, iLocale);
    }

    public MutablePeriod parseMutablePeriod(String s)
    {
        checkParser();
        MutablePeriod mutableperiod = new MutablePeriod(0L, iParseType);
        int j = getParser().parseInto(mutableperiod, s, 0, iLocale);
        int i;
        if (j >= 0)
        {
            i = j;
            if (j >= s.length())
            {
                return mutableperiod;
            }
        } else
        {
            i = ~j;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(s, i));
    }

    public Period parsePeriod(String s)
    {
        checkParser();
        return parseMutablePeriod(s).toPeriod();
    }

    public String print(ReadablePeriod readableperiod)
    {
        checkPrinter();
        checkPeriod(readableperiod);
        PeriodPrinter periodprinter = getPrinter();
        StringBuffer stringbuffer = new StringBuffer(periodprinter.calculatePrintedLength(readableperiod, iLocale));
        periodprinter.printTo(stringbuffer, readableperiod, iLocale);
        return stringbuffer.toString();
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod)
        throws IOException
    {
        checkPrinter();
        checkPeriod(readableperiod);
        getPrinter().printTo(writer, readableperiod, iLocale);
    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod)
    {
        checkPrinter();
        checkPeriod(readableperiod);
        getPrinter().printTo(stringbuffer, readableperiod, iLocale);
    }

    public PeriodFormatter withLocale(Locale locale)
    {
        if (locale == getLocale() || locale != null && locale.equals(getLocale()))
        {
            return this;
        } else
        {
            return new PeriodFormatter(iPrinter, iParser, locale, iParseType);
        }
    }

    public PeriodFormatter withParseType(PeriodType periodtype)
    {
        if (periodtype == iParseType)
        {
            return this;
        } else
        {
            return new PeriodFormatter(iPrinter, iParser, iLocale, periodtype);
        }
    }
}
