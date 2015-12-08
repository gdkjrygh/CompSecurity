// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.domain:
//            SleepLogEntry, MinutesAsleepIntraday

public class t
{

    public t()
    {
    }

    public static Pair a(SleepLogEntry sleeplogentry, int i)
    {
        if (sleeplogentry == null)
        {
            return new Pair(Integer.valueOf(0), Integer.valueOf(0));
        }
        List list = sleeplogentry.r();
        if (list == null)
        {
            return new Pair(Integer.valueOf(0), Integer.valueOf(0));
        }
        ArrayList arraylist = new ArrayList();
        Date date1 = new Date(sleeplogentry.a().getTime() + (long)sleeplogentry.f() * 60000L);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MinutesAsleepIntraday minutesasleepintraday1 = (MinutesAsleepIntraday)iterator.next();
            if (minutesasleepintraday1.a().compareTo(date1) >= 0)
            {
                arraylist.add(minutesasleepintraday1);
            }
        } while (true);
        int l = 0;
        int k = 0;
        int j = 0;
        while (l < list.size()) 
        {
            MinutesAsleepIntraday minutesasleepintraday = (MinutesAsleepIntraday)list.get(l);
            if (minutesasleepintraday.e() == i)
            {
                Date date;
                int i1;
                long l1;
                if (l < list.size() - 1)
                {
                    date = ((MinutesAsleepIntraday)list.get(l + 1)).a();
                } else
                {
                    date = new Date(sleeplogentry.a().getTime() + (long)sleeplogentry.e());
                }
                l1 = k;
                i1 = (int)((date.getTime() - minutesasleepintraday.a().getTime()) / 60000L + l1);
                k = j + 1;
                j = i1;
            } else
            {
                int j1 = j;
                j = k;
                k = j1;
            }
            l++;
            i1 = k;
            k = j;
            j = i1;
        }
        return new Pair(Integer.valueOf(j), Integer.valueOf(k));
    }
}
