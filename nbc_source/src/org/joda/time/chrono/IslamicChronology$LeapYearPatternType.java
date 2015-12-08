// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.io.Serializable;

// Referenced classes of package org.joda.time.chrono:
//            IslamicChronology

public static class pattern
    implements Serializable
{

    private static final long serialVersionUID = 0x182cef79ec9aL;
    final byte index;
    final int pattern;

    private Object readResolve()
    {
        switch (index)
        {
        default:
            return this;

        case 0: // '\0'
            return IslamicChronology.LEAP_YEAR_15_BASED;

        case 1: // '\001'
            return IslamicChronology.LEAP_YEAR_16_BASED;

        case 2: // '\002'
            return IslamicChronology.LEAP_YEAR_INDIAN;

        case 3: // '\003'
            return IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof HASIB)
        {
            flag = flag1;
            if (index == ((index)obj).index)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return index;
    }

    boolean isLeapYear(int i)
    {
        return (1 << i % 30 & pattern) > 0;
    }

    (int i, int j)
    {
        index = (byte)i;
        pattern = j;
    }
}
