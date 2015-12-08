// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.utils;

import android.content.Context;
import com.dominos.controllers.CheckoutScreenController;
import com.dominos.controllers.CheckoutScreenController_;
import com.dominos.controllers.CouponListController;
import com.dominos.controllers.CouponListController_;
import com.dominos.controllers.CouponWizardController;
import com.dominos.controllers.CouponWizardController_;
import com.dominos.controllers.FastPathFragmentController;
import com.dominos.controllers.FastPathFragmentController_;
import com.dominos.controllers.GiftCardController;
import com.dominos.controllers.GiftCardController_;
import com.dominos.controllers.LandingScreenController;
import com.dominos.controllers.LandingScreenController_;
import com.dominos.controllers.MenuListController;
import com.dominos.controllers.MenuListController_;
import com.dominos.controllers.NoCachedAddressFragmentController;
import com.dominos.controllers.NoCachedAddressFragmentController_;
import com.dominos.controllers.SplashScreenController;
import com.dominos.controllers.SplashScreenController_;
import com.dominos.controllers.StoreListController;
import com.dominos.controllers.StoreListController_;
import com.dominos.controllers.interfaces.IDominosView;

public class ControllerLocator
{

    Context context;

    public ControllerLocator(Context context1)
    {
        context = context1;
    }

    public CheckoutScreenController getCheckoutScreenController(IDominosView idominosview)
    {
        return (CheckoutScreenController)CheckoutScreenController_.getInstance_(context).setView(idominosview);
    }

    public CouponListController getCouponListController(IDominosView idominosview)
    {
        return (CouponListController)CouponListController_.getInstance_(context).setView(idominosview);
    }

    public CouponWizardController getCouponWizardController(IDominosView idominosview)
    {
        return (CouponWizardController)CouponWizardController_.getInstance_(context).setView(idominosview);
    }

    public FastPathFragmentController getFastPathFragmentController(IDominosView idominosview)
    {
        return (FastPathFragmentController)FastPathFragmentController_.getInstance_(context).setView(idominosview);
    }

    public GiftCardController getGiftCardController(IDominosView idominosview)
    {
        return (GiftCardController)GiftCardController_.getInstance_(context).setView(idominosview);
    }

    public LandingScreenController getLandingScreenController(IDominosView idominosview)
    {
        return (LandingScreenController)LandingScreenController_.getInstance_(context).setView(idominosview);
    }

    public MenuListController getMenuListController(IDominosView idominosview)
    {
        return (MenuListController)MenuListController_.getInstance_(context).setView(idominosview);
    }

    public NoCachedAddressFragmentController getNoCachedAddressFragmentController(IDominosView idominosview)
    {
        return (NoCachedAddressFragmentController)NoCachedAddressFragmentController_.getInstance_(context).setView(idominosview);
    }

    public SplashScreenController getSplashScreenController(IDominosView idominosview)
    {
        return (SplashScreenController)SplashScreenController_.getInstance_(context).setView(idominosview);
    }

    public StoreListController getStoreListController(IDominosView idominosview)
    {
        return (StoreListController)StoreListController_.getInstance_(context).setView(idominosview);
    }
}
