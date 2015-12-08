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
    final String val$cityRegion;
    final String val$street;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$1701(PowerRestClient_.this, val$street, val$cityRegion, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    A(String s2, String s3, PowerRestCallback powerrestcallback)
    {
        this$0 = final_powerrestclient_;
        val$street = s2;
        val$cityRegion = s3;
        val$callback = powerrestcallback;
        super(final_s, final_i, String.this);
    }
}
