// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.fordsync.FordSyncSession_;
import com.dominos.fordsync.util.ProxyImageHandler_;
import com.dominos.handlers.LocationUpdateHandler_;
import com.dominos.loader.ApplicationLoader_;
import java.util.Vector;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager, ProxyListener_

public final class AppLinkManager_ extends AppLinkManager
{

    private static AppLinkManager_ instance_;
    private Context context_;
    private Handler handler_;

    private AppLinkManager_(Context context)
    {
        super(context);
        handler_ = new Handler(Looper.getMainLooper());
        context_ = context;
    }

    public static AppLinkManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new AppLinkManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mTelephonyManager = (TelephonyManager)context_.getSystemService("phone");
        mLocationUpdateHandler = LocationUpdateHandler_.getInstance_(context_);
        mApplicationLoader = ApplicationLoader_.getInstance_(context_);
        mProxyListener = ProxyListener_.getInstance_(context_);
        mFordSyncSession = FordSyncSession_.getInstance_(context_);
        mProxyImageHandler = ProxyImageHandler_.getInstance_(context_);
        onAfterInject();
    }

    public final void bgSpeak(Vector vector)
    {
        a.a(new _cls4(0, "speak", vector));
    }

    public final void handleInitialization(BluetoothAdapter bluetoothadapter)
    {
        a.a(new _cls2(0, "", bluetoothadapter));
    }

    public final void initialize()
    {
        handler_.post(new _cls1());
    }

    public final void setup(BaseCallback basecallback)
    {
        a.a(new _cls3(0, "", basecallback));
    }





    private class _cls4 extends org.androidannotations.api.c
    {

        final AppLinkManager_ this$0;
        final Vector val$chunks;

        public void execute()
        {
            try
            {
                bgSpeak(chunks);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls4(int i, String s1, Vector vector)
        {
            this$0 = AppLinkManager_.this;
            chunks = vector;
            super(final_s, i, s1);
        }
    }


    private class _cls2 extends org.androidannotations.api.c
    {

        final AppLinkManager_ this$0;
        final BluetoothAdapter val$mBtAdapter;

        public void execute()
        {
            try
            {
                handleInitialization(mBtAdapter);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(int i, String s1, BluetoothAdapter bluetoothadapter)
        {
            this$0 = AppLinkManager_.this;
            mBtAdapter = bluetoothadapter;
            super(final_s, i, s1);
        }
    }


    private class _cls1
        implements Runnable
    {

        final AppLinkManager_ this$0;

        public void run()
        {
            initialize();
        }

        _cls1()
        {
            this$0 = AppLinkManager_.this;
            super();
        }
    }


    private class _cls3 extends org.androidannotations.api.c
    {

        final AppLinkManager_ this$0;
        final BaseCallback val$setupCallback;

        public void execute()
        {
            try
            {
                setup(setupCallback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls3(int i, String s1, BaseCallback basecallback)
        {
            this$0 = AppLinkManager_.this;
            setupCallback = basecallback;
            super(final_s, i, s1);
        }
    }

}
