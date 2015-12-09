// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.nina.speech.SpeechManager_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.bus.events:
//            ExplicitNavigationEvents

public final class ExplicitNavigationEvents_ extends ExplicitNavigationEvents
{

    private static ExplicitNavigationEvents_ instance_;
    private Context context_;

    private ExplicitNavigationEvents_(Context context)
    {
        context_ = context;
    }

    public static ExplicitNavigationEvents_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ExplicitNavigationEvents_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        mSpeechManager = SpeechManager_.getInstance_(context_);
        setup();
    }

    public final void addressDeliveryActivityTransition(ExplicitNavigationEvents.SavedAddressesTransition savedaddressestransition)
    {
        addressDeliveryActivityTransition(savedaddressestransition);
    }

    public final void cartActivityTransition(ExplicitNavigationEvents.CartActivityTransition cartactivitytransition)
    {
        cartActivityTransition(cartactivitytransition);
    }

    public final void checkoutActivityTransition(ExplicitNavigationEvents.CheckoutActivityTransition checkoutactivitytransition)
    {
        checkoutActivityTransition(checkoutactivitytransition);
    }

    public final void couponListActivityTransition(ExplicitNavigationEvents.CouponListActivityTransition couponlistactivitytransition)
    {
        couponListActivityTransition(couponlistactivitytransition);
    }

    public final void couponWizardActivityTransition(ExplicitNavigationEvents.CouponWizardActivityTransition couponwizardactivitytransition)
    {
        couponWizardActivityTransition(couponwizardactivitytransition);
    }

    public final void easyOrderActivityTransition(ExplicitNavigationEvents.EasyOrderActivityTransition easyorderactivitytransition)
    {
        easyOrderActivityTransition(easyorderactivitytransition);
    }

    public final void flavorListActivityTransition(ExplicitNavigationEvents.FlavorListActivityTransition flavorlistactivitytransition)
    {
        flavorListActivityTransition(flavorlistactivitytransition);
    }

    public final void landingFragmentTransition(ExplicitNavigationEvents.LandingFragmentTransition landingfragmenttransition)
    {
        landingFragmentTransition(landingfragmenttransition);
    }

    public final void landingScreenTransition(ExplicitNavigationEvents.LandingScreenTransition landingscreentransition)
    {
        landingScreenTransition(landingscreentransition);
    }

    public final void menuListActivityTransition(ExplicitNavigationEvents.MenuListActivityTransition menulistactivitytransition)
    {
        menuListActivityTransition(menulistactivitytransition);
    }

    public final void newAddressFormTransition(ExplicitNavigationEvents.NewAddressFormTransition newaddressformtransition)
    {
        newAddressFormTransition(newaddressformtransition);
    }

    public final void newAddressTypeTransition(ExplicitNavigationEvents.NewAddressTypeTransition newaddresstypetransition)
    {
        newAddressTypeTransition(newaddresstypetransition);
    }

    public final void newOrderFragmentTransition(ExplicitNavigationEvents.NewOrderFragmentTransition neworderfragmenttransition)
    {
        newOrderFragmentTransition(neworderfragmenttransition);
    }

    public final void productDetailsListActivityTransition(ExplicitNavigationEvents.ProductDetailsListActivityTransition productdetailslistactivitytransition)
    {
        productDetailsListActivityTransition(productdetailslistactivitytransition);
    }

    public final void recentOrderActivityTransition(ExplicitNavigationEvents.RecentOrderActivityTransition recentorderactivitytransition)
    {
        recentOrderActivityTransition(recentorderactivitytransition);
    }

    public final void rootMenuActivityTransition(ExplicitNavigationEvents.RootMenuActivityTransition rootmenuactivitytransition)
    {
        rootMenuActivityTransition(rootmenuactivitytransition);
    }

    public final void sizeListActivityTransition(ExplicitNavigationEvents.SizeListActivityTransition sizelistactivitytransition)
    {
        sizeListActivityTransition(sizelistactivitytransition);
    }

    public final void storeListActivityTransition(ExplicitNavigationEvents.StoreListActivityTransition storelistactivitytransition)
    {
        storeListActivityTransition(storelistactivitytransition);
    }


















}
