// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.WLUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLFailResponse, WLResponse

public final class WLProcedureInvocationFailResponse extends WLFailResponse
{

    private static final String JSON_KEY_ERROR_MESSAGES = "errors";
    private JSONObject jsonResult;

    public WLProcedureInvocationFailResponse(WLFailResponse wlfailresponse)
    {
        super(wlfailresponse);
        setErrorCode(wlfailresponse.getErrorCode());
        setErrorMsg(wlfailresponse.getErrorMsg());
    }

    public WLProcedureInvocationFailResponse(WLResponse wlresponse)
    {
        super(wlresponse);
    }

    public WLProcedureInvocationFailResponse(HttpResponse httpresponse)
    {
        super(httpresponse);
    }

    public JSONObject getJSONResult()
        throws JSONException
    {
        return getResult();
    }

    public List getProcedureInvocationErrors()
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = arraylist;
        if (getResult() != null)
        {
            obj = arraylist;
            try
            {
                if (getResult().get("errors") != null)
                {
                    obj = WLUtils.convertJSONArrayToList(getResult().getJSONArray("errors"));
                }
            }
            catch (JSONException jsonexception)
            {
                return arraylist;
            }
        }
        return ((List) (obj));
    }

    public JSONObject getResult()
        throws JSONException
    {
        if (jsonResult == null && responseText != null && responseText.length() > 0)
        {
            jsonResult = WLUtils.convertStringToJSON(responseText);
        }
        return jsonResult;
    }
}
