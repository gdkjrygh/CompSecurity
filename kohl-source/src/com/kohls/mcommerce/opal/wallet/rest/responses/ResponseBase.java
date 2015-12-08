// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.responses;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public abstract class ResponseBase
{
    public class Error
    {

        private String code;
        private String message;
        final ResponseBase this$0;

        public String getCode()
        {
            return code;
        }

        public String getMessage()
        {
            return message;
        }

        public Error()
        {
            this$0 = ResponseBase.this;
            super();
        }
    }


    private int code;
    private Error error;
    private transient Response.ErrorType errorType;
    private transient int httpStatusCode;
    private String requestType;
    private String status;

    public ResponseBase()
    {
        requestType = "post_";
        httpStatusCode = -1;
    }

    public Error getError()
    {
        return error;
    }

    public Response.ErrorType getErrorType()
    {
        return errorType;
    }

    public int getHttpStatusCode()
    {
        return httpStatusCode;
    }

    public String getRequestType()
    {
        return requestType;
    }

    public Response.Status getStatus()
    {
        if (errorType != null)
        {
            return Response.Status.ERROR;
        }
        if (httpStatusCode < 200 || httpStatusCode > 204)
        {
            errorType = Response.ErrorType.API_ERROR;
            return Response.Status.ERROR;
        }
        if (status.trim().equalsIgnoreCase("OK"))
        {
            return Response.Status.OK;
        }
        if (status.trim().equalsIgnoreCase("ERROR"))
        {
            if (errorType == null)
            {
                errorType = Response.ErrorType.API_ERROR;
            }
            return Response.Status.ERROR;
        } else
        {
            return Response.Status.UNKNOWN;
        }
    }

    public boolean hasError()
    {
        return error != null && error.getMessage() != null;
    }

    public void setApiApplicationError(HttpResponse httpresponse)
    {
        errorType = Response.ErrorType.CONNECTION_ERROR;
        httpStatusCode = httpresponse.getStatusLine().getStatusCode();
    }

    public void setAuthenticationError(HttpResponse httpresponse)
    {
        errorType = Response.ErrorType.AUTHENTICATION_ERROR;
        httpStatusCode = httpresponse.getStatusLine().getStatusCode();
    }

    public void setConnectionError()
    {
        errorType = Response.ErrorType.CONNECTION_ERROR;
    }

    public void setHttpStatusCode(int i)
    {
label0:
        {
label1:
            {
                httpStatusCode = i;
                if ((i < 200 || i > 204) && errorType == null)
                {
                    switch (i)
                    {
                    case 402: 
                    default:
                        errorType = Response.ErrorType.CONNECTION_ERROR;
                        break;

                    case 400: 
                        break label1;

                    case 401: 
                    case 403: 
                        break label0;
                    }
                }
                return;
            }
            errorType = Response.ErrorType.API_ERROR;
            return;
        }
        errorType = Response.ErrorType.AUTHENTICATION_ERROR;
    }

    public void setJsonError(HttpResponse httpresponse)
    {
        errorType = Response.ErrorType.PARSE_ERROR;
        httpStatusCode = httpresponse.getStatusLine().getStatusCode();
    }

    public void setRequestType(String s)
    {
        requestType = s;
    }

    public boolean successful()
    {
        return code == 200 && getStatus().equals(Response.Status.OK);
    }
}
