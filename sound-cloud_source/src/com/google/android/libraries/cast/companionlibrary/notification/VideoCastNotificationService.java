// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.support.v4.app.TaskStackBuilder;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.common.images.WebImage;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.player.VideoCastControllerActivity;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.util.List;

public class VideoCastNotificationService extends Service
{

    public static final String ACTION_STOP = "com.google.android.libraries.cast.companionlibrary.action.stop";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.libraries.cast.companionlibrary.action.toggleplayback";
    public static final String ACTION_VISIBILITY = "com.google.android.libraries.cast.companionlibrary.action.notificationvisibility";
    private static final int NOTIFICATION_ID = 1;
    public static final String NOTIFICATION_VISIBILITY = "visible";
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/notification/VideoCastNotificationService);
    private FetchBitmapTask mBitmapDecoderTask;
    private VideoCastManager mCastManager;
    private VideoCastConsumerImpl mConsumer;
    private int mDimensionInPixels;
    private boolean mIsPlaying;
    private Notification mNotification;
    private int mOldStatus;
    private Class mTargetActivity;
    private Bitmap mVideoArtBitmap;
    private boolean mVisible;

    public VideoCastNotificationService()
    {
        mOldStatus = -1;
    }

    private void build(m m1, Bitmap bitmap, boolean flag)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        Object obj = new Intent("com.google.android.libraries.cast.companionlibrary.action.toggleplayback");
        ((Intent) (obj)).setPackage(getPackageName());
        obj = PendingIntent.getBroadcast(this, 0, ((Intent) (obj)), 0);
        Object obj1 = new Intent("com.google.android.libraries.cast.companionlibrary.action.stop");
        ((Intent) (obj1)).setPackage(getPackageName());
        obj1 = PendingIntent.getBroadcast(this, 0, ((Intent) (obj1)), 0);
        Object obj2 = Utils.mediaInfoToBundle(mCastManager.getRemoteMediaInformation());
        Intent intent = new Intent(this, mTargetActivity);
        intent.putExtra("media", ((android.os.Bundle) (obj2)));
        n n1 = m1.d;
        String s = getResources().getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
            mCastManager.getDeviceName()
        });
        TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(this);
        taskstackbuilder.addParentStack(mTargetActivity);
        taskstackbuilder.addNextIntent(intent);
        if (taskstackbuilder.getIntentCount() > 1)
        {
            taskstackbuilder.editIntentAt(1).putExtra("media", ((android.os.Bundle) (obj2)));
        }
        obj2 = taskstackbuilder.getPendingIntent(1, 0x8000000);
        int i;
        int j;
        if (m1.b == 2)
        {
            i = com.google.android.libraries.cast.companionlibrary.R.drawable.ic_notification_stop_48dp;
        } else
        {
            i = com.google.android.libraries.cast.companionlibrary.R.drawable.ic_notification_pause_48dp;
        }
        if (flag)
        {
            j = com.google.android.libraries.cast.companionlibrary.R.string.ccl_pause;
        } else
        {
            j = com.google.android.libraries.cast.companionlibrary.R.string.ccl_play;
        }
        m1 = (new android.support.v7.app.NotificationCompat.Builder(this)).setSmallIcon(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_stat_notification_cloud).setContentTitle(n1.a("com.google.android.gms.cast.metadata.TITLE")).setContentText(s).setContentIntent(((PendingIntent) (obj2))).setLargeIcon(bitmap);
        if (!flag)
        {
            i = com.google.android.libraries.cast.companionlibrary.R.drawable.ic_notification_play_48dp;
        }
        mNotification = ((android.support.v7.app.NotificationCompat.Builder)m1.addAction(i, getString(j), ((PendingIntent) (obj))).addAction(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_notification_disconnect_24dp, getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_disconnect), ((PendingIntent) (obj1))).setStyle((new android.support.v7.app.NotificationCompat.MediaStyle()).setShowActionsInCompactView(new int[] {
            0, 1
        }).setMediaSession(mCastManager.getMediaSessionCompatToken())).setOngoing(true).setShowWhen(false).setVisibility(1)).build();
    }

    private void onRemoteMediaPlayerStatusUpdated(int i)
    {
        if (mOldStatus == i)
        {
            return;
        }
        mOldStatus = i;
        LogUtils.LOGD(TAG, (new StringBuilder("onRemoteMediaPlayerStatusUpdated() reached with status: ")).append(i).toString());
        i;
        JVM INSTR tableswitch 0 4: default 72
    //                   0 73
    //                   1 147
    //                   2 113
    //                   3 130
    //                   4 96;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        mIsPlaying = false;
        stopForeground(true);
        return;
        Object obj;
        obj;
_L8:
        LogUtils.LOGE(TAG, "Failed to update the playback status due to network issues", ((Throwable) (obj)));
        return;
_L6:
        mIsPlaying = false;
        setUpNotification(mCastManager.getRemoteMediaInformation());
        return;
_L4:
        mIsPlaying = true;
        setUpNotification(mCastManager.getRemoteMediaInformation());
        return;
_L5:
        mIsPlaying = false;
        setUpNotification(mCastManager.getRemoteMediaInformation());
        return;
_L3:
        mIsPlaying = false;
        if (!mCastManager.shouldRemoteUiBeVisible(i, mCastManager.getIdleReason()))
        {
            stopForeground(true);
            return;
        }
        setUpNotification(mCastManager.getRemoteMediaInformation());
        return;
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void readPersistedData()
    {
        String s = mCastManager.getPreferenceAccessor().getStringFromPreference("cast-activity-name");
        if (s != null)
        {
            try
            {
                mTargetActivity = Class.forName(s);
                return;
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                LogUtils.LOGE(TAG, "Failed to find the targetActivity class", classnotfoundexception);
            }
            break MISSING_BLOCK_LABEL_46;
        }
        mTargetActivity = com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerActivity;
        return;
    }

    private void removeNotification()
    {
        ((NotificationManager)getSystemService("notification")).cancel(1);
    }

    private void setUpNotification(final m info)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        if (info == null)
        {
            return;
        }
        if (mBitmapDecoderTask != null)
        {
            mBitmapDecoderTask.cancel(false);
        }
        CastException castexception;
        android.net.Uri uri;
        if (!info.d.b())
        {
            build(info, null, mIsPlaying);
            return;
        }
          goto _L1
_L3:
        mBitmapDecoderTask = new _cls2();
        mBitmapDecoderTask.execute(uri);
        return;
_L1:
        try
        {
            uri = ((WebImage)info.d.a.get(0)).getUrl();
        }
        // Misplaced declaration of an exception variable
        catch (CastException castexception)
        {
            LogUtils.LOGE(TAG, "Failed to build notification", castexception);
            uri = null;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void stopApplication()
    {
        try
        {
            LogUtils.LOGD(TAG, "Calling stopApplication");
            mCastManager.disconnect();
        }
        catch (Exception exception)
        {
            LogUtils.LOGE(TAG, "Failed to disconnect application", exception);
        }
        stopSelf();
    }

    private void togglePlayback()
    {
        try
        {
            mCastManager.togglePlayback();
            return;
        }
        catch (Exception exception)
        {
            LogUtils.LOGE(TAG, "Failed to toggle the playback", exception);
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        mDimensionInPixels = Utils.convertDpToPixel(this, getResources().getDimension(com.google.android.libraries.cast.companionlibrary.R.dimen.ccl_notification_image_size));
        mCastManager = VideoCastManager.getInstance();
        readPersistedData();
        if (!mCastManager.isConnected() && !mCastManager.isConnecting())
        {
            mCastManager.reconnectSessionIfPossible();
        }
        mConsumer = new _cls1();
        mCastManager.addVideoCastConsumer(mConsumer);
    }

    public void onDestroy()
    {
        if (mBitmapDecoderTask != null)
        {
            mBitmapDecoderTask.cancel(false);
        }
        removeNotification();
        if (mCastManager != null && mConsumer != null)
        {
            mCastManager.removeVideoCastConsumer(mConsumer);
            mCastManager = null;
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        LogUtils.LOGD(TAG, "onStartCommand");
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s;
        s = intent.getAction();
        if ("com.google.android.libraries.cast.companionlibrary.action.toggleplayback".equals(s) && Utils.IS_ICS_OR_ABOVE)
        {
            LogUtils.LOGD(TAG, "onStartCommand(): Action: ACTION_TOGGLE_PLAYBACK");
            togglePlayback();
            return 1;
        }
        if ("com.google.android.libraries.cast.companionlibrary.action.stop".equals(s) && Utils.IS_ICS_OR_ABOVE)
        {
            LogUtils.LOGD(TAG, "onStartCommand(): Action: ACTION_STOP");
            stopApplication();
            return 1;
        }
        if (!"com.google.android.libraries.cast.companionlibrary.action.notificationvisibility".equals(s)) goto _L4; else goto _L3
_L3:
        mVisible = intent.getBooleanExtra("visible", false);
        LogUtils.LOGD(TAG, (new StringBuilder("onStartCommand(): Action: ACTION_VISIBILITY ")).append(mVisible).toString());
        onRemoteMediaPlayerStatusUpdated(mCastManager.getPlaybackStatus());
        if (mNotification != null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        setUpNotification(mCastManager.getRemoteMediaInformation());
_L5:
        if (mVisible && mNotification != null)
        {
            startForeground(1, mNotification);
            return 1;
        } else
        {
            stopForeground(true);
            return 1;
        }
        intent;
_L6:
        LogUtils.LOGE(TAG, "onStartCommand() failed to get media", intent);
          goto _L5
_L4:
        LogUtils.LOGD(TAG, "onStartCommand(): Action: none");
        return 1;
_L2:
        LogUtils.LOGD(TAG, "onStartCommand(): Intent was null");
        return 1;
        intent;
          goto _L6
    }







/*
    static boolean access$302(VideoCastNotificationService videocastnotificationservice, boolean flag)
    {
        videocastnotificationservice.mVisible = flag;
        return flag;
    }

*/




/*
    static Bitmap access$502(VideoCastNotificationService videocastnotificationservice, Bitmap bitmap)
    {
        videocastnotificationservice.mVideoArtBitmap = bitmap;
        return bitmap;
    }

*/






/*
    static FetchBitmapTask access$902(VideoCastNotificationService videocastnotificationservice, FetchBitmapTask fetchbitmaptask)
    {
        videocastnotificationservice.mBitmapDecoderTask = fetchbitmaptask;
        return fetchbitmaptask;
    }

*/

    private class _cls2 extends FetchBitmapTask
    {

        final VideoCastNotificationService this$0;
        final m val$info;

        protected void onPostExecute(Bitmap bitmap)
        {
            mVideoArtBitmap = Utils.scaleAndCenterCropBitmap(bitmap, mDimensionInPixels, mDimensionInPixels);
            build(info, mVideoArtBitmap, mIsPlaying);
_L2:
            if (mVisible && mNotification != null)
            {
                startForeground(1, mNotification);
            }
            if (this == mBitmapDecoderTask)
            {
                mBitmapDecoderTask = null;
            }
            return;
            bitmap;
_L3:
            LogUtils.LOGE(VideoCastNotificationService.TAG, (new StringBuilder("Failed to set notification for ")).append(info.toString()).toString(), bitmap);
            if (true) goto _L2; else goto _L1
_L1:
            bitmap;
              goto _L3
            bitmap;
              goto _L3
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls2()
        {
            this$0 = VideoCastNotificationService.this;
            info = m1;
            super();
        }
    }


    private class _cls1 extends VideoCastConsumerImpl
    {

        final VideoCastNotificationService this$0;

        public void onApplicationDisconnected(int i)
        {
            LogUtils.LOGD(VideoCastNotificationService.TAG, "onApplicationDisconnected() was reached, stopping the notification service");
            stopSelf();
        }

        public void onRemoteMediaPlayerStatusUpdated()
        {
            int i = mCastManager.getPlaybackStatus();
            VideoCastNotificationService.this.onRemoteMediaPlayerStatusUpdated(i);
        }

        public void onUiVisibilityChanged(boolean flag)
        {
            VideoCastNotificationService videocastnotificationservice = VideoCastNotificationService.this;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            videocastnotificationservice.mVisible = flag;
            if (mVisible && mNotification != null)
            {
                startForeground(1, mNotification);
                return;
            } else
            {
                stopForeground(true);
                return;
            }
        }

        _cls1()
        {
            this$0 = VideoCastNotificationService.this;
            super();
        }
    }

}
