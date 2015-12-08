// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.reporting.CrashReporting;

class <init> extends ApiResponseHandler
{

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        CrashReporting.a(throwable);
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
