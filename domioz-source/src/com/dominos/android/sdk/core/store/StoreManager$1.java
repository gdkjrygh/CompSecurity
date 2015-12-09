// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            StoreManager, MenuManager

class allback extends PowerRestCallback
{

    final StoreManager this$0;
    final adStoreCallback val$callback;
    final String val$storeId;

    public void onError(Exception exception, String s)
    {
        LogUtil.d(StoreManager.access$000(), "Get store profile request error", new Object[0]);
        val$callback.onStoreLoadError(RequestErrorCode.STORE_PROFILE_REQUEST_FAILURE);
        val$callback.onFinish();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(final String storeProfile)
    {
        LogUtil.d(StoreManager.access$000(), "Fetching store profile success!", new Object[0]);
        storeProfile = StoreProfile.from(storeProfile);
        if (!storeProfile.isOpen())
        {
            LogUtil.d(StoreManager.access$000(), "Store currently closed.", new Object[0]);
            val$callback.onStoreClosed(storeProfile);
            val$callback.onFinish();
            return;
        }
        if (!storeProfile.isOnline())
        {
            LogUtil.d(StoreManager.access$000(), "Store currently offline.", new Object[0]);
            val$callback.onStoreOffline(storeProfile);
            val$callback.onFinish();
            return;
        }
        if (!StoreManager.access$100(StoreManager.this).isMenuLoaded() || !StringHelper.equals(StoreManager.access$100(StoreManager.this).getStoreId(), val$storeId))
        {
            LogUtil.d(StoreManager.access$000(), "Menu not loaded , fetching menu..", new Object[0]);
            class _cls1 extends StoreManager.LoadStoreMenuCallback
            {

                final StoreManager._cls1 this$1;
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
                this$1 = StoreManager._cls1.this;
                storeProfile = storeprofile;
                super();
            }
            }

            loadStoreMenu(val$storeId, new _cls1());
            return;
        } else
        {
            val$callback.onStoreLoaded(storeProfile);
            val$callback.onFinish();
            return;
        }
    }

    adStoreCallback()
    {
        this$0 = final_storemanager;
        val$callback = adstorecallback;
        val$storeId = String.this;
        super();
    }
}
