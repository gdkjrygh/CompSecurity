// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestClient_

class val.password extends c
{

    final PowerRestClient_ this$0;
    final String val$password;
    final String val$username;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$1201(PowerRestClient_.this, val$username, val$password);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    A(String s1, String s2, String s3)
    {
        this$0 = final_powerrestclient_;
        val$username = s2;
        val$password = s3;
        super(final_s, I.this, s1);
    }
}
