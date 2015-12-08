// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import com.dominos.android.sdk.core.models.LabsOrder;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartManager_

class val.callback extends c
{

    final CartManager_ this$0;
    final com.dominos.android.sdk.core.coupon.ager.AddCouponToOrderCallback val$callback;
    final String val$couponCode;
    final LabsOrder val$order;

    public void execute()
    {
        try
        {
            CartManager_.access$001(CartManager_.this, val$order, val$couponCode, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    nToOrderCallback(LabsOrder labsorder, String s2, com.dominos.android.sdk.core.coupon.ager.AddCouponToOrderCallback addcoupontoordercallback)
    {
        this$0 = final_cartmanager_;
        val$order = labsorder;
        val$couponCode = s2;
        val$callback = addcoupontoordercallback;
        super(final_s, final_i, String.this);
    }
}
