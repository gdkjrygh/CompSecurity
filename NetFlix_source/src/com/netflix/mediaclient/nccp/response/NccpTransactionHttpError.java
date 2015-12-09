// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp.response;

import com.netflix.mediaclient.nccp.NccpResponse;

public final class NccpTransactionHttpError
    implements NccpResponse
{

    private int responseErrorCode;
    private String transaction;

    public NccpTransactionHttpError(int i, String s)
    {
        responseErrorCode = i;
        transaction = s;
    }

    public int getResponseErrorCode()
    {
        return responseErrorCode;
    }

    public boolean getStatus()
    {
        return false;
    }

    public String getTransaction()
    {
        return transaction;
    }
}
