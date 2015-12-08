// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.LogEntry;
import com.fitbit.data.domain.WaterLogDaySummary;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.aw;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ab, aq, ao, l, 
//            EntityMerger

public class gb
    implements ab
{

    private static gb a;
    private final aw b;
    private final as c;
    private final PublicAPI d = new PublicAPI(ServerGateway.a());
    private final ao e = new ao();

    private gb()
    {
        aq aq1 = aq.a();
        b = aq1.h();
        c = aq1.r();
    }

    public static gb a()
    {
        com/fitbit/data/bl/gb;
        JVM INSTR monitorenter ;
        gb gb1;
        if (a == null)
        {
            a = new gb();
        }
        gb1 = a;
        com/fitbit/data/bl/gb;
        JVM INSTR monitorexit ;
        return gb1;
        Exception exception;
        exception;
        throw exception;
    }

    public List a(Date date)
    {
        return b.getByDate(date, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public List a(Date date, Date date1)
    {
        return b.getEntriesBetweenDates(date, date1, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public volatile void a(LogEntry logentry, Context context)
    {
        a((WaterLogEntry)logentry, context);
    }

    public void a(WaterLogEntry waterlogentry, Context context)
    {
        l.a(waterlogentry, context);
    }

    public void a(List list, Context context)
    {
        l.a(list, context);
    }

    public WaterLogDaySummary b(Date date)
    {
        date = o.a(date);
        return (WaterLogDaySummary)c.getByTypeAfterDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER, date);
    }

    public List b()
    {
        return c.getByType(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER);
    }

    public List c(Date date)
        throws ServerCommunicationException, JSONException
    {
        org.json.JSONObject jsonobject = d.a(date);
        return e.a(date, jsonobject);
    }

    public List d(Date date)
        throws ServerCommunicationException, JSONException
    {
        aw aw1 = aq.a().h();
        List list = c(date);
        (new EntityMerger(list, aw1, new _cls1(date))).a();
        return list;
    }

    /* member class not found */
    class _cls1 {}

}
