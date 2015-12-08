// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            Base64, MMLog

class MMJSResponse
{

    static final int ERROR = 0;
    static final int SUCCESS = 1;
    private static final String TAG = "MMJSResponse";
    String className;
    byte dataResponse[];
    String methodName;
    Object response;
    int result;

    MMJSResponse()
    {
    }

    static MMJSResponse responseWithError()
    {
        return responseWithError("An unknown error occured.");
    }

    static MMJSResponse responseWithError(String s)
    {
        MMJSResponse mmjsresponse = new MMJSResponse();
        mmjsresponse.result = 0;
        mmjsresponse.response = s;
        return mmjsresponse;
    }

    static MMJSResponse responseWithSuccess()
    {
        return responseWithSuccess("Success.");
    }

    static MMJSResponse responseWithSuccess(String s)
    {
        MMJSResponse mmjsresponse = new MMJSResponse();
        mmjsresponse.result = 1;
        mmjsresponse.response = s;
        return mmjsresponse;
    }

    String toJSONString()
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        if (className != null)
        {
            jsonobject.put("class", className);
        }
        if (methodName != null)
        {
            jsonobject.put("call", methodName);
        }
        jsonobject.put("result", result);
        if (response == null) goto _L2; else goto _L1
_L1:
        jsonobject.put("response", response);
_L4:
        return jsonobject.toString();
_L2:
        try
        {
            if (dataResponse == null)
            {
                break; /* Loop/switch isn't completed */
            }
            jsonobject.put("response", Base64.encodeToString(dataResponse, false));
        }
        catch (JSONException jsonexception)
        {
            MMLog.e("MMJSResponse", jsonexception.getMessage());
            return "";
        }
        if (true) goto _L4; else goto _L3
_L3:
        return "";
    }
}
