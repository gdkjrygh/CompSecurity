// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.WakefulBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class PushHandlingService extends Service
{

    protected static final String ACTION_START_PUSH_HANDLING = "com.skype.android.push.StartPushHandling";
    protected static final String ACTION_STOP_PUSH_HANDLING = "com.skype.android.push.StopPushHandling";
    protected static final long DEFAULT_PUSH_PROCESSING_TIME;
    protected static final String EXTRA_PUSH_HANDLING_LIFETIME = "pushHandlingLifetime";
    protected static final String EXTRA_PUSH_ID_KEY = "pushId";
    private static final long INVALID_PUSH_ID = 0x8000000000000000L;
    private static final String TAG = "PushHandlingService";
    private static final int WHAT_STOP_SELF = 1;
    private static final Logger log = Logger.getLogger("PushHandlingService");
    private Handler handler;
    private Map intentsToComplete;

    public PushHandlingService()
    {
    }

    private long getPushHandlingLifeTime(Intent intent)
    {
        return intent.getLongExtra("pushHandlingLifetime", DEFAULT_PUSH_PROCESSING_TIME);
    }

    private long getPushId(Intent intent)
    {
        return intent.getLongExtra("pushId", 0x8000000000000000L);
    }

    private void handleStop(long l, int i)
    {
        Intent intent = (Intent)intentsToComplete.remove(Long.valueOf(l));
        if (intent != null)
        {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        if (intentsToComplete.isEmpty())
        {
            log.info((new StringBuilder("There is no intents to complete anymore. Stop self: ")).append(i).toString());
            stopSelf(i);
            removeStopMessages();
        }
    }

    private void removeStopMessages()
    {
        handler.removeMessages(1);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        log.info("Service created");
        super.onCreate();
        handler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

            final PushHandlingService this$0;

            public final boolean handleMessage(Message message)
            {
                if (1 == message.what)
                {
                    int i = message.arg1;
                    long l = ((Long)message.obj).longValue();
                    handleStop(l, i);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = PushHandlingService.this;
                super();
            }
        });
        intentsToComplete = new HashMap();
    }

    public void onDestroy()
    {
        log.info("Service destroyed");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null)
        {
            log.warning((new StringBuilder("Stop self as intent is null: ")).append(j).toString());
            stopSelf(j);
            return 1;
        }
        Object obj = intent.getAction();
        if ("com.skype.android.push.StartPushHandling".equals(obj))
        {
            long l = getPushId(intent);
            log.info((new StringBuilder("Start push handling. pushId:: ")).append(l).append(" startId: ").append(j).toString());
            obj = handler.obtainMessage(1);
            obj.arg1 = j;
            obj.obj = Long.valueOf(l);
            intentsToComplete.put(Long.valueOf(l), intent);
            removeStopMessages();
            handler.sendMessageDelayed(((Message) (obj)), getPushHandlingLifeTime(intent));
            return 1;
        }
        if ("com.skype.android.push.StopPushHandling".equals(obj))
        {
            long l1 = getPushId(intent);
            log.info((new StringBuilder("Stop push handling. pushId:: ")).append(l1).append(" startId: ").append(j).toString());
            handleStop(l1, j);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
            return 1;
        } else
        {
            log.warning((new StringBuilder("Wrong class usage. Please use PushHandlingHelper")).append(j).toString());
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
            return 1;
        }
    }

    static 
    {
        DEFAULT_PUSH_PROCESSING_TIME = TimeUnit.SECONDS.toMillis(6L);
    }

}
