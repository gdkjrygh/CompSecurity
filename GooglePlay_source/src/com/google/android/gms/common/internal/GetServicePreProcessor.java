// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.GCoreServiceIdUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            ServiceConnection, GetServiceRequest, IGmsCallbacks

public abstract class GetServicePreProcessor
{

    protected final Context mContext;

    protected GetServicePreProcessor(Context context)
    {
        mContext = context;
    }

    protected final void logAndCallback(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest, int i, PendingIntent pendingintent)
        throws RemoteException
    {
        (new ServiceConnection(getservicerequest.clientVersion, getservicerequest.callingPackage, GCoreServiceIdUtil.toLoggingServiceId(getservicerequest.serviceId))).logOnce(mContext, i);
        getservicerequest = null;
        if (pendingintent != null)
        {
            getservicerequest = new Bundle();
            getservicerequest.putParcelable("pendingIntent", pendingintent);
        }
        igmscallbacks.onPostInitComplete(i, null, getservicerequest);
    }

    public abstract boolean process(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException;
}
