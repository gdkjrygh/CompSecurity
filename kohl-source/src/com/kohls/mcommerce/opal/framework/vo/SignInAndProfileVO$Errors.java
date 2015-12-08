// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;


// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            SignInAndProfileVO

public static class 
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

    public ()
    {
    }
}
