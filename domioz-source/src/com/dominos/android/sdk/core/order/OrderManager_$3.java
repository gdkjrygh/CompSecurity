// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.core.models.LabsOrder;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.core.order:
//            OrderManager_

class val.callback extends c
{

    final OrderManager_ this$0;
    final ceOrderCallback val$callback;
    final String val$domSession;
    final LabsOrder val$placeOrderRequest;

    public void execute()
    {
        try
        {
            OrderManager_.access$201(OrderManager_.this, val$placeOrderRequest, val$domSession, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    ceOrderCallback(LabsOrder labsorder, String s2, ceOrderCallback ceordercallback)
    {
        this$0 = final_ordermanager_;
        val$placeOrderRequest = labsorder;
        val$domSession = s2;
        val$callback = ceordercallback;
        super(final_s, final_i, String.this);
    }
}
