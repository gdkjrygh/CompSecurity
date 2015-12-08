// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient, WLProcedureInvocationFailResponse, WLFailResponse, WLRequestOptions, 
//            WLResponseListener, WLProcedureInvocationResult, WLErrorCode, WLResponse

class this._cls0
    implements WLRequestListener
{

    final WLClient this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLProcedureInvocationFailResponse wlprocedureinvocationfailresponse = new WLProcedureInvocationFailResponse(wlfailresponse);
        wlfailresponse.getOptions().getResponseListener().onFailure(wlprocedureinvocationfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLProcedureInvocationResult wlprocedureinvocationresult = new WLProcedureInvocationResult(wlresponse);
        if (wlprocedureinvocationresult.isSuccessful())
        {
            wlprocedureinvocationresult.getOptions().getResponseListener().onSuccess(wlprocedureinvocationresult);
        } else
        {
            wlresponse = new WLProcedureInvocationFailResponse(wlresponse);
            wlresponse.setErrorCode(WLErrorCode.PROCEDURE_ERROR);
            wlresponse.getOptions().getResponseListener().onFailure(wlresponse);
        }
        Logger.processAutomaticTrigger();
    }

    ()
    {
        this$0 = WLClient.this;
        super();
    }
}
