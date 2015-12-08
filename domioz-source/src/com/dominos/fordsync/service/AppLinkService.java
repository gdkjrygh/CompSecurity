// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

public class AppLinkService extends Service
{

    private static final int CONNECTION_TIMEOUT = 60000;
    protected static final String LOG_TAG = "FORDSYNC_AppLinkManager";
    private static final int STOP_SERVICE_DELAY = 5000;
    AppLinkManager mAppLinkManager;
    private Runnable mCheckConnectionRunnable;
    private Handler mConnectionHandler;
    private Runnable mStopServiceRunnable;

    public AppLinkService()
    {
        mConnectionHandler = new Handler();
        mCheckConnectionRunnable = new _cls1();
        mStopServiceRunnable = new _cls2();
    }

    private void initializeService()
    {
        mConnectionHandler.removeCallbacks(mStopServiceRunnable);
        mAppLinkManager.initialize();
        mConnectionHandler.removeCallbacks(mCheckConnectionRunnable);
        mConnectionHandler.postDelayed(mCheckConnectionRunnable, 60000L);
    }

    private void postDelayedStopServiceRequest()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "Delayed stopping service requested.", new Object[0]);
        mConnectionHandler.removeCallbacks(mStopServiceRunnable);
        mConnectionHandler.postDelayed(mStopServiceRunnable, 5000L);
    }

    private void stopAndClearService()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "Service stopped.", new Object[0]);
        mConnectionHandler.removeCallbacks(mCheckConnectionRunnable);
        mConnectionHandler.removeCallbacks(mStopServiceRunnable);
        stopSelf();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        LogUtil.d("FORDSYNC_AppLinkManager", "onCreate()", new Object[0]);
    }

    public void onDestroy()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "onDestroy()", new Object[0]);
        mAppLinkManager.deinitialize();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "onStartCommand()", new Object[0]);
        if (intent == null) goto _L2; else goto _L1
_L1:
        if (!StringHelper.equals(intent.getAction(), "intent.action.FORDSYNC_STOP_SERVICE")) goto _L4; else goto _L3
_L3:
        postDelayedStopServiceRequest();
_L6:
        return 1;
_L4:
        if (StringHelper.equals(intent.getAction(), "intent.action.FORDSYNC_REMOVE_CONNECTION_CHECK"))
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Removed connection check.", new Object[0]);
            if (mCheckConnectionRunnable != null)
            {
                mConnectionHandler.removeCallbacks(mCheckConnectionRunnable);
            }
        } else
        {
            initializeService();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        initializeService();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onTaskRemoved(Intent intent)
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "onTaskRemoved()", new Object[0]);
        mAppLinkManager.deinitialize();
        super.onTaskRemoved(intent);
    }


    private class _cls1
        implements Runnable
    {

        final AppLinkService this$0;

        public void run()
        {
            Boolean boolean1 = Boolean.valueOf(true);
            if (mAppLinkManager.isProxyConnected())
            {
                boolean1 = Boolean.valueOf(false);
            }
            if (boolean1.booleanValue())
            {
                LogUtil.d("FORDSYNC_AppLinkManager", "Proxy created but connection not established, service stop requested.", new Object[0]);
                stopAndClearService();
                return;
            } else
            {
                LogUtil.d("FORDSYNC_AppLinkManager", "Proxy is connected, keep running.", new Object[0]);
                return;
            }
        }

        _cls1()
        {
            this$0 = AppLinkService.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final AppLinkService this$0;

        public void run()
        {
            if (!mAppLinkManager.isProxyConnected())
            {
                mAppLinkManager.deinitialize();
                stopAndClearService();
            }
        }

        _cls2()
        {
            this$0 = AppLinkService.this;
            super();
        }
    }

}
