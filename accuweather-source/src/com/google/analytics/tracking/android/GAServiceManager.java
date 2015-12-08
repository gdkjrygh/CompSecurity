// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.analytics.tracking.android:
//            ServiceManager, GANetworkReceiver, Log, GAUsage, 
//            AnalyticsThread, PersistentAnalyticsStore, AnalyticsStoreStateListener, AnalyticsStore

public class GAServiceManager
    implements ServiceManager
{

    private static final int MSG_KEY = 1;
    private static final Object MSG_OBJECT = new Object();
    private static GAServiceManager instance;
    private boolean connected;
    private Context ctx;
    private int dispatchPeriodInSeconds;
    private Handler handler;
    private boolean listenForNetwork;
    private AnalyticsStoreStateListener listener = new AnalyticsStoreStateListener() {

        final GAServiceManager this$0;

        public void reportStoreIsEmpty(boolean flag)
        {
            updatePowerSaveMode(flag, connected);
        }

            
            {
                this$0 = GAServiceManager.this;
                super();
            }
    };
    private GANetworkReceiver networkReceiver;
    private boolean pendingDispatch;
    private AnalyticsStore store;
    private boolean storeIsEmpty;
    private volatile AnalyticsThread thread;

    private GAServiceManager()
    {
        dispatchPeriodInSeconds = 1800;
        pendingDispatch = true;
        connected = true;
        listenForNetwork = true;
        storeIsEmpty = false;
    }

    GAServiceManager(Context context, AnalyticsThread analyticsthread, AnalyticsStore analyticsstore, boolean flag)
    {
        dispatchPeriodInSeconds = 1800;
        pendingDispatch = true;
        connected = true;
        listenForNetwork = true;
        storeIsEmpty = false;
        store = analyticsstore;
        thread = analyticsthread;
        listenForNetwork = flag;
        initialize(context, analyticsthread);
    }

    public static GAServiceManager getInstance()
    {
        if (instance == null)
        {
            instance = new GAServiceManager();
        }
        return instance;
    }

    private void initializeHandler()
    {
        handler = new Handler(ctx.getMainLooper(), new android.os.Handler.Callback() {

            final GAServiceManager this$0;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && GAServiceManager.MSG_OBJECT.equals(message.obj))
                {
                    GAUsage.getInstance().setDisableUsage(true);
                    dispatch();
                    GAUsage.getInstance().setDisableUsage(false);
                    if (dispatchPeriodInSeconds > 0 && !storeIsEmpty)
                    {
                        handler.sendMessageDelayed(handler.obtainMessage(1, GAServiceManager.MSG_OBJECT), dispatchPeriodInSeconds * 1000);
                    }
                }
                return true;
            }

            
            {
                this$0 = GAServiceManager.this;
                super();
            }
        });
        if (dispatchPeriodInSeconds > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), dispatchPeriodInSeconds * 1000);
        }
    }

    private void initializeNetworkReceiver()
    {
        networkReceiver = new GANetworkReceiver(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ctx.registerReceiver(networkReceiver, intentfilter);
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (thread != null) goto _L2; else goto _L1
_L1:
        Log.w("dispatch call queued.  Need to call GAServiceManager.getInstance().initialize().");
        pendingDispatch = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.getInstance().setUsage(GAUsage.Field.DISPATCH);
        thread.dispatch();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    AnalyticsStoreStateListener getListener()
    {
        return listener;
    }

    AnalyticsStore getStore()
    {
        this;
        JVM INSTR monitorenter ;
        if (store != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (ctx == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        store = new PersistentAnalyticsStore(listener, ctx);
        AnalyticsStore analyticsstore;
        if (handler == null)
        {
            initializeHandler();
        }
        if (networkReceiver == null && listenForNetwork)
        {
            initializeNetworkReceiver();
        }
        analyticsstore = store;
        this;
        JVM INSTR monitorexit ;
        return analyticsstore;
    }

    void initialize(Context context, AnalyticsThread analyticsthread)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = ctx;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ctx = context.getApplicationContext();
        if (thread == null)
        {
            thread = analyticsthread;
            if (pendingDispatch)
            {
                analyticsthread.dispatch();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public void setDispatchPeriod(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (handler != null) goto _L2; else goto _L1
_L1:
        Log.w("Need to call initialize() and be in fallback mode to start dispatch.");
        dispatchPeriodInSeconds = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_DISPATCH_PERIOD);
        if (!storeIsEmpty && connected && dispatchPeriodInSeconds > 0)
        {
            handler.removeMessages(1, MSG_OBJECT);
        }
        dispatchPeriodInSeconds = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!storeIsEmpty && connected)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void updateConnectivityStatus(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        updatePowerSaveMode(storeIsEmpty, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void updatePowerSaveMode(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (storeIsEmpty != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = connected;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (dispatchPeriodInSeconds > 0)
        {
            handler.removeMessages(1, MSG_OBJECT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (dispatchPeriodInSeconds > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), dispatchPeriodInSeconds * 1000);
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        Log.iDebug(stringbuilder.append(((String) (obj))).toString());
        storeIsEmpty = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }






}
