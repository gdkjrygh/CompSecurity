// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            d, dg, ez, dm, 
//            bs, ao, u

final class cy extends d
{

    private static final String a = "SyncHeartRateDailySummaryOperation";
    private final com.fitbit.serverinteraction.PublicAPI.DataRange b;

    public cy(bs bs1, boolean flag, Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        super(bs1, flag, date);
        b = datarange;
    }

    public static void a(Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        date = b(date, datarange);
        dg.d().c().d(date);
    }

    private static String b(Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        return (new StringBuilder()).append(dm.a("SyncHeartRateDailySummaryOperation", date)).append(datarange.toString()).toString();
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        while (a1.a() || !p.a(DeviceFeature.HEART_RATE)) 
        {
            return;
        }
        a1 = e().a().a(b(), b);
        a1 = e().b().w(a1);
        Date date = o.e(b());
        Date date1 = o.a(new Date(date.getTime() - b.a()));
        u.a().a(a1, date1, date);
    }

    public String c()
    {
        return b(b(), b);
    }

    public String d()
    {
        return "SyncHeartRateDailySummaryOperation";
    }
}
