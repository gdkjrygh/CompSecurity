// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import com.dominos.android.sdk.core.models.LabsOrder;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestClient_, PowerRestCallback

class val.callback extends c
{

    final PowerRestClient_ this$0;
    final PowerRestCallback val$callback;
    final LabsOrder val$order;

    public void execute()
    {
        try
        {
            PowerRestClient_.access$801(PowerRestClient_.this, val$order, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s1, LabsOrder labsorder, PowerRestCallback powerrestcallback)
    {
        this$0 = final_powerrestclient_;
        val$order = labsorder;
        val$callback = powerrestcallback;
        super(final_s, I.this, s1);
    }
}
