// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iUpperOfYear
{

    private static final int YEAR_LIMIT;
    private String iInitialNameKey;
    private int iInitialSaveMillis;
    private ArrayList iRules;
    private int iStandardOffset;
    private eUTC iUpperOfYear;
    private int iUpperYear;

    public void addRule(iUpperOfYear iupperofyear)
    {
        if (!iRules.contains(iupperofyear))
        {
            iRules.add(iupperofyear);
        }
    }

    public iRules buildTailZone(String s)
    {
        if (iRules.size() == 2)
        {
            ce ce = (iRules)iRules.get(0);
            ce ce1 = (iRules)iRules.get(1);
            if (ce.ToYear() == 0x7fffffff && ce1.ToYear() == 0x7fffffff)
            {
                return new <init>(s, iStandardOffset, ce.currence, ce1.currence);
            }
        }
        return null;
    }

    public on firstTransition(long l)
    {
        on on;
        ArrayList arraylist;
        int i;
        long l1;
        if (iInitialNameKey != null)
        {
            return new on(l, iInitialNameKey, iStandardOffset + iInitialSaveMillis, iStandardOffset);
        }
        arraylist = new ArrayList(iRules);
        l1 = 0x8000000000000000L;
        i = 0;
        on = null;
_L7:
        Object obj;
        on on1;
        on1 = nextTransition(l1, i);
        obj = on;
        if (on1 == null) goto _L2; else goto _L1
_L1:
        l1 = on1.getMillis();
        if (l1 != l) goto _L4; else goto _L3
_L3:
        obj = new on(l, on1);
_L2:
        iRules = arraylist;
        return ((on) (obj));
_L4:
        Object obj1;
label0:
        {
            if (l1 <= l)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = on;
            if (on != null)
            {
                break label0;
            }
            obj = arraylist.iterator();
            do
            {
                obj1 = on;
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                obj1 = (on)((Iterator) (obj)).next();
            } while (((on) (obj1)).SaveMillis() != 0);
            obj1 = new on(l, ((on) (obj1)), iStandardOffset);
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = new on(l, on1.getNameKey(), iStandardOffset, iStandardOffset);
        }
        if (true) goto _L2; else goto _L5
_L5:
        on = new on(l, on1);
        i = on1.getSaveMillis();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int getStandardOffset()
    {
        return iStandardOffset;
    }

    public long getUpperLimit(int i)
    {
        if (iUpperYear == 0x7fffffff)
        {
            return 0x7fffffffffffffffL;
        } else
        {
            return iUpperOfYear.etInstant(iUpperYear, iStandardOffset, i);
        }
    }

    public on nextTransition(long l, int i)
    {
        ISOChronology isochronology = ISOChronology.getInstanceUTC();
        long l1 = 0x7fffffffffffffffL;
        Iterator iterator = iRules.iterator();
        on on = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            on on1 = (iRules)iterator.next();
            long l2 = on1.t(l, iStandardOffset, i);
            if (l2 <= l)
            {
                iterator.remove();
            } else
            if (l2 <= l1)
            {
                on = on1;
                l1 = l2;
            }
        } while (true);
        while (on == null || isochronology.year().get(l1) >= YEAR_LIMIT || iUpperYear < 0x7fffffff && l1 >= iUpperOfYear.etInstant(iUpperYear, iStandardOffset, i)) 
        {
            return null;
        }
        return new on(l1, on, iStandardOffset);
    }

    public void setFixedSavings(String s, int i)
    {
        iInitialNameKey = s;
        iInitialSaveMillis = i;
    }

    public void setStandardOffset(int i)
    {
        iStandardOffset = i;
    }

    public void setUpperLimit(int i, iStandardOffset istandardoffset)
    {
        iUpperYear = i;
        iUpperOfYear = istandardoffset;
    }

    static 
    {
        long l = DateTimeUtils.currentTimeMillis();
        YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(l) + 100;
    }

    on()
    {
        iRules = new ArrayList(10);
        iUpperYear = 0x7fffffff;
    }

    iUpperYear(iUpperYear iupperyear)
    {
        iStandardOffset = iupperyear.iStandardOffset;
        iRules = new ArrayList(iupperyear.iRules);
        iInitialNameKey = iupperyear.iInitialNameKey;
        iInitialSaveMillis = iupperyear.iInitialSaveMillis;
        iUpperYear = iupperyear.iUpperYear;
        iUpperOfYear = iupperyear.iUpperOfYear;
    }
}
