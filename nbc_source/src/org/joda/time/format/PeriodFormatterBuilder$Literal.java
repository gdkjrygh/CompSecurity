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
//            PeriodParser, PeriodPrinter, PeriodFormatterBuilder

static class iText
    implements PeriodParser, PeriodPrinter
{

    static final iText EMPTY = new <init>("");
    private final String iText;

    public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
    {
        return iText.length();
    }

    public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
    {
        return 0;
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
    {
        if (s.regionMatches(true, i, iText, 0, iText.length()))
        {
            return iText.length() + i;
        } else
        {
            return ~i;
        }
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
        throws IOException
    {
        writer.write(iText);
    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
    {
        stringbuffer.append(iText);
    }


    _cls9(String s)
    {
        iText = s;
    }
}
