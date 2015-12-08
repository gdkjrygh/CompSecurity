// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.util.GCoreServiceIdUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServicePostProcessor, GetServiceRequest, ServiceConnection

public final class LoggingPostProcessor extends GetServicePostProcessor
{

    public LoggingPostProcessor(Context context)
    {
        super(context);
    }

    public final boolean process$18b81057(GetServiceRequest getservicerequest, int i)
    {
        boolean flag;
        if (GCoreServiceIdUtil.toLoggingServiceId(getservicerequest.serviceId) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            (new ServiceConnection(getservicerequest.clientVersion, getservicerequest.callingPackage, GCoreServiceIdUtil.toLoggingServiceId(getservicerequest.serviceId))).logOnce(mContext, i);
        }
        return true;
    }
}
