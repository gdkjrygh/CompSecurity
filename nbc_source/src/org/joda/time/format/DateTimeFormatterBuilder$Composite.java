// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static class iParsedLengthEstimate
    implements InternalParser, InternalPrinter
{

    private final int iParsedLengthEstimate;
    private final InternalParser iParsers[];
    private final int iPrintedLengthEstimate;
    private final InternalPrinter iPrinters[];

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
            if (obj instanceof iParsedLengthEstimate)
            {
                addArrayToList(list1, ((addArrayToList)obj).iPrinters);
            } else
            {
                list1.add(obj);
            }
            obj = list.get(i + 1);
            if (obj instanceof iPrinters)
            {
                addArrayToList(list2, ((addArrayToList)obj).iParsers);
            } else
            {
                list2.add(obj);
            }
            i += 2;
        }
    }

    public int estimateParsedLength()
    {
        return iParsedLengthEstimate;
    }

    public int estimatePrintedLength()
    {
        return iPrintedLengthEstimate;
    }

    boolean isParser()
    {
        return iParsers != null;
    }

    boolean isPrinter()
    {
        return iPrinters != null;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        InternalParser ainternalparser[] = iParsers;
        if (ainternalparser == null)
        {
            throw new UnsupportedOperationException();
        }
        int k = ainternalparser.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
        {
            j = ainternalparser[i].parseInto(datetimeparserbucket, charsequence, j);
        }

        return j;
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        InternalPrinter ainternalprinter[] = iPrinters;
        if (ainternalprinter == null)
        {
            throw new UnsupportedOperationException();
        }
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        int k = ainternalprinter.length;
        for (int j = 0; j < k; j++)
        {
            ainternalprinter[j].printTo(appendable, l, chronology, i, datetimezone, locale);
        }

    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        InternalPrinter ainternalprinter[] = iPrinters;
        if (ainternalprinter == null)
        {
            throw new UnsupportedOperationException();
        }
        Locale locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        int j = ainternalprinter.length;
        for (int i = 0; i < j; i++)
        {
            ainternalprinter[i].printTo(appendable, readablepartial, locale1);
        }

    }

    (List list)
    {
        boolean flag = false;
        super();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        decompose(list, arraylist1, arraylist);
        if (arraylist1.contains(null) || arraylist1.isEmpty())
        {
            iPrinters = null;
            iPrintedLengthEstimate = 0;
        } else
        {
            int i1 = arraylist1.size();
            iPrinters = new InternalPrinter[i1];
            int i = 0;
            int k = 0;
            for (; i < i1; i++)
            {
                list = (InternalPrinter)arraylist1.get(i);
                k += list.estimatePrintedLength();
                iPrinters[i] = list;
            }

            iPrintedLengthEstimate = k;
        }
        if (arraylist.contains(null) || arraylist.isEmpty())
        {
            iParsers = null;
            iParsedLengthEstimate = 0;
            return;
        }
        int j1 = arraylist.size();
        iParsers = new InternalParser[j1];
        int l = 0;
        for (int j = ((flag) ? 1 : 0); j < j1; j++)
        {
            list = (InternalParser)arraylist.get(j);
            l += list.estimateParsedLength();
            iParsers[j] = list;
        }

        iParsedLengthEstimate = l;
    }
}
