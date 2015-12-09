// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import java.util.Calendar;
import java.util.Comparator;

// Referenced classes of package com.fitbit.util.chart:
//            a

static final class a
    implements Comparator
{

    final er.Type a;

    public int a(Calendar calendar, Calendar calendar1)
    {
        int i;
        int j;
        i = 1;
        j = Integer.valueOf(calendar.get(1)).compareTo(Integer.valueOf(calendar1.get(1)));
        b[a.ordinal()];
        JVM INSTR tableswitch 1 18: default 120
    //                   1 125
    //                   2 125
    //                   3 125
    //                   4 125
    //                   5 125
    //                   6 125
    //                   7 125
    //                   8 125
    //                   9 125
    //                   10 125
    //                   11 125
    //                   12 152
    //                   13 152
    //                   14 152
    //                   15 152
    //                   16 152
    //                   17 194
    //                   18 194;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L4 _L4
_L1:
        i = j;
_L8:
        return i;
_L2:
        if (j != 0) goto _L1; else goto _L5
_L5:
        return Integer.valueOf(calendar.get(6)).compareTo(Integer.valueOf(calendar1.get(6)));
_L3:
        if (j != 0) goto _L1; else goto _L6
_L6:
        long l;
        l = Math.abs(calendar.getTimeInMillis() - calendar1.getTimeInMillis());
        if (Math.abs(l) < 0x240c8400L)
        {
            return 0;
        }
        if (l >= 0L) goto _L8; else goto _L7
_L7:
        return -1;
_L4:
        return Integer.valueOf(calendar.get(2)).compareTo(Integer.valueOf(calendar1.get(2)));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Calendar)obj, (Calendar)obj1);
    }

    er.Type(er.Type type)
    {
        a = type;
        super();
    }
}
