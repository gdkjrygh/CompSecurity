// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.WLUtils;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLResponse, WLErrorCode, WLRequestOptions

public class WLFailResponse extends WLResponse
{

    private static final String JSON_KEY_ERROR_CODE = "errorCode";
    private static final String JSON_KEY_ERROR_MSG = "errorMsg";
    protected WLErrorCode errorCode;
    protected String errorMsg;

    public WLFailResponse(WLErrorCode wlerrorcode, String s, WLRequestOptions wlrequestoptions)
    {
        super(500, "", wlrequestoptions);
        setErrorCode(wlerrorcode);
        setErrorMsg(s);
    }

    public WLFailResponse(WLResponse wlresponse)
    {
        super(wlresponse);
        parseErrorFromResponse();
    }

    public WLFailResponse(HttpResponse httpresponse)
    {
        super(httpresponse);
        parseErrorFromResponse();
    }

    private void parseErrorFromResponse()
    {
        if (getResponseText() == null || getResponseText().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        JSONObject jsonobject = WLUtils.convertStringToJSON(getResponseText());
        errorCode = WLErrorCode.UNEXPECTED_ERROR;
        if (jsonobject.has("errorCode"))
        {
            errorCode = WLErrorCode.valueOf(jsonobject.getString("errorCode"));
        }
        if (jsonobject.has("errorMsg"))
        {
            errorMsg = jsonobject.getString("errorMsg");
        }
_L1:
        return;
        JSONException jsonexception;
        jsonexception;
        WLUtils.error(String.format("Cannot retrieve errorCode message from response. Response text is:%s'", new Object[] {
            getResponseText()
        }), jsonexception);
        errorCode = WLErrorCode.UNEXPECTED_ERROR;
        if (getStatus() >= 500)
        {
            errorCode = WLErrorCode.UNRESPONSIVE_HOST;
            return;
        }
        if (getStatus() >= 408)
        {
            errorCode = WLErrorCode.REQUEST_TIMEOUT;
            return;
        }
          goto _L1
    }

    public WLErrorCode getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMsg()
    {
        if (errorMsg == null)
        {
            return errorCode.getDescription();
        } else
        {
            return errorMsg;
        }
    }

    public void setErrorCode(WLErrorCode wlerrorcode)
    {
        errorCode = wlerrorcode;
    }

    public void setErrorMsg(String s)
    {
        errorMsg = s;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(super.toString()))).append(" WLFailResponse [errorMsg=").append(errorMsg).append(", errorCode=").append(errorCode).append("]").toString();
    }
}
