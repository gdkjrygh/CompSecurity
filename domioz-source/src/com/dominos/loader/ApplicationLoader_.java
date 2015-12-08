// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.loader;

import android.content.Context;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.common.DeviceCapabilities_;
import com.dominos.android.sdk.common.GoogleWalletUtil_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.utils.ApplicationVersionUtil_;
import com.dominos.wear.manager.WearManager_;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.loader:
//            ApplicationLoader

public final class ApplicationLoader_ extends ApplicationLoader
{

    private static ApplicationLoader_ instance_;
    private Context context_;

    private ApplicationLoader_(Context context)
    {
        context_ = context;
    }

    public static ApplicationLoader_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ApplicationLoader_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPrefs = new DominosPrefs_(context_);
        mConfigProvider = ConfigProvider_.getInstance_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mSpeechManager = SpeechManager_.getInstance_(context_);
        mGoogleWalletUtil = GoogleWalletUtil_.getInstance_(context_);
        mFacebookAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(context_);
        mWearManager = WearManager_.getInstance_(context_);
        mDeviceCapabilities = DeviceCapabilities_.getInstance_(context_);
        mApplicationVersionUtil = ApplicationVersionUtil_.getInstance_(context_);
        mContext = context_;
    }

    public final void setupAsync(Session session, ApplicationLoader.SetupLoadCallback setuploadcallback)
    {
        a.a(new _cls1("", session, setuploadcallback));
    }


    private class _cls1 extends org.androidannotations.api.c
    {

        final ApplicationLoader_ this$0;
        final ApplicationLoader.SetupLoadCallback val$callback;
        final Session val$session;

        public void execute()
        {
            try
            {
                setupAsync(session, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, Session session1, ApplicationLoader.SetupLoadCallback setuploadcallback)
        {
            this$0 = ApplicationLoader_.this;
            session = session1;
            callback = setuploadcallback;
            super(final_s, final_i, s1);
        }
    }

}
