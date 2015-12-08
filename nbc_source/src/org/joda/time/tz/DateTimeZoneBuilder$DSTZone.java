// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iEndRecurrence extends DateTimeZone
{

    private static final long serialVersionUID = 0x605522c6413e57d1L;
    final ce iEndRecurrence;
    final int iStandardOffset;
    final ce iStartRecurrence;

    private ce findMatchingRecurrence(long l)
    {
        ce ce1;
        int i = iStandardOffset;
        ce ce = iStartRecurrence;
        ce1 = iEndRecurrence;
        long l1;
        long l2;
        try
        {
            l1 = ce.next(l, i, ce1.getSaveMillis());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            l1 = l;
        }
        catch (ArithmeticException arithmeticexception)
        {
            l1 = l;
        }
        l2 = ce1.next(l, i, ce.getSaveMillis());
        l = l2;
_L2:
        if (l1 > l)
        {
            return ce;
        } else
        {
            return ce1;
        }
        Object obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ce.getSaveMillis readFrom(DataInput datainput, String s)
        throws IOException
    {
        return new <init>(s, (int)DateTimeZoneBuilder.readMillis(datainput), ce.readFrom(datainput), ce.readFrom(datainput));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof ce.readFrom)
            {
                if (!getID().equals(((getID) (obj = (getID)obj)).getID()) || iStandardOffset != ((iStandardOffset) (obj)).iStandardOffset || !iStartRecurrence.equals(((ce.equals) (obj)).iStartRecurrence) || !iEndRecurrence.equals(((ce.equals) (obj)).iEndRecurrence))
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

    public String getNameKey(long l)
    {
        return findMatchingRecurrence(l).getNameKey();
    }

    public int getOffset(long l)
    {
        return iStandardOffset + findMatchingRecurrence(l).getSaveMillis();
    }

    public int getStandardOffset(long l)
    {
        return iStandardOffset;
    }

    public boolean isFixed()
    {
        return false;
    }

    public long nextTransition(long l)
    {
        ce ce;
        ce ce1;
        int i;
        i = iStandardOffset;
        ce = iStartRecurrence;
        ce1 = iEndRecurrence;
        long l2 = ce.next(l, i, ce1.getSaveMillis());
        long l1;
        l1 = l2;
        if (l > 0L)
        {
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = l;
            }
        }
_L1:
label0:
        {
            Object obj;
            long l3;
            try
            {
                l3 = ce1.next(l, i, ce.getSaveMillis());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                break label0;
            }
            catch (ArithmeticException arithmeticexception)
            {
                break label0;
            }
            if (l <= 0L || l3 >= 0L)
            {
                l = l3;
            }
        }
        if (l1 > l)
        {
            return l;
        } else
        {
            return l1;
        }
        obj;
        l1 = l;
          goto _L1
        obj;
        l1 = l;
          goto _L1
    }

    public long previousTransition(long l)
    {
        ce ce;
        ce ce1;
        int i;
        l++;
        i = iStandardOffset;
        ce = iStartRecurrence;
        ce1 = iEndRecurrence;
        long l2 = ce.previous(l, i, ce1.getSaveMillis());
        long l1;
        l1 = l2;
        if (l < 0L)
        {
            l1 = l2;
            if (l2 > 0L)
            {
                l1 = l;
            }
        }
_L1:
label0:
        {
            Object obj;
            long l3;
            try
            {
                l3 = ce1.previous(l, i, ce.getSaveMillis());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                break label0;
            }
            catch (ArithmeticException arithmeticexception)
            {
                break label0;
            }
            if (l >= 0L || l3 <= 0L)
            {
                l = l3;
            }
        }
        l3 = l;
        if (l1 > l)
        {
            l3 = l1;
        }
        return l3 - 1L;
        obj;
        l1 = l;
          goto _L1
        obj;
        l1 = l;
          goto _L1
    }

    public void writeTo(DataOutput dataoutput)
        throws IOException
    {
        DateTimeZoneBuilder.writeMillis(dataoutput, iStandardOffset);
        iStartRecurrence.writeTo(dataoutput);
        iEndRecurrence.writeTo(dataoutput);
    }

    ce(String s, int i, ce ce, ce ce1)
    {
        super(s);
        iStandardOffset = i;
        iStartRecurrence = ce;
        iEndRecurrence = ce1;
    }
}
