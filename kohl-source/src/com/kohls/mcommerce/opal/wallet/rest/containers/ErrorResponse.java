// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

public class ErrorResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private int errorCode;
    private String id;
    private String message;

    public ErrorResponse()
    {
        message = "";
        id = "";
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getID()
    {
        return id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setErrorCode(int i)
    {
        errorCode = i;
    }

    public void setID(String s)
    {
        id = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }
}
