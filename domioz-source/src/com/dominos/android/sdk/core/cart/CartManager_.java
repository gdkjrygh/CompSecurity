// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import android.content.Context;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartManager, CartAPI_

public final class CartManager_ extends CartManager
{

    private Context context_;

    private CartManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CartManager_ getInstance_(Context context)
    {
        return new CartManager_(context);
    }

    private void init_()
    {
        mPrefs = new DominosPrefs_(context_);
        mCartApi = CartAPI_.getInstance_(context_);
    }

    public final void addCouponToOrder(LabsOrder labsorder, String s, com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback addcoupontoordercallback)
    {
        a.a(new _cls1(labsorder, s, addcoupontoordercallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final CartManager_ this$0;
        final com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback val$callback;
        final String val$couponCode;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                addCouponToOrder(order, couponCode, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(LabsOrder labsorder, String s2, com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback addcoupontoordercallback)
        {
            this$0 = CartManager_.this;
            order = labsorder;
            couponCode = s2;
            callback = addcoupontoordercallback;
            super(final_s, final_i, final_s1);
        }
    }

}
