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
//            DateTimePrinter, InternalPrinter, DateTimePrinterInternalPrinter

class InternalPrinterDateTimePrinter
    implements DateTimePrinter, InternalPrinter
{

    private final InternalPrinter underlying;

    private InternalPrinterDateTimePrinter(InternalPrinter internalprinter)
    {
        underlying = internalprinter;
    }

    static DateTimePrinter of(InternalPrinter internalprinter)
    {
        if (internalprinter instanceof DateTimePrinterInternalPrinter)
        {
            return ((DateTimePrinterInternalPrinter)internalprinter).getUnderlying();
        }
        if (internalprinter instanceof DateTimePrinter)
        {
            return (DateTimePrinter)internalprinter;
        }
        if (internalprinter == null)
        {
            return null;
        } else
        {
            return new InternalPrinterDateTimePrinter(internalprinter);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof InternalPrinterDateTimePrinter)
        {
            obj = (InternalPrinterDateTimePrinter)obj;
            return underlying.equals(((InternalPrinterDateTimePrinter) (obj)).underlying);
        } else
        {
            return false;
        }
    }

    public int estimatePrintedLength()
    {
        return underlying.estimatePrintedLength();
    }

    public void printTo(Writer writer, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        underlying.printTo(writer, l, chronology, i, datetimezone, locale);
    }

    public void printTo(Writer writer, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        underlying.printTo(writer, readablepartial, locale);
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        underlying.printTo(appendable, l, chronology, i, datetimezone, locale);
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        underlying.printTo(appendable, readablepartial, locale);
    }

    public void printTo(StringBuffer stringbuffer, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
    {
        try
        {
            underlying.printTo(stringbuffer, l, chronology, i, datetimezone, locale);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }

    public void printTo(StringBuffer stringbuffer, ReadablePartial readablepartial, Locale locale)
    {
        try
        {
            underlying.printTo(stringbuffer, readablepartial, locale);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            return;
        }
    }
}
