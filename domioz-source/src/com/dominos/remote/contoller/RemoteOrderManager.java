// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import android.content.Context;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.ConnectionUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.tracker.TrackOrderInfo;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.loader.ApplicationLoader;
import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.util.ResponseEvent;
import com.google.b.k;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteOrderManager
{

    private static final String TAG = com/dominos/remote/contoller/RemoteOrderManager.getSimpleName();
    ApplicationLoader mApplicationLoader;
    private CartManager mCartManager;
    private ConfigurationManager mConfigurationManager;
    ConnectionUtil mConnectionUtil;
    private final Context mContext;
    private LoyaltyManager mLoyaltyManger;
    private MenuManager mMenuManager;
    private OrderManager mOrderManager;
    OrderUtil mOrderUtil;
    PowerRestClient mPowerRestClient;
    private Session mSession;
    UserAuthorization mUserAuth;
    private UserProfileManager mUserProfileManager;

    public RemoteOrderManager(Context context)
    {
        mContext = context;
    }

    private void getCustomerOrderHistory(final RemoteOrderClient listener)
    {
        mUserProfileManager.fetchOrderHistory(new _cls5());
    }

    private void sendCustomerInfo(RemoteOrderClient remoteorderclient)
    {
        Object obj = mUserProfileManager.getCurrentUser();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((UserObject) (obj)).toJson() == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = ((UserObject) (obj)).toJson().toString();
_L3:
        if (StringHelper.isNotEmpty(((String) (obj))))
        {
            sendSuccessResponse(remoteorderclient, ((String) (obj)));
            return;
        }
        try
        {
            LogUtil.d(TAG, "UserObject parse failed!", new Object[0]);
            sendFailureResponse(remoteorderclient);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogUtil.d(TAG, "UserObject parse exception!", new Object[0]);
        }
        sendFailureResponse(remoteorderclient);
        return;
_L2:
        sendWarningResponse(remoteorderclient, ResponseErrorCode.UNAUTHORIZED_USER);
        return;
        obj = "";
          goto _L3
    }

    private void sendFailureResponse(RemoteOrderClient remoteorderclient)
    {
        sendResponse(remoteorderclient, null, ResponseStatus.FAILURE, ResponseErrorCode.INVALID);
    }

    private void sendLoginResponse(RemoteOrderClient remoteorderclient)
    {
        Object obj = mUserProfileManager.getCurrentUser();
        if (obj != null)
        {
            obj = ((UserObject) (obj)).getFirstName();
        } else
        {
            obj = null;
        }
        sendSuccessResponse(remoteorderclient, ((String) (obj)));
    }

    private void sendResponse(RemoteOrderClient remoteorderclient, String s, ResponseStatus responsestatus, ResponseErrorCode responseerrorcode)
    {
        remoteorderclient.onResponseReceived(new ResponseEvent(mContext, s, responsestatus, responseerrorcode));
    }

    private void sendSuccessResponse(RemoteOrderClient remoteorderclient, LabsOrder labsorder)
    {
        if (labsorder != null)
        {
            sendResponse(remoteorderclient, (new k()).a(labsorder), ResponseStatus.SUCCESS, ResponseErrorCode.VALID);
            return;
        } else
        {
            sendFailureResponse(remoteorderclient);
            return;
        }
    }

    private void sendSuccessResponse(RemoteOrderClient remoteorderclient, String s)
    {
        sendResponse(remoteorderclient, s, ResponseStatus.SUCCESS, ResponseErrorCode.VALID);
    }

    private void sendWarningResponse(RemoteOrderClient remoteorderclient, ResponseErrorCode responseerrorcode)
    {
        sendResponse(remoteorderclient, null, ResponseStatus.WARNING, responseerrorcode);
    }

    private void sendWarningResponse(RemoteOrderClient remoteorderclient, LabsOrder labsorder, ResponseErrorCode responseerrorcode)
    {
        if (labsorder != null)
        {
            sendResponse(remoteorderclient, (new k()).a(labsorder), ResponseStatus.WARNING, responseerrorcode);
            return;
        } else
        {
            sendFailureResponse(remoteorderclient);
            return;
        }
    }

    private void sendWarningResponse(RemoteOrderClient remoteorderclient, String s, ResponseErrorCode responseerrorcode)
    {
        sendResponse(remoteorderclient, s, ResponseStatus.WARNING, responseerrorcode);
    }

    public void createOrderFromHistoricalOrder(LabsOrder labsorder, final RemoteOrderClient listener)
    {
        if (labsorder == null)
        {
            sendFailureResponse(listener);
            return;
        }
        if (mOrderUtil.isHistoricalProductsRemoved(labsorder))
        {
            if (mOrderUtil.isHistoricalProductsListEmpty(labsorder))
            {
                LogUtil.d(TAG, "All the products are removed", new Object[0]);
                sendWarningResponse(listener, ResponseErrorCode.ALL_ITEMS_UNAVAILABLE);
                return;
            } else
            {
                LogUtil.d(TAG, "Some of the historical products are removed", new Object[0]);
                sendWarningResponse(listener, ResponseErrorCode.SOME_ITEMS_UNAVAILABLE);
                return;
            }
        } else
        {
            mOrderManager.createOrderFromHistoricalOrder(labsorder, new _cls3());
            return;
        }
    }

    public void getCustomerProfile(final RemoteOrderClient remoteOrderClient)
    {
        LogUtil.d(TAG, "Get Customer info", new Object[0]);
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(remoteOrderClient);
            return;
        }
        if (!mUserProfileManager.isRemembered() && !mUserProfileManager.isUserLoggedIn())
        {
            sendWarningResponse(remoteOrderClient, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "Cannot get customer info.User not remembered!", new Object[0]);
            return;
        }
        if (!mUserProfileManager.isUserLoggedIn())
        {
            mPowerRestClient.rememberedLogin(new _cls6());
            return;
        } else
        {
            sendCustomerInfo(remoteOrderClient);
            return;
        }
    }

    public void getEasyOrder(RemoteOrderClient remoteorderclient)
    {
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(remoteorderclient);
            return;
        }
        if (!mUserProfileManager.isRemembered() && !mUserProfileManager.isUserLoggedIn())
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "User not remembered to fetch recent order", new Object[0]);
            return;
        }
        if (!mUserProfileManager.isUserWithOrderHistory())
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.NO_HISTORICAL_ORDER);
            LogUtil.d(TAG, "No historical order", new Object[0]);
            return;
        }
        LabsOrder labsorder = mUserProfileManager.getEasyOrder();
        if (labsorder != null)
        {
            createOrderFromHistoricalOrder(labsorder, remoteorderclient);
            return;
        } else
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.NO_EASY_ORDER);
            return;
        }
    }

    public void getHistoricalOrders(final RemoteOrderClient client)
    {
        LogUtil.d(TAG, "Get Recent Order", new Object[0]);
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(client);
            return;
        }
        if (!mUserProfileManager.isRemembered() && !mUserProfileManager.isUserLoggedIn())
        {
            sendWarningResponse(client, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "User not remembered to fetch recent order", new Object[0]);
            return;
        }
        if (!mUserProfileManager.isUserLoggedIn())
        {
            mPowerRestClient.rememberedLogin(new _cls2());
            return;
        } else
        {
            getCustomerOrderHistory(client);
            return;
        }
    }

    public void getLoyaltyInformation(RemoteOrderClient remoteorderclient)
    {
        try
        {
            sendSuccessResponse(remoteorderclient, (new k()).a(mLoyaltyManger.getPricePlaceLoyalty()));
            return;
        }
        catch (Exception exception)
        {
            sendFailureResponse(remoteorderclient);
        }
    }

    public void getOrdersByPhone(String s, String s1, final RemoteOrderClient remoteOrderClient)
    {
        LogUtil.d(TAG, (new StringBuilder("Finding order by phone number : ")).append(s).toString(), new Object[0]);
        mPowerRestClient.trackOrderByPhone(s, s1, new _cls7());
    }

    public void getRecentOrders(RemoteOrderClient remoteorderclient)
    {
        LogUtil.d(TAG, "Get Recent Order", new Object[0]);
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(remoteorderclient);
            return;
        }
        if (!mUserProfileManager.isRemembered() && !mUserProfileManager.isUserLoggedIn())
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "User not remembered to fetch recent order", new Object[0]);
            return;
        }
        if (!mUserProfileManager.isUserWithOrderHistory())
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.NO_HISTORICAL_ORDER);
            LogUtil.d(TAG, "No historical order", new Object[0]);
            return;
        } else
        {
            sendSuccessResponse(remoteorderclient, (new k()).a(mUserProfileManager.getRecentOrderHistoryList()));
            return;
        }
    }

    public void getTrackOrderInfo(RemoteOrderClient remoteorderclient)
    {
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(remoteorderclient);
            return;
        }
        UserObject userobject = mUserProfileManager.getCurrentUser();
        if (userobject != null)
        {
            TrackOrderInfo trackorderinfo = new TrackOrderInfo();
            trackorderinfo.setPhone(userobject.getPhone());
            trackorderinfo.setPhoneExtension(userobject.getPhoneExtension());
            trackorderinfo.setAlternatePhone(userobject.getAlternatePhone());
            trackorderinfo.setAlternatePhoneExtension(userobject.getAlternatePhoneExtension());
            sendSuccessResponse(remoteorderclient, (new k()).a(trackorderinfo));
            return;
        } else
        {
            sendWarningResponse(remoteorderclient, ResponseErrorCode.UNAUTHORIZED_USER);
            return;
        }
    }

    public void login(final RemoteOrderClient client)
    {
        if (!mConnectionUtil.isNetworkAvailable())
        {
            LogUtil.d(TAG, "Network connection unavailable!", new Object[0]);
            sendFailureResponse(client);
            return;
        }
        if (!mUserProfileManager.isRemembered() && !mUserProfileManager.isUserLoggedIn())
        {
            sendWarningResponse(client, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "Cannot get customer info.User not remembered!", new Object[0]);
            return;
        }
        if (!mApplicationLoader.isApplicationInitialized())
        {
            LogUtil.d(TAG, "Application not initialized, trying to setup now.", new Object[0]);
            mApplicationLoader.setupAsync(mSession, new _cls1());
            return;
        } else
        {
            sendLoginResponse(client);
            return;
        }
    }

    public void placeOrder(LabsOrder labsorder, final RemoteOrderClient client)
    {
        if (labsorder == null)
        {
            LogUtil.d(TAG, "Place order request is not valid", new Object[0]);
            sendFailureResponse(client);
            return;
        }
        final UserObject userObject = mUserProfileManager.getCurrentUser();
        if (userObject == null || !StringHelper.equals(userObject.getCustomerId(), labsorder.getCustomerId()))
        {
            sendWarningResponse(client, ResponseErrorCode.UNAUTHORIZED_USER);
            LogUtil.d(TAG, "User not remembered to fetch recent order", new Object[0]);
            return;
        } else
        {
            labsorder.setFeature(client.getName());
            mOrderUtil.addChannelToOrder(labsorder);
            mPowerRestClient.placeOrder(labsorder, new _cls4());
            return;
        }
    }

    public void setup(Session session)
    {
        mSession = session;
        mUserProfileManager = (UserProfileManager)session.getManager("user_manager");
        mMenuManager = (MenuManager)session.getManager("menu_manager");
        mConfigurationManager = (ConfigurationManager)session.getManager("configuration_manager");
        mOrderManager = (OrderManager)session.getManager("order_manager");
        mCartManager = (CartManager)session.getManager("cart_manager");
        mLoyaltyManger = (LoyaltyManager)session.getManager("loyalty_manager");
    }















    private class _cls5 extends com.dominos.android.sdk.core.user.UserProfileManager.GetOrderHistoryCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$listener;

        public void onGetOrderHistoryError()
        {
            LogUtil.d(RemoteOrderManager.TAG, "Historical order request Failed", new Object[0]);
            sendFailureResponse(listener);
        }

        public void onGetOrderHistorySuccess()
        {
            LogUtil.d(RemoteOrderManager.TAG, "Historical order request success", new Object[0]);
            sendSuccessResponse(listener, mUserProfileManager.getHistoricalOrderResponse());
        }

        _cls5()
        {
            this$0 = RemoteOrderManager.this;
            listener = remoteorderclient;
            super();
        }
    }


    private class _cls3 extends com.dominos.android.sdk.core.order.OrderManager.CreateReOrderCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$listener;

        public void onFailure()
        {
            sendFailureResponse(listener);
        }

        public void onNewOrder(LabsOrder labsorder)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Created order from historical order", new Object[0]);
            if (labsorder.getLineCount() > 0)
            {
                class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
                {

                    final _cls3 this$1;

                    public void onPriceOrderRequestFailed()
                    {
                        sendFailureResponse(listener);
                    }

                    public void onPriceSuccess(LabsOrder labsorder1)
                    {
                        if (labsorder1.needsCustomization())
                        {
                            LogUtil.d(RemoteOrderManager.TAG, "Order need customization.", new Object[0]);
                            sendWarningResponse(listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
                            return;
                        }
                        if (!mUserProfileManager.isHistoricalOrderPaymentValid(labsorder1))
                        {
                            LogUtil.d(RemoteOrderManager.TAG, "Historical order payment not valid!", new Object[0]);
                            sendWarningResponse(listener, labsorder1, ResponseErrorCode.HISTORICAL_PAYMENT_NOT_SUPPORTED);
                            return;
                        }
                        if (!mUserProfileManager.isAuthorizedToPlaceOrder(labsorder1))
                        {
                            LogUtil.d(RemoteOrderManager.TAG, "User not authorized to place order!", new Object[0]);
                            sendWarningResponse(listener, labsorder1, ResponseErrorCode.UNAUTHORIZED_TO_PLACE_ORDER);
                            return;
                        }
                        if (labsorder1.isCouponRemoved())
                        {
                            LogUtil.d(RemoteOrderManager.TAG, "Coupon removed from historical order!", new Object[0]);
                            sendWarningResponse(listener, labsorder1, ResponseErrorCode.COUPON_REMOVED);
                            return;
                        } else
                        {
                            sendSuccessResponse(listener, labsorder1);
                            return;
                        }
                    }

                    public void onPricingFailure(LabsOrder labsorder1)
                    {
                        LogUtil.d(RemoteOrderManager.TAG, "Historical order pricing failed", new Object[0]);
                        sendWarningResponse(listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
                    }

                    public void onPricingWarning(LabsOrder labsorder1, PriceOrderErrorCode priceordererrorcode)
                    {
                    }

                _cls1()
                {
                    this$1 = _cls3.this;
                    super();
                }
                }

                mOrderManager.priceOrder(labsorder, new _cls1());
                return;
            } else
            {
                LogUtil.d(RemoteOrderManager.TAG, "All the products are removed", new Object[0]);
                sendWarningResponse(listener, ResponseErrorCode.ALL_ITEMS_UNAVAILABLE);
                return;
            }
        }

        public void onNoStoreFoundForDelivery()
        {
            LogUtil.d(RemoteOrderManager.TAG, "No Store found to deliver to this address", new Object[0]);
            sendWarningResponse(listener, ResponseErrorCode.NO_STORE_DELIVERY_ADDRESS);
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Store currently doesn't do carryout", new Object[0]);
            sendWarningResponse(listener, ResponseErrorCode.CARRYOUT_NOT_AVAILABLE);
        }

        public void onStoreClosed()
        {
            LogUtil.d(RemoteOrderManager.TAG, "Store Currently Closed", new Object[0]);
            sendWarningResponse(listener, ResponseErrorCode.STORE_CLOSED);
        }

        public void onStoreDeliveryUnavailable(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Delivery not available currently", new Object[0]);
            sendWarningResponse(listener, ResponseErrorCode.DELIVERY_NOT_AVAILABLE);
        }

        public void onStoreOffline(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Store Currently offline", new Object[0]);
            sendWarningResponse(listener, ResponseErrorCode.STORE_CLOSED);
        }

        _cls3()
        {
            this$0 = RemoteOrderManager.this;
            listener = remoteorderclient;
            super();
        }
    }


    private class _cls6 extends PowerRestCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$remoteOrderClient;

        public void onError(Exception exception, String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Login as remember user failed!", new Object[0]);
            sendFailureResponse(remoteOrderClient);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Login response success!", new Object[0]);
            s = UserObject.from(s);
            if (s == null)
            {
                sendWarningResponse(remoteOrderClient, ResponseErrorCode.UNAUTHORIZED_USER);
                return;
            } else
            {
                mUserProfileManager.saveNewCurrentUser(s);
                sendCustomerInfo(remoteOrderClient);
                return;
            }
        }

        _cls6()
        {
            this$0 = RemoteOrderManager.this;
            remoteOrderClient = remoteorderclient;
            super();
        }
    }


    private class _cls2 extends PowerRestCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$client;

        public void onError(Exception exception, String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Login as remember user failed!", new Object[0]);
            sendFailureResponse(client);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Login response success!", new Object[0]);
            s = UserObject.from(s);
            if (s == null)
            {
                sendWarningResponse(client, ResponseErrorCode.UNAUTHORIZED_USER);
                return;
            } else
            {
                mUserProfileManager.saveNewCurrentUser(s);
                getCustomerOrderHistory(client);
                return;
            }
        }

        _cls2()
        {
            this$0 = RemoteOrderManager.this;
            client = remoteorderclient;
            super();
        }
    }


    private class _cls7 extends PowerRestCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$remoteOrderClient;

        public void onError(Exception exception, String s)
        {
            sendFailureResponse(remoteOrderClient);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            sendSuccessResponse(remoteOrderClient, s);
        }

        _cls7()
        {
            this$0 = RemoteOrderManager.this;
            remoteOrderClient = remoteorderclient;
            super();
        }
    }


    private class _cls1
        implements com.dominos.loader.ApplicationLoader.SetupLoadCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$client;

        public void onSetupFailure(int i, String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Failed to setup application", new Object[0]);
            s = mConfigurationManager.getUpgradeMessage(Locale.ENGLISH.getLanguage());
            if (i == 8)
            {
                LogUtil.d(RemoteOrderManager.TAG, "Order unavailable", new Object[0]);
                sendWarningResponse(client, s, ResponseErrorCode.ORDERING_UNAVAILABLE);
                return;
            }
            if (i == 3)
            {
                LogUtil.d(RemoteOrderManager.TAG, "Force upgrade required", new Object[0]);
                sendWarningResponse(client, s, ResponseErrorCode.FORCE_UPGRADE);
                return;
            } else
            {
                sendFailureResponse(client);
                return;
            }
        }

        public void onSetupSuccess()
        {
            LogUtil.d(RemoteOrderManager.TAG, "Setup application success", new Object[0]);
            sendLoginResponse(client);
        }

        _cls1()
        {
            this$0 = RemoteOrderManager.this;
            client = remoteorderclient;
            super();
        }
    }


    private class _cls4 extends PowerRestCallback
    {

        final RemoteOrderManager this$0;
        final RemoteOrderClient val$client;
        final UserObject val$userObject;

        public void onError(Exception exception, String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Place order request Failed!", new Object[0]);
            sendFailureResponse(client);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            LogUtil.d(RemoteOrderManager.TAG, "Place order request Success!", new Object[0]);
            LogUtil.d(RemoteOrderManager.TAG, "Refreshing historical orders..", new Object[0]);
            mUserProfileManager.loadAndWaitForOrderHistoryAndCards(userObject.getCustomerId());
            sendSuccessResponse(client, s);
        }

        _cls4()
        {
            this$0 = RemoteOrderManager.this;
            client = remoteorderclient;
            userObject = userobject;
            super();
        }
    }

}
