// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;


// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            SignInAndProfileVO

public static class Response
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

    public Response()
    {
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/SignInAndProfileVO$Payload$Response
    /* block-local class not found */
    class Response {}

}
