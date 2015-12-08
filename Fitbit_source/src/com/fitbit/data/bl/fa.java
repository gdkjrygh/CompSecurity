// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.repo.z;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            fb, aq, bs

public abstract class fa extends fb
{

    public fa(bs bs, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, boolean flag)
    {
        super(bs, timeseriesresourcetype, date, date1, flag);
    }

    public fa(bs bs, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, boolean flag)
    {
        super(bs, timeseriesresourcetype, flag);
    }

    protected abstract ValueGoal a(Date date);

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        super.a(a1);
        aq.a().k().runInTransaction(new _cls1());
    }

    /* member class not found */
    class _cls1 {}

}
