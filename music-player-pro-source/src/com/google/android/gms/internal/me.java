// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

class me
    implements PendingResult
{

    private final Result UU;

    me(Result result)
    {
        UU = result;
    }

    public void a(com.google.android.gms.common.api.PendingResult.a a1)
    {
        a1.m(UU.getStatus());
    }

    public Result await()
    {
        return UU;
    }

    public Result await(long l, TimeUnit timeunit)
    {
        return UU;
    }

    public void cancel()
    {
    }

    public boolean isCanceled()
    {
        return false;
    }

    public void setResultCallback(ResultCallback resultcallback)
    {
        resultcallback.onResult(UU);
    }

    public void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
        resultcallback.onResult(UU);
    }
}
