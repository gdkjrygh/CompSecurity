// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.repo.as;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            d, dm, aq, bs, 
//            ao, u

public class cz extends d
{

    private static final String a = "SyncHeartRateIntradayTimeSeriesAndSummaryOperation";
    private static final com.fitbit.serverinteraction.PublicAPI.DataRange b;
    private static final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType d;

    public cz(bs bs1, boolean flag, Date date)
    {
        super(bs1, flag, date);
    }

    private static String a(Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        return (new StringBuilder()).append(dm.a("SyncHeartRateIntradayTimeSeriesAndSummaryOperation", date)).append(datarange.toString()).toString();
    }

    private void a(List list, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        as as1 = aq.a().r();
        as1.runInTransaction(new _cls1(as1, as1.getByTypeForTime(timeseriesresourcetype, o.d(b()), o.f(b())), list));
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        while (a1.a() || !p.a(DeviceFeature.HEART_RATE)) 
        {
            return;
        }
        a1 = e().a().a(b(), b);
        a(e().b().a(a1, d, b()), d);
        a1 = e().b().w(a1);
        Date date = o.e(b());
        Date date1 = o.a(new Date(date.getTime() - b.a()));
        u.a().a(a1, date1, date);
    }

    public String c()
    {
        return a(b(), b);
    }

    public String d()
    {
        return "SyncHeartRateIntradayTimeSeriesAndSummaryOperation";
    }

    static 
    {
        b = com.fitbit.serverinteraction.PublicAPI.DataRange.c;
        d = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY;
    }

    /* member class not found */
    class _cls1 {}

}
