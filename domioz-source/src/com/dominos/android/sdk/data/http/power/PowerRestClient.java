// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.HttpUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Json;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.feedback.FeedbackResponse;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.json.CouponDaysDeserializer;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import com.dominos.android.sdk.core.user.UserService;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.google.a.a.w;
import com.google.b.r;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.androidannotations.api.c.k;
import org.androidannotations.api.c.p;
import org.c.c.l;
import org.c.d.i;
import org.c.d.j;
import org.json.JSONObject;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestInterface, PowerRestCallbackHandler, LoggingClientHttpRequestFactory, PowerHeaderInterceptor, 
//            PowerRestCallback

public class PowerRestClient
{

    private static final String OAUTH_CLIENT_ID = "Android";
    private static final int OAUTH_EXPIRATION_HANDICAP = 60;
    private static final String OAUTH_SCOPE = "place_order:customer_orders:limited";
    private static final String REMEMBER_ME_COOKIE_VALUE = "REMEMBER_ME_COOKIE";
    private static final String TAG = com/dominos/android/sdk/data/http/power/PowerRestClient.getSimpleName();
    ApplicationService appService;
    PowerRestCallbackHandler callbackHandler;
    PowerHeaderInterceptor headerInterceptor;
    ConfigProvider mConfigProvider;
    OrderUtil mOrderUtil;
    PowerRestInterface powerRestInterface;
    DominosPrefs_ prefs;
    UserService user;
    UserAuthorization userAuth;

    public PowerRestClient()
    {
    }

    private void refreshOAuthToken()
    {
        Object obj;
        long l1;
        l1 = 0L;
        obj = prefs.OAUTH_JWT().a("");
        if (StringHelper.isEmpty(((String) (obj)))) goto _L2; else goto _L1
_L1:
        Object obj1 = Json.parse(((String) (obj)));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj1 = (String)((Map) (obj1)).get("refresh_token");
        if (!StringHelper.isNotEmpty(((String) (obj1)))) goto _L4; else goto _L5
_L5:
        long l2;
        obj = new i();
        ((j) (obj)).add("refresh_token", obj1);
        ((j) (obj)).add("scope", "place_order:customer_orders:limited");
        ((j) (obj)).add("client_id", "Android");
        ((j) (obj)).add("grant_type", "refresh_token");
        obj = powerRestInterface.oauth(((j) (obj)));
        l2 = System.currentTimeMillis();
        l1 = l2;
_L7:
        prefs.OAUTH_JWT().b(obj);
        prefs.oAuthLastAccessTime().b(Long.valueOf(l1));
        return;
_L2:
        try
        {
            LogUtil.w(TAG, "JWT token is empty!", new Object[0]);
        }
        catch (Exception exception)
        {
            LogUtil.e(TAG, (new StringBuilder("JWT refresh failed: ")).append(exception.getMessage()).toString(), new Object[0]);
            exception = "";
        }
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = 0L;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void refreshOAuthTokenIfExpired(boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        long l1;
        obj = prefs.OAUTH_JWT().a("");
        l1 = prefs.oAuthLastAccessTime().a(Long.valueOf(0L)).longValue();
        if (StringHelper.isEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = Json.parse(((String) (obj)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (Long)((Map) (obj)).get("expires_in");
        if (((Long) (obj)).longValue() <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        LogUtil.d(TAG, (new StringBuilder("Access token expire time: ")).append(obj).toString(), new Object[0]);
        l1 = TimeUnit.SECONDS.convert(System.currentTimeMillis() - l1, TimeUnit.MILLISECONDS);
        LogUtil.d(TAG, (new StringBuilder("Access token elapsed time: ")).append(l1).toString(), new Object[0]);
        if (l1 >= Long.valueOf(((Long) (obj)).longValue() - 60L).longValue())
        {
            LogUtil.d(TAG, "Access token expired!", new Object[0]);
            refreshOAuthToken();
            return;
        }
        Exception exception;
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            LogUtil.w(TAG, "Access token expire time empty!", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            LogUtil.e(TAG, (new StringBuilder("JWT check expires time failed: ")).append(exception.getMessage()).toString(), new Object[0]);
            return;
        }
        LogUtil.w(TAG, "JWT token is empty!", new Object[0]);
        return;
    }

    public void addCard(String s, String s1, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        powerRestInterface.setHeader("Content-Type", "application/json");
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.addCard(s1, s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "addCard");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void changePassword(String s, String s1, String s2, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        callbackHandler.onBegin(powerrestcallback);
        i i1 = new i();
        i1.add("u", s);
        i1.add("p", s1);
        i1.add("n", s2);
        s = powerRestInterface.changePassword(i1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "changePassword");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void deleteCard(String s, String s1, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        powerRestInterface.setHeader("Content-Type", "application/json");
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.deleteCard(s, s1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "deleteCard");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void doEmailOptIn(String s, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.emailOptIn(s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "doEmailOptIn");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void getAllCards(String s, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.getAllCards(s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getAllCards");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void getBuildings(int i1, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        String s = powerRestInterface.buildings(i1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        Object obj;
        obj;
        callbackHandler.onError(powerrestcallback, ((Exception) (obj)), "getBuildings");
        callbackHandler.onFinish(powerrestcallback);
        return;
        obj;
        callbackHandler.onFinish(powerrestcallback);
        throw obj;
    }

    public FeedbackQuestions getFeedbackQuestions(String s, String s1, String s2)
    {
        try
        {
            s = FeedbackQuestions.from(powerRestInterface.getFeedbackQuestions(s, s1, s2));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public HistoryLoyalty getLoyaltyHistory(String s)
    {
        try
        {
            s = powerRestInterface.getLoyaltyHistory(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", s, new Object[] {
                s.getMessage()
            });
            return null;
        }
        return s;
    }

    public CustomerLoyalty getLoyaltyInformation(String s)
    {
        try
        {
            s = powerRestInterface.getLoyaltyInformation(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", s, new Object[] {
                s.getMessage()
            });
            if (HttpUtil.isHttpErrorCausedByCode(s, l.NOT_FOUND))
            {
                return new CustomerLoyalty();
            } else
            {
                return null;
            }
        }
        return s;
    }

    public void getMenu(String s, String s1, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.menu(s, s1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getMenu");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    protected void getOAuthToken(String s, String s1)
    {
        prefs.OAUTH_JWT().b("");
        i i1 = new i();
        i1.add("username", s);
        i1.add("password", s1);
        i1.add("scope", "place_order:customer_orders:limited");
        i1.add("client_id", "Android");
        i1.add("grant_type", "password");
        try
        {
            s = powerRestInterface.oauth(i1);
            prefs.OAUTH_JWT().b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, (new StringBuilder("JWT fetch failed: ")).append(s.getMessage()).toString(), new Object[0]);
        }
    }

    public void getOrderHistory(String s, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        callbackHandler.onBegin(powerrestcallback);
        String s1 = appService.getLangSetting();
        s = powerRestInterface.orderHistory(s, 5, s1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getOrderHistory");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void getRegions(PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        String s = powerRestInterface.regions();
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        Object obj;
        obj;
        callbackHandler.onError(powerrestcallback, ((Exception) (obj)), "getRegions");
        callbackHandler.onFinish(powerrestcallback);
        return;
        obj;
        callbackHandler.onFinish(powerrestcallback);
        throw obj;
    }

    public PowerRestInterface getRestInterface()
    {
        return powerRestInterface;
    }

    public void getSites(String s, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.sites(s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getSites");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public Coupon getStoreCoupon(String s, String s1, String s2)
    {
        try
        {
            s = powerRestInterface.storeCoupon(s, s1, s2);
            s = (Coupon)(new r()).a([Lcom/dominos/android/sdk/core/models/coupon/Day;, new CouponDaysDeserializer()).f().a(s, com/dominos/android/sdk/core/models/coupon/Coupon);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public void getStoreProfile(String s, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.storeProfile(s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getStoreProfile");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public LocatorResult getStores(int i1, String s)
    {
        Object obj = null;
        String s1;
        try
        {
            s1 = powerRestInterface.stores(i1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s = obj;
        if (StringHelper.isNotEmpty(s1))
        {
            s = LocatorResult.from(s1);
        }
        return s;
    }

    public void getStores(int i1, String s, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.stores(i1, s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "getStoreFromAddress");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void giftCardBalanceInquiry(GiftCard giftcard, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        giftcard = giftcard.toJson(giftcard);
        giftcard = powerRestInterface.giftCardBalanceInquiry(giftcard);
        callbackHandler.onSuccess(powerrestcallback, giftcard);
        callbackHandler.onFinish(powerrestcallback);
        return;
        giftcard;
        callbackHandler.onError(powerrestcallback, giftcard, "giftCardBalanceInquiry");
        callbackHandler.onFinish(powerrestcallback);
        return;
        giftcard;
        callbackHandler.onFinish(powerrestcallback);
        throw giftcard;
    }

    public LocatorResult locateStores(String s, String s1)
    {
        Object obj = null;
        try
        {
            s1 = powerRestInterface.storeLocator(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s = obj;
        if (StringHelper.isNotEmpty(s1))
        {
            s = LocatorResult.from(s1);
        }
        return s;
    }

    public void locateStores(String s, String s1, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.storeLocator(s, s1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "locateStores");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void login(String s, String s1, boolean flag, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        Object obj;
        obj = new i();
        ((j) (obj)).add("u", s);
        ((j) (obj)).add("p", s1);
        obj = powerRestInterface.login(((j) (obj)), String.valueOf(flag));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        appService.persistCookie("rememberMeCookieValue", powerRestInterface.getCookie("REMEMBER_ME_COOKIE"));
        callbackHandler.onSuccess(powerrestcallback, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        getOAuthToken(s, s1);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "login");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void placeOrder(LabsOrder labsorder, PowerRestCallback powerrestcallback)
    {
        boolean flag = labsorder.isPaymentTypeSavedCreditCard();
        refreshOAuthTokenIfExpired(flag);
        powerRestInterface.setAuthentication(userAuth.getAuthentication(flag));
        callbackHandler.onBegin(powerrestcallback);
        labsorder = mOrderUtil.toJson(labsorder);
        String s = appService.getLangSetting();
        labsorder = powerRestInterface.placeOrder(String.format("{\"Order\":%s}", new Object[] {
            labsorder
        }), s);
        callbackHandler.onSuccess(powerrestcallback, labsorder);
        callbackHandler.onFinish(powerrestcallback);
        return;
        labsorder;
        callbackHandler.onError(powerrestcallback, labsorder, "placeOrder");
        callbackHandler.onFinish(powerrestcallback);
        return;
        labsorder;
        callbackHandler.onFinish(powerrestcallback);
        throw labsorder;
    }

    public void priceOrder(LabsOrder labsorder, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        labsorder = mOrderUtil.toJson(labsorder);
        labsorder = powerRestInterface.priceOrder(String.format("{\"Order\":%s}", new Object[] {
            labsorder
        }));
        callbackHandler.onSuccess(powerrestcallback, labsorder);
        callbackHandler.onFinish(powerrestcallback);
        return;
        labsorder;
        callbackHandler.onError(powerrestcallback, labsorder, "priceOrder");
        callbackHandler.onFinish(powerrestcallback);
        return;
        labsorder;
        callbackHandler.onFinish(powerrestcallback);
        throw labsorder;
    }

    public UserObject rememberedLogin()
    {
        Object obj;
        try
        {
            obj = powerRestInterface.login();
            refreshOAuthToken();
            obj = UserObject.from(((String) (obj)));
        }
        catch (Exception exception)
        {
            LogUtil.e(TAG, "%s", exception, new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((UserObject) (obj));
    }

    public void rememberedLogin(PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        String s = powerRestInterface.login();
        callbackHandler.onSuccess(powerrestcallback, s);
        refreshOAuthToken();
        callbackHandler.onFinish(powerrestcallback);
        return;
        Object obj;
        obj;
        callbackHandler.onError(powerrestcallback, ((Exception) (obj)), "rememberedLogin");
        callbackHandler.onFinish(powerrestcallback);
        return;
        obj;
        callbackHandler.onFinish(powerrestcallback);
        throw obj;
    }

    public void resetPassword(String s, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        callbackHandler.onBegin(powerrestcallback);
        i i1 = new i();
        i1.add("u", s);
        s = powerRestInterface.resetPassword(i1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "resetPassword");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public UserObject saveCustomer(UserObject userobject)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        try
        {
            userobject = userobject.toJson().toString();
            userobject = UserObject.from(powerRestInterface.saveCustomer(userobject));
        }
        // Misplaced declaration of an exception variable
        catch (UserObject userobject)
        {
            return null;
        }
        return userobject;
    }

    public void saveCustomer(UserObject userobject, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        callbackHandler.onBegin(powerrestcallback);
        userobject = userobject.toJson().toString();
        userobject = powerRestInterface.saveCustomer(userobject);
        callbackHandler.onSuccess(powerrestcallback, userobject);
        callbackHandler.onFinish(powerrestcallback);
        return;
        userobject;
        callbackHandler.onError(powerrestcallback, userobject, "saveCustomer");
        callbackHandler.onFinish(powerrestcallback);
        return;
        userobject;
        callbackHandler.onFinish(powerrestcallback);
        throw userobject;
    }

    public void setRootUrl(String s)
    {
        powerRestInterface.setRootUrl(s);
    }

    void setupService()
    {
        setRootUrl(mConfigProvider.getPowerURL());
        org.c.e.a.l l1 = powerRestInterface.getRestTemplate();
        Object obj;
        if (appService.isDebugMode())
        {
            obj = new LoggingClientHttpRequestFactory();
        } else
        {
            obj = new org.c.c.a.r();
        }
        ((org.c.c.a.r) (obj)).setReadTimeout(30000);
        ((org.c.c.a.r) (obj)).setConnectTimeout(5000);
        l1.setRequestFactory(((org.c.c.a.g) (obj)));
        obj = appService.obtainPersistentCookie("rememberMeCookieValue");
        if (StringHelper.isNotEmpty(((String) (obj))))
        {
            powerRestInterface.setCookie("REMEMBER_ME_COOKIE", ((String) (obj)));
        }
    }

    public boolean submitFeedback(FeedbackResponse feedbackresponse, String s)
    {
        try
        {
            powerRestInterface.submitFeedback(feedbackresponse.getStoreId(), feedbackresponse.getOrderId(), feedbackresponse.getOrderKey(), feedbackresponse.getQuestionId(), feedbackresponse.getQuestionType(), feedbackresponse.getTeamMemberId(), feedbackresponse.getTeamMemberName(), feedbackresponse.getTeamMemberPosition(), feedbackresponse.getFeedbackResponse(), s);
        }
        // Misplaced declaration of an exception variable
        catch (FeedbackResponse feedbackresponse)
        {
            return false;
        }
        return true;
    }

    public void trackOrder(String s, String s1, PowerRestCallback powerrestcallback)
    {
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.trackOrder(s, s1);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "trackOrder");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

    public void trackOrderByPhone(String s, String s1, PowerRestCallback powerrestcallback)
    {
        boolean flag;
        flag = false;
        callbackHandler.onBegin(powerrestcallback);
        w w1 = w.a(" ").b();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.length() != 0) goto _L3; else goto _L2
_L5:
        s = w1.a(s, s1, new Object[0]);
        s = powerRestInterface.trackOrder(s);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "trackOrderByPhone");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
_L2:
        flag = true;
_L3:
        if (flag)
        {
            s1 = null;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void updateCard(String s, String s1, String s2, PowerRestCallback powerrestcallback)
    {
        powerRestInterface.setAuthentication(userAuth.getAuthentication(false));
        powerRestInterface.setHeader("Content-Type", "application/json");
        callbackHandler.onBegin(powerrestcallback);
        s = powerRestInterface.updateCard(s, s1, s2);
        callbackHandler.onSuccess(powerrestcallback, s);
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onError(powerrestcallback, s, "updateCard");
        callbackHandler.onFinish(powerrestcallback);
        return;
        s;
        callbackHandler.onFinish(powerrestcallback);
        throw s;
    }

}
