// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import android.os.Handler;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard;
import com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.androidannotations.api.c.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserAPI, UserService

public class UserProfileManager extends Manager
{

    private static final int NEW_ADDRESS_INDEX = -1;
    private static final String TAG = "UserProfileManager";
    private String historicalOrderResponse;
    private AnalyticsService mAnalyticsService;
    private UserObject mCurrentUser;
    private LoyaltyManager mLoyaltyManager;
    private String mNewSavedCardId;
    private ArrayList mOrderHistoryList;
    private OrderManager mOrderManager;
    OrderUtil mOrderUtil;
    PowerRestClient mPowerService;
    private List mProductRemovedAlertOrderList;
    private List mSavedPaymentList;
    UserAPI mUserApi;
    UserAuthorization mUserAuth;
    UserService mUserService;
    DominosPrefs_ prefs;

    public UserProfileManager()
    {
        mProductRemovedAlertOrderList = new ArrayList();
    }

    private void getLoyaltyInformationForEnrollment(UserObject userobject, final UpdateCustomerWithLoyaltyCallback updateCustomerWithLoyaltyCallback)
    {
        if (mLoyaltyManager.isLoyaltyAvailable())
        {
            mLoyaltyManager.getUserLoyaltyInformation(userobject, new _cls12());
            return;
        } else
        {
            updateCustomerWithLoyaltyCallback.onLoyaltyEnrollFail();
            updateCustomerWithLoyaltyCallback.onFinish();
            return;
        }
    }

    private CreditCardErrorType handleCreditCardError(String s)
    {
        try
        {
            s = (new JSONObject(s)).getJSONArray("error").getJSONObject(0);
            if (s.getString("code").equals("CardOnFileLimitExceeded"))
            {
                return CreditCardErrorType.CARD_ON_FILE_LIMIT_EXCEEDED;
            }
            if (s.getString("code").equals("InvalidRequest") && s.getString("description").equals("nickname already exists"))
            {
                return CreditCardErrorType.DUPLICATE_NICKNAME;
            }
            s = CreditCardErrorType.GENERAL_CREDIT_CARD_ERROR;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return CreditCardErrorType.GENERAL_CREDIT_CARD_ERROR;
        }
        return s;
    }

    private void handleLoginSuccess(UserObject userobject, LoginCallback logincallback)
    {
        loadAndWaitForOrderHistoryAndCards(userobject.getCustomerId());
        if (logincallback != null)
        {
            logincallback.onLoginSuccessful();
        }
    }

    private boolean isCardExistOnProfile(String s)
    {
        if (StringHelper.isEmpty(s))
        {
            LogUtil.d("UserProfileManager", "Card id empty", new Object[0]);
            return false;
        }
        if (mSavedPaymentList == null)
        {
            LogUtil.d("UserProfileManager", "Saved credit cards doesn't exists", new Object[0]);
            return false;
        }
        for (Iterator iterator = mSavedPaymentList.iterator(); iterator.hasNext();)
        {
            if (StringHelper.equals(s, ((LabsPayment)iterator.next()).getCardId()))
            {
                LogUtil.d("UserProfileManager", "Card exists on profile", new Object[0]);
                return true;
            }
        }

        return false;
    }

    private void login(final String email, final String password, boolean flag, final boolean fistTime, final LoginCallback loginCallback)
    {
        if (loginCallback != null)
        {
            loginCallback.onBegin();
        }
        mPowerService.login(email, password, flag, new _cls14());
    }

    private void saveAddress(int i, LabsAddress labsaddress, boolean flag, final SaveAddressCallback callback)
    {
        UserObject userobject;
        callback.onBegin();
        Iterator iterator;
        try
        {
            userobject = getCurrentUser().copy();
        }
        // Misplaced declaration of an exception variable
        catch (LabsAddress labsaddress)
        {
            callback.onAddressSaveFailure();
            callback.onFinish();
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        for (iterator = userobject.getAddressList().iterator(); iterator.hasNext(); ((LabsAddress)iterator.next()).setIsDefault(false)) { }
        labsaddress.setIsDefault(true);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        userobject.addAddress(new LabsAddress(labsaddress));
_L2:
        mPowerService.saveCustomer(userobject, new _cls8());
        return;
        userobject.getAddressList().set(i, labsaddress);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void addAddress(LabsAddress labsaddress, boolean flag, SaveAddressCallback saveaddresscallback)
    {
        saveAddress(-1, labsaddress, flag, saveaddresscallback);
    }

    public void clearCurrentUser()
    {
        mUserAuth.clearAuthorizationCode();
        mUserAuth.clearOAuthToken();
        mCurrentUser = null;
        prefs.rememberMeCookieValue().d();
        if (mSavedPaymentList != null)
        {
            mSavedPaymentList.clear();
        }
        if (mOrderHistoryList != null)
        {
            mOrderHistoryList.clear();
        }
        mLoyaltyManager.reset();
        if (mOrderManager.getOrder() != null)
        {
            mOrderManager.getOrder().setCustomerId("");
        }
    }

    public void deleteAddress(int i, final DeleteAddressCallback callback)
    {
        if (callback == null)
        {
            return;
        }
        callback.onBegin();
        try
        {
            UserObject userobject = mCurrentUser.copy();
            if (userobject.getAddressList() != null && userobject.getAddressList().size() > i)
            {
                userobject.removeAddress(i);
                mPowerService.saveCustomer(userobject, new _cls1());
                return;
            }
        }
        catch (JSONException jsonexception)
        {
            callback.onAddressDeleteFailure();
            callback.onFinish();
            return;
        }
        callback.onAddressDeleteFailure();
        callback.onFinish();
        return;
    }

    public void deleteCreditCard(CreditCardToken creditcardtoken, final DeleteCreditCardCallback deleteCreditCardCallback)
    {
        try
        {
            mPowerService.deleteCard(mCurrentUser.getCustomerId(), creditcardtoken.getId(), new _cls6());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CreditCardToken creditcardtoken)
        {
            deleteCreditCardCallback.onCreditCardDeletingError();
        }
    }

    public void enrollCustomerWithLoyalty(UpdateCustomerWithLoyaltyCallback updatecustomerwithloyaltycallback)
    {
        updatecustomerwithloyaltycallback.onBegin();
        if (!isUserLoggedIn())
        {
            updatecustomerwithloyaltycallback.onAuthorizationRequired();
            updatecustomerwithloyaltycallback.onFinish();
            return;
        }
        Object obj = new CustomerLoyalty();
        ((CustomerLoyalty) (obj)).setCommand("ENROLL");
        mCurrentUser.setCustomerLoyalty(((CustomerLoyalty) (obj)));
        mLoyaltyManager.setCustomerLoyalty(null);
        obj = mUserApi.saveCustomer(mCurrentUser);
        if (obj != null)
        {
            saveNewCurrentUser(((UserObject) (obj)));
            getLoyaltyInformationForEnrollment(((UserObject) (obj)), updatecustomerwithloyaltycallback);
            return;
        } else
        {
            updatecustomerwithloyaltycallback.onCustomerUpdateError();
            updatecustomerwithloyaltycallback.onFinish();
            return;
        }
    }

    public void fetchOrderHistory(final GetOrderHistoryCallback getOrderHistoryCallback)
    {
        mPowerService.getOrderHistory(mCurrentUser.getCustomerId(), new _cls7());
    }

    public void getAllCards(String s, final GetAllCreditCardsCallback getAllCreditCardsCallback)
    {
        mPowerService.getAllCards(s, new _cls4());
    }

    public String getAuthorizationCode()
    {
        return mUserAuth.getAuthorizationCode();
    }

    public UserObject getCurrentUser()
    {
        return mCurrentUser;
    }

    public LabsOrder getEasyOrder()
    {
        if (mOrderHistoryList != null)
        {
            for (int i = 0; i < mOrderHistoryList.size(); i++)
            {
                if (((LabsOrder)mOrderHistoryList.get(i)).isEasyOrder())
                {
                    return (LabsOrder)mOrderHistoryList.get(i);
                }
            }

        }
        return null;
    }

    public String getHistoricalOrderResponse()
    {
        return historicalOrderResponse;
    }

    public String getName()
    {
        return "user_manager";
    }

    public String getNewSavedCardId()
    {
        return mNewSavedCardId;
    }

    public ArrayList getOrderHistoryList()
    {
        return mOrderHistoryList;
    }

    public ArrayList getRecentOrderHistoryList()
    {
        if (mOrderHistoryList != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = mOrderHistoryList.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                LabsOrder labsorder = (LabsOrder)iterator.next();
                if (!labsorder.isEasyOrder())
                {
                    arraylist.add(labsorder);
                }
            } while (true);
            return arraylist;
        } else
        {
            return null;
        }
    }

    public String getRememberMeCookie()
    {
        String s = (String)prefs.rememberMeCookieValue().c();
        if (StringHelper.isNotEmpty(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    public List getSavedPaymentList()
    {
        return mSavedPaymentList;
    }

    public Handler getSessionHandler()
    {
        return mUserAuth.getSessionHandler();
    }

    public boolean hasProductRemovedAlertBeenShown(String s)
    {
        if (!mProductRemovedAlertOrderList.contains(s))
        {
            mProductRemovedAlertOrderList.add(s);
            return false;
        } else
        {
            return true;
        }
    }

    public boolean isAuthorizedToPlaceOrder(LabsOrder labsorder)
    {
        return StringHelper.isNotEmpty(mUserAuth.getAuthorizationCode()) || isRemembered() && (!labsorder.isPaymentTypeSavedCreditCard() || isOAuthTokenExist());
    }

    public boolean isAuthorizedUser()
    {
        return mUserAuth.getAuthorizationCode() != null || isRemembered();
    }

    public boolean isCardExpired(String s)
    {
        if (StringHelper.isEmpty(s))
        {
            LogUtil.d("UserProfileManager", "Card id empty", new Object[0]);
            return false;
        }
        if (mSavedPaymentList == null)
        {
            LogUtil.d("UserProfileManager", "Saved credit cards doesn't exists", new Object[0]);
            return false;
        }
        for (Iterator iterator = mSavedPaymentList.iterator(); iterator.hasNext();)
        {
            LabsPayment labspayment = (LabsPayment)iterator.next();
            if (StringHelper.equals(s, labspayment.getCardId()) && labspayment.isExpired())
            {
                LogUtil.d("UserProfileManager", "Card expired", new Object[0]);
                return true;
            }
        }

        return false;
    }

    public boolean isFirstTimeUser()
    {
        return mUserService.isFirstTime && getCurrentUser() == null && !isRemembered();
    }

    public boolean isHistoricalOrderPaymentValid(LabsOrder labsorder)
    {
        if (labsorder.getPaymentList().size() > 1)
        {
            return false;
        }
        for (labsorder = labsorder.getPaymentList().iterator(); labsorder.hasNext();)
        {
            LabsPayment labspayment = (LabsPayment)labsorder.next();
            if (StringHelper.equals(labspayment.getPaymentType(), "Cash"))
            {
                return true;
            }
            if (StringHelper.equals(labspayment.getPaymentType(), "CreditCardToken"))
            {
                return isCardExistOnProfile(labspayment.getCardId());
            }
        }

        return false;
    }

    public boolean isOAuthTokenExist()
    {
        return mUserAuth.isOAuthTokenExist();
    }

    public boolean isRemembered()
    {
        return getRememberMeCookie() != null;
    }

    public boolean isSavedAddressExists()
    {
        return getCurrentUser() != null && getCurrentUser().getAddressList().size() > 0;
    }

    public boolean isSessionTimedOut()
    {
        return mUserAuth.isSessionTimedOut(isRemembered());
    }

    public boolean isUserLoggedIn()
    {
        return mUserAuth.getAuthorizationCode() != null;
    }

    public boolean isUserWithOrderHistory()
    {
        return isAuthorizedUser() && getOrderHistoryList() != null && getOrderHistoryList().size() > 0;
    }

    public void loadAndWaitForOrderHistoryAndCards(String s)
    {
        final CountDownLatch asyncLatch = new CountDownLatch(2);
        fetchOrderHistory(new _cls9());
        getAllCards(s, new _cls10());
        try
        {
            LogUtil.d("UserProfileManager", "Waiting for user's history and cards...", new Object[0]);
            asyncLatch.await();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void loadRememberedUser()
    {
        final UserObject userObject = mPowerService.rememberedLogin();
        if (userObject != null)
        {
            saveNewCurrentUser(userObject);
            if (mLoyaltyManager.isLoyaltyAvailable())
            {
                mLoyaltyManager.getUserLoyaltyInformation(userObject, new _cls2());
            }
        }
    }

    public void login(String s, String s1, boolean flag, LoginCallback logincallback)
    {
        login(s, s1, flag, false, logincallback);
    }

    public void loginForFirstTime(String s, String s1, boolean flag, LoginCallback logincallback)
    {
        login(s, s1, flag, true, logincallback);
    }

    public void modifyAddress(int i, LabsAddress labsaddress, boolean flag, SaveAddressCallback saveaddresscallback)
    {
        saveAddress(i, labsaddress, flag, saveaddresscallback);
    }

    protected void onSessionSet()
    {
        mAnalyticsService = (AnalyticsService)getSession().getManager("analytics_manager");
        mLoyaltyManager = (LoyaltyManager)getSession().getManager("loyalty_manager");
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
    }

    public void optOutUserFromLoyalty(final com.dominos.android.sdk.core.loyalty.LoyaltyManager.OptOutCallback callback)
    {
        CustomerLoyalty customerloyalty = new CustomerLoyalty();
        customerloyalty.setCommand("OPTOUT");
        mCurrentUser.setCustomerLoyalty(customerloyalty);
        mPowerService.saveCustomer(mCurrentUser, new _cls13());
    }

    public void saveCardToProfile(AnonymousCreditCard anonymouscreditcard, final SaveCardCallback callback)
    {
        callback.onBegin();
        String s = getCurrentUser().getCustomerId();
        if (getAuthorizationCode() == null)
        {
            callback.onUserNotAuthorized();
            callback.onFinish();
            return;
        } else
        {
            mPowerService.addCard(s, anonymouscreditcard.toJsonString(), new _cls3());
            return;
        }
    }

    public void saveNewCurrentUser(UserObject userobject)
    {
        mCurrentUser = userobject;
    }

    public void saveNewCustomer(UserObject userobject, boolean flag, final SaveNewCustomerCallback saveNewCustomerCallback)
    {
        if (flag)
        {
            mLoyaltyManager.getCustomerLoyalty().setCommand("ENROLL");
        }
        userobject.setCustomerLoyalty(mLoyaltyManager.getCustomerLoyalty());
        mPowerService.saveCustomer(userobject, new _cls11());
    }

    public void setAuthorizationCode(String s, String s1)
    {
        mUserAuth.setAuthorizationCode(s, s1);
    }

    public void setHistoricalOrderResponse(String s)
    {
        historicalOrderResponse = s;
    }

    public void setNewSavedCardId(String s)
    {
        mNewSavedCardId = s;
    }

    public void setOrderHistoryList(ArrayList arraylist)
    {
        mOrderHistoryList = arraylist;
    }

    public void setSavedPaymentList(List list)
    {
        ArrayList arraylist = new ArrayList();
        LabsPayment labspayment;
        for (list = list.iterator(); list.hasNext(); arraylist.add(labspayment))
        {
            CreditCardToken creditcardtoken = (CreditCardToken)list.next();
            labspayment = new LabsPayment();
            labspayment.setCardId(creditcardtoken.getId());
            labspayment.setCardType(creditcardtoken.getCardType());
            labspayment.setExpirationMonth((new StringBuilder()).append(creditcardtoken.getExpirationMonth()).toString());
            labspayment.setExpirationYear((new StringBuilder()).append(creditcardtoken.getExpirationYear()).toString());
            labspayment.setLastFour(creditcardtoken.getLastFour());
            labspayment.setBillingZip(creditcardtoken.getBillingZip());
            labspayment.setDefault(creditcardtoken.isDefault());
            labspayment.setExpired(creditcardtoken.isExpired());
            labspayment.setNickName(creditcardtoken.getNickName());
        }

        mSavedPaymentList = arraylist;
    }

    public void startSessionTimer(Runnable runnable)
    {
        mUserAuth.startSessionTimer(runnable, isRemembered());
    }

    public void updateCreditCard(CreditCardToken creditcardtoken, final UpdateCreditCardCallback updateCreditCardCallback)
    {
        try
        {
            mPowerService.updateCard(mCurrentUser.getCustomerId(), creditcardtoken.getId(), creditcardtoken.toUpdateJson().toString(), new _cls5());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CreditCardToken creditcardtoken)
        {
            updateCreditCardCallback.onCreditCardSavingError(CreditCardErrorType.GENERAL_CREDIT_CARD_ERROR);
        }
    }

    public void updateLastAccessedTime()
    {
        mUserAuth.updateLastAccessedTime();
    }






    private class _cls12 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
    {

        final UserProfileManager this$0;
        final UpdateCustomerWithLoyaltyCallback val$updateCustomerWithLoyaltyCallback;

        public void onFinish()
        {
            super.onFinish();
            updateCustomerWithLoyaltyCallback.onFinish();
        }

        public void onLoyaltyFail()
        {
            updateCustomerWithLoyaltyCallback.onLoyaltyEnrollFail();
        }

        public void onLoyaltySuccess()
        {
            mLoyaltyManager.setNewLoyaltyMemberFlags();
            updateCustomerWithLoyaltyCallback.onCustomerUpdated();
        }

        _cls12()
        {
            this$0 = UserProfileManager.this;
            updateCustomerWithLoyaltyCallback = updatecustomerwithloyaltycallback;
            super();
        }
    }


    private class UpdateCustomerWithLoyaltyCallback extends BaseCallback
    {

        public abstract void onAuthorizationRequired();

        public abstract void onCustomerUpdateError();

        public abstract void onCustomerUpdated();

        public abstract void onLoyaltyEnrollFail();

        public UpdateCustomerWithLoyaltyCallback()
        {
        }
    }


    private class CreditCardErrorType extends Enum
    {

        private static final CreditCardErrorType $VALUES[];
        public static final CreditCardErrorType CARD_ON_FILE_LIMIT_EXCEEDED;
        public static final CreditCardErrorType DUPLICATE_NICKNAME;
        public static final CreditCardErrorType GENERAL_CREDIT_CARD_ERROR;
        public static final CreditCardErrorType GET_CARD_LIST_ERROR;

        public static CreditCardErrorType valueOf(String s)
        {
            return (CreditCardErrorType)Enum.valueOf(com/dominos/android/sdk/core/user/UserProfileManager$CreditCardErrorType, s);
        }

        public static CreditCardErrorType[] values()
        {
            return (CreditCardErrorType[])$VALUES.clone();
        }

        static 
        {
            DUPLICATE_NICKNAME = new CreditCardErrorType("DUPLICATE_NICKNAME", 0);
            GET_CARD_LIST_ERROR = new CreditCardErrorType("GET_CARD_LIST_ERROR", 1);
            CARD_ON_FILE_LIMIT_EXCEEDED = new CreditCardErrorType("CARD_ON_FILE_LIMIT_EXCEEDED", 2);
            GENERAL_CREDIT_CARD_ERROR = new CreditCardErrorType("GENERAL_CREDIT_CARD_ERROR", 3);
            $VALUES = (new CreditCardErrorType[] {
                DUPLICATE_NICKNAME, GET_CARD_LIST_ERROR, CARD_ON_FILE_LIMIT_EXCEEDED, GENERAL_CREDIT_CARD_ERROR
            });
        }

        private CreditCardErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    private class LoginCallback extends BaseCallback
    {

        public abstract void onLoginError();

        public abstract void onLoginFailed();

        public abstract void onLoginSuccessful();

        public LoginCallback()
        {
        }
    }


    private class _cls14 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final String val$email;
        final boolean val$fistTime;
        final LoginCallback val$loginCallback;
        final String val$password;

        public void onError(Exception exception, String s)
        {
            if (exception instanceof f)
            {
                int i = ((f)exception).getStatusCode().value();
                if ((i == 404 || i == 403 || i == 500) && loginCallback != null)
                {
                    loginCallback.onLoginFailed();
                }
            } else
            if (loginCallback != null)
            {
                loginCallback.onLoginError();
                return;
            }
        }

        public void onFinish()
        {
            super.onFinish();
            if (loginCallback != null)
            {
                loginCallback.onFinish();
            }
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(final String user)
        {
            user = UserObject.from(user);
            setAuthorizationCode(email, password);
            saveNewCurrentUser(user);
            if (mLoyaltyManager.isLoyaltyAvailable())
            {
                class _cls1 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
                {

                    final _cls14 this$1;
                    final UserObject val$user;

                    public void onLoyaltyFail()
                    {
                        handleLoginSuccess(user, loginCallback);
                    }

                    public void onLoyaltySuccess()
                    {
                        if (fistTime)
                        {
                            mLoyaltyManager.setNewLoyaltyMemberFlags();
                        }
                        handleLoginSuccess(user, loginCallback);
                    }

                _cls1()
                {
                    this$1 = _cls14.this;
                    user = userobject;
                    super();
                }
                }

                mLoyaltyManager.getUserLoyaltyInformation(mCurrentUser, new _cls1());
                return;
            } else
            {
                handleLoginSuccess(user, loginCallback);
                return;
            }
        }

        _cls14()
        {
            this$0 = UserProfileManager.this;
            loginCallback = logincallback;
            email = s;
            password = s1;
            fistTime = flag;
            super();
        }
    }


    private class SaveAddressCallback extends BaseCallback
    {

        public abstract void onAddressDuplicated();

        public abstract void onAddressSaveFailure();

        public abstract void onAddressSaved();

        public SaveAddressCallback()
        {
        }
    }


    private class _cls8 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final SaveAddressCallback val$callback;

        public void onError(Exception exception, String s)
        {
            boolean flag1 = false;
            exception = (new JSONObject(s)).optJSONArray("StatusItems");
            int i = 0;
_L2:
            boolean flag = flag1;
            if (i >= exception.length())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            if (!exception.optJSONObject(i).optString("Field").equalsIgnoreCase("LocationNameUsed"))
            {
                break MISSING_BLOCK_LABEL_82;
            }
            flag = true;
            if (flag)
            {
                try
                {
                    callback.onAddressDuplicated();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    callback.onAddressSaveFailure();
                }
                break MISSING_BLOCK_LABEL_81;
            }
            callback.onAddressSaveFailure();
            return;
            return;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = UserObject.from(s);
            saveNewCurrentUser(s);
            callback.onAddressSaved();
        }

        _cls8()
        {
            this$0 = UserProfileManager.this;
            callback = saveaddresscallback;
            super();
        }
    }


    private class DeleteAddressCallback extends BaseCallback
    {

        public abstract void onAddressDeleteFailure();

        public abstract void onAddressDeleted();

        public DeleteAddressCallback()
        {
        }
    }


    private class _cls1 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final DeleteAddressCallback val$callback;

        public void onError(Exception exception, String s)
        {
            callback.onAddressDeleteFailure();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = UserObject.from(s);
            saveNewCurrentUser(s);
            callback.onAddressDeleted();
        }

        _cls1()
        {
            this$0 = UserProfileManager.this;
            callback = deleteaddresscallback;
            super();
        }
    }


    private class _cls6 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final DeleteCreditCardCallback val$deleteCreditCardCallback;

        public void onError(Exception exception, String s)
        {
            LogUtil.e("UserProfileManager", s, new Object[0]);
            deleteCreditCardCallback.onCreditCardDeletingError();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            deleteCreditCardCallback.onCreditCardDeleted();
        }

        _cls6()
        {
            this$0 = UserProfileManager.this;
            deleteCreditCardCallback = deletecreditcardcallback;
            super();
        }
    }


    private class DeleteCreditCardCallback extends BaseCallback
    {

        public abstract void onCreditCardDeleted();

        public abstract void onCreditCardDeletingError();

        public DeleteCreditCardCallback()
        {
        }
    }


    private class _cls7 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final GetOrderHistoryCallback val$getOrderHistoryCallback;

        public void onBegin()
        {
            getOrderHistoryCallback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            getOrderHistoryCallback.onGetOrderHistoryError();
        }

        public void onFinish()
        {
            super.onFinish();
            mProductRemovedAlertOrderList.clear();
            getOrderHistoryCallback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            Object obj = (HistoricalOrderList)(new r()).a(com/dominos/android/sdk/core/models/LabsOrder, new OrderDeserializer()).a(com/dominos/android/sdk/core/models/LabsProductLine, new ProductLineDeserializer()).a(com/dominos/android/sdk/core/models/coupon/LabsCouponLine, new CouponLineDeserializer()).a(com/dominos/android/sdk/core/models/LabsAddress, new AddressDeserializer()).f().a(s, com/dominos/android/sdk/core/models/dto/HistoricalOrderList);
            obj = mOrderUtil.createOrderListFromHistoricalOrder(((HistoricalOrderList) (obj)));
            setHistoricalOrderResponse(s);
            setOrderHistoryList(((ArrayList) (obj)));
            getOrderHistoryCallback.onGetOrderHistorySuccess();
        }

        _cls7()
        {
            this$0 = UserProfileManager.this;
            getOrderHistoryCallback = getorderhistorycallback;
            super();
        }
    }


    private class _cls4 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final GetAllCreditCardsCallback val$getAllCreditCardsCallback;

        public void onBegin()
        {
            super.onBegin();
            getAllCreditCardsCallback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            getAllCreditCardsCallback.onGettingCreditCardsFailed();
        }

        public void onFinish()
        {
            super.onFinish();
            getAllCreditCardsCallback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            setSavedPaymentList(CreditCardToken.parseCreditCardList(s));
            getAllCreditCardsCallback.onGettingCreditCardsSuccess();
        }

        _cls4()
        {
            this$0 = UserProfileManager.this;
            getAllCreditCardsCallback = getallcreditcardscallback;
            super();
        }
    }


    private class _cls9 extends GetOrderHistoryCallback
    {
        private class GetOrderHistoryCallback extends BaseCallback
        {

            public abstract void onGetOrderHistoryError();

            public abstract void onGetOrderHistorySuccess();

            public GetOrderHistoryCallback()
            {
            }
        }


        final UserProfileManager this$0;
        final CountDownLatch val$asyncLatch;

        public void onFinish()
        {
            super.onFinish();
            asyncLatch.countDown();
        }

        public void onGetOrderHistoryError()
        {
        }

        public void onGetOrderHistorySuccess()
        {
        }

        _cls9()
        {
            this$0 = UserProfileManager.this;
            asyncLatch = countdownlatch;
            super();
        }
    }


    private class _cls10 extends GetAllCreditCardsCallback
    {
        private class GetAllCreditCardsCallback extends BaseCallback
        {

            public abstract void onGettingCreditCardsFailed();

            public abstract void onGettingCreditCardsSuccess();

            public GetAllCreditCardsCallback()
            {
            }
        }


        final UserProfileManager this$0;
        final CountDownLatch val$asyncLatch;

        public void onFinish()
        {
            super.onFinish();
            asyncLatch.countDown();
        }

        public void onGettingCreditCardsFailed()
        {
        }

        public void onGettingCreditCardsSuccess()
        {
        }

        _cls10()
        {
            this$0 = UserProfileManager.this;
            asyncLatch = countdownlatch;
            super();
        }
    }


    private class _cls2 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
    {

        final UserProfileManager this$0;
        final UserObject val$userObject;

        public void onLoyaltyFail()
        {
            loadAndWaitForOrderHistoryAndCards(userObject.getCustomerId());
            LogUtil.d("UserProfileManager", "Remembered user logged in.", new Object[0]);
        }

        public void onLoyaltySuccess()
        {
            loadAndWaitForOrderHistoryAndCards(userObject.getCustomerId());
            LogUtil.d("UserProfileManager", "Remembered user logged in.", new Object[0]);
        }

        _cls2()
        {
            this$0 = UserProfileManager.this;
            userObject = userobject;
            super();
        }
    }


    private class _cls13 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final com.dominos.android.sdk.core.loyalty.LoyaltyManager.OptOutCallback val$callback;

        public void onBegin()
        {
            super.onBegin();
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onLoyaltyOptOutFail();
        }

        public void onFinish()
        {
            super.onFinish();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = UserObject.from(s);
            if (mLoyaltyManager.isCustomerLoyaltyOptOutSuccess(s.getCustomerLoyalty()))
            {
                mLoyaltyManager.setCustomerLoyalty(s.getCustomerLoyalty());
                callback.onLoyaltyOptOutSuccess();
                return;
            } else
            {
                callback.onLoyaltyOptOutFail();
                return;
            }
        }

        _cls13()
        {
            this$0 = UserProfileManager.this;
            callback = optoutcallback;
            super();
        }
    }


    private class SaveCardCallback extends BaseCallback
    {

        public abstract void onCreditCardSaved(String s);

        public abstract void onCreditCardSavingError(CreditCardErrorType creditcarderrortype);

        public abstract void onUserNotAuthorized();

        public SaveCardCallback()
        {
        }
    }


    private class _cls3 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final SaveCardCallback val$callback;

        public void onBegin()
        {
            callback.onBegin();
        }

        public void onError(Exception exception, String s)
        {
            callback.onCreditCardSavingError(handleCreditCardError(s));
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
            s = CreditCardToken.parseCreditCardToken(s);
            callback.onCreditCardSaved(s.getId());
        }

        _cls3()
        {
            this$0 = UserProfileManager.this;
            callback = savecardcallback;
            super();
        }
    }


    private class _cls11 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final SaveNewCustomerCallback val$saveNewCustomerCallback;

        public void onError(Exception exception, String s)
        {
            if (s != null && s.contains("EmailAlreadyUsed"))
            {
                saveNewCustomerCallback.onEmailAlreadyUsedError();
                return;
            }
            int i = 0;
            if (exception instanceof f)
            {
                i = ((f)exception).getStatusCode().value();
            }
            if (i == 404 || i == 403 || i == 500 || i == 400)
            {
                saveNewCustomerCallback.onCredentialsError();
                return;
            } else
            {
                saveNewCustomerCallback.onCustomerSaveError();
                return;
            }
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            saveNewCustomerCallback.onCustomerSaved();
        }

        _cls11()
        {
            this$0 = UserProfileManager.this;
            saveNewCustomerCallback = savenewcustomercallback;
            super();
        }

        private class SaveNewCustomerCallback extends BaseCallback
        {

            public abstract void onCredentialsError();

            public abstract void onCustomerSaveError();

            public abstract void onCustomerSaved();

            public abstract void onEmailAlreadyUsedError();

            public SaveNewCustomerCallback()
            {
            }
        }

    }


    private class _cls5 extends PowerRestCallback
    {

        final UserProfileManager this$0;
        final UpdateCreditCardCallback val$updateCreditCardCallback;

        public void onError(Exception exception, String s)
        {
            LogUtil.e("UserProfileManager", s, new Object[0]);
            updateCreditCardCallback.onCreditCardSavingError(handleCreditCardError(s));
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            updateCreditCardCallback.onCreditCardSaved();
        }

        _cls5()
        {
            this$0 = UserProfileManager.this;
            updateCreditCardCallback = updatecreditcardcallback;
            super();
        }
    }


    private class UpdateCreditCardCallback extends BaseCallback
    {

        public abstract void onCreditCardSaved();

        public abstract void onCreditCardSavingError(CreditCardErrorType creditcarderrortype);

        public UpdateCreditCardCallback()
        {
        }
    }

}
