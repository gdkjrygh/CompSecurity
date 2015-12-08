// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.thetransitapp.droid.data.OnlinePlannerSource;
import com.thetransitapp.droid.model.RoutingRequest;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class RoutingTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private ConnectivityManager connectivityManager;
    private final RoutingRequest request;

    public RoutingTask(Context context, RoutingRequest routingrequest, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a004d);
        request = routingrequest;
        callback = servicecallback;
    }

    public RoutingRequest call()
        throws Exception
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnectedOrConnecting())
        {
            return super.getPlannerSource().fetchRoutingItineraries(request);
        } else
        {
            request.setError(com.thetransitapp.droid.model.RoutingRequest.ErrorType.NO_INTERNET);
            return request;
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    protected void onSuccess(RoutingRequest routingrequest)
        throws Exception
    {
        super.onSuccess(routingrequest);
        callback.onResult(routingrequest);
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((RoutingRequest)obj);
    }
}
