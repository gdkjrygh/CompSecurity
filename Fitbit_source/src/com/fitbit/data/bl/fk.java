// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.p;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, SyncDataForDayOperation, er, 
//            cv, bb, bd, az, 
//            df, bs

public class fk extends e
{

    private static final String a = "SyncTrackerOperation";

    public fk(bs bs)
    {
        super(bs, true);
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        dg.d();
        a1 = new Date();
        if (p.a(DeviceFeature.SLEEP))
        {
            SyncDataForDayOperation.a(a1, SyncDataForDayOperation.f);
            er.a(a1);
        }
        cv.b();
        bb.a(a1);
        bd.a(a1);
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[] = new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[5];
        atimeseriesresourcetype[0] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS;
        atimeseriesresourcetype[1] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES;
        atimeseriesresourcetype[2] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS;
        atimeseriesresourcetype[3] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE;
        atimeseriesresourcetype[4] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE;
        int j = atimeseriesresourcetype.length;
        for (int i = 0; i < j; i++)
        {
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = atimeseriesresourcetype[i];
            az.a(a1, new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[] {
                timeseriesresourcetype
            });
            df.a(a1, timeseriesresourcetype);
        }

    }

    public String c()
    {
        return "SyncTrackerOperation";
    }
}
