// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import com.thetransitapp.droid.data.TransitSource;
import com.thetransitapp.droid.model.DetailRequest;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class ItinerariesTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private final DetailRequest request;

    public ItinerariesTask(Context context, DetailRequest detailrequest, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a0055);
        request = detailrequest;
        callback = servicecallback;
    }

    public DetailRequest call()
        throws Exception
    {
        return super.getTransitSource().loadDetails(request);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    protected void onSuccess(DetailRequest detailrequest)
        throws Exception
    {
        super.onSuccess(detailrequest);
        callback.onResult(null);
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((DetailRequest)obj);
    }
}
