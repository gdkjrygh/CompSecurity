// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.urbanairship.BaseManager;
import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUser, RichPushUpdateService, RichPushInbox

public class RichPushManager extends BaseManager
{
    public static interface Listener
    {

        public abstract void onUpdateMessages(boolean flag);

        public abstract void onUpdateUser(boolean flag);
    }

    public static interface RefreshMessagesCallback
    {

        public abstract void onRefreshMessages(boolean flag);
    }

    private static abstract class UpdateResultReceiver extends ResultReceiver
    {

        protected void onReceiveResult(int i, Bundle bundle)
        {
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onUpdate(flag);
        }

        public abstract void onUpdate(boolean flag);

        public UpdateResultReceiver()
        {
            super(new Handler(Looper.getMainLooper()));
        }
    }


    public static final String RICH_PUSH_KEY = "_uamid";
    static final long USER_UPDATE_INTERVAL_MS = 0x5265c00L;
    private BroadcastReceiver foregroundReceiver;
    private RichPushInbox inbox;
    private List listeners;
    private AtomicInteger refreshMessageRequestCount;
    private RichPushUser user;

    public RichPushManager(PreferenceDataStore preferencedatastore)
    {
        refreshMessageRequestCount = new AtomicInteger();
        listeners = new ArrayList();
        user = new RichPushUser(preferencedatastore);
    }

    private List getListeners()
    {
        ArrayList arraylist;
        synchronized (listeners)
        {
            arraylist = new ArrayList(listeners);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean isRichPushMessage(Bundle bundle)
    {
        return bundle.containsKey("_uamid");
    }

    public static boolean isRichPushMessage(Map map)
    {
        return map.containsKey("_uamid");
    }

    private void onMessagesUpdate(boolean flag)
    {
        for (Iterator iterator = getListeners().iterator(); iterator.hasNext();)
        {
            Listener listener = (Listener)iterator.next();
            try
            {
                listener.onUpdateMessages(flag);
            }
            catch (Exception exception)
            {
                Logger.error("RichPushManager unable to complete onUpdateMessages() callback.", exception);
            }
        }

    }

    private void onUserUpdate(boolean flag)
    {
        for (Iterator iterator = getListeners().iterator(); iterator.hasNext();)
        {
            Listener listener = (Listener)iterator.next();
            try
            {
                listener.onUpdateUser(flag);
            }
            catch (Exception exception)
            {
                Logger.error("RichPushManager unable to complete onUpdateUser() callback.", exception);
            }
        }

    }

    private void refreshMessages(boolean flag, RefreshMessagesCallback refreshmessagescallback)
    {
        if (isRefreshingMessages() && !flag)
        {
            Logger.info("Skipping refreshing messages, already refreshing.");
            return;
        } else
        {
            startUpdateService("com.urbanairship.richpush.MESSAGES_UPDATE", new UpdateResultReceiver() {

                final RichPushManager this$0;
                final RefreshMessagesCallback val$callback;
                final int val$requestNumber;

                public void onUpdate(boolean flag1)
                {
                    if (refreshMessageRequestCount.compareAndSet(requestNumber, 0))
                    {
                        onMessagesUpdate(flag1);
                    }
                    if (callback != null)
                    {
                        callback.onRefreshMessages(flag1);
                    }
                }

            
            {
                this$0 = RichPushManager.this;
                requestNumber = i;
                callback = refreshmessagescallback;
                super();
            }
            });
            return;
        }
    }

    public static RichPushManager shared()
    {
        return UAirship.shared().getRichPushManager();
    }

    private void startUpdateService(String s, ResultReceiver resultreceiver)
    {
        Logger.debug("RichPushManager startUpdateService");
        Context context = UAirship.getApplicationContext();
        Intent intent = new Intent(context, com/urbanairship/richpush/RichPushUpdateService);
        intent.setAction(s);
        if (resultreceiver != null)
        {
            intent.putExtra("com.urbanairship.richpush.RESULT_RECEIVER", resultreceiver);
        }
        context.startService(intent);
    }

    public void addListener(Listener listener)
    {
        synchronized (listeners)
        {
            listeners.add(listener);
        }
        return;
        listener;
        list;
        JVM INSTR monitorexit ;
        throw listener;
    }

    public RichPushInbox getRichPushInbox()
    {
        this;
        JVM INSTR monitorenter ;
        RichPushInbox richpushinbox;
        if (inbox == null)
        {
            inbox = new RichPushInbox(UAirship.getApplicationContext());
        }
        richpushinbox = inbox;
        this;
        JVM INSTR monitorexit ;
        return richpushinbox;
        Exception exception;
        exception;
        throw exception;
    }

    public RichPushUser getRichPushUser()
    {
        this;
        JVM INSTR monitorenter ;
        RichPushUser richpushuser = user;
        this;
        JVM INSTR monitorexit ;
        return richpushuser;
        Exception exception;
        exception;
        throw exception;
    }

    protected void init()
    {
        foregroundReceiver = new BroadcastReceiver() {

            final RichPushManager this$0;

            public void onReceive(Context context, Intent intent)
            {
                refreshMessages();
            }

            
            {
                this$0 = RichPushManager.this;
                super();
            }
        };
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        UAirship.getApplicationContext().registerReceiver(foregroundReceiver, intentfilter);
        updateUserIfNecessary();
    }

    public boolean isRefreshingMessages()
    {
        return refreshMessageRequestCount.get() > 0;
    }

    public void refreshMessages()
    {
        refreshMessages(false);
    }

    public void refreshMessages(RefreshMessagesCallback refreshmessagescallback)
    {
        refreshMessages(true, refreshmessagescallback);
    }

    public void refreshMessages(boolean flag)
    {
        refreshMessages(flag, null);
    }

    public void removeListener(Listener listener)
    {
        synchronized (listeners)
        {
            listeners.remove(listener);
        }
        return;
        listener;
        list;
        JVM INSTR monitorexit ;
        throw listener;
    }

    protected void tearDown()
    {
        if (foregroundReceiver != null)
        {
            UAirship.getApplicationContext().unregisterReceiver(foregroundReceiver);
            foregroundReceiver = null;
        }
    }

    public void updateUser()
    {
        startUpdateService("com.urbanairship.richpush.USER_UPDATE", new UpdateResultReceiver() {

            final RichPushManager this$0;

            public void onUpdate(boolean flag)
            {
                onUserUpdate(flag);
            }

            
            {
                this$0 = RichPushManager.this;
                super();
            }
        });
    }

    public void updateUserIfNecessary()
    {
        long l = getRichPushUser().getLastUpdateTime();
        long l1 = System.currentTimeMillis();
        if (l > l1 || 0x5265c00L + l < l1)
        {
            updateUser();
        }
    }



}
