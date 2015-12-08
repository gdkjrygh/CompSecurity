// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.TreeSet;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodParser, PeriodPrinter, PeriodFormatterBuilder

static class iUseAfter
    implements PeriodParser, PeriodPrinter
{

    private volatile PeriodParser iAfterParser;
    private volatile PeriodPrinter iAfterPrinter;
    private final PeriodParser iBeforeParser;
    private final PeriodPrinter iBeforePrinter;
    private final String iFinalText;
    private final String iParsedForms[];
    private final String iText;
    private final boolean iUseAfter;
    private final boolean iUseBefore;

    public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
    {
        PeriodPrinter periodprinter;
        PeriodPrinter periodprinter1;
        int i;
        periodprinter = iBeforePrinter;
        periodprinter1 = iAfterPrinter;
        i = periodprinter.calculatePrintedLength(readableperiod, locale) + periodprinter1.calculatePrintedLength(readableperiod, locale);
        if (!iUseBefore) goto _L2; else goto _L1
_L1:
        int j = i;
        if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) <= 0) goto _L4; else goto _L3
_L3:
        if (!iUseAfter) goto _L6; else goto _L5
_L5:
        j = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
        if (j > 0)
        {
            if (j > 1)
            {
                readableperiod = iText;
            } else
            {
                readableperiod = iFinalText;
            }
            i = readableperiod.length() + i;
        }
        j = i;
_L4:
        return j;
_L6:
        return i + iText.length();
_L2:
        j = i;
        if (iUseAfter)
        {
            j = i;
            if (periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
            {
                return i + iText.length();
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
    {
        int k = iBeforePrinter.countFieldsToPrint(readableperiod, i, locale);
        int j = k;
        if (k < i)
        {
            j = k + iAfterPrinter.countFieldsToPrint(readableperiod, i, locale);
        }
        return j;
    }

    iAfterPrinter finish(PeriodPrinter periodprinter, PeriodParser periodparser)
    {
        iAfterPrinter = periodprinter;
        iAfterParser = periodparser;
        return this;
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
    {
        int j;
        int k;
        int l;
        l = 1;
        k = 0;
        j = iBeforeParser.parseInto(readwritableperiod, s, i, locale);
        if (j < 0)
        {
            return j;
        }
        if (j <= i)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        String as[] = iParsedForms;
        int i1 = as.length;
        i = 0;
        do
        {
            if (i >= i1)
            {
                break MISSING_BLOCK_LABEL_200;
            }
            String s1 = as[i];
            if (s1 == null || s1.length() == 0 || s.regionMatches(true, j, s1, 0, s1.length()))
            {
                if (s1 == null)
                {
                    i = k;
                } else
                {
                    i = s1.length();
                }
                j += i;
                k = i;
                i = l;
                break MISSING_BLOCK_LABEL_112;
            }
            i++;
        } while (true);
_L2:
        l = iAfterParser.parseInto(readwritableperiod, s, j, locale);
        if (l < 0)
        {
            return l;
        }
        if (i != 0 && l == j && k > 0)
        {
            return ~j;
        }
        if (l > j && i == 0 && !iUseBefore)
        {
            return ~j;
        } else
        {
            return l;
        }
        i = 0;
        k = -1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
        throws IOException
    {
        PeriodPrinter periodprinter;
        PeriodPrinter periodprinter1;
        periodprinter = iBeforePrinter;
        periodprinter1 = iAfterPrinter;
        periodprinter.printTo(writer, readableperiod, locale);
        if (!iUseBefore) goto _L2; else goto _L1
_L1:
        if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) > 0)
        {
            if (iUseAfter)
            {
                int i = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
                if (i > 0)
                {
                    String s;
                    if (i > 1)
                    {
                        s = iText;
                    } else
                    {
                        s = iFinalText;
                    }
                    writer.write(s);
                }
            } else
            {
                writer.write(iText);
            }
        }
_L4:
        periodprinter1.printTo(writer, readableperiod, locale);
        return;
_L2:
        if (iUseAfter && periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
        {
            writer.write(iText);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
    {
        PeriodPrinter periodprinter;
        PeriodPrinter periodprinter1;
        periodprinter = iBeforePrinter;
        periodprinter1 = iAfterPrinter;
        periodprinter.printTo(stringbuffer, readableperiod, locale);
        if (!iUseBefore) goto _L2; else goto _L1
_L1:
        if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) > 0)
        {
            if (iUseAfter)
            {
                int i = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
                if (i > 0)
                {
                    String s;
                    if (i > 1)
                    {
                        s = iText;
                    } else
                    {
                        s = iFinalText;
                    }
                    stringbuffer.append(s);
                }
            } else
            {
                stringbuffer.append(iText);
            }
        }
_L4:
        periodprinter1.printTo(stringbuffer, readableperiod, locale);
        return;
_L2:
        if (iUseAfter && periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
        {
            stringbuffer.append(iText);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }



    (String s, String s1, String as[], PeriodPrinter periodprinter, PeriodParser periodparser, boolean flag, boolean flag1)
    {
        iText = s;
        iFinalText = s1;
        if ((s1 == null || s.equals(s1)) && (as == null || as.length == 0))
        {
            iParsedForms = (new String[] {
                s
            });
        } else
        {
            TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
            treeset.add(s);
            treeset.add(s1);
            if (as != null)
            {
                int i = as.length;
                do
                {
                    i--;
                    if (i < 0)
                    {
                        break;
                    }
                    treeset.add(as[i]);
                } while (true);
            }
            s = new ArrayList(treeset);
            Collections.reverse(s);
            iParsedForms = (String[])s.toArray(new String[s.size()]);
        }
        iBeforePrinter = periodprinter;
        iBeforeParser = periodparser;
        iUseBefore = flag;
        iUseAfter = flag1;
    }
}
