// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;

import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.nina.dialog.agent.CarryoutLoadGuard;
import com.dominos.nina.dialog.agent.CartCommandAgent;
import com.dominos.nina.dialog.agent.CartConfirmAgent;
import com.dominos.nina.dialog.agent.CouponCommandAgent;
import com.dominos.nina.dialog.agent.DeliveryCommandAgent;
import com.dominos.nina.dialog.agent.DeliverySelectionAgent;
import com.dominos.nina.dialog.agent.IntentionAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.ProfileGuard;
import com.dominos.nina.dialog.agent.ServiceMethodAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.dialog.agent.VanityAgent;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExplicitNavigationEvents
{

    private DomProductManager mDomProductManager;
    MobileSession mMobileSession;
    SpeechManager mSpeechManager;

    public ExplicitNavigationEvents()
    {
    }

    public void addressDeliveryActivityTransition(SavedAddressesTransition savedaddressestransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.DELIVERY);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "new").appendValue(ServiceMethodAgent.NAME, "delivery").build());
        }
    }

    public void cartActivityTransition(CartActivityTransition cartactivitytransition)
    {
        if (!CartConfirmAgent.handlingRememberedProduct.getAndSet(false))
        {
            mDomProductManager.clearPartialProductsResetProductController();
        }
        mSpeechManager.setProductRedirection(null);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset(ProductsAgent.NAME).appendReset("OrderAgency").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "cart").build());
        }
    }

    public void checkoutActivityTransition(CheckoutActivityTransition checkoutactivitytransition)
    {
        c.i();
    }

    public void couponListActivityTransition(CouponListActivityTransition couponlistactivitytransition)
    {
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "coupon").build());
        }
    }

    public void couponWizardActivityTransition(CouponWizardActivityTransition couponwizardactivitytransition)
    {
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "coupon_wizard").build());
        }
    }

    public void easyOrderActivityTransition(EasyOrderActivityTransition easyorderactivitytransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.EASY);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "show_easy").appendValue(ProfileGuard.NAME, "DONE").build());
        }
    }

    public void flavorListActivityTransition(FlavorListActivityTransition flavorlistactivitytransition)
    {
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "detail").appendValue(ProductsAgent.NAME, "DONE").build());
        }
    }

    public void landingFragmentTransition(LandingFragmentTransition landingfragmenttransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.LANDING);
        if (!c.i())
        {
            ProductsAgent.remembered = null;
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").build());
        }
    }

    public void landingScreenTransition(LandingScreenTransition landingscreentransition)
    {
        VanityAgent.hasMeaning = false;
    }

    public void menuListActivityTransition(MenuListActivityTransition menulistactivitytransition)
    {
label0:
        {
            mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.MENULIST);
            if (!c.i())
            {
                if (!menulistactivitytransition.isFromCouponWizard())
                {
                    break label0;
                }
                SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendValue(CouponCommandAgent.NAME, "menu_list").build());
            }
            return;
        }
        SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu_list").build());
    }

    public void newAddressFormTransition(NewAddressFormTransition newaddressformtransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.DELIVERY);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "new").appendValue(ServiceMethodAgent.NAME, "delivery").appendValue(DeliverySelectionAgent.NAME, "1").appendValue(DeliveryCommandAgent.NAME, "address_form").build());
        }
    }

    public void newAddressTypeTransition(NewAddressTypeTransition newaddresstypetransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.DELIVERY);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "new").appendValue(ServiceMethodAgent.NAME, "delivery").appendValue(DeliverySelectionAgent.NAME, "1").appendValue(DeliveryCommandAgent.NAME, "address_type").build());
        }
    }

    public void newOrderFragmentTransition(NewOrderFragmentTransition neworderfragmenttransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.NEW);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "new").build());
        }
    }

    public void productDetailsListActivityTransition(ProductDetailsListActivityTransition productdetailslistactivitytransition)
    {
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "detail").appendValue(ProductsAgent.NAME, "DONE").build());
        }
    }

    public void recentOrderActivityTransition(RecentOrderActivityTransition recentorderactivitytransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.RECENT);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "recent").appendValue(ProfileGuard.NAME, "DONE").build());
        }
    }

    public void rootMenuActivityTransition(RootMenuActivityTransition rootmenuactivitytransition)
    {
label0:
        {
            mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.ROOTMENU);
            if (!c.i())
            {
                if (!rootmenuactivitytransition.isFromCouponWizard())
                {
                    break label0;
                }
                SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "coupon_wizard").appendValue(CouponCommandAgent.NAME, "menu_root").build());
            }
            return;
        }
        SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "cart").appendValue(CartCommandAgent.NAME, "menu").build());
    }

    public void setup()
    {
        App.getInstance().bus.register(this);
        mDomProductManager = (DomProductManager)mMobileSession.getManager("dom_product_manager");
    }

    public void sizeListActivityTransition(SizeListActivityTransition sizelistactivitytransition)
    {
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "detail").appendValue(ProductsAgent.NAME, "DONE").build());
        }
    }

    public void storeListActivityTransition(StoreListActivityTransition storelistactivitytransition)
    {
        mSpeechManager.setProductRedirection(com.dominos.nina.speech.SpeechManager.ProductRedirection.CARRYOUT);
        if (!c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset("Application").appendValue(IntentionAgent.NAME, "order").appendValue(UserIntentionAgent.NAME, "new").appendValue(ServiceMethodAgent.NAME, "carryout").appendValue(CarryoutLoadGuard.NAME, "DONE").build());
        }
    }

    private class MenuListActivityTransition
    {

        private boolean isFromCouponWizard;

        public boolean isFromCouponWizard()
        {
            return isFromCouponWizard;
        }

        public MenuListActivityTransition(boolean flag)
        {
            isFromCouponWizard = flag;
        }
    }


    private class RootMenuActivityTransition
    {

        private boolean isFromCouponWizard;

        public boolean isFromCouponWizard()
        {
            return isFromCouponWizard;
        }

        public RootMenuActivityTransition(boolean flag)
        {
            isFromCouponWizard = flag;
        }
    }

}
