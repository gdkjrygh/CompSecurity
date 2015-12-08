// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            MessageManager

public class MessagePollingWorker
{
    private static class MessagePollingThread extends Thread
    {

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            Log.v("Started %s", new Object[] {
                toString()
            });
            if (MessagePollingWorker.appContext != null)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            this;
            JVM INSTR monitorexit ;
            Log.v("Stopping MessagePollingThread.", new Object[0]);
            MessagePollingWorker.threadRunning = false;
            return;
_L2:
            long l;
            if (!MessagePollingWorker.appInForeground)
            {
                break MISSING_BLOCK_LABEL_146;
            }
            if (!MessagePollingWorker.messageCenterInForeground)
            {
                break; /* Loop/switch isn't completed */
            }
            l = MessagePollingWorker.foregroundPollingInterval;
_L3:
            Configuration configuration = Configuration.load(MessagePollingWorker.appContext);
            if (Util.isNetworkConnectionPresent(MessagePollingWorker.appContext) && configuration.isMessageCenterEnabled(MessagePollingWorker.appContext))
            {
                Log.v("Checking server for new messages every %d seconds", new Object[] {
                    Long.valueOf(l / 1000L)
                });
                MessageManager.fetchAndStoreMessages(MessagePollingWorker.appContext);
            }
            MessagePollingWorker.goToSleep(l);
            if (true) goto _L2; else goto _L1
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            Log.v("Stopping MessagePollingThread.", new Object[0]);
            MessagePollingWorker.threadRunning = false;
            throw exception;
_L1:
            l = MessagePollingWorker.backgroundPollingInterval;
              goto _L3
            this;
            JVM INSTR monitorexit ;
            Log.v("Stopping MessagePollingThread.", new Object[0]);
            MessagePollingWorker.threadRunning = false;
            return;
        }

        private MessagePollingThread()
        {
        }

    }


    private static Context appContext;
    private static boolean appInForeground;
    private static long backgroundPollingInterval = -1L;
    private static long foregroundPollingInterval = -1L;
    private static boolean messageCenterInForeground;
    private static MessagePollingThread messagePollingThread;
    private static boolean threadRunning;

    public MessagePollingWorker()
    {
    }

    public static void appWentToBackground()
    {
        appInForeground = false;
        wakeUp();
    }

    public static void appWentToForeground(Context context)
    {
        appInForeground = true;
        doStart(context);
    }

    public static void doStart(Context context)
    {
        com/apptentive/android/sdk/module/messagecenter/MessagePollingWorker;
        JVM INSTR monitorenter ;
        appContext = context.getApplicationContext();
        if (!threadRunning)
        {
            Log.i("Starting MessagePollingWorker.", new Object[0]);
            if (backgroundPollingInterval == -1L || foregroundPollingInterval == -1L)
            {
                context = Configuration.load(context);
                backgroundPollingInterval = context.getMessageCenterBgPoll() * 1000;
                foregroundPollingInterval = context.getMessageCenterFgPoll() * 1000;
            }
            threadRunning = true;
            messagePollingThread = new MessagePollingThread();
            context = new Thread.UncaughtExceptionHandler() {

                public void uncaughtException(Thread thread, Throwable throwable)
                {
                    MetricModule.sendError(MessagePollingWorker.appContext, throwable, null, null);
                }

            };
            messagePollingThread.setUncaughtExceptionHandler(context);
            messagePollingThread.setName("Apptentive-MessagePollingWorker");
            messagePollingThread.start();
        }
        com/apptentive/android/sdk/module/messagecenter/MessagePollingWorker;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void goToSleep(long l)
    {
        try
        {
            Thread.sleep(l);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public static void setMessageCenterInForeground(boolean flag)
    {
        boolean flag1;
        if (flag && !messageCenterInForeground)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        messageCenterInForeground = flag;
        if (flag1)
        {
            wakeUp();
        }
    }

    private static void wakeUp()
    {
        if (messagePollingThread != null)
        {
            Log.v("Waking MessagePollingThread.", new Object[0]);
            messagePollingThread.interrupt();
        }
    }









/*
    static boolean access$702(boolean flag)
    {
        threadRunning = flag;
        return flag;
    }

*/
}
