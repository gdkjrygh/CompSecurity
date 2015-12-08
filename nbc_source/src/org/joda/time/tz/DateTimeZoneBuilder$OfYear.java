// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iMillisOfDay
{

    final boolean iAdvance;
    final int iDayOfMonth;
    final int iDayOfWeek;
    final int iMillisOfDay;
    final char iMode;
    final int iMonthOfYear;

    static iMillisOfDay readFrom(DataInput datainput)
        throws IOException
    {
        return new <init>((char)datainput.readUnsignedByte(), datainput.readUnsignedByte(), datainput.readByte(), datainput.readUnsignedByte(), datainput.readBoolean(), (int)DateTimeZoneBuilder.readMillis(datainput));
    }

    private long setDayOfMonth(Chronology chronology, long l)
    {
        if (iDayOfMonth >= 0)
        {
            return chronology.dayOfMonth().set(l, iDayOfMonth);
        } else
        {
            l = chronology.dayOfMonth().set(l, 1);
            l = chronology.monthOfYear().add(l, 1);
            return chronology.dayOfMonth().add(l, iDayOfMonth);
        }
    }

    private long setDayOfMonthNext(Chronology chronology, long l)
    {
        long l1;
        try
        {
            l1 = setDayOfMonth(chronology, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (iMonthOfYear == 2 && iDayOfMonth == 29)
            {
                for (; !chronology.year().isLeap(l); l = chronology.year().add(l, 1)) { }
                return setDayOfMonth(chronology, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    private long setDayOfMonthPrevious(Chronology chronology, long l)
    {
        long l1;
        try
        {
            l1 = setDayOfMonth(chronology, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (iMonthOfYear == 2 && iDayOfMonth == 29)
            {
                for (; !chronology.year().isLeap(l); l = chronology.year().add(l, -1)) { }
                return setDayOfMonth(chronology, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    private long setDayOfWeek(Chronology chronology, long l)
    {
        int k;
        long l1;
        int i = chronology.dayOfWeek().get(l);
        k = iDayOfWeek - i;
        l1 = l;
        if (k == 0) goto _L2; else goto _L1
_L1:
        if (!iAdvance) goto _L4; else goto _L3
_L3:
        int j;
        j = k;
        if (k < 0)
        {
            j = k + 7;
        }
_L6:
        l1 = chronology.dayOfWeek().add(l, j);
_L2:
        return l1;
_L4:
        j = k;
        if (k > 0)
        {
            j = k - 7;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof iAdvance)
            {
                if (iMode != ((iMode) (obj = (iMode)obj)).iMode || iMonthOfYear != ((iMonthOfYear) (obj)).iMonthOfYear || iDayOfMonth != ((iDayOfMonth) (obj)).iDayOfMonth || iDayOfWeek != ((iDayOfWeek) (obj)).iDayOfWeek || iAdvance != ((iAdvance) (obj)).iAdvance || iMillisOfDay != ((iMillisOfDay) (obj)).iMillisOfDay)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public long next(long l, int i, int j)
    {
        ISOChronology isochronology;
        long l1;
        long l2;
        if (iMode == 'w')
        {
            i += j;
        } else
        if (iMode != 's')
        {
            i = 0;
        }
        l2 = (long)i + l;
        isochronology = ISOChronology.getInstanceUTC();
        l = isochronology.monthOfYear().set(l2, iMonthOfYear);
        l = isochronology.millisOfDay().set(l, 0);
        l1 = setDayOfMonthNext(isochronology, isochronology.millisOfDay().add(l, iMillisOfDay));
        if (iDayOfWeek == 0)
        {
            l = l1;
            if (l1 <= l2)
            {
                l = setDayOfMonthNext(isochronology, isochronology.year().add(l1, 1));
            }
        } else
        {
            l1 = setDayOfWeek(isochronology, l1);
            l = l1;
            if (l1 <= l2)
            {
                l = isochronology.year().add(l1, 1);
                l = setDayOfWeek(isochronology, setDayOfMonthNext(isochronology, isochronology.monthOfYear().set(l, iMonthOfYear)));
            }
        }
        return l - (long)i;
    }

    public long previous(long l, int i, int j)
    {
        ISOChronology isochronology;
        long l1;
        long l2;
        if (iMode == 'w')
        {
            i += j;
        } else
        if (iMode != 's')
        {
            i = 0;
        }
        l2 = (long)i + l;
        isochronology = ISOChronology.getInstanceUTC();
        l = isochronology.monthOfYear().set(l2, iMonthOfYear);
        l = isochronology.millisOfDay().set(l, 0);
        l1 = setDayOfMonthPrevious(isochronology, isochronology.millisOfDay().add(l, iMillisOfDay));
        if (iDayOfWeek == 0)
        {
            l = l1;
            if (l1 >= l2)
            {
                l = setDayOfMonthPrevious(isochronology, isochronology.year().add(l1, -1));
            }
        } else
        {
            l1 = setDayOfWeek(isochronology, l1);
            l = l1;
            if (l1 >= l2)
            {
                l = isochronology.year().add(l1, -1);
                l = setDayOfWeek(isochronology, setDayOfMonthPrevious(isochronology, isochronology.monthOfYear().set(l, iMonthOfYear)));
            }
        }
        return l - (long)i;
    }

    public long setInstant(int i, int j, int k)
    {
        if (iMode != 'w') goto _L2; else goto _L1
_L1:
        j += k;
_L4:
        ISOChronology isochronology = ISOChronology.getInstanceUTC();
        long l = isochronology.year().set(0L, i);
        l = isochronology.monthOfYear().set(l, iMonthOfYear);
        long l1 = setDayOfMonth(isochronology, isochronology.millisOfDay().set(l, iMillisOfDay));
        l = l1;
        if (iDayOfWeek != 0)
        {
            l = setDayOfWeek(isochronology, l1);
        }
        return l - (long)j;
_L2:
        if (iMode != 's')
        {
            j = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeTo(DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeByte(iMode);
        dataoutput.writeByte(iMonthOfYear);
        dataoutput.writeByte(iDayOfMonth);
        dataoutput.writeByte(iDayOfWeek);
        dataoutput.writeBoolean(iAdvance);
        DateTimeZoneBuilder.writeMillis(dataoutput, iMillisOfDay);
    }

    (char c, int i, int j, int k, boolean flag, int l)
    {
        if (c != 'u' && c != 'w' && c != 's')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown mode: ").append(c).toString());
        } else
        {
            iMode = c;
            iMonthOfYear = i;
            iDayOfMonth = j;
            iDayOfWeek = k;
            iAdvance = flag;
            iMillisOfDay = l;
            return;
        }
    }
}
