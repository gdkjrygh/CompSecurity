// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.errorstatus;


public class ErrorMessageEntityContainer
{

    private String errorCode;
    private String errorMessage;

    public ErrorMessageEntityContainer()
    {
        errorCode = "";
        errorMessage = "";
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorCode(String s)
    {
        errorCode = s;
    }

    public void setErrorMessage(String s)
    {
        errorMessage = s;
    }
}
