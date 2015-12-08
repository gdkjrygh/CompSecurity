// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLProcedureInvocationResult, WLResponse

public class WLProcedureInvocationResponse extends WLProcedureInvocationResult
{

    public WLProcedureInvocationResponse(WLResponse wlresponse)
    {
        super(wlresponse);
    }

    public JSONObject getJSONResult()
        throws JSONException
    {
        return super.getResult();
    }
}
