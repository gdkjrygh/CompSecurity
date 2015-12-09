// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.android.sdk.data.http.power.PowerRestCallbackHandler_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.data.http.shoprunner:
//            ShopRunnerRestClient, ShopRunnerRestInterface_

public final class ShopRunnerRestClient_ extends ShopRunnerRestClient
{

    private Context context_;

    private ShopRunnerRestClient_(Context context)
    {
        context_ = context;
        init_();
    }

    public static ShopRunnerRestClient_ getInstance_(Context context)
    {
        return new ShopRunnerRestClient_(context);
    }

    private void init_()
    {
        mCallbackHandler = PowerRestCallbackHandler_.getInstance_(context_);
        mSrClient = new ShopRunnerRestInterface_(context_);
        setupService();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void validateToken(String s, PowerRestCallback powerrestcallback)
    {
        a.a(new _cls1("", s, powerrestcallback));
    }


    private class _cls1 extends c
    {

        final ShopRunnerRestClient_ this$0;
        final PowerRestCallback val$callback;
        final String val$token;

        public void execute()
        {
            try
            {
                validateToken(token, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, String s2, PowerRestCallback powerrestcallback)
        {
            this$0 = ShopRunnerRestClient_.this;
            token = s2;
            callback = powerrestcallback;
            super(final_s, final_i, s1);
        }
    }

}
