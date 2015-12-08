// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.platform.PlatformInitOptions;
import java.util.Map;

// Referenced classes of package com.addlive.impl:
//            ADLNativeWrapperImpl, Log, ServiceResponse, BaseResultAdapter

class data
    implements Runnable
{

    private String data;
    final ADLNativeWrapperImpl this$0;

    public void run()
    {
        Log.v("AddLive_SDK", (new StringBuilder("Got a result: ")).append(data).toString());
        if (ADLNativeWrapperImpl.access$500(ADLNativeWrapperImpl.this).isInteractionsLoggingEnabled())
        {
            ADLNativeWrapperImpl.access$500(ADLNativeWrapperImpl.this).getInteractionsLogTag();
            (new StringBuilder("[App <---- SDK] Result: ")).append(data);
        }
        ServiceResponse serviceresponse;
        BaseResultAdapter baseresultadapter;
        serviceresponse = new ServiceResponse(data);
        baseresultadapter = (BaseResultAdapter)ADLNativeWrapperImpl.access$600(ADLNativeWrapperImpl.this).get(serviceresponse.getId());
        if (baseresultadapter != null)
        {
            try
            {
                baseresultadapter.handleResponse(serviceresponse);
                ADLNativeWrapperImpl.access$600(ADLNativeWrapperImpl.this).remove(serviceresponse.getId());
                return;
            }
            catch (Throwable throwable)
            {
                Log.e("AddLive_SDK", "Unknown error passing result: ", throwable);
            }
            break MISSING_BLOCK_LABEL_144;
        }
        Log.e("AddLive_SDK", "Cannot pass the result as there is no result handler for request with given id.");
        return;
    }

    public (String s)
    {
        this$0 = ADLNativeWrapperImpl.this;
        super();
        data = s;
    }
}
