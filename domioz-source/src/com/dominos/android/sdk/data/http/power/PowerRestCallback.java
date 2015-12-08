// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;


public abstract class PowerRestCallback
    implements PowerCallback.OnBegin, PowerCallback.OnError, PowerCallback.OnFinish, PowerCallback.OnSuccess
{

    public PowerRestCallback()
    {
    }

    public void onBegin()
    {
    }

    public abstract void onError(Exception exception, String s);

    public void onFinish()
    {
    }

    public abstract void onSuccess(Object obj);
}
