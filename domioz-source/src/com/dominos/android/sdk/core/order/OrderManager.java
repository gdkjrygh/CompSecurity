// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.CouponUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.storelocator.StoreLocatorManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.extension.model.Partners;
import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.order:
//            PriceOrderErrorCode

public class OrderManager extends Manager
{

    public static final int MAX_HISTORY_LIST_SIZE = 5;
    private static final String TAG = com/dominos/android/sdk/core/order/OrderManager.getSimpleName();
    private CartManager mCartManager;
    private CouponWizardManager mCouponWizard;
    private LoyaltyManager mLoyaltyManager;
    private MenuManager mMenuManager;
    private LabsOrder mOrder;
    OrderUtil mOrderUtil;
    PowerRestClient mPowerApi;
    private ProductWizardManager mProductManager;
    private UserProfileManager mProfileManager;
    private ShoprunnerManager mSrManager;
    private StoreLocatorManager mStoreLocatorManager;
    private StoreManager mStoreManager;
    private OrderType orderType;

    public OrderManager()
    {
    }

    private PriceOrderErrorCode getPriceOrderErrorCode(LabsOrder labsorder, boolean flag)
    {
        labsorder = labsorder.getStatusItemList().iterator();
        break MISSING_BLOCK_LABEL_10;
        if (!flag) goto _L2; else goto _L1
_L1:
        return priceordererrorcode;
_L2:
        PriceOrderErrorCode priceordererrorcode;
label0:
        do
        {
            do
            {
                if (!labsorder.hasNext())
                {
                    break label0;
                }
                priceordererrorcode = getPriceOrderErrorCode(((LabsCouponLine) (null)), (Map)labsorder.next());
            } while (priceordererrorcode == null);
            switch (_cls8..SwitchMap.com.dominos.android.sdk.core.order.PriceOrderErrorCode[priceordererrorcode.ordinal()])
            {
            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        } while (true);
        return null;
    }

    private PriceOrderErrorCode getPriceOrderErrorCode(LabsCouponLine labscouponline, Map map)
    {
        map = (String)map.get("Code");
        if (map == null)
        {
            return null;
        }
        LogUtil.d(TAG, (new StringBuilder("Coupon failure status code :")).append(map).toString(), new Object[0]);
        if (map.equalsIgnoreCase("CouponExclusivityViolation"))
        {
            return PriceOrderErrorCode.CouponExclusivityViolation;
        }
        if (map.equalsIgnoreCase("CouponIsInvalidForDayPart"))
        {
            return PriceOrderErrorCode.CouponIsInvalidForDayPart;
        }
        if (map.equalsIgnoreCase("CouponIsInvalidForDayOfWeek"))
        {
            return PriceOrderErrorCode.CouponIsInvalidForDayOfWeek;
        }
        if (map.equalsIgnoreCase("UsageCountViolation"))
        {
            return PriceOrderErrorCode.UsageCountViolation;
        }
        if (map.equalsIgnoreCase("InvalidServiceMethodForCoupon"))
        {
            return PriceOrderErrorCode.InvalidServiceMethodForCoupon;
        }
        if (map.equalsIgnoreCase("BelowMinimumOrderAmount"))
        {
            return PriceOrderErrorCode.BelowMinimumOrderAmount;
        }
        if (map.equalsIgnoreCase("CouponIsNotEffectiveOrExpired"))
        {
            return PriceOrderErrorCode.CouponIsNotEffectiveOrExpired;
        }
        if (map.equalsIgnoreCase("UnableToProcessLoyalty"))
        {
            return PriceOrderErrorCode.UnableToProcessLoyalty;
        }
        if (map.equalsIgnoreCase("Unfulfilled"))
        {
            return PriceOrderErrorCode.Unfulfilled;
        }
        if (labscouponline != null && mLoyaltyManager.isCouponALoyaltyCoupon(labscouponline.getCoupon()))
        {
            if (!mStoreManager.isStoreALoyaltyStore())
            {
                labscouponline = PriceOrderErrorCode.NonLoyaltyStore;
                removeAllLoyaltyCouponsLines();
                return labscouponline;
            } else
            {
                return PriceOrderErrorCode.InvalidCoupon;
            }
        } else
        {
            return PriceOrderErrorCode.InvalidCoupon;
        }
    }

    private boolean isInvalidCoupon(LabsCouponLine labscouponline, String s)
    {
        CouponTags coupontags;
        byte byte0;
        byte0 = 1;
        if (labscouponline.getCoupon() == null)
        {
            LogUtil.d(TAG, "Coupon doesn't exist in coupon line ", new Object[0]);
            return true;
        }
        coupontags = labscouponline.getCoupon().getTags();
        if (coupontags == null || !StringHelper.isNotEmpty(coupontags.getServiceMethod())) goto _L2; else goto _L1
_L1:
        s.hashCode();
        JVM INSTR lookupswitch 2: default 76
    //                   70439027: 121
    //                   888111124: 106;
           goto _L3 _L4 _L5
_L3:
        byte0 = -1;
_L8:
        byte0;
        JVM INSTR tableswitch 0 1: default 104
    //                   0 134
    //                   1 151;
           goto _L2 _L6 _L7
_L2:
        return false;
_L5:
        if (!s.equals("Delivery"))
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = 0;
          goto _L8
_L4:
        if (!s.equals("Carryout")) goto _L3; else goto _L8
_L6:
        return StringHelper.equals(labscouponline.getCoupon().getTags().getServiceMethod(), "Carryout");
_L7:
        return StringHelper.equals(labscouponline.getCoupon().getTags().getServiceMethod(), "Delivery");
    }

    private boolean isOrderWithLoyaltyCoupons()
    {
        for (Iterator iterator = mOrder.getCouponLineList().iterator(); iterator.hasNext();)
        {
            LabsCouponLine labscouponline = (LabsCouponLine)iterator.next();
            if (mLoyaltyManager.isCouponALoyaltyCoupon(labscouponline.getCoupon()))
            {
                return true;
            }
        }

        return false;
    }

    private void loadHistoricalOrderStore(final LabsOrder historicalOrder, final CreateReOrderCallback callback)
    {
        mStoreManager.loadStore(historicalOrder.getStoreId(), new _cls6());
    }

    private void removeAllLoyaltyCouponsLines()
    {
        Iterator iterator = mOrder.getCouponLineList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (mLoyaltyManager.isCouponALoyaltyCoupon(((LabsCouponLine)iterator.next()).getCoupon()))
            {
                iterator.remove();
            }
        } while (true);
    }

    private void validateCoupons(LabsOrder labsorder)
    {
        Object obj = labsorder.getCouponLineList();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                LabsCouponLine labscouponline = (LabsCouponLine)((Iterator) (obj)).next();
                if (labscouponline.getCoupon() == null || !CouponUtil.isCouponHidden(labscouponline.getCoupon()))
                {
                    mMenuManager.loadCouponFromMenu(labscouponline);
                    if (isInvalidCoupon(labscouponline, labsorder.getServiceMethod()))
                    {
                        ((Iterator) (obj)).remove();
                        labsorder.setCouponRemoved(true);
                    }
                }
            } while (true);
        }
    }

    private void validateProducts(LabsOrder labsorder)
    {
        Object obj = labsorder.getProductLineList();
        ArrayList arraylist = new ArrayList();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                LabsProductLine labsproductline = (LabsProductLine)((Iterator) (obj)).next();
                String s = labsproductline.getVariant().getCode();
                if (mMenuManager.getVariant(s) == null)
                {
                    ((Iterator) (obj)).remove();
                    labsorder.setProductRemoved(true);
                    arraylist.add(labsproductline.getName());
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                labsorder.setRemovedProductLineList(arraylist);
            }
        }
    }

    public void buildOrderFromManagers(LabsOrder labsorder)
    {
        PricePlaceLoyalty priceplaceloyalty = null;
        if (mSrManager.isShopRunnerSession()) goto _L2; else goto _L1
_L1:
        labsorder.setPartner(null);
_L4:
        if (mLoyaltyManager.isLoyaltyAvailable())
        {
            priceplaceloyalty = new PricePlaceLoyalty();
            priceplaceloyalty.setLoyaltyCustomer(mLoyaltyManager.isCustomerEnrolledInLoyalty());
        }
        labsorder.setPricePlaceLoyalty(priceplaceloyalty);
        if (mProfileManager.getCurrentUser() != null)
        {
            labsorder.setCustomerId(mProfileManager.getCurrentUser().getCustomerId());
        }
        return;
_L2:
        if (labsorder.getPartners() == null)
        {
            labsorder.setPartner(new Partners(new Shoprunner(new ShopRunnerTag(mSrManager.getSrToken()))));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void checkStoreAndPriceOrder(final LabsOrder order, final CheckStoreAndPriceOrderCallback callback)
    {
        order.clearPrices();
        callback.onBegin();
        mStoreManager.loadStore(order.getStoreId(), new _cls7());
    }

    public void clearHistoricalPaymentIfExpired(LabsOrder labsorder)
    {
label0:
        {
            Object obj = labsorder.getPaymentList();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            LabsPayment labspayment;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                labspayment = (LabsPayment)((Iterator) (obj)).next();
            } while (!StringHelper.equals(labspayment.getPaymentType(), "CreditCardToken") || !mProfileManager.isCardExpired(labspayment.getCardId()));
            labsorder.clearPayments();
        }
    }

    public void createOrderForCarryout(final String storeId, final CreateCarryoutOrderCallback callback)
    {
        final LabsOrder newOrder = new LabsOrder(getOrder());
        newOrder.setServiceMethod("Carryout");
        newOrder.setAddress(null);
        newOrder.clearPrices();
        LogUtil.d(TAG, "Create order for carryout.", new Object[0]);
        mStoreManager.loadStore(storeId, new _cls1());
    }

    public void createOrderForDelivery(LabsAddress labsaddress, final CreateDeliveryOrderCallback callback)
    {
        final LabsOrder newOrder = new LabsOrder(getOrder());
        newOrder.setServiceMethod("Delivery");
        newOrder.clearPrices();
        LogUtil.d(TAG, "Create order for delivery.", new Object[0]);
        mStoreLocatorManager.locateClosestStore(labsaddress, new _cls2());
    }

    public void createOrderFromHistoricalOrder(final LabsOrder historicalOrder, final CreateReOrderCallback callback)
    {
        callback.onBegin();
        historicalOrder.clearPrices();
        if (historicalOrder.isDelivery())
        {
            LogUtil.d(TAG, "Historical order service method is delivery!", new Object[0]);
            mStoreLocatorManager.locateClosestStore(historicalOrder.getAddress(), new _cls5());
            return;
        } else
        {
            LogUtil.d(TAG, "Historical order service method is carryout!", new Object[0]);
            loadHistoricalOrderStore(historicalOrder, callback);
            return;
        }
    }

    public String getName()
    {
        return "order_manager";
    }

    public int getNewCouponLineId(List list, LabsOrder labsorder)
    {
        for (labsorder = labsorder.getCouponLineList().iterator(); labsorder.hasNext();)
        {
            LabsCouponLine labscouponline = (LabsCouponLine)labsorder.next();
            if (!list.contains(Integer.valueOf(labscouponline.getId())))
            {
                return labscouponline.getId();
            }
        }

        return 0;
    }

    public LabsOrder getOrder()
    {
        if (mOrder == null)
        {
            mOrder = new LabsOrder();
        }
        return mOrder;
    }

    public OrderType getOrderType()
    {
        return orderType;
    }

    public void handlePriceOrderError(LabsOrder labsorder, PriceOrderErrorCallback priceordererrorcallback)
    {
label0:
        {
            if (labsorder.getProductLineList() != null && !labsorder.getProductLineList().isEmpty())
            {
                Iterator iterator = labsorder.getProductLineList().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    LabsProductLine labsproductline = (LabsProductLine)iterator.next();
                    if (labsproductline.getStatus() < 0)
                    {
                        LogUtil.d(TAG, "Product line status code failure.", new Object[0]);
                        Iterator iterator1 = labsproductline.getStatusItemList().iterator();
                        while (iterator1.hasNext()) 
                        {
                            String s = (String)((Map)iterator1.next()).get("Code");
                            if (StringHelper.isEmpty(s))
                            {
                                LogUtil.d(TAG, "Product status code empty!", new Object[0]);
                            } else
                            {
                                LogUtil.d(TAG, (new StringBuilder("Product failure status code = ")).append(s).toString(), new Object[0]);
                                if (StringHelper.equalsIgnoreCase(s, "TooManyToppings"))
                                {
                                    LogUtil.d(TAG, "Too many toppings", new Object[0]);
                                    priceordererrorcallback.onProductFailure(labsorder, PriceOrderErrorCode.TooManyToppings, labsproductline);
                                    return;
                                }
                                if (StringHelper.equalsIgnoreCase(s, "TooManyItems"))
                                {
                                    LogUtil.d(TAG, "Too many items", new Object[0]);
                                    priceordererrorcallback.onProductFailure(labsorder, PriceOrderErrorCode.TooManyItems, labsproductline);
                                    return;
                                } else
                                {
                                    LogUtil.d(TAG, "Unknown product code", new Object[0]);
                                    priceordererrorcallback.onProductFailure(labsorder, PriceOrderErrorCode.UnknownProductError, labsproductline);
                                    return;
                                }
                            }
                        }
                    }
                } while (true);
            }
            Object obj = labsorder.getCouponLineList();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            LabsCouponLine labscouponline;
            PriceOrderErrorCode priceordererrorcode;
label1:
            do
            {
                if (((Iterator) (obj)).hasNext())
                {
                    labscouponline = (LabsCouponLine)((Iterator) (obj)).next();
                    if (labscouponline.getStatusItemList() == null)
                    {
                        continue;
                    }
                    Iterator iterator2 = labscouponline.getStatusItemList().iterator();
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            continue label1;
                        }
                        priceordererrorcode = getPriceOrderErrorCode(labscouponline, (Map)iterator2.next());
                    } while (priceordererrorcode == null);
                    break;
                }
                break label0;
            } while (true);
            priceordererrorcallback.onCouponFailure(labsorder, priceordererrorcode, labscouponline);
            return;
        }
        priceordererrorcallback.onUnknownPriceError(labsorder);
    }

    public boolean isEasyOrder()
    {
        return orderType != null && orderType.equals(OrderType.EASY_ORDER);
    }

    protected void onSessionSet()
    {
        mSrManager = (ShoprunnerManager)getSession().getManager("shoprunner_manager");
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
        mProfileManager = (UserProfileManager)getSession().getManager("user_manager");
        mStoreLocatorManager = (StoreLocatorManager)getSession().getManager("store_locator");
        mStoreManager = (StoreManager)getSession().getManager("store_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        mProductManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        mCouponWizard = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
        mLoyaltyManager = (LoyaltyManager)getSession().getManager("loyalty_manager");
    }

    public void placeOrder(LabsOrder labsorder, String s, final PlaceOrderCallback callback)
    {
        if (StringHelper.isNotEmpty(s))
        {
            labsorder.setVoiceOrder(true);
            labsorder.setVoiceSessionID(s);
        }
        mOrderUtil.addChannelToOrder(labsorder);
        buildOrderFromManagers(labsorder);
        mPowerApi.placeOrder(labsorder, new _cls4());
    }

    public void priceOrder(final LabsOrder newOrder, final PriceOrderCallback callback)
    {
        LabsOrder labsorder = new LabsOrder(newOrder);
        buildOrderFromManagers(labsorder);
        final boolean wasThereALoyaltyCoupon = isOrderWithLoyaltyCoupons();
        labsorder.clearPayments();
        labsorder.setOriginalOrderId("");
        labsorder.setId("");
        labsorder.clearPrices();
        mPowerApi.priceOrder(labsorder, new _cls3());
    }

    public void setOrder(LabsOrder labsorder)
    {
        mOrder = labsorder;
    }

    public void setOrderType(OrderType ordertype)
    {
        orderType = ordertype;
    }

    public void updateManagersFromPlace(LabsOrder labsorder)
    {
        labsorder = labsorder.getPricePlaceLoyalty();
        mLoyaltyManager.setPricePlaceOrderLoyalty(labsorder);
    }











    private class _cls8
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode = new int[PriceOrderErrorCode.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UnableToProcessLoyalty.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class _cls6 extends com.dominos.android.sdk.core.store.StoreManager.LoadStoreCallback
    {

        final OrderManager this$0;
        final CreateReOrderCallback val$callback;
        final LabsOrder val$historicalOrder;

        public void onStoreClosed(StoreProfile storeprofile)
        {
            callback.onStoreClosed();
            callback.onFinish();
        }

        public void onStoreLoadError(RequestErrorCode requesterrorcode)
        {
            callback.onFailure();
            callback.onFinish();
        }

        public void onStoreLoaded(StoreProfile storeprofile)
        {
            if (historicalOrder.isDelivery() && !storeprofile.isDeliveryAvailable())
            {
                callback.onStoreDeliveryUnavailable(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                callback.onFinish();
                return;
            }
            if (historicalOrder.isCarryout() && !storeprofile.isCarryoutAvailable())
            {
                callback.onStoreCarryoutUnavailable(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                callback.onFinish();
                return;
            }
            historicalOrder.setOriginalOrderId(historicalOrder.getId());
            if (!mProfileManager.isHistoricalOrderPaymentValid(historicalOrder))
            {
                historicalOrder.clearPayments();
            }
            validateCoupons(historicalOrder);
            Object obj = historicalOrder.getCouponLineList();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((LabsCouponLine)((Iterator) (obj)).next()).getCoupon().setDoneEditing(true)) { }
            }
            mMenuManager.updateOrderFromMenu(historicalOrder);
            mCartManager.updateCouponProductRelation(historicalOrder);
            setOrder(historicalOrder);
            mStoreManager.setStoreProfile(storeprofile);
            callback.onNewOrder(historicalOrder);
            callback.onFinish();
        }

        public void onStoreOffline(StoreProfile storeprofile)
        {
            callback.onStoreOffline(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
            callback.onFinish();
        }

        _cls6()
        {
            this$0 = OrderManager.this;
            callback = createreordercallback;
            historicalOrder = labsorder;
            super();
        }
    }


    private class CheckStoreAndPriceOrderCallback extends PriceOrderCallback
    {
        private class PriceOrderCallback extends BaseCallback
        {

            public abstract void onPriceOrderRequestFailed();

            public abstract void onPriceSuccess(LabsOrder labsorder);

            public abstract void onPricingFailure(LabsOrder labsorder);

            public abstract void onPricingWarning(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode);

            public PriceOrderCallback()
            {
            }
        }


        public abstract void onStoreCarryoutUnavailable(String s);

        public abstract void onStoreClosed();

        public abstract void onStoreDeliveryUnavailable(String s);

        public abstract void onStoreOffline(String s);

        public CheckStoreAndPriceOrderCallback()
        {
        }
    }


    private class _cls7 extends com.dominos.android.sdk.core.store.StoreManager.LoadStoreCallback
    {

        final OrderManager this$0;
        final CheckStoreAndPriceOrderCallback val$callback;
        final LabsOrder val$order;

        public void onStoreClosed(StoreProfile storeprofile)
        {
            callback.onStoreClosed();
            callback.onFinish();
        }

        public void onStoreLoadError(RequestErrorCode requesterrorcode)
        {
            callback.onPriceOrderRequestFailed();
            callback.onFinish();
        }

        public void onStoreLoaded(StoreProfile storeprofile)
        {
            if (order.isDelivery() && !storeprofile.isDeliveryAvailable())
            {
                callback.onStoreDeliveryUnavailable(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                callback.onFinish();
                return;
            }
            if (order.isCarryout() && !storeprofile.isCarryoutAvailable())
            {
                callback.onStoreCarryoutUnavailable(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                callback.onFinish();
                return;
            } else
            {
                priceOrder(order, callback);
                return;
            }
        }

        public void onStoreOffline(StoreProfile storeprofile)
        {
            callback.onStoreOffline(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
            callback.onFinish();
        }

        _cls7()
        {
            this$0 = OrderManager.this;
            callback = checkstoreandpriceordercallback;
            order = labsorder;
            super();
        }
    }


    private class _cls1 extends com.dominos.android.sdk.core.store.StoreManager.LoadStoreCallback
    {

        final OrderManager this$0;
        final CreateCarryoutOrderCallback val$callback;
        final LabsOrder val$newOrder;
        final String val$storeId;

        public void onBegin()
        {
            callback.onBegin();
        }

        public void onStoreClosed(StoreProfile storeprofile)
        {
            LogUtil.d(OrderManager.TAG, "Store Closed : Create order Failed.", new Object[0]);
            callback.onStoreClosed();
            callback.onFinish();
        }

        public void onStoreLoadError(RequestErrorCode requesterrorcode)
        {
            callback.onCreateOrderError(requesterrorcode);
            callback.onFinish();
        }

        public void onStoreLoaded(StoreProfile storeprofile)
        {
            LogUtil.d(OrderManager.TAG, "Store loaded", new Object[0]);
            if (storeprofile.isCarryoutAvailable())
            {
                validateCoupons(newOrder);
                validateProducts(newOrder);
                newOrder.setStoreId(storeId);
                newOrder.setStoreAddress(LabsAddress.fromAddressDescription(storeprofile.getAddressDescription()));
                mMenuManager.updateOrderFromMenu(newOrder);
                mCartManager.updateCouponProductRelation(newOrder);
                setOrder(newOrder);
                mStoreManager.setStoreProfile(storeprofile);
                callback.onOrderCreated(newOrder);
                callback.onFinish();
                return;
            } else
            {
                callback.onStoreCarryoutUnavailable(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                callback.onFinish();
                return;
            }
        }

        public void onStoreOffline(StoreProfile storeprofile)
        {
            LogUtil.d(OrderManager.TAG, "Store Offline : Create order Failed.", new Object[0]);
            callback.onStoreOffline(NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
            callback.onFinish();
        }

        _cls1()
        {
            this$0 = OrderManager.this;
            callback = createcarryoutordercallback;
            newOrder = labsorder;
            storeId = s;
            super();
        }

        private class CreateCarryoutOrderCallback extends BaseCallback
        {

            public abstract void onCreateOrderError(RequestErrorCode requesterrorcode);

            public abstract void onOrderCreated(LabsOrder labsorder);

            public abstract void onStoreCarryoutUnavailable(String s);

            public abstract void onStoreClosed();

            public abstract void onStoreOffline(String s);

            public CreateCarryoutOrderCallback()
            {
            }
        }

    }


    private class _cls2 extends com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateClosestStoreCallback
    {

        final OrderManager this$0;
        final CreateDeliveryOrderCallback val$callback;
        final LabsOrder val$newOrder;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            callback.onAddressInvalid(locatestoreerror);
            callback.onFinish();
        }

        public void onBegin()
        {
            callback.onBegin();
        }

        public void onLocateStoreFailed()
        {
            callback.onCreateOrderError(RequestErrorCode.STORE_PROFILE_REQUEST_FAILURE);
            callback.onFinish();
        }

        public void onStoreFound(LocatorStore locatorstore, final LabsAddress updatedDeliveryAddress)
        {
            if (!locatorstore.isOpen())
            {
                LogUtil.d(OrderManager.TAG, "Store currently closed.", new Object[0]);
                callback.onStoreClosed(updatedDeliveryAddress);
                callback.onFinish();
                return;
            }
            if (!locatorstore.isOnline())
            {
                LogUtil.d(OrderManager.TAG, "Store currently offline.", new Object[0]);
                callback.onStoreOffline(updatedDeliveryAddress, NumberUtil.formatPhoneNumber(locatorstore.getPhone()));
                callback.onFinish();
                return;
            }
            if (!locatorstore.isDeliveryAvailable())
            {
                LogUtil.d(OrderManager.TAG, "Store currently not available for delivery", new Object[0]);
                callback.onStoreDeliveryUnavailable(updatedDeliveryAddress, NumberUtil.formatPhoneNumber(locatorstore.getPhone()));
                callback.onFinish();
                return;
            } else
            {
                newOrder.setAddress(updatedDeliveryAddress);
                newOrder.setStoreAddress(LabsAddress.fromAddressDescription(locatorstore.getAddressDescription()));
                class _cls1 extends com.dominos.android.sdk.core.store.StoreManager.LoadStoreCallback
                {

                    final _cls2 this$1;
                    final LabsAddress val$updatedDeliveryAddress;

                    public void onStoreClosed(StoreProfile storeprofile)
                    {
                        callback.onStoreClosed(updatedDeliveryAddress);
                        callback.onFinish();
                    }

                    public void onStoreLoadError(RequestErrorCode requesterrorcode)
                    {
                        callback.onCreateOrderError(requesterrorcode);
                        callback.onFinish();
                    }

                    public void onStoreLoaded(StoreProfile storeprofile)
                    {
                        LogUtil.d(OrderManager.TAG, "Store loaded", new Object[0]);
                        if (storeprofile.isDeliveryAvailable())
                        {
                            newOrder.setAddress(updatedDeliveryAddress);
                            newOrder.setStoreId(storeprofile.getStoreId());
                            validateCoupons(newOrder);
                            validateProducts(newOrder);
                            mMenuManager.updateOrderFromMenu(newOrder);
                            mCartManager.updateCouponProductRelation(newOrder);
                            setOrder(newOrder);
                            mStoreManager.setStoreProfile(storeprofile);
                            callback.onOrderCreated(newOrder);
                            callback.onFinish();
                            return;
                        } else
                        {
                            callback.onStoreDeliveryUnavailable(updatedDeliveryAddress, NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                            callback.onFinish();
                            return;
                        }
                    }

                    public void onStoreOffline(StoreProfile storeprofile)
                    {
                        callback.onStoreOffline(updatedDeliveryAddress, NumberUtil.formatPhoneNumber(storeprofile.getPhone()));
                        callback.onFinish();
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    updatedDeliveryAddress = labsaddress;
                    super();
                }
                }

                mStoreManager.loadStore(locatorstore.getStoreId(), new _cls1());
                return;
            }
        }

        public void onStoreNotFound()
        {
            callback.onNoStoreFoundForDelivery();
            callback.onFinish();
        }

        _cls2()
        {
            this$0 = OrderManager.this;
            callback = createdeliveryordercallback;
            newOrder = labsorder;
            super();
        }

        private class CreateDeliveryOrderCallback extends BaseCallback
        {

            public abstract void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror);

            public abstract void onCreateOrderError(RequestErrorCode requesterrorcode);

            public abstract void onNoStoreFoundForDelivery();

            public abstract void onOrderCreated(LabsOrder labsorder);

            public abstract void onStoreClosed(LabsAddress labsaddress);

            public abstract void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s);

            public abstract void onStoreOffline(LabsAddress labsaddress, String s);

            public CreateDeliveryOrderCallback()
            {
            }
        }

    }


    private class CreateReOrderCallback extends BaseCallback
    {

        public abstract void onFailure();

        public abstract void onNewOrder(LabsOrder labsorder);

        public abstract void onNoStoreFoundForDelivery();

        public abstract void onStoreCarryoutUnavailable(String s);

        public abstract void onStoreClosed();

        public abstract void onStoreDeliveryUnavailable(String s);

        public abstract void onStoreOffline(String s);

        public CreateReOrderCallback()
        {
        }
    }


    private class _cls5 extends com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateClosestStoreCallback
    {

        final OrderManager this$0;
        final CreateReOrderCallback val$callback;
        final LabsOrder val$historicalOrder;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            callback.onNoStoreFoundForDelivery();
            callback.onFinish();
        }

        public void onLocateStoreFailed()
        {
            callback.onFailure();
            callback.onFinish();
        }

        public void onStoreFound(LocatorStore locatorstore, LabsAddress labsaddress)
        {
            if (!locatorstore.isOpen())
            {
                LogUtil.d(OrderManager.TAG, "Store currently closed.", new Object[0]);
                callback.onStoreClosed();
                callback.onFinish();
                return;
            }
            if (!locatorstore.isOnline())
            {
                LogUtil.d(OrderManager.TAG, "Store currently offline.", new Object[0]);
                callback.onStoreOffline(NumberUtil.formatPhoneNumber(locatorstore.getPhone()));
                callback.onFinish();
                return;
            }
            if (!locatorstore.isDeliveryAvailable())
            {
                LogUtil.d(OrderManager.TAG, "Store currently not available for delivery", new Object[0]);
                callback.onStoreDeliveryUnavailable(NumberUtil.formatPhoneNumber(locatorstore.getPhone()));
                callback.onFinish();
                return;
            } else
            {
                historicalOrder.setStoreId(locatorstore.getStoreId());
                historicalOrder.setAddress(labsaddress);
                historicalOrder.setStoreAddress(LabsAddress.fromAddressDescription(locatorstore.getAddressDescription()));
                loadHistoricalOrderStore(historicalOrder, callback);
                return;
            }
        }

        public void onStoreNotFound()
        {
            callback.onNoStoreFoundForDelivery();
            callback.onFinish();
        }

        _cls5()
        {
            this$0 = OrderManager.this;
            callback = createreordercallback;
            historicalOrder = labsorder;
            super();
        }
    }


    private class PriceOrderErrorCallback
    {

        public abstract void onCouponFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsCouponLine labscouponline);

        public abstract void onProductFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsProductLine labsproductline);

        public abstract void onUnknownPriceError(LabsOrder labsorder);

        public PriceOrderErrorCallback()
        {
        }
    }


    private class OrderType extends Enum
    {

        private static final OrderType $VALUES[];
        public static final OrderType EASY_ORDER;
        public static final OrderType NEW_ORDER;
        public static final OrderType RECENT_ORDERS;

        public static OrderType valueOf(String s)
        {
            return (OrderType)Enum.valueOf(com/dominos/android/sdk/core/order/OrderManager$OrderType, s);
        }

        public static OrderType[] values()
        {
            return (OrderType[])$VALUES.clone();
        }

        static 
        {
            EASY_ORDER = new OrderType("EASY_ORDER", 0);
            RECENT_ORDERS = new OrderType("RECENT_ORDERS", 1);
            NEW_ORDER = new OrderType("NEW_ORDER", 2);
            $VALUES = (new OrderType[] {
                EASY_ORDER, RECENT_ORDERS, NEW_ORDER
            });
        }

        private OrderType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls4 extends PowerRestCallback
    {

        final OrderManager this$0;
        final PlaceOrderCallback val$callback;

        public void onBegin()
        {
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onPlaceOrderRequestFailed();
        }

        public void onFinish()
        {
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            LogUtil.d(OrderManager.TAG, (new StringBuilder("place order string = ")).append(s).toString(), new Object[0]);
            s = mOrderUtil.fromJson(s);
            int i = s.getStatus();
            if (i >= 0 || s.isDuplicateOrder())
            {
                UserObject userobject = mProfileManager.getCurrentUser();
                if (userobject != null && StringHelper.isNotEmpty(userobject.getCustomerId()))
                {
                    mProfileManager.loadAndWaitForOrderHistoryAndCards(userobject.getCustomerId());
                    LogUtil.d(OrderManager.TAG, "Refreshing historical order after order placed..", new Object[0]);
                }
                mMenuManager.updateOrderFromMenu(s);
                updateManagersFromPlace(s);
                if (i > 0)
                {
                    PlaceOrderErrorCode placeordererrorcode = mOrderUtil.getPlaceOrderErrorType(s);
                    callback.onPlaceOrderWarning(s, placeordererrorcode);
                    return;
                } else
                {
                    callback.onPlaceOrderSuccess(s);
                    return;
                }
            } else
            {
                PlaceOrderErrorCode placeordererrorcode1 = mOrderUtil.getPlaceOrderErrorType(s);
                callback.onPlaceOrderFailure(s, placeordererrorcode1);
                return;
            }
        }

        _cls4()
        {
            this$0 = OrderManager.this;
            callback = placeordercallback;
            super();
        }

        private class PlaceOrderCallback extends BaseCallback
        {

            public abstract void onPlaceOrderFailure(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode);

            public abstract void onPlaceOrderRequestFailed();

            public abstract void onPlaceOrderSuccess(LabsOrder labsorder);

            public abstract void onPlaceOrderWarning(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode);

            public PlaceOrderCallback()
            {
            }
        }

    }


    private class _cls3 extends PowerRestCallback
    {

        final OrderManager this$0;
        final PriceOrderCallback val$callback;
        final LabsOrder val$newOrder;
        final boolean val$wasThereALoyaltyCoupon;

        public void onBegin()
        {
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            LogUtil.d(OrderManager.TAG, "Price order request Failed!", new Object[0]);
            callback.onPriceOrderRequestFailed();
        }

        public void onFinish()
        {
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            LogUtil.d(OrderManager.TAG, "Price order request Success", new Object[0]);
            PriceOrder priceorder = mOrderUtil.parsePriceOrder(s);
            if (priceorder == null)
            {
                callback.onPriceOrderRequestFailed();
                return;
            }
            s = priceorder.getOrder();
            updateManagersFromPlace(s);
            mMenuManager.updateOrderFromMenu(s);
            if (s.isDelivery())
            {
                s.setAddress(newOrder.getAddress());
            }
            s.setStoreAddress(newOrder.getStoreAddress());
            if (newOrder.isRecentOrder())
            {
                s.passOrderHistoryOptions(newOrder);
            }
            s.setCouponRemoved(newOrder.isCouponRemoved());
            s.setProductRemoved(newOrder.isProductRemoved());
            s.setRemovedProductLineList(newOrder.getRemovedProductLineList());
            if (priceorder.getStatus() >= 0 && mOrderUtil.isPricedAmountValid(s))
            {
                LogUtil.d(OrderManager.TAG, "Price Order response valid", new Object[0]);
                mCartManager.updateProductCouponRelationshipAfterPricing(s);
                setOrder(s);
                if (priceorder.getStatus() == 1)
                {
                    PriceOrderErrorCode priceordererrorcode = getPriceOrderErrorCode(s, wasThereALoyaltyCoupon);
                    if (priceordererrorcode != null)
                    {
                        callback.onPricingWarning(s, priceordererrorcode);
                        return;
                    }
                }
                callback.onPriceSuccess(s);
                return;
            } else
            {
                s.clearPrices();
                callback.onPricingFailure(s);
                return;
            }
        }

        _cls3()
        {
            this$0 = OrderManager.this;
            callback = priceordercallback;
            newOrder = labsorder;
            wasThereALoyaltyCoupon = flag;
            super();
        }
    }

}
