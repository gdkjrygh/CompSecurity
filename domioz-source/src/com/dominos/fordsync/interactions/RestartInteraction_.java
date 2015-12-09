// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.Context;
import com.dominos.App_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.fordsync.FordSyncSession_;
import com.dominos.fordsync.service.AppLinkManager_;
import com.dominos.fordsync.service.SyncPowerAPI_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.fordsync.interactions:
//            RestartInteraction, ErrorHandler

public final class RestartInteraction_ extends RestartInteraction
{

    private Context context_;

    private RestartInteraction_(Context context)
    {
        context_ = context;
        init_();
    }

    public static RestartInteraction_ getInstance_(Context context)
    {
        return new RestartInteraction_(context);
    }

    private void init_()
    {
        app = App_.getInstance();
        mOrderUtil = OrderUtil_.getInstance_(context_);
        mFordSyncSession = FordSyncSession_.getInstance_(context_);
        restApi = SyncPowerAPI_.getInstance_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mAppLinkManager = AppLinkManager_.getInstance_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        setup();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void start()
    {
        a.a(new _cls1("", 0, "interaction"));
    }


    private class _cls1 extends c
    {

        final RestartInteraction_ this$0;

        public void execute()
        {
            try
            {
                start();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s, int i, String s1)
        {
            this$0 = RestartInteraction_.this;
            super(s, i, s1);
        }
    }

}
