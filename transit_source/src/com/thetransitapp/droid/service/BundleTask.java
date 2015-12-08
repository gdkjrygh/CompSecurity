// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import android.location.Location;
import com.thetransitapp.droid.data.TransitSource;
import com.thetransitapp.droid.model.BundleResponse;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class BundleTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private boolean loadAll;
    private final Location location;

    public BundleTask(Context context, Location location1, boolean flag, ServiceCallback servicecallback)
    {
        super(context);
        location = location1;
        loadAll = flag;
        callback = servicecallback;
    }

    public BundleResponse call()
        throws Exception
    {
        return super.getTransitSource().loadBundle(location, loadAll);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    protected void onException(Exception exception)
    {
        callback.onError(exception.getMessage(), exception);
    }

    protected void onSuccess(BundleResponse bundleresponse)
        throws Exception
    {
        super.onSuccess(bundleresponse);
        callback.onResult(bundleresponse);
        if (loadAll)
        {
            loadAll = false;
            super.execute();
        }
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((BundleResponse)obj);
    }
}
