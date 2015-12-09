// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.controllers:
//            CouponListController

public final class CouponListController_ extends CouponListController
{

    private Context context_;

    private CouponListController_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CouponListController_ getInstance_(Context context)
    {
        return new CouponListController_(context);
    }

    private void init_()
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
        onAfterInject();
    }

    public final void addCouponToOrder(String s)
    {
        a.a(new _cls1(0, "", s));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final CouponListController_ this$0;
        final String val$couponCode;

        public void execute()
        {
            try
            {
                addCouponToOrder(couponCode);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(int i, String s1, String s2)
        {
            this$0 = CouponListController_.this;
            couponCode = s2;
            super(final_s, i, s1);
        }
    }

}
