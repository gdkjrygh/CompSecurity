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
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushMessageJavaScript, RichPushResolver, RichPushUser, RichPushUpdateService

public class RichPushManager
{
    public static interface Listener
    {

        public abstract void onUpdateMessages(boolean flag);

        public abstract void onUpdateUser(boolean flag);
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
    private static final RichPushManager instance = new RichPushManager();
    private static String jsIdentifier = "urbanairship";
    private static Class jsInterface = com/urbanairship/richpush/RichPushMessageJavaScript;
    static RichPushResolver resolver;
    private List listeners;
    private AtomicInteger refreshMessageRequestCount;
    private RichPushUser user;

    RichPushManager()
    {
        refreshMessageRequestCount = new AtomicInteger();
        listeners = new ArrayList();
        resolver = new RichPushResolver(UAirship.shared().getApplicationContext());
    }

    public static String getJsIdentifier()
    {
        return jsIdentifier;
    }

    public static Class getJsInterface()
    {
        return jsInterface;
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

    public static void init()
    {
        com/urbanairship/richpush/RichPushManager;
        JVM INSTR monitorenter ;
        if (UAirship.shared().getAirshipConfigOptions().richPushEnabled)
        {
            Logger.info("Initializing Rich Push.");
            instance.updateUserIfNecessary();
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
            intentfilter.addCategory(UAirship.getPackageName());
            UAirship.shared().getApplicationContext().registerReceiver(new BroadcastReceiver() {

                public void onReceive(Context context, Intent intent)
                {
                    RichPushManager.instance.refreshMessages();
                }

            }, intentfilter);
        }
        com/urbanairship/richpush/RichPushManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
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
        Iterator iterator;
        if (flag)
        {
            Logger.debug("Messages update succeeded");
        } else
        {
            Logger.debug("Messages update failed");
        }
        for (iterator = getListeners().iterator(); iterator.hasNext();)
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
        Iterator iterator;
        if (flag)
        {
            Logger.debug("User update succeeded");
            user.setLastUpdateTime(System.currentTimeMillis());
        } else
        {
            Logger.debug("User update failed");
        }
        for (iterator = getListeners().iterator(); iterator.hasNext();)
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

    public static void setJavascriptInterface(Class class1)
    {
        setJavascriptInterface(class1, null);
    }

    public static void setJavascriptInterface(Class class1, String s)
    {
        jsInterface = class1;
        if (!UAStringUtil.isEmpty(s))
        {
            jsIdentifier = s;
        }
    }

    public static RichPushManager shared()
    {
        return instance;
    }

    private void startUpdateService(String s, ResultReceiver resultreceiver)
    {
        Logger.debug("RichPushManager startUpdateService");
        Context context = UAirship.shared().getApplicationContext();
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

    public RichPushUser getRichPushUser()
    {
        this;
        JVM INSTR monitorenter ;
        RichPushUser richpushuser;
        if (user == null)
        {
            user = new RichPushUser();
        }
        richpushuser = user;
        this;
        JVM INSTR monitorexit ;
        return richpushuser;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isRefreshingMessages()
    {
        return refreshMessageRequestCount.get() > 0;
    }

    public void refreshMessages()
    {
        refreshMessages(false);
    }

    public void refreshMessages(boolean flag)
    {
        if (isRefreshingMessages() && !flag)
        {
            Logger.info("Skipping refreshing messages, already refreshing.");
            return;
        } else
        {
            startUpdateService("com.urbanairship.richpush.MESSAGES_UPDATE", new UpdateResultReceiver() {

                final RichPushManager this$0;
                final int val$requestNumber;

                public void onUpdate(boolean flag1)
                {
                    if (refreshMessageRequestCount.compareAndSet(requestNumber, 0))
                    {
                        onMessagesUpdate(flag1);
                    }
                }

            
            {
                this$0 = RichPushManager.this;
                requestNumber = i;
                super();
            }
            });
            return;
        }
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
