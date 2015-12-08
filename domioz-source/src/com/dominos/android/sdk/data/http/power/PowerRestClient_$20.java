// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestClient_, PowerRestCallback

class val.callback extends c
{

    final PowerRestClient_ this$0;
    final PowerRestCallback val$callback;
    final UserObject val$user;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$1901(PowerRestClient_.this, val$user, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    A(String s1, UserObject userobject, PowerRestCallback powerrestcallback)
    {
        this$0 = final_powerrestclient_;
        val$user = userobject;
        val$callback = powerrestcallback;
        super(final_s, I.this, s1);
    }
}
