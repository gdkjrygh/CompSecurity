// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.thetransitapp.droid.data.TransitSource;
import com.thetransitapp.droid.model.NearbyRoutesRequest;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class NearbyRoutesTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private ConnectivityManager connectivityManager;
    private final NearbyRoutesRequest request;

    public NearbyRoutesTask(Context context, NearbyRoutesRequest nearbyroutesrequest, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a0054);
        request = nearbyroutesrequest;
        callback = servicecallback;
    }

    public NearbyRoutesRequest call()
        throws Exception
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnectedOrConnecting())
        {
            return super.getTransitSource().loadNearbyRoutes(request);
        } else
        {
            request.setError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.NO_INTERNET);
            return request;
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    protected void onException(Exception exception)
    {
        if (exception instanceof TimeoutException)
        {
            request.setError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.TIMEOUT);
            callback.onResult(request);
            return;
        } else
        {
            super.onException(exception);
            return;
        }
    }

    protected void onSuccess(NearbyRoutesRequest nearbyroutesrequest)
        throws Exception
    {
        super.onSuccess(nearbyroutesrequest);
        callback.onResult(nearbyroutesrequest);
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((NearbyRoutesRequest)obj);
    }
}
