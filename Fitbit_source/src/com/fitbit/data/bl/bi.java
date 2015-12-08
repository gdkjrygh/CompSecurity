// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.Arrays;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation, az, bs, e

public class bi extends SyncDataForLongPeriodOperation
{

    private final SyncDataForLongPeriodOperation.Ranges e;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType f[];

    public bi(bs bs, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[])
    {
        super(bs, ranges, true);
        e = ranges;
        f = atimeseriesresourcetype;
        a(bs);
        a(true);
        b(false);
    }

    protected e a(SyncDataForLongPeriodOperation.b b)
    {
        return new az(e(), false, b.b(), b.c(), f, e);
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
        super.a(a1);
    }

    public String c()
    {
        return (new StringBuilder()).append(super.c()).append("-").append(e).append(" types: ").append(Arrays.toString(f)).toString();
    }
}
