// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.nativeandroid.common.WLUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLResponse

public class WLProcedureInvocationResult extends WLResponse
{

    private static final String JSON_KEY_IS_SUCCESSFUL = "isSuccessful";
    private JSONObject jsonResult;

    WLProcedureInvocationResult(WLResponse wlresponse)
    {
        super(wlresponse);
    }

    public JSONObject getResult()
        throws JSONException
    {
        if (jsonResult == null)
        {
            jsonResult = WLUtils.convertStringToJSON(getResponseText());
        }
        return jsonResult;
    }

    public boolean isSuccessful()
    {
        boolean flag;
        try
        {
            flag = getResult().getBoolean("isSuccessful");
        }
        catch (JSONException jsonexception)
        {
            return false;
        }
        return flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WLProcedureInvocationResult [isSuccessful=").append(isSuccessful()).append(", result=").append(jsonResult).append("]").toString();
    }
}
