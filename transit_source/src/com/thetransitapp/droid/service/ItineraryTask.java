// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import com.thetransitapp.droid.data.TransitSource;
import com.thetransitapp.droid.model.ScheduleItem;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class ItineraryTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private final ScheduleItem scheduleItem;

    public ItineraryTask(Context context, ScheduleItem scheduleitem, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a0055);
        scheduleItem = scheduleitem;
        callback = servicecallback;
    }

    public ScheduleItem call()
        throws Exception
    {
        return super.getTransitSource().loadDetails(scheduleItem);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    protected void onSuccess(ScheduleItem scheduleitem)
        throws Exception
    {
        super.onSuccess(scheduleitem);
        callback.onResult(null);
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((ScheduleItem)obj);
    }
}
