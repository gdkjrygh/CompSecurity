// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodParser, PeriodPrinter, PeriodFormatterBuilder

static class iParsers
    implements PeriodParser, PeriodPrinter
{

    private final PeriodParser iParsers[];
    private final PeriodPrinter iPrinters[];

    private void addArrayToList(List list, Object aobj[])
    {
        if (aobj != null)
        {
            for (int i = 0; i < aobj.length; i++)
            {
                list.add(aobj[i]);
            }

        }
    }

    private void decompose(List list, List list1, List list2)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            Object obj = list.get(i);
            if (obj instanceof PeriodPrinter)
            {
                if (obj instanceof iParsers)
                {
                    addArrayToList(list1, ((addArrayToList)obj).iPrinters);
                } else
                {
                    list1.add(obj);
                }
            }
            obj = list.get(i + 1);
            if (obj instanceof PeriodParser)
            {
                if (obj instanceof iPrinters)
                {
                    addArrayToList(list2, ((addArrayToList)obj).iParsers);
                } else
                {
                    list2.add(obj);
                }
            }
            i += 2;
        }
    }

    public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
    {
        int i = 0;
        PeriodPrinter aperiodprinter[] = iPrinters;
        int j = aperiodprinter.length;
        do
        {
            j--;
            if (j >= 0)
            {
                i += aperiodprinter[j].calculatePrintedLength(readableperiod, locale);
            } else
            {
                return i;
            }
        } while (true);
    }

    public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
    {
        int j = 0;
        PeriodPrinter aperiodprinter[] = iPrinters;
        int k = aperiodprinter.length;
        do
        {
            if (j >= i)
            {
                break;
            }
            k--;
            if (k < 0)
            {
                break;
            }
            j += aperiodprinter[k].countFieldsToPrint(readableperiod, 0x7fffffff, locale);
        } while (true);
        return j;
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
    {
        PeriodParser aperiodparser[] = iParsers;
        if (aperiodparser == null)
        {
            throw new UnsupportedOperationException();
        }
        int k = aperiodparser.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
        {
            j = aperiodparser[i].parseInto(readwritableperiod, s, j, locale);
        }

        return j;
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
        throws IOException
    {
        PeriodPrinter aperiodprinter[] = iPrinters;
        int j = aperiodprinter.length;
        for (int i = 0; i < j; i++)
        {
            aperiodprinter[i].printTo(writer, readableperiod, locale);
        }

    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
    {
        PeriodPrinter aperiodprinter[] = iPrinters;
        int j = aperiodprinter.length;
        for (int i = 0; i < j; i++)
        {
            aperiodprinter[i].printTo(stringbuffer, readableperiod, locale);
        }

    }

    (List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        decompose(list, arraylist, arraylist1);
        if (arraylist.size() <= 0)
        {
            iPrinters = null;
        } else
        {
            iPrinters = (PeriodPrinter[])arraylist.toArray(new PeriodPrinter[arraylist.size()]);
        }
        if (arraylist1.size() <= 0)
        {
            iParsers = null;
            return;
        } else
        {
            iParsers = (PeriodParser[])arraylist1.toArray(new PeriodParser[arraylist1.size()]);
            return;
        }
    }
}
