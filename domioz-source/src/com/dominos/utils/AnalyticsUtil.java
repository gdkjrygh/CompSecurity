// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.giftcard.GiftCardManager_;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.fordsync.FordSyncSession;
import com.google.a.b.ar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnalyticsUtil
{

    private static final String TAG = com/dominos/utils/AnalyticsUtil.getSimpleName();
    protected AnalyticsService mAnalyticsService;
    DominosPrefs_ prefs;

    public AnalyticsUtil()
    {
    }

    public static Map generateCustomDataMap(Session session, LabsOrder labsorder, boolean flag)
    {
        Object obj = (UserProfileManager)session.getManager("user_manager");
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        hashmap.put("product_related_event", "p");
        Object obj1;
        boolean flag1;
        boolean flag3;
        if (((UserProfileManager) (obj)).getEasyOrder() != null && StringHelper.equals(((UserProfileManager) (obj)).getEasyOrder().getId(), labsorder.getOriginalOrderId()))
        {
            hashmap.put("is_easy_order", "true");
        } else
        if (flag)
        {
            hashmap.put("save_as_easy_order", "true");
        }
        hashmap.put("order_id", String.format("%s#%s", new Object[] {
            labsorder.getStoreOrderId(), labsorder.getStoreId()
        }));
        hashmap.put("original_order_id", labsorder.getOriginalOrderId());
        hashmap.put("my_srv_methd", labsorder.getServiceMethod());
        hashmap.put("my_store_id", labsorder.getStoreId());
        hashmap.put("order_grand_total", String.format("%.2f", new Object[] {
            Double.valueOf(labsorder.getPrice())
        }));
        hashmap.put("order_discount", labsorder.getSavings());
        obj = GiftCardManager_.getInstance_(App.getInstance());
        obj1 = labsorder.getPaymentList().iterator();
        flag3 = false;
        flag1 = false;
        do
        {
            while (((Iterator) (obj1)).hasNext()) 
            {
                LabsPayment labspayment = (LabsPayment)((Iterator) (obj1)).next();
                boolean flag2;
                if (labspayment.getPaymentType().equals("Cash"))
                {
                    hashmap.put("cash_payment_amount", String.valueOf(((GiftCardManager) (obj)).getRemainingBalance(labsorder)));
                    flag2 = true;
                } else
                {
                    flag2 = flag3;
                    if (!flag3)
                    {
                        hashmap.put("cash_payment_amount", "0.00");
                        flag2 = flag3;
                    }
                }
                if (labspayment.getPaymentType().equals("CreditCard") || labspayment.getPaymentType().equals("CreditCardToken"))
                {
                    if (labspayment.getWalletPayment() != null)
                    {
                        hashmap.put("google_wallet_payment_amount", String.valueOf(((GiftCardManager) (obj)).getRemainingBalance(labsorder)));
                    } else
                    {
                        hashmap.put("credit_card_payment_amount", String.valueOf(((GiftCardManager) (obj)).getRemainingBalance(labsorder)));
                    }
                    flag3 = true;
                } else
                {
                    flag3 = flag1;
                    if (!flag1)
                    {
                        hashmap.put("credit_card_payment_amount", "0.00");
                        flag3 = flag1;
                    }
                }
                if (labspayment.getPaymentType().equals("GiftCard"))
                {
                    hashmap.put("gift_card_payment_amount", String.valueOf(((GiftCardManager) (obj)).getTotalGiftCardAmount()));
                    flag1 = flag3;
                    flag3 = flag2;
                } else
                {
                    hashmap.put("gift_card_payment_amount", "0.00");
                    flag1 = flag3;
                    flag3 = flag2;
                }
            }
            obj = "";
            String as[] = labsorder.getPlaceOrderTime().split(" ");
            if (as.length > 1)
            {
                obj = as[1];
            }
            hashmap.put("order_time", obj);
            obj = "";
            as = labsorder.getBusinessDate().split("-");
            if (as.length > 2)
            {
                obj = String.format("%s/%s/%s", new Object[] {
                    as[1], as[2], as[0]
                });
            }
            hashmap.put("order_date", obj);
            obj = new StringBuilder();
            as = new StringBuilder();
            StringBuilder stringbuilder = new StringBuilder();
            StringBuilder stringbuilder1 = new StringBuilder();
            StringBuilder stringbuilder2 = new StringBuilder();
            StringBuilder stringbuilder3 = new StringBuilder();
            List list = labsorder.getProductLineList();
            for (int i = 0; i < list.size(); i++)
            {
                String s = ((LabsProductLine)list.get(i)).getCode();
                LabsVariant labsvariant = ((MenuManager)session.getManager("menu_manager")).getVariant(s);
                ((StringBuilder) (obj)).append(((LabsProductLine)list.get(i)).getProduct().getProductType());
                as.append(s);
                stringbuilder.append(labsvariant.getName());
                stringbuilder1.append(((LabsProductLine)list.get(i)).getQuantity());
                stringbuilder2.append(((LabsProductLine)list.get(i)).getPrice());
                stringbuilder3.append((new StringBuilder()).append(((LabsProductLine)list.get(i)).getProduct().getProductType()).append("-").append(s).toString());
                for (int l = 0; l < 6; l++)
                {
                    (new StringBuilder[] {
                        obj, as, stringbuilder, stringbuilder1, stringbuilder2, stringbuilder3
                    })[l].append(";");
                }

            }

            for (session = labsorder.getCouponLineList().iterator(); session.hasNext();)
            {
                LabsCouponLine labscouponline = (LabsCouponLine)session.next();
                ((StringBuilder) (obj)).append("Coupon");
                as.append(labscouponline.getCoupon().getCode());
                stringbuilder.append("Coupon");
                stringbuilder1.append("1");
                stringbuilder2.append("0.00");
                stringbuilder3.append((new StringBuilder("Coupon-")).append(labscouponline.getCoupon().getCode()).toString());
                int j = 0;
                while (j < 6) 
                {
                    (new StringBuilder[] {
                        obj, as, stringbuilder, stringbuilder1, stringbuilder2, stringbuilder3
                    })[j].append(";");
                    j++;
                }
            }

            for (int k = 0; k < 4; k++)
            {
                session = (new StringBuilder[] {
                    obj, as, stringbuilder, stringbuilder3
                })[k];
                session.append(labsorder.getServiceMethod().toUpperCase());
                if (session == stringbuilder3)
                {
                    session.append((new StringBuilder("-")).append(labsorder.getServiceMethod().toUpperCase()).toString());
                }
            }

            stringbuilder1.append("1");
            if (labsorder.getServiceMethod().equalsIgnoreCase("delivery"))
            {
                session = Double.valueOf(labsorder.getDeliveryAmount());
            } else
            {
                session = "0.00";
            }
            stringbuilder2.append(session);
            hashmap.put("product_family", ((StringBuilder) (obj)).toString());
            hashmap.put("sku_id", as.toString());
            hashmap.put("product_name", stringbuilder.toString());
            hashmap.put("units", stringbuilder1.toString());
            hashmap.put("order_subtotal", stringbuilder2.toString());
            hashmap.put("product_family_sku_id", stringbuilder3.toString());
            return hashmap;
        } while (true);
    }

    private Map newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName pagename, String s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category category, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label label)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        if (!StringHelper.isEmpty(pagename.getName()))
        {
            hashmap.put("page_name", pagename.getName());
        }
        if (!StringHelper.isEmpty(s))
        {
            hashmap.put("event_name", s);
        }
        if (category != null)
        {
            hashmap.put("event_category", category.getName());
        }
        if (label != null)
        {
            hashmap.put("event_label", label.getName());
        }
        hashmap.put("event_action", "Tap");
        return hashmap;
    }

    private Map newAnalyticsEventMap(String s, String s1, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category category, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label label)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        if (!StringHelper.isEmpty(s))
        {
            hashmap.put("page_name", s);
        }
        if (!StringHelper.isEmpty(s1))
        {
            hashmap.put("event_name", s1);
        }
        if (category != null)
        {
            hashmap.put("event_category", category.getName());
        }
        if (label != null)
        {
            hashmap.put("event_label", label.getName());
        }
        hashmap.put("event_action", "Tap");
        return hashmap;
    }

    public static Map newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName pagename, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        if (!StringHelper.isEmpty(pagename.getName()))
        {
            hashmap.put("page_name", pagename.getName());
        }
        if (!StringHelper.isEmpty(s))
        {
            hashmap.put("page_url", s);
        }
        return hashmap;
    }

    public static Map newAnalyticsViewMap(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        if (!StringHelper.isEmpty(s))
        {
            hashmap.put("page_name", s);
        }
        if (!StringHelper.isEmpty(s1))
        {
            hashmap.put("page_url", s1);
        }
        return hashmap;
    }

    public static void setCommonGroupData(Map map, String s, String s1)
    {
        map.put("group", s);
        map.put("sub_group", s1);
    }

    public void clickNegativeRateApp()
    {
        LogUtil.d(TAG, "METHOD: clickNegativeRateApp()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.RATE_APP, "Decline", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void clickNeutralAppRate()
    {
        LogUtil.d(TAG, "METHOD: clickNeutralAppRate()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.RATE_APP, "Remind", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void clickPositiveRateApp()
    {
        LogUtil.d(TAG, "METHOD: clickPositiveRateApp()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.RATE_APP, "Accept", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void onCheckoutRegistrationComplete()
    {
        LogUtil.d(TAG, "METHOD: onCheckoutRegistrationComplete()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CHECKOUT, "Registration Complete", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Account");
        map.put("sub_group", "Registration Complete");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAccountLogin()
    {
        LogUtil.d(TAG, "METHOD: postAccountLogin()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE_SIGN_IN, "/pizza_profile/sign_in");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postAccountRegistrationClick()
    {
        LogUtil.d(TAG, "METHOD: postAccountRegistrationClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_PROFILE, "Create Profile", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Account Login");
        map.put("sub_group", "Register");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAccountRegistrationSuccess()
    {
        LogUtil.d(TAG, "METHOD: postAccountRegistrationSuccess()", new Object[0]);
        Map map = newAnalyticsEventMap("/account_registration_form", "Account Created", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Account Login");
        map.put("sub_group", "Register");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAddAnotherItemClick()
    {
        LogUtil.d(TAG, "METHOD: postAddAnotherItemClick()", new Object[0]);
        Map map = newAnalyticsViewMap("Coupon Wizard Completed AddAnotherItem", "/coupon_wizard/completed/add_another_item");
        setCommonGroupData(map, "Coupons", "Add Another Item in Wizard");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAddDessertToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddDessertToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SIDE_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddDrinkToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddDrinkToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DRINK_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddPastaToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddPastaToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PASTA_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddPizzaToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddPizzaToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddSandwichToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddSandwichToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SANDWICH_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddSideToOrder(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddSideToOrder()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DESSERT_DETAILS, (new StringBuilder("Add To Order - ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAddToOrder(String s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation buttonlocation)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postAddToOrder()   |    categoryCode: ")).append(s).toString(), new Object[0]);
        if (s.equalsIgnoreCase("Pizza"))
        {
            postAddPizzaToOrder(buttonlocation.getName());
        } else
        {
            if (s.equalsIgnoreCase("Pasta"))
            {
                postAddPastaToOrder(buttonlocation.getName());
                return;
            }
            if (s.equalsIgnoreCase("Drinks"))
            {
                postAddDrinkToOrder(buttonlocation.getName());
                return;
            }
            if (s.equalsIgnoreCase("Sides"))
            {
                postAddSideToOrder(buttonlocation.getName());
                return;
            }
            if (s.equalsIgnoreCase("Dessert"))
            {
                postAddDessertToOrder(buttonlocation.getName());
                return;
            }
            if (s.equalsIgnoreCase("Sandwich"))
            {
                postAddSandwichToOrder(buttonlocation.getName());
                return;
            }
        }
    }

    public void postAddressSaved()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_FORM, "Add Location Complete", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Account");
        map.put("sub_group", "Add Location Complete");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAddressTypeSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postAddressTypeSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_TYPE, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postAnonymousCarryoutClicked()
    {
        LogUtil.d(TAG, "METHOD: postAnonymousCarryoutClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Carryout", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Order Settings");
        map.put("order_type", "Carryout");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postAnonymousDeliveryClicked()
    {
        LogUtil.d(TAG, "METHOD: postAnonymousDeliveryClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Delivery", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Order Settings");
        map.put("order_type", "Delivery");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postApplicationStart()
    {
        LogUtil.d(TAG, "METHOD: postApplicationStart()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SPLASH_SCREEN, "/splash_screen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postBeaconOrderListScreen()
    {
        LogUtil.d(TAG, "METHOD: postBeaconOrderListScreen()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_CHECKIN, "/beacon/check_in_here");
        map.put("group", "Beacon");
        map.put("sub_group", "CheckIn Here Page");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postCartChangeLocationMenuClicked()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Change Location", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartCheckoutClicked(com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation buttonlocation)
    {
        LogUtil.d(TAG, "METHOD: postCartCheckoutClicked()", new Object[0]);
        buttonlocation = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, (new StringBuilder("Checkout - ")).append(buttonlocation.getName()).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, buttonlocation);
    }

    public void postCartCouponClicked()
    {
        LogUtil.d(TAG, "METHOD: postCartCouponClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Coupons", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartDeleteClicked()
    {
        LogUtil.d(TAG, "METHOD: postCartDeleteClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Delete", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("product_related_event", "r");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartEditClicked()
    {
        LogUtil.d(TAG, "METHOD: postCartEditClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Edit", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartGoogleWalletClicked()
    {
        LogUtil.d(TAG, "METHOD: postCartGoogleWalletClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Buy with GW", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartHomeEvent()
    {
        LogUtil.d(TAG, "METHOD: postCartHomeEvent()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "/cart");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postCartMenuButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postCartMenuButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Menu", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartReset()
    {
        LogUtil.d(TAG, "METHOD: postCartReset()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Cart Reset", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartRewardsPieRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postCartRewardsPieRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Widget Image Tap", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCartRewardsWidgetRedeem()
    {
        LogUtil.d(TAG, "METHOD: postCartRewardsWidgetRedeem()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, "Widget - Redeem", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCheckoutOnResume()
    {
        LogUtil.d(TAG, "METHOD: postCheckoutOnResume()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CHECKOUT, "/checkout");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postCheckoutRewardsEnrollClick()
    {
        LogUtil.d(TAG, "METHOD: postCheckoutRewardsEnrollClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CHECKOUT, "Rewards Enroll Checkbox", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.CHECKBOX, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCheckoutRewardsInfoClick()
    {
        LogUtil.d(TAG, "METHOD: postCheckoutRewardsInfoClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CHECKOUT, "Rewards Enroll ?", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCheckoutSignInButton()
    {
        Map map = newAnalyticsEventMap("Checkout SignIn", "Sign In", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        setCommonGroupData(map, "Checkout", "Sign-in Click");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCloseRewardsInterstitialAnonymous()
    {
        LogUtil.d(TAG, "METHOD: postCloseRewardsInterstitialAnonymous()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_ANONYMOUS, "Rewards X", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCloseRewardsInterstitialLoggedIn()
    {
        LogUtil.d(TAG, "METHOD: postCloseRewardsInterstitialLoggedIn()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_LOGGED_IN, "Rewards X", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCouponAdded(String s)
    {
        LogUtil.d(TAG, "METHOD: postCouponAdded()", new Object[0]);
        Map map = newAnalyticsViewMap("coupon_added", "");
        map.put("coupon_code", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCouponWizardAvailableProducts()
    {
        LogUtil.d(TAG, "METHOD: postCouponWizardAvailableProducts()", new Object[0]);
        Map map = newAnalyticsViewMap("Coupon Wizard Available Products", "/coupons/wizard/available_products");
        map.put("sub_group", "Available products");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postCouponWizardVisit()
    {
        LogUtil.d(TAG, "METHOD: postCouponWizardVisit()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.COUPON_WIZARD, "/coupons/wizard");
        map.put("sub_group", "Wizard");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postCreateNewOrderClicked()
    {
        LogUtil.d(TAG, "METHOD: postCreateNewOrderClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Create A New Order", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postCrustFlavorsPageLoad(String s, String s1)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postCrustFlavorsPageLoad()   |    categoryCode: ")).append(s).append(" - product: ").append(s1).toString(), new Object[0]);
        if (s.equalsIgnoreCase("Pizza"))
        {
            postPizzaCrust(s1);
        } else
        {
            if (s.equalsIgnoreCase("Pasta"))
            {
                postPastaFlavors(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sides") || s.equalsIgnoreCase("Wings"))
            {
                postSideFlavors(s1);
                return;
            }
        }
    }

    public void postDeliveryAddressFormContinueClick()
    {
        LogUtil.d(TAG, "METHOD: postDeliveryAddressFormContinueClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_FORM, "Continue", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDeliveryAddressFormPage()
    {
        LogUtil.d(TAG, "METHOD: postDeliveryAddressFormPage()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_FORM, "/delivery_address_type/delivery_address_form");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDeliveryAddressSignInButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postDeliveryAddressSignInButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_TYPE, "Sign In", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDeliveryAddressTypePage()
    {
        LogUtil.d(TAG, "METHOD: postDeliveryAddressTypePage()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DELIVERY_ADDRESS_TYPE, "/delivery_address_type");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDessertDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postDessertDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DESSERT_DETAILS, "/menu/desserts/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDessertProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postDessertProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DESSERTS, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postDessertScreenView()
    {
        LogUtil.d(TAG, "METHOD: postDessertScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DESSERTS, "/menu/desserts");
        map.put("group", "Menu");
        map.put("sub_group", "Desserts");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDessertSize(String s)
    {
        LogUtil.d(TAG, "METHOD: postDessertSize()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DESSERT_SIZES, "/menu/desserts/sizes");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDominosUnavailable()
    {
        LogUtil.d(TAG, "METHOD: postDominosUnavailable()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SPLASH_SCREEN, "Domino's Unavailable", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.ERROR, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDoneButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postDoneButtonClicked()", new Object[0]);
        Map map = newAnalyticsViewMap("Coupon Wizard Completed Done", "/coupon_wizard/completed/done");
        setCommonGroupData(map, "Coupons", "Done with Wizard Completed");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDownloadPebbleAppAccept()
    {
        LogUtil.d(TAG, "METHOD: postDownloadPebbleAppAccept()", new Object[0]);
        Map map = newAnalyticsViewMap("PebbleApp Download Prompt Accept", "/pebble_app/download_prompt/accept");
        map.put("sub_group", "Download Prompt Accept");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDownloadPebbleAppDecline()
    {
        LogUtil.d(TAG, "METHOD: postDownloadPebbleAppDecline()", new Object[0]);
        Map map = newAnalyticsViewMap("PebbleApp Download Prompt Decline", "/pebble_app/download_prompt/decline");
        map.put("sub_group", "Download Prompt Decline");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postDrinkProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postDrinkProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DRINKS, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postDrinkSize(String s)
    {
        LogUtil.d(TAG, "METHOD: postDrinkSize()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DRINK_SIZES, "/menu/drinks/sizes");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDrinksDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postDrinksDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DRINK_DETAILS, "/menu/drinks/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postDrinksScreenView()
    {
        LogUtil.d(TAG, "METHOD: postDrinksScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.DRINKS, "/menu/drinks");
        map.put("group", "Menu");
        map.put("sub_group", "Refreshing Drinks");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postEasyOrderBoxChecked(Boolean boolean1)
    {
        LogUtil.d(TAG, "METHOD: postEasyOrderBoxChecked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CHECKOUT, "Save as Easy Order", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("EasyOrder/Checked", String.valueOf(boolean1));
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncAbstractOrderDetails()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Order Details", "/sync/info/order_details");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncAbstractOrderPrompt()
    {
        Map map = newAnalyticsViewMap("Ford Sync -  Abstract Order", "/sync/prompt/would_you_like_order_details");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncAbstractOrderPromptNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync -  Abstract Order - NO", "/sync/response/would_you_like_order_details/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncAbstractOrderPromptYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync -  Abstract Order - YES", "/sync/response/would_you_like_order_details/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncAbstractOrderSummary()
    {
        Map map = newAnalyticsViewMap("Ford Sync -  Abstract Order - Order Summary", "/sync/info/order_summary");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncAnnoyUserPrompt()
    {
        Map map = newAnalyticsViewMap("Ford Sync - AnnoyUser", "/sync/prompt/call_store_or_start_over");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncCallStore()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Call Store", "/sync/info/calling_store");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncCallStoreClick()
    {
        Map map = newAnalyticsViewMap("Ford Sync - AnnoyUser", "/sync/response/call_store_or_start_over/call_store");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncCallStoreInitialPrompt()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Call Store", "/sync/prompt/no_saved_store_call_nearest_store");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncCallStoreNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Call Store", "/sync/response/no_saved_store_call_nearest_store/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncCallStoreYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Call Store", "/sync/prompt/no_saved_store_call_nearest_store/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncCallStoreYesResponse()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Call Store", "/sync/response/no_saved_store_call_nearest_store");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncConnected()
    {
        Map map = newAnalyticsViewMap("Connected", "/sync/view/lockscreen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncDisconnected()
    {
        Map map = newAnalyticsViewMap("Disconnect", "/sync/view/lockscreen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncErrorHandlerNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Error Handler", "/sync/response/error/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncErrorHandlerReason(String s)
    {
        s = newAnalyticsViewMap("Ford Sync - Error Handler", String.format("/sync/error/%s", new Object[] {
            s
        }));
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, s);
    }

    public void postFordSyncErrorHandlerYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Error Handler", "/sync/response/error/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncHowMayIhelpYou()
    {
        Map map = newAnalyticsViewMap("Ford Sync - How May I Help You", "/sync/prompt/how_may_i_help_you");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncHowMayIhelpYouCallStore()
    {
        Map map = newAnalyticsViewMap("Ford Sync - How May I Help You", "/sync/response/how_may_i_help_you/call_store");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncInitialized()
    {
        Map map = newAnalyticsViewMap("Initialize", "/sync/view/lockscreen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncNeitherClick()
    {
        Map map = newAnalyticsViewMap("Ford Sync - AnnoyUser", "/sync/response/call_store_or_start_over/neither");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncPlaceEasyOrder()
    {
        Map map = newAnalyticsViewMap("Ford Sync - How May I Help You", "/sync/response/how_may_i_help_you/place_easy_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncPlaceOrderNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Place Order Response - No", "/sync/response/place_order/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncPlaceOrderPrompt(String s)
    {
        Map map = newAnalyticsViewMap("Ford Sync - Place Order Prompt", "/sync/prompt/place_order");
        map.put("Place Order", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncPlaceOrderSuccess(FordSyncSession fordsyncsession, LabsOrder labsorder, Boolean boolean1)
    {
        fordsyncsession = generateCustomDataMap(fordsyncsession, labsorder, boolean1.booleanValue());
        fordsyncsession.put("page_name", "Ford Sync - Place Order Confirmation");
        fordsyncsession.put("page_url", "/sync/checkout/purchase_confirmation");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, fordsyncsession);
    }

    public void postFordSyncPlaceOrderYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Place Order Response - Yes", "/sync/response/place_order/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncPlaceRecentOrder()
    {
        Map map = newAnalyticsViewMap("Ford Sync - How May I Help You", "/sync/response/how_may_i_help_you/place_most_recent_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncRestartInteractionError()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Response Error - Yes", "/sync/response/error/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncStartOverClick()
    {
        Map map = newAnalyticsViewMap("Ford Sync - AnnoyUser", "/sync/response/call_store_or_start_over/start_over");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncTrackMyOrder()
    {
        Map map = newAnalyticsViewMap("Ford Sync - How May I Help You", "/sync/response/how_may_i_help_you/track_my_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncTrackOrderNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Track Order - NO", "/sync/response/track_order/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncTrackOrderStart()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Track Order", "/sync/response/track_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postFordSyncTrackOrderYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Track Order - YES", "/sync/response/track_order/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncUpsellNo()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Upsell - NO", "/sync/response/upsell_add_to_order/no");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postFordSyncUpsellPrompt(String s)
    {
        s = newAnalyticsViewMap((new StringBuilder("Ford Sync - Upsell - ")).append(s).toString(), "/sync/prompt/upsell_add_to_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, s);
    }

    public void postFordSyncUpsellYes()
    {
        Map map = newAnalyticsViewMap("Ford Sync - Upsell - YES", "/sync/response/upsell_add_to_order/yes");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postGoToCart()
    {
        LogUtil.d(TAG, "METHOD: postGoToCart()", new Object[0]);
        Map map = newAnalyticsEventMap("Go to Cart [Multiple Pages]", "Home", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postHomePage(boolean flag, boolean flag1, boolean flag2)
    {
        LogUtil.d(TAG, "METHOD: postHomePage()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "/home");
        if (flag1)
        {
            map.put("remember_me", "True");
            map.put("logged_in", "False");
        } else
        if (flag && flag2)
        {
            map.put("remember_me", "False");
            map.put("logged_in", "True");
            map.put("has_easy_order", "True");
        } else
        if (flag && !flag2)
        {
            map.put("remember_me", "False");
            map.put("logged_in", "True");
            map.put("has_easy_order", "False");
        } else
        {
            map.put("remember_me", "False");
            map.put("logged_in", "False");
        }
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postInterstitialActivateTap()
    {
        LogUtil.d(TAG, "METHOD: postInterstitialActivateTap()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_LOGGED_IN, "Rewards Activate", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postInterstitialEnrollTap()
    {
        LogUtil.d(TAG, "METHOD: postInterstitialEnrollTap()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_ANONYMOUS, "Rewards Enroll", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postInterstitialSignInToActivateTap()
    {
        LogUtil.d(TAG, "METHOD: postInterstitialSignInToActivateTap()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_ANONYMOUS, "Rewards Sign in to activate", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LINK, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postLandingPieImageRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postLandingPieImageRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Widget Image Tap", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postLandingRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postLandingRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Widget - Redeem", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postLearnMoreInterstitialLoadAnonymous()
    {
        LogUtil.d(TAG, "METHOD: postLearnMoreInterstitialLoadAnonymous()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_ANONYMOUS, "/home/rewards_learn_more_anonymous/");
        map.put("group", "Rewards");
        map.put("sub_group", "Rewards Learn More Interstitial");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postLearnMoreInterstitialLoadLoggedIn()
    {
        LogUtil.d(TAG, "METHOD: postLearnMoreInterstitialLoadLoggedIn()", new Object[0]);
        HashMap hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        hashmap.put("page_name", "Rewards Learn More Interstitial Logged In");
        hashmap.put("group", "Rewards");
        hashmap.put("sub_group", "Rewards Learn More Interstitial");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, hashmap);
    }

    public void postLocatorSignInButton()
    {
        LogUtil.d(TAG, "METHOD: postLocatorSignInButton()", new Object[0]);
        Map map = newAnalyticsEventMap("Location Search SignIn", "Sign In", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        setCommonGroupData(map, "Location Main", "Sign-in Click");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postLogin(String s)
    {
        LogUtil.d(TAG, "METHOD: postLogin()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.LOGIN, "User Logged In", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("user_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postLoginDialogLoaded()
    {
        LogUtil.d(TAG, "METHOD: postLoginDialogLoaded()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE_POPUP, "/pizza_profile_popup");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postLoyaltyEnrolledEvent()
    {
        LogUtil.d(TAG, "METHOD: postLoyaltyEnrolledEvent()", new Object[0]);
        Map map = newAnalyticsViewMap("loyalty_account_created", "");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postLoyaltyFaqLoad()
    {
        LogUtil.d(TAG, "METHOD: postLoyaltyFaqLoad()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.FAQS, "/pizza_profile/faqs");
        map.put("group", "FAQs");
        map.put("sub_group", "FAQs");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postMenu()
    {
        LogUtil.d(TAG, "METHOD: postMenu()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.MENU, "/menu");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postMenuButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postMenuButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap("Order Settings", "Menu", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postMenuCategoryClick(String s)
    {
        String s1 = s;
        if (s.equals("Extras"))
        {
            s1 = "Sides";
        }
        LogUtil.d(TAG, (new StringBuilder("METHOD: postMenuCategoryClick()  |  cat: ")).append(s1).toString(), new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.MENU, s1, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postModifyButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postModifyButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap("Order Settings", "Modify", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postMoreRewardsHistoryClick()
    {
        LogUtil.d(TAG, "METHOD: postMoreRewardsHistoryClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_HISTORY, "Load More", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postMultiScreenButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postMultiScreenButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap("Multiview Prompt Accept", "Home", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Multiview");
        map.put("sub_group", "Prompt Accept");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postNewOrderPageLoaded()
    {
        LogUtil.d(TAG, "METHOD: postNewOrderPageLoaded()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_NEW_ORDER, "/create_new_order");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postNewsFeedLandingTapped()
    {
        LogUtil.d(TAG, "METHOD: postNewsFeedLandingTapped()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "News", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        setCommonGroupData(map, "Appboy", "News Feed Link");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postNewsFeedScreenLoad()
    {
        LogUtil.d(TAG, "METHOD: postNewsFeedScreenLoad()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.NEWSFEED, "/home/newsfeed");
        setCommonGroupData(map, "Appboy", "News Feed Loaded");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postNoNetworkConnection()
    {
        LogUtil.d(TAG, "METHOD: postNoNetworkConnection()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SPLASH_SCREEN, "No Network Connection", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.ERROR, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnCouponSelection()
    {
        LogUtil.d(TAG, "METHOD: postOnCouponSelection()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.COUPONS, "Coupon Selected", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Coupons");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventAcceptedNotification()
    {
        LogUtil.d(TAG, "METHOD: postOnEventAcceptedNotification()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_NOTIFICATION, "Accept", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Accept");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventBeaconFound()
    {
        LogUtil.d(TAG, "METHOD: postOnEventBeaconFound()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Beacon Found", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Beacon");
        map.put("sub_group", "Found");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventBeaconGeofenceEnter()
    {
        LogUtil.d(TAG, "METHOD: postOnEventBeaconGeofenceEnter()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Beacon Geofence Enter", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Beacon");
        map.put("sub_group", "Geofence Enter");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventBeaconGeofenceExit()
    {
        LogUtil.d(TAG, "METHOD: postOnEventBeaconGeofenceExit()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Beacon Geofence Exit", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Beacon");
        map.put("sub_group", "Geofence Exit");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventBeaconServiceStart()
    {
        LogUtil.d(TAG, "METHOD: postOnEventBeaconServiceStart()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Beacon Process Start Time", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Beacon Process");
        map.put("sub_group", "Start");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventBeaconServiceStop()
    {
        LogUtil.d(TAG, "METHOD: postOnEventBeaconServiceStop()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Beacon Process Stop Time", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Beacon Process");
        map.put("sub_group", "Stop");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinFailure()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_CHECKIN, "Notification CheckIn Order Select Failure", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn Failure");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinOrderListLoad()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Notification CheckIn Order List Load", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Order List Load");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinOrderListLoadError()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON, "Notification CheckIn Order List Load Error", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.ERROR, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Order List Load Error");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinOrderListSelect()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_CHECKIN, "Notification CheckIn Order Select", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Order Select");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinOrderListSelectCancel()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_CHECKIN, "Notification CheckIn Order Select Cancel", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Order Select Cancel");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventCheckinOrderListSelectConfirm()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_CHECKIN, "Notification CheckIn Order Select Confirm", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-Order Select Confirm");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventLockedScreen()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_NOTIFICATION, "Notification CheckIn LockedScreen", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-LockedScreen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventRejectedNotificationLocked()
    {
        LogUtil.d(TAG, "METHOD: postOnEventRejectedNotificationLocked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_NOTIFICATION, "RejectX", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-RejectX");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventRejectedNotificationUnlocked()
    {
        LogUtil.d(TAG, "METHOD: postOnEventRejectedNotificationUnlocked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_NOTIFICATION, "RejectCancel", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-RejectCancel");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnEventUnlockedScreen()
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.BEACON_NOTIFICATION, "Notification CheckIn UnlockedScreen", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Notifications");
        map.put("sub_group", "CheckIn-UnlockedScreen");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOnSuccessfulOrder(MobileSession mobilesession, LabsOrder labsorder, Boolean boolean1)
    {
        LogUtil.d(TAG, "METHOD: postOnSuccessfulOrder()", new Object[0]);
        mobilesession = generateCustomDataMap(mobilesession, labsorder, boolean1.booleanValue());
        mobilesession.put("page_name", com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PLACE_ORDER.getName());
        mobilesession.put("event_name", "Place Order");
        mobilesession.put("event_action", "Tap");
        mobilesession.put("event_label", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE.getName());
        mobilesession.put("event_category", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON.getName());
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, mobilesession);
    }

    public void postOptOutClick()
    {
        LogUtil.d(TAG, "METHOD: postOptOutClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.FAQS, "Opt Out of Piece of the Pie", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postOrderConfirmation()
    {
        LogUtil.d(TAG, "METHOD: postOrderConfirmation()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.ORDER_CONFIRMATION, "/order_confirmation");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postOrderDetailsCarryoutConfirmation()
    {
        LogUtil.d(TAG, "METHOD: postOrderDetailsCarryoutConfirmation()", new Object[0]);
        Map map = newAnalyticsViewMap("Carryout Confirmation", "/order_details/carryout_confirmation");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postOrderDetailsDeliveryConfirmation()
    {
        LogUtil.d(TAG, "METHOD: postOrderDetailsDeliveryConfirmation()", new Object[0]);
        Map map = newAnalyticsViewMap("Delivery Confirmation", "/order_details/delivery_confirmation");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postOrderNotFound()
    {
        LogUtil.d(TAG, "METHOD: postOrderNotFound()", new Object[0]);
        Map map = newAnalyticsViewMap("Order Not Found", "/pizza_tracker/not_found");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPastaDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postPastaDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PASTA_DETAILS, "/menu/pastas/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPastaFlavors(String s)
    {
        LogUtil.d(TAG, "METHOD: postPastaFlavors()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PASTA_FLAVORS, "/menu/pastas/flavors");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPastaProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postPastaProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PASTAS, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postPastaScreenView()
    {
        LogUtil.d(TAG, "METHOD: postPastaScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PASTAS, "/menu/pastas");
        map.put("group", "Menu");
        map.put("sub_group", "Penne Pastas");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPebbleDownloadPrompt()
    {
        LogUtil.d(TAG, "METHOD: postPebbleDownloadPrompt()", new Object[0]);
        Map map = newAnalyticsViewMap("PebbleApp Download Prompt", "/pebble_app/download_prompt");
        map.put("sub_group", "Download Prompt");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPebbleSendEasyOrder()
    {
        LogUtil.d(TAG, "METHOD: postPebbleSendEasyOrder()", new Object[0]);
        Map map = newAnalyticsViewMap("Pebble Landing Action \u2013 EasyOrder", "/pebble_landing_action/easy_order");
        map.put("group", "PebbleLanding Action");
        map.put("sub_group", "EasyOrder");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPebbleSendRecentOrder()
    {
        LogUtil.d(TAG, "METHOD: postPebbleSendRecentOrder()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PEBBLE, "Recent Orders", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "PebbleLanding Action");
        map.put("sub_group", "Recent Orders");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPebbleTrackerInfo()
    {
        LogUtil.d(TAG, "METHOD: postPebbleTrackerInfo()", new Object[0]);
        Map map = newAnalyticsViewMap("Pebble Landing Action \u2013 Tracker", "/pebble_landing_action/tracker");
        map.put("group", "PebbleLanding Action");
        map.put("sub_group", "Tracker");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPizzaCrust(String s)
    {
        LogUtil.d(TAG, "METHOD: postPizzaCrust()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_CRUST, "/menu/pizza/crust");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPizzaDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postPizzaDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_DETAILS, "/menu/pizza/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPizzaProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postPizzaProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postPizzaProfileActivateRewardsClick()
    {
        LogUtil.d(TAG, "METHOD: postPizzaProfileActivateRewardsClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE, "Rewards Activate", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPizzaProfileLearnMoreRewardsClick()
    {
        LogUtil.d(TAG, "METHOD: postPizzaProfileLearnMoreRewardsClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE, "Rewards Learn More", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPizzaProfilePieImageViewRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postPizzaProfilePieImageViewRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE, "Widget Image Tap", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPizzaProfileRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postPizzaProfileRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_PROFILE, "Widget - Redeem", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPizzaScreenView()
    {
        LogUtil.d(TAG, "METHOD: postPizzaScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA, "/menu/pizza");
        map.put("group", "Menu");
        map.put("sub_group", "Specialty Pizzas");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPizzaSize(String s)
    {
        LogUtil.d(TAG, "METHOD: postPizzaSize()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_SIZES, "/menu/pizza/sizes");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPizzaTrackerResume()
    {
        LogUtil.d(TAG, "METHOD: postPizzaTrackerResume()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA_TRACKER_SEARCH, "/home/pizza_tracker_search");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPizzaTrackerSubmitted()
    {
        LogUtil.d(TAG, "METHOD: postPizzaTrackerSubmitted()", new Object[0]);
        Map map = newAnalyticsEventMap("Pizza Tracker", "Order Selected", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPlaceOrderCarryout()
    {
        Map map = newAnalyticsViewMap("Place Order - Carryout", "order/carryout");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPlaceOrderDelivery()
    {
        Map map = newAnalyticsViewMap("Place Order - Delivery", "order/delivery");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postProductAdded(LabsProductLine labsproductline)
    {
        Map map = newAnalyticsViewMap("product_added", "");
        map.put("product_code", labsproductline.getProduct().getCode());
        map.put("units", String.valueOf(labsproductline.getQuantity()));
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postProductDetails(String s, String s1)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postProductDetails()   |    categoryCode: ")).append(s).toString(), new Object[0]);
        if (s.equalsIgnoreCase("Pizza"))
        {
            postPizzaDetails(s1);
        } else
        {
            if (s.equalsIgnoreCase("Pasta"))
            {
                postPastaDetails(s1);
                return;
            }
            if (s.equalsIgnoreCase("Drinks"))
            {
                postDrinksDetails(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sides"))
            {
                postSideDetails(s1);
                return;
            }
            if (s.equalsIgnoreCase("Dessert"))
            {
                postDessertDetails(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sandwich"))
            {
                postSandwichDetails(s1);
                return;
            }
        }
    }

    public void postProductSelected(String s, String s1)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postProductSelected()     |    category: ")).append(s).append("    |    productName: ").append(s1).toString(), new Object[0]);
        if (s.equalsIgnoreCase("Pizza"))
        {
            postPizzaProductSelected(s1);
        } else
        {
            if (s.equalsIgnoreCase("Pasta"))
            {
                postPastaProductSelected(s1);
                return;
            }
            if (s.equalsIgnoreCase("Drinks"))
            {
                postDrinkProductSelected(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sides"))
            {
                postSideProductSelected(s1);
                return;
            }
            if (s.equalsIgnoreCase("Dessert"))
            {
                postDessertProductSelected(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sandwich"))
            {
                postSandwichProductSelected(s1);
                return;
            }
        }
    }

    public void postProfiledCarryoutClicked()
    {
        LogUtil.d(TAG, "METHOD: postProfiledCarryoutClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_NEW_ORDER, "Carryout", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Order Settings");
        map.put("order_type", "Carryout");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postProfiledDeliveryClicked()
    {
        LogUtil.d(TAG, "METHOD: postProfiledDeliveryClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_NEW_ORDER, "Delivery", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Order Settings");
        map.put("order_type", "Delivery");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPromoCodeSubmitClick(String s)
    {
        LogUtil.d(TAG, "METHOD: postPromoCodeSubmitClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.COUPONS, (new StringBuilder("Submit; Coupon Code: ")).append(s).toString(), com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        setCommonGroupData(map, (new StringBuilder("Coupon Code Submit & ")).append(s).toString(), "Coupons");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postPushNotificationCampaignReceived(String s)
    {
        LogUtil.d(TAG, "METHOD: postPushNotificationCampaignReceived()", new Object[0]);
        Map map = newAnalyticsViewMap("from_push", "");
        map.put("campaign_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postPushNotificationOpened(String s, String s1)
    {
        LogUtil.d(TAG, "METHOD: postPushNotificationOpened()", new Object[0]);
        Map map = newAnalyticsViewMap((new StringBuilder("AppBoy Push Notification Open & ")).append(s).append(" & ").append(s1).toString(), "/appboy/push_notification_open");
        setCommonGroupData(map, "Appboy", (new StringBuilder("Push Notification Open - & ")).append(s).append(" & ").append(s1).toString());
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRateAppDialogShowed()
    {
        LogUtil.d(TAG, "METHOD: postRateAppDialogShowed()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.RATE_APP, "/rate_app");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postRecentOrdersClicked()
    {
        LogUtil.d(TAG, "METHOD: postRecentOrdersClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Your Recent Orders", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRegistrationView()
    {
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_PROFILE, "/pizza_profile/account_registration_form");
        map.put("group", "Account Login");
        map.put("sub_group", "Registration Form");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postReorder()
    {
        LogUtil.d(TAG, "METHOD: postReorder()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Reorder", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsCreateProfileCheckBoxClick()
    {
        LogUtil.d(TAG, "METHOD: postRewardsCreateProfileCheckBoxClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_PROFILE, "Rewards Enroll Checkbox", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.CHECKBOX, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsCreateProfileInfoClick()
    {
        LogUtil.d(TAG, "METHOD: postRewardsCreateProfileInfoClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CREATE_PROFILE, "Rewards Enroll ?", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsDetailsPieImageViewRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postRewardsDetailsPieImageViewRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIECE_OF_THE_PIE_DETAILS, "Widget Image Tap", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsDetailsRedeemClick()
    {
        LogUtil.d(TAG, "METHOD: postRewardsDetailsRedeemClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIECE_OF_THE_PIE_DETAILS, "Widget - Redeem", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsLearnMoreTap()
    {
        LogUtil.d(TAG, "METHOD: postRewardsLearnMoreTap()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Rewards Learn More", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsOptOutCancel()
    {
        LogUtil.d(TAG, "METHOD: postRewardsOptOutCancel()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.FAQS, "No, keep points", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsOptOutConfirm()
    {
        LogUtil.d(TAG, "METHOD: postRewardsOptOutConfirm()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.FAQS, "Yes, opt out", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsSignInTap()
    {
        LogUtil.d(TAG, "METHOD: postRewardsSignInTap()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Rewards Learn More", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsTermsAndConditionClickAnonymous()
    {
        LogUtil.d(TAG, "METHOD: postRewardsTermsAndConditionClickAnonymous()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_ANONYMOUS, "Rewards Terms and Conditions", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LINK, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postRewardsTermsAndConditionClickLoggedIn()
    {
        LogUtil.d(TAG, "METHOD: postRewardsTermsAndConditionClickLoggedIn()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.REWARDS_LEARN_MORE_LOGGED_IN, "Rewards Terms and Conditions", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LINK, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postSamsungTvListItemClicked()
    {
        Map map = newAnalyticsViewMap("Samsung TV - Multiview Device Selected", "/multiview/device_selected");
        map.put("sub_group", "DeviceSelected");
        map.put("group", "Multiview");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postSamsungTvMultiviewPrompt()
    {
        Map map = newAnalyticsViewMap("Samsung TV - Multiview Prompt", "/multiview/prompt");
        map.put("sub_group", "Prompt");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSamsungTvUpdateDeviceList()
    {
        Map map = newAnalyticsViewMap("Multiview Device List", "/multiview/device_list");
        map.put("sub_group", "DeviceList");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSandwichDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postSandwichDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SANDWICH_DETAILS, "/menu/sandwiches/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSandwichProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postSandwichProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SANDWICHES, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postSandwichScreenView()
    {
        LogUtil.d(TAG, "METHOD: postSandwichScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SANDWICHES, "/menu/sandwiches");
        map.put("group", "Menu");
        map.put("sub_group", "Sandwiches");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postScreenViews(LabsCategory labscategory)
    {
        labscategory = labscategory.getCode();
        LogUtil.d(TAG, (new StringBuilder("METHOD: postScreenViews()    |     category: ")).append(labscategory).toString(), new Object[0]);
        if (labscategory.equalsIgnoreCase("Pizza"))
        {
            postPizzaScreenView();
        } else
        {
            if (labscategory.equalsIgnoreCase("Pasta"))
            {
                postPastaScreenView();
                return;
            }
            if (labscategory.equalsIgnoreCase("Drinks"))
            {
                postDrinksScreenView();
                return;
            }
            if (labscategory.equalsIgnoreCase("Sides"))
            {
                postSidesScreenView();
                return;
            }
            if (labscategory.equalsIgnoreCase("Dessert"))
            {
                postDessertScreenView();
                return;
            }
            if (labscategory.equalsIgnoreCase("Sandwich"))
            {
                postSandwichScreenView();
                return;
            }
        }
    }

    public void postSideDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postSideDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SIDE_DETAILS, "/menu/sides/details");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSideFlavors(String s)
    {
        LogUtil.d(TAG, "METHOD: postSideFlavors()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SIDE_FLAVORS, "/menu/sides/flavors");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSideProductSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postSideProductSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SIDES, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postSidesScreenView()
    {
        LogUtil.d(TAG, "METHOD: postSidesScreenView()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.PIZZA, "/menu/sides");
        map.put("group", "Menu");
        map.put("sub_group", "Sides");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSidesSize(String s)
    {
        LogUtil.d(TAG, "METHOD: postSidesSize()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.SIDE_SIZES, "/menu/sides/sizes");
        map.put("product_related_event", "v");
        map.put("product_name", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postSignInButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postSignInButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Sign In", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postSizesPageLoad(String s, String s1)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postSizesPageLoad()   |    categoryCode: ")).append(s).append(" - product: ").append(s1).toString(), new Object[0]);
        if (s.equalsIgnoreCase("Pizza"))
        {
            postPizzaSize(s1);
        } else
        {
            if (s.equalsIgnoreCase("Drinks"))
            {
                postDrinkSize(s1);
                return;
            }
            if (s.equalsIgnoreCase("Dessert"))
            {
                postDessertSize(s1);
                return;
            }
            if (s.equalsIgnoreCase("Sides") || s.equalsIgnoreCase("Wings") || s.equalsIgnoreCase("Bread"))
            {
                postSidesSize(s1);
                return;
            }
        }
    }

    public void postStoreDetails(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreDetails()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_DETAILS, "/store_details");
        if (StringHelper.isNotEmpty(s))
        {
            map.put("my_store_id", s);
        }
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postStoreListInfoClicked(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreListInfoClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_LIST, "Store Profile", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        if (StringHelper.isNotEmpty(s))
        {
            map.put("my_store_id", s);
        }
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postStoreListSearchClick()
    {
        LogUtil.d(TAG, "METHOD: postStoreListSearchClick()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_LIST, "Search", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Store Locator");
        map.put("sub_group", "Search");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postStoreListSearchResults(LocatorResult locatorresult, ar ar1)
    {
        LogUtil.d(TAG, "METHOD: postStoreListSearchResults()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_LIST, "Search Results", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LOAD, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Store Locator");
        map.put("sub_group", "Results");
        map.put("on_site_search", locatorresult.getLabsAddress().getPostalCode());
        map.put("number_of_results", Integer.toString(ar1.size()));
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postStoreListSetUp()
    {
        LogUtil.d(TAG, "METHOD: postStoreListSetUp()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_LIST, "/store_list");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postStoreProfile(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreProfile()", new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_PROFILE, "/store_profile");
        if (StringHelper.isNotEmpty(s))
        {
            map.put("my_store_id", s);
        }
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postStoreProfileCallStore(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreProfileCallStore()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_DETAILS, "Call Store", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Store Locator");
        map.put("sub_group", "Store Details");
        map.put("my_store_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postStoreProfileGotIt(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreProfileGotIt()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_DETAILS, "Got It. Thanks", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("group", "Store Locator");
        map.put("sub_group", "Store Details");
        map.put("my_store_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postStoreProfileInfo(String s)
    {
        LogUtil.d(TAG, "METHOD: postStoreProfileInfo()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.STORE_PROFILE, "See Store Information", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.LINK, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        if (StringHelper.isNotEmpty(s))
        {
            map.put("my_store_id", s);
        }
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postTrackVoiceActive()
    {
        LogUtil.d(TAG, "METHOD: postTrackVoiceActive()", new Object[0]);
        Map map = newAnalyticsViewMap("Voice Prompt Activate", "/voice/prompt_activate");
        map.put("sub_group", "Prompt Activate");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postTrackerHomeClicked()
    {
        LogUtil.d(TAG, "METHOD: postTrackerHomeClicked()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.HOME_PAGE, "Tracker", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postUpsellBarItemSelected(String s)
    {
        LogUtil.d(TAG, "METHOD: postUpsellBarItemSelected()", new Object[0]);
        s = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.CART, s, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, s);
    }

    public void postUpsellClickNo(String s, String s1)
    {
        LogUtil.d(TAG, "METHOD: postUpsellClickNo()", new Object[0]);
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.UPSELL, "No, Go To Checkout", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("product_name", s1);
        map.put("sku_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postUpsellClickYes(String s, String s1)
    {
        Map map = newAnalyticsEventMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.UPSELL, "Yes, Add To Order", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("product_name", s1);
        map.put("sku_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postUpsellDisplayed(String s, String s1)
    {
        LogUtil.d(TAG, (new StringBuilder("METHOD: postUpsellDisplayed()    |    prodName: ")).append(s1).toString(), new Object[0]);
        Map map = newAnalyticsViewMap(com.dominos.android.sdk.core.analytics.AnalyticsConstants.PageName.UPSELL, "/checkout/upsell");
        map.put("product_name", s1);
        map.put("sku_id", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, map);
    }

    public void postUseThisCarryoutButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postUseThisCarryoutButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap("Order Settings", "Use This", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("order_type", "carryout");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postUseThisDeliveyButtonClicked()
    {
        LogUtil.d(TAG, "METHOD: postUseThisDeliveyButtonClicked()", new Object[0]);
        Map map = newAnalyticsEventMap("Order Settings", "Use This", com.dominos.android.sdk.core.analytics.AnalyticsConstants.Category.BUTTON, com.dominos.android.sdk.core.analytics.AnalyticsConstants.Label.NONE);
        map.put("order_type", "delivery");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postWearPublishEasyOrder()
    {
        Map map = newAnalyticsViewMap("Android-WearLanding Action \u2013 EasyOrder", "/android-wearlanding_action/easy_order");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "EasyOrder");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postWearPublishRecentOrder()
    {
        Map map = newAnalyticsViewMap("Android-WearLanding Action \u2013 RecentOrders", "/android-wearlanding_action/recent_orders");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "RecentOrders");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void postWearPublishTrackerClick()
    {
        Map map = newAnalyticsViewMap("Android-WearLanding Action \u2013 Tracker", "/android-wearlanding_action/tracker");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "Tracker");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

}
