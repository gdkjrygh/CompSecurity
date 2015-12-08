// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import com.cleanmaster.sdk.cmloginsdkjar.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            a, CmLoginSdkException

public final class CmLoginSdkRequestError
{

    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    private static final int EC_APP_NOT_INSTALLED = 458;
    private static final int EC_APP_TOO_MANY_CALLS = 4;
    private static final int EC_EXPIRED = 463;
    private static final int EC_INVALID_SESSION = 102;
    private static final int EC_INVALID_TOKEN = 190;
    private static final int EC_PASSWORD_CHANGED = 460;
    private static final int EC_PERMISSION_DENIED = 10;
    private static final a EC_RANGE_PERMISSION = new a(200, 299, (byte)0);
    private static final int EC_SERVICE_UNAVAILABLE = 2;
    private static final int EC_UNCONFIRMED_USER = 464;
    private static final int EC_UNKNOWN_ERROR = 1;
    private static final int EC_USER_CHECKPOINTED = 459;
    private static final int EC_USER_TOO_MANY_CALLS = 17;
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
    private static final a HTTP_RANGE_CLIENT_ERROR = new a(400, 499, (byte)0);
    private static final a HTTP_RANGE_SERVER_ERROR = new a(500, 599, (byte)0);
    private static final a HTTP_RANGE_SUCCESS = new a(200, 299, (byte)0);
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private static final int INVALID_MESSAGE_ID = 0;
    private final Object batchRequestResult;
    private final Category category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final boolean errorIsTransient;
    private final String errorMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private final CmLoginSdkException exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final boolean shouldNotifyUser;
    private final int subErrorCode;
    private final int userActionMessageId;

    private CmLoginSdkRequestError(int i, int j, int k, String s, String s1, String s2, String s3, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection)
    {
        this(i, j, k, s, s1, s2, s3, flag, jsonobject, jsonobject1, obj, httpurlconnection, null);
    }

    private CmLoginSdkRequestError(int i, int j, int k, String s, String s1, String s2, String s3, 
            boolean flag, JSONObject jsonobject, JSONObject jsonobject1, Object obj, HttpURLConnection httpurlconnection, CmLoginSdkException cmloginsdkexception)
    {
        boolean flag2;
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
        errorIsTransient = flag;
        boolean flag1;
        if (cmloginsdkexception != null)
        {
            exception = cmloginsdkexception;
            flag1 = true;
        } else
        {
            exception = null;
            flag1 = false;
        }
        s = null;
        flag2 = false;
        if (!flag1) goto _L2; else goto _L1
_L1:
        s = Category.CLIENT;
        i = 0;
_L5:
        byte byte0;
        if (s3 != null && s3.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        category = s;
        userActionMessageId = i;
        shouldNotifyUser = flag;
        return;
_L2:
        if (j != 1 && j != 2) goto _L4; else goto _L3
_L3:
        s = Category.SERVER;
        byte0 = flag2;
_L6:
        if (s == null)
        {
            if (HTTP_RANGE_CLIENT_ERROR.a(i))
            {
                s = Category.BAD_REQUEST;
                i = byte0;
            } else
            if (HTTP_RANGE_SERVER_ERROR.a(i))
            {
                s = Category.SERVER;
                i = byte0;
            } else
            {
                s = Category.OTHER;
                i = byte0;
            }
        } else
        {
            i = byte0;
        }
        if (true) goto _L5; else goto _L4
_L4:
label0:
        {
            if (j != 4 && j != 17)
            {
                break label0;
            }
            s = Category.THROTTLING;
            byte0 = flag2;
        }
          goto _L6
        if (j != 10 && !EC_RANGE_PERMISSION.a(j)) goto _L8; else goto _L7
_L7:
        s = Category.PERMISSION;
_L11:
        byte0 = 100;
          goto _L6
_L8:
        if (j == 102) goto _L10; else goto _L9
_L9:
        byte0 = flag2;
        if (j != 190) goto _L6; else goto _L10
_L10:
label1:
        {
            if (k != 459 && k != 464)
            {
                break label1;
            }
            s = Category.AUTHENTICATION_RETRY;
        }
          goto _L11
        s1 = Category.AUTHENTICATION_REOPEN_SESSION;
        if (k == 458)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        if (k != 463) goto _L11; else goto _L12
_L12:
        s = s1;
        byte0 = 100;
          goto _L6
    }

    CmLoginSdkRequestError(HttpURLConnection httpurlconnection, Exception exception1)
    {
        if (exception1 instanceof CmLoginSdkException)
        {
            exception1 = (CmLoginSdkException)exception1;
        } else
        {
            exception1 = new CmLoginSdkException(exception1);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpurlconnection, ((CmLoginSdkException) (exception1)));
    }

    static CmLoginSdkRequestError checkResponseAndCreateError(JSONObject jsonobject, Object obj, HttpURLConnection httpurlconnection)
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
        return new CmLoginSdkRequestError(k, i, j, ((String) (obj1)), s, s1, ((String) (obj2)), flag1, jsonobject2, jsonobject, obj, httpurlconnection);
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
        if (HTTP_RANGE_SUCCESS.a(k)) goto _L2; else goto _L11
_L11:
        if (!jsonobject.has("body"))
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj1 = (JSONObject)Utility.getStringPropertyAsJSON(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
_L12:
        jsonobject = new CmLoginSdkRequestError(k, -1, -1, null, null, null, null, false, ((JSONObject) (obj1)), jsonobject, obj, httpurlconnection);
        return jsonobject;
        jsonobject;
_L2:
        return null;
        obj1 = null;
          goto _L12
    }

    public final Category getCategory()
    {
        return category;
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

    public final String getErrorType()
    {
        return errorType;
    }

    public final CmLoginSdkException getException()
    {
        return exception;
    }

    public final int getRequestStatusCode()
    {
        return requestStatusCode;
    }

    public final int getUserActionMessageId()
    {
        return userActionMessageId;
    }

    public final String toString()
    {
        return (new StringBuilder("{HttpStatus: ")).append(requestStatusCode).append(", errorCode: ").append(errorCode).append(", errorType: ").append(errorType).append(", errorMessage: ").append(getErrorMessage()).append("}").toString();
    }


    private class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category AUTHENTICATION_REOPEN_SESSION;
        public static final Category AUTHENTICATION_RETRY;
        public static final Category BAD_REQUEST;
        public static final Category CLIENT;
        public static final Category OTHER;
        public static final Category PERMISSION;
        public static final Category SERVER;
        public static final Category THROTTLING;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        static 
        {
            AUTHENTICATION_RETRY = new Category("AUTHENTICATION_RETRY", 0);
            AUTHENTICATION_REOPEN_SESSION = new Category("AUTHENTICATION_REOPEN_SESSION", 1);
            PERMISSION = new Category("PERMISSION", 2);
            SERVER = new Category("SERVER", 3);
            THROTTLING = new Category("THROTTLING", 4);
            OTHER = new Category("OTHER", 5);
            BAD_REQUEST = new Category("BAD_REQUEST", 6);
            CLIENT = new Category("CLIENT", 7);
            $VALUES = (new Category[] {
                AUTHENTICATION_RETRY, AUTHENTICATION_REOPEN_SESSION, PERMISSION, SERVER, THROTTLING, OTHER, BAD_REQUEST, CLIENT
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }

}
