// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.content.Context;
import android.location.Location;
import com.thetransitapp.droid.data.TransitSource;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask, ServiceCallback

public class LegalNoticeTask extends BaseServiceTask
{

    private final ServiceCallback callback;
    private Location location;

    public LegalNoticeTask(Context context, Location location1, ServiceCallback servicecallback)
    {
        super(context, 0x7f0a0057);
        location = location1;
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
        return super.getTransitSource().loadLegal(location);
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
