// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            DateTimePrinterInternalPrinter, DateTimeParserInternalParser, InternalPrinter, InternalParserDateTimeParser, 
//            InternalPrinterDateTimePrinter, DateTimeParserBucket, InternalParser, FormatUtils, 
//            DateTimePrinter, DateTimeParser

public class DateTimeFormatter
{

    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter datetimeprinter, DateTimeParser datetimeparser)
    {
        this(DateTimePrinterInternalPrinter.of(datetimeprinter), DateTimeParserInternalParser.of(datetimeparser));
    }

    DateTimeFormatter(InternalPrinter internalprinter, InternalParser internalparser)
    {
        iPrinter = internalprinter;
        iParser = internalparser;
        iLocale = null;
        iOffsetParsed = false;
        iChrono = null;
        iZone = null;
        iPivotYear = null;
        iDefaultYear = 2000;
    }

    private DateTimeFormatter(InternalPrinter internalprinter, InternalParser internalparser, Locale locale, boolean flag, Chronology chronology, DateTimeZone datetimezone, Integer integer, 
            int i)
    {
        iPrinter = internalprinter;
        iParser = internalparser;
        iLocale = locale;
        iOffsetParsed = flag;
        iChrono = chronology;
        iZone = datetimezone;
        iPivotYear = integer;
        iDefaultYear = i;
    }

    private void printTo(Appendable appendable, long l, Chronology chronology)
        throws IOException
    {
        InternalPrinter internalprinter = requirePrinter();
        Chronology chronology1 = selectChronology(chronology);
        DateTimeZone datetimezone = chronology1.getZone();
        int j = datetimezone.getOffset(l);
        long l2 = (long)j + l;
        long l1 = l2;
        int i = j;
        chronology = datetimezone;
        if ((l ^ l2) < 0L)
        {
            l1 = l2;
            i = j;
            chronology = datetimezone;
            if (((long)j ^ l) >= 0L)
            {
                chronology = DateTimeZone.UTC;
                i = 0;
                l1 = l;
            }
        }
        internalprinter.printTo(appendable, l1, chronology1.withUTC(), i, chronology, iLocale);
    }

    private InternalParser requireParser()
    {
        InternalParser internalparser = iParser;
        if (internalparser == null)
        {
            throw new UnsupportedOperationException("Parsing not supported");
        } else
        {
            return internalparser;
        }
    }

    private InternalPrinter requirePrinter()
    {
        InternalPrinter internalprinter = iPrinter;
        if (internalprinter == null)
        {
            throw new UnsupportedOperationException("Printing not supported");
        } else
        {
            return internalprinter;
        }
    }

    private Chronology selectChronology(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        if (iChrono != null)
        {
            chronology = iChrono;
        }
        Chronology chronology1 = chronology;
        if (iZone != null)
        {
            chronology1 = chronology.withZone(iZone);
        }
        return chronology1;
    }

    public Chronology getChronolgy()
    {
        return iChrono;
    }

    public Chronology getChronology()
    {
        return iChrono;
    }

    public int getDefaultYear()
    {
        return iDefaultYear;
    }

    public Locale getLocale()
    {
        return iLocale;
    }

    public DateTimeParser getParser()
    {
        return InternalParserDateTimeParser.of(iParser);
    }

    InternalParser getParser0()
    {
        return iParser;
    }

    public Integer getPivotYear()
    {
        return iPivotYear;
    }

    public DateTimePrinter getPrinter()
    {
        return InternalPrinterDateTimePrinter.of(iPrinter);
    }

    InternalPrinter getPrinter0()
    {
        return iPrinter;
    }

    public DateTimeZone getZone()
    {
        return iZone;
    }

    public boolean isOffsetParsed()
    {
        return iOffsetParsed;
    }

    public boolean isParser()
    {
        return iParser != null;
    }

    public boolean isPrinter()
    {
        return iPrinter != null;
    }

    public DateTime parseDateTime(String s)
    {
        Object obj;
        DateTimeParserBucket datetimeparserbucket;
        int j;
        InternalParser internalparser = requireParser();
        obj = selectChronology(null);
        datetimeparserbucket = new DateTimeParserBucket(0L, ((Chronology) (obj)), iLocale, iPivotYear, iDefaultYear);
        j = internalparser.parseInto(datetimeparserbucket, s, 0);
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i;
        long l;
        i = j;
        if (j < s.length())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        l = datetimeparserbucket.computeMillis(true, s);
        if (!iOffsetParsed || datetimeparserbucket.getOffsetInteger() == null) goto _L4; else goto _L3
_L3:
        s = ((Chronology) (obj)).withZone(DateTimeZone.forOffsetMillis(datetimeparserbucket.getOffsetInteger().intValue()));
_L5:
        obj = new DateTime(l, s);
        s = ((String) (obj));
        if (iZone != null)
        {
            s = ((DateTime) (obj)).withZone(iZone);
        }
        return s;
_L4:
        s = ((String) (obj));
        if (datetimeparserbucket.getZone() != null)
        {
            s = ((Chronology) (obj)).withZone(datetimeparserbucket.getZone());
        }
        if (true) goto _L5; else goto _L2
_L2:
        i = ~j;
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(s, i));
    }

    public int parseInto(ReadWritableInstant readwritableinstant, String s, int i)
    {
        Chronology chronology;
        DateTimeParserBucket datetimeparserbucket;
        InternalParser internalparser = requireParser();
        if (readwritableinstant == null)
        {
            throw new IllegalArgumentException("Instant must not be null");
        }
        long l = readwritableinstant.getMillis();
        chronology = readwritableinstant.getChronology();
        int j = DateTimeUtils.getChronology(chronology).year().get(l);
        long l1 = chronology.getZone().getOffset(l);
        chronology = selectChronology(chronology);
        datetimeparserbucket = new DateTimeParserBucket(l + l1, chronology, iLocale, iPivotYear, j);
        i = internalparser.parseInto(datetimeparserbucket, s, i);
        readwritableinstant.setMillis(datetimeparserbucket.computeMillis(false, s));
        if (!iOffsetParsed || datetimeparserbucket.getOffsetInteger() == null) goto _L2; else goto _L1
_L1:
        s = chronology.withZone(DateTimeZone.forOffsetMillis(datetimeparserbucket.getOffsetInteger().intValue()));
_L4:
        readwritableinstant.setChronology(s);
        if (iZone != null)
        {
            readwritableinstant.setZone(iZone);
        }
        return i;
_L2:
        s = chronology;
        if (datetimeparserbucket.getZone() != null)
        {
            s = chronology.withZone(datetimeparserbucket.getZone());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public LocalDate parseLocalDate(String s)
    {
        return parseLocalDateTime(s).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String s)
    {
        Chronology chronology;
        DateTimeParserBucket datetimeparserbucket;
        int j;
        InternalParser internalparser = requireParser();
        chronology = selectChronology(null).withUTC();
        datetimeparserbucket = new DateTimeParserBucket(0L, chronology, iLocale, iPivotYear, iDefaultYear);
        j = internalparser.parseInto(datetimeparserbucket, s, 0);
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i;
        long l;
        i = j;
        if (j < s.length())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        l = datetimeparserbucket.computeMillis(true, s);
        if (datetimeparserbucket.getOffsetInteger() == null) goto _L4; else goto _L3
_L3:
        s = chronology.withZone(DateTimeZone.forOffsetMillis(datetimeparserbucket.getOffsetInteger().intValue()));
_L5:
        return new LocalDateTime(l, s);
_L4:
        s = chronology;
        if (datetimeparserbucket.getZone() != null)
        {
            s = chronology.withZone(datetimeparserbucket.getZone());
        }
        if (true) goto _L5; else goto _L2
_L2:
        i = ~j;
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(s, i));
    }

    public LocalTime parseLocalTime(String s)
    {
        return parseLocalDateTime(s).toLocalTime();
    }

    public long parseMillis(String s)
    {
        InternalParser internalparser = requireParser();
        return (new DateTimeParserBucket(0L, selectChronology(iChrono), iLocale, iPivotYear, iDefaultYear)).doParseMillis(internalparser, s);
    }

    public MutableDateTime parseMutableDateTime(String s)
    {
        Chronology chronology;
        DateTimeParserBucket datetimeparserbucket;
        int j;
        InternalParser internalparser = requireParser();
        chronology = selectChronology(null);
        datetimeparserbucket = new DateTimeParserBucket(0L, chronology, iLocale, iPivotYear, iDefaultYear);
        j = internalparser.parseInto(datetimeparserbucket, s, 0);
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i;
        long l;
        i = j;
        if (j < s.length())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        l = datetimeparserbucket.computeMillis(true, s);
        if (!iOffsetParsed || datetimeparserbucket.getOffsetInteger() == null) goto _L4; else goto _L3
_L3:
        s = chronology.withZone(DateTimeZone.forOffsetMillis(datetimeparserbucket.getOffsetInteger().intValue()));
_L5:
        s = new MutableDateTime(l, s);
        if (iZone != null)
        {
            s.setZone(iZone);
        }
        return s;
_L4:
        s = chronology;
        if (datetimeparserbucket.getZone() != null)
        {
            s = chronology.withZone(datetimeparserbucket.getZone());
        }
        if (true) goto _L5; else goto _L2
_L2:
        i = ~j;
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(s, i));
    }

    public String print(long l)
    {
        StringBuilder stringbuilder = new StringBuilder(requirePrinter().estimatePrintedLength());
        try
        {
            printTo(stringbuilder, l);
        }
        catch (IOException ioexception) { }
        return stringbuilder.toString();
    }

    public String print(ReadableInstant readableinstant)
    {
        StringBuilder stringbuilder = new StringBuilder(requirePrinter().estimatePrintedLength());
        try
        {
            printTo(stringbuilder, readableinstant);
        }
        // Misplaced declaration of an exception variable
        catch (ReadableInstant readableinstant) { }
        return stringbuilder.toString();
    }

    public String print(ReadablePartial readablepartial)
    {
        StringBuilder stringbuilder = new StringBuilder(requirePrinter().estimatePrintedLength());
        try
        {
            printTo(stringbuilder, readablepartial);
        }
        // Misplaced declaration of an exception variable
        catch (ReadablePartial readablepartial) { }
        return stringbuilder.toString();
    }

    public void printTo(Writer writer, long l)
        throws IOException
    {
        printTo(((Appendable) (writer)), l);
    }

    public void printTo(Writer writer, ReadableInstant readableinstant)
        throws IOException
    {
        printTo(((Appendable) (writer)), readableinstant);
    }

    public void printTo(Writer writer, ReadablePartial readablepartial)
        throws IOException
    {
        printTo(((Appendable) (writer)), readablepartial);
    }

    public void printTo(Appendable appendable, long l)
        throws IOException
    {
        printTo(appendable, l, null);
    }

    public void printTo(Appendable appendable, ReadableInstant readableinstant)
        throws IOException
    {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableinstant), DateTimeUtils.getInstantChronology(readableinstant));
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial)
        throws IOException
    {
        InternalPrinter internalprinter = requirePrinter();
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("The partial must not be null");
        } else
        {
            internalprinter.printTo(appendable, readablepartial, iLocale);
            return;
        }
    }

    public void printTo(StringBuffer stringbuffer, long l)
    {
        try
        {
            printTo(((Appendable) (stringbuffer)), l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public void printTo(StringBuffer stringbuffer, ReadableInstant readableinstant)
    {
        try
        {
            printTo(((Appendable) (stringbuffer)), readableinstant);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public void printTo(StringBuffer stringbuffer, ReadablePartial readablepartial)
    {
        try
        {
            printTo(((Appendable) (stringbuffer)), readablepartial);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology)
    {
        if (iChrono == chronology)
        {
            return this;
        } else
        {
            return new DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, chronology, iZone, iPivotYear, iDefaultYear);
        }
    }

    public DateTimeFormatter withDefaultYear(int i)
    {
        return new DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, iChrono, iZone, iPivotYear, i);
    }

    public DateTimeFormatter withLocale(Locale locale)
    {
        if (locale == getLocale() || locale != null && locale.equals(getLocale()))
        {
            return this;
        } else
        {
            return new DateTimeFormatter(iPrinter, iParser, locale, iOffsetParsed, iChrono, iZone, iPivotYear, iDefaultYear);
        }
    }

    public DateTimeFormatter withOffsetParsed()
    {
        if (iOffsetParsed)
        {
            return this;
        } else
        {
            return new DateTimeFormatter(iPrinter, iParser, iLocale, true, iChrono, null, iPivotYear, iDefaultYear);
        }
    }

    public DateTimeFormatter withPivotYear(int i)
    {
        return withPivotYear(Integer.valueOf(i));
    }

    public DateTimeFormatter withPivotYear(Integer integer)
    {
        if (iPivotYear == integer || iPivotYear != null && iPivotYear.equals(integer))
        {
            return this;
        } else
        {
            return new DateTimeFormatter(iPrinter, iParser, iLocale, iOffsetParsed, iChrono, iZone, integer, iDefaultYear);
        }
    }

    public DateTimeFormatter withZone(DateTimeZone datetimezone)
    {
        if (iZone == datetimezone)
        {
            return this;
        } else
        {
            return new DateTimeFormatter(iPrinter, iParser, iLocale, false, iChrono, datetimezone, iPivotYear, iDefaultYear);
        }
    }

    public DateTimeFormatter withZoneUTC()
    {
        return withZone(DateTimeZone.UTC);
    }
}
