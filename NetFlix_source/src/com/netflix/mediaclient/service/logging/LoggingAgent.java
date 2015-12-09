// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.UserInputManager;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.logging.ads.AdvertiserIdLoggingManager;
import com.netflix.mediaclient.service.logging.breadcrumb.CrittercismBreadcrumbLoggingImpl;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.error.CrittercismErrorLoggingImpl;
import com.netflix.mediaclient.servicemgr.AdvertiserIdLogging;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.BreadcrumbLogging;
import com.netflix.mediaclient.servicemgr.CmpEventLogging;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.PresentationTracking;
import com.netflix.mediaclient.servicemgr.UserActionLogging;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UIViewLoggingImpl, LegacyCustomerEventLoggingImpl, LegacyCmpEventLoggingImpl, IntegratedClientLoggingManager, 
//            PresentationTrackingManager

public final class LoggingAgent extends ServiceAgent
    implements IClientLogging
{

    private static final long EVENT_POST_TIMEOUT_MS = 60000L;
    static final String ICL_REPOSITORY_DIR = "iclevents";
    static final int NEXT_DELIVERY_ATTEMPT_TIMEOUT_IN_MS = 60000;
    static final String PT_REPOSITORY_DIR = "ptevents";
    private static final String TAG = "nf_log";
    private static final ThreadFactory sThreadFactory = new ThreadFactory() {

        private final AtomicInteger mCount = new AtomicInteger(1);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("LoggingAgent #").append(mCount.getAndIncrement()).toString());
        }

    };
    private AdvertiserIdLoggingManager mAdvertiserIdLoggingManager;
    private BreadcrumbLogging mBreadcrumbLogging;
    private CmpEventLogging mCmpEventLogging;
    private CustomerEventLogging mCustomerEventLogging;
    private ErrorLogging mErrorLogging;
    private Runnable mEventPostCheck;
    private ScheduledExecutorService mExecutor;
    private AtomicInteger mFailureCounter;
    private IntegratedClientLoggingManager mIntegratedClientLoggingManager;
    private final BroadcastReceiver mLoggerReceiver = new BroadcastReceiver() {

        final LoggingAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable("nf_log", 2))
            {
                Log.v("nf_log", (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            mIntegratedClientLoggingManager.handleIntent(intent);
        }

            
            {
                this$0 = LoggingAgent.this;
                super();
            }
    };
    private PresentationTrackingManager mPresentationTrackingManager;
    private long mStartedTime;
    private final Handler mWorkerHandler;
    private HandlerThread mWorkerThread;

    public LoggingAgent()
    {
        mStartedTime = System.currentTimeMillis();
        mFailureCounter = new AtomicInteger();
        mEventPostCheck = new Runnable() {

            final LoggingAgent this$0;

            public void run()
            {
                Log.d("nf_log", "Running state check...");
                mIntegratedClientLoggingManager.checkState();
                mPresentationTrackingManager.checkState();
                getApplication().getUserInput().checkState();
                Log.d("nf_log", "Running state check done.");
            }

            
            {
                this$0 = LoggingAgent.this;
                super();
            }
        };
        Log.d("nf_log", "ClientLoggingAgent::");
        mBreadcrumbLogging = new CrittercismBreadcrumbLoggingImpl();
        mErrorLogging = new CrittercismErrorLoggingImpl();
        mWorkerThread = new HandlerThread("ClientLoggingAgentWorker");
        mWorkerThread.start();
        mWorkerHandler = new Handler(mWorkerThread.getLooper());
        Log.d("nf_log", "ClientLoggingAgent:: done");
    }

    private void registerReceiver()
    {
        Log.d("nf_log", "Register receiver");
        IntentFilter intentfilter = new IntentFilter();
        String as[] = ApplicationPerformanceMetricsLogging.ACTIONS;
        int l = as.length;
        for (int i = 0; i < l; i++)
        {
            intentfilter.addAction(as[i]);
        }

        as = UserActionLogging.ACTIONS;
        l = as.length;
        for (int j = 0; j < l; j++)
        {
            intentfilter.addAction(as[j]);
        }

        as = UIViewLoggingImpl.ACTIONS;
        l = as.length;
        for (int k = 0; k < l; k++)
        {
            intentfilter.addAction(as[k]);
        }

        intentfilter.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(mLoggerReceiver, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_log", "Failed to register ", throwable);
        }
    }

    private void unregisterReceiver()
    {
        try
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(mLoggerReceiver);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_log", "Failed to unregister ", throwable);
        }
    }

    void clearFailureCounter()
    {
        mFailureCounter.set(0);
    }

    public void destroy()
    {
        Log.d("nf_log", "PNA:: destroy and unregister receiver");
        unregisterReceiver();
        if (mAdvertiserIdLoggingManager != null)
        {
            mAdvertiserIdLoggingManager.destroy();
        }
        super.destroy();
    }

    protected void doInit()
    {
        Log.d("nf_log", "ClientLoggingAgent::init start ");
        mCustomerEventLogging = new LegacyCustomerEventLoggingImpl(this, getContext(), mWorkerHandler);
        mCmpEventLogging = new LegacyCmpEventLoggingImpl(this, getContext());
        mIntegratedClientLoggingManager = new IntegratedClientLoggingManager(getContext(), this, getUser(), getService());
        mPresentationTrackingManager = new PresentationTrackingManager(getContext(), this, getUser());
        mAdvertiserIdLoggingManager = new AdvertiserIdLoggingManager(getContext(), this);
        Log.d("nf_log", "ClientLoggingAgent::init create executor thread start ");
        mExecutor = Executors.newSingleThreadScheduledExecutor(sThreadFactory);
        Log.d("nf_log", "ClientLoggingAgent::init create executor thread done ");
        mExecutor.scheduleAtFixedRate(mEventPostCheck, 60000L, 60000L, TimeUnit.MILLISECONDS);
        mIntegratedClientLoggingManager.init(mExecutor);
        mPresentationTrackingManager.init(mExecutor);
        mAdvertiserIdLoggingManager.init();
        registerReceiver();
        initCompleted(0);
        Log.d("nf_log", "ClientLoggingAgent::init done ");
    }

    public void flush()
    {
        Log.d("nf_log", "Flush events");
        mIntegratedClientLoggingManager.flush();
        mPresentationTrackingManager.flush();
    }

    public List getActiveLoggingSessions()
    {
        if (mIntegratedClientLoggingManager == null)
        {
            return null;
        } else
        {
            return mIntegratedClientLoggingManager.getActiveSessions();
        }
    }

    public AdvertiserIdLogging getAdvertiserIdLogging()
    {
        return mAdvertiserIdLoggingManager;
    }

    public ApplicationPerformanceMetricsLogging getApplicationPerformanceMetricsLogging()
    {
        IntegratedClientLoggingManager integratedclientloggingmanager = mIntegratedClientLoggingManager;
        if (integratedclientloggingmanager == null)
        {
            return null;
        } else
        {
            return integratedclientloggingmanager.getApmLogging();
        }
    }

    public BreadcrumbLogging getBreadcrumbLogging()
    {
        return mBreadcrumbLogging;
    }

    public CmpEventLogging getCmpEventLogging()
    {
        return mCmpEventLogging;
    }

    public CustomerEventLogging getCustomerEventLogging()
    {
        return mCustomerEventLogging;
    }

    public ErrorLogging getErrorLogging()
    {
        return mErrorLogging;
    }

    public long getNextSequence()
    {
        if (mIntegratedClientLoggingManager == null)
        {
            return 0L;
        } else
        {
            return mIntegratedClientLoggingManager.getNextSequence();
        }
    }

    long getNextTimeToDeliverAfterFailure()
    {
        return (long)(mFailureCounter.incrementAndGet() * 60000);
    }

    public PresentationTracking getPresentationTracking()
    {
        return mPresentationTrackingManager;
    }

    long getUptime()
    {
        return System.currentTimeMillis() - mStartedTime;
    }

    public com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface getUser()
    {
        return getUserAgent();
    }

    public String getUserId()
    {
        if (getService() != null)
        {
            return getService().getUserId();
        } else
        {
            return null;
        }
    }

    public boolean handleCommand(Intent intent)
    {
        if (intent == null)
        {
            Log.w("nf_log", "Intent is null");
        } else
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Received command ").append(intent.getAction()).toString());
            return false;
        }
        return false;
    }

    public void handleConnectivityChange(Intent intent)
    {
        if (mIntegratedClientLoggingManager != null)
        {
            mIntegratedClientLoggingManager.handleConnectivityChange(intent);
        }
    }

    public boolean isReady()
    {
        return true;
    }

    public void pauseDelivery()
    {
        mIntegratedClientLoggingManager.pauseDelivery();
        mPresentationTrackingManager.pauseDelivery();
    }

    public void resumeDelivery(boolean flag)
    {
        mIntegratedClientLoggingManager.resumeDelivery(flag);
        mPresentationTrackingManager.resumeDelivery(flag);
    }

    public void setDataContext(DataContext datacontext)
    {
        mIntegratedClientLoggingManager.setDataContext(datacontext);
    }



}
