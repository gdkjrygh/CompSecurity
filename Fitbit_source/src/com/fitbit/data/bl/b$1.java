// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Alarm;
import java.util.Calendar;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.bl:
//            b

class nstance
    implements Comparator
{

    Calendar a;
    Calendar b;
    final b c;

    public int a(Alarm alarm, Alarm alarm1)
    {
        a.setTime(alarm.h());
        b.setTime(alarm1.h());
        int j = Integer.valueOf(a.get(11)).compareTo(Integer.valueOf(b.get(11)));
        int i = j;
        if (j == 0)
        {
            i = Integer.valueOf(a.get(12)).compareTo(Integer.valueOf(b.get(12)));
        }
        j = i;
        if (i == 0)
        {
            j = Integer.valueOf(a.get(13)).compareTo(Integer.valueOf(b.get(13)));
        }
        return j;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Alarm)obj, (Alarm)obj1);
    }

    Alarm(b b1)
    {
        c = b1;
        super();
        a = Calendar.getInstance();
        b = Calendar.getInstance();
    }
}
