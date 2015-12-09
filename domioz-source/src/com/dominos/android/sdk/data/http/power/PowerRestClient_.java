// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.user.UserService_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestClient, PowerHeaderInterceptor_, PowerRestCallbackHandler_, PowerRestInterface_, 
//            PowerRestCallback

public final class PowerRestClient_ extends PowerRestClient
{

    private Context context_;

    private PowerRestClient_(Context context)
    {
        context_ = context;
        init_();
    }

    public static PowerRestClient_ getInstance_(Context context)
    {
        return new PowerRestClient_(context);
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        userAuth = UserAuthorization_.getInstance_(context_);
        user = UserService_.getInstance_(context_);
        appService = ApplicationService_.getInstance_(context_);
        mOrderUtil = OrderUtil_.getInstance_(context_);
        headerInterceptor = PowerHeaderInterceptor_.getInstance_(context_);
        callbackHandler = PowerRestCallbackHandler_.getInstance_(context_);
        mConfigProvider = ConfigProvider_.getInstance_(context_);
        powerRestInterface = new PowerRestInterface_(context_);
        setupService();
    }

    public final void addCard(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls3(s, s1, powerrestcallback));
    }

    public final void changePassword(String s, String s1, String s2, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls16(s1, s2, powerrestcallback));
    }

    public final void deleteCard(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls8(s, s1, powerrestcallback));
    }

    public final void doEmailOptIn(String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls21("", s, powerrestcallback));
    }

    public final void getBuildings(int i, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls2("", i, powerrestcallback));
    }

    public final void getMenu(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls17(s, s1, powerrestcallback));
    }

    public final void getOAuthToken(String s, String s1)
    {
        a.a(new _cls13("", s, s1));
    }

    public final void getRegions(PowerRestCallback powerrestcallback)
    {
        a.a(new _cls5(0, "", powerrestcallback));
    }

    public final void getSites(String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls10("", s, powerrestcallback));
    }

    public final void getStoreProfile(String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls15("", s, powerrestcallback));
    }

    public final void getStores(int i, String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls7(i, s, powerrestcallback));
    }

    public final void giftCardBalanceInquiry(GiftCard giftcard, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls1("", giftcard, powerrestcallback));
    }

    public final void locateStores(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls18(s, s1, powerrestcallback));
    }

    public final void placeOrder(LabsOrder labsorder, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls9("", labsorder, powerrestcallback));
    }

    public final void priceOrder(LabsOrder labsorder, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls6("", labsorder, powerrestcallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void rememberedLogin(PowerRestCallback powerrestcallback)
    {
        a.a(new _cls4(0, "", powerrestcallback));
    }

    public final void resetPassword(String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls11("", s, powerrestcallback));
    }

    public final void saveCustomer(UserObject userobject, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls20("", userobject, powerrestcallback));
    }

    public final void trackOrder(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls12(s, s1, powerrestcallback));
    }

    public final void trackOrderByPhone(String s, String s1, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls19(s, s1, powerrestcallback));
    }

    public final void updateCard(String s, String s1, String s2, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls14(s1, s2, powerrestcallback));
    }






















    private class _cls3 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$cardJson;
        final String val$customerId;

        public void execute()
        {
            try
            {
                addCard(customerId, cardJson, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls3(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            customerId = s2;
            cardJson = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls16 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$email;
        final String val$newPassword;
        final String val$oldPassword;

        public void execute()
        {
            try
            {
                changePassword(email, oldPassword, newPassword, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls16(String s3, String s4, 
                PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            email = s2;
            oldPassword = s3;
            newPassword = s4;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls8 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$cardId;
        final String val$customerId;

        public void execute()
        {
            try
            {
                deleteCard(customerId, cardId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls8(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            customerId = s2;
            cardId = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls21 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$request;

        public void execute()
        {
            try
            {
                doEmailOptIn(request, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls21(String s1, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            request = s2;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls2 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final int val$siteId;

        public void execute()
        {
            try
            {
                getBuildings(siteId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s1, int j, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            siteId = j;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls17 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$lang;
        final String val$storeId;

        public void execute()
        {
            try
            {
                getMenu(storeId, lang, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls17(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            storeId = s2;
            lang = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls13 extends c
    {

        final PowerRestClient_ this$0;
        final String val$password;
        final String val$username;

        public void execute()
        {
            try
            {
                getOAuthToken(username, password);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls13(String s1, String s2, String s3)
        {
            this$0 = PowerRestClient_.this;
            username = s2;
            password = s3;
            super(final_s, final_i, s1);
        }
    }


    private class _cls5 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;

        public void execute()
        {
            try
            {
                getRegions(callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls5(int i, String s1, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            callback = powerrestcallback;
            super(final_s, i, s1);
        }
    }


    private class _cls10 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$regionCode;

        public void execute()
        {
            try
            {
                getSites(regionCode, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls10(String s1, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            regionCode = s2;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls15 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$storeId;

        public void execute()
        {
            try
            {
                getStoreProfile(storeId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls15(String s1, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            storeId = s2;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls7 extends c
    {

        final PowerRestClient_ this$0;
        final int val$buildingId;
        final PowerRestCallback val$callback;
        final String val$unitNumber;

        public void execute()
        {
            try
            {
                getStores(buildingId, unitNumber, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls7(int j, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            buildingId = j;
            unitNumber = s2;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls1 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final GiftCard val$giftCard;

        public void execute()
        {
            try
            {
                giftCardBalanceInquiry(giftCard, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, GiftCard giftcard, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            giftCard = giftcard;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls18 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$cityRegion;
        final String val$street;

        public void execute()
        {
            try
            {
                locateStores(street, cityRegion, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls18(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            street = s2;
            cityRegion = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls9 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                placeOrder(order, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls9(String s1, LabsOrder labsorder, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            order = labsorder;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls6 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                priceOrder(order, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls6(String s1, LabsOrder labsorder, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            order = labsorder;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls4 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;

        public void execute()
        {
            try
            {
                rememberedLogin(callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls4(int i, String s1, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            callback = powerrestcallback;
            super(final_s, i, s1);
        }
    }


    private class _cls11 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$email;

        public void execute()
        {
            try
            {
                resetPassword(email, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls11(String s1, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            email = s2;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls20 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final UserObject val$user;

        public void execute()
        {
            try
            {
                saveCustomer(user, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls20(String s1, UserObject userobject, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            user = userobject;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls12 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$orderKey;
        final String val$storeId;

        public void execute()
        {
            try
            {
                trackOrder(storeId, orderKey, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls12(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            storeId = s2;
            orderKey = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls19 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$extension;
        final String val$phone;

        public void execute()
        {
            try
            {
                trackOrderByPhone(phone, extension, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls19(String s2, String s3, PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            phone = s2;
            extension = s3;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls14 extends c
    {

        final PowerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$cardId;
        final String val$cardJson;
        final String val$customerId;

        public void execute()
        {
            try
            {
                updateCard(customerId, cardId, cardJson, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls14(String s3, String s4, 
                PowerRestCallback powerrestcallback)
        {
            this$0 = PowerRestClient_.this;
            customerId = s2;
            cardId = s3;
            cardJson = s4;
            callback = powerrestcallback;
            super(final_s, final_i, final_s1);
        }
    }

}
