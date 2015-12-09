// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestClient_, PowerRestCallback

class val.callback extends c
{

    final PowerRestClient_ this$0;
    final PowerRestCallback val$callback;
    final String val$email;
    final String val$newPassword;
    final String val$oldPassword;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$1501(PowerRestClient_.this, val$email, val$oldPassword, val$newPassword, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    A(String s3, String s4, 
            PowerRestCallback powerrestcallback)
    {
        this$0 = final_powerrestclient_;
        val$email = String.this;
        val$oldPassword = s3;
        val$newPassword = s4;
        val$callback = powerrestcallback;
        super(final_s, final_i, final_s1);
    }
}
