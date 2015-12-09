// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.content.Context;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.core.analytics.AnalyticsService_;
import com.dominos.android.sdk.core.cart.CartManager_;
import com.dominos.android.sdk.core.coupon.CouponWizardManager_;
import com.dominos.android.sdk.core.giftcard.GiftCardManager_;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager_;
import com.dominos.android.sdk.core.order.OrderManager_;
import com.dominos.android.sdk.core.product.ProductWizardManager_;
import com.dominos.android.sdk.core.prompt.PromptManager_;
import com.dominos.android.sdk.core.setup.ConfigurationManager_;
import com.dominos.android.sdk.core.store.MenuManager_;
import com.dominos.android.sdk.core.store.StoreManager_;
import com.dominos.android.sdk.core.storelocator.CampusLocatorManager_;
import com.dominos.android.sdk.core.storelocator.StoreLocatorManager_;
import com.dominos.android.sdk.core.tracker.TrackerManager_;
import com.dominos.android.sdk.core.upsell.UpsellManager_;
import com.dominos.android.sdk.core.user.UserProfileManager_;
import com.dominos.android.sdk.extension.advertising.AdvertisingManager_;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager_;
import com.dominos.android.sdk.extension.nina.DomProductManager_;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager_;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Session
{

    public static final String ADVERTISING_MANAGER = "advertising_manager";
    public static final String ANALYTICS_MANAGER = "analytics_manager";
    public static final String CAMPUS_LOCATOR_MANAGER = "campus_locator_manager";
    public static final String CART_MANAGER = "cart_manager";
    public static final String CONFIGURATION_MANAGER = "configuration_manager";
    public static final String COUPON_WIZARD_MANAGER = "coupon_wizard_manager";
    public static final String DOM_PRODUCT_MANAGER = "dom_product_manager";
    public static final String GIFTCARD_MANAGER = "gift_card_manager";
    public static final String GOOGLE_WALLET_MANAGER = "google_wallet_manager";
    public static final String LOYALTY_MANAGER = "loyalty_manager";
    public static final String MENU_MANAGER = "menu_manager";
    public static final String ORDER_MANAGER = "order_manager";
    public static final String PRODUCT_WIZARD_MANAGER = "product_wizard_manager";
    public static final String PROMPT_MANAGER = "prompt_manager";
    public static final String SHOPRUNNER_MANAGER = "shoprunner_manager";
    public static final String STORE_LOCATOR_MANAGER = "store_locator";
    public static final String STORE_MANAGER = "store_manager";
    public static final String TRACKER_MANAGER = "tracker-manager";
    public static final String UPSELL_MANAGER = "upsell_manager";
    public static final String USER_MANAGER = "user_manager";
    private Map mManagerList;

    public Session(Context context)
    {
        mManagerList = new HashMap();
        Object obj = getChannelManagers(context);
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Manager manager = (Manager)((Iterator) (obj)).next();
                if (manager != null)
                {
                    addManager(manager);
                }
            } while (true);
        }
        addManager(UpsellManager_.getInstance_(context));
        addManager(AnalyticsService_.getInstance_(context));
        addManager(ConfigurationManager_.getInstance_(context));
        addManager(UserProfileManager_.getInstance_(context));
        addManager(PromptManager_.getInstance_(context));
        addManager(StoreLocatorManager_.getInstance_(context));
        addManager(CampusLocatorManager_.getInstance_(context));
        addManager(OrderManager_.getInstance_(context));
        addManager(CartManager_.getInstance_(context));
        addManager(StoreManager_.getInstance_(context));
        addManager(MenuManager_.getInstance_(context));
        addManager(ProductWizardManager_.getInstance_(context));
        addManager(CouponWizardManager_.getInstance_(context));
        addManager(GiftCardManager_.getInstance_(context));
        addManager(TrackerManager_.getInstance_(context));
        addManager(LoyaltyManager_.getInstance_(context));
        addManager(AdvertisingManager_.getInstance_(context));
        addManager(DomProductManager_.getInstance_(context));
        addManager(ShoprunnerManager_.getInstance_(context));
        addManager(GoogleWalletManager_.getInstance_(context));
        updateManagers();
    }

    private void addManager(Manager manager)
    {
        mManagerList.put(manager.getName(), manager);
    }

    private void updateManagers()
    {
        String s;
        for (Iterator iterator = mManagerList.keySet().iterator(); iterator.hasNext(); ((Manager)mManagerList.get(s)).setSession(this))
        {
            s = (String)iterator.next();
        }

    }

    protected abstract List getChannelManagers(Context context);

    public Manager getManager(String s)
    {
        return (Manager)mManagerList.get(s);
    }
}
