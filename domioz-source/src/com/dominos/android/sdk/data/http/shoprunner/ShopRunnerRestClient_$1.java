// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.data.http.shoprunner:
//            ShopRunnerRestClient_

class val.callback extends c
{

    final ShopRunnerRestClient_ this$0;
    final PowerRestCallback val$callback;
    final String val$token;

    public void execute()
    {
        try
        {
            ShopRunnerRestClient_.access$001(ShopRunnerRestClient_.this, val$token, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s1, String s2, PowerRestCallback powerrestcallback)
    {
        this$0 = final_shoprunnerrestclient_;
        val$token = s2;
        val$callback = powerrestcallback;
        super(final_s, I.this, s1);
    }
}
