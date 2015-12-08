// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import android.content.Context;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.loader.ApplicationLoader_;
import com.dominos.remote.client.RemoteOrderClient;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

public final class RemoteOrderManager_ extends RemoteOrderManager
{

    private Context context_;

    private RemoteOrderManager_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static RemoteOrderManager_ getInstance_(Context context)
    {
        return new RemoteOrderManager_(context);
    }

    private void init_()
    {
        mUserAuth = UserAuthorization_.getInstance_(context_);
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
        mOrderUtil = OrderUtil_.getInstance_(context_);
        mConnectionUtil = ConnectionUtil_.getInstance_(context_);
        mApplicationLoader = ApplicationLoader_.getInstance_(context_);
    }

    public final void getHistoricalOrders(RemoteOrderClient remoteorderclient)
    {
        a.a(new _cls1(0, "", remoteorderclient));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final RemoteOrderManager_ this$0;
        final RemoteOrderClient val$client;

        public void execute()
        {
            try
            {
                getHistoricalOrders(client);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(int i, String s1, RemoteOrderClient remoteorderclient)
        {
            this$0 = RemoteOrderManager_.this;
            client = remoteorderclient;
            super(final_s, i, s1);
        }
    }

}
