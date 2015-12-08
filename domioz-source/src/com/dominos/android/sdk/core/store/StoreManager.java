// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.google.a.b.ar;
import java.util.Locale;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            MenuManager, StoreAPI

public class StoreManager extends Manager
{

    private static final String TAG = com/dominos/android/sdk/core/store/StoreManager.getSimpleName();
    private MenuManager mMenuManager;
    PowerRestClient mPowerRestClient;
    StoreAPI mStoreAPI;
    private StoreProfile mStoreProfile;
    private ar mStores;

    public StoreManager()
    {
        mStoreProfile = StoreProfile.EMPTY;
    }

    public void clearStores()
    {
        mStores = null;
    }

    public String getName()
    {
        return "store_manager";
    }

    public StoreProfile getStoreProfile()
    {
        return mStoreProfile;
    }

    public ar getStores()
    {
        return mStores;
    }

    public boolean isStoreALoyaltyStore()
    {
        return LoyaltyUtil.isStoreALoyaltyStore(mStoreProfile);
    }

    public boolean isStoreOnline()
    {
        return mStoreProfile.isOpen() && mStoreProfile.isOnline();
    }

    public void loadStore(final String storeId, final LoadStoreCallback callback)
    {
        LogUtil.d(TAG, "Fetching store profile..", new Object[0]);
        callback.onBegin();
        mPowerRestClient.getStoreProfile(storeId, new _cls1());
    }

    public void loadStoreMenu(String s, final LoadStoreMenuCallback callback)
    {
        String s1 = Locale.getDefault().getLanguage();
        LogUtil.d(TAG, "Loading store menu...", new Object[0]);
        callback.onBegin();
        mPowerRestClient.getMenu(s, s1, new _cls2());
    }

    protected void onSessionSet()
    {
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
    }

    public void setStoreProfile(StoreProfile storeprofile)
    {
        mStoreProfile = storeprofile;
    }

    public void setStores(ar ar)
    {
        mStores = ar;
    }




    private class LoadStoreCallback extends BaseCallback
    {

        public abstract void onStoreClosed(StoreProfile storeprofile);

        public abstract void onStoreLoadError(RequestErrorCode requesterrorcode);

        public abstract void onStoreLoaded(StoreProfile storeprofile);

        public abstract void onStoreOffline(StoreProfile storeprofile);

        public LoadStoreCallback()
        {
        }
    }


    private class _cls1 extends PowerRestCallback
    {

        final StoreManager this$0;
        final LoadStoreCallback val$callback;
        final String val$storeId;

        public void onError(Exception exception, String s)
        {
            LogUtil.d(StoreManager.TAG, "Get store profile request error", new Object[0]);
            callback.onStoreLoadError(RequestErrorCode.STORE_PROFILE_REQUEST_FAILURE);
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(final String storeProfile)
        {
            LogUtil.d(StoreManager.TAG, "Fetching store profile success!", new Object[0]);
            storeProfile = StoreProfile.from(storeProfile);
            if (!storeProfile.isOpen())
            {
                LogUtil.d(StoreManager.TAG, "Store currently closed.", new Object[0]);
                callback.onStoreClosed(storeProfile);
                callback.onFinish();
                return;
            }
            if (!storeProfile.isOnline())
            {
                LogUtil.d(StoreManager.TAG, "Store currently offline.", new Object[0]);
                callback.onStoreOffline(storeProfile);
                callback.onFinish();
                return;
            }
            if (!mMenuManager.isMenuLoaded() || !StringHelper.equals(mMenuManager.getStoreId(), storeId))
            {
                LogUtil.d(StoreManager.TAG, "Menu not loaded , fetching menu..", new Object[0]);
                class _cls1 extends LoadStoreMenuCallback
                {

                    final _cls1 this$1;
                    final StoreProfile val$storeProfile;

                    public void onFinish()
                    {
                        callback.onFinish();
                    }

                    public void onLoadMenuFailed()
                    {
                        callback.onStoreLoadError(RequestErrorCode.MENU_REQUEST_FAILURE);
                    }

                    public void onMenuLoaded(FoodMenu foodmenu)
                    {
                        callback.onStoreLoaded(storeProfile);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    storeProfile = storeprofile;
                    super();
                }
                }

                loadStoreMenu(storeId, new _cls1());
                return;
            } else
            {
                callback.onStoreLoaded(storeProfile);
                callback.onFinish();
                return;
            }
        }

        _cls1()
        {
            this$0 = StoreManager.this;
            callback = loadstorecallback;
            storeId = s;
            super();
        }
    }


    private class LoadStoreMenuCallback extends BaseCallback
    {

        public abstract void onLoadMenuFailed();

        public abstract void onMenuLoaded(FoodMenu foodmenu);

        public LoadStoreMenuCallback()
        {
        }
    }


    private class _cls2 extends PowerRestCallback
    {

        final StoreManager this$0;
        final LoadStoreMenuCallback val$callback;

        public void onError(Exception exception, String s)
        {
            LogUtil.d(StoreManager.TAG, "Failed to fetch store menu", new Object[0]);
            callback.onLoadMenuFailed();
            callback.onFinish();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            FoodMenu foodmenu = ModelsParse.fromFoodMenu(s);
            if (StringHelper.isEmpty(s) || foodmenu == null)
            {
                LogUtil.d(StoreManager.TAG, "Failed to fetch store menu. Response empty", new Object[0]);
                callback.onLoadMenuFailed();
                callback.onFinish();
                return;
            } else
            {
                LogUtil.d(StoreManager.TAG, "Menu loaded successfully.", new Object[0]);
                mMenuManager.setMenu(foodmenu);
                callback.onMenuLoaded(foodmenu);
                callback.onFinish();
                return;
            }
        }

        _cls2()
        {
            this$0 = StoreManager.this;
            callback = loadstoremenucallback;
            super();
        }
    }

}
