// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            StoreManager, StoreAPI_

public final class StoreManager_ extends StoreManager
{

    private Context context_;

    private StoreManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static StoreManager_ getInstance_(Context context)
    {
        return new StoreManager_(context);
    }

    private void init_()
    {
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
        mStoreAPI = StoreAPI_.getInstance_(context_);
    }

    public final void loadStore(String s, StoreManager.LoadStoreCallback loadstorecallback)
    {
        a.a(new _cls2("", s, loadstorecallback));
    }

    public final void loadStoreMenu(String s, StoreManager.LoadStoreMenuCallback loadstoremenucallback)
    {
        a.a(new _cls1("", s, loadstoremenucallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }



    private class _cls2 extends c
    {

        final StoreManager_ this$0;
        final StoreManager.LoadStoreCallback val$callback;
        final String val$storeId;

        public void execute()
        {
            try
            {
                loadStore(storeId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s1, String s2, StoreManager.LoadStoreCallback loadstorecallback)
        {
            this$0 = StoreManager_.this;
            storeId = s2;
            callback = loadstorecallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls1 extends c
    {

        final StoreManager_ this$0;
        final StoreManager.LoadStoreMenuCallback val$callback;
        final String val$storeId;

        public void execute()
        {
            try
            {
                loadStoreMenu(storeId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, String s2, StoreManager.LoadStoreMenuCallback loadstoremenucallback)
        {
            this$0 = StoreManager_.this;
            storeId = s2;
            callback = loadstoremenucallback;
            super(final_s, final_i, s1);
        }
    }

}
