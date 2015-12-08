// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import com.thetransitapp.droid.data.TransitSource;
import com.thetransitapp.droid.model.ScheduleRequest;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class SchedulesTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private final ScheduleRequest request;

    public SchedulesTask(Context context, ScheduleRequest schedulerequest, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a0056);
        request = schedulerequest;
        callback = servicecallback;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        return super.getTransitSource().fullSchedules(request);
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((List)obj);
    }

    protected void onSuccess(List list)
        throws Exception
    {
        super.onSuccess(list);
        callback.onResult(list);
    }
}
