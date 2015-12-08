// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.p;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation, ep, bs, e

public class eo extends SyncDataForLongPeriodOperation
{

    private final SyncDataForLongPeriodOperation.Ranges e;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType f[];

    public eo(bs bs, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[])
    {
        super(bs, ranges, flag);
        e = ranges;
        f = atimeseriesresourcetype;
        a(bs);
        a(true);
    }

    protected e a(SyncDataForLongPeriodOperation.b b)
    {
        return new ep(e(), c, b.b(), b.c(), f);
    }

    protected void a(bs bs)
    {
        if (f != null)
        {
            super.a(bs);
        }
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        if (p.a(DeviceFeature.SLEEP))
        {
            super.a(a1);
        }
    }

    public String c()
    {
        return (new StringBuilder()).append(super.c()).append("-").append(e).toString();
    }
}
