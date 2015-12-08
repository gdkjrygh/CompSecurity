// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.util;

import android.content.Context;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;

public class ResponseEvent
{

    private Context context;
    private String data;
    private ResponseErrorCode errorCode;
    private ResponseStatus resultCode;

    public ResponseEvent(Context context1, String s, ResponseStatus responsestatus, ResponseErrorCode responseerrorcode)
    {
        context = context1;
        data = s;
        resultCode = responsestatus;
        errorCode = responseerrorcode;
    }

    public Context getContext()
    {
        return context;
    }

    public String getData()
    {
        return data;
    }

    public ResponseErrorCode getErrorCode()
    {
        return errorCode;
    }

    public ResponseStatus getStatus()
    {
        return resultCode;
    }

    public void setContext(Context context1)
    {
        context = context1;
    }
}
