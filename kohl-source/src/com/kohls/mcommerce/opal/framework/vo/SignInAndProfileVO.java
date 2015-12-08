// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            IValueObject

public class SignInAndProfileVO
    implements IValueObject
{
    public static class Errors
    {

        private String Error;
        private String ErrorCode;
        private String code;
        private boolean isSuccessful;
        private String message;
        private int statusCode;
        private String statusReason;

        public String getCode()
        {
            return code;
        }

        public String getError()
        {
            return Error;
        }

        public String getErrorCode()
        {
            return ErrorCode;
        }

        public String getMessage()
        {
            return message;
        }

        public int getStatusCode()
        {
            return statusCode;
        }

        public String getStatusReason()
        {
            return statusReason;
        }

        public boolean isSuccessful()
        {
            return isSuccessful;
        }

        public void setCode(String s)
        {
            code = s;
        }

        public void setError(String s)
        {
            Error = s;
        }

        public void setErrorCode(String s)
        {
            ErrorCode = s;
        }

        public void setMessage(String s)
        {
            message = s;
        }

        public void setStatusCode(int i)
        {
            statusCode = i;
        }

        public void setStatusReason(String s)
        {
            statusReason = s;
        }

        public void setSuccessful(boolean flag)
        {
            isSuccessful = flag;
        }

        public Errors()
        {
        }
    }

    public static class Payload
    {

        private String Error;
        private String ErrorCode;
        private boolean isSuccess;
        private Response response;

        public String getError()
        {
            return Error;
        }

        public String getErrorCode()
        {
            return ErrorCode;
        }

        public Response getResponse()
        {
            return response;
        }

        public boolean isSuccess()
        {
            return isSuccess;
        }

        public void setError(String s)
        {
            Error = s;
        }

        public void setErrorCode(String s)
        {
            ErrorCode = s;
        }

        public void setResponse(Response response1)
        {
            response = response1;
        }

        public void setSuccess(boolean flag)
        {
            isSuccess = flag;
        }

        public Payload()
        {
        }
    }


    private List errors;
    private String expiryTime;
    private Payload payload;

    public SignInAndProfileVO()
    {
    }

    public List getErrors()
    {
        return errors;
    }

    public String getExpiryTime()
    {
        return expiryTime;
    }

    public Payload getPayload()
    {
        return payload;
    }

    public void setErrors(List list)
    {
        errors = list;
    }

    public void setExpiryTime(String s)
    {
        expiryTime = s;
    }

    public void setPayload(Payload payload1)
    {
        payload = payload1;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/SignInAndProfileVO$Payload$Response
    /* block-local class not found */
    class Payload.Response {}

}
