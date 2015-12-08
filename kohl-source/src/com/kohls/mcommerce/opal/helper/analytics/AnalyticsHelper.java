// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.analytics;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.analytics.AnalyticsMain;
import com.analytics.utils.enums.BazarvoiceAction;
import com.analytics.utils.enums.ProductFindingMethod;
import com.analytics.utils.enums.ScreenNames;
import com.analytics.utils.enums.SearchType;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.AnalyticsUtil;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRUtility;
import java.util.HashMap;

public class AnalyticsHelper
{

    public AnalyticsHelper()
    {
    }

    public static String buildProductStringForAnalytics(com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product product, String s, Context context, String s1, boolean flag, String s2, boolean flag1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (product != null)
        {
            s2 = product.getWebID();
            flag = UtilityMethods.onlineExclusive(product, context);
            product = s2;
        } else
        {
            product = s2;
        }
        if (flag)
        {
            context = "y";
        } else
        {
            context = "n";
        }
        stringbuilder.append(";");
        if (product != null)
        {
            stringbuilder.append(product);
            stringbuilder.append(";;;;");
            if (s != null)
            {
                stringbuilder.append("evar11=").append(s).append("|");
            }
            stringbuilder.append("evar16=").append(context);
            if (s1 != null)
            {
                stringbuilder.append("|").append("evar51=").append(s1);
            }
        }
        return stringbuilder.toString();
    }

    public static void sendAddProductToListAnalytics(String s, String s1, boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = "y";
        } else
        {
            obj = "n";
        }
        s1 = (new StringBuilder()).append(";").append(s1).append(";;;;evar16=").append(((String) (obj))).append("|evar57=").append(s).toString();
        obj = new HashMap();
        ((HashMap) (obj)).put("page.name", ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState());
        ((HashMap) (obj)).put("page.type", ScreenNames.ADD_PRODUCT_TO_LIST.getPageType());
        ((HashMap) (obj)).put("&&products", s1);
        ((HashMap) (obj)).put("page.siteSection", "list|list add");
        ((HashMap) (obj)).put("action.addToList", "1");
        ((HashMap) (obj)).put("registry.name", (new StringBuilder()).append(s).append("|owner").toString());
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            ((HashMap) (obj)).put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        AnalyticsUtil.sendTrackState(ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState(), ((HashMap) (obj)));
    }

    public static void sendAddProductToListAnalytics(String s, boolean flag, String s1, String s2)
    {
        String s3;
        if (flag)
        {
            s3 = "y";
        } else
        {
            s3 = "n";
        }
        if (s1 != null && !TextUtils.isEmpty(s1))
        {
            s1 = (new StringBuilder()).append(";").append(s2).append(";;;;evar11=").append(s1).append("|evar16=").append(s3).append("|evar57=").append(s).toString();
        } else
        {
            s1 = (new StringBuilder()).append(";").append(s2).append(";;;;evar16=").append(s3).append("|evar57=").append(s).toString();
        }
        s2 = new HashMap();
        s2.put("page.name", ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState());
        s2.put("page.type", ScreenNames.ADD_PRODUCT_TO_LIST.getPageType());
        s2.put("&&products", s1);
        s2.put("page.siteSection", "list|list add");
        s2.put("action.addToList", "1");
        s2.put("registry.name", (new StringBuilder()).append(s).append("|owner").toString());
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            s2.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        AnalyticsUtil.sendTrackState(ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState(), s2);
    }

    public static void sendAddProductToRegistryAnalytics(long l, String s, String s1, boolean flag, String s2, String s3)
    {
        String s4;
        String s5;
        if (flag)
        {
            s4 = "y";
        } else
        {
            s4 = "n";
        }
        s5 = (new StringBuilder()).append("registry:").append(l).toString();
        if (s2 != null && !TextUtils.isEmpty(s2))
        {
            s2 = (new StringBuilder()).append(";").append(s3).append(";;;;evar11=").append(s2).append("|evar16=").append(s4).append("|evar57=").append(s5).toString();
        } else
        {
            s2 = (new StringBuilder()).append(";").append(s3).append(";;;;evar16=").append(s4).append("|evar57=").append(s5).toString();
        }
        s = LnRUtility.getEventNameForAnalytics(s, s1);
        s1 = new HashMap();
        s1.put("page.name", ScreenNames.ADD_PRODUCT_TO_REGISTRY.getTrackState());
        s1.put("page.type", ScreenNames.ADD_PRODUCT_TO_REGISTRY.getPageType());
        s1.put("&&products", s2);
        s1.put("page.siteSection", "registry|registry add");
        s1.put("action.addToList", "1");
        s1.put("registry.name", LnRUtility.getRegistryNameForAnalytics(s, false, l));
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            s1.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        AnalyticsUtil.sendTrackState(ScreenNames.ADD_PRODUCT_TO_REGISTRY.getTrackState(), s1);
    }

    public static void sendAddProductToRegistryAnalytics(long l, String s, boolean flag, String s1, String s2)
    {
        String s3;
        String s4;
        if (flag)
        {
            s3 = "y";
        } else
        {
            s3 = "n";
        }
        s4 = (new StringBuilder()).append("registry:").append(l).toString();
        s = (new StringBuilder()).append(";").append(s).append(";;;;evar16=").append(s3).append("|evar57=").append(s4).toString();
        s1 = LnRUtility.getEventNameForAnalytics(s1, s2);
        s2 = new HashMap();
        s2.put("page.name", ScreenNames.ADD_PRODUCT_TO_REGISTRY.getTrackState());
        s2.put("page.type", ScreenNames.ADD_PRODUCT_TO_REGISTRY.getPageType());
        s2.put("&&products", s);
        s2.put("page.siteSection", "registry|registry add");
        s2.put("action.addToList", "1");
        s2.put("registry.name", LnRUtility.getRegistryNameForAnalytics(s1, false, l));
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            s2.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        AnalyticsUtil.sendTrackState(ScreenNames.ADD_PRODUCT_TO_REGISTRY.getTrackState(), s2);
    }

    public static void sendAnalyticForRegistryTypeSelection()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", ScreenNames.CREATE_REGISTRY_SELECT_TYPE.getTrackState());
        hashmap.put("page.type", ScreenNames.CREATE_REGISTRY_SELECT_TYPE.getPageType());
        hashmap.put("page.siteSection", "registry|registry create");
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_REGISTRY_SELECT_TYPE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForAddProductToList()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.ADD_PRODUCT_TO_LIST.getPageType());
        hashmap.put("page.siteSection", "list|list add");
        hashmap.put("page.name", ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState());
        hashmap.put("action.addToList", "1");
        AnalyticsUtil.sendTrackAction(ScreenNames.ADD_PRODUCT_TO_LIST.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForCartModify(String s)
    {
        s = new HashMap();
        s.put("page.siteSection", "cart|cart");
        s.put("page.type", ScreenNames.CART.getPageType());
        s.put("page.name", ScreenNames.CART.getTrackState());
        s.put("actions.modifyCart", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.CART.getTrackState(), s);
    }

    public static void sendAnalyticsForCreateList()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.CREATE_LIST.getPageType());
        hashmap.put("page.siteSection", "list|list create");
        hashmap.put("page.name", ScreenNames.CREATE_LIST.getTrackState());
        hashmap.put("product.findingMethod", ProductFindingMethod.LIST.toString());
        hashmap.put("actions.listCreate", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_LIST.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForCreateListConfirmation()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.CREATE_LIST_CONFIRMATION.getPageType());
        hashmap.put("page.siteSection", "list|list create");
        hashmap.put("page.name", ScreenNames.CREATE_LIST_CONFIRMATION.getTrackState());
        hashmap.put("product.findingMethod", ProductFindingMethod.LIST.toString());
        hashmap.put("actions.listCreateConfirm", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_LIST_CONFIRMATION.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForCreateRegistryCompleted()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", ScreenNames.CREATE_REGISTRY_COMPLETED.getTrackState());
        hashmap.put("page.type", ScreenNames.CREATE_REGISTRY_COMPLETED.getPageType());
        hashmap.put("page.siteSection", "registry|registry create");
        hashmap.put("actions.giftRegistryCreate", "1");
        hashmap.put("actions.listCreate", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_REGISTRY_COMPLETED.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForFindInStore(com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product product, boolean flag, boolean flag1, String s, String s1, Context context)
    {
        sendAnalyticsForFindInStore(buildProductStringForAnalytics(product, s1, context, null, false, null, false), flag, flag1, s);
    }

    public static void sendAnalyticsForFindInStore(String s, boolean flag, boolean flag1, String s1)
    {
        HashMap hashmap = new HashMap();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj;
        if (flag1)
        {
            s1 = ScreenNames.FIND_IN_STORE_CHECKOUT;
            if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null)
            {
                hashmap.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
            }
            hashmap.put("page.siteSection", "checkout|find in store");
        } else
        {
            s1 = ScreenNames.FIND_IN_STORE_PDP;
            hashmap.put("page.siteSection", "pdp|find in store");
        }
        hashmap.put("actions.findInStore", "1");
        obj = s1;
_L4:
        hashmap.put("page.type", ((ScreenNames) (obj)).getPageType());
        hashmap.put("page.name", ((ScreenNames) (obj)).getTrackState());
        hashmap.put("&&products", s);
        AnalyticsUtil.sendTrackState(((ScreenNames) (obj)).getTrackState(), hashmap);
        return;
_L2:
        ScreenNames screennames;
        if (flag1)
        {
            screennames = ScreenNames.STORE_SEARCH_CHECKOUT;
            hashmap.put("page.siteSection", "checkout|store search");
        } else
        {
            screennames = ScreenNames.STORE_SEARCH_PDP;
            hashmap.put("page.siteSection", "pdp|store search");
        }
        hashmap.put("actions.storeSearch", "1");
        obj = screennames;
        if (s1 != null)
        {
            hashmap.put("store.search", s1);
            obj = screennames;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void sendAnalyticsForHomePage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.HOME_PAGE.getPageType());
        hashmap.put("page.siteSection", "homepage|homepage");
        hashmap.put("page.name", ScreenNames.HOME_PAGE.getTrackState());
        hashmap.put("search.term", "non-search");
        hashmap.put("search.type", "non-search");
        hashmap.put("product.findingMethod", ProductFindingMethod.BROWSE.toString());
        AnalyticsUtil.sendTrackState(ScreenNames.HOME_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForInStoreTools()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.IN_STORE_TOOLS.getPageType());
        hashmap.put("page.siteSection", "in store tools|main");
        hashmap.put("page.name", ScreenNames.IN_STORE_TOOLS.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.IN_STORE_TOOLS.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForPMPFromVisualSearch(int i, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("&&products", (new StringBuilder()).append(";product").append(KohlsPhoneApplication.getInstance().getAnalytics().getInteractionNumber() + 1).toString());
        hashmap.put("actions.internalSearch", "1");
        hashmap.put("page.type", "a|pmp");
        hashmap.put("search.term", SearchType.SEARCH_VISUAL.toString());
        hashmap.put("product.findingMethod", ProductFindingMethod.SEARCH_VISUAL.toString());
        hashmap.put("page.siteSection", "search|pmp");
        hashmap.put("matrix.default", "search");
        hashmap.put("matrix.all", "search");
        hashmap.put("matrix.refineTraffic", "search>no refinement");
        hashmap.put("dimensions.names", "no refinement");
        hashmap.put("dimensions.values", "no refinement");
        hashmap.put("search.type", SearchType.SEARCH_VISUAL.toString());
        hashmap.put("page.name", "a>search");
        hashmap.put("actions.internalSearch", "1");
        hashmap.put("actions.merchInstance", "1");
        hashmap.put("actions.visualSearch", "1");
        try
        {
            hashmap.put("search.resultNumber", Integer.toString(i));
        }
        catch (NumberFormatException numberformatexception) { }
        if (s != null && !s.isEmpty())
        {
            hashmap.put("sort.view", s);
        }
        AnalyticsUtil.sendTrackState("a>search", hashmap);
    }

    public static void sendAnalyticsForRemoveItemFromRegistry(String s, String s1, ScreenNames screennames, String s2, String s3, String s4)
    {
        HashMap hashmap = new HashMap();
        if (screennames != null)
        {
            hashmap.put("page.name", screennames.getTrackState());
            hashmap.put("page.type", screennames.getPageType());
        }
        if (s2 != null)
        {
            hashmap.put("page.siteSection", s2);
        }
        if (s3 != null && !TextUtils.isEmpty(s3))
        {
            hashmap.put("registry.name", s3);
        }
        if (s4 != null && !TextUtils.isEmpty(s4) && s != null)
        {
            hashmap.put(s, s4);
        }
        if (s1 != null && !TextUtils.isEmpty(s1))
        {
            hashmap.put("cart.id", s1);
        }
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForReview(String s, BazarvoiceAction bazarvoiceaction, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        if (s1 != null)
        {
            hashmap.put("&&products", s1);
        }
        hashmap.put("page.type", ScreenNames.PDP.getPageType());
        hashmap.put("page.name", (new StringBuilder()).append(ScreenNames.PDP.getTrackState()).append(" (").append(s2).append(") ").append(Html.fromHtml(s)).toString());
        hashmap.put("page.siteSection", "pdp|review");
        hashmap.put("bazaarvoice.actionName", bazarvoiceaction.toString());
        hashmap.put("actions.bazaarvoice", "1");
        AnalyticsUtil.sendTrackState((new StringBuilder()).append(ScreenNames.PDP.getTrackState()).append(" (").append(s2).append(") ").append(Html.fromHtml(s)).toString(), hashmap);
    }

    public static void sendAnalyticsForRewards(ScreenNames screennames)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", screennames.getPageType());
        hashmap.put("page.siteSection", "my account|rewards");
        hashmap.put("page.name", screennames.getTrackState());
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForRewards(ScreenNames screennames, HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null && !hashmap.isEmpty())
        {
            hashmap1.putAll(hashmap);
        }
        hashmap1.put("page.type", screennames.getPageType());
        hashmap1.put("page.siteSection", "my account|rewards");
        hashmap1.put("page.name", screennames.getTrackState());
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap1);
    }

    public static void sendAnalyticsForRewardsActivity()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.REWARDS_ACTIVITY.getPageType());
        hashmap.put("page.siteSection", "my account|rewards");
        hashmap.put("page.name", ScreenNames.REWARDS_ACTIVITY.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.REWARDS_ACTIVITY.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForStoreLocator(ScreenNames screennames)
    {
        HashMap hashmap = new HashMap();
        if (screennames == ScreenNames.STORE_LOCATOR_MAIN)
        {
            hashmap.put("page.siteSection", "store locator|main");
        } else
        {
            hashmap.put("page.siteSection", "store locator|results");
        }
        hashmap.put("page.type", screennames.getPageType());
        hashmap.put("page.name", screennames.getTrackState());
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }

    public static void sendAnalyticsForUpdateProductToBopus(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.siteSection", "checkout|change ship to bopus");
        hashmap.put("page.type", ScreenNames.UPDATE_PRODUCT_TO_BOPUS.getPageType());
        hashmap.put("actions.pickupCartAdd", "1");
        hashmap.put("actions.changeShipBopus", "1");
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            hashmap.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        hashmap.put("&&products", s);
        if (UtilityMethods.getShopingBagItemsCount() <= 0)
        {
            hashmap.put("actions.cart", "1");
        }
        AnalyticsUtil.sendTrackAction(ScreenNames.UPDATE_PRODUCT_TO_BOPUS.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnAccountLandingPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.ACCOUNT_LANDING_PAGE.getPageType());
        hashmap.put("page.siteSection", "my account|homepage");
        hashmap.put("page.name", ScreenNames.ACCOUNT_LANDING_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.ACCOUNT_LANDING_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnAddGiftToBag(String s, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("actions.gwppwpAdd", "1");
        if (flag)
        {
            hashmap.put("product.findingMethod", "gwp");
        } else
        {
            hashmap.put("product.findingMethod", "pwp");
        }
        sendAnalyticsOnAddItemToBag(s, hashmap, KohlsPhoneApplication.getInstance().getKohlsPref().getCartID(), false);
    }

    public static void sendAnalyticsOnAddItemToBag(String s, HashMap hashmap, String s1, boolean flag)
    {
        s1 = hashmap;
        if (hashmap == null)
        {
            s1 = new HashMap();
        }
        s1.put("page.siteSection", "cart|cart add");
        s1.put("page.type", ScreenNames.CART_ADD.getPageType());
        s1.put("actions.cartAdd", "1");
        if (flag)
        {
            s1.put("actions.pickupCartAdd", "1");
        } else
        {
            s1.put("actions.pickupCartAdd", "0");
        }
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            s1.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        s1.put("&&products", s);
        if (UtilityMethods.getShopingBagItemsCount() <= 0)
        {
            s1.put("actions.cart", "1");
        }
        AnalyticsUtil.sendTrackAction(ScreenNames.CART_ADD.getTrackState(), s1);
    }

    public static void sendAnalyticsOnCreateAccount()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.CREATE_ACCOUNT.getPageType());
        hashmap.put("page.siteSection", "my account|create");
        hashmap.put("page.name", ScreenNames.CREATE_ACCOUNT.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_ACCOUNT.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnDealsAndCouponLandingPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.DEALS_AND_COUPON_LANDING_PAGE.getPageType());
        hashmap.put("page.siteSection", "deals and coupons|main");
        hashmap.put("page.name", ScreenNames.DEALS_AND_COUPON_LANDING_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.DEALS_AND_COUPON_LANDING_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnGiftCardAdded()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_GIFT_CARD_ADDED.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_GIFT_CARD_ADDED.getTrackState());
        hashmap.put("actions.walletAdd", "1");
        AnalyticsUtil.sendTrackAction(ScreenNames.WALLET_GIFT_CARD_ADDED.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnKohlsChargeLandingPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.KOHLS_CHARGE_LANDING_PAGE.getPageType());
        hashmap.put("page.siteSection", "my kohls charge|main");
        hashmap.put("page.name", ScreenNames.KOHLS_CHARGE_LANDING_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.KOHLS_CHARGE_LANDING_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnKohlsChargeOptionPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.KOHLS_CHARGE_OPTIONS_PAGE.getPageType());
        hashmap.put("page.siteSection", "my kohls charge|options");
        hashmap.put("page.name", ScreenNames.KOHLS_CHARGE_OPTIONS_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.KOHLS_CHARGE_OPTIONS_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnKohlsHashTag()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.KOHLS_HASH_TAG.getPageType());
        hashmap.put("page.siteSection", "my account|hashtag kohls");
        hashmap.put("page.name", ScreenNames.KOHLS_HASH_TAG.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.KOHLS_HASH_TAG.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnLivePhotoOption()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.VISUAL_SEARCH_OVERLAY_LIVE_PHOTO.getPageType());
        hashmap.put("page.siteSection", "search|take photo");
        hashmap.put("page.name", ScreenNames.VISUAL_SEARCH_OVERLAY_LIVE_PHOTO.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.VISUAL_SEARCH_OVERLAY_LIVE_PHOTO.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnLoadHelpAndContactUs()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.HELP_CONTACT_US.getPageType());
        hashmap.put("page.siteSection", "help|main");
        hashmap.put("page.name", ScreenNames.HELP_CONTACT_US.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.HELP_CONTACT_US.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnNoResults(String s, String s1)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("&&products", (new StringBuilder()).append(";product").append(KohlsPhoneApplication.getInstance().getAnalytics().getInteractionNumber() + 1).toString());
        hashmap.put("page.type", ScreenNames.PMP_NO_RESULTS.getPageType());
        hashmap.put("product.findingMethod", ProductFindingMethod.SEARCH_NO_MATCHES.toString());
        hashmap.put("actions.internalSearch", "1");
        hashmap.put("search.type", "app-regular");
        hashmap.put("search.resultNumber", "zero");
        hashmap.put("actions.noResultSearch", "1");
        hashmap.put("page.siteSection", "search|no results");
        hashmap.put("page.name", ScreenNames.PMP_NO_RESULTS.getTrackState());
        hashmap.put("dimensions.names", "no refinement");
        hashmap.put("dimensions.values", "no refinement");
        hashmap.put("matrix.all", "search");
        hashmap.put("matrix.default", "search");
        hashmap.put("matrix.refineTraffic", "search>no refinement");
        hashmap.put("actions.merchInstance", "1");
        if (s1 == null || !s1.equals(SearchType.SEARCH_VISUAL)) goto _L2; else goto _L1
_L1:
        hashmap.put("actions.visualSearch", "1");
_L4:
        hashmap.put("search.term", s);
        AnalyticsUtil.sendTrackState(ScreenNames.PMP_NO_RESULTS.getTrackState(), hashmap);
        return;
_L2:
        if (s1 != null && s1.equals(SearchType.SEARCH_VOICE))
        {
            hashmap.put("actions.voiceSearch", "1");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void sendAnalyticsOnNoResultsFromVisualSearch(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("&&products", (new StringBuilder()).append(";product").append(KohlsPhoneApplication.getInstance().getAnalytics().getInteractionNumber() + 1).toString());
        hashmap.put("page.type", ScreenNames.PMP_NO_RESULTS.getPageType());
        hashmap.put("page.siteSection", "search|no results");
        hashmap.put("page.name", ScreenNames.PMP_NO_RESULTS.getTrackState());
        hashmap.put("dimensions.names", "no refinement");
        hashmap.put("dimensions.values", "no refinement");
        hashmap.put("matrix.all", "search");
        hashmap.put("matrix.default", "search");
        hashmap.put("matrix.refineTraffic", "search>no refinement");
        hashmap.put("search.term", s);
        hashmap.put("search.type", "app-regular");
        hashmap.put("search.resultNumber", "zero");
        hashmap.put("product.findingMethod", "search-no matches-visual");
        hashmap.put("actions.internalSearch", "1");
        hashmap.put("actions.noResultSearch", "1");
        hashmap.put("actions.merchInstance", "1");
        hashmap.put("actions.visualSearch", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.PMP_NO_RESULTS.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnScanFail()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("&&products", (new StringBuilder()).append(";products").append(KohlsPhoneApplication.getInstance().getAnalytics().getInteractionNumber() + 1).toString());
        hashmap.put("page.type", ScreenNames.SCAN_FAIL.getPageType());
        hashmap.put("product.findingMethod", ProductFindingMethod.SCAN.toString());
        hashmap.put("actions.internalSearch", "1");
        hashmap.put("search.term", "app-scan");
        hashmap.put("search.type", "app-scan");
        hashmap.put("search.resultNumber", "zero");
        hashmap.put("actions.noResultSearch", "1");
        hashmap.put("page.siteSection", "scan|unsuccessful");
        hashmap.put("page.name", ScreenNames.SCAN_FAIL.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.SCAN_FAIL.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnScannerStart()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.SCANNER.getPageType());
        hashmap.put("page.siteSection", "in store tools|scanner");
        hashmap.put("page.name", ScreenNames.SCANNER.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.SCANNER.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnSearchClick()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.SEARCH_OVERLAY.getPageType());
        hashmap.put("page.siteSection", "search|main overlay");
        hashmap.put("page.name", ScreenNames.SEARCH_OVERLAY.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.SEARCH_OVERLAY.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnShopMenuVisibility()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", "a|shopmenu");
        hashmap.put("page.siteSection", "shopmenu|shopmenu");
        hashmap.put("page.name", "a>shopmenu");
        hashmap.put("product.findingMethod", ProductFindingMethod.BROWSE.toString());
        AnalyticsUtil.sendTrackState("a>shopmenu", hashmap);
    }

    public static void sendAnalyticsOnSignIn()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.SIGN_IN_PAGE.getPageType());
        hashmap.put("page.siteSection", "account|sign in or sign up");
        hashmap.put("page.name", ScreenNames.SIGN_IN_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.SIGN_IN_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnUsingWallet()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.USING_YOUR_WALLET.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.USING_YOUR_WALLET.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.USING_YOUR_WALLET.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnVisualSearchClick()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.VISUAL_SEARCH_OVERLAY.getPageType());
        hashmap.put("page.siteSection", "search|visual overlay");
        hashmap.put("page.name", ScreenNames.VISUAL_SEARCH_OVERLAY.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.VISUAL_SEARCH_OVERLAY.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnWalletDiscountAdded()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_DISCOUNT_ADDED.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_DISCOUNT_ADDED.getTrackState());
        hashmap.put("actions.walletAdd", "1");
        AnalyticsUtil.sendTrackAction(ScreenNames.WALLET_DISCOUNT_ADDED.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnWalletKohlsCashAdded()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_KOHLS_CASH_ADDED.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_KOHLS_CASH_ADDED.getTrackState());
        hashmap.put("actions.walletAdd", "1");
        AnalyticsUtil.sendTrackAction(ScreenNames.WALLET_KOHLS_CASH_ADDED.getTrackState(), hashmap);
    }

    public static void sendAnalyticsOnWalletLandingPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_LANDING_PAGE.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_LANDING_PAGE.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.WALLET_LANDING_PAGE.getTrackState(), hashmap);
    }

    public static void sendAnalyticsTrackStateForLnR(ScreenNames screennames, ProductFindingMethod productfindingmethod, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", screennames.getTrackState());
        hashmap.put("page.type", screennames.getPageType());
        hashmap.put("page.siteSection", s1);
        if (productfindingmethod != null)
        {
            hashmap.put("product.findingMethod", productfindingmethod.toString());
        }
        if (s != null && !TextUtils.isEmpty(s))
        {
            hashmap.put("search.term", s);
        }
        if (s2 != null && !TextUtils.isEmpty(s2))
        {
            hashmap.put("registry.name", s2);
        }
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }

    public static void sendAnalyticsTrackStateForLnR(ScreenNames screennames, ProductFindingMethod productfindingmethod, String s, String s1, String s2, String s3, String s4)
    {
        HashMap hashmap = new HashMap();
        if (screennames != null)
        {
            hashmap.put("page.name", screennames.getTrackState());
            hashmap.put("page.type", screennames.getPageType());
        }
        if (productfindingmethod != null)
        {
            hashmap.put("product.findingMethod", productfindingmethod.toString());
        }
        if (s != null)
        {
            hashmap.put("search.term", s);
        }
        if (s1 != null)
        {
            hashmap.put("page.siteSection", s1);
        }
        if (s2 != null && !TextUtils.isEmpty(s2))
        {
            hashmap.put("registry.name", s2);
        }
        if (s3 != null)
        {
            hashmap.put("&&products", s3);
        }
        if (s4 != null)
        {
            hashmap.put("actions.internalSearch", s4);
        }
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }

    public static void sendAnalyticsWalletGiftCard()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_VIEW_GIFT_CARD.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("actions.walletAdd", "1");
        hashmap.put("page.name", ScreenNames.WALLET_VIEW_GIFT_CARD.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.WALLET_VIEW_GIFT_CARD.getTrackState(), hashmap);
    }

    public static void sendAnalyticsWalletKCAndRewards()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_KC_AND_REWARD.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_KC_AND_REWARD.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.WALLET_KC_AND_REWARD.getTrackState(), hashmap);
    }

    public static void sendAnalyticsWalletKohlsOffer()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_KOHLS_OFFER.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_KOHLS_OFFER.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.WALLET_KOHLS_OFFER.getTrackState(), hashmap);
    }

    public static void sendAnalyticsWalletYesTo()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.WALLET_YES_2_YOU.getPageType());
        hashmap.put("page.siteSection", "my account|wallet");
        hashmap.put("page.name", ScreenNames.WALLET_YES_2_YOU.getTrackState());
        AnalyticsUtil.sendTrackState(ScreenNames.WALLET_YES_2_YOU.getTrackState(), hashmap);
    }

    public static void sendEditCategoriesAnalytics(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist)
    {
        String s = LnRUtility.getEventNameForAnalytics(wishlist.getRegistryProperties().getProperties().getRegtype(), wishlist.getRegistryProperties().getProperties().getCustomEventType());
        String s1 = (new StringBuilder()).append(ScreenNames.REGISTRY_EDIT_CATEGORIES.getTrackState()).append(":").append(s).append(":edit categories").toString();
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", s1);
        hashmap.put("page.type", ScreenNames.REGISTRY_EDIT_CATEGORIES.getPageType());
        hashmap.put("page.siteSection", "registry|edit categories");
        hashmap.put("registry.name", LnRUtility.getRegistryNameForAnalytics(s, false, wishlist.getListId()));
        AnalyticsUtil.sendTrackState(s1, hashmap);
    }

    public static void sendEditRegistrySettingsAnalytics(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist)
    {
        wishlist = LnRUtility.getEventNameForAnalytics(wishlist.getRegistryProperties().getProperties().getRegtype(), wishlist.getRegistryProperties().getProperties().getCustomEventType());
        wishlist = (new StringBuilder()).append(ScreenNames.REGISTRY_EDIT_SETTINGS.getTrackState()).append(":").append(wishlist).append(":edit settings").toString();
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", wishlist);
        hashmap.put("page.type", ScreenNames.REGISTRY_EDIT_SETTINGS.getPageType());
        hashmap.put("page.siteSection", "registry|edit settings");
        AnalyticsUtil.sendTrackState(wishlist, hashmap);
    }

    public static void sendFindListAnalytics(CharSequence charsequence)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", ScreenNames.FIND_LIST.getTrackState());
        hashmap.put("page.type", ScreenNames.FIND_LIST.getPageType());
        hashmap.put("page.siteSection", "list|list search");
        if (charsequence != null && !TextUtils.isEmpty(charsequence))
        {
            hashmap.put("search.term", (new StringBuilder()).append("list: ").append(charsequence).toString());
        }
        hashmap.put("product.findingMethod", ProductFindingMethod.LIST.toString());
        hashmap.put("actions.internalSearch", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.FIND_LIST.getTrackState(), hashmap);
    }

    public static void sendListConfirmationAnalytics(CharSequence charsequence)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", ScreenNames.CREATE_LIST_CONFIRMATION.getTrackState());
        hashmap.put("page.type", ScreenNames.CREATE_LIST_CONFIRMATION.getPageType());
        hashmap.put("page.siteSection", "list|list create");
        hashmap.put("product.findingMethod", ProductFindingMethod.LIST.toString());
        if (charsequence != null && !TextUtils.isEmpty(charsequence))
        {
            hashmap.put("registry.name", (new StringBuilder()).append(charsequence).append("|owner").toString());
        }
        hashmap.put("actions.listCreate", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.CREATE_LIST_CONFIRMATION.getTrackState(), hashmap);
    }

    public static void sendListViewAnalytics(boolean flag, String s)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            String s1 = (new StringBuilder()).append(ScreenNames.LIST_DETAIL.getTrackState()).append(s).append(":guest").toString();
            hashmap.put("product.findingMethod", ProductFindingMethod.LIST_GUEST.toString());
            hashmap.put("registry.name", (new StringBuilder()).append(s).append("|guest").toString());
            s = s1;
        } else
        {
            String s2 = (new StringBuilder()).append(ScreenNames.LIST_DETAIL.getTrackState()).append(s).append(":owner").toString();
            hashmap.put("product.findingMethod", ProductFindingMethod.LIST_OWNER.toString());
            hashmap.put("registry.name", (new StringBuilder()).append(s).append("|owner").toString());
            s = s2;
        }
        hashmap.put("page.name", s);
        hashmap.put("page.type", ScreenNames.LIST_DETAIL.getPageType());
        hashmap.put("page.siteSection", "list|list view");
        hashmap.put("dimensions.names", "no refinement");
        hashmap.put("dimensions.values", "no refinement");
        hashmap.put("matrix.all", "list");
        hashmap.put("matrix.default", "list");
        hashmap.put("matrix.refineTraffic", "list>no refinement");
        AnalyticsUtil.sendTrackState(s, hashmap);
    }

    public static void sendRegistryViewAnalytics(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist, boolean flag)
    {
        String s = LnRUtility.getEventNameForAnalytics(wishlist.getRegistryProperties().getProperties().getRegtype(), wishlist.getRegistryProperties().getProperties().getCustomEventType());
        String s1 = (new StringBuilder()).append(ScreenNames.REGISTRY_VIEW.getTrackState()).append(":").append(s).append(":view").toString();
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", s1);
        hashmap.put("page.type", ScreenNames.REGISTRY_VIEW.getPageType());
        hashmap.put("page.siteSection", "registry|registry view");
        hashmap.put("dimensions.names", "no refinement");
        hashmap.put("dimensions.values", "no refinement");
        hashmap.put("matrix.all", "registry");
        hashmap.put("matrix.default", "registry");
        hashmap.put("matrix.refineTraffic", "registry>no refinement");
        hashmap.put("registry.name", LnRUtility.getRegistryNameForAnalytics(s, flag, wishlist.getListId()));
        if (flag)
        {
            hashmap.put("product.findingMethod", ProductFindingMethod.REGISTRY_GUEST.toString());
        } else
        {
            hashmap.put("product.findingMethod", ProductFindingMethod.REGISTRY_OWNER.toString());
        }
        AnalyticsUtil.sendTrackState(s1, hashmap);
    }

    public static void sendRemoveListItemAnalytics(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", ScreenNames.LIST_REMOVE_ITEM.getPageType());
        hashmap.put("page.siteSection", "list|list remove");
        hashmap.put("registry.name", (new StringBuilder()).append(s).append("|owner").toString());
        hashmap.put("actions.removeFromList", "1");
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            hashmap.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
        }
        AnalyticsUtil.sendTrackAction("a>list:remove item", hashmap);
    }

    public static void sendShareListAnalytics(boolean flag, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", ScreenNames.SHARE_LIST.getTrackState());
        hashmap.put("page.type", ScreenNames.SHARE_LIST.getPageType());
        hashmap.put("page.siteSection", "list|share");
        if (flag)
        {
            hashmap.put("registry.name", (new StringBuilder()).append(s).append("|guest").toString());
        } else
        {
            hashmap.put("registry.name", (new StringBuilder()).append(s).append("|owner").toString());
        }
        hashmap.put("actions.shareList", "1");
        AnalyticsUtil.sendTrackState(ScreenNames.SHARE_LIST.getTrackState(), hashmap);
    }

    public static void sendShareRegistryAnalytics(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist, boolean flag)
    {
        String s = LnRUtility.getEventNameForAnalytics(wishlist.getRegistryProperties().getProperties().getRegtype(), wishlist.getRegistryProperties().getProperties().getCustomEventType());
        String s1 = (new StringBuilder()).append(ScreenNames.SHARE_REGISTRY.getTrackState()).append(":").append(s).append(":share").toString();
        HashMap hashmap = new HashMap();
        hashmap.put("page.name", s1);
        hashmap.put("page.type", ScreenNames.SHARE_REGISTRY.getPageType());
        hashmap.put("page.siteSection", "registry|share");
        hashmap.put("actions.shareList", "1");
        hashmap.put("registry.name", LnRUtility.getRegistryNameForAnalytics(s, flag, wishlist.getListId()));
        AnalyticsUtil.sendTrackState(s1, hashmap);
    }

    public static void sendVoiceAnalytics(ScreenNames screennames, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page.type", screennames.getPageType());
        hashmap.put("page.siteSection", s);
        hashmap.put("page.name", screennames.getTrackState());
        hashmap.put("search.type", "non-search");
        hashmap.put("product.findingMethod", ProductFindingMethod.BROWSE.toString());
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
    }
}
