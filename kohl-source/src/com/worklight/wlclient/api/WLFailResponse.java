// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import org.apache.http.HttpResponse;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLResponse, WLErrorCode, WLRequestOptions

public class WLFailResponse extends WLResponse
{

    private static final String JSON_KEY_ERROR_CODE = "errorCode";
    private static final String JSON_KEY_ERROR_MSG = "errorMsg";
    private static Logger logger = Logger.getInstance("wl.failResponse");
    WLErrorCode errorCode;
    String errorMsg;

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

    WLFailResponse(HttpResponse httpresponse)
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
        Exception exception;
        exception;
        logger.debug(String.format("Additional error information is not available for the current response and response text is: %s", new Object[] {
            getResponseText()
        }), exception);
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
        if (getStatus() >= 404)
        {
            errorCode = WLErrorCode.REQUEST_SERVICE_NOT_FOUND;
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
        if (errorMsg == null && errorCode != null)
        {
            return errorCode.getDescription();
        } else
        {
            return errorMsg;
        }
    }

    void setErrorCode(WLErrorCode wlerrorcode)
    {
        errorCode = wlerrorcode;
    }

    void setErrorMsg(String s)
    {
        errorMsg = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" WLFailResponse [errorMsg=").append(errorMsg).append(", errorCode=").append(errorCode).append("]").toString();
    }

}
