// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.Context;
import com.dominos.App_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.fordsync.FordSyncSession_;

// Referenced classes of package com.dominos.fordsync.service:
//            SyncPowerAPI, AppLinkManager_

public final class SyncPowerAPI_ extends SyncPowerAPI
{

    private Context context_;

    private SyncPowerAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static SyncPowerAPI_ getInstance_(Context context)
    {
        return new SyncPowerAPI_(context);
    }

    private void init_()
    {
        app = App_.getInstance();
        mOrderUtil = OrderUtil_.getInstance_(context_);
        powerService = PowerRestClient_.getInstance_(context_);
        mAppLinkManager = AppLinkManager_.getInstance_(context_);
        userAuth = UserAuthorization_.getInstance_(context_);
        mFordSyncSession = FordSyncSession_.getInstance_(context_);
        onAfterInject();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
