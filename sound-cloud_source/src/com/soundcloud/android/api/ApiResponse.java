// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.api:
//            ApiRequestException, ApiRequest

public class ApiResponse
{

    private static final String BAD_REQUEST_ERROR_KEY = "error_key";
    private static final String PUBLIC_API_ERRORS_KEY = "errors";
    private static final String PUBLIC_API_ERROR_KEY = "error";
    private static final String PUBLIC_API_ERROR_MESSAGE_KEY = "error_message";
    private static final int SC_REQUEST_TOO_MANY_REQUESTS = 429;
    private ApiRequestException failure;
    private final String responseBody;
    private final int statusCode;

    public ApiResponse(ApiRequest apirequest, int i, String s)
    {
        statusCode = i;
        responseBody = s;
        determineFailure(apirequest, i);
    }

    protected ApiResponse(ApiRequestException apirequestexception)
    {
        statusCode = -1;
        responseBody = "";
        failure = apirequestexception;
    }

    private void determineFailure(ApiRequest apirequest, int i)
    {
        if (i == 429)
        {
            failure = ApiRequestException.rateLimited(apirequest, this);
        } else
        {
            if (i == 404)
            {
                failure = ApiRequestException.notFound(apirequest, this);
                return;
            }
            if (i == 401)
            {
                failure = ApiRequestException.authError(apirequest, this);
                return;
            }
            if (i == 403)
            {
                failure = ApiRequestException.notAllowed(apirequest, this);
                return;
            }
            if (i == 400)
            {
                failure = ApiRequestException.badRequest(apirequest, this, getErrorKey());
                return;
            }
            if (i == 422)
            {
                failure = ApiRequestException.validationError(apirequest, this, getErrorKey(), getErrorCode());
                return;
            }
            if (i >= 500)
            {
                failure = ApiRequestException.serverError(apirequest, this);
                return;
            }
            if (!isSuccessCode(i))
            {
                failure = ApiRequestException.unexpectedResponse(apirequest, this);
                return;
            }
        }
    }

    private int getErrorCode()
    {
        int i = -1;
        try
        {
            JSONObject jsonobject = new JSONObject(responseBody);
            if (jsonobject.has("error"))
            {
                i = jsonobject.getInt("error");
            }
        }
        catch (JSONException jsonexception)
        {
            return -1;
        }
        return i;
    }

    private String getErrorKey()
    {
        Object obj;
        try
        {
            obj = new JSONObject(responseBody);
            if (((JSONObject) (obj)).has("errors"))
            {
                return ((JSONObject) (obj)).getJSONArray("errors").getJSONObject(0).getString("error_message");
            }
            obj = ((JSONObject) (obj)).getString("error_key");
        }
        catch (JSONException jsonexception)
        {
            return "unknown";
        }
        return ((String) (obj));
    }

    private boolean isSuccessCode(int i)
    {
        return i >= 200 && i < 400;
    }

    public ApiRequestException getFailure()
    {
        return failure;
    }

    public String getResponseBody()
    {
        return responseBody;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public boolean hasResponseBody()
    {
        return Strings.isNotBlank(responseBody);
    }

    public boolean isNotSuccess()
    {
        return failure != null;
    }

    public boolean isSuccess()
    {
        return failure == null;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("statusCode", statusCode).add("failure", failure).toString();
    }
}
