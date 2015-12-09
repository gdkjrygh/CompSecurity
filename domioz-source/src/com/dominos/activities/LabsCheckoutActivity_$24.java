// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity_

class val.errorCode extends c
{

    final LabsCheckoutActivity_ this$0;
    final PlaceOrderErrorCode val$errorCode;
    final LabsOrder val$order;

    public void execute()
    {
        try
        {
            LabsCheckoutActivity_.access$1901(LabsCheckoutActivity_.this, val$order, val$errorCode);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    orCode(String s1, LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        this$0 = final_labscheckoutactivity_;
        val$order = labsorder;
        val$errorCode = placeordererrorcode;
        super(final_s, I.this, s1);
    }
}
