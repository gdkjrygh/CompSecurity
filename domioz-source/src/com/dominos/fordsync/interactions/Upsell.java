// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.fordsync.service.SyncPowerAPI;
import com.dominos.utils.AnalyticsUtil;
import java.text.NumberFormat;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction, PlaceOrder_, Upsell_, ErrorHandler_, 
//            ErrorHandler

public class Upsell extends YesNoInteraction
{

    protected LabsOrder currentOrder;
    AnalyticsUtil mAnalyticsUtil;
    private CartManager mCartManager;
    private ConfigurationManager mConfigurationManager;
    private MenuManager mMenuManager;
    private String productName;
    private String productPrice;
    private LabsProductLine upsellProductLine;

    public Upsell()
    {
    }

    public volatile PromptModel getInitialPrompt()
    {
        return getInitialPrompt();
    }

    public SyncInteraction.PromptWithArguments getInitialPrompt()
    {
        return new SyncInteraction.PromptWithArguments(this, prompts.getPrompter("initial_prompt").getRandomPrompt(), new Object[] {
            productName, productPrice
        });
    }

    public String getTimeoutPrompt()
    {
        return prompts.getPrompter("timeout_prompt").getRandomPrompt().getSpeech(new Object[] {
            productName, productPrice
        });
    }

    protected void no()
    {
        mAnalyticsUtil.postFordSyncUpsellNo();
        super.no();
        PlaceOrder_.getInstance_(app).setOrder(currentOrder).start();
    }

    public void onAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mFordSyncSession.getManager("configuration_manager");
        mMenuManager = (MenuManager)mFordSyncSession.getManager("menu_manager");
        mCartManager = (CartManager)mFordSyncSession.getManager("cart_manager");
    }

    public Upsell_ setOrder(LabsOrder labsorder)
    {
        currentOrder = labsorder;
        return (Upsell_)this;
    }

    public void start()
    {
        String s = currentOrder.determineUpsellProduct(mConfigurationManager.getUpsellData(), mMenuManager.getMenu(), true);
        if (StringHelper.isNotBlank(s))
        {
            mAnalyticsUtil.postFordSyncUpsellPrompt(s);
            upsellProductLine = mMenuManager.createProductLineFromVariantCode(s);
            mMenuManager.loadOptionsFromMenu(upsellProductLine);
            upsellProductLine.setQuantity(1);
            productName = sanitizeProductInformation(upsellProductLine.getProduct().getName());
            productPrice = currency.format(upsellProductLine.getPrice());
            super.start();
            return;
        } else
        {
            PlaceOrder_.getInstance_(app).setOrder(currentOrder).start();
            return;
        }
    }

    protected void yes()
    {
        mAnalyticsUtil.postFordSyncUpsellYes();
        mAppLinkManager.prompt(prompts.getPrompter("choice_yes"), new Object[] {
            productName
        });
        mCartManager.addProductline(currentOrder, upsellProductLine);
        LabsOrder labsorder = restApi.priceOrder(currentOrder);
        if (labsorder != null)
        {
            mAppLinkManager.prompt(prompts.getPrompter("new_total_amount"), new Object[] {
                currency.format(labsorder.getPrice())
            });
            PlaceOrder_.getInstance_(app).setOrder(labsorder).start();
            return;
        } else
        {
            ErrorHandler_.getInstance_(app).reason("store_or_order_errors").start();
            return;
        }
    }
}
