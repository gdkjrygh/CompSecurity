// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalPrinter, InternalPrinterDateTimePrinter, DateTimePrinter

class DateTimePrinterInternalPrinter
    implements InternalPrinter
{

    private final DateTimePrinter underlying;

    private DateTimePrinterInternalPrinter(DateTimePrinter datetimeprinter)
    {
        underlying = datetimeprinter;
    }

    static InternalPrinter of(DateTimePrinter datetimeprinter)
    {
        if (datetimeprinter instanceof InternalPrinterDateTimePrinter)
        {
            return (InternalPrinter)datetimeprinter;
        }
        if (datetimeprinter == null)
        {
            return null;
        } else
        {
            return new DateTimePrinterInternalPrinter(datetimeprinter);
        }
    }

    public int estimatePrintedLength()
    {
        return underlying.estimatePrintedLength();
    }

    DateTimePrinter getUnderlying()
    {
        return underlying;
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        if (appendable instanceof StringBuffer)
        {
            StringBuffer stringbuffer = (StringBuffer)appendable;
            underlying.printTo(stringbuffer, l, chronology, i, datetimezone, locale);
        }
        if (appendable instanceof Writer)
        {
            Writer writer = (Writer)appendable;
            underlying.printTo(writer, l, chronology, i, datetimezone, locale);
        }
        StringBuffer stringbuffer1 = new StringBuffer(estimatePrintedLength());
        underlying.printTo(stringbuffer1, l, chronology, i, datetimezone, locale);
        appendable.append(stringbuffer1);
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        if (appendable instanceof StringBuffer)
        {
            StringBuffer stringbuffer = (StringBuffer)appendable;
            underlying.printTo(stringbuffer, readablepartial, locale);
        }
        if (appendable instanceof Writer)
        {
            Writer writer = (Writer)appendable;
            underlying.printTo(writer, readablepartial, locale);
        }
        StringBuffer stringbuffer1 = new StringBuffer(estimatePrintedLength());
        underlying.printTo(stringbuffer1, readablepartial, locale);
        appendable.append(stringbuffer1);
    }
}
