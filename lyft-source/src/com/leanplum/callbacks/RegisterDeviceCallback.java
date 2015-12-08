// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.callbacks;


public abstract class RegisterDeviceCallback
    implements Runnable
{

    private EmailCallback a;

    public RegisterDeviceCallback()
    {
    }

    public abstract void onResponse(EmailCallback emailcallback);

    public void run()
    {
        onResponse(a);
    }

    public void setResponseHandler(EmailCallback emailcallback)
    {
        a = emailcallback;
    }
}
