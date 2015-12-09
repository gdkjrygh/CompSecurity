// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.data.domain.p;
import com.fitbit.data.repo.ak;
import com.fitbit.e.a;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            aq

public class am
{
    private static class a
    {

        public static am a = new am();


        private a()
        {
        }
    }


    private static final String a = "PedometerMinuteDataBusinessLogic";
    private ak b;

    private am()
    {
        b = com.fitbit.data.bl.aq.a().D();
    }


    public static am a()
    {
        return com.fitbit.data.bl.a.a;
    }

    public List a(long l)
    {
        return b.getMinuteDataStartingFrom(l);
    }

    public List a(Date date)
    {
        return b.getPendingPedometerMinutesDataForDate(date);
    }

    public void a(PedometerMinuteData pedometerminutedata)
    {
        b.save(pedometerminutedata);
    }

    public p b(Date date)
    {
        return b.getDailySummary(date);
    }

    public List b()
    {
        return b.getAll();
    }

    public void b(PedometerMinuteData pedometerminutedata)
    {
        long l = pedometerminutedata.a();
        if ((PedometerMinuteData)b.getById(l) == null)
        {
            pedometerminutedata.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION);
            b.add(pedometerminutedata);
            com.fitbit.e.a.a("PedometerMinuteDataBusinessLogic", "Added record timestamp: %s, as date:%s", new Object[] {
                Long.valueOf(l), new Date(l)
            });
            return;
        } else
        {
            com.fitbit.e.a.a("PedometerMinuteDataBusinessLogic", "Skipped record timestamp: %s, as date: %s", new Object[] {
                Long.valueOf(l), new Date(l)
            });
            return;
        }
    }

    public List c()
    {
        return b.getPendingEntries();
    }

    public void d()
    {
        b.clearCachedDailySummary();
    }

    public void e()
    {
        b.clear(false);
    }
}
