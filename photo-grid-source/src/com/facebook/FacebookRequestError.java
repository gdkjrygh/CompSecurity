// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookServiceException, FacebookException, FacebookSdk

public final class FacebookRequestError
{

    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    private static final String ERROR_CODE_FIELD_KEY = "code";
    private static final String ERROR_CODE_KEY = "error_code";
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
    private static final String ERROR_KEY = "error";
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";
    private static final String ERROR_MSG_KEY = "error_msg";
    private static final String ERROR_REASON_KEY = "error_reason";
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";
    private static final String ERROR_TYPE_FIELD_KEY = "type";
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    static final Range HTTP_RANGE_SUCCESS = new Range(200, 299, null);
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private final Object batchRequestResult;
    private final Category category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final String errorMessage;
    private final String errorRecoveryMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private final FacebookException exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;

    private FacebookRequestError(int i, int j, int k, String s, String s1, String s2, String s3, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, FacebookException facebookexception)
    {
        requestStatusCode = i;
        errorCode = j;
        subErrorCode = k;
        errorType = s;
        errorMessage = s1;
        requestResultBody = jsonobject;
        requestResult = jsonobject1;
        batchRequestResult = obj;
        connection = httpurlconnection;
        errorUserTitle = s2;
        errorUserMessage = s3;
        i = 0;
        if (facebookexception != null)
        {
            exception = facebookexception;
            i = 1;
        } else
        {
            exception = new FacebookServiceException(this, s1);
        }
        s1 = getErrorClassification();
        if (i != 0)
        {
            s = Category.OTHER;
        } else
        {
            s = s1.classify(j, k, flag);
        }
        category = s;
        errorRecoveryMessage = s1.getRecoveryMessage(category);
    }

    public FacebookRequestError(int i, String s, String s1)
    {
        this(-1, i, -1, s, s1, null, null, false, null, null, null, null, null);
    }

    FacebookRequestError(HttpURLConnection httpurlconnection, Exception exception1)
    {
        if (exception1 instanceof FacebookException)
        {
            exception1 = (FacebookException)exception1;
        } else
        {
            exception1 = new FacebookException(exception1);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpurlconnection, ((FacebookException) (exception1)));
    }

    static FacebookRequestError checkResponseAndCreateError(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
    {
        if (!jsonobject.has("code")) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k;
        k = jsonobject.getInt("code");
        obj1 = Utility.getStringPropertyAsJSON(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!(obj1 instanceof JSONObject)) goto _L4; else goto _L5
_L5:
        JSONObject jsonobject2 = (JSONObject)obj1;
        String s;
        JSONObject jsonobject1;
        Object obj3;
        boolean flag;
        int i;
        int j;
        boolean flag2;
        obj1 = null;
        s = null;
        jsonobject1 = null;
        obj3 = null;
        flag2 = false;
        i = 0;
        j = 0;
        flag = false;
        if (!jsonobject2.has("error")) goto _L7; else goto _L6
_L6:
        Object obj2;
        String s1;
        boolean flag1;
        jsonobject1 = (JSONObject)Utility.getStringPropertyAsJSON(jsonobject2, "error", null);
        obj1 = jsonobject1.optString("type", null);
        s = jsonobject1.optString("message", null);
        i = jsonobject1.optInt("code", -1);
        j = jsonobject1.optInt("error_subcode", -1);
        obj2 = jsonobject1.optString("error_user_msg", null);
        s1 = jsonobject1.optString("error_user_title", null);
        flag1 = jsonobject1.optBoolean("is_transient", false);
        flag = true;
_L10:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        return new FacebookRequestError(k, i, j, ((String) (obj1)), s, s1, ((String) (obj2)), flag1, jsonobject2, jsonobject, obj, httpurlconnection, null);
_L7:
        if (jsonobject2.has("error_code") || jsonobject2.has("error_msg")) goto _L9; else goto _L8
_L8:
        s1 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (!jsonobject2.has("error_reason"))
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        obj1 = jsonobject2.optString("error_reason", null);
        s = jsonobject2.optString("error_msg", null);
        i = jsonobject2.optInt("error_code", -1);
        j = jsonobject2.optInt("error_subcode", -1);
        flag = true;
        s1 = obj3;
        obj2 = jsonobject1;
        flag1 = flag2;
        if (true) goto _L10; else goto _L4
_L4:
        if (HTTP_RANGE_SUCCESS.contains(k)) goto _L2; else goto _L11
_L11:
        if (!jsonobject.has("body"))
        {
            break MISSING_BLOCK_LABEL_353;
        }
        obj1 = (JSONObject)Utility.getStringPropertyAsJSON(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
_L12:
        jsonobject = new FacebookRequestError(k, -1, -1, null, null, null, null, false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection, null);
        return jsonobject;
        jsonobject;
_L2:
        return null;
        obj1 = null;
          goto _L12
    }

    static FacebookRequestErrorClassification getErrorClassification()
    {
        com/facebook/FacebookRequestError;
        JVM INSTR monitorenter ;
        Object obj = Utility.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = FacebookRequestErrorClassification.getDefaultErrorClassification();
_L4:
        com/facebook/FacebookRequestError;
        JVM INSTR monitorexit ;
        return ((FacebookRequestErrorClassification) (obj));
_L2:
        obj = ((com.facebook.internal.Utility.FetchedAppSettings) (obj)).getErrorClassification();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        throw exception1;
    }

    public final Object getBatchRequestResult()
    {
        return batchRequestResult;
    }

    public final Category getCategory()
    {
        return category;
    }

    public final HttpURLConnection getConnection()
    {
        return connection;
    }

    public final int getErrorCode()
    {
        return errorCode;
    }

    public final String getErrorMessage()
    {
        if (errorMessage != null)
        {
            return errorMessage;
        } else
        {
            return exception.getLocalizedMessage();
        }
    }

    public final String getErrorRecoveryMessage()
    {
        return errorRecoveryMessage;
    }

    public final String getErrorType()
    {
        return errorType;
    }

    public final String getErrorUserMessage()
    {
        return errorUserMessage;
    }

    public final String getErrorUserTitle()
    {
        return errorUserTitle;
    }

    public final FacebookException getException()
    {
        return exception;
    }

    public final JSONObject getRequestResult()
    {
        return requestResult;
    }

    public final JSONObject getRequestResultBody()
    {
        return requestResultBody;
    }

    public final int getRequestStatusCode()
    {
        return requestStatusCode;
    }

    public final int getSubErrorCode()
    {
        return subErrorCode;
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(requestStatusCode).append(", errorCode: ").append(errorCode).append(", errorType: ").append(errorType).append(", errorMessage: ").append(getErrorMessage()).append("}").toString();
    }


    private class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category LOGIN_RECOVERABLE;
        public static final Category OTHER;
        public static final Category TRANSIENT;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        static 
        {
            LOGIN_RECOVERABLE = new Category("LOGIN_RECOVERABLE", 0);
            OTHER = new Category("OTHER", 1);
            TRANSIENT = new Category("TRANSIENT", 2);
            $VALUES = (new Category[] {
                LOGIN_RECOVERABLE, OTHER, TRANSIENT
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }


    private class Range
    {

        private final int end;
        private final int start;

        boolean contains(int i)
        {
            return start <= i && i <= end;
        }

        private Range(int i, int j)
        {
            start = i;
            end = j;
        }

        Range(int i, int j, _cls1 _pcls1)
        {
            this(i, j);
        }
    }

}
