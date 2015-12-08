// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.MediaRouteDialogFactory;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.cast.A;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.B;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.D;
import com.google.android.gms.cast.E;
import com.google.android.gms.cast.F;
import com.google.android.gms.cast.G;
import com.google.android.gms.cast.I;
import com.google.android.gms.cast.K;
import com.google.android.gms.cast.L;
import com.google.android.gms.cast.M;
import com.google.android.gms.cast.N;
import com.google.android.gms.cast.Q;
import com.google.android.gms.cast.a;
import com.google.android.gms.cast.internal.d;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.p;
import com.google.android.gms.cast.r;
import com.google.android.gms.cast.t;
import com.google.android.gms.cast.u;
import com.google.android.gms.cast.v;
import com.google.android.gms.cast.w;
import com.google.android.gms.cast.x;
import com.google.android.gms.cast.y;
import com.google.android.gms.cast.z;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.images.WebImage;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumer;
import com.google.android.libraries.cast.companionlibrary.cast.dialog.video.VideoMediaRouteDialogFactory;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthService;
import com.google.android.libraries.cast.companionlibrary.cast.player.VideoCastControllerActivity;
import com.google.android.libraries.cast.companionlibrary.cast.tracks.OnTracksSelectedListener;
import com.google.android.libraries.cast.companionlibrary.cast.tracks.TracksPreferenceManager;
import com.google.android.libraries.cast.companionlibrary.notification.VideoCastNotificationService;
import com.google.android.libraries.cast.companionlibrary.remotecontrol.VideoIntentReceiver;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import com.google.android.libraries.cast.companionlibrary.widgets.IMiniController;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            BaseCastManager, MediaQueue

public class VideoCastManager extends BaseCastManager
    implements OnFailedListener, com.google.android.libraries.cast.companionlibrary.widgets.MiniController.OnMiniControllerChangedListener
{
    class CastListener extends com.google.android.gms.cast.a.d
    {

        final VideoCastManager this$0;

        public void onApplicationDisconnected(int i)
        {
            VideoCastManager.this.onApplicationDisconnected(i);
        }

        public void onApplicationStatusChanged()
        {
            VideoCastManager.this.onApplicationStatusChanged();
        }

        public void onVolumeChanged()
        {
            VideoCastManager.this.onVolumeChanged();
        }

        CastListener()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }

    public static interface MediaRouteDialogListener
    {

        public abstract void onMediaRouteDialogCellClick(Context context);
    }

    private class UpdateProgressTask extends TimerTask
    {

        final VideoCastManager this$0;

        public void run()
        {
            if (mState != 4 && isConnected() && mRemoteMediaPlayer != null) goto _L2; else goto _L1
_L1:
            int i;
            return;
_L2:
            if ((i = (int)getMediaDuration()) <= 0) goto _L1; else goto _L3
_L3:
            int j = (int)getCurrentMediaPosition();
            updateProgress(j, i);
            return;
            Object obj;
            obj;
_L5:
            LogUtils.LOGE(VideoCastManager.TAG, "Failed to update the progress tracker due to network issues", ((Throwable) (obj)));
            return;
            obj;
            if (true) goto _L5; else goto _L4
_L4:
        }

        private UpdateProgressTask()
        {
            this$0 = VideoCastManager.this;
            super();
        }

        UpdateProgressTask(_cls1 _pcls1)
        {
            this();
        }
    }

    public static final class VolumeType extends Enum
    {

        private static final VolumeType $VALUES[];
        public static final VolumeType DEVICE;
        public static final VolumeType STREAM;

        public static VolumeType valueOf(String s)
        {
            return (VolumeType)Enum.valueOf(com/google/android/libraries/cast/companionlibrary/cast/VideoCastManager$VolumeType, s);
        }

        public static VolumeType[] values()
        {
            return (VolumeType[])$VALUES.clone();
        }

        static 
        {
            STREAM = new VolumeType("STREAM", 0);
            DEVICE = new VolumeType("DEVICE", 1);
            $VALUES = (new VolumeType[] {
                STREAM, DEVICE
            });
        }

        private VolumeType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final long DEFAULT_LIVE_STREAM_DURATION_MS;
    public static final double DEFAULT_VOLUME_STEP = 0.050000000000000003D;
    public static final String EXTRA_CUSTOM_DATA = "customData";
    public static final String EXTRA_HAS_AUTH = "hasAuth";
    public static final String EXTRA_MEDIA = "media";
    public static final String EXTRA_NEXT_PREVIOUS_VISIBILITY_POLICY = "nextPrevPolicy";
    public static final String EXTRA_SHOULD_START = "shouldStart";
    public static final String EXTRA_START_POINT = "startPoint";
    public static final String PREFS_KEY_IMMERSIVE_MODE = "ccl-cast-contoller-immersive";
    public static final String PREFS_KEY_NEXT_PREV_POLICY = "ccl-next-prev-policy";
    public static final String PREFS_KEY_START_ACTIVITY = "ccl-start-cast-activity";
    private static final long PROGRESS_UPDATE_INTERVAL_MS;
    public static final int QUEUE_OPERATION_APPEND = 9;
    public static final int QUEUE_OPERATION_INSERT_ITEMS = 2;
    public static final int QUEUE_OPERATION_JUMP = 4;
    public static final int QUEUE_OPERATION_LOAD = 1;
    public static final int QUEUE_OPERATION_MOVE = 8;
    public static final int QUEUE_OPERATION_NEXT = 10;
    public static final int QUEUE_OPERATION_PREV = 11;
    public static final int QUEUE_OPERATION_REMOVE_ITEM = 5;
    public static final int QUEUE_OPERATION_REMOVE_ITEMS = 6;
    public static final int QUEUE_OPERATION_REORDER = 7;
    public static final int QUEUE_OPERATION_SET_REPEAT = 12;
    public static final int QUEUE_OPERATION_UPDATE_ITEMS = 3;
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/VideoCastManager);
    private static VideoCastManager sInstance;
    private AudioManager mAudioManager;
    private MediaAuthService mAuthService;
    private com.google.android.gms.cast.a.e mDataChannel;
    private String mDataNamespace;
    private int mIdleReason;
    private long mLiveStreamDuration;
    private ComponentName mMediaEventReceiver;
    private MediaQueue mMediaQueue;
    private MediaRouteDialogListener mMediaRouteDialogListener;
    private MediaSessionCompat mMediaSessionCompat;
    private p mMediaStatus;
    private final Set mMiniControllers;
    private int mNextPreviousVisibilityPolicy;
    private o mPreLoadingItem;
    private UpdateProgressTask mProgressTask;
    private Timer mProgressTimer;
    private r mRemoteMediaPlayer;
    private int mState;
    private Class mTargetActivity;
    private TracksPreferenceManager mTrackManager;
    private final Set mTracksSelectedListeners;
    private final Set mVideoConsumers;
    private double mVolumeStep;
    private VolumeType mVolumeType;

    private VideoCastManager()
    {
        mVolumeStep = 0.050000000000000003D;
        mNextPreviousVisibilityPolicy = 2;
        mMiniControllers = Collections.synchronizedSet(new HashSet());
        mVolumeType = VolumeType.DEVICE;
        mState = 1;
        mVideoConsumers = new CopyOnWriteArraySet();
        mTracksSelectedListeners = new CopyOnWriteArraySet();
        mLiveStreamDuration = DEFAULT_LIVE_STREAM_DURATION_MS;
    }

    protected VideoCastManager(Context context, String s, Class class1, String s1)
    {
        super(context, s);
        mVolumeStep = 0.050000000000000003D;
        mNextPreviousVisibilityPolicy = 2;
        mMiniControllers = Collections.synchronizedSet(new HashSet());
        mVolumeType = VolumeType.DEVICE;
        mState = 1;
        mVideoConsumers = new CopyOnWriteArraySet();
        mTracksSelectedListeners = new CopyOnWriteArraySet();
        mLiveStreamDuration = DEFAULT_LIVE_STREAM_DURATION_MS;
        LogUtils.LOGD(TAG, "VideoCastManager is instantiated");
        mDataNamespace = s1;
        context = class1;
        if (class1 == null)
        {
            context = com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerActivity;
        }
        mTargetActivity = context;
        mPreferenceAccessor.saveStringToPreference("cast-activity-name", mTargetActivity.getName());
        if (!TextUtils.isEmpty(mDataNamespace))
        {
            mPreferenceAccessor.saveStringToPreference("cast-custom-data-namespace", s1);
        }
        mAudioManager = (AudioManager)mContext.getSystemService("audio");
    }

    private void attachDataChannel()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        while (TextUtils.isEmpty(mDataNamespace) || mDataChannel != null) 
        {
            return;
        }
        checkConnectivity();
        mDataChannel = new _cls26();
        a.b.a(mApiClient, mDataNamespace, mDataChannel);
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, "attachDataChannel()", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void attachMediaChannel()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "attachMediaChannel()");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            mRemoteMediaPlayer = new r();
            mRemoteMediaPlayer.g = new _cls22();
            mRemoteMediaPlayer.d = new _cls23();
            mRemoteMediaPlayer.f = new _cls24();
            mRemoteMediaPlayer.e = new _cls25();
        }
        LogUtils.LOGD(TAG, "Registering MediaChannel namespace");
        a.b.a(mApiClient, ((d) (mRemoteMediaPlayer.b)).g, mRemoteMediaPlayer);
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, "attachMediaChannel()", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean changeVolume(double d1, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && getPlaybackStatus() == 2 && isFeatureEnabled(2))
        {
            return false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        adjustVolume(d1);
_L2:
        return true;
        Object obj;
        obj;
_L3:
        LogUtils.LOGE(TAG, "Failed to change volume", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }

    private void checkRemoteMediaPlayerAvailable()
        throws NoConnectionException
    {
        if (mRemoteMediaPlayer == null)
        {
            throw new NoConnectionException();
        } else
        {
            return;
        }
    }

    private void detachMediaChannel()
    {
        LogUtils.LOGD(TAG, "trying to detach media channel");
        if (mRemoteMediaPlayer == null) goto _L2; else goto _L1
_L1:
        a.b.c(mApiClient, ((d) (mRemoteMediaPlayer.b)).g);
_L4:
        mRemoteMediaPlayer = null;
_L2:
        return;
        Object obj;
        obj;
_L5:
        LogUtils.LOGE(TAG, "detachMediaChannel()", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
          goto _L5
    }

    public static VideoCastManager getInstance()
    {
        if (sInstance == null)
        {
            LogUtils.LOGE(TAG, "No VideoCastManager instance was found, did you forget to initialize it?");
            throw new IllegalStateException("No VideoCastManager instance was found, did you forget to initialize it?");
        } else
        {
            return sInstance;
        }
    }

    public static VideoCastManager initialize(Context context, String s, Class class1, String s1)
    {
        com/google/android/libraries/cast/companionlibrary/cast/VideoCastManager;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            LogUtils.LOGD(TAG, "New instance of VideoCastManager is created");
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
            {
                LogUtils.LOGE(TAG, "Couldn't find the appropriate version of Google Play Services");
            }
            context = new VideoCastManager(context, s, class1, s1);
            sInstance = context;
            context.restartProgressTimer();
        }
        context = sInstance;
        com/google/android/libraries/cast/companionlibrary/cast/VideoCastManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void onApplicationDisconnected(int i)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onApplicationDisconnected() reached with error code: ")).append(i).toString());
        updateMediaSession(false);
        if (mMediaSessionCompat != null && isFeatureEnabled(2))
        {
            mMediaRouter.setMediaSessionCompat(null);
        }
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onApplicationDisconnected(i)) { }
        if (mMediaRouter != null)
        {
            LogUtils.LOGD(TAG, (new StringBuilder("onApplicationDisconnected(): Cached RouteInfo: ")).append(getRouteInfo()).toString());
            LogUtils.LOGD(TAG, (new StringBuilder("onApplicationDisconnected(): Selected RouteInfo: ")).append(mMediaRouter.getSelectedRoute()).toString());
            if (getRouteInfo() == null || mMediaRouter.getSelectedRoute().equals(getRouteInfo()))
            {
                LogUtils.LOGD(TAG, "onApplicationDisconnected(): Setting route to default");
                mMediaRouter.selectRoute(mMediaRouter.getDefaultRoute());
            }
        }
        onDeviceSelected(null);
        updateMiniControllersVisibility(false);
        stopNotificationService();
    }

    private void onApplicationStatusChanged()
    {
        if (isConnected()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            String s = a.b.d(mApiClient);
            LogUtils.LOGD(TAG, (new StringBuilder("onApplicationStatusChanged() reached: ")).append(s).toString());
            Iterator iterator = mVideoConsumers.iterator();
            while (iterator.hasNext()) 
            {
                ((VideoCastConsumer)iterator.next()).onApplicationStatusChanged(s);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            LogUtils.LOGE(TAG, "onApplicationStatusChanged()", illegalstateexception);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void onMessageSendFailed(int i)
    {
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onDataMessageSendFailed(i)) { }
    }

    private void onQueueUpdated(List list, o o1, int i, boolean flag)
    {
        LogUtils.LOGD(TAG, "onQueueUpdated() reached");
        Object obj = TAG;
        int j;
        if (list == null)
        {
            j = 0;
        } else
        {
            j = list.size();
        }
        LogUtils.LOGD(((String) (obj)), String.format("Queue Items size: %d, Item: %s, Repeat Mode: %d, Shuffle: %s", new Object[] {
            Integer.valueOf(j), o1, Integer.valueOf(i), Boolean.valueOf(flag)
        }));
        if (list != null)
        {
            mMediaQueue = new MediaQueue(new CopyOnWriteArrayList(list), o1, flag, i);
        } else
        {
            mMediaQueue = new MediaQueue(new CopyOnWriteArrayList(), null, false, 0);
        }
        for (obj = mVideoConsumers.iterator(); ((Iterator) (obj)).hasNext(); ((VideoCastConsumer)((Iterator) (obj)).next()).onMediaQueueUpdated(list, o1, i, flag)) { }
    }

    private void onRemoteMediaPlayerStatusUpdated()
    {
        boolean flag2;
        flag2 = true;
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated() reached");
        if (mApiClient != null && mRemoteMediaPlayer != null && mRemoteMediaPlayer.c() != null) goto _L2; else goto _L1
_L1:
        LogUtils.LOGD(TAG, "mApiClient or mRemoteMediaPlayer is null, so will not proceed");
_L7:
        return;
_L2:
        mMediaStatus = mRemoteMediaPlayer.c();
        Object obj = mMediaStatus.a();
        if (obj != null)
        {
            int i = mMediaStatus.a;
            onQueueUpdated(((List) (obj)), mMediaStatus.a(i), mMediaStatus.m.a, false);
        } else
        {
            onQueueUpdated(null, null, 0, false);
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            o o1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); LogUtils.LOGD(TAG, (new StringBuilder("[queue] Queue Item is: ")).append(o1.a()).toString()))
            {
                o1 = (o)((Iterator) (obj)).next();
            }

        }
        mState = mMediaStatus.e;
        mIdleReason = mMediaStatus.f;
        double d1;
        boolean flag3;
        d1 = getVolume();
        flag3 = isMute();
        if (mState != 2) goto _L4; else goto _L3
_L3:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): Player status = playing");
        updateMediaSession(true);
        startReconnectionService(getMediaTimeRemaining());
        startNotificationService();
        boolean flag1 = false;
_L8:
        if (!flag1) goto _L6; else goto _L5
_L5:
        stopNotificationService();
          goto _L6
_L22:
        updateMiniControllersVisibility(flag2);
        updateMiniControllers();
        Iterator iterator = mVideoConsumers.iterator();
        while (iterator.hasNext()) 
        {
            VideoCastConsumer videocastconsumer = (VideoCastConsumer)iterator.next();
            videocastconsumer.onRemoteMediaPlayerStatusUpdated();
            videocastconsumer.onVolumeChanged(d1, flag3);
        }
          goto _L7
        Object obj1;
        obj1;
_L23:
        LogUtils.LOGE(TAG, "Failed to get volume state due to network issues", ((Throwable) (obj1)));
        return;
_L4:
        if (mState != 3)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): Player status = paused");
        updateMediaSession(false);
        startNotificationService();
        flag1 = false;
          goto _L8
        if (mState != 1) goto _L10; else goto _L9
_L9:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): Player status = idle");
        updateMediaSession(false);
        mIdleReason;
        JVM INSTR tableswitch 1 4: default 608
    //                   1 477
    //                   2 514
    //                   3 536
    //                   4 487;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        LogUtils.LOGE(TAG, (new StringBuilder("onRemoteMediaPlayerStatusUpdated(): Unexpected Idle Reason ")).append(mIdleReason).toString());
          goto _L16
_L18:
        boolean flag;
        flag1 = flag;
        if (!flag) goto _L8; else goto _L17
_L17:
        stopReconnectionService();
        flag1 = flag;
          goto _L8
_L12:
        clearMediaSession();
        flag = true;
          goto _L18
_L15:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): IDLE reason = ERROR");
        clearMediaSession();
        onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_receiver_player_error, -1);
        flag = true;
          goto _L18
_L13:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): IDLE reason = CANCELLED");
        if (!isRemoteStreamLive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L18
_L14:
        if (mMediaStatus.k != 0) goto _L16; else goto _L19
_L19:
        clearMediaSession();
        flag = true;
          goto _L18
_L10:
        if (mState != 4) goto _L21; else goto _L20
_L20:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): Player status = buffering");
        flag1 = false;
          goto _L8
_L21:
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerStatusUpdated(): Player status = unknown");
        flag1 = true;
          goto _L8
_L6:
        while (flag1) 
        {
            flag2 = false;
            break;
        }
          goto _L22
_L16:
        flag = false;
          goto _L18
        obj1;
          goto _L23
    }

    private void onRemoteMediaPreloadStatusUpdated()
    {
        mMediaStatus = mRemoteMediaPlayer.c();
        o o1;
        if (mMediaStatus != null)
        {
            o1 = mMediaStatus.a(mMediaStatus.l);
        } else
        {
            o1 = null;
        }
        mPreLoadingItem = o1;
        updateMiniControllersVisibilityForUpcoming(o1);
        LogUtils.LOGD(TAG, (new StringBuilder("onRemoteMediaPreloadStatusUpdated() ")).append(o1).toString());
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onRemoteMediaPreloadStatusUpdated(o1)) { }
    }

    private void onVolumeChanged()
    {
        LogUtils.LOGD(TAG, "onVolumeChanged() reached");
        double d1 = getVolume();
        boolean flag = isMute();
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onVolumeChanged(d1, flag)) { }
          goto _L1
        Object obj;
        obj;
_L3:
        LogUtils.LOGE(TAG, "Failed to get volume", ((Throwable) (obj)));
_L1:
        return;
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void reattachDataChannel()
    {
        if (TextUtils.isEmpty(mDataNamespace) || mDataChannel == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a.b.a(mApiClient, mDataNamespace, mDataChannel);
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, "reattachDataChannel()", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void reattachMediaChannel()
    {
        if (mRemoteMediaPlayer == null || mApiClient == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        LogUtils.LOGD(TAG, "Registering MediaChannel namespace");
        a.b.a(mApiClient, ((d) (mRemoteMediaPlayer.b)).g, mRemoteMediaPlayer);
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, "reattachMediaChannel()", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void registerCaptionListener(Context context)
    {
        if (Utils.IS_KITKAT_OR_ABOVE)
        {
            ((CaptioningManager)context.getSystemService("captioning")).addCaptioningChangeListener(new _cls33());
        }
    }

    private void restartProgressTimer()
    {
        stopProgressTimer();
        mProgressTimer = new Timer();
        mProgressTask = new UpdateProgressTask(null);
        mProgressTimer.scheduleAtFixedRate(mProgressTask, 100L, PROGRESS_UPDATE_INTERVAL_MS);
        LogUtils.LOGD(TAG, "Restarted Progress Timer");
    }

    private void setBitmapForLockScreen(m m1)
    {
        Bitmap bitmap = null;
        if (m1 == null || mMediaSessionCompat == null)
        {
            return;
        }
        m1 = m1.d.a;
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            if (m1.size() > 1)
            {
                m1 = ((WebImage)m1.get(1)).getUrl();
            } else
            if (m1.size() == 1)
            {
                m1 = ((WebImage)m1.get(0)).getUrl();
            } else
            if (mContext != null)
            {
                bitmap = BitmapFactory.decodeResource(mContext.getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder_large);
                m1 = null;
            } else
            {
                m1 = null;
            }
        } else
        if (!m1.isEmpty())
        {
            m1 = ((WebImage)m1.get(0)).getUrl();
        } else
        {
            bitmap = BitmapFactory.decodeResource(mContext.getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder);
            m1 = null;
        }
        if (bitmap != null)
        {
            m1 = mMediaSessionCompat.getController().getMetadata();
            if (m1 == null)
            {
                m1 = new android.support.v4.media.MediaMetadataCompat.Builder();
            } else
            {
                m1 = new android.support.v4.media.MediaMetadataCompat.Builder(m1);
            }
            mMediaSessionCompat.setMetadata(m1.putBitmap("android.media.metadata.ALBUM_ART", bitmap).build());
            return;
        } else
        {
            (new _cls29()).execute(m1);
            return;
        }
    }

    private void setFlagForStartCastControllerActivity()
    {
        mPreferenceAccessor.saveBooleanToPreference("ccl-start-cast-activity", Boolean.valueOf(true));
    }

    private void setUpMediaSession(m m1)
    {
        if (!isFeatureEnabled(2))
        {
            return;
        }
        if (mMediaSessionCompat == null)
        {
            mMediaEventReceiver = new ComponentName(mContext, com/google/android/libraries/cast/companionlibrary/remotecontrol/VideoIntentReceiver.getName());
            mMediaSessionCompat = new MediaSessionCompat(mContext, "TAG", mMediaEventReceiver, null);
            mMediaSessionCompat.setFlags(3);
            mMediaSessionCompat.setActive(true);
            mMediaSessionCompat.setCallback(new _cls28());
        }
        mAudioManager.requestAudioFocus(null, 3, 3);
        mMediaSessionCompat.setPlaybackState((new android.support.v4.media.session.PlaybackStateCompat.Builder()).setState(3, 0L, 1.0F).setActions(512L).build());
        updateLockScreenImage(m1);
        updateMediaSessionMetadata();
        mMediaRouter.setMediaSessionCompat(mMediaSessionCompat);
    }

    private boolean startNotificationService()
    {
        if (isFeatureEnabled(4))
        {
            LogUtils.LOGD(TAG, "startNotificationService()");
            Intent intent = new Intent(mContext, com/google/android/libraries/cast/companionlibrary/notification/VideoCastNotificationService);
            intent.setPackage(mContext.getPackageName());
            intent.setAction("com.google.android.libraries.cast.companionlibrary.action.notificationvisibility");
            boolean flag;
            if (!mUiVisible)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.putExtra("visible", flag);
            if (mContext.startService(intent) == null)
            {
                return false;
            }
        }
        return true;
    }

    private void stopNotificationService()
    {
        while (!isFeatureEnabled(4) || mContext == null) 
        {
            return;
        }
        mContext.stopService(new Intent(mContext, com/google/android/libraries/cast/companionlibrary/notification/VideoCastNotificationService));
    }

    private void stopProgressTimer()
    {
        LogUtils.LOGD(TAG, "Stopped TrickPlay Timer");
        if (mProgressTask != null)
        {
            mProgressTask.cancel();
            mProgressTask = null;
        }
        if (mProgressTimer != null)
        {
            mProgressTimer.cancel();
            mProgressTimer = null;
        }
    }

    private void updateLockScreenImage(m m1)
    {
        if (m1 == null)
        {
            return;
        } else
        {
            setBitmapForLockScreen(m1);
            return;
        }
    }

    private void updateMediaSession(boolean flag)
    {
_L2:
        return;
        if (!isFeatureEnabled(2) || !isConnected()) goto _L2; else goto _L1
_L1:
        if (mMediaSessionCompat != null || !flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        setUpMediaSession(getRemoteMediaInformation());
        if (mMediaSessionCompat == null) goto _L2; else goto _L3
_L3:
        Object obj;
        byte byte0;
        if (isRemoteStreamLive())
        {
            byte0 = 6;
        } else
        {
            byte0 = 3;
        }
          goto _L4
_L6:
        mMediaSessionCompat.setPlaybackState((new android.support.v4.media.session.PlaybackStateCompat.Builder()).setState(byte0, 0L, 1.0F).setActions(512L).build());
        return;
        obj;
_L5:
        LogUtils.LOGE(TAG, "Failed to set up MediaSessionCompat due to network issues", ((Throwable) (obj)));
        return;
_L7:
        byte0 = 2;
        break; /* Loop/switch isn't completed */
        obj;
          goto _L5
_L4:
        if (!flag) goto _L7; else goto _L6
    }

    private void updateMediaSessionMetadata()
    {
        if (mMediaSessionCompat != null && isFeatureEnabled(2)) goto _L2; else goto _L1
_L1:
        m m1;
        return;
_L2:
        if ((m1 = getRemoteMediaInformation()) == null) goto _L1; else goto _L3
_L3:
        Object obj;
        n n1;
        n1 = m1.d;
        obj = mMediaSessionCompat.getController().getMetadata();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj = new android.support.v4.media.MediaMetadataCompat.Builder();
_L4:
        mMediaSessionCompat.setMetadata(((android.support.v4.media.MediaMetadataCompat.Builder) (obj)).putString("android.media.metadata.TITLE", n1.a("com.google.android.gms.cast.metadata.TITLE")).putString("android.media.metadata.ALBUM_ARTIST", mContext.getResources().getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
            getDeviceName()
        })).putLong("android.media.metadata.DURATION", m1.e).build());
        return;
        obj;
        LogUtils.LOGE(TAG, "Failed to update Media Session due to resource not found", ((Throwable) (obj)));
        return;
        obj = new android.support.v4.media.MediaMetadataCompat.Builder(((android.support.v4.media.MediaMetadataCompat) (obj)));
          goto _L4
        Object obj1;
        obj1;
_L6:
        LogUtils.LOGE(TAG, "Failed to update Media Session due to network issues", ((Throwable) (obj1)));
        return;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateMiniController(IMiniController iminicontroller)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        checkRemoteMediaPlayerAvailable();
        if (mRemoteMediaPlayer.b() > 0L || isRemoteStreamLive())
        {
            m m1 = getRemoteMediaInformation();
            n n1 = m1.d;
            iminicontroller.setStreamType(m1.b);
            iminicontroller.setPlaybackStatus(mState, mIdleReason);
            iminicontroller.setSubtitle(mContext.getResources().getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
                mDeviceName
            }));
            iminicontroller.setTitle(n1.a("com.google.android.gms.cast.metadata.TITLE"));
            iminicontroller.setIcon(Utils.getImageUri(m1, 0));
        }
    }

    private void updateMiniControllers()
    {
        Set set = mMiniControllers;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = mMiniControllers.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        IMiniController iminicontroller = (IMiniController)iterator.next();
        updateMiniController(iminicontroller);
          goto _L3
        Object obj;
        obj;
_L4:
        LogUtils.LOGE(TAG, "updateMiniControllers() Failed to update mini controller", ((Throwable) (obj)));
          goto _L3
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        set;
        JVM INSTR monitorexit ;
        return;
        obj;
          goto _L4
    }

    private void updateProgress(int i, int j)
    {
        Set set = mMiniControllers;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mMiniControllers.iterator(); iterator.hasNext(); ((IMiniController)iterator.next()).setProgress(i, j)) { }
        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        set;
        JVM INSTR monitorexit ;
    }

    public void addMiniController(IMiniController iminicontroller)
    {
        addMiniController(iminicontroller, null);
    }

    public void addMiniController(IMiniController iminicontroller, com.google.android.libraries.cast.companionlibrary.widgets.MiniController.OnMiniControllerChangedListener onminicontrollerchangedlistener)
    {
        if (iminicontroller == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        synchronized (mMiniControllers)
        {
            flag = mMiniControllers.add(iminicontroller);
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = onminicontrollerchangedlistener;
        if (onminicontrollerchangedlistener == null)
        {
            obj = this;
        }
        iminicontroller.setOnMiniControllerChangedListener(((com.google.android.libraries.cast.companionlibrary.widgets.MiniController.OnMiniControllerChangedListener) (obj)));
        if (isConnected() && isRemoteMediaLoaded())
        {
            updateMiniController(iminicontroller);
            iminicontroller.setVisibility(0);
        }
_L5:
        LogUtils.LOGD(TAG, (new StringBuilder("Successfully added the new MiniController ")).append(iminicontroller).toString());
_L2:
        return;
        iminicontroller;
        obj;
        JVM INSTR monitorexit ;
        throw iminicontroller;
        onminicontrollerchangedlistener;
_L6:
        LogUtils.LOGE(TAG, "Failed to get the status of media playback on receiver", onminicontrollerchangedlistener);
        if (true) goto _L5; else goto _L4
_L4:
        LogUtils.LOGD(TAG, (new StringBuilder("Attempting to adding ")).append(iminicontroller).append(" but it was already registered, skipping this step").toString());
        return;
        onminicontrollerchangedlistener;
          goto _L6
    }

    public void addTracksSelectedListener(OnTracksSelectedListener ontracksselectedlistener)
    {
        if (ontracksselectedlistener != null)
        {
            mTracksSelectedListeners.add(ontracksselectedlistener);
        }
    }

    public void addVideoCastConsumer(VideoCastConsumer videocastconsumer)
    {
        this;
        JVM INSTR monitorenter ;
        if (videocastconsumer == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        addBaseCastConsumer(videocastconsumer);
        mVideoConsumers.add(videocastconsumer);
        LogUtils.LOGD(TAG, (new StringBuilder("Successfully added the new CastConsumer listener ")).append(videocastconsumer).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        videocastconsumer;
        throw videocastconsumer;
    }

    public void adjustVolume(double d1)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        double d2;
        d2 = 1.0D;
        checkConnectivity();
        d1 = getVolume() + d1;
        if (d1 <= 1.0D) goto _L2; else goto _L1
_L1:
        d1 = d2;
_L4:
        setVolume(d1);
        return;
_L2:
        if (d1 < 0.0D)
        {
            d1 = 0.0D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void clearMediaSession()
    {
        LogUtils.LOGD(TAG, "clearMediaSession()");
        if (isFeatureEnabled(2))
        {
            mAudioManager.abandonAudioFocus(null);
            if (mMediaSessionCompat != null)
            {
                mMediaSessionCompat.setActive(false);
                mMediaSessionCompat.release();
                mMediaSessionCompat = null;
            }
        }
    }

    public long[] getActiveTrackIds()
    {
        if (mRemoteMediaPlayer != null && mRemoteMediaPlayer.c() != null)
        {
            return mRemoteMediaPlayer.c().j;
        } else
        {
            return null;
        }
    }

    protected com.google.android.gms.cast.a.c.a getCastOptionBuilder(CastDevice castdevice)
    {
        castdevice = com.google.android.gms.cast.a.c.a(mSelectedCastDevice, new CastListener());
        if (isFeatureEnabled(1))
        {
            castdevice.a();
        }
        return castdevice;
    }

    public long getCurrentMediaPosition()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        checkRemoteMediaPlayerAvailable();
        return mRemoteMediaPlayer.a();
    }

    protected String getDataNamespace()
    {
        return null;
    }

    public int getIdleReason()
    {
        return mIdleReason;
    }

    public MediaAuthService getMediaAuthService()
    {
        return mAuthService;
    }

    public long getMediaDuration()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        checkRemoteMediaPlayerAvailable();
        return mRemoteMediaPlayer.b();
    }

    public final MediaQueue getMediaQueue()
    {
        return mMediaQueue;
    }

    protected MediaRouteDialogFactory getMediaRouteDialogFactory()
    {
        return new VideoMediaRouteDialogFactory();
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionCompatToken()
    {
        if (mMediaSessionCompat == null)
        {
            return null;
        } else
        {
            return mMediaSessionCompat.getSessionToken();
        }
    }

    public final p getMediaStatus()
    {
        return mMediaStatus;
    }

    public long getMediaTimeRemaining()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            return -1L;
        }
        if (isRemoteStreamLive())
        {
            return mLiveStreamDuration;
        } else
        {
            return mRemoteMediaPlayer.b() - mRemoteMediaPlayer.a();
        }
    }

    public int getPlaybackStatus()
    {
        return mState;
    }

    public o getPreLoadingItem()
    {
        return mPreLoadingItem;
    }

    public m getRemoteMediaInformation()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        checkRemoteMediaPlayerAvailable();
        return mRemoteMediaPlayer.d();
    }

    public final r getRemoteMediaPlayer()
    {
        return mRemoteMediaPlayer;
    }

    public String getRemoteMediaUrl()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer != null && mRemoteMediaPlayer.d() != null)
        {
            m m1 = mRemoteMediaPlayer.d();
            mRemoteMediaPlayer.c();
            return m1.a;
        } else
        {
            throw new NoConnectionException();
        }
    }

    public Class getTargetActivity()
    {
        return mTargetActivity;
    }

    public TracksPreferenceManager getTracksPreferenceManager()
    {
        return mTrackManager;
    }

    public double getVolume()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mVolumeType == VolumeType.STREAM)
        {
            checkRemoteMediaPlayerAvailable();
            return mRemoteMediaPlayer.c().h;
        } else
        {
            return getDeviceVolume();
        }
    }

    public double getVolumeStep()
    {
        return mVolumeStep;
    }

    public boolean isMute()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mVolumeType == VolumeType.STREAM)
        {
            checkRemoteMediaPlayerAvailable();
            return mRemoteMediaPlayer.c().i;
        } else
        {
            return isDeviceMute();
        }
    }

    public boolean isRemoteMediaLoaded()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        return isRemoteMediaPaused() || isRemoteMediaPlaying();
    }

    public boolean isRemoteMediaPaused()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        return mState == 3;
    }

    public boolean isRemoteMediaPlaying()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        return mState == 4 || mState == 2;
    }

    public final boolean isRemoteStreamLive()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        m m1 = getRemoteMediaInformation();
        return m1 != null && m1.b == 2;
    }

    public void loadMedia(m m1, boolean flag, int i)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        loadMedia(m1, flag, i, null);
    }

    public void loadMedia(m m1, boolean flag, int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        loadMedia(m1, null, flag, i, jsonobject);
    }

    public void loadMedia(m m1, long al[], boolean flag, int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "loadMedia");
        checkConnectivity();
        if (m1 == null)
        {
            return;
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to load a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new v(r1, googleapiclient, googleapiclient, m1, flag, i, al, jsonobject)).setResultCallback(new _cls3());
            return;
        }
    }

    public void notifyTracksSelectedListeners(List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("tracks must not be null");
        }
        for (Iterator iterator = mTracksSelectedListeners.iterator(); iterator.hasNext(); ((OnTracksSelectedListener)iterator.next()).onTracksSelected(list)) { }
    }

    protected void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
label0:
        {
            LogUtils.LOGD(TAG, (new StringBuilder("onApplicationConnected() reached with sessionId: ")).append(s1).append(", and mReconnectionStatus=").append(mReconnectionStatus).toString());
            if (mReconnectionStatus != 2)
            {
                break label0;
            }
            Object obj = mMediaRouter.getRoutes();
            if (obj == null)
            {
                break label0;
            }
            s = mPreferenceAccessor.getStringFromPreference("route-id");
            obj = ((List) (obj)).iterator();
            android.support.v7.media.MediaRouter.RouteInfo routeinfo;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)((Iterator) (obj)).next();
            } while (!s.equals(routeinfo.getId()));
            LogUtils.LOGD(TAG, "Found the correct route during reconnection attempt");
            mReconnectionStatus = 3;
            mMediaRouter.selectRoute(routeinfo);
        }
        startNotificationService();
        try
        {
            attachDataChannel();
            attachMediaChannel();
            mSessionId = s1;
            mPreferenceAccessor.saveStringToPreference("session-id", mSessionId);
            s = mRemoteMediaPlayer;
            s1 = mApiClient;
            s1.zzb(new G(s, s1, s1)).setResultCallback(new _cls2());
            for (s = mVideoConsumers.iterator(); s.hasNext(); ((VideoCastConsumer)s.next()).onApplicationConnected(applicationmetadata, mSessionId, flag)) { }
        }
        // Misplaced declaration of an exception variable
        catch (ApplicationMetadata applicationmetadata)
        {
            LogUtils.LOGE(TAG, "Failed to attach media/data channel due to network issues", applicationmetadata);
            onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection_trans, -1);
        }
        // Misplaced declaration of an exception variable
        catch (ApplicationMetadata applicationmetadata)
        {
            LogUtils.LOGE(TAG, "Failed to attach media/data channel due to network issues", applicationmetadata);
            onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection, -1);
            return;
        }
    }

    public void onApplicationConnectionFailed(int i)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onApplicationConnectionFailed() reached with errorCode: ")).append(i).toString());
        if (mReconnectionStatus == 2)
        {
            if (i == 2005)
            {
                mReconnectionStatus = 4;
                onDeviceSelected(null);
            }
        } else
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onApplicationConnectionFailed(i)) { }
            onDeviceSelected(null);
            if (mMediaRouter != null)
            {
                LogUtils.LOGD(TAG, "onApplicationConnectionFailed(): Setting route to default");
                mMediaRouter.selectRoute(mMediaRouter.getDefaultRoute());
                return;
            }
        }
    }

    public void onApplicationStopFailed(int i)
    {
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onApplicationStopFailed(i)) { }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        updateMediaSession(false);
        stopNotificationService();
    }

    public void onConnectivityRecovered()
    {
        reattachMediaChannel();
        reattachDataChannel();
        super.onConnectivityRecovered();
    }

    protected void onDeviceUnselected()
    {
        stopNotificationService();
        detachMediaChannel();
        removeDataChannel();
        mState = 1;
    }

    public void onDisconnected(boolean flag, boolean flag1, boolean flag2)
    {
        super.onDisconnected(flag, flag1, flag2);
        updateMiniControllersVisibility(false);
        if (flag1 && !mConnectionSuspended)
        {
            clearMediaSession();
        }
        mState = 1;
        mMediaQueue = null;
    }

    public boolean onDispatchVolumeKeyEvent(KeyEvent keyevent, double d1)
    {
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        keyevent.getKeyCode();
        JVM INSTR tableswitch 24 25: default 44
    //                   24 52
    //                   25 64;
           goto _L2 _L3 _L4
_L2:
        return false;
_L3:
        if (changeVolume(d1, flag))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (changeVolume(-d1, flag))
        {
            return true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onFailed(int i, int j)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onFailed: ")).append(mContext.getString(i)).append(", code: ").append(j).toString());
        super.onFailed(i, j);
    }

    protected void onFeaturesUpdated(int i)
    {
        if (isFeatureEnabled(16))
        {
            mTrackManager = new TracksPreferenceManager(mContext.getApplicationContext());
            registerCaptionListener(mContext.getApplicationContext());
        }
    }

    public void onMediaRouteDialogCellClick(Context context)
    {
        if (mMediaRouteDialogListener != null)
        {
            mMediaRouteDialogListener.onMediaRouteDialogCellClick(context);
        }
    }

    public void onPlayPauseClicked(View view)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mState == 2)
        {
            pause();
        } else
        {
            boolean flag = isRemoteStreamLive();
            if (mState == 3 && !flag || mState == 1 && flag)
            {
                play();
                return;
            }
        }
    }

    public void onRemoteMediaPlayerMetadataUpdated()
    {
        LogUtils.LOGD(TAG, "onRemoteMediaPlayerMetadataUpdated() reached");
        updateMediaSessionMetadata();
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onRemoteMediaPlayerMetadataUpdated()) { }
        updateLockScreenImage(getRemoteMediaInformation());
        return;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, "Failed to update lock screen metadata due to a network issue", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onTargetActivityInvoked(Context context)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        Intent intent = new Intent(context, mTargetActivity);
        intent.putExtra("media", Utils.mediaInfoToBundle(getRemoteMediaInformation()));
        context.startActivity(intent);
    }

    public void onTextTrackEnabledChanged(boolean flag)
    {
        LogUtils.LOGD(TAG, "onTextTrackEnabledChanged() reached");
        if (!flag)
        {
            setActiveTrackIds(new long[0]);
        }
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onTextTrackEnabledChanged(flag)) { }
    }

    public void onTextTrackLocaleChanged(Locale locale)
    {
        LogUtils.LOGD(TAG, "onTextTrackLocaleChanged() reached");
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onTextTrackLocaleChanged(locale)) { }
    }

    public void onTextTrackStyleChanged(Q q)
    {
        LogUtils.LOGD(TAG, "onTextTrackStyleChanged() reached");
        if (mRemoteMediaPlayer != null && mRemoteMediaPlayer.d() != null)
        {
            mRemoteMediaPlayer.a(mApiClient, q).setResultCallback(new _cls32());
            Iterator iterator = mVideoConsumers.iterator();
            while (iterator.hasNext()) 
            {
                VideoCastConsumer videocastconsumer = (VideoCastConsumer)iterator.next();
                try
                {
                    videocastconsumer.onTextTrackStyleChanged(q);
                }
                catch (Exception exception)
                {
                    LogUtils.LOGE(TAG, (new StringBuilder("onTextTrackStyleChanged(): Failed to inform ")).append(videocastconsumer).toString(), exception);
                }
            }
        }
    }

    public void onUpcomingPlayClicked(View view, o o1)
    {
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onUpcomingPlayClicked(view, o1)) { }
    }

    public void onUpcomingStopClicked(View view, o o1)
    {
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onUpcomingStopClicked(view, o1)) { }
    }

    public void pause()
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        pause(null);
    }

    public void pause(JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "attempting to pause media");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to pause a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new z(r1, googleapiclient, googleapiclient, jsonobject)).setResultCallback(new _cls19());
            return;
        }
    }

    public void play()
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        play(((JSONObject) (null)));
    }

    public void play(int i)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        LogUtils.LOGD(TAG, (new StringBuilder("attempting to play media at position ")).append(i).append(" seconds").toString());
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to play a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            seekAndPlay(i);
            return;
        }
    }

    public void play(JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "play(customData)");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to play a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new B(r1, googleapiclient, googleapiclient, jsonobject)).setResultCallback(new _cls17());
            return;
        }
    }

    public void queueAppendItem(o o1, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        mRemoteMediaPlayer.a(mApiClient, new o[] {
            o1
        }, 0, jsonobject).setResultCallback(new _cls12());
    }

    public void queueInsertBeforeCurrentAndPlay(o o1, int i, final JSONObject customData)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to insert into queue with no active media session");
            throw new NoConnectionException();
        }
        if (o1 == null || i == 0)
        {
            throw new IllegalArgumentException("item cannot be empty or insertBeforeItemId cannot be invalid");
        } else
        {
            mRemoteMediaPlayer.a(mApiClient, new o[] {
                o1
            }, i, customData).setResultCallback(new _cls15());
            return;
        }
    }

    public void queueInsertItems(o ao[], int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "queueInsertItems");
        checkConnectivity();
        if (ao == null || ao.length == 0)
        {
            throw new IllegalArgumentException("items cannot be empty or null");
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to insert into queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            mRemoteMediaPlayer.a(mApiClient, ao, i, jsonobject).setResultCallback(new _cls5());
            return;
        }
    }

    public void queueJumpToItem(int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException, IllegalArgumentException
    {
        checkConnectivity();
        if (i == 0)
        {
            throw new IllegalArgumentException("itemId is not valid");
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to jump in a queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new x(r1, googleapiclient, i, googleapiclient, jsonobject)).setResultCallback(new _cls7());
            return;
        }
    }

    public void queueLoad(o ao[], int i, int j, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "queueLoad");
        checkConnectivity();
        if (ao == null || ao.length == 0)
        {
            return;
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to queue one or more videos with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new I(r1, googleapiclient, googleapiclient, ao, i, j, jsonobject)).setResultCallback(new _cls4());
            return;
        }
    }

    public void queueMoveItemToNewIndex(int i, int j, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        r r1 = mRemoteMediaPlayer;
        GoogleApiClient googleapiclient = mApiClient;
        googleapiclient.zzb(new y(r1, googleapiclient, i, j, googleapiclient, jsonobject)).setResultCallback(new _cls11());
    }

    public void queueNext(JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to update the queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new t(r1, googleapiclient, googleapiclient, jsonobject)).setResultCallback(new _cls13());
            return;
        }
    }

    public void queuePrev(JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to update the queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new N(r1, googleapiclient, googleapiclient, jsonobject)).setResultCallback(new _cls14());
            return;
        }
    }

    public void queueRemoveItem(int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException, IllegalArgumentException
    {
        LogUtils.LOGD(TAG, "queueRemoveItem");
        checkConnectivity();
        if (i == 0)
        {
            throw new IllegalArgumentException("itemId is invalid");
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to remove an item from queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new w(r1, googleapiclient, i, googleapiclient, jsonobject)).setResultCallback(new _cls9());
            return;
        }
    }

    public void queueRemoveItems(int ai[], JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException, IllegalArgumentException
    {
        LogUtils.LOGD(TAG, "queueRemoveItems");
        checkConnectivity();
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("itemIds cannot be empty or null");
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to remove items from queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new L(r1, googleapiclient, googleapiclient, ai, jsonobject)).setResultCallback(new _cls8());
            return;
        }
    }

    public void queueReorderItems(int ai[], int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException, IllegalArgumentException
    {
        LogUtils.LOGD(TAG, "queueReorderItems");
        checkConnectivity();
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("itemIdsToReorder cannot be empty or null");
        }
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to reorder items in a queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new M(r1, googleapiclient, googleapiclient, ai, i, jsonobject)).setResultCallback(new _cls10());
            return;
        }
    }

    public void queueSetRepeatMode(int i, JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to update the queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new u(r1, googleapiclient, googleapiclient, i, jsonobject)).setResultCallback(new _cls16());
            return;
        }
    }

    public void queueUpdateItems(o ao[], JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to update the queue with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new K(r1, googleapiclient, googleapiclient, ao, jsonobject)).setResultCallback(new _cls6());
            return;
        }
    }

    public boolean removeDataChannel()
    {
        if (TextUtils.isEmpty(mDataNamespace))
        {
            return false;
        }
        if (mApiClient != null)
        {
            a.b.c(mApiClient, mDataNamespace);
        }
        mDataChannel = null;
        mPreferenceAccessor.saveStringToPreference("cast-custom-data-namespace", null);
        return true;
        Object obj;
        obj;
_L2:
        LogUtils.LOGE(TAG, (new StringBuilder("removeDataChannel() failed to remove namespace ")).append(mDataNamespace).toString(), ((Throwable) (obj)));
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void removeMediaAuthService()
    {
        mAuthService = null;
    }

    public void removeMiniController(IMiniController iminicontroller)
    {
        if (iminicontroller != null)
        {
            synchronized (mMiniControllers)
            {
                mMiniControllers.remove(iminicontroller);
            }
            return;
        } else
        {
            return;
        }
        iminicontroller;
        set;
        JVM INSTR monitorexit ;
        throw iminicontroller;
    }

    public void removeTracksSelectedListener(OnTracksSelectedListener ontracksselectedlistener)
    {
        if (ontracksselectedlistener != null)
        {
            mTracksSelectedListeners.remove(ontracksselectedlistener);
        }
    }

    public void removeVideoCastConsumer(VideoCastConsumer videocastconsumer)
    {
        this;
        JVM INSTR monitorenter ;
        if (videocastconsumer == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        removeBaseCastConsumer(videocastconsumer);
        mVideoConsumers.remove(videocastconsumer);
        this;
        JVM INSTR monitorexit ;
        return;
        videocastconsumer;
        throw videocastconsumer;
    }

    public void seek(int i)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "attempting to seek media");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to seek a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            mRemoteMediaPlayer.a(mApiClient, i, 0).setResultCallback(new _cls20());
            return;
        }
    }

    public void seekAndPlay(int i)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "attempting to seek media");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to seekAndPlay a video with no active media session");
            throw new NoConnectionException();
        } else
        {
            _cls21 _lcls21 = new _cls21();
            mRemoteMediaPlayer.a(mApiClient, i, 1).setResultCallback(_lcls21);
            return;
        }
    }

    public void sendDataMessage(String s)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        if (TextUtils.isEmpty(mDataNamespace))
        {
            throw new IllegalStateException("No Data Namespace is configured");
        } else
        {
            checkConnectivity();
            a.b.a(mApiClient, mDataNamespace, s).setResultCallback(new _cls27());
            return;
        }
    }

    public void setActiveTrackIds(long al[])
    {
        if (mRemoteMediaPlayer == null || mRemoteMediaPlayer.d() == null)
        {
            return;
        }
        r r1 = mRemoteMediaPlayer;
        GoogleApiClient googleapiclient = mApiClient;
        if (al == null)
        {
            throw new IllegalArgumentException("trackIds cannot be null");
        } else
        {
            googleapiclient.zzb(new D(r1, googleapiclient, googleapiclient, al)).setResultCallback(new _cls30());
            return;
        }
    }

    public void setCastControllerImmersive(boolean flag)
    {
        mPreferenceAccessor.saveBooleanToPreference("ccl-cast-contoller-immersive", Boolean.valueOf(flag));
    }

    public void setLiveStreamDuration(long l)
    {
        mLiveStreamDuration = l;
    }

    public void setMediaAuthService(MediaAuthService mediaauthservice)
    {
        mAuthService = mediaauthservice;
    }

    public void setMediaRouteDialogListener(MediaRouteDialogListener mediaroutedialoglistener)
    {
        mMediaRouteDialogListener = mediaroutedialoglistener;
    }

    public void setMute(boolean flag)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (mVolumeType == VolumeType.STREAM)
        {
            checkRemoteMediaPlayerAvailable();
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new F(r1, googleapiclient, googleapiclient, flag));
            return;
        } else
        {
            setDeviceMute(flag);
            return;
        }
    }

    public void setNextPreviousVisibilityPolicy(int i)
    {
        switch (i)
        {
        default:
            LogUtils.LOGD(TAG, "Invalid value for the NextPreviousVisibilityPolicy was requested");
            throw new IllegalArgumentException("Invalid value for the NextPreviousVisibilityPolicy was requested");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            mNextPreviousVisibilityPolicy = i;
            break;
        }
        mPreferenceAccessor.saveIntToPreference("ccl-next-prev-policy", Integer.valueOf(i));
    }

    public void setTextTrackStyle(Q q)
    {
        mRemoteMediaPlayer.a(mApiClient, q).setResultCallback(new _cls31());
        for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext();)
        {
            VideoCastConsumer videocastconsumer = (VideoCastConsumer)iterator.next();
            try
            {
                videocastconsumer.onTextTrackStyleChanged(q);
            }
            catch (Exception exception)
            {
                LogUtils.LOGE(TAG, (new StringBuilder("onTextTrackStyleChanged(): Failed to inform ")).append(videocastconsumer).toString(), exception);
            }
        }

    }

    public void setVolume(double d1)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        double d2 = 1.0D;
        checkConnectivity();
        if (d1 > 1.0D)
        {
            d1 = d2;
        } else
        if (d1 < 0.0D)
        {
            d1 = 0.0D;
        }
        if (mVolumeType == VolumeType.STREAM)
        {
            checkRemoteMediaPlayerAvailable();
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            if (Double.isInfinite(d1) || Double.isNaN(d1))
            {
                throw new IllegalArgumentException((new StringBuilder("Volume cannot be ")).append(d1).toString());
            } else
            {
                googleapiclient.zzb(new E(r1, googleapiclient, googleapiclient, d1)).setResultCallback(new _cls1());
                return;
            }
        } else
        {
            setDeviceVolume(d1);
            return;
        }
    }

    public VideoCastManager setVolumeStep(double d1)
    {
        if (d1 > 1.0D || d1 < 0.0D)
        {
            throw new IllegalArgumentException("Volume Step should be between 0 and 1, inclusive");
        } else
        {
            mVolumeStep = d1;
            return this;
        }
    }

    public final void setVolumeType(VolumeType volumetype)
    {
        mVolumeType = volumetype;
    }

    public boolean shouldRemoteUiBeVisible(int i, int j)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        i;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 40
    //                   2 38
    //                   3 38
    //                   4 38;
           goto _L1 _L2 _L3 _L3 _L3
_L1:
        flag = false;
_L3:
        return flag;
_L2:
        if (!isRemoteStreamLive())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (j == 2) goto _L3; else goto _L4
_L4:
        return false;
    }

    public void startVideoCastControllerActivity(Context context, Bundle bundle, int i, boolean flag)
    {
        startVideoCastControllerActivity(context, bundle, i, flag, null);
    }

    public void startVideoCastControllerActivity(Context context, Bundle bundle, int i, boolean flag, JSONObject jsonobject)
    {
        Intent intent = new Intent(context, com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerActivity);
        intent.putExtra("media", bundle);
        intent.putExtra("startPoint", i);
        intent.putExtra("shouldStart", flag);
        if (jsonobject != null)
        {
            intent.putExtra("customData", jsonobject.toString());
        }
        setFlagForStartCastControllerActivity();
        context.startActivity(intent);
    }

    public void startVideoCastControllerActivity(Context context, m m1, int i, boolean flag)
    {
        startVideoCastControllerActivity(context, Utils.mediaInfoToBundle(m1), i, flag);
    }

    public void startVideoCastControllerActivity(Context context, MediaAuthService mediaauthservice)
    {
        if (mediaauthservice != null)
        {
            mAuthService = mediaauthservice;
            mediaauthservice = new Intent(context, com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerActivity);
            mediaauthservice.putExtra("hasAuth", true);
            setFlagForStartCastControllerActivity();
            context.startActivity(mediaauthservice);
        }
    }

    public void stop()
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        stop(null);
    }

    public void stop(JSONObject jsonobject)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, "stop()");
        checkConnectivity();
        if (mRemoteMediaPlayer == null)
        {
            LogUtils.LOGE(TAG, "Trying to stop a stream with no active media session");
            throw new NoConnectionException();
        } else
        {
            r r1 = mRemoteMediaPlayer;
            GoogleApiClient googleapiclient = mApiClient;
            googleapiclient.zzb(new A(r1, googleapiclient, googleapiclient, jsonobject)).setResultCallback(new _cls18());
            return;
        }
    }

    public void togglePlayback()
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        checkConnectivity();
        if (isRemoteMediaPlaying())
        {
            pause();
            return;
        }
        if (mState == 1 && mIdleReason == 1)
        {
            loadMedia(getRemoteMediaInformation(), true, 0);
            return;
        } else
        {
            play();
            return;
        }
    }

    public void updateCaptionSummary(String s, PreferenceScreen preferencescreen)
    {
        int i = com.google.android.libraries.cast.companionlibrary.R.string.ccl_info_na;
        if (isFeatureEnabled(16))
        {
            if (mTrackManager.isCaptionEnabled())
            {
                i = com.google.android.libraries.cast.companionlibrary.R.string.ccl_on;
            } else
            {
                i = com.google.android.libraries.cast.companionlibrary.R.string.ccl_off;
            }
        }
        preferencescreen.findPreference(s).setSummary(i);
    }

    public void updateMiniControllersVisibility(boolean flag)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("updateMiniControllersVisibility() reached with visibility: ")).append(flag).toString());
        Set set = mMiniControllers;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = mMiniControllers.iterator();
_L1:
        IMiniController iminicontroller;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        iminicontroller = (IMiniController)iterator.next();
        Exception exception;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        iminicontroller.setVisibility(i);
          goto _L1
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        set;
        JVM INSTR monitorexit ;
    }

    public void updateMiniControllersVisibilityForUpcoming(o o1)
    {
        Set set = mMiniControllers;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = mMiniControllers.iterator();
_L1:
        IMiniController iminicontroller;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        iminicontroller = (IMiniController)iterator.next();
        iminicontroller.setUpcomingItem(o1);
        boolean flag;
        if (o1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iminicontroller.setUpcomingVisibility(flag);
          goto _L1
        o1;
        set;
        JVM INSTR monitorexit ;
        throw o1;
        set;
        JVM INSTR monitorexit ;
    }

    public void updateVolume(int i)
    {
        mMediaRouter.getSelectedRoute().requestUpdateVolume(i);
    }

    static 
    {
        PROGRESS_UPDATE_INTERVAL_MS = TimeUnit.SECONDS.toMillis(1L);
        DEFAULT_LIVE_STREAM_DURATION_MS = TimeUnit.HOURS.toMillis(2L);
    }












/*
    static p access$402(VideoCastManager videocastmanager, p p1)
    {
        videocastmanager.mMediaStatus = p1;
        return p1;
    }

*/






    private class _cls26
        implements com.google.android.gms.cast.a.e
    {

        final VideoCastManager this$0;

        public void onMessageReceived(CastDevice castdevice, String s, String s1)
        {
            for (castdevice = mVideoConsumers.iterator(); castdevice.hasNext(); ((VideoCastConsumer)castdevice.next()).onDataMessageReceived(s1)) { }
        }

        _cls26()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls22
        implements com.google.android.gms.cast.r.e
    {

        final VideoCastManager this$0;

        public void onStatusUpdated()
        {
            LogUtils.LOGD(VideoCastManager.TAG, "RemoteMediaPlayer::onStatusUpdated() is reached");
            onRemoteMediaPlayerStatusUpdated();
        }

        _cls22()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls23
        implements com.google.android.gms.cast.r.c
    {

        final VideoCastManager this$0;

        public void onPreloadStatusUpdated()
        {
            LogUtils.LOGD(VideoCastManager.TAG, "[preload] RemoteMediaPlayer::onPreloadStatusUpdated() is reached");
            onRemoteMediaPreloadStatusUpdated();
        }

        _cls23()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls24
        implements com.google.android.gms.cast.r.b
    {

        final VideoCastManager this$0;

        public void onMetadataUpdated()
        {
            LogUtils.LOGD(VideoCastManager.TAG, "RemoteMediaPlayer::onMetadataUpdated() is reached");
            onRemoteMediaPlayerMetadataUpdated();
        }

        _cls24()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls25
        implements com.google.android.gms.cast.r.d
    {

        final VideoCastManager this$0;

        public void onQueueStatusUpdated()
        {
            LogUtils.LOGD(VideoCastManager.TAG, "RemoteMediaPlayer::onQueueStatusUpdated() is reached");
            mMediaStatus = mRemoteMediaPlayer.c();
            if (mMediaStatus != null && mMediaStatus.a() != null)
            {
                List list = mMediaStatus.a();
                int i = mMediaStatus.a;
                o o1 = mMediaStatus.a(i);
                i = mMediaStatus.m.a;
                onQueueUpdated(list, o1, i, false);
                return;
            } else
            {
                onQueueUpdated(null, null, 0, false);
                return;
            }
        }

        _cls25()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls33 extends android.view.accessibility.CaptioningManager.CaptioningChangeListener
    {

        final VideoCastManager this$0;

        public void onEnabledChanged(boolean flag)
        {
            onTextTrackEnabledChanged(flag);
        }

        public void onFontScaleChanged(float f)
        {
            onTextTrackStyleChanged(mTrackManager.getTextTrackStyle());
        }

        public void onLocaleChanged(Locale locale)
        {
            onTextTrackLocaleChanged(locale);
        }

        public void onUserStyleChanged(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
        {
            onTextTrackStyleChanged(mTrackManager.getTextTrackStyle());
        }

        _cls33()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls29 extends FetchBitmapTask
    {

        final VideoCastManager this$0;

        protected void onPostExecute(Bitmap bitmap)
        {
            Object obj = mMediaSessionCompat.getController().getMetadata();
            if (obj == null)
            {
                obj = new android.support.v4.media.MediaMetadataCompat.Builder();
            } else
            {
                obj = new android.support.v4.media.MediaMetadataCompat.Builder(((android.support.v4.media.MediaMetadataCompat) (obj)));
            }
            mMediaSessionCompat.setMetadata(((android.support.v4.media.MediaMetadataCompat.Builder) (obj)).putBitmap("android.media.metadata.ALBUM_ART", bitmap).build());
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls29()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls28 extends android.support.v4.media.session.MediaSessionCompat.Callback
    {

        final VideoCastManager this$0;

        public boolean onMediaButtonEvent(Intent intent)
        {
            intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (intent == null || intent.getKeyCode() != 127 && intent.getKeyCode() != 126)
            {
                break MISSING_BLOCK_LABEL_39;
            }
            togglePlayback();
_L2:
            return true;
            intent;
_L3:
            LogUtils.LOGE(VideoCastManager.TAG, "onMediaButtonEvent(): Failed to toggle playback", intent);
            if (true) goto _L2; else goto _L1
_L1:
            intent;
              goto _L3
            intent;
              goto _L3
        }

        _cls28()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls3
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaLoadResult(a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls3()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls2
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_status_request, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls2()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls32
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_to_set_track_style, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls32()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls19
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_to_pause, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls19()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls17
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_to_play, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls17()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls12
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(9, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls12()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls15
        implements ResultCallback
    {

        final VideoCastManager this$0;
        final JSONObject val$customData;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                break MISSING_BLOCK_LABEL_23;
            }
            queuePrev(customData);
_L2:
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(2, a1.getStatus().getStatusCode())) { }
            break; /* Loop/switch isn't completed */
            Object obj;
            obj;
_L3:
            LogUtils.LOGE(VideoCastManager.TAG, "queuePrev() Failed to skip to previous", ((Throwable) (obj)));
            if (true) goto _L2; else goto _L1
_L1:
            return;
            obj;
              goto _L3
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls15()
        {
            this$0 = VideoCastManager.this;
            customData = jsonobject;
            super();
        }
    }


    private class _cls5
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(2, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls5()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls7
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(4, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls7()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls4
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(1, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls4()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls11
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(8, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls11()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls13
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(10, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls13()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls14
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(11, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls14()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls9
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(5, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls9()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls8
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(6, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls8()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls10
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(7, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls10()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls16
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                LogUtils.LOGD(VideoCastManager.TAG, (new StringBuilder("Failed with status: ")).append(a1.getStatus()).toString());
            }
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(12, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls16()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls6
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            LogUtils.LOGD(VideoCastManager.TAG, (new StringBuilder("queueUpdateItems() ")).append(a1.getStatus()).append(a1.getStatus().isSuccess()).toString());
            for (Iterator iterator = mVideoConsumers.iterator(); iterator.hasNext(); ((VideoCastConsumer)iterator.next()).onMediaQueueOperationResult(3, a1.getStatus().getStatusCode())) { }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls6()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls20
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_seek, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls20()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls21
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_seek, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls21()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls27
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public volatile void onResult(Result result)
        {
            onResult((Status)result);
        }

        public void onResult(Status status)
        {
            if (!status.isSuccess())
            {
                onMessageSendFailed(status.getStatusCode());
            }
        }

        _cls27()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls30
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            LogUtils.LOGD(VideoCastManager.TAG, (new StringBuilder("Setting track result was successful? ")).append(a1.getStatus().isSuccess()).toString());
            if (!a1.getStatus().isSuccess())
            {
                LogUtils.LOGD(VideoCastManager.TAG, (new StringBuilder("Failed since: ")).append(a1.getStatus()).append(" and status code:").append(a1.getStatus().getStatusCode()).toString());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls30()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls31
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_to_set_track_style, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls31()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls1
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_setting_volume, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls1()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }


    private class _cls18
        implements ResultCallback
    {

        final VideoCastManager this$0;

        public void onResult(com.google.android.gms.cast.r.a a1)
        {
            if (!a1.getStatus().isSuccess())
            {
                onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_to_stop, a1.getStatus().getStatusCode());
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.r.a)result);
        }

        _cls18()
        {
            this$0 = VideoCastManager.this;
            super();
        }
    }

}
