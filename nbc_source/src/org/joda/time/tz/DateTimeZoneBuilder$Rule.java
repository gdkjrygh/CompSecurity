// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iToYear
{

    final int iFromYear;
    final rence iRecurrence;
    final int iToYear;

    public int getFromYear()
    {
        return iFromYear;
    }

    public String getNameKey()
    {
        return iRecurrence.getNameKey();
    }

    public r getOfYear()
    {
        return iRecurrence.getOfYear();
    }

    public int getSaveMillis()
    {
        return iRecurrence.getSaveMillis();
    }

    public int getToYear()
    {
        return iToYear;
    }

    public long next(long l, int i, int j)
    {
        ISOChronology isochronology = ISOChronology.getInstanceUTC();
        int i1 = i + j;
        int k;
        long l1;
        if (l == 0x8000000000000000L)
        {
            k = 0x80000000;
        } else
        {
            k = isochronology.year().get((long)i1 + l);
        }
        if (k < iFromYear)
        {
            l1 = isochronology.year().set(0L, iFromYear) - (long)i1 - 1L;
        } else
        {
            l1 = l;
        }
        l1 = iRecurrence.next(l1, i, j);
        if (l1 > l && isochronology.year().get((long)i1 + l1) > iToYear)
        {
            return l;
        } else
        {
            return l1;
        }
    }

    rence(rence rence, int i, int j)
    {
        iRecurrence = rence;
        iFromYear = i;
        iToYear = j;
    }
}
