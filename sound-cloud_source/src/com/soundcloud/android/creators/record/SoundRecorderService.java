// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder

public class SoundRecorderService extends Service
{

    private static final int IDLE_DELAY = 30000;
    private static final String TAG = com/soundcloud/android/creators/record/SoundRecorderService.getSimpleName();
    private final IBinder binder = new _cls1();
    private LocalBroadcastManager broadcastManager;
    private final Handler delayedStopHandler = new _cls2();
    private long lastNotifiedTime;
    private NotificationManager notificationManager;
    private final BroadcastReceiver receiver = new _cls3();
    private PendingIntent recordPendingIntent;
    private SoundRecorder recorder;
    private int serviceStartId;
    private android.os.PowerManager.WakeLock wakeLock;

    public SoundRecorderService()
    {
        serviceStartId = -1;
    }

    private void acquireWakeLock()
    {
        if (wakeLock != null && !wakeLock.isHeld())
        {
            wakeLock.acquire();
        }
    }

    private Notification createPlaynotification(Intent intent, Recording recording)
    {
        recording = recording.sharingNote(getResources());
        intent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0x8000000);
        return ongoingNotificationBuilder(getString(0x7f0700db), recording, intent).build();
    }

    private Notification createRecordingNotification(Recording recording)
    {
        recordPendingIntent = PendingIntent.getActivity(this, 0, recording.getViewIntent(), 0x8000000);
        return ongoingNotificationBuilder(getString(0x7f0700da), getString(0x7f0700d9, new Object[] {
            Integer.valueOf(0)
        }), recordPendingIntent).build();
    }

    private void gotoIdleState(int i)
    {
        killNotification(i);
        scheduleServiceShutdownCheck();
        if (!recorder.isActive())
        {
            stopForeground(true);
        }
    }

    private void killNotification(int i)
    {
        notificationManager.cancel(i);
    }

    private android.support.v4.app.NotificationCompat.Builder ongoingNotificationBuilder(String s, String s1, PendingIntent pendingintent)
    {
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(this);
        builder.setSmallIcon(0x7f02015d);
        builder.setContentTitle(s);
        builder.setContentText(s1);
        builder.setContentIntent(pendingintent);
        builder.setOngoing(true);
        builder.setVisibility(1);
        return builder;
    }

    private void releaseWakeLock()
    {
        if (wakeLock != null && wakeLock.isHeld())
        {
            wakeLock.release();
        }
    }

    private void scheduleServiceShutdownCheck()
    {
        Log.isLoggable(TAG, 3);
        delayedStopHandler.removeCallbacksAndMessages(null);
        delayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
    }

    private void sendPlayingNotification(Recording recording)
    {
        startForeground(1, createPlaynotification((new Intent("com.soundcloud.android.action.RECORD")).addFlags(0x4000000).addFlags(0x20000000), recording));
    }

    private void sendRecordingNotification(Recording recording)
    {
        startForeground(0, createRecordingNotification(recording));
    }

    private void updateRecordTicker(long l)
    {
        Notification notification = ongoingNotificationBuilder(getString(0x7f0700da), getString(0x7f0700d9, new Object[] {
            ScTextUtils.formatTimeElapsed(getResources(), l, false)
        }), recordPendingIntent).build();
        notificationManager.notify(0, notification);
    }

    public IBinder onBind(Intent intent)
    {
        return binder;
    }

    public void onCreate()
    {
        super.onCreate();
        recorder = SoundRecorder.getInstance(this);
        notificationManager = (NotificationManager)getSystemService("notification");
        wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(0x20000006, TAG);
        recorder = SoundRecorder.getInstance(this);
        broadcastManager = LocalBroadcastManager.getInstance(this);
        broadcastManager.registerReceiver(receiver, SoundRecorder.getIntentFilter());
        scheduleServiceShutdownCheck();
    }

    public void onDestroy()
    {
        super.onDestroy();
        broadcastManager.unregisterReceiver(receiver);
        gotoIdleState(0);
        gotoIdleState(1);
        releaseWakeLock();
        wakeLock = null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        serviceStartId = j;
        delayedStopHandler.removeCallbacksAndMessages(null);
        scheduleServiceShutdownCheck();
        return 1;
    }











/*
    static long access$702(SoundRecorderService soundrecorderservice, long l)
    {
        soundrecorderservice.lastNotifiedTime = l;
        return l;
    }

*/



    private class _cls1 extends LocalBinder
    {

        final SoundRecorderService this$0;

        public volatile Service getService()
        {
            return getService();
        }

        public SoundRecorderService getService()
        {
            return SoundRecorderService.this;
        }

        _cls1()
        {
            this$0 = SoundRecorderService.this;
            super();
        }
    }


    private class _cls2 extends Handler
    {

        final SoundRecorderService this$0;

        public void handleMessage(Message message)
        {
            if (!recorder.isActive())
            {
                if (Log.isLoggable(SoundRecorderService.TAG, 3))
                {
                    String _tmp = SoundRecorderService.TAG;
                }
                stopSelf(serviceStartId);
            }
        }

        _cls2()
        {
            this$0 = SoundRecorderService.this;
            super();
        }
    }


    private class _cls3 extends BroadcastReceiver
    {

        final SoundRecorderService this$0;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if (Log.isLoggable(SoundRecorderService.TAG, 3))
            {
                SoundRecorderService.TAG;
                (new StringBuilder("BroadcastReceiver#onReceive(")).append(context).append(")");
            }
            if (!"com.soundcloud.android.playbackstarted".equals(context)) goto _L2; else goto _L1
_L1:
            if (intent.getBooleanExtra("shouldUseNotifications", true))
            {
                sendPlayingNotification(recorder.getRecording());
            }
_L4:
            return;
_L2:
            if ("com.soundcloud.android.playbackstopped".equals(context) || "com.soundcloud.android.playbackcomplete".equals(context) || "com.soundcloud.android.playbackerror".equals(context))
            {
                gotoIdleState(1);
                return;
            }
            if (!"com.soundcloud.android.recordstarted".equals(context))
            {
                break; /* Loop/switch isn't completed */
            }
            acquireWakeLock();
            if (intent.getBooleanExtra("shouldUseNotifications", true))
            {
                sendRecordingNotification(recorder.getRecording());
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!"com.soundcloud.android.recordprogress".equals(context))
            {
                break; /* Loop/switch isn't completed */
            }
            long l = intent.getLongExtra("elapsedTime", -1L) / 1000L;
            if (!ScTextUtils.usesSameTimeElapsedString(lastNotifiedTime, l))
            {
                lastNotifiedTime = l;
                updateRecordTicker(l);
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
            if ("com.soundcloud.android.recordfinished".equals(context))
            {
                gotoIdleState(0);
                return;
            }
            if ("com.soundcloud.android.recorderror".equals(context))
            {
                gotoIdleState(0);
                return;
            }
            if ("com.soundcloud.android.notificationState".equals(context))
            {
                if (intent.getBooleanExtra("shouldUseNotifications", true))
                {
                    if (recorder.isRecording())
                    {
                        sendRecordingNotification(recorder.getRecording());
                        return;
                    }
                    if (recorder.isPlaying())
                    {
                        sendPlayingNotification(recorder.getRecording());
                        return;
                    }
                } else
                {
                    lastNotifiedTime = -1L;
                    killNotification(1);
                    killNotification(0);
                    return;
                }
            }
            if (true) goto _L4; else goto _L6
_L6:
        }

        _cls3()
        {
            this$0 = SoundRecorderService.this;
            super();
        }
    }

}
