// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.error;

import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;

// Referenced classes of package com.kohls.mcommerce.opal.helper.error:
//            AppException

public class Error
{
    public static final class ErrorType extends Enum
    {

        private static final ErrorType $VALUES[];
        public static final ErrorType ADAPTER_ERROR;
        public static final ErrorType ADAPTER_FAILURE;
        public static final ErrorType ADAPTER_PAYLOAD;
        public static final ErrorType APPLICATION_EXCEPTION;
        public static final ErrorType AUTH_ERROR;
        public static final ErrorType NO_NETWORK;
        private String mErrorDescription;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/kohls/mcommerce/opal/helper/error/Error$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])$VALUES.clone();
        }

        public String getErrorDescription()
        {
            return mErrorDescription;
        }

        static 
        {
            NO_NETWORK = new ErrorType("NO_NETWORK", 0, "Network not connected");
            ADAPTER_PAYLOAD = new ErrorType("ADAPTER_PAYLOAD", 1, "Adapter Payload Error");
            ADAPTER_ERROR = new ErrorType("ADAPTER_ERROR", 2, "Adapter Error");
            ADAPTER_FAILURE = new ErrorType("ADAPTER_FAILURE", 3, "Adapter Call Failure");
            AUTH_ERROR = new ErrorType("AUTH_ERROR", 4, "Authentication Error");
            APPLICATION_EXCEPTION = new ErrorType("APPLICATION_EXCEPTION", 5, "Application Exception");
            $VALUES = (new ErrorType[] {
                NO_NETWORK, ADAPTER_PAYLOAD, ADAPTER_ERROR, ADAPTER_FAILURE, AUTH_ERROR, APPLICATION_EXCEPTION
            });
        }

        private ErrorType(String s, int i, String s1)
        {
            super(s, i);
            mErrorDescription = s1;
        }
    }


    private String mCode;
    private ErrorType mErrorType;
    private Exception mException;
    private String mMessage;

    public Error(AppException appexception)
    {
        this(((Exception) (appexception)));
    }

    public Error(WLFailResponse wlfailresponse, ErrorType errortype)
    {
        mCode = "";
        mMessage = "";
        mCode = wlfailresponse.getErrorCode().toString();
        mMessage = wlfailresponse.getErrorMsg();
        mErrorType = errortype;
    }

    public Error(Exception exception)
    {
        mCode = "";
        mMessage = "";
        mException = exception;
        mErrorType = ErrorType.APPLICATION_EXCEPTION;
    }

    public Error(String s, String s1, ErrorType errortype)
    {
        mCode = "";
        mMessage = "";
        mCode = s;
        mMessage = s1;
        mErrorType = errortype;
    }

    public String getErrorCode()
    {
        return mCode;
    }

    public ErrorType getErrorType()
    {
        return mErrorType;
    }

    public Exception getException()
    {
        return mException;
    }

    public String getMessage()
    {
        return mMessage;
    }
}
