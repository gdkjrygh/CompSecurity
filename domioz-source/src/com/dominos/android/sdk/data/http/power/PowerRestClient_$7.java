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
    final int val$buildingId;
    final PowerRestCallback val$callback;
    final String val$unitNumber;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$601(PowerRestClient_.this, val$buildingId, val$unitNumber, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int j, String s2, PowerRestCallback powerrestcallback)
    {
        this$0 = final_powerrestclient_;
        val$buildingId = j;
        val$unitNumber = s2;
        val$callback = powerrestcallback;
        super(final_s, final_i, String.this);
    }
}
