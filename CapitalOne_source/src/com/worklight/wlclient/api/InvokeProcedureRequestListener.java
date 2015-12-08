// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLProcedureInvocationFailResponse, WLFailResponse, WLRequestOptions, WLResponseListener, 
//            WLProcedureInvocationResult, WLErrorCode, WLResponse

class InvokeProcedureRequestListener
    implements WLRequestListener
{

    InvokeProcedureRequestListener()
    {
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLProcedureInvocationFailResponse wlprocedureinvocationfailresponse = new WLProcedureInvocationFailResponse(wlfailresponse);
        wlfailresponse.getOptions().getResponseListener().onFailure(wlprocedureinvocationfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLProcedureInvocationFailResponse wlprocedureinvocationfailresponse;
        try
        {
            WLProcedureInvocationResult wlprocedureinvocationresult = new WLProcedureInvocationResult(wlresponse);
            if (wlprocedureinvocationresult.isSuccessful())
            {
                wlprocedureinvocationresult.getOptions().getResponseListener().onSuccess(wlprocedureinvocationresult);
                return;
            }
        }
        catch (Exception exception)
        {
            wlresponse = new WLProcedureInvocationFailResponse(wlresponse);
            wlresponse.setErrorCode(WLErrorCode.UNEXPECTED_ERROR);
            wlresponse.setErrorMsg(String.format("Error processing response. Error is '%s'.", new Object[] {
                exception.getMessage()
            }));
            wlresponse.getOptions().getResponseListener().onFailure(wlresponse);
            return;
        }
        wlprocedureinvocationfailresponse = new WLProcedureInvocationFailResponse(wlresponse);
        wlprocedureinvocationfailresponse.setErrorCode(WLErrorCode.PROCEDURE_ERROR);
        wlprocedureinvocationfailresponse.getOptions().getResponseListener().onFailure(wlprocedureinvocationfailresponse);
        return;
    }
}
