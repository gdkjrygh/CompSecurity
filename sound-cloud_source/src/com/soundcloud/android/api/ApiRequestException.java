// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.checks.Preconditions;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.api:
//            ApiResponse, ApiRequest, ApiMapperException

public final class ApiRequestException extends Exception
{
    public static final class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final Reason AUTH_ERROR;
        public static final Reason BAD_REQUEST;
        public static final Reason MALFORMED_INPUT;
        public static final Reason NETWORK_ERROR;
        public static final Reason NOT_ALLOWED;
        public static final Reason NOT_FOUND;
        public static final Reason RATE_LIMITED;
        public static final Reason SERVER_ERROR;
        public static final Reason UNEXPECTED_RESPONSE;
        public static final Reason VALIDATION_ERROR;

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(com/soundcloud/android/api/ApiRequestException$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            AUTH_ERROR = new Reason("AUTH_ERROR", 0);
            NETWORK_ERROR = new Reason("NETWORK_ERROR", 1);
            NOT_FOUND = new Reason("NOT_FOUND", 2);
            NOT_ALLOWED = new Reason("NOT_ALLOWED", 3);
            RATE_LIMITED = new Reason("RATE_LIMITED", 4);
            UNEXPECTED_RESPONSE = new Reason("UNEXPECTED_RESPONSE", 5);
            BAD_REQUEST = new Reason("BAD_REQUEST", 6);
            VALIDATION_ERROR = new Reason("VALIDATION_ERROR", 7);
            MALFORMED_INPUT = new Reason("MALFORMED_INPUT", 8);
            SERVER_ERROR = new Reason("SERVER_ERROR", 9);
            $VALUES = (new Reason[] {
                AUTH_ERROR, NETWORK_ERROR, NOT_FOUND, NOT_ALLOWED, RATE_LIMITED, UNEXPECTED_RESPONSE, BAD_REQUEST, VALIDATION_ERROR, MALFORMED_INPUT, SERVER_ERROR
            });
        }

        private Reason(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ERROR_KEY_NONE = "unknown";
    private final int errorCode;
    private final String errorKey;
    private final Reason errorReason;

    private ApiRequestException(Reason reason1, ApiRequest apirequest, ApiResponse apiresponse)
    {
        StringBuilder stringbuilder = (new StringBuilder("Request failed with reason ")).append(reason1).append("; request = ").append(apirequest).append("; body = ");
        if (apiresponse == null)
        {
            apirequest = "<no response>";
        } else
        {
            apirequest = apiresponse.getResponseBody();
        }
        super(stringbuilder.append(apirequest).toString());
        errorReason = reason1;
        errorKey = "unknown";
        errorCode = -1;
    }

    private ApiRequestException(Reason reason1, ApiRequest apirequest, ApiResponse apiresponse, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder("Request failed with reason ")).append(reason1).append("; errorKey = ").append(s).append("; request = ").append(apirequest).append("; body = ");
        if (apiresponse == null)
        {
            apirequest = "<no response>";
        } else
        {
            apirequest = apiresponse.getResponseBody();
        }
        super(stringbuilder.append(apirequest).toString());
        errorReason = reason1;
        errorKey = s;
        errorCode = -1;
    }

    private ApiRequestException(Reason reason1, ApiRequest apirequest, ApiResponse apiresponse, String s, int i)
    {
        StringBuilder stringbuilder = (new StringBuilder("Request failed with reason ")).append(reason1).append("; errorKey = ").append(s).append("; errorCode = ").append(i).append("; request = ").append(apirequest).append("; body = ");
        if (apiresponse == null)
        {
            apirequest = "<no response>";
        } else
        {
            apirequest = apiresponse.getResponseBody();
        }
        super(stringbuilder.append(apirequest).toString());
        errorReason = reason1;
        errorKey = s;
        errorCode = i;
    }

    private ApiRequestException(Reason reason1, ApiRequest apirequest, Exception exception)
    {
        super((new StringBuilder("Request failed with reason ")).append(reason1).append("; request = ").append(apirequest).toString(), exception);
        errorReason = reason1;
        errorKey = "unknown";
        errorCode = -1;
    }

    public static ApiRequestException authError(ApiRequest apirequest, ApiResponse apiresponse)
    {
        return new ApiRequestException(Reason.AUTH_ERROR, apirequest, apiresponse);
    }

    public static ApiRequestException badRequest(ApiRequest apirequest, ApiResponse apiresponse, String s)
    {
        return new ApiRequestException(Reason.BAD_REQUEST, apirequest, apiresponse, s);
    }

    public static ApiRequestException malformedInput(ApiRequest apirequest, ApiMapperException apimapperexception)
    {
        return new ApiRequestException(Reason.MALFORMED_INPUT, apirequest, apimapperexception);
    }

    public static ApiRequestException networkError(ApiRequest apirequest, IOException ioexception)
    {
        return new ApiRequestException(Reason.NETWORK_ERROR, apirequest, ioexception);
    }

    public static ApiRequestException notAllowed(ApiRequest apirequest, ApiResponse apiresponse)
    {
        return new ApiRequestException(Reason.NOT_ALLOWED, apirequest, apiresponse);
    }

    public static ApiRequestException notFound(ApiRequest apirequest, ApiResponse apiresponse)
    {
        return new ApiRequestException(Reason.NOT_FOUND, apirequest, apiresponse);
    }

    public static ApiRequestException rateLimited(ApiRequest apirequest, ApiResponse apiresponse)
    {
        return new ApiRequestException(Reason.RATE_LIMITED, apirequest, apiresponse);
    }

    public static ApiRequestException serverError(ApiRequest apirequest, ApiResponse apiresponse)
    {
        return new ApiRequestException(Reason.SERVER_ERROR, apirequest, apiresponse);
    }

    public static ApiRequestException unexpectedResponse(ApiRequest apirequest, ApiResponse apiresponse)
    {
        int i = apiresponse.getStatusCode();
        boolean flag;
        if (i < 200 || i < 500 && i >= 400)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Status code must be< 200 or between 400 and 500");
        return new ApiRequestException(Reason.UNEXPECTED_RESPONSE, apirequest, apiresponse, (new StringBuilder("HTTP ")).append(i).toString());
    }

    public static ApiRequestException validationError(ApiRequest apirequest, ApiResponse apiresponse, String s, int i)
    {
        return new ApiRequestException(Reason.VALIDATION_ERROR, apirequest, apiresponse, s, i);
    }

    public final int errorCode()
    {
        return errorCode;
    }

    public final String errorKey()
    {
        return errorKey;
    }

    public final boolean isNetworkError()
    {
        return errorReason == Reason.NETWORK_ERROR;
    }

    public final boolean loggable()
    {
        return errorReason == Reason.UNEXPECTED_RESPONSE || errorReason == Reason.MALFORMED_INPUT || errorReason == Reason.RATE_LIMITED || errorReason == Reason.SERVER_ERROR;
    }

    public final Reason reason()
    {
        return errorReason;
    }
}
