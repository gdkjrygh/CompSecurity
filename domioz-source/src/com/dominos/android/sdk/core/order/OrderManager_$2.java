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
    final LabsOrder val$newOrder;

    public void execute()
    {
        try
        {
            OrderManager_.access$101(OrderManager_.this, val$newOrder, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    ceOrderCallback(String s1, LabsOrder labsorder, ceOrderCallback ceordercallback)
    {
        this$0 = final_ordermanager_;
        val$newOrder = labsorder;
        val$callback = ceordercallback;
        super(final_s, I.this, s1);
    }
}
