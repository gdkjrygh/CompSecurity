// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import com.baidu.android.pushservice.util.f;
import com.baidu.frontia.a.b.a.a;

// Referenced classes of package com.baidu.android.pushservice:
//            w, x, a, PushSettings, 
//            SDcardRemovedReceiver, PushSDK

public class PushService extends Service
{

    public static final String ACTION_START = "com.baidu.pushservice.action.START";
    public static final String ACTION_STOP = "com.baidu.pushservice.action.STOP";
    public static final int FLAG_INCLUDE_STOPPED_PACKAGES = 32;
    public static final int SERVICE_STOPPED_DELAY = 1000;
    private static final String TAG = "PushService";
    private int bindCnt;
    private boolean initSuc;
    private final com.baidu.android.pushservice.b.a.a mBinder = new x(this);
    private Runnable mDestroyRunnable;
    private boolean mExitOnDestroy;
    private Handler mHandler;
    private SDcardRemovedReceiver sdcardRemovedReceiver;

    public PushService()
    {
        mExitOnDestroy = false;
        mHandler = new Handler();
        initSuc = false;
        mDestroyRunnable = new w(this);
        bindCnt = 0;
    }

    private void stopSelf(boolean flag, boolean flag1)
    {
        mExitOnDestroy = flag;
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("stopSelf : exitOnDestroy=")).append(flag).append(" --- immediate=").append(flag1).toString());
        }
        if (flag1)
        {
            mDestroyRunnable.run();
            return;
        } else
        {
            mHandler.removeCallbacks(mDestroyRunnable);
            mHandler.postDelayed(mDestroyRunnable, 1000L);
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        bindCnt = bindCnt + 1;
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("onBind(")).append(bindCnt).append("), intent=").append(intent).append(" cur: ").append(getApplicationContext().getPackageName()).append(" initSuc: ").append(initSuc).toString());
        }
        if (initSuc)
        {
            return mBinder;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        com.baidu.android.pushservice.PushSettings.a(getApplicationContext());
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("onCreate from : ")).append(getPackageName()).toString());
        }
        if (a.d > 0 && a.d <= 5)
        {
            f.a((new StringBuilder("PushService onCreate from : ")).append(getPackageName()).append(" at Time :").append(System.currentTimeMillis()).toString(), getApplicationContext());
        }
        try
        {
            sdcardRemovedReceiver = new SDcardRemovedReceiver();
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentfilter.addAction("android.intent.action.MEDIA_REMOVED");
            registerReceiver(sdcardRemovedReceiver, intentfilter);
        }
        catch (Exception exception)
        {
            a.b("TAG", "sdcard receiver register failed");
        }
        initSuc = PushSDK.getInstance(this).initPushSDK();
        if (!initSuc)
        {
            stopSelf(true, true);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("onDestroy from : ")).append(getPackageName()).toString());
        }
        if (a.d > 0 && a.d <= 5)
        {
            f.a((new StringBuilder("PushService onDestroy from : ")).append(getPackageName()).append(" at Time :").append(System.currentTimeMillis()).toString(), getApplicationContext());
        }
        try
        {
            unregisterReceiver(sdcardRemovedReceiver);
        }
        catch (Exception exception)
        {
            a.b("TAG", "sdcard receiver unregister failed");
        }
        PushSDK.destroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        i = 1;
        Intent intent1 = intent;
        if (intent == null)
        {
            intent = new Intent();
            intent1 = intent;
            if (a.b())
            {
                a.a("PushService", "--- onStart by null intent!");
                intent1 = intent;
            }
        }
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("-- onStartCommand -- ")).append(intent1).append(intent1.toURI()).toString());
        }
        mHandler.removeCallbacks(mDestroyRunnable);
        initSuc = PushSDK.getInstance(this).handleOnStart(intent1);
        if (!initSuc)
        {
            stopSelf(true, true);
            i = 2;
        }
        return i;
    }

    public boolean onUnbind(Intent intent)
    {
        bindCnt = bindCnt - 1;
        if (a.b())
        {
            a.b("PushService", (new StringBuilder("onUnbind(")).append(bindCnt).append("), intent=").append(intent).toString());
        }
        return super.onUnbind(intent);
    }

}
