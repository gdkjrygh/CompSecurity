// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.p;
import com.google.android.gms.cast.q;
import com.google.android.libraries.cast.companionlibrary.cast.MediaQueue;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.tracks.TracksPreferenceManager;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            MediaAuthListener, OnVideoCastControllerListener, MediaAuthService, MediaAuthStatus, 
//            VideoCastController

public class VideoCastControllerFragment extends Fragment
    implements MediaAuthListener, OnVideoCastControllerListener
{
    public static class ErrorDialogFragment extends DialogFragment
    {

        private static final String MESSAGE = "message";
        private VideoCastController mController;

        public static ErrorDialogFragment newInstance(String s)
        {
            ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message", s);
            errordialogfragment.setArguments(bundle);
            return errordialogfragment;
        }

        public void onAttach(Activity activity)
        {
            mController = (VideoCastController)activity;
            super.onAttach(activity);
            setCancelable(false);
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = getArguments().getString("message");
            class _cls1
                implements android.content.DialogInterface.OnClickListener
            {

                final ErrorDialogFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    VideoCastControllerFragment.sDialogCanceled = true;
                    mController.closeActivity();
                }

                _cls1()
                {
                    this$0 = ErrorDialogFragment.this;
                    super();
                }
            }

            return (new android.app.AlertDialog.Builder(getActivity())).setTitle(com.google.android.libraries.cast.companionlibrary.R.string.ccl_error).setMessage(bundle).setPositiveButton(com.google.android.libraries.cast.companionlibrary.R.string.ccl_ok, new _cls1()).create();
        }


        public ErrorDialogFragment()
        {
        }
    }

    class MediaAuthServiceTimerTask extends TimerTask
    {

        private final Thread mThread;
        final VideoCastControllerFragment this$0;

        public void run()
        {
            if (mThread != null)
            {
                LogUtils.LOGD(VideoCastControllerFragment.TAG, "Timer is expired, going to interrupt the thread");
                mThread.interrupt();
                class _cls1
                    implements Runnable
                {

                    final MediaAuthServiceTimerTask this$1;

                    public void run()
                    {
                        mCastController.showLoading(false);
                        showErrorDialog(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_authorization_timeout));
                        mAuthSuccess = false;
                        if (mMediaAuthService != null && mMediaAuthService.getStatus() == MediaAuthStatus.PENDING)
                        {
                            mMediaAuthService.abortAuthorization(MediaAuthStatus.TIMED_OUT);
                        }
                    }

                _cls1()
                {
                    this$1 = MediaAuthServiceTimerTask.this;
                    super();
                }
                }

                mHandler.post(new _cls1());
            }
        }

        public MediaAuthServiceTimerTask(Thread thread)
        {
            this$0 = VideoCastControllerFragment.this;
            super();
            mThread = thread;
        }
    }

    private class MyCastConsumer extends VideoCastConsumerImpl
    {

        final VideoCastControllerFragment this$0;

        public void onApplicationDisconnected(int i)
        {
            mCastController.closeActivity();
        }

        public void onConnectionSuspended(int i)
        {
            mCastController.updateControllersStatus(false);
        }

        public void onConnectivityRecovered()
        {
            mCastController.updateControllersStatus(true);
        }

        public void onDisconnected()
        {
            mCastController.closeActivity();
        }

        public void onFailed(int i, int j)
        {
            LogUtils.LOGD(VideoCastControllerFragment.TAG, (new StringBuilder("onFailed(): ")).append(getString(i)).append(", status code: ").append(j).toString());
            if (j == 2100 || j == 2102)
            {
                Utils.showToast(getActivity(), i);
                mCastController.closeActivity();
            }
        }

        public void onMediaQueueUpdated(List list, o o, int i, boolean flag)
        {
            i = 0;
            int j;
            if (list != null)
            {
                j = list.size();
                i = list.indexOf(o);
            } else
            {
                j = 0;
            }
            mCastController.onQueueItemsUpdated(j, i);
        }

        public void onRemoteMediaPlayerMetadataUpdated()
        {
            mSelectedMedia = mCastManager.getRemoteMediaInformation();
            updateClosedCaptionState();
            updateMetadata();
            return;
            Object obj;
            obj;
_L2:
            LogUtils.LOGE(VideoCastControllerFragment.TAG, "Failed to update the metadata due to network issues", ((Throwable) (obj)));
            return;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onRemoteMediaPlayerStatusUpdated()
        {
            updatePlayerStatus();
        }

        private MyCastConsumer()
        {
            this$0 = VideoCastControllerFragment.this;
            super();
        }

        MyCastConsumer(_cls1 _pcls1)
        {
            this();
        }
    }

    private static final class OverallState extends Enum
    {

        private static final OverallState $VALUES[];
        public static final OverallState AUTHORIZING;
        public static final OverallState PLAYBACK;
        public static final OverallState UNKNOWN;

        public static OverallState valueOf(String s)
        {
            return (OverallState)Enum.valueOf(com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerFragment$OverallState, s);
        }

        public static OverallState[] values()
        {
            return (OverallState[])$VALUES.clone();
        }

        static 
        {
            AUTHORIZING = new OverallState("AUTHORIZING", 0);
            PLAYBACK = new OverallState("PLAYBACK", 1);
            UNKNOWN = new OverallState("UNKNOWN", 2);
            $VALUES = (new OverallState[] {
                AUTHORIZING, PLAYBACK, UNKNOWN
            });
        }

        private OverallState(String s, int i)
        {
            super(s, i);
        }
    }

    private class UpdateSeekbarTask extends TimerTask
    {

        final VideoCastControllerFragment this$0;

        public void run()
        {
            class _cls1
                implements Runnable
            {

                final UpdateSeekbarTask this$1;

                public void run()
                {
_L2:
                    return;
                    if (mPlaybackState == 4 || !mCastManager.isConnected()) goto _L2; else goto _L1
_L1:
                    long l = mCastManager.getMediaDuration();
                    int i = (int)l;
                    if (i <= 0) goto _L2; else goto _L3
_L3:
                    int j = (int)mCastManager.getCurrentMediaPosition();
                    mCastController.updateSeekbar(j, i);
                    return;
                    Object obj;
                    obj;
                    LogUtils.LOGE(VideoCastControllerFragment.TAG, "Failed to get current media position", ((Throwable) (obj)));
                    return;
                    obj;
_L5:
                    LogUtils.LOGE(VideoCastControllerFragment.TAG, "Failed to update the progress bar due to network issues", ((Throwable) (obj)));
                    return;
                    obj;
                    if (true) goto _L5; else goto _L4
_L4:
                }

                _cls1()
                {
                    this$1 = UpdateSeekbarTask.this;
                    super();
                }
            }

            mHandler.post(new _cls1());
        }

        private UpdateSeekbarTask()
        {
            this$0 = VideoCastControllerFragment.this;
            super();
        }

        UpdateSeekbarTask(_cls1 _pcls1)
        {
            this();
        }
    }

    private class UrlAndBitmap
    {

        private Bitmap mBitmap;
        private Uri mUrl;
        final VideoCastControllerFragment this$0;

        private boolean isMatch(Uri uri)
        {
            return uri != null && mBitmap != null && uri.equals(mUrl);
        }




/*
        static Bitmap access$1402(UrlAndBitmap urlandbitmap, Bitmap bitmap)
        {
            urlandbitmap.mBitmap = bitmap;
            return bitmap;
        }

*/


/*
        static Uri access$1702(UrlAndBitmap urlandbitmap, Uri uri)
        {
            urlandbitmap.mUrl = uri;
            return uri;
        }

*/

        private UrlAndBitmap()
        {
            this$0 = VideoCastControllerFragment.this;
            super();
        }

        UrlAndBitmap(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String EXTRAS = "extras";
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerFragment);
    private static boolean sDialogCanceled = false;
    protected boolean mAuthSuccess;
    private Thread mAuthThread;
    private MyCastConsumer mCastConsumer;
    private VideoCastController mCastController;
    private VideoCastManager mCastManager;
    private Handler mHandler;
    private FetchBitmapTask mImageAsyncTask;
    private boolean mIsFresh;
    private MediaAuthService mMediaAuthService;
    private Timer mMediaAuthTimer;
    private p mMediaStatus;
    private OverallState mOverallState;
    private int mPlaybackState;
    private Timer mSeekbarTimer;
    private m mSelectedMedia;
    private UrlAndBitmap mUrlAndBitmap;

    public VideoCastControllerFragment()
    {
        mAuthSuccess = true;
        mOverallState = OverallState.UNKNOWN;
        mIsFresh = true;
    }

    private void cleanup()
    {
        MediaAuthService mediaauthservice = mCastManager.getMediaAuthService();
        if (mMediaAuthTimer != null)
        {
            mMediaAuthTimer.cancel();
        }
        if (mAuthThread != null)
        {
            mAuthThread = null;
        }
        if (mCastManager.getMediaAuthService() != null)
        {
            mediaauthservice.setMediaAuthListener(null);
            mCastManager.removeMediaAuthService();
        }
        if (mCastManager != null)
        {
            mCastManager.removeVideoCastConsumer(mCastConsumer);
        }
        if (mHandler != null)
        {
            mHandler.removeCallbacksAndMessages(null);
        }
        if (mUrlAndBitmap != null)
        {
            mUrlAndBitmap.mBitmap = null;
        }
        if (!sDialogCanceled && mMediaAuthService != null)
        {
            mMediaAuthService.abortAuthorization(MediaAuthStatus.CANCELED_BY_USER);
        }
        mCastManager.removeTracksSelectedListener(this);
    }

    private void handleMediaAuthTask(final MediaAuthService authService)
    {
        mCastController.showLoading(true);
        if (authService == null)
        {
            return;
        }
        VideoCastController videocastcontroller = mCastController;
        String s;
        if (authService.getPendingMessage() != null)
        {
            s = authService.getPendingMessage();
        } else
        {
            s = "";
        }
        videocastcontroller.setSubTitle(s);
        mAuthThread = new Thread(new _cls1());
        mAuthThread.start();
        mMediaAuthTimer = new Timer();
        mMediaAuthTimer.schedule(new MediaAuthServiceTimerTask(mAuthThread), authService.getTimeout());
    }

    public static VideoCastControllerFragment newInstance(Bundle bundle)
    {
        VideoCastControllerFragment videocastcontrollerfragment = new VideoCastControllerFragment();
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("extras", bundle);
        videocastcontrollerfragment.setArguments(bundle1);
        return videocastcontrollerfragment;
    }

    private void onReady(m m1, boolean flag, int i, JSONObject jsonobject)
    {
        int j;
        j = 0;
        mSelectedMedia = m1;
        updateClosedCaptionState();
        mCastController.setStreamType(mSelectedMedia.b);
label0:
        {
            {
                if (!flag)
                {
                    break label0;
                }
                try
                {
                    mPlaybackState = 4;
                    mCastController.setPlaybackStatus(mPlaybackState);
                    mCastManager.loadMedia(mSelectedMedia, true, i, jsonobject);
                }
                // Misplaced declaration of an exception variable
                catch (m m1)
                {
                    LogUtils.LOGE(TAG, "Failed to get playback and media information", m1);
                    mCastController.closeActivity();
                }
            }
            m1 = mCastManager.getMediaQueue();
            if (m1 != null)
            {
                j = m1.getCount();
                i = m1.getCurrentItemPosition();
            } else
            {
                boolean flag1 = false;
                i = j;
                j = ((flag1) ? 1 : 0);
            }
            mCastController.onQueueItemsUpdated(j, i);
            updateMetadata();
            restartTrickplayTimer();
            return;
        }
        if (!mCastManager.isRemoteMediaPlaying())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        mPlaybackState = 2;
_L1:
        mCastController.setPlaybackStatus(mPlaybackState);
        break MISSING_BLOCK_LABEL_65;
        mPlaybackState = 3;
          goto _L1
    }

    private void restartTrickplayTimer()
    {
        stopTrickplayTimer();
        mSeekbarTimer = new Timer();
        mSeekbarTimer.scheduleAtFixedRate(new UpdateSeekbarTask(null), 100L, 1000L);
        LogUtils.LOGD(TAG, "Restarted TrickPlay Timer");
    }

    private void setImmersive()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return;
        }
        int j = getActivity().getWindow().getDecorView().getSystemUiVisibility();
        int i = j;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            i = j ^ 2;
        }
        j = i;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            j = i ^ 4;
        }
        i = j;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            i = j ^ 0x1000;
        }
        getActivity().getWindow().getDecorView().setSystemUiVisibility(i);
    }

    private void showErrorDialog(String s)
    {
        ErrorDialogFragment.newInstance(s).show(getFragmentManager(), "dlg");
    }

    private void showImage(final Uri uri)
    {
        if (mImageAsyncTask != null)
        {
            mImageAsyncTask.cancel(true);
        }
        if (uri == null)
        {
            mCastController.setImage(BitmapFactory.decodeResource(getActivity().getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder_large));
            return;
        }
        if (mUrlAndBitmap != null && mUrlAndBitmap.isMatch(uri))
        {
            mCastController.setImage(mUrlAndBitmap.mBitmap);
            return;
        } else
        {
            mUrlAndBitmap = null;
            mImageAsyncTask = new _cls2();
            mImageAsyncTask.execute(uri);
            return;
        }
    }

    private void stopTrickplayTimer()
    {
        LogUtils.LOGD(TAG, "Stopped TrickPlay Timer");
        if (mSeekbarTimer != null)
        {
            mSeekbarTimer.cancel();
        }
    }

    private void togglePlayback()
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        mPlaybackState;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 80
    //                   2 65
    //                   3 46;
           goto _L1 _L2 _L3 _L4
_L1:
        mCastController.setPlaybackStatus(mPlaybackState);
        return;
_L4:
        mCastManager.play();
_L5:
        mPlaybackState = 4;
        restartTrickplayTimer();
          goto _L1
_L3:
        mCastManager.pause();
        mPlaybackState = 4;
          goto _L1
_L2:
        if (mSelectedMedia.b == 2 && mCastManager.getIdleReason() == 2)
        {
            mCastManager.play();
        } else
        {
            mCastManager.loadMedia(mSelectedMedia, true, 0);
        }
          goto _L5
    }

    private void updateClosedCaptionState()
    {
        byte byte1 = 3;
        byte byte0 = byte1;
        if (mCastManager.isFeatureEnabled(16))
        {
            byte0 = byte1;
            if (mSelectedMedia != null)
            {
                byte0 = byte1;
                if (mCastManager.getTracksPreferenceManager().isCaptionEnabled())
                {
                    List list = mSelectedMedia.f;
                    if (list == null || list.isEmpty())
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 1;
                    }
                }
            }
        }
        mCastController.setClosedCaptionState(byte0);
    }

    private void updateMetadata()
    {
        Object obj = null;
        if (mSelectedMedia == null)
        {
            if (mMediaAuthService != null)
            {
                obj = Utils.getImageUri(mMediaAuthService.getMediaInfo(), 1);
            }
        } else
        {
            obj = Utils.getImageUri(mSelectedMedia, 1);
        }
        showImage(((Uri) (obj)));
        if (mSelectedMedia == null)
        {
            return;
        }
        obj = mSelectedMedia.d;
        VideoCastController videocastcontroller = mCastController;
        boolean flag;
        if (((n) (obj)).a("com.google.android.gms.cast.metadata.TITLE") != null)
        {
            obj = ((n) (obj)).a("com.google.android.gms.cast.metadata.TITLE");
        } else
        {
            obj = "";
        }
        videocastcontroller.setTitle(((String) (obj)));
        if (mSelectedMedia.b == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mCastController.adjustControllersForLiveStream(flag);
    }

    private void updateOverallState()
    {
        _cls6..SwitchMap.com.google.android.libraries.cast.companionlibrary.cast.player.VideoCastControllerFragment.OverallState[mOverallState.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        Object obj;
        return;
_L2:
        if ((obj = mCastManager.getMediaAuthService()) != null)
        {
            VideoCastController videocastcontroller = mCastController;
            if (((MediaAuthService) (obj)).getPendingMessage() != null)
            {
                obj = ((MediaAuthService) (obj)).getPendingMessage();
            } else
            {
                obj = "";
            }
            videocastcontroller.setSubTitle(((String) (obj)));
            mCastController.showLoading(true);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void updatePlayerStatus()
    {
        int i;
        i = mCastManager.getPlaybackStatus();
        LogUtils.LOGD(TAG, (new StringBuilder("updatePlayerStatus(), state: ")).append(i).toString());
        if (mSelectedMedia != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mCastController.setStreamType(mSelectedMedia.b);
        if (i == 4)
        {
            mCastController.setSubTitle(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_loading));
        } else
        {
            mCastController.setSubTitle(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
                mCastManager.getDeviceName()
            }));
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            switch (mCastManager.getIdleReason())
            {
            default:
                return;

            case 2: // '\002'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                if (!mIsFresh && mMediaStatus.k == 0)
                {
                    mCastController.closeActivity();
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }

        case 2: // '\002'
            mIsFresh = false;
            if (mPlaybackState != 2)
            {
                mPlaybackState = 2;
                mCastController.setPlaybackStatus(mPlaybackState);
                return;
            }
            break;

        case 3: // '\003'
            mIsFresh = false;
            if (mPlaybackState != 3)
            {
                mPlaybackState = 3;
                mCastController.setPlaybackStatus(mPlaybackState);
                return;
            }
            break;

        case 4: // '\004'
            mIsFresh = false;
            if (mPlaybackState != 4)
            {
                mPlaybackState = 4;
                mCastController.setPlaybackStatus(mPlaybackState);
                return;
            }
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!mCastManager.isRemoteStreamLive() || mPlaybackState == 1) goto _L1; else goto _L4
_L4:
        mPlaybackState = 1;
        mCastController.setPlaybackStatus(mPlaybackState);
        return;
        Object obj;
        obj;
_L6:
        LogUtils.LOGD(TAG, "Failed to determine if stream is live", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (mCastManager.getPreferenceAccessor().getBooleanFromPreference("ccl-cast-contoller-immersive", true))
        {
            setImmersive();
        }
        mCastConsumer = new MyCastConsumer(null);
        bundle = getArguments();
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Bundle bundle1;
        Object obj;
        boolean flag;
        bundle1 = bundle.getBundle("extras");
        obj = bundle1.getBundle("media");
        setRetainInstance(true);
        mCastManager.addTracksSelectedListener(this);
        flag = mCastManager.getPreferenceAccessor().getBooleanFromPreference("ccl-start-cast-activity", false);
        if (flag)
        {
            mIsFresh = true;
        }
        mCastManager.getPreferenceAccessor().saveBooleanToPreference("ccl-start-cast-activity", Boolean.valueOf(false));
        int i = mCastManager.getPreferenceAccessor().getIntFromPreference("ccl-next-prev-policy", 2);
        mCastController.setNextPreviousVisibilityPolicy(i);
        if (!bundle1.getBoolean("hasAuth"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!mIsFresh) goto _L1; else goto _L3
_L3:
        mOverallState = OverallState.AUTHORIZING;
        mMediaAuthService = mCastManager.getMediaAuthService();
        handleMediaAuthTask(mMediaAuthService);
        showImage(Utils.getImageUri(mMediaAuthService.getMediaInfo(), 1));
        return;
        if (obj == null) goto _L1; else goto _L4
_L4:
        String s;
        boolean flag1;
        mOverallState = OverallState.PLAYBACK;
        flag1 = bundle1.getBoolean("shouldStart");
        s = bundle1.getString("customData");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_320;
        }
        bundle = new JSONObject(s);
_L5:
        obj = Utils.bundleToMediaInfo(((Bundle) (obj)));
        int j = bundle1.getInt("startPoint", 0);
        if (flag1 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        onReady(((m) (obj)), flag, j, bundle);
        return;
        bundle;
        LogUtils.LOGE(TAG, (new StringBuilder("Failed to unmarshalize custom data string: customData=")).append(s).toString(), bundle);
        bundle = null;
          goto _L5
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        sDialogCanceled = false;
        mCastController = (VideoCastController)activity;
        mHandler = new Handler();
        mCastManager = VideoCastManager.getInstance();
    }

    public void onAuthFailure(final String failureMessage)
    {
        if (mMediaAuthTimer != null)
        {
            mMediaAuthTimer.cancel();
        }
        mHandler.post(new _cls5());
    }

    public void onAuthResult(MediaAuthStatus mediaauthstatus, final m info, final String message, final int startPoint, final JSONObject customData)
    {
        if (mediaauthstatus == MediaAuthStatus.AUTHORIZED && mAuthSuccess)
        {
            mMediaAuthService = null;
            if (mMediaAuthTimer != null)
            {
                mMediaAuthTimer.cancel();
            }
            mSelectedMedia = info;
            updateClosedCaptionState();
            mHandler.post(new _cls3());
            return;
        }
        if (mMediaAuthTimer != null)
        {
            mMediaAuthTimer.cancel();
        }
        mHandler.post(new _cls4());
    }

    public void onConfigurationChanged()
    {
        updateOverallState();
        if (mSelectedMedia == null)
        {
            if (mMediaAuthService != null)
            {
                showImage(Utils.getImageUri(mMediaAuthService.getMediaInfo(), 1));
            }
            return;
        } else
        {
            updateMetadata();
            updatePlayerStatus();
            mCastController.updateControllersStatus(mCastManager.isConnected());
            return;
        }
    }

    public void onDestroy()
    {
        LogUtils.LOGD(TAG, "onDestroy()");
        stopTrickplayTimer();
        cleanup();
        super.onDestroy();
    }

    public void onPause()
    {
        mCastManager.removeVideoCastConsumer(mCastConsumer);
        mCastManager.decrementUiCounter();
        mIsFresh = false;
        super.onPause();
    }

    public void onPlayPauseClicked(View view)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException
    {
        LogUtils.LOGD(TAG, (new StringBuilder("isConnected returning: ")).append(mCastManager.isConnected()).toString());
        togglePlayback();
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
    }

    public void onResume()
    {
        boolean flag1;
        flag1 = false;
        super.onResume();
        if ((mCastManager.isRemoteMediaPaused() || mCastManager.isRemoteMediaPlaying()) && mCastManager.getRemoteMediaInformation() != null && mSelectedMedia.a.equals(mCastManager.getRemoteMediaInformation().a))
        {
            mIsFresh = false;
        }
        if (mCastManager.isConnecting()) goto _L2; else goto _L1
_L1:
        if (!mCastManager.isConnected()) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
        if (mCastManager.getPlaybackStatus() != 1) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (mCastManager.getIdleReason() != 1) goto _L6; else goto _L4
_L6:
        if (!flag) goto _L2; else goto _L7
_L7:
        if (mIsFresh) goto _L2; else goto _L8
_L8:
        mCastController.closeActivity();
        mCastManager.incrementUiCounter();
        return;
_L2:
        mMediaStatus = mCastManager.getMediaStatus();
        mCastManager.addVideoCastConsumer(mCastConsumer);
        if (!mIsFresh)
        {
            updatePlayerStatus();
            mSelectedMedia = mCastManager.getRemoteMediaInformation();
            updateClosedCaptionState();
            updateMetadata();
        }
        mCastManager.incrementUiCounter();
        return;
        Object obj;
        obj;
_L9:
        LogUtils.LOGE(TAG, "Failed to get media information or status of media playback", ((Throwable) (obj)));
        mCastManager.incrementUiCounter();
        return;
        obj;
        mCastManager.incrementUiCounter();
        throw obj;
        obj;
        if (true) goto _L9; else goto _L4
_L4:
        flag = true;
        if (true) goto _L6; else goto _L10
_L10:
    }

    public void onSkipNextClicked(View view)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        mCastManager.queueNext(null);
    }

    public void onSkipPreviousClicked(View view)
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        mCastManager.queuePrev(null);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        stopTrickplayTimer();
    }

    public void onStop()
    {
        super.onStop();
        if (mImageAsyncTask != null)
        {
            mImageAsyncTask.cancel(true);
            mImageAsyncTask = null;
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (mPlaybackState != 2) goto _L2; else goto _L1
_L1:
        mPlaybackState = 4;
        mCastController.setPlaybackStatus(mPlaybackState);
        mCastManager.play(seekbar.getProgress());
_L4:
        restartTrickplayTimer();
        return;
_L2:
        if (mPlaybackState == 3)
        {
            mCastManager.seek(seekbar.getProgress());
        }
        if (true) goto _L4; else goto _L3
_L3:
        seekbar;
        LogUtils.LOGE(TAG, "Failed to complete seek", seekbar);
        mCastController.closeActivity();
        return;
    }

    public void onTracksSelected(List list)
    {
        long al[];
        if (list.isEmpty())
        {
            al = new long[0];
        } else
        {
            al = new long[list.size()];
            int i = 0;
            while (i < list.size()) 
            {
                al[i] = ((q)list.get(i)).a;
                i++;
            }
        }
        mCastManager.setActiveTrackIds(al);
        if (list.size() > 0)
        {
            mCastManager.setTextTrackStyle(mCastManager.getTracksPreferenceManager().getTextTrackStyle());
        }
    }







/*
    static UrlAndBitmap access$1502(VideoCastControllerFragment videocastcontrollerfragment, UrlAndBitmap urlandbitmap)
    {
        videocastcontrollerfragment.mUrlAndBitmap = urlandbitmap;
        return urlandbitmap;
    }

*/



/*
    static FetchBitmapTask access$1802(VideoCastControllerFragment videocastcontrollerfragment, FetchBitmapTask fetchbitmaptask)
    {
        videocastcontrollerfragment.mImageAsyncTask = fetchbitmaptask;
        return fetchbitmaptask;
    }

*/


/*
    static boolean access$1902(boolean flag)
    {
        sDialogCanceled = flag;
        return flag;
    }

*/



/*
    static OverallState access$2102(VideoCastControllerFragment videocastcontrollerfragment, OverallState overallstate)
    {
        videocastcontrollerfragment.mOverallState = overallstate;
        return overallstate;
    }

*/






/*
    static m access$602(VideoCastControllerFragment videocastcontrollerfragment, m m1)
    {
        videocastcontrollerfragment.mSelectedMedia = m1;
        return m1;
    }

*/




    private class _cls1
        implements Runnable
    {

        final VideoCastControllerFragment this$0;
        final MediaAuthService val$authService;

        public void run()
        {
            authService.setMediaAuthListener(VideoCastControllerFragment.this);
            authService.startAuthorization();
        }

        _cls1()
        {
            this$0 = VideoCastControllerFragment.this;
            authService = mediaauthservice;
            super();
        }
    }


    private class _cls2 extends FetchBitmapTask
    {

        final VideoCastControllerFragment this$0;
        final Uri val$uri;

        protected void onPostExecute(Bitmap bitmap)
        {
            if (bitmap != null)
            {
                mUrlAndBitmap = new UrlAndBitmap(null);
                mUrlAndBitmap.mBitmap = bitmap;
                mUrlAndBitmap.mUrl = uri;
                mCastController.setImage(bitmap);
            }
            if (this == mImageAsyncTask)
            {
                mImageAsyncTask = null;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls2()
        {
            this$0 = VideoCastControllerFragment.this;
            uri = uri1;
            super();
        }
    }


    private class _cls6
    {

        static final int $SwitchMap$com$google$android$libraries$cast$companionlibrary$cast$player$VideoCastControllerFragment$OverallState[];

        static 
        {
            $SwitchMap$com$google$android$libraries$cast$companionlibrary$cast$player$VideoCastControllerFragment$OverallState = new int[OverallState.values().length];
            try
            {
                $SwitchMap$com$google$android$libraries$cast$companionlibrary$cast$player$VideoCastControllerFragment$OverallState[OverallState.AUTHORIZING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$google$android$libraries$cast$companionlibrary$cast$player$VideoCastControllerFragment$OverallState[OverallState.PLAYBACK.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls5
        implements Runnable
    {

        final VideoCastControllerFragment this$0;
        final String val$failureMessage;

        public void run()
        {
            mOverallState = OverallState.UNKNOWN;
            showErrorDialog(failureMessage);
        }

        _cls5()
        {
            this$0 = VideoCastControllerFragment.this;
            failureMessage = s;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final VideoCastControllerFragment this$0;
        final JSONObject val$customData;
        final m val$info;
        final int val$startPoint;

        public void run()
        {
            mOverallState = OverallState.PLAYBACK;
            onReady(info, true, startPoint, customData);
        }

        _cls3()
        {
            this$0 = VideoCastControllerFragment.this;
            info = m1;
            startPoint = i;
            customData = jsonobject;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final VideoCastControllerFragment this$0;
        final String val$message;

        public void run()
        {
            mOverallState = OverallState.UNKNOWN;
            showErrorDialog(message);
        }

        _cls4()
        {
            this$0 = VideoCastControllerFragment.this;
            message = s;
            super();
        }
    }

}
