// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.callbacks;


public abstract class RegisterDeviceFinishedCallback
    implements Runnable
{

    private boolean a;

    public RegisterDeviceFinishedCallback()
    {
    }

    public abstract void onResponse(boolean flag);

    public void run()
    {
        onResponse(a);
    }

    public void setSuccess(boolean flag)
    {
        a = flag;
    }
}
